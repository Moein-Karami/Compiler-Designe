grammar SimpleLOOP;

@header{
     import main.ast.nodes.*;
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
        for (VariableDeclaration varDec: $v.varDecStatement_ret)
            $programRet.addGlobalVariable(varDec);
    })*
    (c = classDeclaration NEWLINE+ {$programRet.addClass($c.classDeclaration_ret);})*;

//todo
constructor returns [ConstructorDeclaration constructor_ret]
	:{$constructor_ret = new ConstructorDeclaration();} PUBLIC INITIALIZE
	{$constructor_ret.setLine($INITIALIZE.getLine());
	    Identifier new_id = new Identifier($INITIALIZE.getText());
	    new_id.setLine($INITIALIZE.getLine());
	    $constructor_ret.setMethodName(new_id);
	}
	ma = methodArgsDec NEWLINE* mb = methodBody {$constructor_ret.setArgs($ma.methodArgsDec_ret);
	$constructor_ret.setBody($mb.methodBody_ret.getBody()); $constructor_ret.setLocalVars($mb.methodBody_ret.getLocalVars());};
      
//todo
classDeclaration returns [ClassDeclaration classDeclaration_ret]
    : CLASS ci = class_identifier{$classDeclaration_ret = new ClassDeclaration($ci.class_identifier_ret);
    $classDeclaration_ret.setLine($CLASS.getLine());} (LESS_THAN pci = class_identifier
    {$classDeclaration_ret.setParentClassName($pci.class_identifier_ret);})?
    NEWLINE* ((LBRACE NEWLINE+ (fd = field_decleration
    {
        for (Declaration declerations: $fd.field_decleration_ret)
        {
            FieldDeclaration new_fd;
            ConstructorDeclaration new2_fd;
            MethodDeclaration new3_fd;
            if(declerations instanceof FieldDeclaration)
            {
                new_fd = (FieldDeclaration)declerations;
                $classDeclaration_ret.addField(new_fd);
             }
            if(declerations instanceof ConstructorDeclaration)
            {
                new2_fd = (ConstructorDeclaration)declerations;
                $classDeclaration_ret.setConstructor(new2_fd);
            }
            if(declerations instanceof MethodDeclaration)
            {
                new3_fd = (MethodDeclaration)declerations;
                $classDeclaration_ret.addMethod(new3_fd);
            }
        }
    }
    )+ RBRACE)
    | fd2 = field_decleration
   {
   for (Declaration declerations: $fd2.field_decleration_ret)
   {
        FieldDeclaration new_fd2;
        ConstructorDeclaration new2_fd2;
        MethodDeclaration new3_fd2;
        if(declerations instanceof FieldDeclaration)
        {
            new_fd2 = (FieldDeclaration)declerations;
            $classDeclaration_ret.addField(new_fd2);
        }
        if(declerations instanceof ConstructorDeclaration)
        {
            new2_fd2 = (ConstructorDeclaration)declerations;
            $classDeclaration_ret.setConstructor(new2_fd2);
        }
        if(declerations instanceof MethodDeclaration)
        {
            new3_fd2 = (MethodDeclaration)declerations;
            $classDeclaration_ret.addMethod(new3_fd2);
        }
     }
    })NEWLINE*;

//todo
field_decleration returns [ArrayList<Declaration> field_decleration_ret]
    :
    {       $field_decleration_ret = new ArrayList<Declaration>();
    }
    (({boolean bl;} (PUBLIC {bl = false;}| PRIVATE{bl = true;}) ({VariableDeclaration dl;}vd = varDecStatement
    {
       for (VariableDeclaration variables : $vd.varDecStatement_ret)
       {
            dl = variables;

            FieldDeclaration fd_new = new FieldDeclaration(dl, bl);
            fd_new.setLine(dl.getLine());
            $field_decleration_ret.add(fd_new);
       }
    }|
    me = method {$field_decleration_ret.add($me.method_ret);})) | cn = constructor
    {$field_decleration_ret.add($cn.constructor_ret);}) NEWLINE+;

//todo
method returns [MethodDeclaration method_ret]
    : {Type tp;}(tmp = type {tp = $tmp.type_ret;}|
    VOID {tp = new NoType();}) id = identifier ma = methodArgsDec
    NEWLINE* mb = methodBody
    {$method_ret = $mb.methodBody_ret; $method_ret.setMethodName($id.identifier_ret); $method_ret.setReturnType(tp);
    $method_ret.setLine($id.identifier_ret.getLine());$method_ret.setArgs($ma.methodArgsDec_ret);};

