import java.io.*;

import ast.node.Program;
import compileError.CompileError;
import main.grammar.LogicPLLexer;
import main.grammar.LogicPLParser;
import visitor.codeGenerator.CodeGenerator;
import visitor.nameAnalyzer.NameAnalyzer;
import visitor.astPrinter.ASTPrinter;
import org.antlr.v4.runtime.*;
import visitor.typeAnalyzer.TypeAnalyzer;

public class Main {
        public static void main(String[] args) throws java.io.IOException {

            CharStream reader = CharStreams.fromFileName(args[0]);
            LogicPLLexer lexer = new LogicPLLexer(reader);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LogicPLParser parser = new LogicPLParser(tokens);
            Program program = parser.program().p;


            NameAnalyzer nameAnalyzer = new NameAnalyzer();
            nameAnalyzer.visit(program);

            TypeAnalyzer typeAnalyzer = new TypeAnalyzer();
            typeAnalyzer.visit(program);
            if (typeAnalyzer.typeErrors.size() > 0){
                for(CompileError compileError: typeAnalyzer.typeErrors)
                    System.out.println(compileError.getMessage());
                System.out.println("We Have Compile Error, So we Dont Generate Bytecode!! \n");
                return;
            }

            CodeGenerator codeGenerator = new CodeGenerator();
            codeGenerator.visit(program);

            System.out.println("Compilation was Successful!!");

            runJasminFiles();
        }
    private static void runJasminFiles() {
        try {
            System.out.println("\n-----------------Generating Class Files-----------------");
            File dir = new File("./output");
            Process process = Runtime.getRuntime().exec("java -jar jasmin.jar *.j", null, dir);
            printResults(process.getInputStream());
            printResults(process.getErrorStream());
            System.out.println("\n-------------------------Output-------------------------");
            process = Runtime.getRuntime().exec("java Main", null, dir);
            printResults(process.getInputStream());
            printResults(process.getErrorStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printResults(InputStream stream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;
        try {
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}