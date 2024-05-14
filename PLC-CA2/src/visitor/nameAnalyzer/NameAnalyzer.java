package visitor.nameAnalyzer;

import ast.node.Program;
import ast.node.declaration.*;
import ast.node.statement.*;
import compileError.*;
import compileError.Name.*;
import symbolTable.SymbolTable;
import symbolTable.symbolTableItems.*;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        for (FuncDeclaration functionDeclaration : program.getFuncs()) {
            functionDeclaration.accept(this);
        }

        SymbolTable.push(new SymbolTable());
        for (var stmt : program.getMain().getMainStatements()) {
                stmt.accept(this);
        }
        SymbolTable.pop();;
        return null;
    }

    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        var functionItem = new FunctionItem(funcDeclaration);
        var functionSymbolTable = new SymbolTable(SymbolTable.top, funcDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(functionSymbolTable);

        // To Do
        try {
            SymbolTable.root.put(functionItem);
        } catch (ItemAlreadyExistsException var7) {
            FunctionRedefinition error = new FunctionRedefinition(funcDeclaration.getLine(), funcDeclaration.getName().getName());
            this.nameErrors.add(error);
        }

        SymbolTable.push(new SymbolTable());
        for (ArgDeclaration varDeclaration : funcDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }

        for (var stmt : funcDeclaration.getStatements()) {
            stmt.accept(this);
        }
        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(ArgDeclaration argDec) {
        VariableItem variableItem = new VariableItem(argDec.getIdentifier().getName(), argDec.getType());

        try {
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExistsException var5) {
            VariableRedefinition error = new VariableRedefinition(argDec.getLine(), argDec.getIdentifier().getName());
            this.nameErrors.add(error);
        }

        return null;
    }

    @Override
    public Void visit(VarDecStmt varDeclaration) {
        var variableItem = new VariableItem(varDeclaration.getIdentifier().getName(), varDeclaration.getType());

        // To Do
        try {
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExistsException var5) {
            VariableRedefinition error = new VariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName());
            this.nameErrors.add(error);
        }
        return null;
    }

    @Override
    public Void visit(ArrayDecStmt arrDec) {
        ArrayItem arrayItem = new ArrayItem(arrDec);

        try {
            SymbolTable.top.put(arrayItem);
        } catch (ItemAlreadyExistsException var5) {
            VariableRedefinition error = new VariableRedefinition(arrDec.getLine(), arrDec.getIdentifier().getName());
            this.nameErrors.add(error);
        }

        return null;
    }

    @Override
    public Void visit(ImplicationStmt imp) {
        for (Statement stmt: imp.getStatements())
            if (stmt != null) {
                if (stmt instanceof VarDecStmt) {
                    stmt.accept(this);
                }
            }
        return null;
    }

    @Override
    public Void visit(ForloopStmt forStmt) {
        SymbolTable.push(new SymbolTable());
        for (Statement stmt: forStmt.getStatements())
            if (stmt != null) {
                if (stmt instanceof VarDecStmt) {
                    stmt.accept(this);
                }
            }
        SymbolTable.pop();
        return null;
    }

}
