grammar SimpleLOOP;

simpleLoop
    : start_prog? EOF
    ;

start_prog
	: var_dec comment? NEW_LINE+ start_prog
	| comment NEW_LINE+ start_prog
	| class_dec comment? NEW_LINE+ prog_body
	| NEW_LINE+ start_prog
	| var_dec comment?
	| comment
	| class_dec
	|
	;

var_dec
	: (INT | BOOL | CAP_NAME | set_dec | func_var) (LBRACK expr RBRACK)* SMALL_NAME {System.out.println("VarDec : " + $SMALL_NAME.text);} (COMMA SMALL_NAME {System.out.println("VarDec : " + $SMALL_NAME.text);} comment?)* comment?
	;

comment
	: SHARP_SIGN .*
	| BEGIN_COMMENT NEW_LINE* (~(BEGIN_COMMENT | END_COMMENT))* NEW_LINE* END_COMMENT
	;

class_dec
	: CLASS CAP_NAME {System.out.println("ClassDec : " + $CAP_NAME.text); String class_before = $CAP_NAME.text;} (LT CAP_NAME  {System.out.println("Inheritance : " + class_before + " < " + $CAP_NAME.text );})? NEW_LINE* LCURL (NEW_LINE+ begin_class comment?)? NEW_LINE+ RCURL
	| CLASS CAP_NAME {System.out.println("ClassDec : " + $CAP_NAME.text); String class_before = $CAP_NAME.text;} (LT CAP_NAME  {System.out.println("Inheritance : " + class_before + " < " + $CAP_NAME.text );})? NEW_LINE* (comment | ACCESS_TYPE var_dec | init_dec | func_dec)? comment?
	;

prog_body
	: class_dec NEW_LINE+ prog_body comment?
	| comment NEW_LINE+ prog_body comment?
	| NEW_LINE+ prog_body comment?
	| class_dec comment?
	| comment comment?
	|
	;

set_dec
	: SET LT INT GT
	;

set_op
	: SET DOT NEW_WORD {System.out.println("NEW");} LPAR loop_arr RPAR
	| var DOT ADD {System.out.println("ADD");} LPAR expr RPAR
	| var DOT MERGE {System.out.println("MERGE");} LPAR loop_arr RPAR
	| var DOT INCLUDE {System.out.println("INCLUDE");} LPAR expr RPAR
	| var DOT DELETE {System.out.println("DELETE");} LPAR expr RPAR
	;

loop_arr
    : LPAR loop_arr RPAR
    | func_input?
    ;

func_var
	: FPTR LT (VOID | INT | BOOL | CAP_NAME | set_dec | func_var) (COMMA (VOID | INT | BOOL | CAP_NAME | set_dec | func_var))* ARROW (VOID | INT | BOOL | CAP_NAME | set_dec | func_var) GT comment?
	;

begin_class
	: comment NEW_LINE+ begin_class comment?
	| ACCESS_TYPE var_dec NEW_LINE+ begin_class comment?
	| init_dec NEW_LINE+ begin_class comment?
	| func_dec NEW_LINE+ begin_class comment?
	| comment
	| ACCESS_TYPE var_dec comment?
	| init_dec comment?
	| func_dec comment?
	;

init_dec
	: ACCESS_TYPE INIT LPAR argumants? RPAR NEW_LINE* LCURL (NEW_LINE+ init_begin)? NEW_LINE+ RCURL |
	    ACCESS_TYPE INIT LPAR argumants? RPAR NEW_LINE+ line_command
	;

init_begin
	: comment NEW_LINE+ init_begin comment?
    | var_dec NEW_LINE+ init_begin comment?
    | scop_body comment?
    | comment comment?
    | var_dec comment?
    ;

func_dec
	: ACCESS_TYPE (VOID | INT | BOOL | set_dec | CAP_NAME | func_var)? (LBRACK expr RBRACK)* SMALL_NAME {System.out.println("MethodDec : " + $SMALL_NAME.text);} LPAR argumants? RPAR NEW_LINE* LCURL (NEW_LINE+ func_begin)? NEW_LINE+ RCURL
	| ACCESS_TYPE (VOID | INT | BOOL | set_dec | CAP_NAME | func_var)? (LBRACK expr RBRACK)* SMALL_NAME {System.out.println("MethodDec : " + $SMALL_NAME.text);} LPAR argumants? RPAR NEW_LINE+ line_command
	;