//todo
methodBody returns [MethodDeclaration methodBody_ret]
    : {$methodBody_ret = new MethodDeclaration();}
    (LBRACE NEWLINE+ (vd = varDecStatement {
          for (VariableDeclaration varDec: $vd.varDecStatement_ret)
                $methodBody_ret.addLocalVar(varDec);
        $methodBody_ret.setLine($LBRACE.getLine());
    } NEWLINE+)*
    (ss = singleStatement {$methodBody_ret.addBodyStatement($ss.singleStatement_ret);} NEWLINE+)* RBRACE)
    | {$methodBody_ret = new MethodDeclaration();} ((vd = varDecStatement {
        for (VariableDeclaration varDec: $vd.varDecStatement_ret)
        {
            $methodBody_ret.addLocalVar(varDec);
            $methodBody_ret.setLine(varDec.getLine());
         }

    }NEWLINE+) |
    (ss = singleStatement {$methodBody_ret.addBodyStatement($ss.singleStatement_ret);$methodBody_ret.setLine($ss.singleStatement_ret.getLine());
}) NEWLINE+);


methodArgsDec returns [ArrayList<VariableDeclaration> methodArgsDec_ret]
    : {$methodArgsDec_ret = new ArrayList<VariableDeclaration>();}
    LPAR (ad = argDec {$methodArgsDec_ret.add($ad.argDec_ret);} ((ASSIGN orExpression) | (COMMA ad2 = argDec
    {$methodArgsDec_ret.add($ad2.argDec_ret);} )*) (COMMA arg = argDec {$methodArgsDec_ret.add($arg.argDec_ret);} ASSIGN orExpression)*)? RPAR ;

//todo
argDec returns [VariableDeclaration argDec_ret]
    : tp = type id = identifier {
        $argDec_ret = new VariableDeclaration($id.identifier_ret, $tp.type_ret);
        $argDec_ret.setLine($id.identifier_ret.getLine());
    };

//todo
methodArgs returns [ArrayList<Expression> methodArgs_ret]
    :{$methodArgs_ret = new ArrayList<Expression>();}
    (e1 = expression{$methodArgs_ret.add($e1.expression_ret);} (COMMA e2 = expression
    {$methodArgs_ret.add($e2.expression_ret);})*)?;

//todo
body returns [Statement body_ret]
    :
     (bs = blockStatement {$body_ret = $bs.blockStatement_ret;}| (NEWLINE+ ss = singleStatement {$body_ret = $ss.singleStatement_ret;}));

//todo
blockStatement returns [BlockStmt blockStatement_ret]
    : {$blockStatement_ret = new BlockStmt();}
    LBRACE {$blockStatement_ret.setLine($LBRACE.getLine());}NEWLINE+ (ss = singleStatement {$blockStatement_ret.addStatement($ss.singleStatement_ret);} NEWLINE+)* RBRACE ;

//todo
singleStatement returns [Statement singleStatement_ret]
    :
    my_if = ifStatement {$singleStatement_ret = $my_if.ifStatement_ret;}
    | pr = printStatement {$singleStatement_ret = $pr.printStatement_ret;}
    | mc = methodCallStmt {$singleStatement_ret = $mc.methodCallStmt_ret;}
    | rs = returnStatement {$singleStatement_ret = $rs.returnStatement_ret;}
    | as = assignmentStatement {$singleStatement_ret = $as.assignmentStatement_ret;}
    | ls = loopStatement {$singleStatement_ret = $ls.loopStatement_ret;}
    | ad = addStatement {$singleStatement_ret = $ad.addStatement_ret;}
    | ms = mergeStatement {$singleStatement_ret = $ms.mergeStatement_ret;}
    | ds = deleteStatement {$singleStatement_ret = $ds.deleteStatement_ret;}
    ;

//todo
addStatement returns [SetAdd addStatement_ret]
    :
    ex = expression DOT ADD LPAR oe = orExpression RPAR {$addStatement_ret = new SetAdd($ex.expression_ret, $oe.orExpression_ret);
    $addStatement_ret.setLine($ADD.getLine());};

//todo
mergeStatement returns [SetMerge mergeStatement_ret]
    :{ArrayList<Expression> tmp = new ArrayList<Expression>();}
    ex = expression DOT MERGE LPAR ox = orExpression {tmp.add($ox.orExpression_ret);}
    (COMMA oe = orExpression {tmp.add($oe.orExpression_ret);})* RPAR {$mergeStatement_ret = new SetMerge($ex.expression_ret,
    tmp); $mergeStatement_ret.setLine($MERGE.getLine());};

