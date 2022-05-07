package main.visitor.name;

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
import main.visitor.*;
import org.stringtemplate.v4.ST;

import java.util.ArrayList;

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
        Identifier new_id = classDeclaration.getClassName();
        if (new_id != null)
            new_id.accept(this);
        for (FieldDeclaration fields : classDeclaration.getFields())
            fields.accept(this);
        for (MethodDeclaration methods: classDeclaration.getMethods())
            methods.accept(this);
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
//        Identifier new_id = constructorDeclaration.getMethodName();
//        if (new_id != null)
//            new_id.accept(this);
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
        Identifier new_id = methodDeclaration.getMethodName();
        if (new_id != null)
            new_id.accept(this);
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
        VariableDeclaration new_var = fieldDeclaration.getVarDeclaration();
        if (new_var != null)
            new_var.accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        messagePrinter(varDeclaration.getLine(), varDeclaration.toString());
        Identifier new_id = varDeclaration.getVarName();
        if (new_id != null)
            new_id.accept(this);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        messagePrinter(assignmentStmt.getLine(), assignmentStmt.toString());
        Expression lval = assignmentStmt.getlValue();
        Expression rval = assignmentStmt.getrValue();
        if(lval != null)
            lval.accept(this);
        if(rval != null)
            rval.accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        messagePrinter(blockStmt.getLine(), blockStmt.toString());
        for (Statement statements: blockStmt.getStatements())
            statements.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        messagePrinter(conditionalStmt.getLine(), conditionalStmt.toString());
        Expression condition_stmt = conditionalStmt.getCondition();
        if(condition_stmt != null)
        {
            condition_stmt.accept(this);
        }
        Statement then_stmt = conditionalStmt.getThenBody();
        if(then_stmt != null)
            then_stmt.accept(this);
        ArrayList<ElsifStmt> else_stmt = conditionalStmt.getElsif();
        for(Statement for_elif: else_stmt)
        {
            for_elif.accept(this);
        }
        Statement else_stmt2 = conditionalStmt.getElseBody();
        if(else_stmt2 != null)
        {
            else_stmt2.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        messagePrinter(elsifStmt.getLine(), elsifStmt.toString());
        Expression cond = elsifStmt.getCondition();
        if(cond != null)
            cond.accept(this);
        Statement then_body = elsifStmt.getThenBody();
        if(then_body != null)
            then_body.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        messagePrinter(methodCallStmt.getLine(), methodCallStmt.toString());
        MethodCall method_now = methodCallStmt.getMethodCall();
        if(method_now != null)
            method_now.accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        messagePrinter(print.getLine(), print.toString());
        Expression print_exp = print.getArg();
        if(print_exp != null)
            print_exp.accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        messagePrinter(returnStmt.getLine(), returnStmt.toString());
        Expression ret_expr = returnStmt.getReturnedExpr();
        if(ret_expr != null)
            ret_expr.accept(this);
        return null;
    }

    @Override
    public Void visit(EachStmt eachStmt) {
        messagePrinter(eachStmt.getLine(), eachStmt.toString());
        Identifier id_each = eachStmt.getVariable();
        if(id_each != null)
            id_each.accept(this);
        Expression exp_each = eachStmt.getList();
        if(exp_each != null)
            exp_each.accept(this);
        Statement body_each = eachStmt.getBody();
        if(body_each != null)
            body_each.accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());
        Expression exp1 = binaryExpression.getFirstOperand();
        if (exp1 != null) {
            exp1.accept(this);
        }
        Expression exp2 = binaryExpression.getSecondOperand();
        if(exp2 != null)
        {
            exp2.accept(this);
        }
