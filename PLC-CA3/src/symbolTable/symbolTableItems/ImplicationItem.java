package symbolTable.symbolTableItems;

import ast.node.declaration.ArgDeclaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.statement.ForloopStmt;
import ast.node.statement.ImplicationStmt;
import symbolTable.SymbolTable;

import java.util.ArrayList;

public class ImplicationItem extends SymbolTableItem{
    protected SymbolTable implicationSymbolTable;
    protected ImplicationStmt implicationStmt;
    public static final String STARTKEY = "Implication_";

    public ImplicationItem(String name) {
        this.name = name;
    }

    public ImplicationItem(ImplicationStmt implicationStmt)
    {
        this.name = implicationStmt.toString();
        this.implicationStmt = implicationStmt;
    }
    public Void setImplicationSymbolTable(SymbolTable implicationSymbolTable) {
        this.implicationSymbolTable = implicationSymbolTable;
        return null;
    }
    public SymbolTable getImplicationSymbolTableTable()
    {
        return this.implicationSymbolTable;
    }

    @Override
    public String getKey() {
        return ImplicationItem.STARTKEY + this.name;
    }
}
