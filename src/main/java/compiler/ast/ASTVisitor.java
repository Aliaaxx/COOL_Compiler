package main.java.compiler.ast;

public interface ASTVisitor<T> {
    // ==============================================
    // Program Structure
    // ==============================================
    T visit(Program node);
    T visit(ClassDef node);

    // ==============================================
    // Class Members
    // ==============================================
    T visit(Method node);
    T visit(Attribute node);
    T visit(Formal node);  // Method parameters

    // ==============================================
    // Literals
    // ==============================================
    T visit(IntLiteral node);
    T visit(StringLiteral node);
    T visit(BoolLiteral node);

    // ==============================================
    // Variables and Assignment
    // ==============================================
    T visit(Identifier node);
    T visit(Assignment node);

    // ==============================================
    // Control Flow
    // ==============================================
    T visit(If node);
    T visit(While node);
    T visit(Case node);
    T visit(CaseBranch node);
    T visit(Block node);

    // ==============================================
    // Object-oriented Features
    // ==============================================
    T visit(Dispatch node);  // Method calls
    T visit(New node);      // Object instantiation
    T visit(IsVoid node);   // Void checking

    // ==============================================
    // Let Expression
    // ==============================================
    T visit(Let node);

    // ==============================================
    // Logical Operations
    // ==============================================
    T visit(Not node);
    T visit(Negate node);

    // ==============================================
    // Arithmetic Operations
    // ==============================================
    T visit(Plus node);
    T visit(Minus node);
    T visit(Multiply node);
    T visit(Divide node);

    // ==============================================
    // Comparison Operations
    // ==============================================
    T visit(LessThan node);
    T visit(LessThanOrEqual node);
    T visit(Equal node);

    // ==============================================
    // Compound Operations (alternative design)
    // ==============================================
    T visit(BinaryOperation node);  // Generic binary op
    T visit(UnaryOperation node);   // Generic unary op
}

// Case, CaseBranch, New, IsVoid, Not, Plus, Minus, Multiply, Divide, LessThan, LessThanOrEqual, Equal, BinaryOperation, UnaryOperation