//        BinaryOperator oper_exp = binaryExpression.getBinaryOperator();
//        if(oper_exp != null)
//            oper_exp.accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        Expression un_exp = unaryExpression.getOperand();
        if(un_exp != null)
            un_exp.accept(this);
        return null;
    }

    @Override
    public Void visit(TernaryExpression ternaryExpression) {
        messagePrinter(ternaryExpression.getLine(), ternaryExpression.toString());
        Expression exp1 = ternaryExpression.getCondition();
        if(exp1 != null)
            exp1.accept(this);
        Expression exp2 = ternaryExpression.getTrueExpression();
        if(exp2 != null)
            exp2.accept(this);
        Expression exp3 = ternaryExpression.getFalseExpression();
        if(exp3 != null)
            exp3.accept(this);
        return null;
    }

    @Override
    public Void visit(ObjectMemberAccess objectOrListMemberAccess) {
        messagePrinter(objectOrListMemberAccess.getLine(), objectOrListMemberAccess.toString());
        Expression exp1 = objectOrListMemberAccess.getInstance();
        if(exp1 != null)
            exp1.accept(this);
        Identifier id_member = objectOrListMemberAccess.getMemberName();
        if(id_member != null)
            id_member.accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        messagePrinter(identifier.getLine(), identifier.toString());
        return null;
    }

    @Override
    public Void visit(ArrayAccessByIndex arrayAccessByIndex) {
        messagePrinter(arrayAccessByIndex.getLine(), arrayAccessByIndex.toString());
        Expression exp1 = arrayAccessByIndex.getInstance();
        if(exp1 != null)
            exp1.accept(this);
        Expression exp2 = arrayAccessByIndex.getIndex();
        if(exp2 != null)
            exp2.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        messagePrinter(methodCall.getLine(), methodCall.toString());
        Expression exp1 = methodCall.getInstance();
        if(exp1 != null) {
            exp1.accept(this);
        }
        ArrayList<Expression> exp2_arr = methodCall.getArgs();
        for(Expression exp2: exp2_arr)
        {
            exp2.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        messagePrinter(newClassInstance.getLine(), newClassInstance.toString());
        ArrayList<Expression> exp_arr = newClassInstance.getArgs();
        for(Expression expr1: exp_arr)
        {
            expr1.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SelfClass selfClass) {
        messagePrinter(selfClass.getLine(), selfClass.toString());
        return null;
    }

    @Override
    public Void visit(NullValue nullValue){
        messagePrinter(nullValue.getLine(), nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        messagePrinter(intValue.getLine(), intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        messagePrinter(boolValue.getLine(), boolValue.toString());
        return null;
    }

    @Override
    public Void visit(SetInclude setAdd) {
        messagePrinter(setAdd.getLine(), setAdd.toString());
        Expression set_arg = setAdd.getSetArg();
        if(set_arg != null)
            set_arg.accept(this);
        Expression elem_arg = setAdd.getElementArg();
        if(elem_arg != null)
            elem_arg.accept(this);
        return null;
    }

    @Override
    public Void visit(SetValue setValue) {
        messagePrinter(setValue.getLine(), setValue.toString());
        ArrayList<IntValue> int_set = setValue.getElements();
        for(IntValue val: int_set)
            val.accept(this);
        return null;
    }

    @Override
    public Void visit(SetNew setMerge) {
        messagePrinter(setMerge.getLine(), setMerge.toString());
        ArrayList<Expression> exp_arr;
        exp_arr = setMerge.getArgs();
        for(Expression exp: exp_arr)
        {
            exp.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        messagePrinter(setDelete.getLine(), setDelete.toString());
        Expression set_arg = setDelete.getSetArg();
        if(set_arg != null)
            set_arg.accept(this);
        Expression element_arg = setDelete.getElementArg();
        if(element_arg != null)
            element_arg.accept(this);
        return null;
    }

    @Override
    public Void visit(SetMerge setAdd) {
        messagePrinter(setAdd.getLine(), setAdd.toString());
        Expression exp = setAdd.getSetArg();
        if(exp != null)
            exp.accept(this);
        ArrayList<Expression> exp2 = setAdd.getElementArgs();
        for(Expression exper: exp2)
        {
            exper.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(RangeExpression rangeExpression) {
        messagePrinter(rangeExpression.getLine(), rangeExpression.toString());
        Expression left_exp = rangeExpression.getLeftExpression();
        if(left_exp != null)
            left_exp.accept(this);
        Expression right_exp = rangeExpression.getRightExpression();
        if(right_exp != null)
            right_exp.accept(this);
        return null;
    }
}
