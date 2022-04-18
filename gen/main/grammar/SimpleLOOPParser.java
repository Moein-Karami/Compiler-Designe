// Generated from /home/c/University/Term6/Compiler Designe/projects/SimpleLOOP/src/main/grammar/SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLOOPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RETURN=1, PRINT=2, BOOL_VALUE=3, IF=4, ELSE=5, ELSE_IF=6, INIT=7, EACH=8, 
		INT=9, NEW_WORD=10, DIVIDE=11, TIMES=12, PLUS=13, MINUS=14, BOOL=15, VOID=16, 
		FPTR=17, PLUS_PLUS=18, MINUS_MINUS=19, QUESTION_MARK=20, COLON=21, COMMA=22, 
		NOT=23, ABS_SIGN=24, CLASS=25, SELF_SMALL_NAME=26, ACCESS_TYPE=27, RBACK=28, 
		LBACK=29, LCURL=30, RCURL=31, LPAR=32, RPAR=33, ARROW=34, NEW_LINE=35, 
		BEGIN_COMMENT=36, END_COMMENT=37, LT=38, GT=39, EQUAL=40, DOT=41, SHARP_SIGN=42, 
		SET=43, CAP_NAME=44, NUM=45, SMALL_NAME=46, WS=47, LBRACK=48, RBRACK=49, 
		RT=50, DO=51, NUMBER=52, IS_EQUAL=53, AND_AND=54, OR_OR=55;
	public static final int
		RULE_simple_loop = 0, RULE_start_prog = 1, RULE_var_dec = 2, RULE_comment = 3, 
		RULE_class_dec = 4, RULE_prog_body = 5, RULE_set_dec = 6, RULE_func_var = 7, 
		RULE_begin_class = 8, RULE_init_dec = 9, RULE_init_begin = 10, RULE_func_dec = 11, 
		RULE_argumants = 12, RULE_default_argumants = 13, RULE_func_begin = 14, 
		RULE_scop_body = 15, RULE_line_command = 16, RULE_if_state = 17, RULE_my_else = 18, 
		RULE_else_if = 19, RULE_for_loop = 20, RULE_function_call = 21, RULE_assigment = 22, 
		RULE_print = 23, RULE_expr = 24, RULE_expr_prime = 25, RULE_sequence = 26, 
		RULE_my_new = 27, RULE_func_input = 28, RULE_my_return = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"simple_loop", "start_prog", "var_dec", "comment", "class_dec", "prog_body", 
			"set_dec", "func_var", "begin_class", "init_dec", "init_begin", "func_dec", 
			"argumants", "default_argumants", "func_begin", "scop_body", "line_command", 
			"if_state", "my_else", "else_if", "for_loop", "function_call", "assigment", 
			"print", "expr", "expr_prime", "sequence", "my_new", "func_input", "my_return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'print'", null, "'if'", "'else'", "'elsif'", "'initialize'", 
			"'each'", "'int'", "'new'", "'\\'", "'*'", "'+'", "'-'", "'bool'", "'void'", 
			"'fptr'", "'++'", "'--'", "'?'", "':'", "','", "'!'", "'|'", "'class'", 
			null, null, "']'", "'['", "'{'", "'}'", "'('", "')'", "'->'", null, "'=begin'", 
			"'=end'", "'<'", "'>'", "'='", "'.'", "'#'", "'Set'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RETURN", "PRINT", "BOOL_VALUE", "IF", "ELSE", "ELSE_IF", "INIT", 
			"EACH", "INT", "NEW_WORD", "DIVIDE", "TIMES", "PLUS", "MINUS", "BOOL", 
			"VOID", "FPTR", "PLUS_PLUS", "MINUS_MINUS", "QUESTION_MARK", "COLON", 
			"COMMA", "NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", "ACCESS_TYPE", 
			"RBACK", "LBACK", "LCURL", "RCURL", "LPAR", "RPAR", "ARROW", "NEW_LINE", 
			"BEGIN_COMMENT", "END_COMMENT", "LT", "GT", "EQUAL", "DOT", "SHARP_SIGN", 
			"SET", "CAP_NAME", "NUM", "SMALL_NAME", "WS", "LBRACK", "RBRACK", "RT", 
			"DO", "NUMBER", "IS_EQUAL", "AND_AND", "OR_OR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleLOOP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLOOPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Simple_loopContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLOOPParser.EOF, 0); }
		public Start_progContext start_prog() {
			return getRuleContext(Start_progContext.class,0);
		}
		public Simple_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSimple_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSimple_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSimple_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_loopContext simple_loop() throws RecognitionException {
		Simple_loopContext _localctx = new Simple_loopContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simple_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(60);
				start_prog();
				}
				break;
			}
			setState(63);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_progContext extends ParserRuleContext {
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Start_progContext start_prog() {
			return getRuleContext(Start_progContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Class_decContext class_dec() {
			return getRuleContext(Class_decContext.class,0);
		}
		public Prog_bodyContext prog_body() {
			return getRuleContext(Prog_bodyContext.class,0);
		}
		public Start_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterStart_prog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitStart_prog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitStart_prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_progContext start_prog() throws RecognitionException {
		Start_progContext _localctx = new Start_progContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_prog);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CAP_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				var_dec();
				setState(66);
				match(NEW_LINE);
				setState(67);
				start_prog();
				}
				break;
			case BEGIN_COMMENT:
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				comment();
				setState(70);
				match(NEW_LINE);
				setState(71);
				start_prog();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				class_dec();
				setState(74);
				match(NEW_LINE);
				setState(75);
				prog_body();
				}
				break;
			case NEW_LINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(NEW_LINE);
				setState(78);
				start_prog();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decContext extends ParserRuleContext {
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public TerminalNode CAP_NAME() { return getToken(SimpleLOOPParser.CAP_NAME, 0); }
		public Set_decContext set_dec() {
			return getRuleContext(Set_decContext.class,0);
		}
		public Func_varContext func_var() {
			return getRuleContext(Func_varContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<TerminalNode> NUM() { return getTokens(SimpleLOOPParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SimpleLOOPParser.NUM, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVar_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_dec);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(82);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(83);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(84);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(85);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(86);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89);
				match(SMALL_NAME);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					match(SMALL_NAME);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(97);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(98);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(99);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(100);
					set_dec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					match(LBRACK);
					setState(104);
					match(NUM);
					setState(105);
					match(RBRACK);
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(110);
				match(SMALL_NAME);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					match(SMALL_NAME);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SHARP_SIGN() { return getToken(SimpleLOOPParser.SHARP_SIGN, 0); }
		public TerminalNode BEGIN_COMMENT() { return getToken(SimpleLOOPParser.BEGIN_COMMENT, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public TerminalNode END_COMMENT() { return getToken(SimpleLOOPParser.END_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		try {
			int _alt;
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(SHARP_SIGN);
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121);
						matchWildcard();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case BEGIN_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(BEGIN_COMMENT);
				setState(128);
				match(NEW_LINE);
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						matchWildcard();
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(135);
				match(NEW_LINE);
				setState(136);
				match(END_COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_decContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SimpleLOOPParser.CLASS, 0); }
		public List<TerminalNode> CAP_NAME() { return getTokens(SimpleLOOPParser.CAP_NAME); }
		public TerminalNode CAP_NAME(int i) {
			return getToken(SimpleLOOPParser.CAP_NAME, i);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public Begin_classContext begin_class() {
			return getRuleContext(Begin_classContext.class,0);
		}
		public Class_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClass_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClass_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClass_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_decContext class_dec() throws RecognitionException {
		Class_decContext _localctx = new Class_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CLASS);
			setState(140);
			match(CAP_NAME);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(141);
				match(LT);
				setState(142);
				match(CAP_NAME);
				}
			}

			setState(145);
			match(LCURL);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(146);
				match(NEW_LINE);
				setState(147);
				begin_class();
				}
				break;
			}
			setState(150);
			match(NEW_LINE);
			setState(151);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prog_bodyContext extends ParserRuleContext {
		public Class_decContext class_dec() {
			return getRuleContext(Class_decContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Prog_bodyContext prog_body() {
			return getRuleContext(Prog_bodyContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Prog_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterProg_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitProg_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitProg_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prog_bodyContext prog_body() throws RecognitionException {
		Prog_bodyContext _localctx = new Prog_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prog_body);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				class_dec();
				setState(154);
				match(NEW_LINE);
				setState(155);
				prog_body();
				}
				break;
			case BEGIN_COMMENT:
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				comment();
				setState(158);
				match(NEW_LINE);
				setState(159);
				prog_body();
				}
				break;
			case NEW_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(NEW_LINE);
				setState(162);
				prog_body();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_decContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
		public Set_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSet_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSet_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSet_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_decContext set_dec() throws RecognitionException {
		Set_decContext _localctx = new Set_decContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_set_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(SET);
			setState(167);
			match(LT);
			setState(168);
			match(INT);
			setState(169);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_varContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode RT() { return getToken(SimpleLOOPParser.RT, 0); }
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public List<TerminalNode> VOID() { return getTokens(SimpleLOOPParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SimpleLOOPParser.VOID, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleLOOPParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleLOOPParser.INT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(SimpleLOOPParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(SimpleLOOPParser.BOOL, i);
		}
		public List<TerminalNode> CAP_NAME() { return getTokens(SimpleLOOPParser.CAP_NAME); }
		public TerminalNode CAP_NAME(int i) {
			return getToken(SimpleLOOPParser.CAP_NAME, i);
		}
		public List<Set_decContext> set_dec() {
			return getRuleContexts(Set_decContext.class);
		}
		public Set_decContext set_dec(int i) {
			return getRuleContext(Set_decContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public Func_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFunc_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFunc_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFunc_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_varContext func_var() throws RecognitionException {
		Func_varContext _localctx = new Func_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FPTR);
			setState(172);
			match(LT);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(173);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(174);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(175);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(176);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(177);
				set_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(180);
			match(ARROW);
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(181);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(182);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(183);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(184);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(185);
				set_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			match(RT);
			setState(189);
			match(SMALL_NAME);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				match(SMALL_NAME);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_classContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Begin_classContext begin_class() {
			return getRuleContext(Begin_classContext.class,0);
		}
		public TerminalNode ACCESS_TYPE() { return getToken(SimpleLOOPParser.ACCESS_TYPE, 0); }
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Init_decContext init_dec() {
			return getRuleContext(Init_decContext.class,0);
		}
		public Func_decContext func_dec() {
			return getRuleContext(Func_decContext.class,0);
		}
		public Begin_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBegin_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBegin_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBegin_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_classContext begin_class() throws RecognitionException {
		Begin_classContext _localctx = new Begin_classContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_begin_class);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				comment();
				setState(198);
				match(NEW_LINE);
				setState(199);
				begin_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(ACCESS_TYPE);
				setState(202);
				var_dec();
				setState(203);
				match(NEW_LINE);
				setState(204);
				begin_class();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				init_dec();
				setState(207);
				match(NEW_LINE);
				setState(208);
				begin_class();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				func_dec();
				setState(211);
				match(NEW_LINE);
				setState(212);
				begin_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(ACCESS_TYPE);
				setState(216);
				var_dec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				init_dec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				func_dec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_decContext extends ParserRuleContext {
		public TerminalNode ACCESS_TYPE() { return getToken(SimpleLOOPParser.ACCESS_TYPE, 0); }
		public TerminalNode INIT() { return getToken(SimpleLOOPParser.INIT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public ArgumantsContext argumants() {
			return getRuleContext(ArgumantsContext.class,0);
		}
		public Init_beginContext init_begin() {
			return getRuleContext(Init_beginContext.class,0);
		}
		public Init_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterInit_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitInit_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitInit_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_decContext init_dec() throws RecognitionException {
		Init_decContext _localctx = new Init_decContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_init_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ACCESS_TYPE);
			setState(222);
			match(INIT);
			setState(223);
			match(LPAR);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
				{
				setState(224);
				argumants();
				}
			}

			setState(227);
			match(RPAR);
			setState(228);
			match(LCURL);
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(229);
				match(NEW_LINE);
				setState(230);
				init_begin();
				}
				break;
			}
			setState(233);
			match(NEW_LINE);
			setState(234);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_beginContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Init_beginContext init_begin() {
			return getRuleContext(Init_beginContext.class,0);
		}
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public Init_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterInit_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitInit_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitInit_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_beginContext init_begin() throws RecognitionException {
		Init_beginContext _localctx = new Init_beginContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_init_begin);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				comment();
				setState(237);
				match(NEW_LINE);
				setState(238);
				init_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				var_dec();
				setState(241);
				match(NEW_LINE);
				setState(242);
				init_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				var_dec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_decContext extends ParserRuleContext {
		public TerminalNode ACCESS_TYPE() { return getToken(SimpleLOOPParser.ACCESS_TYPE, 0); }
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Set_decContext set_dec() {
			return getRuleContext(Set_decContext.class,0);
		}
		public TerminalNode CAP_NAME() { return getToken(SimpleLOOPParser.CAP_NAME, 0); }
		public ArgumantsContext argumants() {
			return getRuleContext(ArgumantsContext.class,0);
		}
		public Func_beginContext func_begin() {
			return getRuleContext(Func_beginContext.class,0);
		}
		public Func_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFunc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFunc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFunc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_decContext func_dec() throws RecognitionException {
		Func_decContext _localctx = new Func_decContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ACCESS_TYPE);
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(250);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(251);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(252);
				match(BOOL);
				}
				break;
			case SET:
				{
				setState(253);
				set_dec();
				}
				break;
			case CAP_NAME:
				{
				setState(254);
				match(CAP_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(257);
			match(SMALL_NAME);
			setState(258);
			match(LPAR);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
				{
				setState(259);
				argumants();
				}
			}

			setState(262);
			match(RPAR);
			setState(263);
			match(LCURL);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(264);
				match(NEW_LINE);
				setState(265);
				func_begin();
				}
				break;
			}
			setState(268);
			match(NEW_LINE);
			setState(269);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumantsContext extends ParserRuleContext {
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public TerminalNode CAP_NAME() { return getToken(SimpleLOOPParser.CAP_NAME, 0); }
		public Set_decContext set_dec() {
			return getRuleContext(Set_decContext.class,0);
		}
		public Func_varContext func_var() {
			return getRuleContext(Func_varContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimpleLOOPParser.COMMA, 0); }
		public ArgumantsContext argumants() {
			return getRuleContext(ArgumantsContext.class,0);
		}
		public Default_argumantsContext default_argumants() {
			return getRuleContext(Default_argumantsContext.class,0);
		}
		public ArgumantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArgumants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArgumants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArgumants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumantsContext argumants() throws RecognitionException {
		ArgumantsContext _localctx = new ArgumantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argumants);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(271);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(272);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(273);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(274);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(275);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278);
				match(SMALL_NAME);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(279);
					match(COMMA);
					setState(280);
					argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				default_argumants();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_argumantsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(SimpleLOOPParser.NUM, 0); }
		public TerminalNode COMMA() { return getToken(SimpleLOOPParser.COMMA, 0); }
		public Default_argumantsContext default_argumants() {
			return getRuleContext(Default_argumantsContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(SimpleLOOPParser.BOOL_VALUE, 0); }
		public Default_argumantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argumants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDefault_argumants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDefault_argumants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDefault_argumants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argumantsContext default_argumants() throws RecognitionException {
		Default_argumantsContext _localctx = new Default_argumantsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_default_argumants);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(INT);
				setState(287);
				match(SMALL_NAME);
				setState(288);
				match(EQUAL);
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==SMALL_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(290);
					match(COMMA);
					setState(291);
					default_argumants();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(BOOL);
				setState(295);
				match(SMALL_NAME);
				setState(296);
				match(EQUAL);
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(298);
					match(COMMA);
					setState(299);
					default_argumants();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_beginContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Func_beginContext func_begin() {
			return getRuleContext(Func_beginContext.class,0);
		}
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public Func_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFunc_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFunc_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFunc_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_beginContext func_begin() throws RecognitionException {
		Func_beginContext _localctx = new Func_beginContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_begin);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				comment();
				setState(305);
				match(NEW_LINE);
				setState(306);
				func_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				var_dec();
				setState(309);
				match(NEW_LINE);
				setState(310);
				func_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				var_dec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scop_bodyContext extends ParserRuleContext {
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public Scop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterScop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitScop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitScop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scop_bodyContext scop_body() throws RecognitionException {
		Scop_bodyContext _localctx = new Scop_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scop_body);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				line_command();
				setState(318);
				match(NEW_LINE);
				setState(319);
				scop_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				line_command();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_commandContext extends ParserRuleContext {
		public If_stateContext if_state() {
			return getRuleContext(If_stateContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public My_returnContext my_return() {
			return getRuleContext(My_returnContext.class,0);
		}
		public Line_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLine_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLine_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLine_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_commandContext line_command() throws RecognitionException {
		Line_commandContext _localctx = new Line_commandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_line_command);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				if_state();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				my_return();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stateContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleLOOPParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public My_elseContext my_else() {
			return getRuleContext(My_elseContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public If_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIf_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIf_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIf_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stateContext if_state() throws RecognitionException {
		If_stateContext _localctx = new If_stateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_state);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(IF);
				setState(333);
				expr();
				setState(334);
				match(NEW_LINE);
				setState(335);
				line_command();
				setState(336);
				match(NEW_LINE);
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(337);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(338);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(IF);
				setState(342);
				expr();
				setState(343);
				match(LCURL);
				setState(344);
				match(NEW_LINE);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SMALL_NAME) | (1L << NUMBER))) != 0)) {
					{
					setState(345);
					scop_body();
					}
				}

				setState(348);
				match(RCURL);
				setState(349);
				match(NEW_LINE);
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(350);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(351);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(IF);
				setState(355);
				expr();
				setState(356);
				match(NEW_LINE);
				setState(357);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(IF);
				setState(360);
				expr();
				setState(361);
				match(LCURL);
				setState(362);
				match(NEW_LINE);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SMALL_NAME) | (1L << NUMBER))) != 0)) {
					{
					setState(363);
					scop_body();
					}
				}

				setState(366);
				match(RCURL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class My_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimpleLOOPParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public My_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMy_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMy_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMy_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final My_elseContext my_else() throws RecognitionException {
		My_elseContext _localctx = new My_elseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_my_else);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(ELSE);
				setState(371);
				expr();
				setState(372);
				match(NEW_LINE);
				setState(373);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(ELSE);
				setState(376);
				expr();
				setState(377);
				match(LCURL);
				setState(378);
				match(NEW_LINE);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SMALL_NAME) | (1L << NUMBER))) != 0)) {
					{
					setState(379);
					scop_body();
					}
				}

				setState(382);
				match(RCURL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(SimpleLOOPParser.ELSE_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public My_elseContext my_else() {
			return getRuleContext(My_elseContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_if);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(ELSE_IF);
				setState(387);
				expr();
				setState(388);
				match(NEW_LINE);
				setState(389);
				line_command();
				setState(390);
				match(NEW_LINE);
				setState(393);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(391);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(392);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(ELSE_IF);
				setState(396);
				expr();
				setState(397);
				match(LCURL);
				setState(398);
				match(NEW_LINE);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SMALL_NAME) | (1L << NUMBER))) != 0)) {
					{
					setState(399);
					scop_body();
					}
				}

				setState(402);
				match(RCURL);
				setState(403);
				match(NEW_LINE);
				setState(406);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(404);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(405);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(ELSE_IF);
				setState(409);
				expr();
				setState(410);
				match(NEW_LINE);
				setState(411);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(ELSE_IF);
				setState(414);
				expr();
				setState(415);
				match(LCURL);
				setState(416);
				match(NEW_LINE);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SMALL_NAME) | (1L << NUMBER))) != 0)) {
					{
					setState(417);
					scop_body();
					}
				}

				setState(420);
				match(RCURL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode EACH() { return getToken(SimpleLOOPParser.EACH, 0); }
		public TerminalNode DO() { return getToken(SimpleLOOPParser.DO, 0); }
		public List<TerminalNode> ABS_SIGN() { return getTokens(SimpleLOOPParser.ABS_SIGN); }
		public TerminalNode ABS_SIGN(int i) {
			return getToken(SimpleLOOPParser.ABS_SIGN, i);
		}
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_loop);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(424);
					match(SMALL_NAME);
					}
					}
					setState(427); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SMALL_NAME );
				setState(429);
				sequence();
				}
				setState(431);
				match(DOT);
				setState(432);
				match(EACH);
				setState(433);
				match(DO);
				setState(434);
				match(ABS_SIGN);
				setState(435);
				match(SMALL_NAME);
				setState(436);
				match(ABS_SIGN);
				setState(437);
				match(NEW_LINE);
				setState(438);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(440);
					match(SMALL_NAME);
					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SMALL_NAME );
				setState(445);
				sequence();
				}
				setState(447);
				match(DOT);
				setState(448);
				match(EACH);
				setState(449);
				match(DO);
				setState(450);
				match(ABS_SIGN);
				setState(451);
				match(SMALL_NAME);
				setState(452);
				match(ABS_SIGN);
				setState(453);
				match(LCURL);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW_LINE) {
					{
					setState(454);
					match(NEW_LINE);
					setState(455);
					scop_body();
					}
				}

				setState(458);
				match(RCURL);
				setState(459);
				match(NEW_LINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public TerminalNode SELF_SMALL_NAME() { return getToken(SimpleLOOPParser.SELF_SMALL_NAME, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SMALL_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(SMALL_NAME);
				setState(464);
				match(DOT);
				setState(465);
				match(SMALL_NAME);
				setState(466);
				match(LPAR);
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(467);
					func_input();
					}
					break;
				}
				setState(470);
				match(RPAR);
				}
				break;
			case SELF_SMALL_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(SELF_SMALL_NAME);
				setState(472);
				match(DOT);
				setState(473);
				match(SMALL_NAME);
				setState(474);
				match(LPAR);
				setState(476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(475);
					func_input();
					}
					break;
				}
				setState(478);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public My_newContext my_new() {
			return getRuleContext(My_newContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SimpleLOOPParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SimpleLOOPParser.MINUS_MINUS, 0); }
		public TerminalNode SELF_SMALL_NAME() { return getToken(SimpleLOOPParser.SELF_SMALL_NAME, 0); }
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assigment);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(SMALL_NAME);
				setState(482);
				match(EQUAL);
				setState(483);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(SMALL_NAME);
				setState(485);
				match(EQUAL);
				setState(486);
				my_new();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(SMALL_NAME);
				setState(488);
				match(PLUS_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(SMALL_NAME);
				setState(490);
				match(MINUS_MINUS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(SELF_SMALL_NAME);
				setState(492);
				match(EQUAL);
				setState(493);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(494);
				match(SELF_SMALL_NAME);
				setState(495);
				match(EQUAL);
				setState(496);
				my_new();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(497);
				match(SELF_SMALL_NAME);
				setState(498);
				match(PLUS_PLUS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(499);
				match(SELF_SMALL_NAME);
				setState(500);
				match(MINUS_MINUS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SimpleLOOPParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(PRINT);
			setState(504);
			match(LPAR);
			setState(505);
			expr();
			setState(506);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleLOOPParser.NUMBER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode SELF_SMALL_NAME() { return getToken(SimpleLOOPParser.SELF_SMALL_NAME, 0); }
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(LPAR);
				setState(509);
				expr();
				setState(510);
				match(RPAR);
				setState(511);
				expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(514);
				expr();
				setState(515);
				expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				match(NUMBER);
				setState(518);
				expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				function_call();
				setState(520);
				expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(522);
				match(SMALL_NAME);
				setState(523);
				expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(524);
				match(SELF_SMALL_NAME);
				setState(525);
				expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(526);
				assigment();
				setState(527);
				expr_prime();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_primeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(SimpleLOOPParser.DIVIDE, 0); }
		public TerminalNode TIMES() { return getToken(SimpleLOOPParser.TIMES, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SimpleLOOPParser.PLUS, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
		public TerminalNode IS_EQUAL() { return getToken(SimpleLOOPParser.IS_EQUAL, 0); }
		public TerminalNode AND_AND() { return getToken(SimpleLOOPParser.AND_AND, 0); }
		public TerminalNode OR_OR() { return getToken(SimpleLOOPParser.OR_OR, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(SimpleLOOPParser.QUESTION_MARK, 0); }
		public List<Line_commandContext> line_command() {
			return getRuleContexts(Line_commandContext.class);
		}
		public Line_commandContext line_command(int i) {
			return getRuleContext(Line_commandContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SimpleLOOPParser.COLON, 0); }
		public Expr_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExpr_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExpr_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExpr_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_primeContext expr_prime() throws RecognitionException {
		Expr_primeContext _localctx = new Expr_primeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_prime);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				expr();
				setState(533);
				expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(536);
				expr();
				setState(537);
				expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				expr();
				setState(541);
				expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				match(IS_EQUAL);
				setState(544);
				expr();
				setState(545);
				expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(547);
				match(AND_AND);
				setState(548);
				expr();
				setState(549);
				expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(551);
				match(OR_OR);
				setState(552);
				expr();
				setState(553);
				expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(555);
				match(QUESTION_MARK);
				setState(556);
				line_command();
				setState(557);
				match(COLON);
				setState(558);
				line_command();
				setState(559);
				expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(LPAR);
			setState(565);
			expr();
			setState(566);
			match(DOT);
			setState(567);
			match(DOT);
			setState(568);
			expr();
			setState(569);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class My_newContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode NEW_WORD() { return getToken(SimpleLOOPParser.NEW_WORD, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode CAP_NAME() { return getToken(SimpleLOOPParser.CAP_NAME, 0); }
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public My_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_new; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMy_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMy_new(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMy_new(this);
			else return visitor.visitChildren(this);
		}
	}

	public final My_newContext my_new() throws RecognitionException {
		My_newContext _localctx = new My_newContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_my_new);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==CAP_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(572);
			match(DOT);
			setState(573);
			match(NEW_WORD);
			setState(574);
			match(LPAR);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(575);
				func_input();
				}
				break;
			}
			setState(578);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_inputContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimpleLOOPParser.COMMA, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public Func_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFunc_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFunc_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFunc_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_inputContext func_input() throws RecognitionException {
		Func_inputContext _localctx = new Func_inputContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_func_input);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MINUS:
			case NOT:
			case SELF_SMALL_NAME:
			case LPAR:
			case SMALL_NAME:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				expr();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(582);
					match(COMMA);
					setState(583);
					func_input();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class My_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SimpleLOOPParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public My_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMy_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMy_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMy_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final My_returnContext my_return() throws RecognitionException {
		My_returnContext _localctx = new My_returnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_my_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(RETURN);
			setState(589);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0252\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3S\n\3\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\7\4_\n\4\f\4\16\4"+
		"b\13\4\3\4\3\4\3\4\3\4\5\4h\n\4\3\4\3\4\3\4\6\4m\n\4\r\4\16\4n\3\4\3\4"+
		"\3\4\7\4t\n\4\f\4\16\4w\13\4\5\4y\n\4\3\5\3\5\7\5}\n\5\f\5\16\5\u0080"+
		"\13\5\3\5\3\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\5\3\5\5\5\u008c"+
		"\n\5\3\6\3\6\3\6\3\6\5\6\u0092\n\6\3\6\3\6\3\6\5\6\u0097\n\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a7\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\t\7\t\u00c3\n\t\f\t\16\t\u00c6\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00de\n\n\3\13\3\13\3\13\3\13\5\13\u00e4\n\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00ea\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fa\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0102"+
		"\n\r\3\r\3\r\3\r\5\r\u0107\n\r\3\r\3\r\3\r\3\r\5\r\u010d\n\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u0117\n\16\3\16\3\16\3\16\5\16\u011c"+
		"\n\16\3\16\5\16\u011f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0127\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012f\n\17\5\17\u0131\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013e\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0145\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u014d\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0156\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u015d\n\23\3\23\3\23\3\23\3\23\5\23\u0163\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016f\n\23\3\23"+
		"\3\23\5\23\u0173\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u017f\n\24\3\24\3\24\5\24\u0183\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u018c\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0193\n\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0199\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01a5\n\25\3\25\3\25\5\25\u01a9\n\25\3\26\6\26\u01ac\n"+
		"\26\r\26\16\26\u01ad\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\6\26\u01bc\n\26\r\26\16\26\u01bd\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u01cb\n\26\3\26\3\26\3\26\5\26\u01d0"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u01d7\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01df\n\27\3\27\5\27\u01e2\n\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u01f8\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0214\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0235\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0243\n\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u024b\n\36\5\36\u024d\n\36\3\37\3\37\3\37\3"+
		"\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<\2\t\3\2/\60\4\2\5\5//\4\2\20\20\31\31\3\2\r\16\3\2\17\20\3\2()\3\2"+
		"-.\2\u02a8\2?\3\2\2\2\4R\3\2\2\2\6x\3\2\2\2\b\u008b\3\2\2\2\n\u008d\3"+
		"\2\2\2\f\u00a6\3\2\2\2\16\u00a8\3\2\2\2\20\u00ad\3\2\2\2\22\u00dd\3\2"+
		"\2\2\24\u00df\3\2\2\2\26\u00f9\3\2\2\2\30\u00fb\3\2\2\2\32\u011e\3\2\2"+
		"\2\34\u0130\3\2\2\2\36\u013d\3\2\2\2 \u0144\3\2\2\2\"\u014c\3\2\2\2$\u0172"+
		"\3\2\2\2&\u0182\3\2\2\2(\u01a8\3\2\2\2*\u01cf\3\2\2\2,\u01e1\3\2\2\2."+
		"\u01f7\3\2\2\2\60\u01f9\3\2\2\2\62\u0213\3\2\2\2\64\u0234\3\2\2\2\66\u0236"+
		"\3\2\2\28\u023d\3\2\2\2:\u024c\3\2\2\2<\u024e\3\2\2\2>@\5\4\3\2?>\3\2"+
		"\2\2?@\3\2\2\2@A\3\2\2\2AB\7\2\2\3B\3\3\2\2\2CD\5\6\4\2DE\7%\2\2EF\5\4"+
		"\3\2FS\3\2\2\2GH\5\b\5\2HI\7%\2\2IJ\5\4\3\2JS\3\2\2\2KL\5\n\6\2LM\7%\2"+
		"\2MN\5\f\7\2NS\3\2\2\2OP\7%\2\2PS\5\4\3\2QS\3\2\2\2RC\3\2\2\2RG\3\2\2"+
		"\2RK\3\2\2\2RO\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2TZ\7\13\2\2UZ\7\21\2\2VZ\7"+
		".\2\2WZ\5\16\b\2XZ\5\20\t\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX"+
		"\3\2\2\2Z[\3\2\2\2[`\7\60\2\2\\]\7\30\2\2]_\7\60\2\2^\\\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ay\3\2\2\2b`\3\2\2\2ch\7\13\2\2dh\7\21\2\2eh\7"+
		".\2\2fh\5\16\b\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hl\3\2\2\2ij\7"+
		"\62\2\2jk\7/\2\2km\7\63\2\2li\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op"+
		"\3\2\2\2pu\7\60\2\2qr\7\30\2\2rt\7\60\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xY\3\2\2\2xg\3\2\2\2y\7\3\2\2\2z~\7,\2"+
		"\2{}\13\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u008c"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7&\2\2\u0082\u0086\7%\2\2\u0083\u0085"+
		"\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a"+
		"\7%\2\2\u008a\u008c\7\'\2\2\u008bz\3\2\2\2\u008b\u0081\3\2\2\2\u008c\t"+
		"\3\2\2\2\u008d\u008e\7\33\2\2\u008e\u0091\7.\2\2\u008f\u0090\7(\2\2\u0090"+
		"\u0092\7.\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0096\7 \2\2\u0094\u0095\7%\2\2\u0095\u0097\5\22\n\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7%"+
		"\2\2\u0099\u009a\7!\2\2\u009a\13\3\2\2\2\u009b\u009c\5\n\6\2\u009c\u009d"+
		"\7%\2\2\u009d\u009e\5\f\7\2\u009e\u00a7\3\2\2\2\u009f\u00a0\5\b\5\2\u00a0"+
		"\u00a1\7%\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a7\3\2\2\2\u00a3\u00a4\7%\2"+
		"\2\u00a4\u00a7\5\f\7\2\u00a5\u00a7\3\2\2\2\u00a6\u009b\3\2\2\2\u00a6\u009f"+
		"\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\r\3\2\2\2\u00a8"+
		"\u00a9\7-\2\2\u00a9\u00aa\7(\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac\7)\2"+
		"\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\23\2\2\u00ae\u00b4\7(\2\2\u00af\u00b5"+
		"\7\22\2\2\u00b0\u00b5\7\13\2\2\u00b1\u00b5\7\21\2\2\u00b2\u00b5\7.\2\2"+
		"\u00b3\u00b5\5\16\b\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00bc\7$\2\2\u00b7\u00bd\7\22\2\2\u00b8\u00bd\7\13\2\2\u00b9\u00bd\7"+
		"\21\2\2\u00ba\u00bd\7.\2\2\u00bb\u00bd\5\16\b\2\u00bc\u00b7\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\64\2\2\u00bf\u00c4\7\60\2\2\u00c0"+
		"\u00c1\7\30\2\2\u00c1\u00c3\7\60\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\21\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\5\b\5\2\u00c8\u00c9\7%\2\2\u00c9\u00ca\5\22"+
		"\n\2\u00ca\u00de\3\2\2\2\u00cb\u00cc\7\35\2\2\u00cc\u00cd\5\6\4\2\u00cd"+
		"\u00ce\7%\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00de\3\2\2\2\u00d0\u00d1\5\24"+
		"\13\2\u00d1\u00d2\7%\2\2\u00d2\u00d3\5\22\n\2\u00d3\u00de\3\2\2\2\u00d4"+
		"\u00d5\5\30\r\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\5\22\n\2\u00d7\u00de\3"+
		"\2\2\2\u00d8\u00de\5\b\5\2\u00d9\u00da\7\35\2\2\u00da\u00de\5\6\4\2\u00db"+
		"\u00de\5\24\13\2\u00dc\u00de\5\30\r\2\u00dd\u00c7\3\2\2\2\u00dd\u00cb"+
		"\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\23\3\2\2"+
		"\2\u00df\u00e0\7\35\2\2\u00e0\u00e1\7\t\2\2\u00e1\u00e3\7\"\2\2\u00e2"+
		"\u00e4\5\32\16\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e9\7 \2\2\u00e7\u00e8\7%\2\2\u00e8"+
		"\u00ea\5\26\f\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ec\7%\2\2\u00ec\u00ed\7!\2\2\u00ed\25\3\2\2\2\u00ee\u00ef"+
		"\5\b\5\2\u00ef\u00f0\7%\2\2\u00f0\u00f1\5\26\f\2\u00f1\u00fa\3\2\2\2\u00f2"+
		"\u00f3\5\6\4\2\u00f3\u00f4\7%\2\2\u00f4\u00f5\5\26\f\2\u00f5\u00fa\3\2"+
		"\2\2\u00f6\u00fa\5 \21\2\u00f7\u00fa\5\b\5\2\u00f8\u00fa\5\6\4\2\u00f9"+
		"\u00ee\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u0101\7\35\2\2\u00fc\u0102"+
		"\7\22\2\2\u00fd\u0102\7\13\2\2\u00fe\u0102\7\21\2\2\u00ff\u0102\5\16\b"+
		"\2\u0100\u0102\7.\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\7\60\2\2\u0104\u0106\7\"\2\2\u0105\u0107\5\32\16\2\u0106\u0105"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7#\2\2\u0109"+
		"\u010c\7 \2\2\u010a\u010b\7%\2\2\u010b\u010d\5\36\20\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7%\2\2\u010f"+
		"\u0110\7!\2\2\u0110\31\3\2\2\2\u0111\u0117\7\13\2\2\u0112\u0117\7\21\2"+
		"\2\u0113\u0117\7.\2\2\u0114\u0117\5\16\b\2\u0115\u0117\5\20\t\2\u0116"+
		"\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\7\60\2\2\u0119"+
		"\u011a\7\30\2\2\u011a\u011c\5\32\16\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011f\5\34\17\2\u011e\u0116\3\2\2\2"+
		"\u011e\u011d\3\2\2\2\u011f\33\3\2\2\2\u0120\u0121\7\13\2\2\u0121\u0122"+
		"\7\60\2\2\u0122\u0123\7*\2\2\u0123\u0126\t\2\2\2\u0124\u0125\7\30\2\2"+
		"\u0125\u0127\5\34\17\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0131"+
		"\3\2\2\2\u0128\u0129\7\21\2\2\u0129\u012a\7\60\2\2\u012a\u012b\7*\2\2"+
		"\u012b\u012e\t\3\2\2\u012c\u012d\7\30\2\2\u012d\u012f\5\34\17\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0120\3\2"+
		"\2\2\u0130\u0128\3\2\2\2\u0131\35\3\2\2\2\u0132\u0133\5\b\5\2\u0133\u0134"+
		"\7%\2\2\u0134\u0135\5\36\20\2\u0135\u013e\3\2\2\2\u0136\u0137\5\6\4\2"+
		"\u0137\u0138\7%\2\2\u0138\u0139\5\36\20\2\u0139\u013e\3\2\2\2\u013a\u013e"+
		"\5 \21\2\u013b\u013e\5\b\5\2\u013c\u013e\5\6\4\2\u013d\u0132\3\2\2\2\u013d"+
		"\u0136\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2"+
		"\2\2\u013e\37\3\2\2\2\u013f\u0140\5\"\22\2\u0140\u0141\7%\2\2\u0141\u0142"+
		"\5 \21\2\u0142\u0145\3\2\2\2\u0143\u0145\5\"\22\2\u0144\u013f\3\2\2\2"+
		"\u0144\u0143\3\2\2\2\u0145!\3\2\2\2\u0146\u014d\5$\23\2\u0147\u014d\5"+
		"*\26\2\u0148\u014d\5,\27\2\u0149\u014d\5\60\31\2\u014a\u014d\5\62\32\2"+
		"\u014b\u014d\5<\37\2\u014c\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148"+
		"\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"#\3\2\2\2\u014e\u014f\7\6\2\2\u014f\u0150\5\62\32\2\u0150\u0151\7%\2\2"+
		"\u0151\u0152\5\"\22\2\u0152\u0155\7%\2\2\u0153\u0156\5&\24\2\u0154\u0156"+
		"\5(\25\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0173\3\2\2\2\u0157"+
		"\u0158\7\6\2\2\u0158\u0159\5\62\32\2\u0159\u015a\7 \2\2\u015a\u015c\7"+
		"%\2\2\u015b\u015d\5 \21\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\7!\2\2\u015f\u0162\7%\2\2\u0160\u0163\5&\24"+
		"\2\u0161\u0163\5(\25\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0173"+
		"\3\2\2\2\u0164\u0165\7\6\2\2\u0165\u0166\5\62\32\2\u0166\u0167\7%\2\2"+
		"\u0167\u0168\5\"\22\2\u0168\u0173\3\2\2\2\u0169\u016a\7\6\2\2\u016a\u016b"+
		"\5\62\32\2\u016b\u016c\7 \2\2\u016c\u016e\7%\2\2\u016d\u016f\5 \21\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7!"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u014e\3\2\2\2\u0172\u0157\3\2\2\2\u0172"+
		"\u0164\3\2\2\2\u0172\u0169\3\2\2\2\u0173%\3\2\2\2\u0174\u0175\7\7\2\2"+
		"\u0175\u0176\5\62\32\2\u0176\u0177\7%\2\2\u0177\u0178\5\"\22\2\u0178\u0183"+
		"\3\2\2\2\u0179\u017a\7\7\2\2\u017a\u017b\5\62\32\2\u017b\u017c\7 \2\2"+
		"\u017c\u017e\7%\2\2\u017d\u017f\5 \21\2\u017e\u017d\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7!\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0174\3\2\2\2\u0182\u0179\3\2\2\2\u0183\'\3\2\2\2\u0184\u0185\7\b\2\2"+
		"\u0185\u0186\5\62\32\2\u0186\u0187\7%\2\2\u0187\u0188\5\"\22\2\u0188\u018b"+
		"\7%\2\2\u0189\u018c\5&\24\2\u018a\u018c\5(\25\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\u01a9\3\2\2\2\u018d\u018e\7\b\2\2\u018e\u018f\5\62"+
		"\32\2\u018f\u0190\7 \2\2\u0190\u0192\7%\2\2\u0191\u0193\5 \21\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7!"+
		"\2\2\u0195\u0198\7%\2\2\u0196\u0199\5&\24\2\u0197\u0199\5(\25\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u01a9\3\2\2\2\u019a\u019b\7\b"+
		"\2\2\u019b\u019c\5\62\32\2\u019c\u019d\7%\2\2\u019d\u019e\5\"\22\2\u019e"+
		"\u01a9\3\2\2\2\u019f\u01a0\7\b\2\2\u01a0\u01a1\5\62\32\2\u01a1\u01a2\7"+
		" \2\2\u01a2\u01a4\7%\2\2\u01a3\u01a5\5 \21\2\u01a4\u01a3\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7!\2\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u0184\3\2\2\2\u01a8\u018d\3\2\2\2\u01a8\u019a\3\2\2\2\u01a8"+
		"\u019f\3\2\2\2\u01a9)\3\2\2\2\u01aa\u01ac\7\60\2\2\u01ab\u01aa\3\2\2\2"+
		"\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\5\66\34\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7+\2\2"+
		"\u01b2\u01b3\7\n\2\2\u01b3\u01b4\7\65\2\2\u01b4\u01b5\7\32\2\2\u01b5\u01b6"+
		"\7\60\2\2\u01b6\u01b7\7\32\2\2\u01b7\u01b8\7%\2\2\u01b8\u01b9\5\"\22\2"+
		"\u01b9\u01d0\3\2\2\2\u01ba\u01bc\7\60\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\5\66\34\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\7+\2\2\u01c2\u01c3\7"+
		"\n\2\2\u01c3\u01c4\7\65\2\2\u01c4\u01c5\7\32\2\2\u01c5\u01c6\7\60\2\2"+
		"\u01c6\u01c7\7\32\2\2\u01c7\u01ca\7 \2\2\u01c8\u01c9\7%\2\2\u01c9\u01cb"+
		"\5 \21\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\7!\2\2\u01cd\u01ce\7%\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01ab\3\2\2"+
		"\2\u01cf\u01bb\3\2\2\2\u01d0+\3\2\2\2\u01d1\u01d2\7\60\2\2\u01d2\u01d3"+
		"\7+\2\2\u01d3\u01d4\7\60\2\2\u01d4\u01d6\7\"\2\2\u01d5\u01d7\5:\36\2\u01d6"+
		"\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01e2\7#"+
		"\2\2\u01d9\u01da\7\34\2\2\u01da\u01db\7+\2\2\u01db\u01dc\7\60\2\2\u01dc"+
		"\u01de\7\"\2\2\u01dd\u01df\5:\36\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\7#\2\2\u01e1\u01d1\3\2\2\2\u01e1"+
		"\u01d9\3\2\2\2\u01e2-\3\2\2\2\u01e3\u01e4\7\60\2\2\u01e4\u01e5\7*\2\2"+
		"\u01e5\u01f8\5\62\32\2\u01e6\u01e7\7\60\2\2\u01e7\u01e8\7*\2\2\u01e8\u01f8"+
		"\58\35\2\u01e9\u01ea\7\60\2\2\u01ea\u01f8\7\24\2\2\u01eb\u01ec\7\60\2"+
		"\2\u01ec\u01f8\7\25\2\2\u01ed\u01ee\7\34\2\2\u01ee\u01ef\7*\2\2\u01ef"+
		"\u01f8\5\62\32\2\u01f0\u01f1\7\34\2\2\u01f1\u01f2\7*\2\2\u01f2\u01f8\5"+
		"8\35\2\u01f3\u01f4\7\34\2\2\u01f4\u01f8\7\24\2\2\u01f5\u01f6\7\34\2\2"+
		"\u01f6\u01f8\7\25\2\2\u01f7\u01e3\3\2\2\2\u01f7\u01e6\3\2\2\2\u01f7\u01e9"+
		"\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01ed\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7"+
		"\u01f3\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8/\3\2\2\2\u01f9\u01fa\7\4\2\2"+
		"\u01fa\u01fb\7\"\2\2\u01fb\u01fc\5\62\32\2\u01fc\u01fd\7#\2\2\u01fd\61"+
		"\3\2\2\2\u01fe\u01ff\7\"\2\2\u01ff\u0200\5\62\32\2\u0200\u0201\7#\2\2"+
		"\u0201\u0202\5\64\33\2\u0202\u0214\3\2\2\2\u0203\u0204\t\4\2\2\u0204\u0205"+
		"\5\62\32\2\u0205\u0206\5\64\33\2\u0206\u0214\3\2\2\2\u0207\u0208\7\66"+
		"\2\2\u0208\u0214\5\64\33\2\u0209\u020a\5,\27\2\u020a\u020b\5\64\33\2\u020b"+
		"\u0214\3\2\2\2\u020c\u020d\7\60\2\2\u020d\u0214\5\64\33\2\u020e\u020f"+
		"\7\34\2\2\u020f\u0214\5\64\33\2\u0210\u0211\5.\30\2\u0211\u0212\5\64\33"+
		"\2\u0212\u0214\3\2\2\2\u0213\u01fe\3\2\2\2\u0213\u0203\3\2\2\2\u0213\u0207"+
		"\3\2\2\2\u0213\u0209\3\2\2\2\u0213\u020c\3\2\2\2\u0213\u020e\3\2\2\2\u0213"+
		"\u0210\3\2\2\2\u0214\63\3\2\2\2\u0215\u0216\t\5\2\2\u0216\u0217\5\62\32"+
		"\2\u0217\u0218\5\64\33\2\u0218\u0235\3\2\2\2\u0219\u021a\t\6\2\2\u021a"+
		"\u021b\5\62\32\2\u021b\u021c\5\64\33\2\u021c\u0235\3\2\2\2\u021d\u021e"+
		"\t\7\2\2\u021e\u021f\5\62\32\2\u021f\u0220\5\64\33\2\u0220\u0235\3\2\2"+
		"\2\u0221\u0222\7\67\2\2\u0222\u0223\5\62\32\2\u0223\u0224\5\64\33\2\u0224"+
		"\u0235\3\2\2\2\u0225\u0226\78\2\2\u0226\u0227\5\62\32\2\u0227\u0228\5"+
		"\64\33\2\u0228\u0235\3\2\2\2\u0229\u022a\79\2\2\u022a\u022b\5\62\32\2"+
		"\u022b\u022c\5\64\33\2\u022c\u0235\3\2\2\2\u022d\u022e\7\26\2\2\u022e"+
		"\u022f\5\"\22\2\u022f\u0230\7\27\2\2\u0230\u0231\5\"\22\2\u0231\u0232"+
		"\5\64\33\2\u0232\u0235\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0215\3\2\2\2"+
		"\u0234\u0219\3\2\2\2\u0234\u021d\3\2\2\2\u0234\u0221\3\2\2\2\u0234\u0225"+
		"\3\2\2\2\u0234\u0229\3\2\2\2\u0234\u022d\3\2\2\2\u0234\u0233\3\2\2\2\u0235"+
		"\65\3\2\2\2\u0236\u0237\7\"\2\2\u0237\u0238\5\62\32\2\u0238\u0239\7+\2"+
		"\2\u0239\u023a\7+\2\2\u023a\u023b\5\62\32\2\u023b\u023c\7#\2\2\u023c\67"+
		"\3\2\2\2\u023d\u023e\t\b\2\2\u023e\u023f\7+\2\2\u023f\u0240\7\f\2\2\u0240"+
		"\u0242\7\"\2\2\u0241\u0243\5:\36\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7#\2\2\u02459\3\2\2\2\u0246\u024d"+
		"\3\2\2\2\u0247\u024a\5\62\32\2\u0248\u0249\7\30\2\2\u0249\u024b\5:\36"+
		"\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u0246"+
		"\3\2\2\2\u024c\u0247\3\2\2\2\u024d;\3\2\2\2\u024e\u024f\7\3\2\2\u024f"+
		"\u0250\5\62\32\2\u0250=\3\2\2\2<?RY`gnux~\u0086\u008b\u0091\u0096\u00a6"+
		"\u00b4\u00bc\u00c4\u00dd\u00e3\u00e9\u00f9\u0101\u0106\u010c\u0116\u011b"+
		"\u011e\u0126\u012e\u0130\u013d\u0144\u014c\u0155\u015c\u0162\u016e\u0172"+
		"\u017e\u0182\u018b\u0192\u0198\u01a4\u01a8\u01ad\u01bd\u01ca\u01cf\u01d6"+
		"\u01de\u01e1\u01f7\u0213\u0234\u0242\u024a\u024c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}