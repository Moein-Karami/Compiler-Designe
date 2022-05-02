grammar SimpleLOOP;

@header{
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.classDec.classMembersDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 }

simpleLOOP returns [Program simpleLOOPProgram]:
    NEWLINE* p = program {$simpleLOOPProgram = $p.programRet;} NEWLINE* EOF;

program returns[Program programRet]:
    {$programRet = new Program();
     int line = 1;
     $programRet.setLine(line);}
    (v = varDecStatement NEWLINE+
    {
        for (VariableDeclaration varDec: $v.varDecStmtRet)
            $programRet.addGlobalVariable(varDec);
    })*
    (c = classDeclaration NEWLINE+ {$programRet.addClass($c.classDeclarationRet);})*;

//todo
constructor: PUBLIC init = INITIALIZE
      methodArgsDec NEWLINE* methodBody;
      
//todo
classDeclaration
    : CLASS class_identifier (LESS_THAN class_identifier)?
    NEWLINE* ((LBRACE NEWLINE+ (field_decleration NEWLINE+)+ RBRACE) | (field_decleration));

//todo
field_decleration
    :
    ((( (PUBLIC | PRIVATE) (varDecStatement | method)) | constructor));

//todo
method
    : (type | VOID) identifier methodArgsDec NEWLINE* methodBody;

//todo
methodBody
    :
    (LBRACE NEWLINE+ (varDecStatement NEWLINE+)* (singleStatement NEWLINE+)* RBRACE)
    | ((varDecStatement) | (s=singleStatement));

//todo
methodArgsDec
    : LPAR (argDec ((ASSIGN orExpression) | (COMMA argDec)*) (COMMA arg=argDec ASSIGN orExpression)*)? RPAR ;

//todo
argDec
    : type identifier;

//todo
methodArgs
    :
    (expression (COMMA e2=expression)*)?;

//todo
body
    :
     (blockStatement | (NEWLINE+ singleStatement));

//todo
blockStatement
    :
    LBRACE NEWLINE+ (singleStatement NEWLINE+)* RBRACE;

//todo
singleStatement
    :
    ifStatement
    | printStatement
    | methodCallStmt
    | returnStatement
    | assignmentStatement
    | loopStatement
    | addStatement
    | mergeStatement
    | deleteStatement
    ;

//todo
addStatement
    :
    expression DOT ADD LPAR orExpression RPAR;

//todo
mergeStatement
    :
    expression DOT MERGE LPAR orExpression
    (COMMA orExpression)* RPAR;

//todo
deleteStatement
    :
    expression DOT DELETE LPAR orExpression RPAR;

//todo
varDecStatement
    :
    type identifier (COMMA identifier)*;

//todo
ifStatement
    :
    IF condition body
    (elsifStatement)*
    (elseStatement)?;

//todo
elsifStatement
    :
     NEWLINE* ELSIF condition body;

//todo
condition
    :
    (LPAR expression RPAR) | (expression);

//todo
elseStatement
    :
    NEWLINE* ELSE body;

//todo
printStatement
    :
    PRINT LPAR expression RPAR;

//todo
methodCallStmt
    :
    accessExpression (DOT (INITIALIZE | identifier))*
    ((LPAR methodArgs RPAR));

//todo
returnStatement
    :
    RETURN (expression)?;

//todo
assignmentStatement
    :
    orExpression ASSIGN expression;

//todo
loopStatement
    :
    ((accessExpression) | (LPAR expression DOT DOT expression RPAR)) DOT EACH DO BAR identifier BAR
    body;

//todo
expression
    :
    ternaryExpression (ASSIGN expression)? (DOT inc=INCLUDE LPAR oe=orExpression RPAR)?;

//todo
ternaryExpression returns [Expression ternaryExpression_ret]
    : oe = orExpression{$ternaryExpression_ret = $oe.orExpression_ret;}
    (TIF te1 = ternaryExpression TELSE te2 = ternaryExpression
    {$ternaryExpression_ret = new TernaryExpression($ternaryExpression_ret, te1.ternaryExpression_ret, te2.ternaryExpression_ret);
    $ternaryExpression_ret.setLine($TIF.getLine());})?;

//todo
orExpression returns [Expression orExpression_ret]
    : ae = andExpression {$orExpression_ret = $ae;}(OR aeq = andExpression{$orExpression_ret = new BinaryExpression($orExpression_ret,
    $aeq.andExpression_ret, BinaryOperaotr.or); $orExpression_ret.setLine($OR.getLine());})*
    ;

//todo
andExpression returns [Expression andExpression_ret]
    :
    ee = equalityExpression {$andExpression_ret = $ee.equalityExpression_ret;} (AND eqe = equalityExpression
    {$andExpression_ret = new BinaryExpression($andExpression_ret, $eqe.equalityExpression_ret, BinaryOperator.and);
    $andExpression_ret.setLine($AND.getLine());})*;

