// Generated from /home/c/University/Term6/Compiler Designe/projects/SimpleLOOP/src/main/grammar/test.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(testParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(testParser.TokenContext ctx);
}