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
	 * Visit a parse tree produced by {@link SimpleLOOPParser#simple_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_loop(SimpleLOOPParser.Simple_loopContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLOOPParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SimpleLOOPParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(SimpleLOOPParser.AssigmentContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLOOPParser#expr_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prime(SimpleLOOPParser.Expr_primeContext ctx);
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
}