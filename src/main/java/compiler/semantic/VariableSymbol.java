package main.java.compiler.semantic;

public class VariableSymbol extends Symbol {
    public final String type;

    public VariableSymbol(String name, String type, int line, int column) {
        super(name, line, column);
        this.type = type;
    }
}
