package main.visitor.name;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.SetDelete;
import main.ast.nodes.statement.set.SetMerge;
import main.compileError.CompileError;
import main.visitor.Visitor;

import java.util.ArrayList;

public class ErrorPrinter extends Visitor<Void> {

    public boolean has_error = false;
    @Override
    public Void visit(Program program) {
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables())
            variableDeclaration.accept(this);
        for (ClassDeclaration classDeclaration: program.getClasses())
            classDeclaration.accept(this);
        return null;
    }
    @Override
    public Void visit(ClassDeclaration classDeclaration){

        for (CompileError cerr : classDeclaration.flushErrors()) {
            has_error = true;
            System.out.println(cerr.getMessage());
        }

        for (FieldDeclaration fields : classDeclaration.getFields())
            fields.accept(this);
        for (MethodDeclaration methods: classDeclaration.getMethods())
            methods.accept(this);
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        for (CompileError cerr : methodDeclaration.flushErrors()){
            has_error = true;
            System.out.println(cerr.getMessage());
        }
        for (VariableDeclaration variables : methodDeclaration.getArgs())
            variables.accept(this);
        for (VariableDeclaration variables: methodDeclaration.getLocalVars())
            variables.accept(this);
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        for (CompileError cerr : fieldDeclaration.flushErrors()) {
            has_error = true;
            System.out.println(cerr.getMessage());
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        for (CompileError cerr : varDeclaration.flushErrors()){
            has_error = true;
            System.out.println(cerr.getMessage());
        }
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
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
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        return null;
    }

    @Override
    public Void visit(TernaryExpression ternaryExpression) {
        return null;
    }

    @Override
    public Void visit(ObjectMemberAccess objectOrListMemberAccess) {
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }

    @Override
    public Void visit(ArrayAccessByIndex arrayAccessByIndex) {
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        return null;
    }

    @Override
    public Void visit(SelfClass selfClass) {
        return null;
    }

    @Override
    public Void visit(NullValue nullValue){
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public Void visit(SetInclude setAdd) {
        return null;
    }

    @Override
    public Void visit(SetValue setValue) {
        return null;
    }

    @Override
    public Void visit(SetNew setMerge) {
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        return null;
    }

    @Override
    public Void visit(SetMerge setAdd) {
        return null;
    }

    @Override
    public Void visit(RangeExpression rangeExpression) {
        return null;
    }
}
