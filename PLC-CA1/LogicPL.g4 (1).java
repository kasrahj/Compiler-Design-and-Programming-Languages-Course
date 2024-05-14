grammar LogicPL;

logicPL
    : prog EOF
    ;

prog
    : comment prog
    | funcDec prog
    | main
    |
    ;

funcDec
    : FUNC_SIGN NAME LPAR {System.out.println("FunctionDec: " + $NAME.text);} varFuncDec RPAR COLON (INT|BOOL|FLOAT) LCURL funcBody RCURL

    ;

main
    : MAIN {System.out.println("MainBody");} LCURL funcBody RCURL

    ;

funcBody
    : comment funcBody
    | varDec funcBody
    | implicate funcBody
    | predicate SEMI+ funcBody
    | for funcBody
    | assignState funcBody
    | funcCall SEMI+ funcBody
    | return funcBody
    | print SEMI+ funcBody
    |
    ;

varDec
    : (INT | BOOL | FLOAT) NAME {System.out.println("VarDec: " + $NAME.text);}( EQ ( expr ) )? SEMI+
    | arrayDec
    ;

implicate
    : LPAR {System.out.println("Implication");} expr RPAR ARROW LPAR funcBody RPAR
    ;

predicate
    : CAP_NAME {System.out.println("Predicate: " + $CAP_NAME.text);} LPAR expr RPAR
    ;
for
    : FOR {System.out.println("Loop: for");} LPAR NAME COLON NAME RPAR LCURL funcBody RCURL
    ;

assignState
    : (NAME | arrayElement) EQ expr SEMI+
    | LPAR assignState RPAR
    ;

funcCall
    : NAME LPAR {System.out.println("FunctionCall");} ( expr (COMMA expr)* )? RPAR
    ;

funcCallExpr
    : NAME LPAR ( expr (COMMA expr)* )? RPAR
    ;

return
    : RETURN expr? SEMI+
    {System.out.println("Return");}
    ;

queryType1
    : LBRACK Q_MARK predicate RBRACK
    ;

queryType2
    : LBRACK CAP_NAME {System.out.println("Predicate: " + $CAP_NAME.text);} LPAR Q_MARK RPAR RBRACK
    ;

arrayDec
    : (INT | BOOL | FLOAT) LBRACK INTEGER RBRACK NAME {System.out.println("VarDec: " + $NAME.text);} (EQ LBRACK (expr) (COMMA (expr))* RBRACK)? SEMI+
    // intArray | boolArray | floatAraay
    ;

expr
    : eqE EQ expr {System.out.println("Operator: =");}
    | eqE
    ;

eqE
    : orE OR eqE {System.out.println("Operator: ||");}
    | orE
    ;

orE
    : andE AND orE {System.out.println("Operator: &&");}
    | andE
    ;

andE
    : comE EQ_EQ andE {System.out.println("Operator: ==");}
    | comE NOT_EQ andE {System.out.println("Operator: !=");}
    | comE
    ;

comE
    : pmE GT comE   {System.out.println("Operator: >");}
    | pmE LT comE   {System.out.println("Operator: <");}
    | pmE GT_EQ comE   {System.out.println("Operator: >=");}
    | pmE LT_EQ comE   {System.out.println("Operator: <=");}
    | pmE;

pmE
    : smpE MINUS pmE   {System.out.println("Operator: -");}
    | smpE PLUS pmE   {System.out.println("Operator: +");}
    | smpE
    ;

smpE
    : uE STAR smpE   {System.out.println("Operator: *");}
    | uE DIVIDE smpE   {System.out.println("Operator: /");}
    | uE PERCENT smpE   {System.out.println("Operator: %");}
    | uE
    ;
uE
    : NOT pE {System.out.println("Operator: !");}
    | PLUS pE {System.out.println("Operator: +");}
    | MINUS pE {System.out.println("Operator: -");}
    | pE
    ;

pE
    : LPAR expr RPAR
    | NEG_NUMBER {System.out.println("Operator: -");}
    | NEG_F_NUMBER {System.out.println("Operator: -");}
    | NUMBER | NAME | INTEGER | F_NUMBER | TRUE | FALSE | arrayElement | queryType1 | funcCallExpr
    ;


arrayElement
    : NAME LBRACK expr RBRACK
    ;

varFuncDec
    : (INT | BOOL | FLOAT) NAME {System.out.println("ArgumentDec: " + $NAME.text);}(COMMA varFuncDec )*
    |
    ;

comment
    : SHARP_SIGN ~(NEW_LINE)*
    ;

print
    : PRINT {System.out.println("Built-in: print");} LPAR printArg RPAR

    ;

printArg
    : NAME
    | expr
    | queryType2
    ;


WS:
    [ \t\n\r]-> skip
    ;

SKIP_COMMENT
    :   '#' ~[\r\n]* -> skip
    ;

NEW_LINE
    : '\n'
    ;

MAIN
    : 'main'
    ;

PRINT
    : 'print'
    ;

FOR
    : 'for'
    ;

RETURN
    : 'return'
    ;

FUNC_SIGN
    : 'function'
    ;

INT
    : 'int'
    ;

BOOL
    : 'boolean'
    ;

FLOAT
    : 'float'
    ;

TRUE
    : 'true'
    ;
FALSE
    : 'false'
    ;

INTEGER
    : [1-9] [0-9]*
    ;

NEG_NUMBER
    : (MINUS) [0-9]+
    ;

NUMBER
    : [0-9]+
    | (MINUS) [0-9]+
    ;

NEG_F_NUMBER
    : MINUS (NUMBER | INTEGER) DOT (NUMBER | INTEGER)
    ;

F_NUMBER
    : (MINUS | ) (NUMBER | INTEGER) DOT (NUMBER | INTEGER)
    ;

KEY_WORDS
    : MAIN | FOR | RETURN
    | INT | BOOL | FLOAT
    | FUNC_SIGN | TRUE | FALSE
    | PRINT
    ;

NAME
    : [a-z] ( [a-z] | [0-9] | '_' | [A-Z] )*
    ;

CAP_NAME
    : [A-Z] ( [a-z] | [0-9] | [A-Z] )*
    ;

AND
    : '&&'
    ;

OR
    : '||'
    ;

EQ_EQ
    : '=='
    ;

LT
	: '<'
	;

LT_EQ
    : '<='
    ;

GT
	: '>'
	;

GT_EQ
    : '>='
    ;

PLUS
    : '+'
    ;

MINUS:
    '-'
    ;

DIVIDE
     :'/'
     ;

PERCENT
    : '%'
    ;

STAR
    : '*'
    ;

LPAR
	: '('
	;

RPAR
	: ')'
	;

LCURL
	: '{'
	;

RCURL
	: '}'
	;

RBRACK
    : ']'
    ;

LBRACK
    : '['
    ;

COLON
    : ':'
    ;

SEMI
    : ';'
    ;

COMMA
    : ','
    ;

NOT
    : '!'
    ;

ARROW
    : '=>'
    ;

EQ
    : '='
    ;

NOT_EQ
    : '!='
    ;

SHARP_SIGN
    : '#'
    ;

Q_MARK
    : '?'
    ;

DOT
    : '.'
    ;