argumants
	: (INT | BOOL | CAP_NAME | set_dec | func_var | VOID) (LBRACK expr RBRACK)* SMALL_NAME {System.out.println("ArgumentDec : " + $SMALL_NAME.text);} (COMMA argumants)?
	| default_argumants
	;

default_argumants
	: (INT | BOOL | CAP_NAME | set_dec | func_var | VOID) (LBRACK expr RBRACK)* SMALL_NAME EQUAL {System.out.println("ArgumentDec : " + $SMALL_NAME.text);} expr (COMMA default_argumants)?
	| (INT | BOOL | CAP_NAME | set_dec | func_var | VOID) (LBRACK expr RBRACK)* SMALL_NAME EQUAL {System.out.println("ArgumentDec : " + $SMALL_NAME.text);} expr (COMMA default_argumants)?
	;

func_begin
	: comment NEW_LINE+ func_begin comment?
	| var_dec NEW_LINE+ func_begin comment?
	| scop_body comment?
	| comment
	| var_dec comment?
	;

scop_body
	: comment NEW_LINE+ scop_body comment?
	| line_command NEW_LINE+ scop_body comment?
	| line_command comment?
	| comment
	;

line_command
	: if_state comment?
	| for_loop comment?
	| print comment?
	| my_return comment?
	| func_call comment?
	| set_op comment?
	| expr comment?
	;

func_call
	: LPAR func_call RPAR
	| {System.out.println("MethodCall");} var LPAR func_input? RPAR
	| {System.out.println("MethodCall");} var DOT INIT LPAR func_input? RPAR
	;

if_state
	: IF {System.out.println("Conditional : " + "if");} expr NEW_LINE+ line_command NEW_LINE+  (my_else | else_if)
	| IF {System.out.println("Conditional : " + "if");} expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL NEW_LINE+ (my_else | else_if)
	| IF {System.out.println("Conditional : " + "if");} expr NEW_LINE+ line_command
	| IF {System.out.println("Conditional : " + "if");} expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL
	;

my_else
 	: ELSE {System.out.println("Conditional : " + "else");} NEW_LINE+ line_command
    | ELSE {System.out.println("Conditional : " + "else");} NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL
	;

else_if
	: ELSE_IF {System.out.println("Conditional : " + "elsif");} expr NEW_LINE+ line_command NEW_LINE+  (my_else | else_if)
	| ELSE_IF {System.out.println("Conditional : " + "elsif");} expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL NEW_LINE+ (my_else | else_if)
	| ELSE_IF {System.out.println("Conditional : " + "elsif");} expr NEW_LINE+ line_command
	| ELSE_IF {System.out.println("Conditional : " + "elsif");} expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+  RCURL
	;

for_loop
	:  (var | sequence) DOT EACH DO ABS_SIGN var ABS_SIGN NEW_LINE+ {System.out.println("Loop : " + "each");} line_command
	|  (var | sequence) DOT EACH DO ABS_SIGN var ABS_SIGN NEW_LINE* {System.out.println("Loop : " + "each");} LCURL (NEW_LINE+ scop_body)? NEW_LINE+ RCURL
	;

print
	: PRINT {System.out.println("Built-in : " + "print");} LPAR expr RPAR
	;

