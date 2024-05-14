package visitor.codeGenerator;

import ast.node.Program;
import ast.node.declaration.ArgDeclaration;
import ast.node.declaration.Declaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import ast.node.expression.values.IntValue;
import ast.node.statement.*;
import visitor.Visitor;

import java.io.*;
import java.util.ArrayList;


public class CodeGenerator extends Visitor<String> {
    private String Path;
    private FileWriter File;
    private  boolean StartMain;
    private FuncDeclaration FuncDec;
    private MainDeclaration Main;

    public  CodeGenerator(){
        this.StartMain = false;
        this.Path = "output/";
        this.CreateFolder();
    }
    private void CreateFolder() {

        String jasminPath = "utilities/jasmin.jar";

        try{
            File directory = new File(this.Path);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {//never reached

        }
        TransmitFile(jasminPath, this.Path + "jasmin.jar");
    }

    private void TransmitFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {//never reached
        }
    }

    private void CreateFile(String file_name) {
        try {
            String path = this.Path + file_name + ".j";
            File file = new File(path);
            file.createNewFile();
            this.File = new FileWriter(path);
        } catch (IOException e) {//never reached
        }
    }

    private void AddCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.File.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.File.write(command + "\n");
            else
                this.File.write("\t\t" + command + "\n");
            this.File.flush();
        } catch (IOException e) {//never reached

        }
    }

    private void AddFuncHeader(String name, String sig,boolean is_static, boolean is_public){
        if (is_static) {
            if (is_public){
                AddCommand(".method public static " + name + sig);
            }
            else{
                AddCommand(".method static " + name + sig);
            }
        }
        else{
            if (is_public){
                AddCommand(".method public " + name + sig);
            }
            else{
                AddCommand(".method " + name + sig);
            }
        }
        AddCommand(".limit stack 128");
        AddCommand(".limit locals 128");
    }

    private boolean IsNeedSpace(int slot) {
        if ((slot <= 3) && (slot >= 0))
            return  false;
        else
            return true;
    }
    private int SlotOfFunc(String name){
        if (StartMain)
            return SlotOfMain(name);

        int count = 1;
        for(ArgDeclaration arg : FuncDec.getArgs()){
            if(arg.getIdentifier().getName().equals(name))
                return count;
            count++;
        }
        for(Statement stmt : FuncDec.getStatements())
        {
            if (stmt instanceof VarDecStmt) {
                if (((VarDecStmt) stmt).getIdentifier().getName().equals(name))
                    return count;
                count++;
            }
        }

        return -1;
    }
    private int SlotOfMain(String name){
        int count = 1;

        for(Statement stmt : Main.getMainStatements())
        {
            if (stmt instanceof VarDecStmt)
                if (((VarDecStmt) stmt).getIdentifier().getName().equals(name))
                    return count;
            count++;
        }

        return -1;
    }
    private void PrintStore(int slot){
        boolean is_need_space = IsNeedSpace(slot);
        if (is_need_space)
            AddCommand("istore " + slot);
        else
            AddCommand("istore_" + slot);
    }

    private void PrintLoad(int slot){
        boolean is_need_space = IsNeedSpace(slot);
        if (is_need_space)
            AddCommand("iload " + slot);
        else
            AddCommand("iload_" + slot);
    }

    @Override
    public String visit(Program program) {
        this.CreateFile("Main");
        AddCommand(".class public Main");
        AddCommand(".super java/lang/Object");

        for (FuncDeclaration functionDec : program.getFuncs())
            functionDec.accept(this);

        this.Main = program.getMain();
        this.StartMain = true;
        this.Main.accept(this);

        return null;
    }

    @Override
    public String visit(FuncDeclaration funcDec) {
        AddFuncHeader(funcDec.getName().getName(), "()I", true, false);
        this.FuncDec = funcDec;

        for(var stmt : funcDec.getStatements()) {
            stmt.accept(this);
        }
        AddCommand(".end method");

        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration)
    {
        AddFuncHeader("main([Ljava/lang/String;)", "V", true, true);

        for (var stmt : mainDeclaration.getMainStatements()) {
            if (stmt != null)
                stmt.accept(this);
        }

        AddCommand("return");
        AddCommand(".end method");
        return null;
    }

    public String visit(FunctionCall functionCall)
    {
        String FuncName = functionCall.getUFuncName().getName();
        AddCommand("invokestatic Main/" + FuncName + "()I");
        return null;
    }

    @Override
    public String visit(VarDecStmt varDec) {
        varDec.getInitialExpression().accept(this);
        int slot = SlotOfFunc(varDec.getIdentifier().getName().toString());
        PrintStore(slot);

        return null;
    }

    @Override
    public String visit(AssignStmt varDec) {
        varDec.getRValue().accept(this);
        int slot = SlotOfFunc(((Variable)varDec.getLValue()).getName());
        PrintStore(slot);

        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression)
    {
        UnaryOperator operator = unaryExpression.getUnaryOperator();
        unaryExpression.getOperand().accept(this);
        if (operator == UnaryOperator.minus)
            AddCommand("ineg");
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression)
    {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        if ((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);
            return null;
        }

        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);

        if (operator == BinaryOperator.add)
        {
            AddCommand("iadd");
        } else if (operator == BinaryOperator.sub)
        {
            AddCommand("isub");
        } else if (operator == BinaryOperator.mult)
        {
            AddCommand("imul");
        } else if (operator == BinaryOperator.div)
        {
            AddCommand("idiv");
        }else if (operator == BinaryOperator.mod)
        {
            AddCommand("irem");
        }


        return null;
    }

    @Override
    public String visit(Identifier identifier) {

        int slot = SlotOfFunc(identifier.getName().toString());
        PrintLoad(slot);

        return null;
    }

    @Override
    public String visit(PrintStmt printStmt) {
        AddCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        printStmt.getArg().accept(this);
        AddCommand("invokevirtual java/io/PrintStream/println(I)V");
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        returnStmt.getExpression().accept(this);
        AddCommand("ireturn");
        return null;
    }

    @Override
    public String visit(IntValue value)
    {
        int constant = value.getConstant();
        if ((constant <= 5) && (constant >= 0))
            AddCommand("iconst_" + constant);
        else
            AddCommand("bipush " + constant);

        return null;
    }
}
