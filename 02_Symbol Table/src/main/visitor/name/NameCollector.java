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
import main.compileError.nameError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.visitor.Visitor;

public class NameCollector extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable.push(new SymbolTable());
        SymbolTable.root = SymbolTable.top;

        for (VariableDeclaration var : program.getGlobalVariables()) {
            try{
                SymbolTable.root.put(new GlobalVariableSymbolTableItem(var));
            } catch (ItemAlreadyExistsException err){
                var.addError(new GlobalVarRedefinition(var.getLine(), var.getVarName().getName()));
            }
        }

        for (ClassDeclaration cls : program.getClasses()){
            cls.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        ClassSymbolTableItem cls_item = new ClassSymbolTableItem(classDeclaration);
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        cls_item.setClassSymbolTable(SymbolTable.top);
        try {
            SymbolTable.root.put(cls_item);
        } catch (ItemAlreadyExistsException err) {
            ClassRedefinition error = new ClassRedefinition(classDeclaration);
            classDeclaration.addError(error);
            error.handle_error(classDeclaration);
        }

        for (FieldDeclaration field : classDeclaration.getFields()){
            field.accept(this)
        }

        if (classDeclaration.getClassName() != null) {
            classDeclaration.getConstructor().accept(this);
        }

        for (MethodDeclaration method : classDeclaration.getMethods()){
            method.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        MethodSymbolTableItem method_item = new MethodSymbolTableItem(methodDeclaration);
        SymbolTable method_table = new SymbolTable(SymbolTable.top);
        method_item.setMethodSymbolTable(method_table);

        try {
            SymbolTable.top.put(method_item);
        } catch (ItemAlreadyExistsException err) {
            methodDeclaration.addError(new MethodRedefinition(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName()));
        }

        SymbolTable.push(method_table);

        for (VariableDeclaration var : methodDeclaration.getArgs()) {
            var.accept(this);
        }

        for (VariableDeclaration var : methodDeclaration.getLocalVars()) {
            var.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        try {
            SymbolTable.top.put(new FieldSymbolTableItem(fieldDeclaration));
        } catch (ItemAlreadyExistsException err) {
            fieldDeclaration.addError(new FieldRedefinition(fieldDeclaration.getLine(), fieldDeclaration.getVarDeclaration().getVarName().getName()));
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        LocalVariableSymbolTableItem var_item(varDeclaration);
        try {
            SymbolTable.root.getItem(var_item.getKey(), true);
            varDeclaration.addError(new LocalVarConflictWithGlobalVar(varDeclaration.getLine(), varDeclaration.getVarName().getName()));
        } catch (ItemNotFoundException good_err) {
            try {
                SymbolTable.top.put(new LocalVariableSymbolTableItem(varDeclaration));
            } catch (ItemAlreadyExistsException err) {
                varDeclaration.addError(new LocalVarRedefinition(varDeclaration.getLine()), varDeclaration.getVarName().getName());
            }
        }
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        //todo
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //todo
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