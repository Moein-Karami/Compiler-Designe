package main.visitor.typeChecker;

import main.ast.nodes.*;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.*;
import main.ast.types.NoType;
import main.ast.types.Type;
import main.ast.types.array.ArrayType;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.ast.types.set.SetType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.*;

import java.util.ArrayList;

public class TypeChecker extends Visitor<Void> {
    private Graph<String> classHierarchy;
    ExpressionTypeChecker expressionTypeChecker;

    public TypeChecker(Graph<String> classHierarchy){
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
    }

    boolean is_return(Statement statement)
    {
        if(statement instanceof AssignmentStmt || statement instanceof PrintStmt ||
        statement instanceof MethodCallStmt)
            return false;
        if(statement instanceof ReturnStmt)
            return true;
        if(statement instanceof EachStmt)
        {
            Statement body_each = ((EachStmt) statement).getBody();
            return is_return(body_each);
        }
        if(statement instanceof BlockStmt)
        {
            for(Statement stmt: ((BlockStmt) statement).getStatements())
            {
                if(is_return(stmt) == true)
                    return true;
            }
            return false;
        }
        if(statement instanceof ConditionalStmt)
        {
            if(((ConditionalStmt) statement).getElseBody() == null)
                return false;
            if(!is_return(((ConditionalStmt) statement).getThenBody()))
                return false;
            for(ElsifStmt cond:((ConditionalStmt) statement).getElsif())
            {
                if(!is_return(cond.getThenBody()))
                    return false;
            }
            if(!is_return(((ConditionalStmt) statement).getElseBody()))
                return false;
            return true;
        }
        return false;
    }

    @Override
    public Void visit(Program program) {
        boolean seenMain = false;
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables())
            variableDeclaration.accept(this);
        for (ClassDeclaration classDeclaration: program.getClasses())
        {
            Identifier className = classDeclaration.getClassName();
            String nameIdentifier = className.getName();
            if(nameIdentifier.equals("Main"))
                seenMain = true;
            classDeclaration.accept(this);
        }
        if(seenMain == false)
            program.addError(new NoMainClass());
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        expressionTypeChecker.curr_class = classDeclaration;
        Identifier classIdentifier = classDeclaration.getClassName();
//        Type class_type = classIdentifier.accept(expressionTypeChecker);
        String nameIdentifier = classIdentifier.getName();
        boolean have_initialize = false;
        if (classDeclaration.getParentClassName() != null) {
            String nameParent = classDeclaration.getParentClassName().getName();
            if (!nameParent.equals("Main")) {
                String par_name = classDeclaration.getParentClassName().getName();
                if(!this.classHierarchy.doesGraphContainNode(par_name))
                {
                    classDeclaration.addError(new ClassNotDeclared(classDeclaration.getLine(),
                            par_name));
                }
            }
            if(nameIdentifier.equals("Main"))
                classDeclaration.addError(new MainClassCantInherit(classDeclaration.getLine()));
            if(nameParent.equals("Main"))
                classDeclaration.addError(new CannotExtendFromMainClass(classDeclaration.getLine()));
        }
        for (FieldDeclaration fieldDeclaration : classDeclaration.getFields())
            fieldDeclaration.accept(this);
        if (classDeclaration.getConstructor() != null)
        {
            ConstructorDeclaration constructor_declaration = classDeclaration.getConstructor();
            if(constructor_declaration.getArgs().size() != 0 && nameIdentifier.equals("Main"))
                constructor_declaration.addError(new MainConstructorCantHaveArgs(constructor_declaration.getLine()));
            have_initialize = true;
            classDeclaration.getConstructor().accept(this);
        }
        for (MethodDeclaration methodDeclaration : classDeclaration.getMethods())
            methodDeclaration.accept(this);
        if(have_initialize == false && nameIdentifier.equals("Main"))
            classDeclaration.addError(new NoConstructorInMainClass(classDeclaration));
        expressionTypeChecker.curr_class = null;
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        expressionTypeChecker.curr_method = constructorDeclaration;
//        Type type_constructor = constructorDeclaration.getMethodName().accept(expressionTypeChecker);
        for (ArgPair argPair : constructorDeclaration.getArgs())
            argPair.getVariableDeclaration().accept(this);
        for (VariableDeclaration variableDeclaration : constructorDeclaration.getLocalVars())
            variableDeclaration.accept(this);
        for (Statement statement : constructorDeclaration.getBody())
            statement.accept(this);
        expressionTypeChecker.curr_method = null;
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        expressionTypeChecker.curr_method = methodDeclaration;
        Type return_type = methodDeclaration.getReturnType();
        expressionTypeChecker.is_valid(return_type, methodDeclaration);
        for (ArgPair argPair : methodDeclaration.getArgs()) {
            argPair.getVariableDeclaration().accept(this);
            if (argPair.getDefaultValue() != null)
                argPair.getDefaultValue().accept(this);
        }
        for (VariableDeclaration variableDeclaration : methodDeclaration.getLocalVars())
            variableDeclaration.accept(this);
        boolean have_add_unreach = false;
        for (Statement statement : methodDeclaration.getBody()) {
            if(methodDeclaration.getDoesReturn() == true && !have_add_unreach)
            {
                have_add_unreach = true;
                statement.addError(new UnreachableStatements(statement));
            }
            if(is_return(statement))
            {
                expressionTypeChecker.curr_method.setDoesReturn(true);
            }
            if(!have_add_unreach)
                statement.accept(this);
        }
        if(!(return_type instanceof VoidType) && methodDeclaration.getDoesReturn() == false)
        {
            methodDeclaration.addError(new MissingReturnStatement(methodDeclaration));
        }
        if((return_type instanceof VoidType) && methodDeclaration.getDoesReturn() == true)
        {
            methodDeclaration.addError(new VoidMethodHasReturn(methodDeclaration));
        }
        expressionTypeChecker.curr_method = null;
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        boolean temp = expressionTypeChecker.is_valid(varDeclaration.getType(), varDeclaration);
        if(varDeclaration.getType() instanceof ArrayType)
        {
            for (Expression dim : ((ArrayType) varDeclaration.getType()).getDimensions()){
                if (dim instanceof IntValue){
                    if (((IntValue) dim).getConstant() == 0){
                        varDeclaration.addError(new CannotHaveEmptyArray(varDeclaration.getLine()));
                        varDeclaration.setType(new NoType());
                        break;
                    }
                }
            }
        }
        else if (!temp) {
            set_no_type(varDeclaration);
        }

