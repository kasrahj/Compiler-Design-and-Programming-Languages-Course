package visitor.typeAnalyzer;

import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import ast.node.expression.values.BooleanValue;
import ast.node.expression.values.FloatValue;
import ast.node.expression.values.IntValue;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import ast.type.primitiveType.FloatType;
import ast.type.primitiveType.IntType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.VarNotDeclared;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.*;
import visitor.Visitor;

import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors;
    public ExpressionTypeChecker(ArrayList<CompileError> typeErrors){
        this.typeErrors = typeErrors;
    }

    public boolean sameType(Type el1, Type el2){
        if (el1 instanceof IntType && el2 instanceof IntType)
            return true;
        if (el1 instanceof FloatType && el2 instanceof FloatType)
            return true;
        if (el1 instanceof BooleanType && el2 instanceof BooleanType)
            return true;
        return false;
    }

    public boolean isLvalue(Expression expr){
        boolean res = expr instanceof Variable;
        return res;
    }


    @Override
    public Type visit(UnaryExpression unaryExpression) {

        Expression uExpr = unaryExpression.getOperand();
        Type expType = uExpr.accept(this);
        UnaryOperator operator = unaryExpression.getUnaryOperator();
        if(expType instanceof NoType)
            return new NoType();

        if(operator.equals(UnaryOperator.plus) || operator.equals(UnaryOperator.minus))
            if(expType instanceof BooleanType)
            {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                return new NoType();
            }

            else if(operator.equals(UnaryOperator.not)) {
                if (!(expType instanceof BooleanType)) {
                    typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                    return new NoType();
                }
                return new BooleanType();
            }
        if(expType instanceof IntType)
            return new IntType();

        return new FloatType();

    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type tl = binaryExpression.getLeft().accept(this);
        Type tr = binaryExpression.getRight().accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();

        if(operator.equals(BinaryOperator.eq) ||
                operator.equals(BinaryOperator.neq)  ||
                operator.equals(BinaryOperator.gt)  ||
                operator.equals(BinaryOperator.lt)  ||
                operator.equals(BinaryOperator.gte)  ||
                operator.equals(BinaryOperator.lte) ) {
            if (tl instanceof NoType || tr instanceof NoType)
                return new NoType();
            if (sameType(tl, tr)) {
                return new BooleanType();
            }
        }
        if(operator.equals(BinaryOperator.and)  || operator.equals(BinaryOperator.or) ) {
            if (tl instanceof NoType || tr instanceof NoType)
                return new NoType();
            if (tl instanceof BooleanType && tr instanceof BooleanType)
                return new BooleanType();
        }
        if(operator.equals(BinaryOperator.add)  ||
                operator.equals(BinaryOperator.mod)  ||
                operator.equals(BinaryOperator.mult) ||
                operator.equals(BinaryOperator.sub)  ||
                operator.equals(BinaryOperator.div)) {
            if (tl instanceof NoType || tr instanceof NoType)
                return new NoType();
            if (tl instanceof IntType && tr instanceof IntType)
                return new IntType();
            if (tl instanceof FloatType && tr instanceof FloatType)
                return new FloatType();
        }
        typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.name()));
        return new NoType();
    }

    @Override
    public Type visit(ArrayAccess arrayAccess) {
        try {
            if(SymbolTable.top.get(ArrayItem.STARTKEY + arrayAccess.getName()) instanceof ArrayItem) {
                ArrayItem array = (ArrayItem) SymbolTable.top.get(ArrayItem.STARTKEY + arrayAccess.getName());
                return array.getType();
            }
            else if(SymbolTable.top.get(ArrayItem.STARTKEY + arrayAccess.getName()) instanceof VariableItem) {
                VariableItem array = (VariableItem) SymbolTable.top.get(ArrayItem.STARTKEY + arrayAccess.getName());
                return array.getType();
            }
        } catch (ItemNotFoundException e) {
            typeErrors.add(new VarNotDeclared(arrayAccess.getLine(), arrayAccess.getName()));
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            if(SymbolTable.top.get(ArrayItem.STARTKEY + identifier.getName()) instanceof ArrayItem) {
                ArrayItem array = (ArrayItem) SymbolTable.top.get(ArrayItem.STARTKEY + identifier.getName());
                return array.getType();
            }
            else if(SymbolTable.top.get(ArrayItem.STARTKEY + identifier.getName()) instanceof VariableItem) {
                VariableItem array = (VariableItem) SymbolTable.top.get(ArrayItem.STARTKEY + identifier.getName());
                return array.getType();
            }
        } catch (ItemNotFoundException e) {
            typeErrors.add(new VarNotDeclared(identifier.getLine(), identifier.getName()));
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(FunctionCall functionCall) {
        try {
            var function = (FunctionItem) SymbolTable.top.get(FunctionItem.STARTKEY + functionCall.getUFuncName().getName());
            for(Expression expression : functionCall.getArgs())
                expression.accept(this);
            return function.getHandlerDeclaration().getType();
        } catch (ItemNotFoundException e) {
            typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.getUFuncName().getName()));
            for(Expression expression : functionCall.getArgs())
                expression.accept(this);
            return new NoType();
        }
    }

    @Override
    public Type visit(IntValue value) {
        return new IntType();
    }

    @Override
    public Type visit(FloatType value) {
        return new FloatType();
    }

    @Override
    public Type visit(BooleanType value) {
        return new BooleanType();
    }

    @Override
    public Type visit(IntType value) {return new IntType();}

    @Override
    public Type visit(FloatValue value) {return new FloatType();}

    @Override
    public Type visit(BooleanValue value) {return new BooleanType();}

    @Override
    public Type visit(QueryExpression queryExpression) {
        if(queryExpression.getVar() == null)
            return new NoType();

        queryExpression.getVar().accept(this);
        return new BooleanType();
    }
}
