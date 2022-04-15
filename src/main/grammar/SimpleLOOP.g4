grammar SimpleLOOP;

simple_loop
    : start_prog? EOF
    ;

start_prog
	: var_dec start_prog
	| comment start_prog
	| class_dec prog_body
	| NEW_LINE
	;

var_dec
	: (INT + BOOL + CAP_NAME + set_dec + func_var) SMALL_NAME (COMMA SMALL_NAME)* NEW_LINE
	| (INT + BOOL + CAP_NAME + set_dec) (LBRACK NUM RBRACK)+ SMALL_NAME (COMMA SMALL_NAME)* NEW_LINE
	;

comment
	: SHARP_SIGN [^'\n']* NEW_LINE
	| BEGIN_COMMENT NEW_LINE .* NEW_LINE END_COMMENT NEW_LINE
	;

class_dec
	: CLASS CAP_NAME (LT CAP_NAME)? L_CURL NEW_LINE begin_class
	;

prog_body
	: class_dec prog_body
	| comment prog_body
	;

set_dec
	: SET LT INT GT SMALL_NAME (COMMA SMALL_NAME)* NEW_LINE
	;

func_var
	: FPTR T (VOID + INT + BOOL + CAP_NAME + set_dec) ARROW (VOID + INT + BOOL + CAP_NAME + set_dec) SMALL_NAME (COMMA SMALL_NAME)*
	;

begin_class
	: comment begin_class
	| ACCESS_TYPE var_dec begin_class
	| init_dec class_body
	| func_dec class_body
	| RCURL NEW_LINE NEW_LINE
	;

init_dec
	: ACCESS_TYPE INIT LPAR argumants? RPAR LCURL NEW_LINE init_begin
	;

init_begin
	: comment init_begin
    | var_dec init_begin
    | func_boddy
    | self_var_dec
    ;

self_var_dec
	: (INT + BOOL + CAP_NAME + set_dec + func_var) self_var (COMMA SMALL_NAME)* NEW_LINE
    | (INT + BOOL + CAP_NAME + set_dec) (LBRACK NUM RBRACK)+ self_var (COMMA SMALL_NAME)* NEW_LINE
    ;

self_var
	: SMALL_NAME
	| SELF_SMALL_NAME
	;

class_body
	: func_dec class_body
	| RPAR NEW_LINE NEW_LINE
	;

func_dec
	: ACCESS_TYPE (VOID + INT + BOOL + set_dec + CAP_NAME) SMALL_NAME LPAR argumants RPAR LCURL NEW_LINE func_begin
	;

arguments
	: (INT + BOOL + CAP_NAME + set_dec + func_var) SMALL_NAME (COMMA arguments)?
	| default_arguments
	;

default_argumets
	: INT SMALL_NAME EQUAL (NUMBER + SMALL_NAME) (COMMA default_argumets)?
	| BOOL SMALL_NAME EQUAL (NUMBER + BOOL_VALUE) (COMMA default_argumets)?
	;

func_begin
	: comment func_begin
	| var_dec func_begin
	| func_boddy
	;

func_body
	: RCURL NEW_LINE
	| scop_body func_body
	| return func_body
	;

scop_body
	: if_state scop_body
	| for_loop scop_body
	| function_call scop_body
	| assigment scop_body
	| print scop_body
	| set_op scop_body
	;

if_state
	: IF conditions NEW_LINE line_command NEW_LINE (else + else_if)?
	| IF conditions LCURL NEW_LINE scop_body RCURL NEW_LINE (else + else_if)?
	;

for_loop
	: (SMALL_NAME + sequence) DOT EACH DO ABS_SIGN self_var ABS_SIGN NEW_LINE line_command NEW_LINE
	| SMALL_NAME + sequence) DOT EACH DO ABS_SIGN self_var ABS_SIGN LCURL NEW_LINE scop_body RCURL NEW_LINE
	;

function_call
	: SMALL_NAME LPAR func_input RPAR NEW_LINE
	;

assigment
	: SMALL_NAME EQUAL expr NEW_LINE
	| SMALL_NAME EQUAL new NEW_LINE
	;

conditions
	: (NOT? expr)
	|