//todo
deleteStatement returns [SetDelete deleteStatement_ret]
    :
    ex = expression DOT DELETE LPAR oe = orExpression RPAR {$deleteStatement_ret = new SetDelete($ex.expression_ret,
    $oe.orExpression_ret); $deleteStatement_ret.setLine($DELETE.getLine());};

//todo
varDecStatement returns [ArrayList<VariableDeclaration> varDecStatement_ret]
    : {$varDecStatement_ret = new ArrayList<VariableDeclaration>();}
    tp = type id = identifier
    {
        VariableDeclaration tmp1;
        tmp1 = new VariableDeclaration($id.identifier_ret, $tp.type_ret);
        tmp1.setLine($id.identifier_ret.getLine());
        $varDecStatement_ret.add(tmp1);
   }
    (COMMA id2 = identifier {
        VariableDeclaration tmp2;
        tmp2 = new VariableDeclaration($id.identifier_ret, $tp.type_ret);
        tmp2.setLine($id.identifier_ret.getLine());
        $varDecStatement_ret.add(tmp2);
    }
    )*;
//todo
ifStatement returns [ConditionalStmt ifStatement_ret]
    :
    IF cn = condition bd = body {$ifStatement_ret = new ConditionalStmt($cn.condition_ret, $bd.body_ret);
    $ifStatement_ret.setLine($IF.getLine());}
    (eif = elsifStatement {$ifStatement_ret.addElsif($eif.elsifStatement_ret);})*
    (es = elseStatement {$ifStatement_ret.setElseBody($es.elseStatement_ret);})?;

//todo
elsifStatement returns [ElsifStmt elsifStatement_ret]
    :
     NEWLINE* ELSIF cn = condition b = body {$elsifStatement_ret = new ElsifStmt($cn.condition_ret, $b.body_ret);
     $elsifStatement_ret.setLine($ELSIF.getLine());};

//todo
condition returns [Expression condition_ret]
    :
    (LPAR ex = expression {$condition_ret = $ex.expression_ret;} RPAR) | (ex2 = expression {$condition_ret = $ex2.expression_ret;});

//todo
elseStatement returns [Statement elseStatement_ret]
    :
    NEWLINE* ELSE b = body {$elseStatement_ret = $b.body_ret;};

//todo
printStatement returns [PrintStmt printStatement_ret]
    :
    PRINT LPAR ex = expression {$printStatement_ret = new PrintStmt($ex.expression_ret);
    $printStatement_ret.setLine($PRINT.getLine());} RPAR;

//todo
methodCallStmt returns [MethodCallStmt methodCallStmt_ret]
    : {Expression ex;}
    ae = accessExpression {ex = $ae.accessExpression_ret;}
    (DOT (INITIALIZE {
    Identifier id_temp = new Identifier($INITIALIZE.getText());
    id_temp.setLine($INITIALIZE.getLine());
    ex = new ObjectMemberAccess(ex, id_temp);
    ex.setLine(id_temp.getLine());
    } | id = identifier
    {

        ex = new ObjectMemberAccess(ex, $id.identifier_ret);
        ex.setLine($id.identifier_ret.getLine());
    }))*
    ((LPAR ma = methodArgs {
        MethodCall mt_call = new MethodCall(ex, $ma.methodArgs_ret);
        mt_call.setLine($LPAR.getLine());
        $methodCallStmt_ret = new MethodCallStmt(mt_call);
        $methodCallStmt_ret.setLine($LPAR.getLine());
    } RPAR));

//todo
returnStatement returns [ReturnStmt returnStatement_ret]
    :
    RETURN {$returnStatement_ret = new ReturnStmt(); $returnStatement_ret.setLine($RETURN.getLine());}
    (ex = expression {{$returnStatement_ret.setReturnedExpr($ex.expression_ret);}})?;

//todo
assignmentStatement returns [AssignmentStmt assignmentStatement_ret]
    :
    oe = orExpression ASSIGN ex = expression{$assignmentStatement_ret = new AssignmentStmt($oe.orExpression_ret, $ex.expression_ret);
    $assignmentStatement_ret.setLine($ASSIGN.getLine());};

