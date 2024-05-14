grammar LogicPL;

@header{
import ast.node.*;
import ast.node.expression.*;
import ast.node.statement.*;
import ast.node.declaration.*;
import ast.node.expression.values.*;
import ast.node.expression.operators.*;
import ast.type.primitiveType.*;
import ast.type.*;
}

program returns[Program p]:
    {$p = new Program(); $p.setLine(0);}
    (f = functionDec {$p.addFunc($f.functionDeclaration);})*
    main = mainBlock {$p.setMain($main.main) ;}
    ;

functionDec returns[FuncDeclaration functionDeclaration]:
    {ArrayList<ArgDeclaration> args = new ArrayList<>();
     ArrayList<Statement> statements = new ArrayList<>();}
    FUNCTION name = identifier
    LPAR (arg1 = functionVarDec {args.add($arg1.argDeclaration);} (COMMA arg = functionVarDec {args.add($arg.argDeclaration);})*)? RPAR COLON returnType = type
    LBRACE ((stmt = statement {statements.add($stmt.statementRet);})+) RBRACE
    {$functionDeclaration = new FuncDeclaration($name.id, $returnType.typeRet, args, statements); $functionDeclaration.setLine($name.id.getLine());}
    ;

functionVarDec returns [ArgDeclaration argDeclaration]:
    t = type arg_iden = identifier {$argDeclaration = new ArgDeclaration($arg_iden.id, $t.typeRet); $argDeclaration.setLine($arg_iden.id.getLine());}
    ;

mainBlock returns [MainDeclaration main]:
    {ArrayList<Statement> mainStmts = new ArrayList<>();}
    m = MAIN LBRACE (s = statement {mainStmts.add($s.statementRet);})+ RBRACE
    {$main = new MainDeclaration(mainStmts); $main.setLine($m.getLine());}
    ;

statement returns [Statement statementRet]
    : assignSmt { $statementRet = $assignSmt.assignRet; }
    | ( predicate SEMICOLON ) { $statementRet = $predicate.predicateRet; }
    | implication { $statementRet = $implication.implicationRet; }
    | returnSmt { $statementRet = $returnSmt.returnRet; }
    | printSmt { $statementRet = $printSmt.printSmtRet; }
    | forLoop { $statementRet = $forLoop.forLoopRet; }
    | localVarDeclaration { $statementRet = $localVarDeclaration.varDecRet; }
    ;

assignSmt returns[AssignStmt assignRet] :
    var=variable a=ASSIGN ex=expression SEMICOLON { $assignRet = new AssignStmt($var.var, $ex.expr); $assignRet.setLine($a.getLine());}
    ;

variable returns [Variable var]
    : i=identifier {$var = new Identifier($i.id.getName()); $var.setLine($i.id.getLine()); }
    | i=identifier LBRACKET e=expression RBRACKET {$var = new ArrayAccess($i.id.getName(), $e.expr); $var.setLine($i.id.getLine());}
    ;

localVarDeclaration returns [Statement varDecRet]:
     var=varDeclaration {$varDecRet = $var.varDecRet; }
    | arr=arrayDeclaration {$varDecRet = $arr.arrDecRet; }
    ;

varDeclaration returns [VarDecStmt varDecRet]:
    t=type i=identifier {$varDecRet = new VarDecStmt($i.id, $t.typeRet); $varDecRet.setLine($i.id.getLine());}(ASSIGN e=expression{$varDecRet.setInitialExpression($e.expr);} )? SEMICOLON

    ;

arrayDeclaration returns [ArrayDecStmt arrDecRet]:
    {ArrayList<Expression> initialValues = new ArrayList<>();}
    t=type LBRACKET size=INT_NUMBER RBRACKET name=identifier
    (arrValues=arrayInitialValue {initialValues = $arrValues.initialValues;})? SEMICOLON
    {$arrDecRet = new ArrayDecStmt($name.id, $t.typeRet, $size.int); $arrDecRet.setInitialValues(initialValues); $arrDecRet.setLine($name.id.getLine());}
    ;

arrayInitialValue returns [ArrayList<Expression> initialValues]:
    ASSIGN arrayList
    {$initialValues = $arrayList.initialValues;}
    ;

arrayList returns [ArrayList<Expression> initialValues]:
    {$initialValues = new ArrayList<>();}
    LBRACKET ( val=value {$initialValues.add($val.val);}| i=identifier {$initialValues.add($i.id);}) (COMMA ( val=value{$initialValues.add($val.val);} | id=identifier{$initialValues.add($i.id);} ))* RBRACKET
    ;

printSmt returns [PrintStmt printSmtRet]
    : PRINT LPAR p=printExpr RPAR SEMICOLON
    {$printSmtRet = new PrintStmt($p.expr); $printSmtRet.setLine($p.expr.getLine());}
    ;

printExpr returns [Expression expr]:
    var=variable {$expr = $var.var;}
    | q=query {$expr = $q.queryRet;}
    ;

query returns [QueryExpression queryRet]:
      q1=queryType1 {$queryRet = $q1.queryRet;}
     | q2=queryType2 {$queryRet = $q2.queryRet;}
    ;

