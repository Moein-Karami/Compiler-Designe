package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.EachStmt;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.array.ArrayType;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.NoConstructorInMainClass;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.Visitor;
import main.visitor.typeChecker.ExpressionTypeChecker;

import java.io.*;
import java.util.ArrayList;

public class CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker;
    Graph<String> classHierarchy;
    private String outputPath;
    private FileWriter currentFile;

    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;

    public int last_label = 0;

    public int num_extra_vars = 0;

    public CodeGenerator(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
        this.prepareOutputFolder();
    }

    public String get_class(Type tp) {
        if (tp instanceof  BoolType)
            return "java/lang/Boolean";
        if (tp instanceof IntType)
            return "java/lang/Integer";
        if (tp instanceof ArrayType)
            return "Array";
        if (tp instanceof ClassType)
            return ((ClassType) tp).getClassName().getName();
        if (tp instanceof FptrType)
            return "Fptr";
        return "";
    }

    public String get_type_sig(Type tp) {
        if (!(tp instanceof NullType || tp instanceof VoidType))
            return "L" + get_class(tp) + ";";
        else
            return "V";
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String arrayClassPath = "utilities/codeGenerationUtilityClasses/Array.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {
            e.printStackTrace();
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(arrayClassPath, this.outputPath + "Array.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    public String get_new_line_label(){
        String ret = "label-new" + this.last_label;
        last_label++;
        return ret;
    }

    private String get_jasmin_type(Type tp) {
        if(tp instanceof FptrType){
            return "Fptr";
        }
        if(tp instanceof BoolType){
            return "java/lang/Boolean";
        }
        if(tp instanceof ClassType){
            return ((ClassType) tp).getClassName().getName();
        }
        if(tp instanceof IntType){
            return "java/lang/Integer";
        }
        if (tp instanceof ArrayType)
            return "Array";
        return "";
    }

    @Override
    public String visit(Program program) {
        if(program.getGlobalVariables().size() != 0)
        {
            createFile("Glob@l");
            addCommand(".class public " + "Glob@l");
            addCommand(".super java/lang/Object\n ");
            for (VariableDeclaration variableDeclaration : program.getGlobalVariables()) {
                variableDeclaration.accept(this);
            }
        }
        createFile("Main");
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            this.expressionTypeChecker.setCurrentClass(classDeclaration);
            this.currentClass = classDeclaration;
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ClassDeclaration classDeclaration) {
        String name = classDeclaration.getClassName().getName();
        createFile(name);
        addCommand(".class public " + name);
        Identifier par_name = classDeclaration.getParentClassName();
        if(par_name == null)
            addCommand(".super java/lang/Object\n ");
        else
            addCommand(".super " + par_name.getName() + "\n");
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
            fieldDeclaration.accept(this);
        }
        if(classDeclaration.getConstructor() != null) {
            this.expressionTypeChecker.setCurrentMethod(classDeclaration.getConstructor());
            this.currentMethod = classDeclaration.getConstructor();
            classDeclaration.getConstructor().accept(this);
        }
        else{
            addDefaultConstructor();
        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            this.expressionTypeChecker.setCurrentMethod(methodDeclaration);
            this.currentMethod = methodDeclaration;
            methodDeclaration.accept(this);
        }
        return null;
    }


    @Override
    public String visit(ConstructorDeclaration constructorDeclaration) {
        if(!(constructorDeclaration.getArgs().size() == 0))
        {
            addDefaultConstructor();
        }
        if(currentClass.getClassName().getName().equals("Main"))
        {
            addStaticMainMethod();
        }
        visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public String visit(MethodDeclaration methodDeclaration) {
        String args_command = "";
        for(ArgPair arg_pair: methodDeclaration.getArgs())
        {
            VariableDeclaration arg = arg_pair.getVariableDeclaration();
            args_command += get_type_sig(arg.getType());
        }
        if(!(methodDeclaration instanceof  ConstructorDeclaration))
            addCommand(".method public " + methodDeclaration.getMethodName().getName() + "(" + args_command + ")" + get_type_sig(methodDeclaration.getReturnType()));
        else
            addCommand(".method public <init>(" + args_command + ")V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");

        for(ArgPair arg_pair: methodDeclaration.getArgs())
        {
            Expression arg_val = arg_pair.getDefaultValue();
            if(arg_val != null) {
                String command = arg_val.accept(this);
                addCommand(command);
            }
            addCommand("astore " + slotOf(arg_pair.getVariableDeclaration().getVarName().getName()));
        }
        if(methodDeclaration instanceof ConstructorDeclaration)
        {
            addCommand("aload 0");
            if(currentClass.getParentClassName() != null)
                addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
            else
                addCommand("invokespecial java/lang/Object/<init>()V");
            for (FieldDeclaration fieldDeclaration : currentClass.getFields())
                this.init_variables_field(fieldDeclaration.getVarDeclaration());
        }
        for (VariableDeclaration var : methodDeclaration.getLocalVars())
            var.accept(this);
        for (Statement statement : methodDeclaration.getBody())
            statement.accept(this);
        if(methodDeclaration.getDoesReturn() == false)
            addCommand("return");
        addCommand(".end method\n ");
        return null;
    }

    @Override
    public String visit(FieldDeclaration fieldDeclaration) {
        addCommand(".field " + fieldDeclaration.getVarDeclaration().getVarName().getName()
                + " " + get_type_sig(fieldDeclaration.getVarDeclaration().getType()));
        return null;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        this.init_variables_local_var(variableDeclaration);
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        BinaryExpression binary_expr = new BinaryExpression(assignmentStmt.getlValue(), assignmentStmt.getrValue(),
                BinaryOperator.assign);
        String commands = this.visit(binary_expr);
        addCommand(commands);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        for (Statement stmt : blockStmt.getStatements())
            stmt.accept(this);
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        Expression cond = conditionalStmt.getCondition();
        String command_expr_cond = cond.accept(this);
        addCommand(command_expr_cond);
        String exit_label = get_new_line_label();

        String next_sec = get_new_line_label();

        addCommand("ifeq " + next_sec);
        conditionalStmt.getThenBody().accept(this);
        addCommand("goto " + exit_label);

        addCommand(next_sec + ":");

        for (ElsifStmt elsifStmt : conditionalStmt.getElsif()) {
            Expression expr_cond_elsif = elsifStmt.getCondition();
            String command_elsif = expr_cond_elsif.accept(this);
            next_sec = get_new_line_label();
            addCommand(command_elsif);
            addCommand("ifeq " + next_sec);
            elsifStmt.accept(this);
            addCommand("goto " + exit_label);
            addCommand(next_sec + ":");
        }

        if(conditionalStmt.getElseBody() != null)
        {
            conditionalStmt.getElseBody().accept(this);
        }

        addCommand(exit_label + ":");

        return null;
    }

    @Override
    public String visit(ElsifStmt elsifStmt) {
        elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public String visit(MethodCallStmt methodCallStmt) {
        expressionTypeChecker.setIsInMethodCallStmt(true);
        String command_method = methodCallStmt.getMethodCall().accept(this);
        addCommand(command_method);
        expressionTypeChecker.setIsInMethodCallStmt(false);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Expression arg_print = print.getArg();
        String print_command = arg_print.accept(this);
        addCommand(print_command);
        Type type_arg = arg_print.accept(expressionTypeChecker);
        if(type_arg instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/print(Z)V");
        if(type_arg instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/print(I)V");
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        Expression ret_expr = returnStmt.getReturnedExpr();
        Type ret_type = ret_expr.accept(expressionTypeChecker);
        Type ret_type_method = currentMethod.getReturnType();
        if(!(ret_type instanceof NullType || ret_type instanceof VoidType))
        {
            String command_ret = ret_expr.accept(this);
            addCommand(command_ret);
            if(ret_type instanceof IntType)
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            if(ret_type instanceof BoolType)
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            addCommand("areturn");
        }
        else {
            if (ret_type_method instanceof NullType || ret_type instanceof VoidType)
                addCommand("return");
            else
            {
                String command_ret = ret_expr.accept(this);
                addCommand(command_ret);
                addCommand("areturn");
            }
        }
        return "";
    }

    @Override
    public String visit(EachStmt eachStmt) {
        String for_start_label = get_new_line_label();
        String end_for_label = get_new_line_label();
        String command_each = eachStmt.getList().accept(this);
        addCommand(command_each);
        int slot_array = slotOf(";");
        addCommand("astore " + slot_array);

        int idx_loop = slotOf(";");

        addCommand("ldc 0");
        addCommand("istore " + idx_loop);

        //for started
        addCommand(for_start_label + ":");

        //check conditions for
        addCommand("iload "+ idx_loop);
        addCommand("aload " + slot_array);
        addCommand("invokevirtual Array/getSize()I");
        addCommand("isub");
        addCommand("ifeq " + end_for_label);

        //assign loop variable

        addCommand("aload " + slot_array);
        addCommand("iload " + idx_loop);
        addCommand("invokevirtual Array/getElement(I)Ljava/lang/Object;");
        addCommand("checkcast " + get_jasmin_type(eachStmt.getVariable().accept(expressionTypeChecker)));
        addCommand("astore " + slotOf(eachStmt.getVariable().getName()));
        addCommand("iinc " + idx_loop + " 1");

        //body
        eachStmt.getBody().accept(this);
        addCommand("goto " + for_start_label);

        addCommand(end_for_label + ":");

        return null;
    }

    @Override
    public String visit(TernaryExpression ternaryExpression) {
        String command_answer = "";
        Expression ternary_cond = ternaryExpression.getCondition();
        String command_cond = ternary_cond.accept(this);
        command_answer += command_cond + '\n';
        String next_sec = get_new_line_label();
        String end_ternary = get_new_line_label();
        command_answer += "ifeq " + next_sec + '\n';
        String true_expr = ternaryExpression.getTrueExpression().accept(this);
        command_answer += true_expr + '\n';
        command_answer += "goto " + end_ternary + '\n';
        command_answer += next_sec + ":" + '\n';
        String false_expr = ternaryExpression.getFalseExpression().accept(this);
        command_answer += false_expr + '\n';
        command_answer += end_ternary + ":" + '\n';
        return command_answer;
    }

    @Override
    public String visit(RangeExpression rangeExpression) {
        String command_range = "";
        command_range += "new Array" + "\n";
        command_range += "dup" + "\n";
        String left_command = rangeExpression.getLeftExpression().accept(this);
        command_range += left_command;
        String right_command = rangeExpression.getRightExpression().accept(this);
        command_range += right_command;
        command_range += "invokespecial Array/<init>(II)V\n";
        return command_range;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        String commands = "";
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        if (operator != BinaryOperator.and && operator != BinaryOperator.or && operator != BinaryOperator.assign){
            commands += binaryExpression.getFirstOperand().accept(this) + '\n';
            commands += binaryExpression.getSecondOperand().accept(this) + '\n';
        }

        if (operator == BinaryOperator.mult)
            commands += "imul";
        if (operator == BinaryOperator.add)
            commands += "iadd";
        if (operator == BinaryOperator.sub)
            commands += "isub";
        if (operator == BinaryOperator.div)
            commands += "idiv";
        if (operator == BinaryOperator.gt || operator == BinaryOperator.lt){
            String zero_label = get_new_line_label();
            commands += ((operator == BinaryOperator.lt) ? "if_icmpge " : "if_icmple") + zero_label + '\n';
            String end_label = get_new_line_label();
            commands += "ldc 1\n" + "goto " +  end_label + "\n" + zero_label + ":\n" + "ldc 0\n" + end_label + ":";
        }
        if (operator == BinaryOperator.eq){
            Type second_type = binaryExpression.getSecondOperand().accept(expressionTypeChecker);
            Type first_type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            if (!(first_type instanceof IntType) && !(first_type instanceof BoolType))
                commands += "if_acmpne ";
            else
                commands += "if_icmpne ";

            String zero_label = get_new_line_label();
            String exit_label = get_new_line_label();

            commands += zero_label + "\n" + "ldc 1" + "\n" + "goto " + exit_label + "\n" + zero_label + ":\n" + "ldc 0\n" + exit_label +":";
        }
        if (operator == BinaryOperator.or){
            String true_label = get_new_line_label();
            String exit_label = get_new_line_label();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n" + "ifne " + true_label + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n" + "ifne " + true_label + "\n";
            commands += "ldc 0\n" + "goto " + exit_label + "\n" + true_label + ":\n" + "ldc 1\n" + exit_label + ":";
        }
        if (operator == BinaryOperator.and){
            String zero_label = get_new_line_label();
            String exit_label = get_new_line_label();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n" + "ifeq " + zero_label + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n" + "ifeq " + zero_label + "\n";
            commands += "ldc 1\n" + "goto " + exit_label + "\n" + zero_label + ":\n" + "ldc 0\n" + exit_label + ":";
        }
        if (operator == BinaryOperator.assign){
            String next_commands = binaryExpression.getSecondOperand().accept(this);
            Type first_type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            if(first_type instanceof ArrayType) {
                next_commands = "new Array" + "\n";
                next_commands += "dup\n";
                next_commands += binaryExpression.getSecondOperand().accept(this) + "\n";
                next_commands += "invokespecial Array/<init>(LArray;)V";
            }
            if(binaryExpression.getFirstOperand() instanceof Identifier) {
                commands += next_commands + "\n";
                commands += "dup\n";
                if(first_type instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                if(first_type instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                int varSlot = slotOf(((Identifier) binaryExpression.getFirstOperand()).getName());
                commands += "astore " + varSlot;
            }
            else if(binaryExpression.getFirstOperand() instanceof ArrayAccessByIndex) {
                commands += ((ArrayAccessByIndex) binaryExpression.getFirstOperand()).getInstance().accept(this) + "\n";
                commands += ((ArrayAccessByIndex) binaryExpression.getFirstOperand()).getIndex().accept(this) + "\n";
                commands += next_commands + "\n";
                commands += "dup_x2\n";

                if(first_type instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                if(first_type instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";

                commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V";
            }
            else if(binaryExpression.getFirstOperand() instanceof ObjectMemberAccess) {
                Expression instance = ((ObjectMemberAccess) binaryExpression.getFirstOperand()).getInstance();
                Type instance_type = instance.accept(expressionTypeChecker);
                String member_name = ((ObjectMemberAccess) binaryExpression.getFirstOperand()).getMemberName().getName();
                Type member_type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
                if(instance_type instanceof ClassType) {
                    String className = ((ClassType) instance_type).getClassName().getName();
                    commands += instance.accept(this) + "\n" + next_commands + "\n" + "dup_x1\n";
                    if(first_type instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    if(first_type instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "putfield " + className + "/" + member_name + " " + get_type_sig(member_type);
                }
                if(instance_type instanceof ArrayType) {
//                    String array_name = ((ClassType) instance_type).get
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        UnaryOperator operator = unaryExpression.getOperator();
        String commands = "";
        if (operator == UnaryOperator.not){
            commands += unaryExpression.getOperand().accept(this) + "\n";
            String zero_label = get_new_line_label();
            commands += "ifne " + zero_label + "\n" + "ldc 1" + "\n";
            String exit_label = get_new_line_label();
            commands += "goto " + exit_label + "\n" + zero_label + ":\n" + "ldc 0\n" + exit_label + ":";
        }
        if (operator == UnaryOperator.minus) {
            commands += unaryExpression.getOperand().accept(this) + "\n" + "ineg";
        }
        if (operator == UnaryOperator.postdec || operator == UnaryOperator.postinc){
            if(unaryExpression.getOperand() instanceof Identifier) {
                int var_slot = slotOf(((Identifier) unaryExpression.getOperand()).getName());
                commands += unaryExpression.getOperand().accept(this) + "\n" + "dup\n" + "ldc 1\n";
                if(operator == UnaryOperator.postinc) {
                    commands += "iadd\n";
                }
                else {
                    commands += "isub\n";
                }
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n" + "astore " + var_slot;
            }
            if(unaryExpression.getOperand() instanceof ObjectMemberAccess) {
                String member_name = ((ObjectMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
                Expression instance = ((ObjectMemberAccess) unaryExpression.getOperand()).getInstance();
                Type instance_type = instance.accept(expressionTypeChecker);
                Type member_type = unaryExpression.getOperand().accept(expressionTypeChecker);
                String className = ((ClassType) instance_type).getClassName().getName();
                commands += instance.accept(this) + "\n" + "dup\n" + "getfield " + className + "/" + member_name + " " + get_type_sig(member_type) + "\n";
                commands += "invokevirtual java/lang/Integer/intValue()I\n" + "dup_x1\n" + "ldc 1\n";
                if(operator == UnaryOperator.postinc)
                    commands += "iadd\n";
                else
                    commands += "isub\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                commands += "putfield " + className + "/" + member_name + " " + get_type_sig(member_type);
            }
            if(unaryExpression.getOperand() instanceof ArrayAccessByIndex) {
                /////!!!!!!!!!!!!!!
                ////!!!!!!!!!!!!
                ///!!!!!!!!!
            }
        }
        return commands;
    }

    @Override
    public String visit(ObjectMemberAccess objectMemberAccess) {
        Type instance_type = objectMemberAccess.getInstance().accept(expressionTypeChecker);
        String member_name = objectMemberAccess.getMemberName().getName();
        Type member_type = objectMemberAccess.accept(expressionTypeChecker);
        String class_name = ((ClassType) instance_type).getClassName().getName();
        String instructions = "";

        try {
            SymbolTable class_table = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + class_name, true)).getClassSymbolTable();
            try {
                class_table.getItem(FieldSymbolTableItem.START_KEY + member_name, true);
                instructions += objectMemberAccess.getInstance().accept(this) + "\n";
                instructions += "getfield " + class_name + "/" + member_name + " " + get_type_sig(member_type);
                if(member_type instanceof  BoolType)
                    instructions += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
                if(member_type instanceof IntType)
                    instructions += "\ninvokevirtual java/lang/Integer/intValue()I";

            } catch (ItemNotFoundException memberIsMethod) {
                instructions += "new Fptr\n" + "dup\n" + objectMemberAccess.getInstance().accept(this) + "\n";
                instructions += "ldc \"" + member_name + "\"\n" + "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V";
            }
        } catch (ItemNotFoundException ignored) {
        }
        return instructions;
    }

    @Override
    public String visit(Identifier identifier) {
        String command_identifier = "";
        command_identifier += "aload " + slotOf(identifier.getName()) + '\n';
        Type type_id = identifier.accept(expressionTypeChecker);
        if(type_id instanceof BoolType)
            command_identifier += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
        if(type_id instanceof IntType)
            command_identifier += "invokevirtual java/lang/Integer/intValue()I\n";
        return command_identifier;
    }

    @Override
    public String visit(ArrayAccessByIndex arrayAccessByIndex) {
        String command_array = "";
        String command_ins = arrayAccessByIndex.getInstance().accept(this);

        command_array += command_ins;

        command_array += arrayAccessByIndex.getIndex().accept(this);

        command_array += "invokevirtual Array/getElement(I)Ljava/lang/Object;" + "\n";

        Type type_list = arrayAccessByIndex.accept(expressionTypeChecker);

        command_array +=  "checkcast " + get_jasmin_type(type_list) + "\n";

        if(type_list instanceof IntType)
            command_array += "\ninvokevirtual java/lang/Integer/intValue()I";
        else if(type_list instanceof BoolType)
            command_array += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
        return command_array;
    }

    @Override
    public String visit(MethodCall methodCall) {
        int tmp = slotOf("");
        String instructions = "new java/util/ArrayList\n";
        instructions += "dup\n" + "invokespecial java/util/ArrayList/<init>()V\n" + "astore " + tmp + "\n";
        for(Expression arg : methodCall.getArgs()) {
            Type arg_type = arg.accept(expressionTypeChecker);
            instructions += "aload " + tmp + "\n" + arg.accept(this) + "\n";

            if(arg_type instanceof BoolType)
                instructions += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            if(arg_type instanceof IntType)
                instructions += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            instructions += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n" + "pop\n";
        }
        instructions += methodCall.getInstance().accept(this) + "\n" + "aload " + tmp + "\n";
        instructions += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";
        Type type = methodCall.accept(expressionTypeChecker);
        if(!(type instanceof NullType || type instanceof VoidType))
            instructions += "\ncheckcast " + get_jasmin_type(type);
        if(type instanceof IntType)
            instructions += "\ninvokevirtual java/lang/Integer/intValue()I";
        if(type instanceof  BoolType)
            instructions += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
//        --(this.num_extra_vars);
        return instructions;
    }

    @Override
    public String visit(NewClassInstance newClassInstance) {
        String args_sig = "";
        String class_name = newClassInstance.getClassType().getClassName().getName();
        String instructions = "new " + class_name + "\n" + "dup\n";
        for(Expression arg : newClassInstance.getArgs()) {
            Type arg_type = arg.accept(expressionTypeChecker);
            instructions += arg.accept(this) + "\n";
            if(arg_type instanceof BoolType)
                instructions += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            if(arg_type instanceof IntType)
                instructions += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            args_sig += get_type_sig(arg.accept(expressionTypeChecker));
        }
        instructions += "invokespecial " + class_name + "/<init>(" + args_sig + ")V";
        return instructions;
    }

    @Override
    public String visit(SelfClass selfClass) {
        return "aload 0";
    }

    @Override
    public String visit(NullValue nullValue) {
        return "aconst_null";
    }

    @Override
    public String visit(IntValue intValue) {
        String command = "ldc " + (intValue.getConstant()) + "\n";
        return command;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String command = "ldc " + (boolValue.getConstant() ? 1: 0) + "\n";
        return command;
    }

    public void addDefaultConstructor()
    {
        addCommand(".method public <init>()V");
        addCommand(".limit locals 128");
        addCommand(".limit stack 128");
        addCommand("aload 0");
        Identifier par_name = this.currentClass.getParentClassName();
        //for global change
        if(par_name != null)
        {
            addCommand("invokespecial " + par_name.getName() + "/<init>()V");
        }
        else
        {
            addCommand("invokespecial java/lang/Object/<init>()V");
        }

        for(FieldDeclaration fieldDeclaration : currentClass.getFields()){
            init_variables_field(fieldDeclaration.getVarDeclaration());
        }

        addCommand("return");
        addCommand(".end method\n ");
    }

    public int slotOf(String id_name)
    {
        int slot_num = 1;
        for(ArgPair variable_dec : currentMethod.getArgs())
        {
            if(variable_dec.getVariableDeclaration().getVarName().getName().equals(id_name))
                return slot_num;
            slot_num++;
        }

        for (VariableDeclaration varDeclaration : currentMethod.getLocalVars()) {
            if (varDeclaration.getVarName().getName().equals(id_name))
                return slot_num;
            slot_num++;
        }
        num_extra_vars += 1;
        return num_extra_vars + slot_num;
    }


    public void init_variables_field(VariableDeclaration variable_input)
    {
        String name_var = variable_input.getVarName().getName();
        Type type_var = variable_input.getType();
        addCommand("aload 0");
        addCommand(value_command(type_var));
        if(type_var instanceof BoolType)
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        if(type_var instanceof IntType)
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        if(type_var instanceof ArrayType)
        {
            for(Expression exp: ((ArrayType) type_var).getDimensions())
            {
                addCommand("new Array");
                addCommand("dup");
                String exp_command = exp.accept(this);
                addCommand(exp_command);
                addCommand("invokespecial Array/<init>(ILjava/lang/Object;)V");
            }
        }
        addCommand("putfield " + currentClass.getClassName().getName() + "/" + name_var + " " + get_type_sig(type_var));
    }

    public String value_command(Type type_var)
    {
        if(type_var instanceof BoolType)
        {
            return visit(new BoolValue(false));
        }
        if(type_var instanceof IntType)
        {
            return visit(new IntValue(0));
        }
        if(type_var instanceof FptrType || type_var instanceof ClassType
            || type_var instanceof NullType || type_var instanceof ArrayType)
        {
            return "aconst_null\n";
        }
        return null;
    }

    public void init_type(Type type_var)
    {
        addCommand(value_command(type_var));
        if(type_var instanceof BoolType)
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        if(type_var instanceof IntType)
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        if(type_var instanceof ArrayType)
        {
            addCommand("new Array");
            addCommand("dup");
            String exp_command = ((ArrayType) type_var).getDimensions().get(0).accept(this);
            addCommand(exp_command);
            init_type(((ArrayType) type_var).getType());
            addCommand("invokespecial Array/<init>(ILjava/lang/Object;)V");
            for(int t = 1; t < ((ArrayType) type_var).getDimensions().size(); t++)
            {
                addCommand("new Array");
                addCommand("dup");
                exp_command = ((ArrayType) type_var).getDimensions().get(t).accept(this);
                addCommand(exp_command);
                addCommand("invokespecial Array/<init>(ILjava/lang/Object;)V");
            }
        }
    }

    public void init_variables_local_var(VariableDeclaration variable_input)
    {
        String name_var = variable_input.getVarName().getName();
        Type type_var = variable_input.getType();
        init_type(type_var);
        addCommand("astore " + slotOf(name_var));
    }
}