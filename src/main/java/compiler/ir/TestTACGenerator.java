package main.java.compiler.ir;


import main.generated.main.antlr.COOLLexer;
import main.generated.main.antlr.COOLParser;
import main.java.compiler.ast.*;
import main.java.compiler.semantic.SemanticAnalyzer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;
public class TestTACGenerator {
    public static void main(String[] args) {
            try {

                String input = """
                                class Main {
                                    main() : INT {
                                        let x : Int <- 5,\s
                                            y : Int <- 10
                                        in {
                                            if x < y then
                                                x + y
                                            else
                                                x * y
                                            fi;
                                        }
                                    };
                                };
                        """;
                COOLLexer lexer = new COOLLexer(CharStreams.fromString(input));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                COOLParser parser = new COOLParser(tokens);
                ParseTree tree = parser.program();

                // 3. Build AST
                ASTBuilder astBuilder = new ASTBuilder();
                ASTNode ast = astBuilder.visit(tree);

                // 4. Semantic analysis
                //SemanticAnalyzer analyzer = new SemanticAnalyzer();
                //analyzer.analyze(ast, "test_case.cl");

                // Generate IR
                IRGenerator irGenerator = new IRGenerator();
                Map<String, TACFunction> ir = irGenerator.generate(ast);

                // Print generated IR
                for (TACFunction func : ir.values()) {
                    System.out.println("\nFunction: " + func.name);
                    for (TACInstruction instr : func.instructions) {
                        System.out.println(instr);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }