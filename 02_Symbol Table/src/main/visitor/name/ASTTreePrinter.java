package main.visitor.name;

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
import main.visitor.*;

public class ASTTreePrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables())
            variableDeclaration.accept(this);
        for (ClassDeclaration classDeclaration: program.getClasses())
            classDeclaration.accept(this);
        return null;
    }
    @Override
    public Void visit(ClassDeclaration classDeclaration){
        messagePrinter(classDeclaration.getLine(), classDeclaration.toString());

        for (FieldDeclaration fields : classDeclaration.getFields())
            fields.accept(this);
        for (MethodDeclaration methods: classDeclaration.getMethods())
            methods.accept(this);
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        messagePrinter(constructorDeclaration.getLine(), constructorDeclaration.toString());
        for (VariableDeclaration variables : constructorDeclaration.getArgs())
            variables.accept(this);
        for (VariableDeclaration variables: constructorDeclaration.getLocalVars())
            variables.accept(this);
        for (Statement statements: constructorDeclaration.getBody())
            statements.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        messagePrinter(methodDeclaration.getLine(), methodDeclaration.toString());
        for (VariableDeclaration variables : methodDeclaration.getArgs())
            variables.accept(this);
        for (VariableDeclaration variables: methodDeclaration.getLocalVars())
            variables.accept(this);
        for (Statement statements: methodDeclaration.getBody())
            statements.accept(this);
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        messagePrinter(fieldDeclaration.getLine(), fieldDeclaration.toString());
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        messagePrinter(varDeclaration.getLine(), varDeclaration.toString());
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        messagePrinter(assignmentStmt.getLine(), assignmentStmt.toString());
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        messagePrinter(blockStmt.getLine(), blockStmt.toString());
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        messagePrinter(conditionalStmt.getLine(), conditionalStmt.toString());
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        messagePrinter(elsifStmt.getLine(), elsifStmt.toString());
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        messagePrinter(methodCallStmt.getLine(), methodCallStmt.toString());
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        return null;
    }

    @Override
    public Void visit(EachStmt eachStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        //todo
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        //todo
        return null;
    }

    @Override
    public Void visit(TernaryExpression ternaryExpression) {
        //todo
        return null;
    }

    @Override
    public Void visit(ObjectMemberAccess objectOrListMemberAccess) {
        //todo
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        //todo
        return null;
    }

    @Override
    public Void visit(ArrayAccessByIndex arrayAccessByIndex) {
        //todo
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        //todo
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        //todo
        return null;
    }

    @Override
    public Void visit(SelfClass selfClass) {
        //todo
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        //todo
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        //todo
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        //todo
        return null;
    }

    @Override
    public Void visit(SetInclude setAdd) {
        //todo
        return null;
    }

    @Override
    public Void visit(SetValue setValue) {
        //todo
        return null;
    }

    @Override
    public Void visit(SetNew setMerge) {
        //todo
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        //todo
        return null;
    }

    @Override
    public Void visit(SetMerge setAdd) {
        //todo
        return null;
    }

    @Override
    public Void visit(RangeExpression rangeExpression) {
        //todo
        return null;
    }
}
