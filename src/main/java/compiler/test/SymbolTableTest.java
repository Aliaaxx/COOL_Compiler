/*
package main.java.compiler.test;
import main.java.compiler.semantic.COOLBaseListener;
import main.java.compiler.semantic.SymbolTable;

import main.generated.main.antlr.COOLParser;
import main.generated.main.antlr.COOLParser.*;

public class SymbolTableTest {
    public static void main(String[] args) {
        /*
        SymbolTable symbolTable = new SymbolTable();

        // Test basic functionality
        symbolTable.enterScope("Global");
        symbolTable.addSymbol("x", "Int");
        symbolTable.addSymbol("main", "Object");

        symbolTable.enterScope("Main");
        symbolTable.addSymbol("y", "String");

        symbolTable.printSymbolTable();

        // Test lookup
        SymbolTable.SymbolEntry entry = symbolTable.lookup("x");
        System.out.println("\nLookup result for 'x': " +
                (entry != null ? entry.type : "Not found"));
        */
/*
        SymbolTable symbolTable = new SymbolTable();

        // Global scope (automatically created)
        symbolTable.addSymbol("print", "IO"); // Built-in function

        // Main class scope
        symbolTable.enterScope("Main");
        symbolTable.addSymbol("x", "Int");
        symbolTable.addSymbol("main", "Object");

        // Method scope
        symbolTable.enterScope("main_method");
        symbolTable.addSymbol("y", "String");

        symbolTable.printSymbolTable();

        // Test lookups
        testLookup(symbolTable, "x");     // Should find in Main
        testLookup(symbolTable, "y");     // Should find in main_method
        testLookup(symbolTable, "print"); // Should find in global
        testLookup(symbolTable, "missing"); // Should not find
    }

    private static void testLookup(SymbolTable st, String name) {
        SymbolTable.SymbolEntry entry = st.lookup(name);
        System.out.printf("Lookup '%s': %s\n",
                name,
                entry != null ? "Found as " + entry.type : "Not found");
    }
}
*/