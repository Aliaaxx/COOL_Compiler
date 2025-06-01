/*
package main.java.compiler.test;

import main.generated.main.antlr.COOLLexer;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class LexerTest {
    public static void main(String[] args) throws Exception {
        // Path adjusted to read from resources
        //CharStream input = CharStreams.fromFileName("src/main/resources/testParser.cl");

        //COOLLexer lexer = new COOLLexer(input);
        String input = "3 * (4 + 5 * 6) + -7 / 8";
        COOLLexer lexer = new COOLLexer(CharStreams.fromString(input));
        // Print all tokens
        for (Token token : lexer.getAllTokens()) {
            System.out.printf("%-20s '%s'\n",
                    COOLLexer.VOCABULARY.getSymbolicName(token.getType()),
                    token.getText().replace("\n", "\\n"));
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //COOLLexer parser = new COOLLexer(tokens);
       // ParseTree Ptree = parser.exp();

        // Display parse tree GUI
        //Trees.inspect(Ptree, parser);
    }
}
*/