queryType1 returns [QueryExpression queryRet]:
    LBRACKET q=QUARYMARK p=predicateIdentifier LPAR var=variable RPAR RBRACKET
    {$queryRet = new QueryExpression($p.id); $queryRet.setVar($var.var); $queryRet.setLine($q.getLine());}
    ;

queryType2 returns [QueryExpression queryRet]:
    LBRACKET p=predicateIdentifier LPAR q=QUARYMARK RPAR RBRACKET
    {$queryRet = new QueryExpression($p.id); $queryRet.setLine($q.getLine());}
    ;

returnSmt returns [ReturnStmt returnRet]:
    r=RETURN (v=value {$returnRet = new ReturnStmt($v.val); $returnRet.setLine($v.val.getLine());} | i=identifier {$returnRet = new ReturnStmt($i.id); $returnRet.setLine($i.id.getLine());} )? SEMICOLON
    {if($returnRet == null){$returnRet = new ReturnStmt(null);}  $returnRet.setLine($r.getLine());}
    ;

forLoop returns [ForloopStmt forLoopRet] :
    {ArrayList<Statement> stmts = new ArrayList<>();}
    f=FOR LPAR it=identifier COLON arr=identifier RPAR
    LBRACE ((s=statement {stmts.add($s.statementRet);})*) RBRACE
    {$forLoopRet = new ForloopStmt($it.id, $arr.id, stmts); $forLoopRet.setLine($f.getLine()); }
    ;

predicate returns [PredicateStmt predicateRet]
    : i=predicateIdentifier LPAR var=variable RPAR
    {$predicateRet = new PredicateStmt($i.id, $var.var); $predicateRet.setLine($i.id.getLine());}
    ;

implication returns [ImplicationStmt implicationRet]:
    {ArrayList<Statement> stmts = new ArrayList<>();}
    LPAR e=expression RPAR ARROW LPAR ((s=statement {stmts.add($s.statementRet);})+) RPAR
    {$implicationRet = new ImplicationStmt($e.expr, stmts); $implicationRet.setLine($e.expr.getLine());}
    ;


expression returns [Expression expr]:
    left=andExpr right=expression2
    { if($right.expr != null) {$expr = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $expr.setLine($right.expr.getLine());}
      else {$expr = $left.expr;}}
    ;

expression2 returns [BinaryExpression expr] locals [BinaryExpression ee]:
    o=OR left=andExpr right=expression2
    {if($right.expr != null) {$ee = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $ee.setLine($right.expr.getLine()); $expr = new BinaryExpression(null, $ee, BinaryOperator.or);}
    else{$expr = new BinaryExpression(null, $left.expr, BinaryOperator.or);}
    $expr.setLine($o.getLine());}

    |
    {$expr = null;}
    ;

andExpr returns [Expression expr]:
    left=eqExpr right=andExpr2
    {if($right.expr != null) {$expr = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $expr.setLine($right.expr.getLine());}
    else {$expr = $left.expr;}}
    ;

andExpr2 returns [BinaryExpression expr] locals [BinaryExpression ex]:
    AND left=eqExpr right=andExpr2
    {if($right.expr != null) {$ex = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $ex.setLine($right.expr.getLine()); $expr = new BinaryExpression(null, $ex, BinaryOperator.and);} else{$expr = new BinaryExpression(null, $left.expr, BinaryOperator.and);}}
    {$expr.setLine($AND.getLine());}

    |
    {$expr = null;}
    ;

eqExpr returns [Expression expr]:
    l = compExpr r = eqExpr2
    {if($r.expr != null) {$expr = new BinaryExpression($l.expr, $r.expr.getRight(), $r.expr.getBinaryOperator()); $expr.setLine($r.expr.getLine());} else {$expr = $l.expr;}}
    ;

eqExpr2 returns [BinaryExpression expr] locals [BinaryOperator opt, BinaryExpression ex]:
    (op = EQ {$opt = BinaryOperator.eq;}| op = NEQ {$opt = BinaryOperator.neq;}) left=compExpr right=eqExpr2
    {if($right.expr != null) {$ex = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $ex.setLine($right.expr.getLine()); $expr = new BinaryExpression(null, $ex, $opt);} else{$expr = new BinaryExpression(null, $left.expr, $opt);}}
    {$expr.setLine($op.getLine());}
    |
    {$expr = null;}
    ;

compExpr returns [Expression expr]:
    left = additive right = compExpr2
    {if($right.expr != null) {$expr = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $expr.setLine($right.expr.getLine());} else {$expr = $left.expr;}}
    ;

compExpr2 returns [BinaryExpression expr] locals [BinaryOperator opt, BinaryExpression ex]:
    (op = LT {$opt = BinaryOperator.lt;}| op = LTE {$opt = BinaryOperator.lte;}| op = GT {$opt = BinaryOperator.gt;}| op = GTE{$opt = BinaryOperator.gte;}) left = additive right = compExpr2
    {if($right.expr != null) {$ex = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $ex.setLine($right.expr.getLine()); $expr = new BinaryExpression(null, $ex, $opt);} else{$expr = new BinaryExpression(null, $left.expr, $opt);}}
    {$expr.setLine($op.getLine());}
    |
    {$expr = null;}
    ;

