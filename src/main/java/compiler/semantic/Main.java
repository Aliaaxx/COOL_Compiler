package main.java.compiler.semantic;

import main.java.compiler.ast.*;
import main.generated.main.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import main.java.compiler.ast.*;

import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Choose input source
            CharStream input;
            String sourceName;

            if (args.length > 0) {
                // Read from file
                Path path = Paths.get(args[0]);
                input = CharStreams.fromPath(path);
                sourceName = path.getFileName().toString();
            } else {
                // Default test case
                /*
                String testProgram = """
                class Main {
                    main() : Object {
                        if true then
                            out_string("Hello")
                        else
                            out_string("World")
                        fi;
                    };
                };
                """;*/

                /*
                String testProgram = """
                class Main {
                    main() : Object {
                        out_string("Hello, World!\\n")
                    };
                };
                """;

                 */
                String testProgram = """
             
                    
                    main() : Object {
                        {
                            if x <= 100 then
                                out_string("Small number\\n")
                            else
                                out_string("Large number\\n")
                            fi;
                            
                            let y : Int <- double(x) in {
                                out_int(y);
                                out_string("\\n");
                            };
                        }
                    };
                };
                """;
                input = CharStreams.fromString(testProgram);
                sourceName = "test_case.cl";
            }

            // 2. Run lexer and parser
            COOLLexer lexer = new COOLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            COOLParser parser = new COOLParser(tokens);
            ParseTree tree = parser.program();

            // 3. Build AST
            ASTBuilder astBuilder = new ASTBuilder();
            ASTNode ast = astBuilder.visit(tree);

            // 4. Semantic analysis
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            analyzer.analyze(ast, sourceName);

            // 5. Print results
            if (analyzer.hasErrors()) {
                System.err.println("=== Semantic Errors ===");
                //analyzer.getErrors().forEach(System.err::println);
                System.exit(1);
            } else {
                System.out.println("Semantic analysis passed!");
                System.exit(0);
            }

        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
