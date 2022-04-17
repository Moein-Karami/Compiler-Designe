// Generated from /home/c/University/Term6/Compiler Designe/projects/SimpleLOOP/src/main/grammar/SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLOOPParser}.
 */
public interface SimpleLOOPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#simple_loop}.
	 * @param ctx the parse tree
	 */
	void enterSimple_loop(SimpleLOOPParser.Simple_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#simple_loop}.
	 * @param ctx the parse tree
	 */
	void exitSimple_loop(SimpleLOOPParser.Simple_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#start_prog}.
	 * @param ctx the parse tree
	 */
	void enterStart_prog(SimpleLOOPParser.Start_progContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#start_prog}.
	 * @param ctx the parse tree
	 */
	void exitStart_prog(SimpleLOOPParser.Start_progContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(SimpleLOOPParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(SimpleLOOPParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SimpleLOOPParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SimpleLOOPParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#class_dec}.
	 * @param ctx the parse tree
	 */
	void enterClass_dec(SimpleLOOPParser.Class_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#class_dec}.
	 * @param ctx the parse tree
	 */
	void exitClass_dec(SimpleLOOPParser.Class_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#prog_body}.
	 * @param ctx the parse tree
	 */
	void enterProg_body(SimpleLOOPParser.Prog_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#prog_body}.
	 * @param ctx the parse tree
	 */
	void exitProg_body(SimpleLOOPParser.Prog_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#set_dec}.
	 * @param ctx the parse tree
	 */
	void enterSet_dec(SimpleLOOPParser.Set_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#set_dec}.
	 * @param ctx the parse tree
	 */
	void exitSet_dec(SimpleLOOPParser.Set_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#func_var}.
	 * @param ctx the parse tree
	 */
	void enterFunc_var(SimpleLOOPParser.Func_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#func_var}.
	 * @param ctx the parse tree
	 */
	void exitFunc_var(SimpleLOOPParser.Func_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#begin_class}.
	 * @param ctx the parse tree
	 */
	void enterBegin_class(SimpleLOOPParser.Begin_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#begin_class}.
	 * @param ctx the parse tree
	 */
	void exitBegin_class(SimpleLOOPParser.Begin_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#init_dec}.
	 * @param ctx the parse tree
	 */
	void enterInit_dec(SimpleLOOPParser.Init_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#init_dec}.
	 * @param ctx the parse tree
	 */
	void exitInit_dec(SimpleLOOPParser.Init_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#init_begin}.
	 * @param ctx the parse tree
	 */
	void enterInit_begin(SimpleLOOPParser.Init_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#init_begin}.
	 * @param ctx the parse tree
	 */
	void exitInit_begin(SimpleLOOPParser.Init_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dec(SimpleLOOPParser.Func_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dec(SimpleLOOPParser.Func_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#argumants}.
	 * @param ctx the parse tree
	 */
	void enterArgumants(SimpleLOOPParser.ArgumantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#argumants}.
	 * @param ctx the parse tree
	 */
	void exitArgumants(SimpleLOOPParser.ArgumantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#default_argumants}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argumants(SimpleLOOPParser.Default_argumantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#default_argumants}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argumants(SimpleLOOPParser.Default_argumantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#func_begin}.
	 * @param ctx the parse tree
	 */
	void enterFunc_begin(SimpleLOOPParser.Func_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#func_begin}.
	 * @param ctx the parse tree
	 */
	void exitFunc_begin(SimpleLOOPParser.Func_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#scop_body}.
	 * @param ctx the parse tree
	 */
	void enterScop_body(SimpleLOOPParser.Scop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#scop_body}.
	 * @param ctx the parse tree
	 */
	void exitScop_body(SimpleLOOPParser.Scop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#line_command}.
	 * @param ctx the parse tree
	 */
	void enterLine_command(SimpleLOOPParser.Line_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#line_command}.
	 * @param ctx the parse tree
	 */
	void exitLine_command(SimpleLOOPParser.Line_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#if_state}.
	 * @param ctx the parse tree
	 */
	void enterIf_state(SimpleLOOPParser.If_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#if_state}.
	 * @param ctx the parse tree
	 */
	void exitIf_state(SimpleLOOPParser.If_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#my_else}.
	 * @param ctx the parse tree
	 */
	void enterMy_else(SimpleLOOPParser.My_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#my_else}.
	 * @param ctx the parse tree
	 */
	void exitMy_else(SimpleLOOPParser.My_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(SimpleLOOPParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(SimpleLOOPParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(SimpleLOOPParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(SimpleLOOPParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SimpleLOOPParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SimpleLOOPParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(SimpleLOOPParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(SimpleLOOPParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleLOOPParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleLOOPParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleLOOPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleLOOPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#expr_prime}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prime(SimpleLOOPParser.Expr_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#expr_prime}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prime(SimpleLOOPParser.Expr_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(SimpleLOOPParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(SimpleLOOPParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#my_new}.
	 * @param ctx the parse tree
	 */
	void enterMy_new(SimpleLOOPParser.My_newContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#my_new}.
	 * @param ctx the parse tree
	 */
	void exitMy_new(SimpleLOOPParser.My_newContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#func_input}.
	 * @param ctx the parse tree
	 */
	void enterFunc_input(SimpleLOOPParser.Func_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#func_input}.
	 * @param ctx the parse tree
	 */
	void exitFunc_input(SimpleLOOPParser.Func_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#my_return}.
	 * @param ctx the parse tree
	 */
	void enterMy_return(SimpleLOOPParser.My_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#my_return}.
	 * @param ctx the parse tree
	 */
	void exitMy_return(SimpleLOOPParser.My_returnContext ctx);
}