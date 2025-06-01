lexer grammar COOLLexer;
CLASS    : 'class';
ELSE     : 'else';
FALSE    : 'false';
FI       : 'fi';
IF       : 'if';
IN       : 'in';
INHERITS : 'inherits';
ISVOID   : 'isvoid';
LET      : 'let';
LOOP     : 'loop';
POOL     : 'pool';
THEN     : 'then';
WHILE    : 'while';
CASE     : 'case';
ESAC     : 'esac';
NEW      : 'new';
OF       : 'of';
NOT      : 'not';
TRUE     : 'true';

AT : '@';
DOT : '.';
COMP : '~';
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
LE : '<=';
LT : '<';
EQUAL : '=';
ASSIGN : '<-';
DARROW      : '=>'; // Double Arrow

COMMA       : ',';
SEMICOLON   : ';';
COLON       : ':';
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';

TYPE_ID : [A-Z][a-zA-Z0-9_]*;
ID : [a-z][a-zA-Z0-9_]*;
INT : [0-9]+;
STRING : '"' ('\\'[btnf"\\] | ~[\\\r\n] )* '"';

WHITESPACE: [ \n\t\r]+ -> skip;
SINGLECOMMENT: '--' ~[\r\n]* -> skip;
MULTICOMMENT: '(*' .*? '*)' -> skip;