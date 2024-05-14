package visitor.astPrinter;

import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.Program;
import ast.node.declaration.ArgDeclaration;
import ast.node.expression.*;
import ast.node.expression.values.*;
import ast.node.statement.*;
import visitor.Visitor;

public class ASTPrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (FuncDeclaration funcDeclaration : program.getFuncs())
            if (funcDeclaration != null) {
                funcDeclaration.accept(this);
            }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        messagePrinter(mainDeclaration.getLine(), mainDeclaration.toString());
        for (Statement statement: mainDeclaration.getMainStatements())
            if (statement != null) {
                statement.accept(this);
            }
        return null;
    }

    @Override
    public Void visit(ArgDeclaration argDeclaration) {
        messagePrinter(argDeclaration.getLine(), argDeclaration.toString());
        if (argDeclaration.getIdentifier() != null)
            argDeclaration.getIdentifier().accept(this);
        return null;
    }

    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        // ToDo
        messagePrinter(funcDeclaration.getLine(), funcDeclaration.toString());
        if (funcDeclaration.getIdentifier() != null) {
            funcDeclaration.getIdentifier().accept(this);
        }

        for (ArgDeclaration argDec: funcDeclaration.getArgs())
            if (argDec != null) {
                argDec.accept(this);
            }

        for (Statement statement: funcDeclaration.getStatements())
            if (statement != null) {
                statement.accept(this);
            }

        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        // ToDo
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        if (unaryExpression.getOperand() != null) {
            unaryExpression.getOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        // ToDo
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());

        if (binaryExpression.getLeft() != null) {
            binaryExpression.getLeft().accept(this);
        }

        if (binaryExpression.getRight() != null) {
            binaryExpression.getRight().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        // ToDo
        messagePrinter(identifier.getLine(), identifier.toString());

        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess) {
        // ToDo
        messagePrinter(arrayAccess.getLine(), arrayAccess.toString());

        if (arrayAccess.getIndex() != null) {
            arrayAccess.getIndex().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        // ToDo
        messagePrinter(functionCall.getLine(), functionCall.toString());

        if (functionCall.getUFuncName() != null) {
            functionCall.getUFuncName().accept(this);
        }

        for (Expression expr: functionCall.getArgs())
            if (expr != null) {
                expr.accept(this);
            }

        return null;
    }

    @Override
    public Void visit(QueryExpression queryExpression) {
        // ToDo
        messagePrinter(queryExpression.getLine(), queryExpression.toString());

        if (queryExpression.getPredicateName() != null) {
            queryExpression.getPredicateName().accept(this);
        }

        if (queryExpression.getVar() != null) {
            queryExpression.getVar().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(IntValue value) {
        // ToDo
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(FloatValue value) {
        // ToDo
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(BooleanValue value) {
        // ToDo
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(ArrayDecStmt arrayDecStmt) {
        // ToDo
        messagePrinter(arrayDecStmt.getLine(), arrayDecStmt.toString());

        if (arrayDecStmt.getIdentifier() != null) {
            arrayDecStmt.getIdentifier().accept(this);
        }

        for (Expression expr: arrayDecStmt.getInitialValues())
            if (expr != null) {
                expr.accept(this);
            }

        return null;
    }

    @Override
    public Void visit(ForloopStmt forloopStmt) {
        // ToDo
        messagePrinter(forloopStmt.getLine(), forloopStmt.toString());

        if (forloopStmt.getIterator() != null) {
            forloopStmt.getIterator().accept(this);
        }

        if (forloopStmt.getArrayName() != null) {
            forloopStmt.getArrayName().accept(this);
        }

        for (Statement stmt: forloopStmt.getStatements())
            if (stmt != null) {
                stmt.accept(this);
            }

        return null;
    }

    @Override
    public Void visit(ImplicationStmt implicationStmt) {
        // ToDo
        messagePrinter(implicationStmt.getLine(), implicationStmt.toString());

        if (implicationStmt.getCondition() != null) {
            implicationStmt.getCondition().accept(this);
        }

        for (Statement stmt: implicationStmt.getStatements())
            if (stmt != null) {
                stmt.accept(this);
            }

        return null;
    }

    @Override
    public Void visit(PredicateStmt predicateStmt) {
        // ToDo
        messagePrinter(predicateStmt.getLine(), predicateStmt.toString());

        if (predicateStmt.getIdentifier() != null) {
            predicateStmt.getIdentifier().accept(this);
        }

        if (predicateStmt.getVar() != null) {
            predicateStmt.getVar().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        // ToDo
        messagePrinter(returnStmt.getLine(), returnStmt.toString());

        if (returnStmt.getExpression() != null) {
            returnStmt.getExpression().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        // ToDo
        messagePrinter(varDecStmt.getLine(), varDecStmt.toString());
        if (varDecStmt.getIdentifier() != null) {
            varDecStmt.getIdentifier().accept(this);
        }

        if (varDecStmt.getInitialExpression() != null) {
            varDecStmt.getInitialExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(PrintStmt printStmt) {
        // ToDo
        messagePrinter(printStmt.getLine(), printStmt.toString());

        if (printStmt.getArg() != null) {
            printStmt.getArg().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        // ToDo
        messagePrinter(assignStmt.getLine(), assignStmt.toString());

        if (assignStmt.getLValue() != null) {
            assignStmt.getLValue().accept(this);
        }

        if (assignStmt.getRValue() != null) {
            assignStmt.getRValue().accept(this);
        }

        return null;
    }

}

