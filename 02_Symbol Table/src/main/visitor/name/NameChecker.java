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
import main.symbolTable.utils.graph.Graph;

public class NameChecker extends Visitor<Void> {

    private String curr_cls_name;

    private Graph<String> par_pattern;

    Program program;

    public NameChecker(Graph<String> par_pattern) {
        this.par_pattern = par_pattern;
    }

    private SymbolTable get_curr_cls_symbol_table() {
        try {
            ClassSymbolTableItem cls_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + this.curr_cls_name, true);
            return cls_item.getClassSymbolTable();
        } catch (ItemNotFoundException err) {}
        return null;
    }

    @Override
    public Void visit(Program program) {
        this.program = program;
        for (ClassDeclaration cls : program.getClasses()) {
            this.curr_cls_name = cls.getClassName().getName();
            cls.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        if (classDeclaration.getParentClassName() != null) {
            if (this.par_pattern.isSecondNodeAncestorOf(classDeclaration.getParentClassName().getName(), classDeclaration.getClassName().getName())) {
                classDeclaration.addError(new ClassInCyclicInheritance(classDeclaration.getLine(), classDeclaration.getClassName().getName()));
            }
        }

        for (FieldDeclaration field : classDeclaration.getFields()) {
            field.accept(this);
        }
//        if (classDeclaration.getConstructor() != null) {
//            classDeclaration.getConstructor().accept(this);
//        }
        for (MethodDeclaration method : classDeclaration.getMethods()) {
            method.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        if (!methodDeclaration.hasError()) {
            try{
                SymbolTable cls_table = this.get_curr_cls_symbol_table();
                cls_table.getItem(MethodSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), false);
                methodDeclaration.addError(new MethodRedefinition(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName()));
            } catch (ItemNotFoundException good) { }

        }

        boolean err = false;

        try {
            SymbolTable cls_table = this.get_curr_cls_symbol_table();
            cls_table.getItem(FieldSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), true);
            methodDeclaration.addError(new MethodNameConflictWithField(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName()));
            err = true;
        } catch (ItemNotFoundException good) {}

        if (err == false){
            for (ClassDeclaration classDeclaration : program.getClasses()) {
                String child_name = classDeclaration.getClassName().getName();
                if (par_pattern != null) {
                    if (par_pattern.isSecondNodeAncestorOf(child_name, curr_cls_name)) {
                        try {
                            ClassSymbolTableItem child_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + child_name, true);
                            SymbolTable child_table = child_item.getClassSymbolTable();
                            child_table.getItem(FieldSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), true);
                            methodDeclaration.addError(new MethodNameConflictWithField(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName()));
                            break;
                        } catch (ItemNotFoundException good) {
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        if (!fieldDeclaration.hasError()) {
            try {
                SymbolTable cls_table = this.get_curr_cls_symbol_table();
                cls_table.getItem(FieldSymbolTableItem.START_KEY + fieldDeclaration.getVarDeclaration().getVarName().getName(), false);
                fieldDeclaration.addError(new FieldRedefinition(fieldDeclaration.getLine(), fieldDeclaration.getVarDeclaration().getVarName().getName()));
            } catch (ItemNotFoundException good) {}
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {

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