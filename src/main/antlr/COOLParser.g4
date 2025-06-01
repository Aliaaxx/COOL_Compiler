parser grammar COOLParser;

options { tokenVocab=COOLLexer; }

program     : (classDef ';')+ EOF ;
classDef    : CLASS TYPE_ID (INHERITS TYPE_ID)? '{' (feature ';')* '}' ;
feature     : ID '(' (formal (',' formal)*)? ')' ':' TYPE_ID '{' expr '}'  # MethodFeature
            | ID ':' TYPE_ID (ASSIGN expr)?                                # AttributeFeature
            ;

formal      : ID ':' TYPE_ID ;

expr        : ID ASSIGN expr                                               # ExprAssign
            | expr ('@' TYPE_ID)? '.' ID '(' (expr (',' expr)*)? ')'       # ExprDispatch
            | ID '(' (expr (',' expr)*)? ')'                               # ExprSelfDispatch
            | IF expr THEN expr ELSE expr FI                               # ExprIf
            | WHILE expr LOOP expr POOL                                    # ExprWhile
            | '{' (expr ';')* '}'                                          # ExprBlock
            | LET ID ':' TYPE_ID (ASSIGN expr)? (',' ID ':' TYPE_ID (ASSIGN expr)?)* IN expr  # ExprLet
            | CASE expr OF (ID ':' TYPE_ID DARROW expr ';')+ ESAC          # ExprCase
            | NEW TYPE_ID                                                  # ExprNew
            | ISVOID expr                                                  # ExprIsvoid
            | expr (MUL | DIV) expr                                        # ExprMulDiv
            | expr (ADD | SUB) expr                                        # ExprAddSub
            | expr (LT | LE | EQUAL) expr                                  # ExprComparison
            | NOT expr                                                     # ExprNot
            | COMP expr                                                    # ExprNeg
            | '(' expr ')'                                                 # ExprParen
            | ID                                                           # ExprId
            | INT                                                          # ExprInt
            | STRING                                                       # ExprString
            | TRUE                                                         # ExprTrue
            | FALSE                                                        # ExprFalse
            ;

