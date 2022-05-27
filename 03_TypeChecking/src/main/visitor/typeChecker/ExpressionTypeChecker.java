package main.visitor.typeChecker;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.TernaryOperator;
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
import main.compileError.CompileError;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.LocalVariableSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.Set;

public class ExpressionTypeChecker extends Visitor<Type> {
    private Graph<String> classHierarchy;

    public ExpressionTypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    public ClassDeclaration curr_class;

    public MethodDeclaration curr_method;

    public boolean is_lval(Expression expression) {
        Type exp_type = expression.accept(this);
        if (expression instanceof Identifier || expression instanceof ObjectMemberAccess || expression instanceof ArrayAccessByIndex)
            return is_subtype(exp_type, new IntType());
        return false;
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
            return is_subtype(((ArrayType) first).getType(), ((ArrayType) second).getType());
        }
        return false;
    }

    public Boolean is_valid(Type type, Node node) {
        if(type instanceof ArrayType) {
            if (!is_valid(((ArrayType) type).getType(), node))
                return false;
            ArrayList<Expression> dims = ((ArrayType) type).getDimensions();
            for (Expression exp : dims) {
                Type tp = exp.accept(this);
                if (!(is_subtype(tp, new IntType()))) {
                    node.addError(new ArrayIndexNotInt(node.getLine()));
                    return false;
                }
            }
        }
        if(type instanceof ClassType) {
            String className = ((ClassType)type).getClassName().getName();
            if(!this.classHierarchy.doesGraphContainNode(className)) {
                node.addError(new ClassNotDeclared(node.getLine(), className));
                return false;
            }
        }
        if(type instanceof FptrType) {
            Type ret = ((FptrType) type).getReturnType();
            ArrayList<Type> args = ((FptrType) type).getArgumentsTypes();
            if (!is_valid(ret, node))
                return false;
            for(Type arg : args)
                if (!is_valid(arg, node))
                    return false;
        }
        return true;
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
        Type instance = methodCall.getInstance().accept(this);
        if (instance instanceof NoType)
            return new NoType();
        if (!(instance instanceof FptrType)) {
            methodCall.addError(new CallOnNoneCallable(methodCall.getLine()));
            return new NoType();
        }
        ArrayList<Type> given_args = new ArrayList<>();
        for (Expression arg : methodCall.getArgs())
            given_args.add(arg.accept(this));
        ArrayList<Type> args = ((FptrType) instance).getArgumentsTypes();
        Type ret = ((FptrType) instance).getReturnType();
        if (!(methodCall.getInstance() instanceof ObjectMemberAccess)){
            if (is_subtype_multiple(given_args, args))
                return ret;
        }
        else{
            int defs = this.get_number_of_defaults((ObjectMemberAccess) methodCall.getInstance());
            boolean check = is_subtype_multiple(given_args, args);
            while (defs > 0) {
                defs--;
                args.remove(args.size() - 1);
                check |= is_subtype_multiple(given_args, args);
            }
            if (check)
                return ret;
        }

        methodCall.addError(new MethodCallNotMatchDefinition(methodCall.getLine()));
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        ClassSymbolTableItem class_item;
        SymbolTable class_table;
        MethodSymbolTableItem method_item;
        SymbolTable method_table;
        LocalVariableSymbolTableItem local_item;
        Type tp;
        try {
            class_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + this.curr_class.getClassName().getName(), true);
            class_table = class_item.getClassSymbolTable();
            method_item = (MethodSymbolTableItem) class_table.getItem(MethodSymbolTableItem.START_KEY + this.curr_method.getMethodName().getName(), true);
            method_table = method_item.getMethodSymbolTable();
            try {
                local_item = (LocalVariableSymbolTableItem) method_table.getItem(LocalVariableSymbolTableItem.START_KEY + identifier.getName(), true);
                tp = local_item.getType();
                if (is_valid(tp, identifier))
                    return tp;
                else
                    return new NoType();
            } catch (ItemNotFoundException e) {
                try {
                    local_item = (LocalVariableSymbolTableItem) SymbolTable.root.getItem(LocalVariableSymbolTableItem.START_KEY + identifier.getName(), true);
                    tp = local_item.getType();
                    if (is_valid(tp, identifier))
                        return tp;
                    else
                        return new NoType();
                } catch (ItemNotFoundException ignored) {
                }
            }
        } catch (ItemNotFoundException ignored) {
        }
        identifier.addError(new VarNotDeclared(identifier.getLine(), identifier.getName()));
        return new NoType();
    }

    @Override
    public Type visit(ArrayAccessByIndex arrayAccessByIndex) {
        Expression instance = arrayAccessByIndex.getInstance();
        Expression index = arrayAccessByIndex.getIndex();
        Type instance_type = instance.accept(this);
        Type index_type = index.accept(this);
        boolean err = false;
        if (!(instance_type instanceof ArrayType || instance_type instanceof NoType)){
            arrayAccessByIndex.addError(new AccessByIndexOnNoneArray(arrayAccessByIndex.getLine()));
            err = true;
        }
        if (!is_subtype(index_type, new IntType())){
            arrayAccessByIndex.addError(new ArrayIndexNotInt(arrayAccessByIndex.getLine()));
            err = true;
        }
        if (err)
            return new NoType();
        return instance_type;
    }

    @Override
    public Type visit(ObjectMemberAccess objectMemberAccess) {
        Expression instance = objectMemberAccess.getInstance();
        Identifier member_name = objectMemberAccess.getMemberName();
        Type instance_type = instance.accept(this);
        if (instance_type instanceof NoType)
            return new NoType();
        if (!(instance_type instanceof ClassType)){
            objectMemberAccess.addError(new AccessOnNonClass(objectMemberAccess.getLine()));
            return new NoType();
        }
        String class_name = ((ClassType) instance_type).getClassName().getName();
        ClassSymbolTableItem class_item;
        SymbolTable class_table;
        try {
            class_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + class_name, true);
            class_table = class_item.getClassSymbolTable();
        } catch (ItemNotFoundException e) {
            return new NoType();
        }
        try {
            FieldSymbolTableItem field_item = (FieldSymbolTableItem) class_table.getItem(FieldSymbolTableItem.START_KEY + member_name.getName(), true);
            if (is_valid(field_item.getType(), objectMemberAccess))
                return field_item.getType();
            else
                return new NoType();
        } catch (ItemNotFoundException no_member) {
            try {
                MethodSymbolTableItem method_item = (MethodSymbolTableItem) class_table.getItem(MethodSymbolTableItem.START_KEY + member_name.getName(), true);
                return new FptrType(method_item.getArgTypes(), method_item.getReturnType());
            } catch (ItemNotFoundException no_method) {
                if(member_name.getName().equals(class_name)) {
                    return new FptrType(new ArrayList<>(), new VoidType());
                }
                else {
                    objectMemberAccess.addError(new MemberNotAvailableInClass(objectMemberAccess.getLine(), member_name.getName(), class_name));
                    return new NoType();
                }
            }
        }
    }

    public int get_number_of_defaults(ObjectMemberAccess objectMemberAccess) {
        Expression instance = objectMemberAccess.getInstance();
        Identifier member_name = objectMemberAccess.getMemberName();
        Type instance_type = instance.accept(this);

        String class_name = ((ClassType) instance_type).getClassName().getName();
        ClassSymbolTableItem class_item;
        SymbolTable class_table;
        try {
            class_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + class_name, true);
            class_table = class_item.getClassSymbolTable();
            try {
                MethodSymbolTableItem method_item = (MethodSymbolTableItem) class_table.getItem(MethodSymbolTableItem.START_KEY + member_name.getName(), true);
                MethodDeclaration method = method_item.getMethodDeclaration();
                int ret = 0;
                for (ArgPair arg_pair : method.getArgs()){
                    if (arg_pair.getDefaultValue() == null)
                        ret++;
                }
                return ret;
            } catch (ItemNotFoundException no_method) {
                if(member_name.getName().equals(class_name)) {
                    return 0;
                }
                else {
                    return 0;
                }
            }
        } catch (ItemNotFoundException e) {
            return 0;
        }
    }

    @Override
    public Type visit(SetNew setNew) {
        ArrayList<Expression> args = setNew.getArgs();
        boolean err = false;
        for (Expression exp : args) {
            Type tp = exp.accept(this);
            if (tp instanceof NoType)
                err = true;
            if (!(tp instanceof IntType))
            {
                setNew.addError(new NewInputNotSet(setNew.getLine()));
                return new NoType();
            }
        }
        if (err)
            return new NoType();
        return new SetType();
    }

    @Override
    public Type visit(SetInclude setInclude) {
        Expression instance = setInclude.getSetArg();
        Expression arg = setInclude.getElementArg();
        Type instance_type = instance.accept(this);
        Type arg_type = arg.accept(this);
        if (instance_type instanceof NoType)
            return new NoType();
        if (!(instance_type instanceof SetType)){
            return new NoType();
        }
        if (arg_type instanceof NoType)
            return new NoType();
        if (!(arg_type instanceof IntType)){
            setInclude.addError(new SetIncludeInputNotInt(setInclude.getLine()));
            return new NoType();
        }
        return new BoolType();
    }

    @Override
    public Type visit(RangeExpression rangeExpression) {
        Expression left = rangeExpression.getLeftExpression();
        Expression right = rangeExpression.getRightExpression();
        Type left_type = left.accept(this);
        Type right_type = right.accept(this);
        if (left_type instanceof NoType || right_type instanceof NoType)
            return new NoType();
        if (!(left_type instanceof IntType && right_type instanceof IntType)) {
            rangeExpression.addError(new EachRangeNotInt(rangeExpression.getLine()));
            return new NoType();
        }
        return new ArrayType(new IntType(), new ArrayList<Expression>());
    }

    @Override
    public Type visit(TernaryExpression ternaryExpression) {
        Expression cond = ternaryExpression.getCondition();
        Expression first = ternaryExpression.getTrueExpression();
        Expression second = ternaryExpression.getFalseExpression();
        Type cond_type = cond.accept(this);
        Type first_type = first.accept(this);
        Type second_type = second.accept(this);
        boolean err = cond_type instanceof NoType || first_type instanceof NoType || second_type instanceof NoType;

        if (is_subtype(cond_type, new BoolType())){
            if ((!(first_type instanceof NoType)) && (!(second_type instanceof NoType))) {
                if (!(is_subtype(first_type, second_type) && is_subtype(second_type, first_type))){
                    err = true;
                    ternaryExpression.addError(new UnsupportedOperandType(ternaryExpression.getLine(), TernaryOperator.ternary.name()));
                }
            }
        } else {
            err = true;
            ternaryExpression.addError(new UnsupportedOperandType(ternaryExpression.getLine(), TernaryOperator.ternary.name()));
        }
        if (err)
            return new NoType();
        if (!(first_type instanceof NoType))
            return first_type;
        return second_type;
    }

    @Override
    public Type visit(IntValue intValue) {
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        return new BoolType();
    }

    @Override
    public Type visit(SelfClass selfClass) {
        return new ClassType(curr_class.getClassName());
    }

    @Override
    public Type visit(SetValue setValue) {
        Type tp = setValue.accept(this);
        if (is_valid(tp, setValue))
            return tp;
        return new NoType();
    }

    @Override
    public Type visit(NullValue nullValue) {
        return new NullType();
    }
}