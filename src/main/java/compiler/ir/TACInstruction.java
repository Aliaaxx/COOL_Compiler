package main.java.compiler.ir;
import java.util.ArrayList;
import java.util.List;
public class TACInstruction {
    public enum Type {
        ASSIGN, BINARY_OP, UNARY_OP,
        LABEL, GOTO, COND_GOTO,
        CALL, PARAM, RETURN
    }

    public Type type;
    public String result;
    public String arg1;
    public String arg2;
    public String op;

    public TACInstruction(Type type, String result, String arg1, String arg2, String op) {
        this.type = type;
        this.result = result;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.op = op;
    }

    @Override
    public String toString() {
        switch (type) {
            case ASSIGN:
                return result + " = " + arg1;
            case BINARY_OP:
                return result + " = " + arg1 + " " + op + " " + arg2;
            case UNARY_OP:
                return result + " = " + op + arg1;
            case LABEL:
                return arg1 + ":";
            case GOTO:
                return "goto " + arg1;
            case COND_GOTO:
                return "if " + arg1 + " goto " + arg2;
            case CALL:
                return result + " = call " + arg1 + ", " + arg2;
            case PARAM:
                return "param " + arg1;
            case RETURN:
                return "return " + arg1;
            default:
                return "";
        }
    }
}