additive returns [Expression expr]:
    left = multicative right = additive2
    {if($right.expr != null) {$expr = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $expr.setLine($right.expr.getLine());} else {$expr = $left.expr;}}
    ;

additive2 returns [BinaryExpression expr] locals [BinaryOperator opt, BinaryExpression ex]:
    (op = PLUS {$opt = BinaryOperator.add;} | op = MINUS {$opt = BinaryOperator.sub;}) left = multicative right = additive2
    {if($right.expr != null) {$ex = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $ex.setLine($right.expr.getLine()); $expr = new BinaryExpression(null, $ex, $opt);} else{$expr = new BinaryExpression(null, $left.expr, $opt);}
    $expr.setLine($op.getLine());}
    |
    {$expr = null;}
    ;

multicative returns [Expression expr]:
    left =  unary right = multicative2
    {if($right.expr != null) {$expr = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $expr.setLine($right.expr.getLine());} else {$expr = $left.expr;}}
    ;

multicative2 returns [BinaryExpression expr] locals [BinaryOperator opt, BinaryExpression ex]:
    (op = MULT {$opt = BinaryOperator.mult;} | op = MOD {$opt = BinaryOperator.mod;}| op = DIV {$opt = BinaryOperator.div;}) left = unary right = multicative2
    {if($right.expr != null) {$ex = new BinaryExpression($left.expr, $right.expr.getRight(), $right.expr.getBinaryOperator()); $ex.setLine($right.expr.getLine()); $expr = new BinaryExpression(null, $ex, $opt);} else{$expr = new BinaryExpression(null, $left.expr, $opt);}}
    {$expr.setLine($op.getLine());}
    |
    {$expr = null;}
    ;

unary returns [Expression expr] locals [UnaryOperator opt]:
    otherRet = other {$expr = $otherRet.expr;}
    |
     (op = PLUS {$opt = UnaryOperator.plus;} | op = MINUS {$opt = UnaryOperator.minus;} | op = NOT {$opt = UnaryOperator.not;}) e = other
     {$expr = new UnaryExpression($opt, $e.expr); $expr.setLine($op.getLine());}
    ;

other returns [Expression expr]:
    LPAR expression RPAR {$expr = $expression.expr;}
    | variable {$expr = $variable.var;}
    | value {$expr = $value.val;}
    | queryType1 {$expr = $queryType1.queryRet;}
    | functionCall {$expr = $functionCall.funcRet;}
    ;

functionCall returns [FunctionCall funcRet]:
    {ArrayList<Expression> allArgs = new ArrayList<Expression>();}
    iden = identifier LPAR (arg = expression {allArgs.add($arg.expr);} (COMMA newArg = expression {allArgs.add($newArg.expr);})*)? RPAR
    {$funcRet = new FunctionCall(allArgs, $iden.id); $funcRet.setLine($iden.id.getLine());}
    ;

value returns [Value val]:
    n=numericValue {$val = $n.val;}
    | t=TRUE {$val = new BooleanValue(true); $val.setLine($t.getLine()); $val.setType(new BooleanType());}
    | f=FALSE {$val = new BooleanValue(false); $val.setLine($f.getLine()); $val.setType(new BooleanType());}
    | MINUS n=numericValue {$val = $n.val; $val.negateConstant();}
    ;

numericValue returns [Value val]:
    i=INT_NUMBER {$val = new IntValue($i.int); $val.setLine($i.getLine()); $val.setType(new IntType());}
    | f=FLOAT_NUMBER {$val = new FloatValue(Float.parseFloat($f.text)); $val.setLine($f.getLine()); $val.setType(new FloatType());}
    ;

identifier returns [Identifier id]:
    i=IDENTIFIER {$id = new Identifier($i.text); $id.setLine($i.getLine());}
    ;

predicateIdentifier returns [Identifier id]
    : i=PREDICATE_IDENTIFIER {$id = new Identifier($i.text); $id.setLine($i.getLine());}
    ;

type returns [Type typeRet]
    : b=BOOLEAN {$typeRet = new BooleanType();}
    | i=INT {$typeRet = new IntType();}
    | f=FLOAT {$typeRet = new FloatType();}
    ;




FUNCTION : 'function';
BOOLEAN : 'boolean';
INT : 'int';
FLOAT: 'float';
MAIN: 'main';
PRINT: 'print';
RETURN: 'return';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';

LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
ASSIGN: '=';
LBRACKET: '[';
RBRACKET: ']';
QUARYMARK: '?';
ARROW: '=>';
OR: '||';
AND: '&&';
EQ: '==';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NEQ: '!=';
NOT: '!';


WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

IDENTIFIER : [a-z][a-zA-Z0-9_]* ;
PREDICATE_IDENTIFIER : [A-Z][a-zA-Z0-9]* ;
INT_NUMBER : [0-9]+;
FLOAT_NUMBER: ([0-9]*[.])?[0-9]+;