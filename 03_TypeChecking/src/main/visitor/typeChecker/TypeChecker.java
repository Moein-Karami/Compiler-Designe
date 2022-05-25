package main.visitor.typeChecker;

import main.ast.nodes.*;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.*;
import main.ast.types.NoType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.set.SetType;
import main.compileError.typeError.*;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.*;

import javax.lang.model.type.ArrayType;

public class TypeChecker extends Visitor<Void> {
    private Graph<String> classHierarchy;
    ExpressionTypeChecker expressionTypeChecker;

    public TypeChecker(Graph<String> classHierarchy){
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
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
        Identifier classIdentifier = classDeclaration.getClassName();
        String nameIdentifier = classIdentifier.getName();
        boolean have_initialize = false;
        if (classDeclaration.getParentClassName() != null)
        {
            classDeclaration.getParentClassName().accept(this);
            String nameParent = classDeclaration.getParentClassName().getName();
            if(!this.classHierarchy.doesGraphContainNode(nameParent))
                classDeclaration.addError(new ClassNotDeclared(classDeclaration.getLine(), nameParent));
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
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        for (ArgPair argPair : constructorDeclaration.getArgs())
            argPair.getVariableDeclaration().accept(this);
        for (VariableDeclaration variableDeclaration : constructorDeclaration.getLocalVars())
            variableDeclaration.accept(this);
        for (Statement statement : constructorDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        Type return_type = methodDeclaration.getReturnType();
        this.expressionTypeChecker.isValidType(methodDeclaration, methodDeclaration.getReturnType());
        for (ArgPair argPair : methodDeclaration.getArgs()) {
            argPair.getVariableDeclaration().accept(this);
            if (argPair.getDefaultValue() != null)
                argPair.getDefaultValue().accept(this);
        }
        for (VariableDeclaration variableDeclaration : methodDeclaration.getLocalVars())
            variableDeclaration.accept(this);
        for (Statement statement : methodDeclaration.getBody())
            statement.accept(this);
        methodDeclaration.getReturnType();
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        Type var_dec_type = varDeclaration.getVarName().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Type l_value = assignmentStmt.getlValue().accept(expressionTypeChecker);
        Type r_value = assignmentStmt.getrValue().accept(expressionTypeChecker);
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
        conditionalStmt.getThenBody().accept(this);
        for (Statement statement : conditionalStmt.getElsif())
            statement.accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
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
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type ret_type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
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
        if(!expressionTypeChecker.have_equal_type(range_type, type_var))
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
        Expression set_arg = setMerge.getSetArg();
        Type type_arg = set_arg.accept(expressionTypeChecker);
        if(setMerge.getElementArgs().size() > 1) {
            for (Expression set_expr : setMerge.getElementArgs()) {
                Type type_merge = set_expr.accept(expressionTypeChecker);
                if (!(type_merge instanceof IntType || type_merge instanceof NoType))
                    setMerge.addError(new MergeInputNotSet(setMerge.getLine()));
            }
        }
        else if(setMerge.getElementArgs().size() == 1)
        {
            Expression input_arg = setMerge.getElementArgs().get(0);
            Type type_merge = input_arg.accept(expressionTypeChecker);
            if(!(type_merge instanceof IntType || type_merge instanceof NoType))
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