//assigment
//	: var  EQUAL expr {System.out.println("Operator : " + "=");} assigment_prime
//	| (var  EQUAL expr {System.out.println("Operator : " + "=");} expr_prime expr_prime
//       	| var expr_prime
//       	| set_op expr_prime
//       	| {String sv_token;} (MINUS {sv_token = "Operator : " + "-";}  | NOT {sv_token = "Operator : " + "!";} ) expr expr_prime {System.out.println(sv_token);}
//       	| (NUM | BOOL_VALUE) expr_prime
//       	| LPAR expr RPAR expr_prime) (PLUS_PLUS {System.out.println("Operator : " + "++");} | MINUS_MINUS {System.out.println("Operator : " + "--");}) assigment_prime
//	| ( var expr_prime
//              	| set_op expr_prime
//              	| {String sv_token;} (MINUS {sv_token = "Operator : " + "-";}  | NOT {sv_token = "Operator : " + "!";} ) expr expr_prime {System.out.println(sv_token);}
//              	| (NUM | BOOL_VALUE) expr_prime
//              	| LPAR expr RPAR expr_prime
//              	) QUESTION_MARK expr COLON expr ternary_prime expr_prime (PLUS_PLUS {System.out.println("Operator : " + "++");} | MINUS_MINUS {System.out.println("Operator : " + "--");}) assigment_prime
//	| assigment expr_prime QUESTION_MARK expr COLON expr ternary_prime expr_prime (PLUS_PLUS {System.out.println("Operator : " + "++");} | MINUS_MINUS {System.out.println("Operator : " + "--");})
//	;
//
//assigment_prime
//	: expr_prime QUESTION_MARK expr COLON expr ternary_prime expr_prime (PLUS_PLUS {System.out.println("Operator : " + "++");} | MINUS_MINUS {System.out.println("Operator : " + "--");}) assigment_prime
//	|
//	;
//
//expr
//	: var  EQUAL expr {System.out.println("Operator : " + "=");} expr_prime
//	| ternary_condition expr_prime
//	| var expr_prime
//	| set_op expr_prime
//	| {String sv_token;} (MINUS {sv_token = "Operator : " + "-";}  | NOT {sv_token = "Operator : " + "!";} ) expr expr_prime {System.out.println(sv_token);}
//	| (NUM | BOOL_VALUE) expr_prime
//	| LPAR expr RPAR expr_prime
//	;
//
//expr_prime
//    : OR_OR expr expr_prime {System.out.println("Operator : " + "||");}
//	| AND_AND expr expr_prime {System.out.println("Operator : " + "&&");}
//	| IS_EQUAL expr expr_prime {System.out.println("Operator : " + "==");}
//	| {String sv_token;} (LT {sv_token = "Operator : " + "<";}  | GT {sv_token = "Operator : " + ">";} ) expr expr_prime {System.out.println(sv_token);}
//	| {String sv_token;} (MINUS {sv_token = "Operator : " + "-";}  | PLUS {sv_token = "Operator : " + "+";} ) expr expr_prime {System.out.println(sv_token);}
//	| {String sv_token;} (DIVIDE {sv_token = "Operator : " + "/";}  | TIMES {sv_token = "Operator : " + "*";} )  expr expr_prime {System.out.println(sv_token);}
//	| expr {System.out.println("Operator : " + "++");} PLUS_PLUS expr_prime
//    | expr {System.out.println("Operator : " + "--");} MINUS_MINUS expr_prime
//    |
//	;
//
//ternary_condition
//	: ( assigment expr_prime
//       	| var expr_prime
//       	| set_op expr_prime
//       	| {String sv_token;} (MINUS {sv_token = "Operator : " + "-";}  | NOT {sv_token = "Operator : " + "!";} ) expr expr_prime {System.out.println(sv_token);}
//       	| (NUM | BOOL_VALUE) expr_prime
//       	| LPAR expr RPAR expr_prime
//       	) QUESTION_MARK expr COLON expr ternary_prime
//    ;
//
//ternary_prime
//	: expr_prime QUESTION_MARK expr COLON expr {System.out.println("Operator : :?");} ternary_prime
//	|
//

expr
    : ternery_expr EQUAL expr {System.out.println("Operator : =");}
    | ternery_expr
    ;

ternery_expr
    : ternery_expr QUESTION_MARK ternery_expr COLON or_or_expr {System.out.println("Operator : ?:");}
    | or_or_expr
    ;

or_or_expr
    : or_or_expr OR_OR and_and_expr {System.out.println("Operator : ||");}
    | and_and_expr
    ;

and_and_expr
    :   and_and_expr AND_AND is_equal_expr {System.out.println("Operator : &&");}
    |    is_equal_expr
    ;

is_equal_expr
    :   is_equal_expr IS_EQUAL comp_expr {System.out.println("Operator : ==");}
    | comp_expr
    ;

comp_expr
    :   comp_expr LT sn_expr {System.out.println("Operator : <");}
    |   comp_expr GT sn_expr {System.out.println("Operator : >");}
    | sn_expr
    ;

sn_expr
    :  sn_expr PLUS md_expr {System.out.println("Operator : +");}
    | sn_expr MINUS md_expr {System.out.println("Operator : -");}
    | md_expr
    ;

md_expr
    :   md_expr TIMES single_expr {System.out.println("Operator : *");}
    | md_expr DIVIDE single_expr {System.out.println("Operator : /");}
    | single_expr
    ;

single_expr
    :   NOT single_expr {System.out.println("Operator : !");}
    | MINUS single_expr {System.out.println("Operator : -");}
    | inneg_expr
    ;

inneg_expr
    : inneg_expr PLUS_PLUS {System.out.println("Operator : ++");}
    | inneg_expr MINUS_MINUS {System.out.println("Operator : --");}
    | arr_expr
    ;

arr_expr
    : arr_expr  LBRACK dot_expr RBRACK
    | dot_expr
    | LBRACK dot_expr RBRACK
    ;

