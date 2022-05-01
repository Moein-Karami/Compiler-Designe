// Generated from /home/c/University/Term6/Compiler Designe/projects/SimpleLOOP/src/main/grammar/SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLOOPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLOOPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#simpleLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleLoop(SimpleLOOPParser.SimpleLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#start_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_prog(SimpleLOOPParser.Start_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(SimpleLOOPParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SimpleLOOPParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#class_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_dec(SimpleLOOPParser.Class_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#prog_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_body(SimpleLOOPParser.Prog_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#set_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_dec(SimpleLOOPParser.Set_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#set_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_op(SimpleLOOPParser.Set_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#loop_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_arr(SimpleLOOPParser.Loop_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#func_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_var(SimpleLOOPParser.Func_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#begin_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_class(SimpleLOOPParser.Begin_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#init_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_dec(SimpleLOOPParser.Init_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#init_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_begin(SimpleLOOPParser.Init_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#func_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dec(SimpleLOOPParser.Func_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#argumants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumants(SimpleLOOPParser.ArgumantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#default_argumants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argumants(SimpleLOOPParser.Default_argumantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#func_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_begin(SimpleLOOPParser.Func_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#scop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScop_body(SimpleLOOPParser.Scop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#line_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_command(SimpleLOOPParser.Line_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(SimpleLOOPParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#if_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_state(SimpleLOOPParser.If_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#my_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMy_else(SimpleLOOPParser.My_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(SimpleLOOPParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(SimpleLOOPParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SimpleLOOPParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleLOOPParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#ternery_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernery_expr(SimpleLOOPParser.Ternery_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#or_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_or_expr(SimpleLOOPParser.Or_or_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#and_and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_and_expr(SimpleLOOPParser.And_and_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#is_equal_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_equal_expr(SimpleLOOPParser.Is_equal_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#comp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_expr(SimpleLOOPParser.Comp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#sn_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSn_expr(SimpleLOOPParser.Sn_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#md_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd_expr(SimpleLOOPParser.Md_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#single_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expr(SimpleLOOPParser.Single_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#inneg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInneg_expr(SimpleLOOPParser.Inneg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#arr_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_expr(SimpleLOOPParser.Arr_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#dot_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_expr(SimpleLOOPParser.Dot_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#par_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_expr(SimpleLOOPParser.Par_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#name_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_expr(SimpleLOOPParser.Name_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(SimpleLOOPParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#my_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMy_new(SimpleLOOPParser.My_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#func_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_input(SimpleLOOPParser.Func_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#my_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMy_return(SimpleLOOPParser.My_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SimpleLOOPParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#ext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExt(SimpleLOOPParser.ExtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr(SimpleLOOPParser.Const_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#const_expr_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_prime(SimpleLOOPParser.Const_expr_primeContext ctx);
}