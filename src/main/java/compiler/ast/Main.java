package main.java.compiler.ast;

import main.java.compiler.ast.*;
import main.generated.main.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Choose input source - comment/uncomment as needed
        CharStream input;

        if (args.length > 0) {
            // Read from file if argument provided
            input = CharStreams.fromFileName(args[0]);
        } else {
            // Default to hardcoded example
            String coolCode = """
                class Main {
                    main() : Object {
                        out_string("Hello, World!\\n")
                    };
                };
                """;
            input = CharStreams.fromString(coolCode);
        }

        // Set up the lexer and parser
        COOLLexer lexer = new COOLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        COOLParser parser = new COOLParser(tokens);

        // Parse and build AST
        ParseTree tree = parser.program();
        ASTBuilder astBuilder = new ASTBuilder();
        ASTNode ast = astBuilder.visit(tree);

        // Print AST
        ASTPrinter printer = new ASTPrinter();
        ast.accept(printer);

        // Print the output
        System.out.println(printer.getOutput());
    }
}