        return null;
    }

    public void set_no_type(VariableDeclaration var) {
        var.setType(new NoType());
        ClassSymbolTableItem class_item;
        SymbolTable class_table;
        MethodSymbolTableItem method_item;
        SymbolTable method_table;
        LocalVariableSymbolTableItem local_item;
        if (expressionTypeChecker.curr_class == null)
        {
            try {
                local_item = (LocalVariableSymbolTableItem) SymbolTable.root.getItem(LocalVariableSymbolTableItem.START_KEY + var.getVarName(), true);
                local_item.setType(new NoType());
            } catch (ItemNotFoundException ignored) {}

        }
        else {
            try {
                class_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + expressionTypeChecker.curr_class.getClassName().getName(), true);
                class_table = class_item.getClassSymbolTable();
                if (expressionTypeChecker.curr_method == null) {
                    try {
                        FieldSymbolTableItem field = (FieldSymbolTableItem) class_table.getItem(FieldSymbolTableItem.START_KEY + var.getVarName().getName(), true);
                        field.setType(new NoType());
                    } catch (ItemNotFoundException ignored) {
                    }
                } else {
                    try {
                        method_item = (MethodSymbolTableItem) class_table.getItem(MethodSymbolTableItem.START_KEY + this.expressionTypeChecker.curr_method.getMethodName().getName(), true);
                        method_table = method_item.getMethodSymbolTable();
                        local_item = (LocalVariableSymbolTableItem) method_table.getItem(LocalVariableSymbolTableItem.START_KEY + var.getVarName().getName(), true);
                        local_item.setType(new NoType());
                    } catch (ItemNotFoundException ignored) {
                    }
                }
            } catch (ItemNotFoundException ignored) {}
        }
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Type l_value = assignmentStmt.getlValue().accept(expressionTypeChecker);
        Type r_value = assignmentStmt.getrValue().accept(expressionTypeChecker);
        if (r_value instanceof VoidType)
            assignmentStmt.addError(new CantUseValueOfVoidMethod(assignmentStmt.getLine()));
        if(l_value instanceof NoType)
            return null;
        boolean temp = expressionTypeChecker.is_lval(assignmentStmt.getlValue());
        if(!temp)
        {
            assignmentStmt.addError(new LeftSideNotLvalue(assignmentStmt.getLine()));
        }
        boolean is_sub_ok = expressionTypeChecker.is_subtype(r_value, l_value);
        if(!is_sub_ok)
        {
            assignmentStmt.addError(new UnsupportedOperandType(assignmentStmt.getLine()
            , BinaryOperator.assign.name()));
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type cond_stm = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(cond_stm instanceof BoolType || cond_stm instanceof NoType))
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));
        conditionalStmt.getThenBody().accept(this);
        for (Statement statement : conditionalStmt.getElsif())
            statement.accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        Type cond_stm = elsifStmt.getCondition().accept(expressionTypeChecker);
        if(!(cond_stm instanceof BoolType || cond_stm instanceof NoType))
            elsifStmt.addError(new ConditionNotBool(elsifStmt.getLine()));
        elsifStmt.getCondition().accept(this);
        elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        Type method_class_stmt = methodCallStmt.getMethodCall().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        Type argType = print.getArg().accept(expressionTypeChecker);
        if(!(argType instanceof IntType || argType instanceof ArrayType || argType instanceof SetType ||
                argType instanceof BoolType || argType instanceof NoType)) {
            UnsupportedTypeForPrint exception = new UnsupportedTypeForPrint(print.getLine());
            print.addError(exception);
        }
        if (argType instanceof VoidType)
            print.addError(new CantUseValueOfVoidMethod(print.getLine()));
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type ret_type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type method_type = expressionTypeChecker.curr_method.getReturnType();
        if(!expressionTypeChecker.is_subtype(ret_type, method_type))
            returnStmt.addError(new ReturnValueNotMatchMethodReturnType(returnStmt));
        return null;
    }

    @Override
    public Void visit(EachStmt eachStmt) {
        Identifier each_var = eachStmt.getVariable();
        Type type_var = each_var.accept(expressionTypeChecker);
        Expression range_var = eachStmt.getList();
        Type range_type = range_var.accept(expressionTypeChecker);
        if(!(range_type instanceof ArrayType || range_type instanceof NoType))
            eachStmt.addError(new EachCantIterateNoneArray(eachStmt.getLine()));
        else if(!expressionTypeChecker.is_subtype(range_type, type_var))
        {
            eachStmt.addError(new EachVarNotMatchList(eachStmt));
        }
        eachStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        Expression set_arg = setDelete.getSetArg();
        Type type_arg = set_arg.accept(expressionTypeChecker);
        Expression element_set = setDelete.getElementArg();
        Type type_element = element_set.accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(SetMerge setMerge) {
        boolean have_add_error = false;
        Expression set_arg = setMerge.getSetArg();
        Type type_arg = set_arg.accept(expressionTypeChecker);
        if(setMerge.getElementArgs().size() > 1) {
            for (Expression set_expr : setMerge.getElementArgs()) {
                Type type_merge = set_expr.accept(expressionTypeChecker);
                if (!(type_merge instanceof IntType || type_merge instanceof NoType) && !have_add_error) {
                    setMerge.addError(new MergeInputNotSet(setMerge.getLine()));
                    have_add_error = true;
                }
            }
        }
        else if(setMerge.getElementArgs().size() == 1)
        {
            Expression input_arg = setMerge.getElementArgs().get(0);
            Type type_merge = input_arg.accept(expressionTypeChecker);
            if(!(type_merge instanceof SetType || type_merge instanceof NoType))
                setMerge.addError(new MergeInputNotSet(setMerge.getLine()));
        }
        return null;
    }

    @Override
    public Void visit(SetAdd setAdd) {
        Expression set_arg = setAdd.getSetArg();
        Type type_arg = set_arg.accept(expressionTypeChecker);
        Type type_input_set = setAdd.getElementArg().accept(expressionTypeChecker);
        if(!(type_input_set instanceof IntType || type_input_set instanceof NoType))
            setAdd.addError(new AddInputNotInt(setAdd.getLine()));
        return null;
    }
}
