grammar SimpleLOOP;

simple_loop
    : start_prog? EOF
    ;

start_prog
	: var_dec NEW_LINE start_prog
	| comment NEW_LINE start_prog
	| class_dec NEW_LINE prog_body
	| NEW_LINE start_prog
	|
	;

var_dec
	: (INT | BOOL | CAP_NAME | set_dec | func_var) SMALL_NAME (COMMA SMALL_NAME)*
	| (INT | BOOL | CAP_NAME | set_dec) (LBRACK NUM RBRACK)+ SMALL_NAME (COMMA SMALL_NAME)*
	;

comment
	: SHARP_SIGN .*
	| BEGIN_COMMENT NEW_LINE .* NEW_LINE END_COMMENT
	;

class_dec
	: CLASS CAP_NAME (LT CAP_NAME)? LCURL (NEW_LINE begin_class)? NEW_LINE RCURL
	;

prog_body
	: class_dec NEW_LINE prog_body
	| comment NEW_LINE prog_body
	| NEW_LINE prog_body
	|
	;

set_dec
	: SET LT INT GT
	;

func_var
	: FPTR LT (VOID | INT | BOOL | CAP_NAME | set_dec) ARROW (VOID | INT | BOOL | CAP_NAME | set_dec) RT SMALL_NAME (COMMA SMALL_NAME)*
	;

begin_class
	: comment NEW_LINE begin_class
	| ACCESS_TYPE var_dec NEW_LINE begin_class
	| init_dec NEW_LINE begin_class
	| func_dec NEW_LINE begin_class
	| comment
	| ACCESS_TYPE var_dec
	| init_dec
	| func_dec
	;

init_dec
	: ACCESS_TYPE INIT LPAR argumants? RPAR LCURL (NEW_LINE init_begin)? NEW_LINE RCURL
	;

init_begin
	: comment NEW_LINE init_begin
    | var_dec NEW_LINE init_begin
    | scop_body
    | comment
    | var_dec
    ;

func_dec
	: ACCESS_TYPE (VOID | INT | BOOL | set_dec | CAP_NAME) SMALL_NAME LPAR argumants? RPAR LCURL (NEW_LINE func_begin)? NEW_LINE RCURL
	;

argumants
	: (INT | BOOL | CAP_NAME | set_dec | func_var) SMALL_NAME (COMMA argumants)?
	| default_argumants
	;

default_argumants
	: INT SMALL_NAME EQUAL (NUM | SMALL_NAME) (COMMA default_argumants)?
	| BOOL SMALL_NAME EQUAL (NUM | BOOL_VALUE) (COMMA default_argumants)?
	;

func_begin
	: comment NEW_LINE func_begin
	| var_dec NEW_LINE func_begin
	| scop_body
	| comment
	| var_dec
	;

scop_body
	: line_command NEW_LINE scop_body
	| line_command
	;

line_command
	: if_state
	| for_loop
	| function_call
	| print
	| expr
	| my_return
	;

if_state
	: IF expr NEW_LINE line_command NEW_LINE  (my_else | else_if)
	| IF expr LCURL NEW_LINE scop_body? RCURL NEW_LINE (my_else | else_if)
	| IF expr NEW_LINE line_command
	| IF expr LCURL NEW_LINE scop_body? RCURL
	;

my_else
 	: ELSE expr NEW_LINE line_command
    | ELSE expr LCURL NEW_LINE scop_body? RCURL
	;

else_if
	: ELSE_IF expr NEW_LINE line_command NEW_LINE  (my_else | else_if)
	| ELSE_IF expr LCURL NEW_LINE scop_body? RCURL NEW_LINE (my_else | else_if)
	| ELSE_IF expr NEW_LINE line_command
	| ELSE_IF expr LCURL NEW_LINE scop_body? RCURL
	;

for_loop
	: (SMALL_NAME + sequence) DOT EACH DO ABS_SIGN SMALL_NAME ABS_SIGN NEW_LINE line_command
	| (SMALL_NAME + sequence) DOT EACH DO ABS_SIGN SMALL_NAME ABS_SIGN LCURL (NEW_LINE scop_body)? RCURL NEW_LINE
	;

function_call
	: SMALL_NAME DOT SMALL_NAME LPAR func_input? RPAR
	| SELF_SMALL_NAME DOT SMALL_NAME LPAR func_input? RPAR
	;

assigment
	: SMALL_NAME EQUAL expr
	| SMALL_NAME EQUAL my_new
	| SMALL_NAME PLUS_PLUS
	| SMALL_NAME MINUS_MINUS
	| SELF_SMALL_NAME EQUAL expr
    | SELF_SMALL_NAME EQUAL my_new
    | SELF_SMALL_NAME PLUS_PLUS
    | SELF_SMALL_NAME MINUS_MINUS
	;

print
	: PRINT LPAR expr RPAR
	;

expr
	: LPAR expr RPAR expr_prime
	| (MINUS | NOT) expr expr_prime
	| NUMBER expr_prime
	| function_call expr_prime
	| SMALL_NAME expr_prime
	| SELF_SMALL_NAME expr_prime
	| assigment expr_prime
	;

expr_prime
	:  (DIVIDE | TIMES) expr expr_prime
    |  (MINUS | PLUS) expr expr_prime
    |  (LT | GT) expr expr_prime
    |  IS_EQUAL expr expr_prime
    |  AND_AND expr expr_prime
    |  OR_OR expr expr_prime
	|  QUESTION_MARK line_command COLON line_command expr_prime
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
	| expr (COMMA func_input)?
	;

my_return
	: RETURN expr
	;

RETURN
	: 'return'
	;

PRINT
	: 'print'
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
     :'\\'
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
	: 'self.'[a-z]([a-z]|[0-9]|'_')*
	;

ACCESS_TYPE
	: 'private'
	| 'public'
	;

RBACK
	: '['
	;
LBACK
	: ']'
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
    : ('\n')+
    | ';'('\n')+;

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

WS:
    (' '|'\t'|'\r') -> skip
    ;