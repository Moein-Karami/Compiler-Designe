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
        if (!(tp instanceof NullType))
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
        if(constructorDeclaration.getMethodName().getName().equals("Main"))
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
            String command = arg_val.accept(this);
            addCommand(command);
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
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream");
        Expression arg_print = print.getArg();
        String print_command = arg_print.accept(this);
        addCommand(print_command);
        Type type_arg = arg_print.accept(expressionTypeChecker);
        if(type_arg instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/print(Z)V");
        if(type_arg instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/print(I)V;");
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
        return null;
    }

    @Override
    public String visit(EachStmt eachStmt) {
        String for_start_label = get_new_line_label();
        String end_for_label = get_new_line_label();
        String command_each = eachStmt.getList().accept(this);
        addCommand(command_each);
        String var_each_command = eachStmt.getVariable().accept(this);
        addCommand(var_each_command);

        return null;
    }

    @Override
    public String visit(TernaryExpression ternaryExpression) {
        Expression ternary_cond = ternaryExpression.getCondition();
        String command_cond = ternary_cond.accept(this);
        addCommand(command_cond);
        String next_sec = get_new_line_label();
        String end_ternary = get_new_line_label();
        addCommand("ifeq " + next_sec);
        String true_expr = ternaryExpression.getTrueExpression().accept(this);
        addCommand(true_expr);
        addCommand("goto " + end_ternary);
        addCommand(next_sec + ":");
        String false_expr = ternaryExpression.getFalseExpression().accept(this);
        addCommand(false_expr);
        addCommand(end_ternary + ":");
        return null;
    }

    @Override
    public String visit(RangeExpression rangeExpression) {

        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {

        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        //todo
        return null;
    }

    @Override
    public String visit(ObjectMemberAccess objectMemberAccess) {

        return null;
    }

    @Override
    public String visit(Identifier identifier) {
        //todo
        return null;
    }

    @Override
    public String visit(ArrayAccessByIndex arrayAccessByIndex) {
        //todo
        return null;
    }

    @Override
    public String visit(MethodCall methodCall) {
        //todo
        return null;
    }

    @Override
    public String visit(NewClassInstance newClassInstance) {
        //todo
        return null;
    }

    @Override
    public String visit(SelfClass selfClass) {
        //todo
        return null;
    }

    @Override
    public String visit(NullValue nullValue) {
        //todo
        return null;
    }

    @Override
    public String visit(IntValue intValue) {
        //todo
        return null;
    }

    @Override
    public String visit(BoolValue boolValue) {
        //todo
        return null;
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
        int slot_num = 0;
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
            return "aconst_null";
        }
        return null;
    }

    public void init_variables_local_var(VariableDeclaration variable_input)
    {

    }
}