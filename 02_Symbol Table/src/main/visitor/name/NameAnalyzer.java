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
import main.compileError.CompileError;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.*;
import main.visitor.*;

public class RandomString {
    // function to generate a random string of length n
    static String getAlphaNumericString(int n)
    {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }
}


public class NameAnalyzer extends Visitor<Void> {

    public boolean has_error = false;

    public static Stack<SymbolTable> symbol_stack = new Stack<>();

    private map<String, ClassSymbolTableItem> class_symbol_map = new map<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        symbol_stack.push(SymbolTable.root);

        ArrayList<VariableDeclaration> global_variables = program.getGlobalVariables();
        ArrayList<ClassDeclaration> classes = program.getClasses();

        for (VariableDeclaration var : global_variables)
        {
            GlobalVariableSymbolTableItem var_item = new GlobalVariableSymbolTableItem(var);
            try
            {
                SymbolTable.root.put(var_item);
            }
            catch (ItemAlreadyExistsException err)
            {
                this.has_error = true;
                var.addError(new CompileError(var.getLine(), ": Redefinition of global variable " + var_item.getName()));
                var.setVarName(new Identifier(RandomString.getAlphaNumericString(25)));
                SymbolTable.root.put(var_item);
            }
        }

        for (ClassDeclaration cls : classes)
        {
            cls.accept(this);
        }

        for (ClassDeclaration cls : classes)
        {
            if (cls.getParentClassName() != null)
            {
                ClassSymbolTableItem parent_cls_item = class_symbol_map.get(cls.getParentClassName().getName());
                ClassSymbolTableItem cur_cls_item = class_symbol_map.get(cls.getClassName().getName());
                cur_cls_item.classSymbolTable.pre = parent_cls_item.classSymbolTable;
            }
        }

        for (ClassDeclaration cls: classes)
        {
            cls.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        ClassSymbolTableItem cls = new ClassSymbolTableItem(classDeclaration);

        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        //todo
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        //todo
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        //todo
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        //todo
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