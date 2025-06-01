/*

package main.java.compiler.test;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import main.generated.main.antlr.*;

public class TreeInspector {
    public static void main(String[] args) throws Exception {
        // Sample COOL program
        String coolCode = """
            class Main {
                main() : Int {
                    3 * (4 + 5)
                };
            };
            """;

        // Set up the lexer and parser
        CharStream input = CharStreams.fromString(coolCode);
        COOLLexer lexer = new COOLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        COOLParser parser = new COOLParser(tokens);

        // Get the parse tree (start from 'program' rule)
        ParseTree tree = parser.program();

        // Display the tree graphically
        Trees.inspect(tree, parser);

        // Alternative: Print as text
        System.out.println("Textual tree representation:");
        System.out.println(tree.toStringTree(parser));
    }
}
*/