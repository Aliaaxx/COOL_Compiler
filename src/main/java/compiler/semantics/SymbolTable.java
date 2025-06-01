/*
package main.java.compiler.semantics;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

/*
public class SymbolTable {
    private Stack<HashMap<String, SymbolEntry>> scopes = new Stack<>();

    public SymbolTable() {
        enterScope("global"); // Initialize with global scope
    }

    public static class SymbolEntry {
        public final String name;
        public final String type;
        public final int scopeLevel;

        public SymbolEntry(String name, String type, int scopeLevel) {
            this.name = name;
            this.type = type;
            this.scopeLevel = scopeLevel;
        }
    }

    public void enterScope(String scopeName) {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        if (scopes.size() > 1) {
            scopes.pop();
        }
    }

    public boolean addSymbol(String name, String type) {
        if (scopes.peek().containsKey(name)) {
            return false; // Symbol already exists
        }
        scopes.peek().put(name, new SymbolEntry(name, type, scopes.size() - 1));
        return true;
    }

    public SymbolEntry lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null;
    }

    public void printSymbolTable() {
        System.out.println("===== SYMBOL TABLE =====");
        for (int i = 0; i < scopes.size(); i++) {
            System.out.println("Scope #" + i + ":");
            for (HashMap.Entry<String, SymbolEntry> entry : scopes.get(i).entrySet()) {
                SymbolEntry symbol = entry.getValue();
                System.out.printf("  %-15s : %-10s (scope level %d)\n",
                        symbol.name, symbol.type, symbol.scopeLevel);
            }
        }
        System.out.println("=======================");
    }
}

 */
/*
public class SymbolTable {
    private Stack<Scope> scopes = new Stack<>();

    public static class Scope {
        public String name;
        public Map<String, SymbolEntry> symbols = new HashMap<>();

        public Scope(String name) {
            this.name = name;
        }
    }

    public static class SymbolEntry {
        public final String name;
        public final String type;

        public SymbolEntry(String name, String type) {
            this.name = name;
            this.type = type;
        }
    }

    public SymbolTable() {
        enterScope("global"); // Initialize with global scope
    }

    public void enterScope(String scopeName) {
        scopes.push(new Scope(scopeName));
    }

    public void exitScope() {
        if (scopes.size() > 1) {
            scopes.pop();
        }
    }

    public boolean addSymbol(String name, String type) {
        if (scopes.peek().symbols.containsKey(name)) {
            return false;
        }
        scopes.peek().symbols.put(name, new SymbolEntry(name, type));
        return true;
    }

    public SymbolEntry lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).symbols.containsKey(name)) {
                return scopes.get(i).symbols.get(name);
            }
        }
        return null;
    }

    public void printSymbolTable() {
        System.out.println("===== SYMBOL TABLE =====");
        for (int i = 0; i < scopes.size(); i++) {
            Scope scope = scopes.get(i);
            System.out.println("Scope #" + i + " [" + scope.name + "]:");

            for (SymbolEntry entry : scope.symbols.values()) {
                System.out.printf("  %-15s : %s\n", entry.name, entry.type);
            }
        }
        System.out.println("=======================");
    }
}

*/