//todo
equalityExpression returns [Expression equalityExpression_ret]
    :
    re = relationalExpression {$equalityExpression_ret = $re.relationalExpression_ret;}
    (EQUAL expr = relationalExpression {$equalityExpression_ret = new BinaryExpression($equalityExpression_ret, $expr.relationalExpression, BinaryOperator.eq);
    $equalityExpression_ret.setLine($EQUAL.getLine());})*;

//todo
relationalExpression returns [Expression relationalExpression_ret]
    :
    ae = additiveExpression {$relationalExpression_ret = $ae.additiveExpression_ret}
    ({BinaryOperator bo; int ln;}(GREATER_THAN {bo = BinaryOperator.gt;ln = $GREATER_THAN.getLine();}|
    LESS_THAN {bo = BinaryOperator.lt;ln = $LESS_THAN.getLine();}) ade = additiveExpression
    {$relationalExpression_ret = new BinaryExpression($relationalExpression_ret, $ade.additiveExpression_ret, bo);
    $relationalExpression_ret.setLine(ln);})*;

//todo
additiveExpression returns [Expression additiveExpression_ret]
    :
    me = multiplicativeExpression {$additiveExpression_ret = me.multiplicativeExpression_ret;}
    ({BinaryOperator bo; int ln;}(PLUS {bo = BinaryOperator.add;ln = $PLUS.getLine();}|
    MINUS {bo = BinaryOperator.sub;ln = $MINUS.getLine();}) mpe = multiplicativeExpression
    {$additiveExpression_ret = new BinaryExpression($additiveExpression_ret, mpe.multiplicativeExpression_ret, bo);
    $additiveExpression_ret.setLine(ln);})*;

//todo
multiplicativeExpression returns [Expression multiplicativeExpression_ret]
    :
    pe = preUnaryExpression {$multiplicativeExpression_ret = pe.preUnaryExpression_ret;}
    ({BinaryOperator bo; int ln;}(MULT {bo = BinaryOperator.mult;ln = $MULT.getLine();}
    | DIVIDE {bo = BinaryOperator.div;ln = $DIVIDE.getLine();}) pue = preUnaryExpression
    {$multiplicativeExpression_ret = new BinaryExpression($multiplicativeExpression_ret, $pue.preUnaryExpression_ret, bo);
    $multiplicativeExpression_ret.setLine(ln);})*;

//todo
preUnaryExpression returns [Expression postUnaryExpression_ret]
    :
    {uo = UnaryOperator;}((NOT {uo = UnaryOperator.not;}| MINUS {uo = UnaryOperator.minus;}) pe = preUnaryExpression
    {$postUnaryExpression_ret = new UnaryExpression($pe.preUnaryExpression_ret, uo);})
    | po = postUnaryExpression {$postUnaryExpression_ret = $po.postUnaryExpression_ret;}
    ;

//todo
postUnaryExpression returns [Expression postUnaryExpression_ret]
    :
    ae = accessExpression {$postUnaryExpression_ret = $ae.accessExpression_ret; UnaryOperator uo; int ln;}
    ((INC {uo = UnaryOperator.postinc; ln = $INC.getLine();}|
    DEC{uo = UnaryOperator.postdec; ln = $DEC.getLine();}){$postUnaryExpression_ret = new UnaryExpression($postUnaryExpression_ret, uo);
    $postUnaryExpression_ret.setLine(ln);})? ;