dot_expr:
      set_op
    | dot_expr DOT par_expr
    | par_expr
    ;

par_expr:
    LPAR expr RPAR
    | name_expr
    | par_expr LPAR RPAR
    ;

name_expr
    :   NEW_WORD | BOOL | STRING | SMALL_NAME | CAP_NAME | SET | VAR_DEC | NUM | var | BOOL_VALUE | func_var
    ;

sequence
	: LPAR expr DOT DOT expr RPAR
	;

my_new
	: CAP_NAME DOT NEW_WORD LPAR func_input? RPAR
	;

func_input
	:
		expr (COMMA func_input)?
	;

my_return
	: RETURN {System.out.println("Return");} expr
	;

var
	: SMALL_NAME ext?
	| SELF_SMALL_NAME ext?
	| LPAR SMALL_NAME RPAR ext?
	| LPAR SELF_SMALL_NAME RPAR ext?
	;

ext
	: LBRACK expr RBRACK ext?
	| DOT SMALL_NAME ext?
	| DOT (SMALL_NAME | INIT) LPAR func_input? RPAR ext?
	| LPAR func_input? RPAR ext?
	;

const_expr
	: LPAR const_expr RPAR const_expr_prime
	| (NUM | BOOL_VALUE) const_expr_prime
	| MINUS const_expr const_expr_prime
	| NOT const_expr const_expr_prime
	;

const_expr_prime
	: PLUS_PLUS const_expr_prime
    | MINUS_MINUS const_expr_prime
    | (TIMES | DIVIDE) const_expr const_expr_prime
    | (PLUS | MINUS) const_expr const_expr_prime
    | (LT | GT) const_expr const_expr_prime
    | IS_EQUAL const_expr const_expr_prime
    | AND_AND const_expr const_expr_prime
    | QUESTION_MARK const_expr COLON const_expr const_expr_prime
    |
    ;


WS:
    [ \t]-> skip
    ;

ONELINE_COMMENT
    :   '#' ~[\r\n]* -> skip
    ;

RETURN
	: 'return'
	;

PRINT
	: 'print'
	;

DO
	: 'do'
	;

BOOL_VALUE
	: 'true'|'false'
	;

IF
	: 'if'
	;

ELSE

    : 'else'
    ;

ELSE_IF
    : 'elsif'
    ;

INIT:
	'initialize'
	;

EACH
	: 'each'
	;

INT
	: 'int'
	;

NEW_WORD
	: 'new'
	;

DIVIDE
     :'/'
     ;

TIMES
    :'*'
    ;

PLUS:
    '+'
    ;

MINUS:
    '-'
    ;

BOOL
	: 'bool'
	;
VOID
	: 'void'
	;
FPTR
	: 'fptr'
	;

PLUS_PLUS
    : '++'
    ;

MINUS_MINUS
    : '--'
    ;

QUESTION_MARK
    : '?'
    ;

COLON
    : ':'
    ;

COMMA
	: ','
	;

NOT
	: '!'
	;

ABS_SIGN
	: '|'
	;

CLASS
	: 'class'
	;
SELF_SMALL_NAME
	: 'self.'([a-z]'_')([a-z]|[0-9]|'_'| [A-Z])*
	;

ACCESS_TYPE
	: 'private'
	| 'public'
	;

RBRACK
	: ']'
	;
LBRACK
	: '['
	;

LCURL
	: '{'
	;
RCURL
	: '}'
	;

LPAR
	: '('
	;
RPAR
	: ')'
	;

ARROW
	:
	'->';

NEW_LINE
    : [\n\r]
    | ';'
    ;

BEGIN_COMMENT
	: '=begin'
	;
END_COMMENT
	: '=end'
	;

LT
	: '<'
	;
GT
	: '>'
	;

IS_EQUAL
	: '=='
	;

EQUAL
	: '='
	;

DOT
	: '.'
	;

SHARP_SIGN
	: '#'
	;

SET
	: 'Set'
	;

CAP_NAME:
	[A-Z]([a-z]|[0-9]|'_' | [A-Z])*
	;

NUM:
    [0-9]+
    ;

ADD
	: 'add'
	;
MERGE
	: 'merge'
	;
INCLUDE
	: 'include'
	;
DELETE
	: 'delete'
	;

SMALL_NAME:
	([a-z]|'_')([a-z]|[0-9]|'_'| [A-Z])*
	;

AND_AND:
	'&&'
	;

OR_OR:
	'||'
	;

Unknown :  ;