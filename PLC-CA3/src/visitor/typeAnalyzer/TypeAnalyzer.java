package visitor.typeAnalyzer;

import ast.node.Program;
import ast.node.declaration.ArgDeclaration;
import ast.node.declaration.Declaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.Expression;
import ast.node.expression.FunctionCall;
import ast.node.expression.Identifier;
import ast.node.expression.operators.BinaryOperator;
import ast.node.statement.*;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.LeftSideNotLValue;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.ConditionTypeNotBool;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.*;
import visitor.Visitor;

import java.lang.Object;
import java.util.ArrayList;

public class TypeAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    @Override
    public Void visit(Program program) {
        for(var functionDec : program.getFuncs()) {
            functionDec.accept(this);
        }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        try {
            FunctionItem functionItem = (FunctionItem)  SymbolTable.root.get(FunctionItem.STARTKEY + funcDeclaration.getName().getName());
            SymbolTable.push((functionItem.getFunctionSymbolTable()));
        } catch (ItemNotFoundException e) {
            //unreachable
        }
        for(var argument: funcDeclaration.getArgs())
        {
            argument.accept(this);
        }
        for(var stmt : funcDeclaration.getStatements()) {
            stmt.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        MainItem mainItem = new MainItem(mainDeclaration);
        SymbolTable mainsymtable = new SymbolTable(SymbolTable.top, "main");
        mainItem.setMainItemSymbolTable(mainsymtable);
        SymbolTable.push(mainItem.getMainItemSymbolTable());
//        try {
//            MainItem functionItem = (MainItem)  SymbolTable.root.get("main");
//            SymbolTable.push((functionItem.getMainItemSymbolTable()));
//        } catch (ItemNotFoundException e) {
//            //unreachable
//        }

        for (var stmt : mainDeclaration.getMainStatements()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ForloopStmt forloopStmt) {
        ForLoopItem forLoopItem = new ForLoopItem(forloopStmt);
        forLoopItem.setForLoopSymbolTable(new SymbolTable(SymbolTable.top, forloopStmt.toString()));
        SymbolTable.push(forLoopItem.getForLoopSymbolTable());
        Type forlooparray = forloopStmt.getArrayName().accept(expressionTypeChecker);
        var forloopvar = new VariableItem(forloopStmt.getIterator().getName(), forlooparray);
        try {
            SymbolTable.top.put(forloopvar);}
        catch (ItemAlreadyExistsException e) {
        }

        for(Statement stmt : forloopStmt.getStatements()) {
            stmt.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

//    @Override
//    public Void visit(ForloopStmt forloopStmt) {
//
//        Type arrayItemType = forloopStmt.getArrayName().accept(expressionTypeChecker);
//
//        ForLoopItem forLoopItem = new ForLoopItem(forloopStmt);
//
//        SymbolTable.push(SymbolTable.top);
//
//        VariableItem forItVar = new VariableItem(forloopStmt.getIterator().getName(), arrayItemType);
//        try {
//            SymbolTable.top.put(forItVar);
//        } catch (ItemAlreadyExistsException e) {
//
//        }
//        for(Statement stmt : forloopStmt.getStatements()) {
//            stmt.accept(this);
//        }
//
//        SymbolTable.pop();
//        SymbolTable.pop(); // we pop 2 times to change the top to the previous top
//        SymbolTable.push(SymbolTable.top); // .top equals previous top therefore we push it once again
//
//        return null;
//    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        Type tl = assignStmt.getLValue().accept(expressionTypeChecker);
        Type tr = assignStmt.getRValue().accept(expressionTypeChecker);
        if(!expressionTypeChecker.sameType(tl, tr) && !(tl instanceof NoType || tr instanceof NoType))
            typeErrors.add(new UnsupportedOperandType(assignStmt.getLine(), BinaryOperator.assign.name()));
        return null;
    }


    @Override
    public  Void visit(ArgDeclaration argDeclaration)
    {
//        try {
//            VariableItem variableItem = (VariableItem) SymbolTable.top.get(VariableItem.STARTKEY + argDeclaration.getIdentifier().getName());
//            try {
//                SymbolTable.top.put(variableItem);
//            } catch (ItemAlreadyExistsException e) {
//                // not this phase
//            }
//        } catch(ItemNotFoundException e)
//        {
//        }
        return null;
    }

    @Override
    public Void visit(ImplicationStmt implicationStmt) {
        Type condition = implicationStmt.getCondition().accept(expressionTypeChecker);
        if(!(condition instanceof BooleanType || condition instanceof NoType)) { // + condition for notype condition error relaxation
            typeErrors.add(new ConditionTypeNotBool(implicationStmt.getLine()));
        }
        SymbolTable impsymboltable = new SymbolTable(SymbolTable.top, implicationStmt.toString());
        SymbolTable.push(impsymboltable);

        for (Statement s : implicationStmt.getStatements()) {
            s.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        Type vartype = varDecStmt.getType();
        if(varDecStmt.getInitialExpression() != null) {
            Type expression = varDecStmt.getInitialExpression().accept(expressionTypeChecker);
            if(expression instanceof NoType)
                return  null;
            if(!expressionTypeChecker.sameType(expression,vartype)) {
                typeErrors.add(new UnsupportedOperandType(varDecStmt.getLine(), BinaryOperator.assign.name()));
            }
        }
        try {
            SymbolTable.top.put(new VariableItem(varDecStmt.getIdentifier().getName(), varDecStmt.getType()));
        } catch (ItemAlreadyExistsException e) {
        }
        return null;
    }

    @Override
    public Void visit(PrintStmt printStmt) {
        printStmt.getArg().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        if(returnStmt.getExpression() != null) {
            returnStmt.getExpression().accept(expressionTypeChecker);
        }
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        try {
            SymbolTable.root.get(FunctionItem.STARTKEY + functionCall.getUFuncName().getName());
        } catch (ItemNotFoundException e) {
            typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.toString()));
        }
        return null;
    }

    @Override
    public Void visit(ArrayDecStmt arrayDecStmt) {
        Type arraytype = arrayDecStmt.getType();
        for(Expression e: arrayDecStmt.getInitialValues())
        {
            Type exprtype = e.accept(expressionTypeChecker);
            if(!expressionTypeChecker.sameType(arraytype,exprtype))
                typeErrors.add(new UnsupportedOperandType(arrayDecStmt.getLine(), BinaryOperator.assign.name()));
        }
        try {
            SymbolTable.top.put(new ArrayItem(arrayDecStmt.getIdentifier().getName(), arrayDecStmt.getType()));
        } catch (ItemAlreadyExistsException e) {
        }
        return null;
    }
}