//todo
accessExpression returns [Expression accessExpression_ret]
    :
    oe = otherExpression {$accessExpression_ret = $oe.otherExpression;}
    ((LPAR ma = methodArgs {$accessExpression = new MethodCall($oe, $ma.methodArgs_ret);
    $accessExpression_ret.setLine($LPAR.getLine());} RPAR) | ((DOT {id = Identifier;} (i = identifier {id = $i.identifire_ret;}
    | NEW {id = new Identifire($NEW.getText()); id.setLine($NEW.getLine());}
    | INITIALIZE {id = new Identifire($INITIALIZE.getText(); id.setLine($INITIALIZE.getLine());}))
    {$accessExpression_ret = new ObjectMemberAccess($accessExpression_ret, id); $accessExpression_ret.setLine(id.getLine());}))*
    ((DOT (i2 = identifier {$accessExpression_ret = new ObjectMemberAccess($accessExpression, $i2.identifier_ret);
    $acceessExpression_ret.setLine($i2.getLine());}))
    | (LBRACK ex = expression {$accessExpression_ret = new ArrayccessByIndex($accessExpression_ret, $ex.expression_ret);
     $accessExpression_ret.setLine($LBRACK.getLine());} RBRACK))*;

//todo
otherExpression returns [Expression otherExpression_ret]
    : SELF {$otherExpression_ret = new SelfClass(); $otherExpression_ret.setLine($SELF.getLine());}
    | ci = class_identifier {$otherExpression_ret = $ci.class_identifier_ret;}
    | v = value {$otherExpression_ret = $v.value_ret;}
    | id = identifier {$otherExpression_ret = $id.identifier_ret;}
    | sn = setNew {$otherExpression_ret = $sn.setNew_ret;}
    | LPAR ex = expression RPAR {$otherExpression_ret = $ex.expression_ret;}
    ;

//todo
setNew returns [SetNew setNew_ret]
    : {ArrayList<Expression>arr_list =new ArrayList<Expression>();}
    SET DOT NEW LPAR (LPAR oe = orExpression {arr_list.add($oe.orExpression_ret);}
    (COMMA oe2 = orExpression {arr_list.add($oe2.orExpression_ret);})* RPAR)?  RPAR
    {$setNew_ret = new SetNew(arr_list); $setNew_ret.setLine($RPAR.getLine());};

//todo
value returns [Value value_ret]
    :
    bv = boolValue {$value_ret = bv.boolValue_ret;}
    | iv = int_value {$value_ret = int_value_ret;}
    ;

//todo
boolValue returns [BoolValue boolValue_ret]
    :
      TRUE{$boolValue_ret = new BoolValue(TRUE); $boolValue_ret.setLine($TRUE.getLine());}
    | FALSE {$boolValue_ret = new BoolValue(FALSE); $boolValue_ret.setLine($TRUE.getLine());};

//todo
class_identifier returns [Identifier class_identifier_ret]
    :
    CLASS_IDENTIFIER {$class_identifier_ret = new Identifier(); $class_identifier_ret.setName($IDENTIFIER.getText());
    $class_identifier_ret.setLine($CLASS_IDENTIFIER.getLine();}
    ;

//todo
identifier returns [Identifier identifier_ret]
    :
    IDENTIFIER {$identifier_ret = new Identifier(); $identifier_ret.setName($IDENTIFIER.getText());
    $identifier_ret.setLine($IDENTIfIER.getLine());}
    ;

//todo
type returns [Type type_ret]
	: INT {$type_ret = new IntType();}
    | BOOL {$type_ret = new BoolType();}
    | arr_tp = array_type {$type_ret = $arr_tp.array_type_ret;}
    | fptr_tp = fptr_type {$type_ret = $fptr_tp.fptr_type_ret;}
    | set_tp = set_type {$type_ret = $set_tp.set_type_ret;}
    | class_tp = class_identifier {$type_ret = $class_tp.class_identifier_ret;}
    ;

//todo
array_type returns [ArrayType array_type_ret]
    : {Type tp; ArrayList<Expression>arr_list =new ArrayList<Expression>(); int ln;}
    (INT {tp = new IntType(); ln = $INT.getLine();}
    | BOOL {tp = new BoolType();}
    | ci = class_identifier {tp = $ci.class_identifier_ret;})
    (LBRACK ex = expression {arr_list.add(ex.expression_ret);} RBRACK)+
    {$array_type_ret = new ArrayType(tp, arr_list); $array_type_ret.setLine($ln)};
//todo
fptr_type returns [FptrType fptr_type_ret]
    : {$fptr_type_ret = new FptrType();}
    FPTR LESS_THAN (VOID {$fptr_type_ret.addArgumentType(new VoidType());} | (tp = type {$fptr_type_ret.addArgumentType
    (tp.type_return);}(COMMA tp2 = type {$fptr_type_ret.addArgumentType(tp2.type_return);})* )) ARROW
    (tp3 = type {$fptr_type_ret.setReturnType(tp3.type_return);} | VOID {$fptr_type_ret.setReturnType (new VoidType());})
    GREATER_THAN {$fptr_type_ret.setLine($GREATER_THAN.getLine();};

//todo
set_type returns[SetType set_type_ret]
    :
    SET LESS_THAN (INT) GREATER_THAN
    {$set_type_ret = new SetType(); $set_type_ret.setLine($INT.getLine());};

int_value returns[IntValue int_value_ret]:
	INT_VALUE
	{$int_value_ret = new IntValue(parseInt($INT_VALUE.getText());
	$int_value_ret.setLine($INT_VALUE.getLine());} ;


LINE_BREAK: ('//\n') -> skip;

CLASS: 'class';
PUBLIC: 'public';
PRIVATE: 'private';
INITIALIZE: 'initialize';
NEW: 'new';
SELF: 'self';


RETURN: 'return';
VOID: 'void';


DELETE: 'delete';
INCLUDE: 'include';
ADD: 'add';
MERGE: 'merge';
PRINT: 'print';


IF: 'if';
ELSE: 'else';
ELSIF: 'elsif';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';
INC: '++';
DEC: '--';

EQUAL: '==';
GREATER_THAN: '>';
LESS_THAN: '<';

ARROW: '->';
BAR: '|';

AND: '&&';
OR: '||';
NOT: '!';

TIF: '?';
TELSE: ':';

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

BEGIN: '=begin';
END: '=end';

INT: 'int';
BOOL: 'bool';
FPTR: 'fptr';
SET: 'Set';
EACH: 'each';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
DOT: '.';
SEMICOLON: ';' -> skip;
NEWLINE: '\n';

INT_VALUE : '0' | [1-9][0-9]*;
IDENTIFIER: [a-z_][A-Za-z0-9_]*;
CLASS_IDENTIFIER: [A-Z][A-Za-z0-9_]*;

COMMENT: '#' .*? '\n' -> skip;
MLCOMMENT: ('=begin' .*? '=end') -> skip;
WS: ([ \t\r]) -> skip;
