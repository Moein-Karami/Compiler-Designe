package main.visitor.typeChecker;

import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.types.NoType;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.array.ArrayType;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.ast.types.set.SetType;
import main.compileError.typeError.ClassNotDeclared;
import main.compileError.typeError.ConstructorArgsNotMatchDefinition;
import main.compileError.typeError.IncDecOperandNotLvalue;
import main.compileError.typeError.UnsupportedOperandType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    private Graph<String> classHierarchy;

    public ExpressionTypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    public boolean is_subtype_multiple(ArrayList<Type> first, ArrayList<Type> second) {
        if(first.size() != second.size())
            return false;
        for(int i = 0; i < first.size(); i++) {
            if(!is_subtype(first.get(i), second.get(i)))
                return false;
        }
        return true;
    }

    public boolean is_subtype(Type first, Type second) {
        if(first instanceof NoType)
            return true;
        else if(first instanceof IntType || first instanceof BoolType || first instanceof VoidType || first instanceof SetType)
            return first.toString().equals(second.toString());
        else if(first instanceof NullType)
            return second instanceof NullType;
        else if(first instanceof ClassType) {
            if (second instanceof NullType)
                return true;
            if(!(second instanceof ClassType))
                return false;
            return this.classHierarchy.isSecondNodeAncestorOf(((ClassType) first).getClassName().getName(), ((ClassType) second).getClassName().getName());
        }
        else if(first instanceof FptrType) {
            if (second instanceof NullType)
                return true;
            if(!(second instanceof FptrType))
                return false;
            Type firstRetType = ((FptrType) first).getReturnType();
            Type secondRetType = ((FptrType) second).getReturnType();
            if(!is_subtype(firstRetType, secondRetType))
                return false;
            ArrayList<Type> firstArgsTypes = ((FptrType) first).getArgumentsTypes();
            ArrayList<Type> secondArgsTypes = ((FptrType) second).getArgumentsTypes();
            return is_subtype_multiple(secondArgsTypes, firstArgsTypes);
        }
        else if(first instanceof ArrayType) {
            if(!(second instanceof ArrayType))
                return false;
            return ((ArrayType) first).getType().toString().equals(((ArrayType) second).getType().toString());
        }
        return false;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        Type first_type = binaryExpression.getFirstOperand().accept(this);
        Type second_type = binaryExpression.getSecondOperand().accept(this);
        if (operator.equals(BinaryOperator.eq)) {
            if ((first_type instanceof ArrayType) || (first_type instanceof SetType) || (second_type instanceof ArrayType)
                    || (second_type instanceof SetType)){
                binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), operator.name()));
                return new NoType();
            }
            if ((first_type instanceof NoType) || (second_type instanceof NoType)){
                return new NoType();
            }
            if (((first_type instanceof BoolType) || (first_type instanceof IntType) || (first_type instanceof VoidType))
                    && second_type.toString().equals(first_type.toString())) {
                return new BoolType();
            }
            if (((first_type instanceof ClassType) && (second_type instanceof NullType)) || ((first_type instanceof NullType)
                    || (second_type instanceof ClassType)))
                return new BoolType();
            if (((first_type instanceof FptrType) && (second_type instanceof NullType)) || ((first_type instanceof NullType) &&
                    (second_type instanceof FptrType)))
                return new BoolType();
            if ((first_type instanceof FptrType) && (second_type instanceof FptrType)) {
                if (is_subtype(first_type, second_type) || is_subtype(second_type, first_type))
                    return new BoolType();
            }
            if ((first_type instanceof ClassType) && (second_type instanceof ClassType))
                if(((ClassType) first_type).getClassName().getName().equals(((ClassType) second_type).getClassName().getName()))
                    return new BoolType();
        } else if (operator == BinaryOperator.mult || operator == BinaryOperator.div || operator == BinaryOperator.add
                || operator == BinaryOperator.sub) {
            if ((first_type instanceof NoType) || (second_type instanceof NoType))
                return new NoType();
            if ((first_type instanceof IntType) && (second_type instanceof IntType))
                return new IntType();
        } else if (operator == BinaryOperator.or || operator == BinaryOperator.and) {
            if ((first_type instanceof NoType) || (second_type instanceof NoType))
                return new NoType();
            if ((first_type instanceof BoolType) && (second_type instanceof BoolType))
                return new BoolType();
        } else if (operator == BinaryOperator.gt || operator == BinaryOperator.lt) {
            if ((first_type instanceof NoType) || (second_type instanceof NoType))
                return new NoType();
            if ((first_type instanceof IntType) && (second_type instanceof IntType))
                return new BoolType();
        }
        binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), operator.name()));
        return new NoType();
    }

    @Override
    public Type visit(NewClassInstance newClassInstance) {
        String class_name = newClassInstance.getClassType().getClassName().getName();
        ArrayList<Type> given_args = new ArrayList<>();
        for (Expression exp : newClassInstance.getArgs())
            given_args.add(exp.accept(this));
        if (!this.classHierarchy.doesGraphContainNode(class_name)) {
            newClassInstance.addError(new ClassNotDeclared(newClassInstance.getLine(), class_name));
            return new NoType();
        }
        try {
            ClassSymbolTableItem class_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + class_name, true);
            MethodSymbolTableItem init_item = (MethodSymbolTableItem) class_item.getClassSymbolTable().getItem(MethodSymbolTableItem.START_KEY + class_name, true);
            ArrayList<Type> init_args = init_item.getArgTypes();
            if (is_subtype_multiple(given_args, init_args))
                return newClassInstance.getClassType();
            else {
                newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
                return new NoType();
            }
        } catch (ItemNotFoundException err) {
            if(given_args.size() != 0) {
                newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
                return new NoType();
            }
            else {
                return newClassInstance.getClassType();
            }
        }
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        Type operand = unaryExpression.getOperand().accept(this);
        if (operand instanceof NoType)
            return new NoType();
        UnaryOperator operator = unaryExpression.getOperator();
        if (operator == UnaryOperator.not) {
            if (operand instanceof BoolType)
                return new BoolType();
        } else if (operator == UnaryOperator.minus){
            if (operand instanceof IntType)
                return new IntType();
        } else {
            boolean lval = this.is_lval(unaryExpression.getOperand());
            if (!lval)
                unaryExpression.addError(new IncDecOperandNotLvalue(unaryExpression.getLine(), operator.name()));
            if (operand instanceof IntType) {
                if (lval)
                    return operand;
                return new NoType();
            }
        }
        unaryExpression.addError(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
        return new NoType();
    }

    @Override
    public Type visit(MethodCall methodCall) {
        //Todo
        return null;
    }

    @Override
    public Type visit(Identifier identifier) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ArrayAccessByIndex arrayAccessByIndex) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ObjectMemberAccess objectMemberAccess) {
        //Todo
        return null;
    }

    @Override
    public Type visit(SetNew setNew) {
        //Todo
        return null;
    }

    @Override
    public Type visit(SetInclude setInclude) {
        //Todo
        return null;
    }

    @Override
    public Type visit(RangeExpression rangeExpression) {
        //Todo
        return null;
    }

    @Override
    public Type visit(TernaryExpression ternaryExpression) {
        //Todo
        return null;
    }

    @Override
    public Type visit(IntValue intValue) {
        //Todo
        return null;
    }

    @Override
    public Type visit(BoolValue boolValue) {
        //Todo
        return null;
    }

    @Override
    public Type visit(SelfClass selfClass) {
        //todo
        return null;
    }

    @Override
    public Type visit(SetValue setValue) {
        //todo
        return null;
    }

    @Override
    public Type visit(NullValue nullValue) {
        //todo
        return null;
    }
}