//todo
loopStatement returns [EachStmt loopStatement_ret]
    :{Expression ex_val = null;}
    ((ae = accessExpression{ex_val = $ae.accessExpression_ret;}) | (LPAR ex1 = expression DOT DOT ex2 = expression {ex_val = new RangeExpression($ex1.expression_ret, $ex2.expression_ret);}
     RPAR)) DOT EACH DO BAR id = identifier {$loopStatement_ret = new EachStmt($id.identifier_ret, ex_val); $loopStatement_ret.setLine($EACH.getLine());} BAR
    body {$loopStatement_ret.setBody($body.body_ret);};

//todo
expression returns [Expression expression_ret]
    : te = ternaryExpression {$expression_ret = $te.ternaryExpression_ret;}
    (ASSIGN ex = expression {$expression_ret = new BinaryExpression($expression_ret, $ex.expression_ret, BinaryOperator.assign);
    $expression_ret.setLine($ASSIGN.getLine());})?
    (DOT INCLUDE LPAR oe = orExpression RPAR {$expression_ret = new SetInclude($expression_ret, $oe.orExpression_ret);
    $expression_ret.setLine($INCLUDE.getLine());})?;

//todo
ternaryExpression returns [Expression ternaryExpression_ret]
    : oe = orExpression{$ternaryExpression_ret = $oe.orExpression_ret;}
    (TIF te1 = ternaryExpression TELSE te2 = ternaryExpression
    {$ternaryExpression_ret = new TernaryExpression($ternaryExpression_ret, $te1.ternaryExpression_ret, $te2.ternaryExpression_ret);
    $ternaryExpression_ret.setLine($TIF.getLine());})?;

//todo
orExpression returns [Expression orExpression_ret]
    : ae = andExpression {$orExpression_ret = $ae.andExpression_ret;}(OR aeq = andExpression{$orExpression_ret = new BinaryExpression($orExpression_ret,
    $aeq.andExpression_ret, BinaryOperator.or); $orExpression_ret.setLine($OR.getLine());})*
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
    (EQUAL expr = relationalExpression {$equalityExpression_ret = new BinaryExpression($equalityExpression_ret, $expr.relationalExpression_ret, BinaryOperator.eq);
    $equalityExpression_ret.setLine($EQUAL.getLine());})*;

//todo
relationalExpression returns [Expression relationalExpression_ret]
    :
    ae = additiveExpression {$relationalExpression_ret = $ae.additiveExpression_ret;}
    ({BinaryOperator bo; int ln;}(GREATER_THAN {bo = BinaryOperator.gt;ln = $GREATER_THAN.getLine();}|
    LESS_THAN {bo = BinaryOperator.lt;ln = $LESS_THAN.getLine();}) ade = additiveExpression
    {$relationalExpression_ret = new BinaryExpression($relationalExpression_ret, $ade.additiveExpression_ret, bo);
    $relationalExpression_ret.setLine(ln);})*;

//todo
additiveExpression returns [Expression additiveExpression_ret]
    :
    me = multiplicativeExpression {$additiveExpression_ret = $me.multiplicativeExpression_ret;}
    ({BinaryOperator bo; int ln;}(PLUS {bo = BinaryOperator.add;ln = $PLUS.getLine();}|
    MINUS {bo = BinaryOperator.sub;ln = $MINUS.getLine();}) mpe = multiplicativeExpression
    {$additiveExpression_ret = new BinaryExpression($additiveExpression_ret, $mpe.multiplicativeExpression_ret, bo);
    $additiveExpression_ret.setLine(ln);})*;

//todo
multiplicativeExpression returns [Expression multiplicativeExpression_ret]
    :
    pe = preUnaryExpression {$multiplicativeExpression_ret = $pe.preUnaryExpression_ret;}
    ({BinaryOperator bo; int ln;}(MULT {bo = BinaryOperator.mult;ln = $MULT.getLine();}
    | DIVIDE {bo = BinaryOperator.div;ln = $DIVIDE.getLine();}) pue = preUnaryExpression
    {$multiplicativeExpression_ret = new BinaryExpression($multiplicativeExpression_ret, $pue.preUnaryExpression_ret, bo);
    $multiplicativeExpression_ret.setLine(ln);})*;

