grammar SimpleLOOP;

simple_loop
    : start_prog? ';'? EOF
    ;

start_prog
	: var_dec NEW_LINE+ start_prog
	| comment NEW_LINE+ start_prog
	| class_dec NEW_LINE+ prog_body
	| NEW_LINE+ start_prog
	| var_dec
	| comment
	| class_dec
	|
	;

var_dec
	: (INT | BOOL | CAP_NAME | set_dec | func_var) (LBRACK expr RBRACK)* SMALL_NAME (COMMA SMALL_NAME)*
	;

comment
	: SHARP_SIGN .*
	| BEGIN_COMMENT NEW_LINE+ .* NEW_LINE+ END_COMMENT
	;

class_dec
	: CLASS CAP_NAME (LT CAP_NAME)? NEW_LINE* LCURL (NEW_LINE+ begin_class)? NEW_LINE+ RCURL
	| CLASS CAP_NAME (LT CAP_NAME)? NEW_LINE* (comment | ACCESS_TYPE var_dec | ACCESS_TYPE init_dec | ACCESS_TYPE func_dec)
	;

prog_body
	: class_dec NEW_LINE+ prog_body
	| comment NEW_LINE+ prog_body
	| NEW_LINE+ prog_body
	| class_dec
	| comment
	|
	;

set_dec
	: SET LT INT GT
	;

func_var
	: FPTR LT (VOID | INT | BOOL | CAP_NAME | set_dec | func_var) (COMMA (VOID | INT | BOOL | CAP_NAME | set_dec | func_var))* ARROW (VOID | INT | BOOL | CAP_NAME | set_dec) GT
	;

begin_class
	: comment NEW_LINE+ begin_class
	| ACCESS_TYPE var_dec NEW_LINE+ begin_class
	| init_dec NEW_LINE+ begin_class
	| func_dec NEW_LINE+ begin_class
	| comment
	| ACCESS_TYPE var_dec
	| init_dec
	| func_dec
	;

init_dec
	: ACCESS_TYPE INIT LPAR argumants? RPAR NEW_LINE* LCURL (NEW_LINE+ init_begin)? NEW_LINE+ RCURL
	;

init_begin
	: comment NEW_LINE+ init_begin
    | var_dec NEW_LINE+ init_begin
    | scop_body
    | comment
    | var_dec
    ;

func_dec
	: ACCESS_TYPE (VOID | INT | BOOL | set_dec | CAP_NAME) SMALL_NAME LPAR argumants? RPAR NEW_LINE* LCURL (NEW_LINE+ func_begin)? NEW_LINE+ RCURL
	| ACCESS_TYPE (VOID | INT | BOOL | set_dec | CAP_NAME) SMALL_NAME LPAR argumants? RPAR NEW_LINE+ line_command
	;

argumants
	: (INT | BOOL | CAP_NAME | set_dec | func_var) (LBRACK expr RBRACK)* SMALL_NAME (COMMA argumants)?
	| default_argumants
	;

default_argumants
	: INT SMALL_NAME EQUAL expr (COMMA default_argumants)?
	| BOOL SMALL_NAME EQUAL expr (COMMA default_argumants)?
	;

func_begin
	: comment NEW_LINE+ func_begin
	| var_dec NEW_LINE+ func_begin
	| scop_body
	| comment
	| var_dec
	;

scop_body
	: comment NEW_LINE+ scop_body
	| line_command NEW_LINE+ scop_body
	| line_command
	| comment
	;

line_command
	: if_state
	| for_loop
	| print
	| expr
	| my_return
	;

if_state
	: IF expr NEW_LINE+ line_command NEW_LINE+  (my_else | else_if)
	| IF expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL NEW_LINE+ (my_else | else_if)
	| IF expr NEW_LINE+ line_command
	| IF expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL
	;

my_else
 	: ELSE NEW_LINE+ line_command
    | ELSE NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL
	;

else_if
	: ELSE_IF expr NEW_LINE+ line_command NEW_LINE+  (my_else | else_if)
	| ELSE_IF expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+ RCURL NEW_LINE+ (my_else | else_if)
	| ELSE_IF expr NEW_LINE+ line_command
	| ELSE_IF expr NEW_LINE* LCURL NEW_LINE+ scop_body? NEW_LINE+  RCURL
	;

for_loop
	: (var | sequence) DOT EACH DO ABS_SIGN var ABS_SIGN NEW_LINE+ line_command
	| (var | sequence) DOT EACH DO ABS_SIGN var ABS_SIGN NEW_LINE* LCURL (NEW_LINE+ scop_body)? NEW_LINE+ RCURL
	;

assigment
	: var EQUAL expr
	| var EQUAL my_new
	| var PLUS_PLUS
	| var MINUS_MINUS
	| var EQUAL expr
    | var EQUAL my_new
    | var PLUS_PLUS
    | var MINUS_MINUS
	;

print
	: PRINT LPAR expr RPAR
	;

expr
	: LPAR expr RPAR expr_prime
	| (MINUS | NOT) expr expr_prime
	| (NUM | BOOL_VALUE) expr_prime
	| var expr_prime
	| assigment expr_prime
	;

expr_prime
	: (MINUS_MINUS | PLUS_PLUS) expr_prime
	| (DIVIDE | TIMES) expr expr_prime
    | (MINUS | PLUS) expr expr_prime
    | (LT | GT) expr expr_prime
    | IS_EQUAL expr expr_prime
    | AND_AND expr expr_prime
    | OR_OR expr expr_prime
	| QUESTION_MARK line_command COLON line_command expr_prime
	|
	;
sequence
	: LPAR expr DOT DOT expr RPAR
	;

my_new
	: (CAP_NAME|SET) DOT NEW_WORD LPAR func_input? RPAR
	;

func_input
	:
		expr (COMMA func_input)?
	;

my_return
	: RETURN expr
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
	: 'self.'([a-z]'_')([a-z]|[0-9]|'_')*
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
    | ';'[\n\r]
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
	[A-Z]([a-z]|[0-9]|'_')*
	;

NUM:
    [0-9]+
    ;

SMALL_NAME:
	([a-z]|'_')([a-z]|[0-9]|'_')*
	;

AND_AND:
	'&&'
	;

OR_OR:
	'||'
	;