//todo
preUnaryExpression returns [Expression preUnaryExpression_ret]
    :
    {UnaryOperator uo;}((NOT {uo = UnaryOperator.not;}| MINUS {uo = UnaryOperator.minus;}) pe = preUnaryExpression
    {$preUnaryExpression_ret = new UnaryExpression($pe.preUnaryExpression_ret, uo);})
    | po = postUnaryExpression {$preUnaryExpression_ret = $po.postUnaryExpression_ret;}
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
    {Identifier id; Expression temp;} oe = otherExpression {temp = $oe.otherExpression_ret;}
    ((LPAR ma = methodArgs {temp = new MethodCall($oe.otherExpression_ret, $ma.methodArgs_ret);
    temp.setLine($LPAR.getLine());} RPAR) | ((DOT  (i = identifier {temp= new ObjectMemberAccess(temp, $i.identifier_ret); temp.setLine($i.identifier_ret.getLine());}
    | NEW {id = new Identifier($NEW.getText()); id.setLine($NEW.getLine());}
    | INITIALIZE {id = new Identifier($INITIALIZE.getText()); id.setLine($INITIALIZE.getLine());}))
    ))*
    ((DOT (i2 = identifier {$accessExpression_ret = new ObjectMemberAccess(temp, $i2.identifier_ret);
    $accessExpression_ret.setLine($i2.identifier_ret.getLine());}))
    | (LBRACK ex = expression {$accessExpression_ret = new ArrayAccessByIndex(temp, $ex.expression_ret);
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
    bv = boolValue {$value_ret = $bv.boolValue_ret;}
    | iv = int_value {$value_ret = $iv.int_value_ret;}
    ;

//todo
boolValue returns [BoolValue boolValue_ret]
    :
      TRUE{$boolValue_ret = new BoolValue(true); $boolValue_ret.setLine($TRUE.getLine());}
    | FALSE {$boolValue_ret = new BoolValue(false); $boolValue_ret.setLine($FALSE.getLine());};

//todo
class_identifier returns [Identifier class_identifier_ret]
    :
    CLASS_IDENTIFIER {$class_identifier_ret = new Identifier($CLASS_IDENTIFIER.getText()); $class_identifier_ret.setName($CLASS_IDENTIFIER.getText());
    $class_identifier_ret.setLine($CLASS_IDENTIFIER.getLine());}
    ;

//todo
identifier returns [Identifier identifier_ret]
    :
    IDENTIFIER {$identifier_ret = new Identifier($IDENTIFIER.getText()); $identifier_ret.setName($IDENTIFIER.getText());
    $identifier_ret.setLine($IDENTIFIER.getLine());}
    ;

//todo
type returns [Type type_ret]
	: INT {$type_ret = new IntType();}
    | BOOL {$type_ret = new BoolType();}
    | arr_tp = array_type {$type_ret = $arr_tp.array_type_ret;}
    | fptr_tp = fptr_type {$type_ret = $fptr_tp.fptr_type_ret;}
    | set_tp = set_type {$type_ret = $set_tp.set_type_ret;}
    | class_tp = class_identifier {$type_ret = new ClassType($class_tp.class_identifier_ret);}
    ;

//todo
array_type returns [ArrayType array_type_ret]
    : {Type tp; ArrayList<Expression>arr_list =new ArrayList<Expression>(); int ln;}
    (INT {tp = new IntType(); ln = $INT.getLine();}
    | BOOL {tp = new BoolType();}
    | ci = class_identifier {tp = new ClassType($ci.class_identifier_ret);})
    (LBRACK ex = expression {arr_list.add($ex.expression_ret);} RBRACK)+
    {$array_type_ret = new ArrayType(tp, arr_list);};
//todo
fptr_type returns [FptrType fptr_type_ret]
    : {$fptr_type_ret = new FptrType();}
    FPTR LESS_THAN (VOID {$fptr_type_ret.addArgumentType(new VoidType());} | (tp = type {$fptr_type_ret.addArgumentType
    ($tp.type_ret);}(COMMA tp2 = type {$fptr_type_ret.addArgumentType($tp2.type_ret);})* )) ARROW
    (tp3 = type {$fptr_type_ret.setReturnType($tp3.type_ret);} | VOID {$fptr_type_ret.setReturnType (new VoidType());})
    GREATER_THAN;

//todo
set_type returns[SetType set_type_ret]
    :
    SET LESS_THAN (INT) GREATER_THAN
    {$set_type_ret = new SetType();
    };

int_value returns[IntValue int_value_ret]:
	INT_VALUE
	{$int_value_ret = new IntValue(Integer.parseInt($INT_VALUE.getText()));
	    $int_value_ret.setLine($INT_VALUE.getLine());
	} ;


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
