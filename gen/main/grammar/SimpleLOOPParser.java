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
		WS=1, RETURN=2, PRINT=3, DO=4, BOOL_VALUE=5, IF=6, ELSE=7, ELSE_IF=8, 
		INIT=9, EACH=10, INT=11, NEW_WORD=12, DIVIDE=13, TIMES=14, PLUS=15, MINUS=16, 
		BOOL=17, VOID=18, FPTR=19, PLUS_PLUS=20, MINUS_MINUS=21, QUESTION_MARK=22, 
		COLON=23, COMMA=24, NOT=25, ABS_SIGN=26, CLASS=27, SELF_SMALL_NAME=28, 
		ACCESS_TYPE=29, RBRACK=30, LBRACK=31, LCURL=32, RCURL=33, LPAR=34, RPAR=35, 
		ARROW=36, NEW_LINE=37, BEGIN_COMMENT=38, END_COMMENT=39, LT=40, GT=41, 
		IS_EQUAL=42, EQUAL=43, DOT=44, SHARP_SIGN=45, SET=46, CAP_NAME=47, NUM=48, 
		ADD=49, MERGE=50, INCLUDE=51, DELETE=52, SMALL_NAME=53, AND_AND=54, OR_OR=55, 
		STRING=56, VAR_DEC=57;
	public static final int
		RULE_simpleLoop = 0, RULE_start_prog = 1, RULE_var_dec = 2, RULE_comment = 3, 
		RULE_class_dec = 4, RULE_prog_body = 5, RULE_set_dec = 6, RULE_set_op = 7, 
		RULE_func_var = 8, RULE_begin_class = 9, RULE_init_dec = 10, RULE_init_begin = 11, 
		RULE_func_dec = 12, RULE_argumants = 13, RULE_default_argumants = 14, 
		RULE_func_begin = 15, RULE_scop_body = 16, RULE_line_command = 17, RULE_func_call = 18, 
		RULE_if_state = 19, RULE_my_else = 20, RULE_else_if = 21, RULE_for_loop = 22, 
		RULE_print = 23, RULE_expr = 24, RULE_ternery_expr = 25, RULE_or_or_expr = 26, 
		RULE_and_and_expr = 27, RULE_is_equal_expr = 28, RULE_comp_expr = 29, 
		RULE_sn_expr = 30, RULE_md_expr = 31, RULE_single_expr = 32, RULE_inneg_expr = 33, 
		RULE_arr_expr = 34, RULE_dot_expr = 35, RULE_par_expr = 36, RULE_name_expr = 37, 
		RULE_sequence = 38, RULE_my_new = 39, RULE_func_input = 40, RULE_my_return = 41, 
		RULE_var = 42, RULE_ext = 43, RULE_const_expr = 44, RULE_const_expr_prime = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLoop", "start_prog", "var_dec", "comment", "class_dec", "prog_body", 
			"set_dec", "set_op", "func_var", "begin_class", "init_dec", "init_begin", 
			"func_dec", "argumants", "default_argumants", "func_begin", "scop_body", 
			"line_command", "func_call", "if_state", "my_else", "else_if", "for_loop", 
			"print", "expr", "ternery_expr", "or_or_expr", "and_and_expr", "is_equal_expr", 
			"comp_expr", "sn_expr", "md_expr", "single_expr", "inneg_expr", "arr_expr", 
			"dot_expr", "par_expr", "name_expr", "sequence", "my_new", "func_input", 
			"my_return", "var", "ext", "const_expr", "const_expr_prime"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'return'", "'print'", "'do'", null, "'if'", "'else'", "'elsif'", 
			"'initialize'", "'each'", "'int'", "'new'", "'/'", "'*'", "'+'", "'-'", 
			"'bool'", "'void'", "'fptr'", "'++'", "'--'", "'?'", "':'", "','", "'!'", 
			"'|'", "'class'", null, null, "']'", "'['", "'{'", "'}'", "'('", "')'", 
			"'->'", null, "'=begin'", "'=end'", "'<'", "'>'", "'=='", "'='", "'.'", 
			"'#'", "'Set'", null, null, "'add'", "'merge'", "'include'", "'delete'", 
			null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "RETURN", "PRINT", "DO", "BOOL_VALUE", "IF", "ELSE", "ELSE_IF", 
			"INIT", "EACH", "INT", "NEW_WORD", "DIVIDE", "TIMES", "PLUS", "MINUS", 
			"BOOL", "VOID", "FPTR", "PLUS_PLUS", "MINUS_MINUS", "QUESTION_MARK", 
			"COLON", "COMMA", "NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", "ACCESS_TYPE", 
			"RBRACK", "LBRACK", "LCURL", "RCURL", "LPAR", "RPAR", "ARROW", "NEW_LINE", 
			"BEGIN_COMMENT", "END_COMMENT", "LT", "GT", "IS_EQUAL", "EQUAL", "DOT", 
			"SHARP_SIGN", "SET", "CAP_NAME", "NUM", "ADD", "MERGE", "INCLUDE", "DELETE", 
			"SMALL_NAME", "AND_AND", "OR_OR", "STRING", "VAR_DEC"
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

	public static class SimpleLoopContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLOOPParser.EOF, 0); }
		public Start_progContext start_prog() {
			return getRuleContext(Start_progContext.class,0);
		}
		public SimpleLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSimpleLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSimpleLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSimpleLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleLoopContext simpleLoop() throws RecognitionException {
		SimpleLoopContext _localctx = new SimpleLoopContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simpleLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(92);
				start_prog();
				}
				break;
			}
			setState(95);
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
		public Start_progContext start_prog() {
			return getRuleContext(Start_progContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
			int _alt;
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				var_dec();
				setState(99); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(101); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(103);
				start_prog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				comment();
				setState(107); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(106);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(109); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(111);
				start_prog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				class_dec();
				setState(115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(119);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(121);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(126);
				start_prog();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				var_dec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				comment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				class_dec();
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

	public static class Var_decContext extends ParserRuleContext {
		public Token SMALL_NAME;
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
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(133);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(134);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(135);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(136);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(137);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(140);
				match(LBRACK);
				setState(141);
				expr(0);
				setState(142);
				match(RBRACK);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
			System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(151);
				match(COMMA);
				setState(152);
				((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
				}
				}
				setState(158);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SHARP_SIGN() { return getToken(SimpleLOOPParser.SHARP_SIGN, 0); }
		public TerminalNode BEGIN_COMMENT() { return getToken(SimpleLOOPParser.BEGIN_COMMENT, 0); }
		public TerminalNode END_COMMENT() { return getToken(SimpleLOOPParser.END_COMMENT, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
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
		int _la;
		try {
			int _alt;
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(SHARP_SIGN);
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						matchWildcard();
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case BEGIN_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(BEGIN_COMMENT);
				setState(168); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(167);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(170); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(172);
						matchWildcard();
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					match(NEW_LINE);
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(183);
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
		public Token CAP_NAME;
		public TerminalNode CLASS() { return getToken(SimpleLOOPParser.CLASS, 0); }
		public List<TerminalNode> CAP_NAME() { return getTokens(SimpleLOOPParser.CAP_NAME); }
		public TerminalNode CAP_NAME(int i) {
			return getToken(SimpleLOOPParser.CAP_NAME, i);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Begin_classContext begin_class() {
			return getRuleContext(Begin_classContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(CLASS);
				setState(187);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(189);
					match(LT);
					setState(190);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(194);
					match(NEW_LINE);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(LCURL);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(201);
						match(NEW_LINE);
						}
						}
						setState(204); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(206);
					begin_class();
					}
					break;
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					match(NEW_LINE);
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(214);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(CLASS);
				setState(216);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(218);
					match(LT);
					setState(219);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						match(NEW_LINE);
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(229);
					comment();
					}
					break;
				case 2:
					{
					setState(230);
					match(ACCESS_TYPE);
					setState(231);
					var_dec();
					}
					break;
				case 3:
					{
					setState(232);
					init_dec();
					}
					break;
				case 4:
					{
					setState(233);
					func_dec();
					}
					break;
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

	public static class Prog_bodyContext extends ParserRuleContext {
		public Class_decContext class_dec() {
			return getRuleContext(Class_decContext.class,0);
		}
		public Prog_bodyContext prog_body() {
			return getRuleContext(Prog_bodyContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
			int _alt;
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				class_dec();
				setState(240); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(239);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(242); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(244);
				prog_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				comment();
				setState(248); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(247);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(250); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(252);
				prog_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(254);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(257); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(259);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				class_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
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
			setState(265);
			match(SET);
			setState(266);
			match(LT);
			setState(267);
			match(INT);
			setState(268);
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

	public static class Set_opContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode NEW_WORD() { return getToken(SimpleLOOPParser.NEW_WORD, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SimpleLOOPParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MERGE() { return getToken(SimpleLOOPParser.MERGE, 0); }
		public TerminalNode INCLUDE() { return getToken(SimpleLOOPParser.INCLUDE, 0); }
		public TerminalNode DELETE() { return getToken(SimpleLOOPParser.DELETE, 0); }
		public Set_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSet_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSet_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSet_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_opContext set_op() throws RecognitionException {
		Set_opContext _localctx = new Set_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_op);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(SET);
				setState(271);
				match(DOT);
				setState(272);
				match(NEW_WORD);
				System.out.println("NEW");
				setState(274);
				match(LPAR);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(275);
					func_input();
					}
				}

				setState(278);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				var();
				setState(280);
				match(DOT);
				setState(281);
				match(ADD);
				System.out.println("ADD");
				setState(283);
				match(LPAR);
				setState(284);
				expr(0);
				setState(285);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				var();
				setState(288);
				match(DOT);
				setState(289);
				match(MERGE);
				System.out.println("MERGE");
				setState(291);
				match(LPAR);
				setState(292);
				expr(0);
				setState(293);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				var();
				setState(296);
				match(DOT);
				setState(297);
				match(INCLUDE);
				System.out.println("INCLUDE");
				setState(299);
				match(LPAR);
				setState(300);
				expr(0);
				setState(301);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				var();
				setState(304);
				match(DOT);
				setState(305);
				match(DELETE);
				System.out.println("DELETE");
				setState(307);
				match(LPAR);
				setState(308);
				expr(0);
				setState(309);
				match(RPAR);
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

	public static class Func_varContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
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
		public List<Func_varContext> func_var() {
			return getRuleContexts(Func_varContext.class);
		}
		public Func_varContext func_var(int i) {
			return getRuleContext(Func_varContext.class,i);
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
		enterRule(_localctx, 16, RULE_func_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(FPTR);
			setState(314);
			match(LT);
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(315);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(316);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(317);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(318);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(319);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(320);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(323);
				match(COMMA);
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(324);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(325);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(326);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(327);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(328);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(329);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(ARROW);
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(338);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(339);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(340);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(341);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(342);
				set_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(345);
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

	public static class Begin_classContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Begin_classContext begin_class() {
			return getRuleContext(Begin_classContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 18, RULE_begin_class);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				comment();
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(348);
					match(NEW_LINE);
					}
					}
					setState(351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(353);
				begin_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(ACCESS_TYPE);
				setState(356);
				var_dec();
				setState(358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(357);
					match(NEW_LINE);
					}
					}
					setState(360); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(362);
				begin_class();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				init_dec();
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(365);
					match(NEW_LINE);
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(370);
				begin_class();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				func_dec();
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(373);
					match(NEW_LINE);
					}
					}
					setState(376); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(378);
				begin_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				match(ACCESS_TYPE);
				setState(382);
				var_dec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(383);
				init_dec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(384);
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
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public ArgumantsContext argumants() {
			return getRuleContext(ArgumantsContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 20, RULE_init_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(ACCESS_TYPE);
			setState(388);
			match(INIT);
			setState(389);
			match(LPAR);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
				{
				setState(390);
				argumants();
				}
			}

			setState(393);
			match(RPAR);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(394);
				match(NEW_LINE);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(LCURL);
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(401);
					match(NEW_LINE);
					}
					}
					setState(404); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(406);
				init_begin();
				}
				break;
			}
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				match(NEW_LINE);
				}
				}
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINE );
			setState(414);
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
		public Init_beginContext init_begin() {
			return getRuleContext(Init_beginContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 22, RULE_init_begin);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				comment();
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(417);
					match(NEW_LINE);
					}
					}
					setState(420); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(422);
				init_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				var_dec();
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(425);
					match(NEW_LINE);
					}
					}
					setState(428); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(430);
				init_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
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
		public Token SMALL_NAME;
		public TerminalNode ACCESS_TYPE() { return getToken(SimpleLOOPParser.ACCESS_TYPE, 0); }
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
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
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Func_beginContext func_begin() {
			return getRuleContext(Func_beginContext.class,0);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
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
		enterRule(_localctx, 24, RULE_func_dec);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(ACCESS_TYPE);
				setState(443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(438);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(439);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(440);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(441);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(442);
					match(CAP_NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(445);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(447);
				match(LPAR);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(448);
					argumants();
					}
				}

				setState(451);
				match(RPAR);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(452);
					match(NEW_LINE);
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				match(LCURL);
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(460); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(459);
						match(NEW_LINE);
						}
						}
						setState(462); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(464);
					func_begin();
					}
					break;
				}
				setState(468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(467);
					match(NEW_LINE);
					}
					}
					setState(470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(472);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(ACCESS_TYPE);
				setState(479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(474);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(475);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(476);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(477);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(478);
					match(CAP_NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(481);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(483);
				match(LPAR);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(484);
					argumants();
					}
				}

				setState(487);
				match(RPAR);
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(488);
					match(NEW_LINE);
					}
					}
					setState(491); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(493);
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

	public static class ArgumantsContext extends ParserRuleContext {
		public Token SMALL_NAME;
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
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
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
		enterRule(_localctx, 26, RULE_argumants);
		int _la;
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(496);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(497);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(498);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(499);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(500);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(503);
					match(LBRACK);
					setState(504);
					expr(0);
					setState(505);
					match(RBRACK);
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
				((ArgumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("ArgumentDec : " + (((ArgumantsContext)_localctx).SMALL_NAME!=null?((ArgumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(514);
					match(COMMA);
					setState(515);
					argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
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
		public Token SMALL_NAME;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimpleLOOPParser.COMMA, 0); }
		public Default_argumantsContext default_argumants() {
			return getRuleContext(Default_argumantsContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
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
		enterRule(_localctx, 28, RULE_default_argumants);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(INT);
				setState(522);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(523);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(525);
				expr(0);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(526);
					match(COMMA);
					setState(527);
					default_argumants();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(BOOL);
				setState(531);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(532);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(534);
				expr(0);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(535);
					match(COMMA);
					setState(536);
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
		public Func_beginContext func_begin() {
			return getRuleContext(Func_beginContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 30, RULE_func_begin);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				comment();
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(542);
					match(NEW_LINE);
					}
					}
					setState(545); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(547);
				func_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				var_dec();
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(550);
					match(NEW_LINE);
					}
					}
					setState(553); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(555);
				func_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
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
		enterRule(_localctx, 32, RULE_scop_body);
		int _la;
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				comment();
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(563);
					match(NEW_LINE);
					}
					}
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(568);
				scop_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				line_command();
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(571);
					match(NEW_LINE);
					}
					}
					setState(574); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(576);
				scop_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				comment();
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
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public My_returnContext my_return() {
			return getRuleContext(My_returnContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Set_opContext set_op() {
			return getRuleContext(Set_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 34, RULE_line_command);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				if_state();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				my_return();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				set_op();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(588);
				expr(0);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode INIT() { return getToken(SimpleLOOPParser.INIT, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_call);
		int _la;
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(LPAR);
				setState(592);
				func_call();
				setState(593);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("MethodCall");
				setState(596);
				var();
				setState(597);
				match(LPAR);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(598);
					func_input();
					}
				}

				setState(601);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.println("MethodCall");
				setState(604);
				var();
				setState(605);
				match(DOT);
				setState(606);
				match(INIT);
				setState(607);
				match(LPAR);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(608);
					func_input();
					}
				}

				setState(611);
				match(RPAR);
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
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public My_elseContext my_else() {
			return getRuleContext(My_elseContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 38, RULE_if_state);
		int _la;
		try {
			int _alt;
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(617);
				expr(0);
				setState(619); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(618);
					match(NEW_LINE);
					}
					}
					setState(621); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(623);
				line_command();
				setState(625); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(624);
					match(NEW_LINE);
					}
					}
					setState(627); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(631);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(629);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(630);
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
				setState(633);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(635);
				expr(0);
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(636);
					match(NEW_LINE);
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(642);
				match(LCURL);
				setState(644); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(643);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(646); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(648);
					scop_body();
					}
				}

				setState(652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(651);
					match(NEW_LINE);
					}
					}
					setState(654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(656);
				match(RCURL);
				setState(658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(657);
					match(NEW_LINE);
					}
					}
					setState(660); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(664);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(662);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(663);
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
				setState(666);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(668);
				expr(0);
				setState(670); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(669);
					match(NEW_LINE);
					}
					}
					setState(672); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(674);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(678);
				expr(0);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(679);
					match(NEW_LINE);
					}
					}
					setState(684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(685);
				match(LCURL);
				setState(687); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(686);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(689); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(691);
					scop_body();
					}
				}

				setState(695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(694);
					match(NEW_LINE);
					}
					}
					setState(697); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(699);
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
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 40, RULE_my_else);
		int _la;
		try {
			int _alt;
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(706); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(705);
					match(NEW_LINE);
					}
					}
					setState(708); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(710);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(713);
					match(NEW_LINE);
					}
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(719);
				match(LCURL);
				setState(721); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(720);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(723); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(725);
					scop_body();
					}
				}

				setState(729); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(728);
					match(NEW_LINE);
					}
					}
					setState(731); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(733);
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
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public My_elseContext my_else() {
			return getRuleContext(My_elseContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 42, RULE_else_if);
		int _la;
		try {
			int _alt;
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(738);
				expr(0);
				setState(740); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(739);
					match(NEW_LINE);
					}
					}
					setState(742); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(744);
				line_command();
				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(745);
					match(NEW_LINE);
					}
					}
					setState(748); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(752);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(750);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(751);
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
				setState(754);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(756);
				expr(0);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(757);
					match(NEW_LINE);
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
				match(LCURL);
				setState(765); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(764);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(767); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(769);
					scop_body();
					}
				}

				setState(773); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(772);
					match(NEW_LINE);
					}
					}
					setState(775); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(777);
				match(RCURL);
				setState(779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(778);
					match(NEW_LINE);
					}
					}
					setState(781); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(785);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(783);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(784);
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
				setState(787);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(789);
				expr(0);
				setState(791); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(790);
					match(NEW_LINE);
					}
					}
					setState(793); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(795);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(799);
				expr(0);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(800);
					match(NEW_LINE);
					}
					}
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(806);
				match(LCURL);
				setState(808); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(807);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(810); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(812);
					scop_body();
					}
				}

				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(815);
					match(NEW_LINE);
					}
					}
					setState(818); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(820);
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		enterRule(_localctx, 44, RULE_for_loop);
		int _la;
		try {
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(824);
					var();
					}
					break;
				case 2:
					{
					setState(825);
					sequence();
					}
					break;
				}
				setState(828);
				match(DOT);
				setState(829);
				match(EACH);
				setState(830);
				match(DO);
				setState(831);
				match(ABS_SIGN);
				setState(832);
				var();
				setState(833);
				match(ABS_SIGN);
				setState(835); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(834);
					match(NEW_LINE);
					}
					}
					setState(837); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				System.out.println("Loop : " + "each");
				setState(840);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(842);
					var();
					}
					break;
				case 2:
					{
					setState(843);
					sequence();
					}
					break;
				}
				setState(846);
				match(DOT);
				setState(847);
				match(EACH);
				setState(848);
				match(DO);
				setState(849);
				match(ABS_SIGN);
				setState(850);
				var();
				setState(851);
				match(ABS_SIGN);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(852);
					match(NEW_LINE);
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("Loop : " + "each");
				setState(859);
				match(LCURL);
				setState(866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(861); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(860);
						match(NEW_LINE);
						}
						}
						setState(863); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(865);
					scop_body();
					}
					break;
				}
				setState(869); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(868);
					match(NEW_LINE);
					}
					}
					setState(871); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(873);
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
			setState(877);
			match(PRINT);
			System.out.println("Built-in : " + "print");
			setState(879);
			match(LPAR);
			setState(880);
			expr(0);
			setState(881);
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
		public Ternery_exprContext ternery_expr() {
			return getRuleContext(Ternery_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(884);
			ternery_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(893);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(886);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(887);
					match(EQUAL);
					setState(888);
					ternery_expr(0);
					System.out.println("Operator : =");
					}
					} 
				}
				setState(895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ternery_exprContext extends ParserRuleContext {
		public Or_or_exprContext or_or_expr() {
			return getRuleContext(Or_or_exprContext.class,0);
		}
		public List<Ternery_exprContext> ternery_expr() {
			return getRuleContexts(Ternery_exprContext.class);
		}
		public Ternery_exprContext ternery_expr(int i) {
			return getRuleContext(Ternery_exprContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(SimpleLOOPParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(SimpleLOOPParser.COLON, 0); }
		public Ternery_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternery_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTernery_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTernery_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTernery_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternery_exprContext ternery_expr() throws RecognitionException {
		return ternery_expr(0);
	}

	private Ternery_exprContext ternery_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ternery_exprContext _localctx = new Ternery_exprContext(_ctx, _parentState);
		Ternery_exprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_ternery_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(897);
			or_or_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ternery_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ternery_expr);
					setState(899);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(900);
					match(QUESTION_MARK);
					setState(901);
					ternery_expr(0);
					setState(902);
					match(COLON);
					setState(903);
					or_or_expr(0);
					System.out.println("Operator : ?:");
					}
					} 
				}
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Or_or_exprContext extends ParserRuleContext {
		public And_and_exprContext and_and_expr() {
			return getRuleContext(And_and_exprContext.class,0);
		}
		public Or_or_exprContext or_or_expr() {
			return getRuleContext(Or_or_exprContext.class,0);
		}
		public TerminalNode OR_OR() { return getToken(SimpleLOOPParser.OR_OR, 0); }
		public Or_or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOr_or_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOr_or_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOr_or_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_or_exprContext or_or_expr() throws RecognitionException {
		return or_or_expr(0);
	}

	private Or_or_exprContext or_or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Or_or_exprContext _localctx = new Or_or_exprContext(_ctx, _parentState);
		Or_or_exprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_or_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(912);
			and_and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_or_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_or_or_expr);
					setState(914);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(915);
					match(OR_OR);
					setState(916);
					and_and_expr(0);
					System.out.println("Operator : ||");
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class And_and_exprContext extends ParserRuleContext {
		public Is_equal_exprContext is_equal_expr() {
			return getRuleContext(Is_equal_exprContext.class,0);
		}
		public And_and_exprContext and_and_expr() {
			return getRuleContext(And_and_exprContext.class,0);
		}
		public TerminalNode AND_AND() { return getToken(SimpleLOOPParser.AND_AND, 0); }
		public And_and_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAnd_and_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAnd_and_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAnd_and_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_and_exprContext and_and_expr() throws RecognitionException {
		return and_and_expr(0);
	}

	private And_and_exprContext and_and_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_and_exprContext _localctx = new And_and_exprContext(_ctx, _parentState);
		And_and_exprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_and_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(925);
			is_equal_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(934);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_and_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and_and_expr);
					setState(927);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(928);
					match(AND_AND);
					setState(929);
					is_equal_expr(0);
					System.out.println("Operator : &&");
					}
					} 
				}
				setState(936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Is_equal_exprContext extends ParserRuleContext {
		public Comp_exprContext comp_expr() {
			return getRuleContext(Comp_exprContext.class,0);
		}
		public Is_equal_exprContext is_equal_expr() {
			return getRuleContext(Is_equal_exprContext.class,0);
		}
		public TerminalNode IS_EQUAL() { return getToken(SimpleLOOPParser.IS_EQUAL, 0); }
		public Is_equal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_equal_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIs_equal_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIs_equal_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIs_equal_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_equal_exprContext is_equal_expr() throws RecognitionException {
		return is_equal_expr(0);
	}

	private Is_equal_exprContext is_equal_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Is_equal_exprContext _localctx = new Is_equal_exprContext(_ctx, _parentState);
		Is_equal_exprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_is_equal_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(938);
			comp_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Is_equal_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_is_equal_expr);
					setState(940);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(941);
					match(IS_EQUAL);
					setState(942);
					comp_expr(0);
					System.out.println("Operator : ==");
					}
					} 
				}
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comp_exprContext extends ParserRuleContext {
		public Sn_exprContext sn_expr() {
			return getRuleContext(Sn_exprContext.class,0);
		}
		public Comp_exprContext comp_expr() {
			return getRuleContext(Comp_exprContext.class,0);
		}
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
		public Comp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterComp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitComp_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitComp_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_exprContext comp_expr() throws RecognitionException {
		return comp_expr(0);
	}

	private Comp_exprContext comp_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comp_exprContext _localctx = new Comp_exprContext(_ctx, _parentState);
		Comp_exprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_comp_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(951);
			sn_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(965);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(963);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						_localctx = new Comp_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comp_expr);
						setState(953);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(954);
						match(LT);
						setState(955);
						sn_expr(0);
						System.out.println("Operator : <");
						}
						break;
					case 2:
						{
						_localctx = new Comp_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comp_expr);
						setState(958);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(959);
						match(GT);
						setState(960);
						sn_expr(0);
						System.out.println("Operator : >");
						}
						break;
					}
					} 
				}
				setState(967);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sn_exprContext extends ParserRuleContext {
		public Md_exprContext md_expr() {
			return getRuleContext(Md_exprContext.class,0);
		}
		public Sn_exprContext sn_expr() {
			return getRuleContext(Sn_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SimpleLOOPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public Sn_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sn_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSn_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSn_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSn_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sn_exprContext sn_expr() throws RecognitionException {
		return sn_expr(0);
	}

	private Sn_exprContext sn_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sn_exprContext _localctx = new Sn_exprContext(_ctx, _parentState);
		Sn_exprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_sn_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(969);
			md_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(981);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						_localctx = new Sn_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sn_expr);
						setState(971);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(972);
						match(PLUS);
						setState(973);
						md_expr(0);
						System.out.println("Operator : +");
						}
						break;
					case 2:
						{
						_localctx = new Sn_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sn_expr);
						setState(976);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(977);
						match(MINUS);
						setState(978);
						md_expr(0);
						System.out.println("Operator : -");
						}
						break;
					}
					} 
				}
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Md_exprContext extends ParserRuleContext {
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public Md_exprContext md_expr() {
			return getRuleContext(Md_exprContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(SimpleLOOPParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SimpleLOOPParser.DIVIDE, 0); }
		public Md_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Md_exprContext md_expr() throws RecognitionException {
		return md_expr(0);
	}

	private Md_exprContext md_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Md_exprContext _localctx = new Md_exprContext(_ctx, _parentState);
		Md_exprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_md_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(987);
			single_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(1001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(999);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						_localctx = new Md_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_md_expr);
						setState(989);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(990);
						match(TIMES);
						setState(991);
						single_expr();
						System.out.println("Operator : *");
						}
						break;
					case 2:
						{
						_localctx = new Md_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_md_expr);
						setState(994);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(995);
						match(DIVIDE);
						setState(996);
						single_expr();
						System.out.println("Operator : /");
						}
						break;
					}
					} 
				}
				setState(1003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Single_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public Inneg_exprContext inneg_expr() {
			return getRuleContext(Inneg_exprContext.class,0);
		}
		public Single_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSingle_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSingle_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSingle_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_exprContext single_expr() throws RecognitionException {
		Single_exprContext _localctx = new Single_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_single_expr);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(NOT);
				setState(1005);
				single_expr();
				System.out.println("Operator : !");
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(MINUS);
				setState(1009);
				single_expr();
				System.out.println("Operator : -");
				}
				break;
			case BOOL_VALUE:
			case NEW_WORD:
			case BOOL:
			case SELF_SMALL_NAME:
			case LBRACK:
			case LPAR:
			case SET:
			case CAP_NAME:
			case NUM:
			case SMALL_NAME:
			case STRING:
			case VAR_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				inneg_expr(0);
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

	public static class Inneg_exprContext extends ParserRuleContext {
		public Arr_exprContext arr_expr() {
			return getRuleContext(Arr_exprContext.class,0);
		}
		public Inneg_exprContext inneg_expr() {
			return getRuleContext(Inneg_exprContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SimpleLOOPParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SimpleLOOPParser.MINUS_MINUS, 0); }
		public Inneg_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inneg_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterInneg_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitInneg_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitInneg_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inneg_exprContext inneg_expr() throws RecognitionException {
		return inneg_expr(0);
	}

	private Inneg_exprContext inneg_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inneg_exprContext _localctx = new Inneg_exprContext(_ctx, _parentState);
		Inneg_exprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_inneg_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1016);
			arr_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1024);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						_localctx = new Inneg_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inneg_expr);
						setState(1018);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1019);
						match(PLUS_PLUS);
						System.out.println("Operator : ++");
						}
						break;
					case 2:
						{
						_localctx = new Inneg_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inneg_expr);
						setState(1021);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1022);
						match(MINUS_MINUS);
						System.out.println("Operator : --");
						}
						break;
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Arr_exprContext extends ParserRuleContext {
		public Dot_exprContext dot_expr() {
			return getRuleContext(Dot_exprContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SimpleLOOPParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SimpleLOOPParser.RBRACK, 0); }
		public Arr_exprContext arr_expr() {
			return getRuleContext(Arr_exprContext.class,0);
		}
		public Arr_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_exprContext arr_expr() throws RecognitionException {
		return arr_expr(0);
	}

	private Arr_exprContext arr_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arr_exprContext _localctx = new Arr_exprContext(_ctx, _parentState);
		Arr_exprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_arr_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_VALUE:
			case NEW_WORD:
			case BOOL:
			case SELF_SMALL_NAME:
			case LPAR:
			case SET:
			case CAP_NAME:
			case NUM:
			case SMALL_NAME:
			case STRING:
			case VAR_DEC:
				{
				setState(1030);
				dot_expr(0);
				}
				break;
			case LBRACK:
				{
				setState(1031);
				match(LBRACK);
				setState(1032);
				dot_expr(0);
				setState(1033);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arr_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arr_expr);
					setState(1037);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(1038);
					match(LBRACK);
					setState(1039);
					dot_expr(0);
					setState(1040);
					match(RBRACK);
					}
					} 
				}
				setState(1046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Dot_exprContext extends ParserRuleContext {
		public Set_opContext set_op() {
			return getRuleContext(Set_opContext.class,0);
		}
		public Par_exprContext par_expr() {
			return getRuleContext(Par_exprContext.class,0);
		}
		public Dot_exprContext dot_expr() {
			return getRuleContext(Dot_exprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public Dot_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDot_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDot_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDot_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_exprContext dot_expr() throws RecognitionException {
		return dot_expr(0);
	}

	private Dot_exprContext dot_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dot_exprContext _localctx = new Dot_exprContext(_ctx, _parentState);
		Dot_exprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_dot_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1048);
				set_op();
				}
				break;
			case 2:
				{
				setState(1049);
				par_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dot_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dot_expr);
					setState(1052);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1053);
					match(DOT);
					setState(1054);
					par_expr(0);
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Par_exprContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public Name_exprContext name_expr() {
			return getRuleContext(Name_exprContext.class,0);
		}
		public Par_exprContext par_expr() {
			return getRuleContext(Par_exprContext.class,0);
		}
		public Par_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Par_exprContext par_expr() throws RecognitionException {
		return par_expr(0);
	}

	private Par_exprContext par_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Par_exprContext _localctx = new Par_exprContext(_ctx, _parentState);
		Par_exprContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_par_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1061);
				match(LPAR);
				setState(1062);
				expr(0);
				setState(1063);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(1065);
				name_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Par_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_par_expr);
					setState(1068);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1069);
					match(LPAR);
					setState(1070);
					match(RPAR);
					}
					} 
				}
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Name_exprContext extends ParserRuleContext {
		public TerminalNode NEW_WORD() { return getToken(SimpleLOOPParser.NEW_WORD, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SimpleLOOPParser.STRING, 0); }
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode CAP_NAME() { return getToken(SimpleLOOPParser.CAP_NAME, 0); }
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode VAR_DEC() { return getToken(SimpleLOOPParser.VAR_DEC, 0); }
		public TerminalNode NUM() { return getToken(SimpleLOOPParser.NUM, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode BOOL_VALUE() { return getToken(SimpleLOOPParser.BOOL_VALUE, 0); }
		public Name_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterName_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitName_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitName_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_exprContext name_expr() throws RecognitionException {
		Name_exprContext _localctx = new Name_exprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_name_expr);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				match(NEW_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1078);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1079);
				match(SMALL_NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1080);
				match(CAP_NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1081);
				match(SET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1082);
				match(VAR_DEC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1083);
				match(NUM);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1084);
				var();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1085);
				match(BOOL_VALUE);
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
		enterRule(_localctx, 76, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(LPAR);
			setState(1089);
			expr(0);
			setState(1090);
			match(DOT);
			setState(1091);
			match(DOT);
			setState(1092);
			expr(0);
			setState(1093);
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
		public TerminalNode CAP_NAME() { return getToken(SimpleLOOPParser.CAP_NAME, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode NEW_WORD() { return getToken(SimpleLOOPParser.NEW_WORD, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
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
		enterRule(_localctx, 78, RULE_my_new);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(CAP_NAME);
			setState(1096);
			match(DOT);
			setState(1097);
			match(NEW_WORD);
			setState(1098);
			match(LPAR);
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
				{
				setState(1099);
				func_input();
				}
			}

			setState(1102);
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
		enterRule(_localctx, 80, RULE_func_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			expr(0);
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1105);
				match(COMMA);
				setState(1106);
				func_input();
				}
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
		enterRule(_localctx, 82, RULE_my_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(RETURN);
			System.out.println("Return");
			setState(1111);
			expr(0);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public ExtContext ext() {
			return getRuleContext(ExtContext.class,0);
		}
		public TerminalNode SELF_SMALL_NAME() { return getToken(SimpleLOOPParser.SELF_SMALL_NAME, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_var);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				match(SMALL_NAME);
				setState(1115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1114);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				match(SELF_SMALL_NAME);
				setState(1119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1118);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1121);
				match(LPAR);
				setState(1122);
				match(SMALL_NAME);
				setState(1123);
				match(RPAR);
				setState(1125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1124);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1127);
				match(LPAR);
				setState(1128);
				match(SELF_SMALL_NAME);
				setState(1129);
				match(RPAR);
				setState(1131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1130);
					ext();
					}
					break;
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

	public static class ExtContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SimpleLOOPParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimpleLOOPParser.RBRACK, 0); }
		public ExtContext ext() {
			return getRuleContext(ExtContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode INIT() { return getToken(SimpleLOOPParser.INIT, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public ExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtContext ext() throws RecognitionException {
		ExtContext _localctx = new ExtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ext);
		int _la;
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				match(LBRACK);
				setState(1136);
				expr(0);
				setState(1137);
				match(RBRACK);
				setState(1139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1138);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				match(DOT);
				setState(1142);
				match(SMALL_NAME);
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1143);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				match(DOT);
				setState(1147);
				_la = _input.LA(1);
				if ( !(_la==INIT || _la==SMALL_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1148);
				match(LPAR);
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(1149);
					func_input();
					}
				}

				setState(1152);
				match(RPAR);
				setState(1154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1153);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1156);
				match(LPAR);
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(1157);
					func_input();
					}
				}

				setState(1160);
				match(RPAR);
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1161);
					ext();
					}
					break;
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

	public static class Const_exprContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public Const_expr_primeContext const_expr_prime() {
			return getRuleContext(Const_expr_primeContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SimpleLOOPParser.NUM, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(SimpleLOOPParser.BOOL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public Const_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterConst_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitConst_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitConst_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_exprContext const_expr() throws RecognitionException {
		Const_exprContext _localctx = new Const_exprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_const_expr);
		int _la;
		try {
			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				match(LPAR);
				setState(1167);
				const_expr();
				setState(1168);
				match(RPAR);
				setState(1169);
				const_expr_prime();
				}
				break;
			case BOOL_VALUE:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1172);
				const_expr_prime();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173);
				match(MINUS);
				setState(1174);
				const_expr();
				setState(1175);
				const_expr_prime();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1177);
				match(NOT);
				setState(1178);
				const_expr();
				setState(1179);
				const_expr_prime();
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

	public static class Const_expr_primeContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(SimpleLOOPParser.PLUS_PLUS, 0); }
		public Const_expr_primeContext const_expr_prime() {
			return getRuleContext(Const_expr_primeContext.class,0);
		}
		public TerminalNode MINUS_MINUS() { return getToken(SimpleLOOPParser.MINUS_MINUS, 0); }
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(SimpleLOOPParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SimpleLOOPParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(SimpleLOOPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
		public TerminalNode IS_EQUAL() { return getToken(SimpleLOOPParser.IS_EQUAL, 0); }
		public TerminalNode AND_AND() { return getToken(SimpleLOOPParser.AND_AND, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(SimpleLOOPParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(SimpleLOOPParser.COLON, 0); }
		public Const_expr_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_expr_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterConst_expr_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitConst_expr_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitConst_expr_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_expr_primeContext const_expr_prime() throws RecognitionException {
		Const_expr_primeContext _localctx = new Const_expr_primeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_const_expr_prime);
		int _la;
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				match(PLUS_PLUS);
				setState(1184);
				const_expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				match(MINUS_MINUS);
				setState(1186);
				const_expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1187);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1188);
				const_expr();
				setState(1189);
				const_expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1191);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1192);
				const_expr();
				setState(1193);
				const_expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1195);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1196);
				const_expr();
				setState(1197);
				const_expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1199);
				match(IS_EQUAL);
				setState(1200);
				const_expr();
				setState(1201);
				const_expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1203);
				match(AND_AND);
				setState(1204);
				const_expr();
				setState(1205);
				const_expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1207);
				match(QUESTION_MARK);
				setState(1208);
				const_expr();
				setState(1209);
				match(COLON);
				setState(1210);
				const_expr();
				setState(1211);
				const_expr_prime();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 25:
			return ternery_expr_sempred((Ternery_exprContext)_localctx, predIndex);
		case 26:
			return or_or_expr_sempred((Or_or_exprContext)_localctx, predIndex);
		case 27:
			return and_and_expr_sempred((And_and_exprContext)_localctx, predIndex);
		case 28:
			return is_equal_expr_sempred((Is_equal_exprContext)_localctx, predIndex);
		case 29:
			return comp_expr_sempred((Comp_exprContext)_localctx, predIndex);
		case 30:
			return sn_expr_sempred((Sn_exprContext)_localctx, predIndex);
		case 31:
			return md_expr_sempred((Md_exprContext)_localctx, predIndex);
		case 33:
			return inneg_expr_sempred((Inneg_exprContext)_localctx, predIndex);
		case 34:
			return arr_expr_sempred((Arr_exprContext)_localctx, predIndex);
		case 35:
			return dot_expr_sempred((Dot_exprContext)_localctx, predIndex);
		case 36:
			return par_expr_sempred((Par_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ternery_expr_sempred(Ternery_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean or_or_expr_sempred(Or_or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_and_expr_sempred(And_and_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean is_equal_expr_sempred(Is_equal_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comp_expr_sempred(Comp_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sn_expr_sempred(Sn_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean md_expr_sempred(Md_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean inneg_expr_sempred(Inneg_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arr_expr_sempred(Arr_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean dot_expr_sempred(Dot_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean par_expr_sempred(Par_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u04c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\2\3\2\3\3\3\3\6\3f\n\3\r\3\16\3"+
		"g\3\3\3\3\3\3\3\3\6\3n\n\3\r\3\16\3o\3\3\3\3\3\3\3\3\6\3v\n\3\r\3\16\3"+
		"w\3\3\3\3\3\3\6\3}\n\3\r\3\16\3~\3\3\3\3\3\3\3\3\3\3\5\3\u0086\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\4\7\4\u0093\n\4\f\4\16\4"+
		"\u0096\13\4\3\4\3\4\3\4\3\4\3\4\7\4\u009d\n\4\f\4\16\4\u00a0\13\4\3\5"+
		"\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\3\5\3\5\6\5\u00ab\n\5\r\5\16\5"+
		"\u00ac\3\5\7\5\u00b0\n\5\f\5\16\5\u00b3\13\5\3\5\6\5\u00b6\n\5\r\5\16"+
		"\5\u00b7\3\5\5\5\u00bb\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c3\n\6\3\6\7"+
		"\6\u00c6\n\6\f\6\16\6\u00c9\13\6\3\6\3\6\6\6\u00cd\n\6\r\6\16\6\u00ce"+
		"\3\6\5\6\u00d2\n\6\3\6\6\6\u00d5\n\6\r\6\16\6\u00d6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00e0\n\6\3\6\7\6\u00e3\n\6\f\6\16\6\u00e6\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00ed\n\6\5\6\u00ef\n\6\3\7\3\7\6\7\u00f3\n\7\r\7\16"+
		"\7\u00f4\3\7\3\7\3\7\3\7\6\7\u00fb\n\7\r\7\16\7\u00fc\3\7\3\7\3\7\6\7"+
		"\u0102\n\7\r\7\16\7\u0103\3\7\3\7\3\7\3\7\5\7\u010a\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0117\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u013a\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0144\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u014d\n\n\7"+
		"\n\u014f\n\n\f\n\16\n\u0152\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u015a\n\n"+
		"\3\n\3\n\3\13\3\13\6\13\u0160\n\13\r\13\16\13\u0161\3\13\3\13\3\13\3\13"+
		"\3\13\6\13\u0169\n\13\r\13\16\13\u016a\3\13\3\13\3\13\3\13\6\13\u0171"+
		"\n\13\r\13\16\13\u0172\3\13\3\13\3\13\3\13\6\13\u0179\n\13\r\13\16\13"+
		"\u017a\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0184\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u018a\n\f\3\f\3\f\7\f\u018e\n\f\f\f\16\f\u0191\13\f\3\f\3\f\6"+
		"\f\u0195\n\f\r\f\16\f\u0196\3\f\5\f\u019a\n\f\3\f\6\f\u019d\n\f\r\f\16"+
		"\f\u019e\3\f\3\f\3\r\3\r\6\r\u01a5\n\r\r\r\16\r\u01a6\3\r\3\r\3\r\3\r"+
		"\6\r\u01ad\n\r\r\r\16\r\u01ae\3\r\3\r\3\r\3\r\3\r\5\r\u01b6\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01be\n\16\3\16\3\16\3\16\3\16\5\16\u01c4"+
		"\n\16\3\16\3\16\7\16\u01c8\n\16\f\16\16\16\u01cb\13\16\3\16\3\16\6\16"+
		"\u01cf\n\16\r\16\16\16\u01d0\3\16\5\16\u01d4\n\16\3\16\6\16\u01d7\n\16"+
		"\r\16\16\16\u01d8\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01e2\n\16\3"+
		"\16\3\16\3\16\3\16\5\16\u01e8\n\16\3\16\3\16\6\16\u01ec\n\16\r\16\16\16"+
		"\u01ed\3\16\5\16\u01f1\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u01f8\n\17\3"+
		"\17\3\17\3\17\3\17\7\17\u01fe\n\17\f\17\16\17\u0201\13\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0207\n\17\3\17\5\17\u020a\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0213\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u021c"+
		"\n\20\5\20\u021e\n\20\3\21\3\21\6\21\u0222\n\21\r\21\16\21\u0223\3\21"+
		"\3\21\3\21\3\21\6\21\u022a\n\21\r\21\16\21\u022b\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0233\n\21\3\22\3\22\6\22\u0237\n\22\r\22\16\22\u0238\3\22\3"+
		"\22\3\22\3\22\6\22\u023f\n\22\r\22\16\22\u0240\3\22\3\22\3\22\3\22\5\22"+
		"\u0247\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0250\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u025a\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0264\n\24\3\24\3\24\5\24\u0268\n\24\3\25\3"+
		"\25\3\25\3\25\6\25\u026e\n\25\r\25\16\25\u026f\3\25\3\25\6\25\u0274\n"+
		"\25\r\25\16\25\u0275\3\25\3\25\5\25\u027a\n\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0280\n\25\f\25\16\25\u0283\13\25\3\25\3\25\6\25\u0287\n\25\r\25\16\25"+
		"\u0288\3\25\5\25\u028c\n\25\3\25\6\25\u028f\n\25\r\25\16\25\u0290\3\25"+
		"\3\25\6\25\u0295\n\25\r\25\16\25\u0296\3\25\3\25\5\25\u029b\n\25\3\25"+
		"\3\25\3\25\3\25\6\25\u02a1\n\25\r\25\16\25\u02a2\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u02ab\n\25\f\25\16\25\u02ae\13\25\3\25\3\25\6\25\u02b2\n"+
		"\25\r\25\16\25\u02b3\3\25\5\25\u02b7\n\25\3\25\6\25\u02ba\n\25\r\25\16"+
		"\25\u02bb\3\25\3\25\5\25\u02c0\n\25\3\26\3\26\3\26\6\26\u02c5\n\26\r\26"+
		"\16\26\u02c6\3\26\3\26\3\26\3\26\7\26\u02cd\n\26\f\26\16\26\u02d0\13\26"+
		"\3\26\3\26\6\26\u02d4\n\26\r\26\16\26\u02d5\3\26\5\26\u02d9\n\26\3\26"+
		"\6\26\u02dc\n\26\r\26\16\26\u02dd\3\26\5\26\u02e1\n\26\3\27\3\27\3\27"+
		"\3\27\6\27\u02e7\n\27\r\27\16\27\u02e8\3\27\3\27\6\27\u02ed\n\27\r\27"+
		"\16\27\u02ee\3\27\3\27\5\27\u02f3\n\27\3\27\3\27\3\27\3\27\7\27\u02f9"+
		"\n\27\f\27\16\27\u02fc\13\27\3\27\3\27\6\27\u0300\n\27\r\27\16\27\u0301"+
		"\3\27\5\27\u0305\n\27\3\27\6\27\u0308\n\27\r\27\16\27\u0309\3\27\3\27"+
		"\6\27\u030e\n\27\r\27\16\27\u030f\3\27\3\27\5\27\u0314\n\27\3\27\3\27"+
		"\3\27\3\27\6\27\u031a\n\27\r\27\16\27\u031b\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u0324\n\27\f\27\16\27\u0327\13\27\3\27\3\27\6\27\u032b\n\27\r"+
		"\27\16\27\u032c\3\27\5\27\u0330\n\27\3\27\6\27\u0333\n\27\r\27\16\27\u0334"+
		"\3\27\3\27\5\27\u0339\n\27\3\30\3\30\5\30\u033d\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\6\30\u0346\n\30\r\30\16\30\u0347\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u034f\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0358\n"+
		"\30\f\30\16\30\u035b\13\30\3\30\3\30\3\30\6\30\u0360\n\30\r\30\16\30\u0361"+
		"\3\30\5\30\u0365\n\30\3\30\6\30\u0368\n\30\r\30\16\30\u0369\3\30\3\30"+
		"\5\30\u036e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u037e\n\32\f\32\16\32\u0381\13\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u038d\n\33\f\33\16\33\u0390\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u039a\n\34\f\34\16\34"+
		"\u039d\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u03a7\n\35\f"+
		"\35\16\35\u03aa\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u03b4"+
		"\n\36\f\36\16\36\u03b7\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u03c6\n\37\f\37\16\37\u03c9\13\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u03d8\n \f \16 \u03db\13 \3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u03ea\n!\f!\16!\u03ed\13!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03f8\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7"+
		"#\u0403\n#\f#\16#\u0406\13#\3$\3$\3$\3$\3$\3$\5$\u040e\n$\3$\3$\3$\3$"+
		"\3$\7$\u0415\n$\f$\16$\u0418\13$\3%\3%\3%\5%\u041d\n%\3%\3%\3%\7%\u0422"+
		"\n%\f%\16%\u0425\13%\3&\3&\3&\3&\3&\3&\5&\u042d\n&\3&\3&\3&\7&\u0432\n"+
		"&\f&\16&\u0435\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0441\n"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u044f\n)\3)\3)\3*\3*\3*\5*\u0456"+
		"\n*\3+\3+\3+\3+\3,\3,\5,\u045e\n,\3,\3,\5,\u0462\n,\3,\3,\3,\3,\5,\u0468"+
		"\n,\3,\3,\3,\3,\5,\u046e\n,\5,\u0470\n,\3-\3-\3-\3-\5-\u0476\n-\3-\3-"+
		"\3-\5-\u047b\n-\3-\3-\3-\3-\5-\u0481\n-\3-\3-\5-\u0485\n-\3-\3-\5-\u0489"+
		"\n-\3-\3-\5-\u048d\n-\5-\u048f\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u04a0\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u04c1\n/\3/\2\16\62\64"+
		"\668:<>@DFHJ\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\\2\7\4\2\13\13\67\67\4\2\7\7\62\62\3\2\17\20"+
		"\3\2\21\22\3\2*+\2\u0583\2_\3\2\2\2\4\u0085\3\2\2\2\6\u008c\3\2\2\2\b"+
		"\u00ba\3\2\2\2\n\u00ee\3\2\2\2\f\u0109\3\2\2\2\16\u010b\3\2\2\2\20\u0139"+
		"\3\2\2\2\22\u013b\3\2\2\2\24\u0183\3\2\2\2\26\u0185\3\2\2\2\30\u01b5\3"+
		"\2\2\2\32\u01f0\3\2\2\2\34\u0209\3\2\2\2\36\u021d\3\2\2\2 \u0232\3\2\2"+
		"\2\"\u0246\3\2\2\2$\u024f\3\2\2\2&\u0267\3\2\2\2(\u02bf\3\2\2\2*\u02e0"+
		"\3\2\2\2,\u0338\3\2\2\2.\u036d\3\2\2\2\60\u036f\3\2\2\2\62\u0375\3\2\2"+
		"\2\64\u0382\3\2\2\2\66\u0391\3\2\2\28\u039e\3\2\2\2:\u03ab\3\2\2\2<\u03b8"+
		"\3\2\2\2>\u03ca\3\2\2\2@\u03dc\3\2\2\2B\u03f7\3\2\2\2D\u03f9\3\2\2\2F"+
		"\u040d\3\2\2\2H\u041c\3\2\2\2J\u042c\3\2\2\2L\u0440\3\2\2\2N\u0442\3\2"+
		"\2\2P\u0449\3\2\2\2R\u0452\3\2\2\2T\u0457\3\2\2\2V\u046f\3\2\2\2X\u048e"+
		"\3\2\2\2Z\u049f\3\2\2\2\\\u04c0\3\2\2\2^`\5\4\3\2_^\3\2\2\2_`\3\2\2\2"+
		"`a\3\2\2\2ab\7\2\2\3b\3\3\2\2\2ce\5\6\4\2df\7\'\2\2ed\3\2\2\2fg\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5\4\3\2j\u0086\3\2\2\2km\5\b\5\2ln"+
		"\7\'\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\5\4\3\2r"+
		"\u0086\3\2\2\2su\5\n\6\2tv\7\'\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2"+
		"\2\2xy\3\2\2\2yz\5\f\7\2z\u0086\3\2\2\2{}\7\'\2\2|{\3\2\2\2}~\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0086\5\4\3\2\u0081\u0086"+
		"\5\6\4\2\u0082\u0086\5\b\5\2\u0083\u0086\5\n\6\2\u0084\u0086\3\2\2\2\u0085"+
		"c\3\2\2\2\u0085k\3\2\2\2\u0085s\3\2\2\2\u0085|\3\2\2\2\u0085\u0081\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\5\3\2\2\2\u0087\u008d\7\r\2\2\u0088\u008d\7\23\2\2\u0089\u008d\7\61\2"+
		"\2\u008a\u008d\5\16\b\2\u008b\u008d\5\22\n\2\u008c\u0087\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0094\3\2\2\2\u008e\u008f\7!\2\2\u008f\u0090\5\62\32\2\u0090"+
		"\u0091\7 \2\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\67\2\2\u0098\u009e\b\4\1\2\u0099\u009a\7"+
		"\32\2\2\u009a\u009b\7\67\2\2\u009b\u009d\b\4\1\2\u009c\u0099\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\7\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a1\u00a5\7/\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00bb\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7(\2\2\u00a9\u00ab\7\'"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\13\2\2\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\7\'\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\7)\2\2\u00ba\u00a1\3\2\2\2\u00ba\u00a8\3\2"+
		"\2\2\u00bb\t\3\2\2\2\u00bc\u00bd\7\35\2\2\u00bd\u00be\7\61\2\2\u00be\u00c2"+
		"\b\6\1\2\u00bf\u00c0\7*\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c3\b\6\1\2\u00c2"+
		"\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6\7\'"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d1\7\""+
		"\2\2\u00cb\u00cd\7\'\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\5\24"+
		"\13\2\u00d1\u00cc\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d5\7\'\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00ef\7#\2\2\u00d9"+
		"\u00da\7\35\2\2\u00da\u00db\7\61\2\2\u00db\u00df\b\6\1\2\u00dc\u00dd\7"+
		"*\2\2\u00dd\u00de\7\61\2\2\u00de\u00e0\b\6\1\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\7\'\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00ec\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ed\5\b\5\2\u00e8\u00e9\7\37"+
		"\2\2\u00e9\u00ed\5\6\4\2\u00ea\u00ed\5\26\f\2\u00eb\u00ed\5\32\16\2\u00ec"+
		"\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00bc\3\2\2\2\u00ee"+
		"\u00d9\3\2\2\2\u00ef\13\3\2\2\2\u00f0\u00f2\5\n\6\2\u00f1\u00f3\7\'\2"+
		"\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5\f\7\2\u00f7\u010a\3\2\2\2\u00f8"+
		"\u00fa\5\b\5\2\u00f9\u00fb\7\'\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\5\f\7\2\u00ff\u010a\3\2\2\2\u0100\u0102\7\'\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u010a\5\f\7\2\u0106\u010a\5\n\6\2\u0107\u010a\5\b"+
		"\5\2\u0108\u010a\3\2\2\2\u0109\u00f0\3\2\2\2\u0109\u00f8\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2"+
		"\2\2\u010a\r\3\2\2\2\u010b\u010c\7\60\2\2\u010c\u010d\7*\2\2\u010d\u010e"+
		"\7\r\2\2\u010e\u010f\7+\2\2\u010f\17\3\2\2\2\u0110\u0111\7\60\2\2\u0111"+
		"\u0112\7.\2\2\u0112\u0113\7\16\2\2\u0113\u0114\b\t\1\2\u0114\u0116\7$"+
		"\2\2\u0115\u0117\5R*\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u013a\7%\2\2\u0119\u011a\5V,\2\u011a\u011b\7.\2\2\u011b"+
		"\u011c\7\63\2\2\u011c\u011d\b\t\1\2\u011d\u011e\7$\2\2\u011e\u011f\5\62"+
		"\32\2\u011f\u0120\7%\2\2\u0120\u013a\3\2\2\2\u0121\u0122\5V,\2\u0122\u0123"+
		"\7.\2\2\u0123\u0124\7\64\2\2\u0124\u0125\b\t\1\2\u0125\u0126\7$\2\2\u0126"+
		"\u0127\5\62\32\2\u0127\u0128\7%\2\2\u0128\u013a\3\2\2\2\u0129\u012a\5"+
		"V,\2\u012a\u012b\7.\2\2\u012b\u012c\7\65\2\2\u012c\u012d\b\t\1\2\u012d"+
		"\u012e\7$\2\2\u012e\u012f\5\62\32\2\u012f\u0130\7%\2\2\u0130\u013a\3\2"+
		"\2\2\u0131\u0132\5V,\2\u0132\u0133\7.\2\2\u0133\u0134\7\66\2\2\u0134\u0135"+
		"\b\t\1\2\u0135\u0136\7$\2\2\u0136\u0137\5\62\32\2\u0137\u0138\7%\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0110\3\2\2\2\u0139\u0119\3\2\2\2\u0139\u0121\3\2"+
		"\2\2\u0139\u0129\3\2\2\2\u0139\u0131\3\2\2\2\u013a\21\3\2\2\2\u013b\u013c"+
		"\7\25\2\2\u013c\u0143\7*\2\2\u013d\u0144\7\24\2\2\u013e\u0144\7\r\2\2"+
		"\u013f\u0144\7\23\2\2\u0140\u0144\7\61\2\2\u0141\u0144\5\16\b\2\u0142"+
		"\u0144\5\22\n\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u013f\3"+
		"\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0150\3\2\2\2\u0145\u014c\7\32\2\2\u0146\u014d\7\24\2\2\u0147\u014d\7"+
		"\r\2\2\u0148\u014d\7\23\2\2\u0149\u014d\7\61\2\2\u014a\u014d\5\16\b\2"+
		"\u014b\u014d\5\22\n\2\u014c\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148"+
		"\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0145\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0159\7&\2\2\u0154\u015a\7\24\2\2\u0155\u015a\7\r\2\2\u0156\u015a\7\23"+
		"\2\2\u0157\u015a\7\61\2\2\u0158\u015a\5\16\b\2\u0159\u0154\3\2\2\2\u0159"+
		"\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7+\2\2\u015c\23\3\2\2\2\u015d\u015f"+
		"\5\b\5\2\u015e\u0160\7\'\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\5\24"+
		"\13\2\u0164\u0184\3\2\2\2\u0165\u0166\7\37\2\2\u0166\u0168\5\6\4\2\u0167"+
		"\u0169\7\'\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5\24\13\2\u016d"+
		"\u0184\3\2\2\2\u016e\u0170\5\26\f\2\u016f\u0171\7\'\2\2\u0170\u016f\3"+
		"\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\5\24\13\2\u0175\u0184\3\2\2\2\u0176\u0178\5"+
		"\32\16\2\u0177\u0179\7\'\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\5\24"+
		"\13\2\u017d\u0184\3\2\2\2\u017e\u0184\5\b\5\2\u017f\u0180\7\37\2\2\u0180"+
		"\u0184\5\6\4\2\u0181\u0184\5\26\f\2\u0182\u0184\5\32\16\2\u0183\u015d"+
		"\3\2\2\2\u0183\u0165\3\2\2\2\u0183\u016e\3\2\2\2\u0183\u0176\3\2\2\2\u0183"+
		"\u017e\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2"+
		"\2\2\u0184\25\3\2\2\2\u0185\u0186\7\37\2\2\u0186\u0187\7\13\2\2\u0187"+
		"\u0189\7$\2\2\u0188\u018a\5\34\17\2\u0189\u0188\3\2\2\2\u0189\u018a\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\7%\2\2\u018c\u018e\7\'\2\2\u018d"+
		"\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0199\7\"\2\2\u0193"+
		"\u0195\7\'\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\5\30\r\2\u0199"+
		"\u0194\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\7\'"+
		"\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7#\2\2\u01a1\27\3\2\2\2"+
		"\u01a2\u01a4\5\b\5\2\u01a3\u01a5\7\'\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\5\30\r\2\u01a9\u01b6\3\2\2\2\u01aa\u01ac\5\6\4\2\u01ab\u01ad\7"+
		"\'\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5\30\r\2\u01b1\u01b6\3"+
		"\2\2\2\u01b2\u01b6\5\"\22\2\u01b3\u01b6\5\b\5\2\u01b4\u01b6\5\6\4\2\u01b5"+
		"\u01a2\3\2\2\2\u01b5\u01aa\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b5\u01b4\3\2\2\2\u01b6\31\3\2\2\2\u01b7\u01bd\7\37\2\2\u01b8\u01be"+
		"\7\24\2\2\u01b9\u01be\7\r\2\2\u01ba\u01be\7\23\2\2\u01bb\u01be\5\16\b"+
		"\2\u01bc\u01be\7\61\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd"+
		"\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c0\7\67\2\2\u01c0\u01c1\b\16\1\2\u01c1\u01c3\7$\2\2\u01c2"+
		"\u01c4\5\34\17\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3"+
		"\2\2\2\u01c5\u01c9\7%\2\2\u01c6\u01c8\7\'\2\2\u01c7\u01c6\3\2\2\2\u01c8"+
		"\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d3\7\"\2\2\u01cd\u01cf\7\'\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\5 \21\2\u01d3\u01ce\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\7\'\2\2\u01d6\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01f1\7#\2\2\u01db\u01e1\7\37\2\2\u01dc\u01e2\7\24"+
		"\2\2\u01dd\u01e2\7\r\2\2\u01de\u01e2\7\23\2\2\u01df\u01e2\5\16\b\2\u01e0"+
		"\u01e2\7\61\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01de\3"+
		"\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\7\67\2\2\u01e4\u01e5\b\16\1\2\u01e5\u01e7\7$\2\2\u01e6\u01e8\5"+
		"\34\17\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\7%\2\2\u01ea\u01ec\7\'\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f1\5$\23\2\u01f0\u01b7\3\2\2\2\u01f0\u01db\3\2\2\2\u01f1\33\3\2\2"+
		"\2\u01f2\u01f8\7\r\2\2\u01f3\u01f8\7\23\2\2\u01f4\u01f8\7\61\2\2\u01f5"+
		"\u01f8\5\16\b\2\u01f6\u01f8\5\22\n\2\u01f7\u01f2\3\2\2\2\u01f7\u01f3\3"+
		"\2\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"\u01ff\3\2\2\2\u01f9\u01fa\7!\2\2\u01fa\u01fb\5\62\32\2\u01fb\u01fc\7"+
		" \2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0202\u0203\7\67\2\2\u0203\u0206\b\17\1\2\u0204\u0205\7\32\2\2\u0205"+
		"\u0207\5\34\17\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020a\3"+
		"\2\2\2\u0208\u020a\5\36\20\2\u0209\u01f7\3\2\2\2\u0209\u0208\3\2\2\2\u020a"+
		"\35\3\2\2\2\u020b\u020c\7\r\2\2\u020c\u020d\7\67\2\2\u020d\u020e\7-\2"+
		"\2\u020e\u020f\b\20\1\2\u020f\u0212\5\62\32\2\u0210\u0211\7\32\2\2\u0211"+
		"\u0213\5\36\20\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u021e\3"+
		"\2\2\2\u0214\u0215\7\23\2\2\u0215\u0216\7\67\2\2\u0216\u0217\7-\2\2\u0217"+
		"\u0218\b\20\1\2\u0218\u021b\5\62\32\2\u0219\u021a\7\32\2\2\u021a\u021c"+
		"\5\36\20\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2"+
		"\u021d\u020b\3\2\2\2\u021d\u0214\3\2\2\2\u021e\37\3\2\2\2\u021f\u0221"+
		"\5\b\5\2\u0220\u0222\7\'\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5 "+
		"\21\2\u0226\u0233\3\2\2\2\u0227\u0229\5\6\4\2\u0228\u022a\7\'\2\2\u0229"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022e\5 \21\2\u022e\u0233\3\2\2\2\u022f"+
		"\u0233\5\"\22\2\u0230\u0233\5\b\5\2\u0231\u0233\5\6\4\2\u0232\u021f\3"+
		"\2\2\2\u0232\u0227\3\2\2\2\u0232\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0231\3\2\2\2\u0233!\3\2\2\2\u0234\u0236\5\b\5\2\u0235\u0237\7\'\2\2"+
		"\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\5\"\22\2\u023b\u0247\3\2\2\2"+
		"\u023c\u023e\5$\23\2\u023d\u023f\7\'\2\2\u023e\u023d\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\5\"\22\2\u0243\u0247\3\2\2\2\u0244\u0247\5$\23\2\u0245\u0247\5"+
		"\b\5\2\u0246\u0234\3\2\2\2\u0246\u023c\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0245\3\2\2\2\u0247#\3\2\2\2\u0248\u0250\5(\25\2\u0249\u0250\5.\30\2"+
		"\u024a\u0250\5\60\31\2\u024b\u0250\5T+\2\u024c\u0250\5&\24\2\u024d\u0250"+
		"\5\20\t\2\u024e\u0250\5\62\32\2\u024f\u0248\3\2\2\2\u024f\u0249\3\2\2"+
		"\2\u024f\u024a\3\2\2\2\u024f\u024b\3\2\2\2\u024f\u024c\3\2\2\2\u024f\u024d"+
		"\3\2\2\2\u024f\u024e\3\2\2\2\u0250%\3\2\2\2\u0251\u0252\7$\2\2\u0252\u0253"+
		"\5&\24\2\u0253\u0254\7%\2\2\u0254\u0268\3\2\2\2\u0255\u0256\b\24\1\2\u0256"+
		"\u0257\5V,\2\u0257\u0259\7$\2\2\u0258\u025a\5R*\2\u0259\u0258\3\2\2\2"+
		"\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7%\2\2\u025c\u0268"+
		"\3\2\2\2\u025d\u025e\b\24\1\2\u025e\u025f\5V,\2\u025f\u0260\7.\2\2\u0260"+
		"\u0261\7\13\2\2\u0261\u0263\7$\2\2\u0262\u0264\5R*\2\u0263\u0262\3\2\2"+
		"\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7%\2\2\u0266\u0268"+
		"\3\2\2\2\u0267\u0251\3\2\2\2\u0267\u0255\3\2\2\2\u0267\u025d\3\2\2\2\u0268"+
		"\'\3\2\2\2\u0269\u026a\7\b\2\2\u026a\u026b\b\25\1\2\u026b\u026d\5\62\32"+
		"\2\u026c\u026e\7\'\2\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\5$\23\2\u0272"+
		"\u0274\7\'\2\2\u0273\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u027a\5*\26\2\u0278"+
		"\u027a\5,\27\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a\u02c0\3\2"+
		"\2\2\u027b\u027c\7\b\2\2\u027c\u027d\b\25\1\2\u027d\u0281\5\62\32\2\u027e"+
		"\u0280\7\'\2\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284"+
		"\u0286\7\"\2\2\u0285\u0287\7\'\2\2\u0286\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a"+
		"\u028c\5\"\22\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3"+
		"\2\2\2\u028d\u028f\7\'\2\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\7#"+
		"\2\2\u0293\u0295\7\'\2\2\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u029b\5*"+
		"\26\2\u0299\u029b\5,\27\2\u029a\u0298\3\2\2\2\u029a\u0299\3\2\2\2\u029b"+
		"\u02c0\3\2\2\2\u029c\u029d\7\b\2\2\u029d\u029e\b\25\1\2\u029e\u02a0\5"+
		"\62\32\2\u029f\u02a1\7\'\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\5$"+
		"\23\2\u02a5\u02c0\3\2\2\2\u02a6\u02a7\7\b\2\2\u02a7\u02a8\b\25\1\2\u02a8"+
		"\u02ac\5\62\32\2\u02a9\u02ab\7\'\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ae\3"+
		"\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b1\7\"\2\2\u02b0\u02b2\7\'\2\2\u02b1\u02b0\3\2"+
		"\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b6\3\2\2\2\u02b5\u02b7\5\"\22\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3"+
		"\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02ba\7\'\2\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd\u02be\7#\2\2\u02be\u02c0\3\2\2\2\u02bf\u0269\3\2\2\2\u02bf"+
		"\u027b\3\2\2\2\u02bf\u029c\3\2\2\2\u02bf\u02a6\3\2\2\2\u02c0)\3\2\2\2"+
		"\u02c1\u02c2\7\t\2\2\u02c2\u02c4\b\26\1\2\u02c3\u02c5\7\'\2\2\u02c4\u02c3"+
		"\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02e1\5$\23\2\u02c9\u02ca\7\t\2\2\u02ca\u02ce\b\26"+
		"\1\2\u02cb\u02cd\7\'\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d1\u02d3\7\"\2\2\u02d2\u02d4\7\'\2\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2"+
		"\2\2\u02d7\u02d9\5\"\22\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02dc\7\'\2\2\u02db\u02da\3\2\2\2\u02dc\u02dd\3\2"+
		"\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e1\7#\2\2\u02e0\u02c1\3\2\2\2\u02e0\u02c9\3\2\2\2\u02e1+\3\2\2\2\u02e2"+
		"\u02e3\7\n\2\2\u02e3\u02e4\b\27\1\2\u02e4\u02e6\5\62\32\2\u02e5\u02e7"+
		"\7\'\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\5$\23\2\u02eb\u02ed\7\'"+
		"\2\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02f3\5*\26\2\u02f1\u02f3\5,"+
		"\27\2\u02f2\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u0339\3\2\2\2\u02f4"+
		"\u02f5\7\n\2\2\u02f5\u02f6\b\27\1\2\u02f6\u02fa\5\62\32\2\u02f7\u02f9"+
		"\7\'\2\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02ff\7\""+
		"\2\2\u02fe\u0300\7\'\2\2\u02ff\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0305\5\""+
		"\22\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306"+
		"\u0308\7\'\2\2\u0307\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2"+
		"\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\7#\2\2\u030c"+
		"\u030e\7\'\2\2\u030d\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u030d\3\2"+
		"\2\2\u030f\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u0314\5*\26\2\u0312"+
		"\u0314\5,\27\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314\u0339\3\2"+
		"\2\2\u0315\u0316\7\n\2\2\u0316\u0317\b\27\1\2\u0317\u0319\5\62\32\2\u0318"+
		"\u031a\7\'\2\2\u0319\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2"+
		"\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\5$\23\2\u031e"+
		"\u0339\3\2\2\2\u031f\u0320\7\n\2\2\u0320\u0321\b\27\1\2\u0321\u0325\5"+
		"\62\32\2\u0322\u0324\7\'\2\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2"+
		"\2\2\u0328\u032a\7\"\2\2\u0329\u032b\7\'\2\2\u032a\u0329\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2"+
		"\2\2\u032e\u0330\5\"\22\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0332\3\2\2\2\u0331\u0333\7\'\2\2\u0332\u0331\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0337\7#\2\2\u0337\u0339\3\2\2\2\u0338\u02e2\3\2\2\2\u0338\u02f4\3\2"+
		"\2\2\u0338\u0315\3\2\2\2\u0338\u031f\3\2\2\2\u0339-\3\2\2\2\u033a\u033d"+
		"\5V,\2\u033b\u033d\5N(\2\u033c\u033a\3\2\2\2\u033c\u033b\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u033f\7.\2\2\u033f\u0340\7\f\2\2\u0340\u0341\7\6"+
		"\2\2\u0341\u0342\7\34\2\2\u0342\u0343\5V,\2\u0343\u0345\7\34\2\2\u0344"+
		"\u0346\7\'\2\2\u0345\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\b\30\1\2\u034a"+
		"\u034b\5$\23\2\u034b\u036e\3\2\2\2\u034c\u034f\5V,\2\u034d\u034f\5N(\2"+
		"\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351"+
		"\7.\2\2\u0351\u0352\7\f\2\2\u0352\u0353\7\6\2\2\u0353\u0354\7\34\2\2\u0354"+
		"\u0355\5V,\2\u0355\u0359\7\34\2\2\u0356\u0358\7\'\2\2\u0357\u0356\3\2"+
		"\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035c\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035d\b\30\1\2\u035d\u0364\7"+
		"\"\2\2\u035e\u0360\7\'\2\2\u035f\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\5\""+
		"\22\2\u0364\u035f\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366"+
		"\u0368\7\'\2\2\u0367\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0367\3\2"+
		"\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\7#\2\2\u036c"+
		"\u036e\3\2\2\2\u036d\u033c\3\2\2\2\u036d\u034e\3\2\2\2\u036e/\3\2\2\2"+
		"\u036f\u0370\7\5\2\2\u0370\u0371\b\31\1\2\u0371\u0372\7$\2\2\u0372\u0373"+
		"\5\62\32\2\u0373\u0374\7%\2\2\u0374\61\3\2\2\2\u0375\u0376\b\32\1\2\u0376"+
		"\u0377\5\64\33\2\u0377\u037f\3\2\2\2\u0378\u0379\f\4\2\2\u0379\u037a\7"+
		"-\2\2\u037a\u037b\5\64\33\2\u037b\u037c\b\32\1\2\u037c\u037e\3\2\2\2\u037d"+
		"\u0378\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2"+
		"\2\2\u0380\63\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0383\b\33\1\2\u0383\u0384"+
		"\5\66\34\2\u0384\u038e\3\2\2\2\u0385\u0386\f\4\2\2\u0386\u0387\7\30\2"+
		"\2\u0387\u0388\5\64\33\2\u0388\u0389\7\31\2\2\u0389\u038a\5\66\34\2\u038a"+
		"\u038b\b\33\1\2\u038b\u038d\3\2\2\2\u038c\u0385\3\2\2\2\u038d\u0390\3"+
		"\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\65\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0391\u0392\b\34\1\2\u0392\u0393\58\35\2\u0393\u039b\3"+
		"\2\2\2\u0394\u0395\f\4\2\2\u0395\u0396\79\2\2\u0396\u0397\58\35\2\u0397"+
		"\u0398\b\34\1\2\u0398\u039a\3\2\2\2\u0399\u0394\3\2\2\2\u039a\u039d\3"+
		"\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\67\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u039f\b\35\1\2\u039f\u03a0\5:\36\2\u03a0\u03a8\3"+
		"\2\2\2\u03a1\u03a2\f\4\2\2\u03a2\u03a3\78\2\2\u03a3\u03a4\5:\36\2\u03a4"+
		"\u03a5\b\35\1\2\u03a5\u03a7\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a7\u03aa\3"+
		"\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a99\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03ab\u03ac\b\36\1\2\u03ac\u03ad\5<\37\2\u03ad\u03b5\3\2\2\2"+
		"\u03ae\u03af\f\4\2\2\u03af\u03b0\7,\2\2\u03b0\u03b1\5<\37\2\u03b1\u03b2"+
		"\b\36\1\2\u03b2\u03b4\3\2\2\2\u03b3\u03ae\3\2\2\2\u03b4\u03b7\3\2\2\2"+
		"\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6;\3\2\2\2\u03b7\u03b5\3"+
		"\2\2\2\u03b8\u03b9\b\37\1\2\u03b9\u03ba\5> \2\u03ba\u03c7\3\2\2\2\u03bb"+
		"\u03bc\f\5\2\2\u03bc\u03bd\7*\2\2\u03bd\u03be\5> \2\u03be\u03bf\b\37\1"+
		"\2\u03bf\u03c6\3\2\2\2\u03c0\u03c1\f\4\2\2\u03c1\u03c2\7+\2\2\u03c2\u03c3"+
		"\5> \2\u03c3\u03c4\b\37\1\2\u03c4\u03c6\3\2\2\2\u03c5\u03bb\3\2\2\2\u03c5"+
		"\u03c0\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2"+
		"\2\2\u03c8=\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03cb\b \1\2\u03cb\u03cc"+
		"\5@!\2\u03cc\u03d9\3\2\2\2\u03cd\u03ce\f\5\2\2\u03ce\u03cf\7\21\2\2\u03cf"+
		"\u03d0\5@!\2\u03d0\u03d1\b \1\2\u03d1\u03d8\3\2\2\2\u03d2\u03d3\f\4\2"+
		"\2\u03d3\u03d4\7\22\2\2\u03d4\u03d5\5@!\2\u03d5\u03d6\b \1\2\u03d6\u03d8"+
		"\3\2\2\2\u03d7\u03cd\3\2\2\2\u03d7\u03d2\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da?\3\2\2\2\u03db\u03d9\3\2\2\2"+
		"\u03dc\u03dd\b!\1\2\u03dd\u03de\5B\"\2\u03de\u03eb\3\2\2\2\u03df\u03e0"+
		"\f\5\2\2\u03e0\u03e1\7\20\2\2\u03e1\u03e2\5B\"\2\u03e2\u03e3\b!\1\2\u03e3"+
		"\u03ea\3\2\2\2\u03e4\u03e5\f\4\2\2\u03e5\u03e6\7\17\2\2\u03e6\u03e7\5"+
		"B\"\2\u03e7\u03e8\b!\1\2\u03e8\u03ea\3\2\2\2\u03e9\u03df\3\2\2\2\u03e9"+
		"\u03e4\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2"+
		"\2\2\u03ecA\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef\7\33\2\2\u03ef\u03f0"+
		"\5B\"\2\u03f0\u03f1\b\"\1\2\u03f1\u03f8\3\2\2\2\u03f2\u03f3\7\22\2\2\u03f3"+
		"\u03f4\5B\"\2\u03f4\u03f5\b\"\1\2\u03f5\u03f8\3\2\2\2\u03f6\u03f8\5D#"+
		"\2\u03f7\u03ee\3\2\2\2\u03f7\u03f2\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8C"+
		"\3\2\2\2\u03f9\u03fa\b#\1\2\u03fa\u03fb\5F$\2\u03fb\u0404\3\2\2\2\u03fc"+
		"\u03fd\f\5\2\2\u03fd\u03fe\7\26\2\2\u03fe\u0403\b#\1\2\u03ff\u0400\f\4"+
		"\2\2\u0400\u0401\7\27\2\2\u0401\u0403\b#\1\2\u0402\u03fc\3\2\2\2\u0402"+
		"\u03ff\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2"+
		"\2\2\u0405E\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u0408\b$\1\2\u0408\u040e"+
		"\5H%\2\u0409\u040a\7!\2\2\u040a\u040b\5H%\2\u040b\u040c\7 \2\2\u040c\u040e"+
		"\3\2\2\2\u040d\u0407\3\2\2\2\u040d\u0409\3\2\2\2\u040e\u0416\3\2\2\2\u040f"+
		"\u0410\f\5\2\2\u0410\u0411\7!\2\2\u0411\u0412\5H%\2\u0412\u0413\7 \2\2"+
		"\u0413\u0415\3\2\2\2\u0414\u040f\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414"+
		"\3\2\2\2\u0416\u0417\3\2\2\2\u0417G\3\2\2\2\u0418\u0416\3\2\2\2\u0419"+
		"\u041a\b%\1\2\u041a\u041d\5\20\t\2\u041b\u041d\5J&\2\u041c\u0419\3\2\2"+
		"\2\u041c\u041b\3\2\2\2\u041d\u0423\3\2\2\2\u041e\u041f\f\4\2\2\u041f\u0420"+
		"\7.\2\2\u0420\u0422\5J&\2\u0421\u041e\3\2\2\2\u0422\u0425\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424I\3\2\2\2\u0425\u0423\3\2\2\2"+
		"\u0426\u0427\b&\1\2\u0427\u0428\7$\2\2\u0428\u0429\5\62\32\2\u0429\u042a"+
		"\7%\2\2\u042a\u042d\3\2\2\2\u042b\u042d\5L\'\2\u042c\u0426\3\2\2\2\u042c"+
		"\u042b\3\2\2\2\u042d\u0433\3\2\2\2\u042e\u042f\f\3\2\2\u042f\u0430\7$"+
		"\2\2\u0430\u0432\7%\2\2\u0431\u042e\3\2\2\2\u0432\u0435\3\2\2\2\u0433"+
		"\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434K\3\2\2\2\u0435\u0433\3\2\2\2"+
		"\u0436\u0441\7\16\2\2\u0437\u0441\7\23\2\2\u0438\u0441\7:\2\2\u0439\u0441"+
		"\7\67\2\2\u043a\u0441\7\61\2\2\u043b\u0441\7\60\2\2\u043c\u0441\7;\2\2"+
		"\u043d\u0441\7\62\2\2\u043e\u0441\5V,\2\u043f\u0441\7\7\2\2\u0440\u0436"+
		"\3\2\2\2\u0440\u0437\3\2\2\2\u0440\u0438\3\2\2\2\u0440\u0439\3\2\2\2\u0440"+
		"\u043a\3\2\2\2\u0440\u043b\3\2\2\2\u0440\u043c\3\2\2\2\u0440\u043d\3\2"+
		"\2\2\u0440\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441M\3\2\2\2\u0442\u0443"+
		"\7$\2\2\u0443\u0444\5\62\32\2\u0444\u0445\7.\2\2\u0445\u0446\7.\2\2\u0446"+
		"\u0447\5\62\32\2\u0447\u0448\7%\2\2\u0448O\3\2\2\2\u0449\u044a\7\61\2"+
		"\2\u044a\u044b\7.\2\2\u044b\u044c\7\16\2\2\u044c\u044e\7$\2\2\u044d\u044f"+
		"\5R*\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u0451\7%\2\2\u0451Q\3\2\2\2\u0452\u0455\5\62\32\2\u0453\u0454\7\32\2"+
		"\2\u0454\u0456\5R*\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456S\3"+
		"\2\2\2\u0457\u0458\7\4\2\2\u0458\u0459\b+\1\2\u0459\u045a\5\62\32\2\u045a"+
		"U\3\2\2\2\u045b\u045d\7\67\2\2\u045c\u045e\5X-\2\u045d\u045c\3\2\2\2\u045d"+
		"\u045e\3\2\2\2\u045e\u0470\3\2\2\2\u045f\u0461\7\36\2\2\u0460\u0462\5"+
		"X-\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0470\3\2\2\2\u0463"+
		"\u0464\7$\2\2\u0464\u0465\7\67\2\2\u0465\u0467\7%\2\2\u0466\u0468\5X-"+
		"\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0470\3\2\2\2\u0469\u046a"+
		"\7$\2\2\u046a\u046b\7\36\2\2\u046b\u046d\7%\2\2\u046c\u046e\5X-\2\u046d"+
		"\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0470\3\2\2\2\u046f\u045b\3\2"+
		"\2\2\u046f\u045f\3\2\2\2\u046f\u0463\3\2\2\2\u046f\u0469\3\2\2\2\u0470"+
		"W\3\2\2\2\u0471\u0472\7!\2\2\u0472\u0473\5\62\32\2\u0473\u0475\7 \2\2"+
		"\u0474\u0476\5X-\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u048f"+
		"\3\2\2\2\u0477\u0478\7.\2\2\u0478\u047a\7\67\2\2\u0479\u047b\5X-\2\u047a"+
		"\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u048f\3\2\2\2\u047c\u047d\7."+
		"\2\2\u047d\u047e\t\2\2\2\u047e\u0480\7$\2\2\u047f\u0481\5R*\2\u0480\u047f"+
		"\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\7%\2\2\u0483"+
		"\u0485\5X-\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u048f\3\2\2"+
		"\2\u0486\u0488\7$\2\2\u0487\u0489\5R*\2\u0488\u0487\3\2\2\2\u0488\u0489"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c\7%\2\2\u048b\u048d\5X-\2\u048c"+
		"\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\3\2\2\2\u048e\u0471\3\2"+
		"\2\2\u048e\u0477\3\2\2\2\u048e\u047c\3\2\2\2\u048e\u0486\3\2\2\2\u048f"+
		"Y\3\2\2\2\u0490\u0491\7$\2\2\u0491\u0492\5Z.\2\u0492\u0493\7%\2\2\u0493"+
		"\u0494\5\\/\2\u0494\u04a0\3\2\2\2\u0495\u0496\t\3\2\2\u0496\u04a0\5\\"+
		"/\2\u0497\u0498\7\22\2\2\u0498\u0499\5Z.\2\u0499\u049a\5\\/\2\u049a\u04a0"+
		"\3\2\2\2\u049b\u049c\7\33\2\2\u049c\u049d\5Z.\2\u049d\u049e\5\\/\2\u049e"+
		"\u04a0\3\2\2\2\u049f\u0490\3\2\2\2\u049f\u0495\3\2\2\2\u049f\u0497\3\2"+
		"\2\2\u049f\u049b\3\2\2\2\u04a0[\3\2\2\2\u04a1\u04a2\7\26\2\2\u04a2\u04c1"+
		"\5\\/\2\u04a3\u04a4\7\27\2\2\u04a4\u04c1\5\\/\2\u04a5\u04a6\t\4\2\2\u04a6"+
		"\u04a7\5Z.\2\u04a7\u04a8\5\\/\2\u04a8\u04c1\3\2\2\2\u04a9\u04aa\t\5\2"+
		"\2\u04aa\u04ab\5Z.\2\u04ab\u04ac\5\\/\2\u04ac\u04c1\3\2\2\2\u04ad\u04ae"+
		"\t\6\2\2\u04ae\u04af\5Z.\2\u04af\u04b0\5\\/\2\u04b0\u04c1\3\2\2\2\u04b1"+
		"\u04b2\7,\2\2\u04b2\u04b3\5Z.\2\u04b3\u04b4\5\\/\2\u04b4\u04c1\3\2\2\2"+
		"\u04b5\u04b6\78\2\2\u04b6\u04b7\5Z.\2\u04b7\u04b8\5\\/\2\u04b8\u04c1\3"+
		"\2\2\2\u04b9\u04ba\7\30\2\2\u04ba\u04bb\5Z.\2\u04bb\u04bc\7\31\2\2\u04bc"+
		"\u04bd\5Z.\2\u04bd\u04be\5\\/\2\u04be\u04c1\3\2\2\2\u04bf\u04c1\3\2\2"+
		"\2\u04c0\u04a1\3\2\2\2\u04c0\u04a3\3\2\2\2\u04c0\u04a5\3\2\2\2\u04c0\u04a9"+
		"\3\2\2\2\u04c0\u04ad\3\2\2\2\u04c0\u04b1\3\2\2\2\u04c0\u04b5\3\2\2\2\u04c0"+
		"\u04b9\3\2\2\2\u04c0\u04bf\3\2\2\2\u04c1]\3\2\2\2\u009c_gow~\u0085\u008c"+
		"\u0094\u009e\u00a5\u00ac\u00b1\u00b7\u00ba\u00c2\u00c7\u00ce\u00d1\u00d6"+
		"\u00df\u00e4\u00ec\u00ee\u00f4\u00fc\u0103\u0109\u0116\u0139\u0143\u014c"+
		"\u0150\u0159\u0161\u016a\u0172\u017a\u0183\u0189\u018f\u0196\u0199\u019e"+
		"\u01a6\u01ae\u01b5\u01bd\u01c3\u01c9\u01d0\u01d3\u01d8\u01e1\u01e7\u01ed"+
		"\u01f0\u01f7\u01ff\u0206\u0209\u0212\u021b\u021d\u0223\u022b\u0232\u0238"+
		"\u0240\u0246\u024f\u0259\u0263\u0267\u026f\u0275\u0279\u0281\u0288\u028b"+
		"\u0290\u0296\u029a\u02a2\u02ac\u02b3\u02b6\u02bb\u02bf\u02c6\u02ce\u02d5"+
		"\u02d8\u02dd\u02e0\u02e8\u02ee\u02f2\u02fa\u0301\u0304\u0309\u030f\u0313"+
		"\u031b\u0325\u032c\u032f\u0334\u0338\u033c\u0347\u034e\u0359\u0361\u0364"+
		"\u0369\u036d\u037f\u038e\u039b\u03a8\u03b5\u03c5\u03c7\u03d7\u03d9\u03e9"+
		"\u03eb\u03f7\u0402\u0404\u040d\u0416\u041c\u0423\u042c\u0433\u0440\u044e"+
		"\u0455\u045d\u0461\u0467\u046d\u046f\u0475\u047a\u0480\u0484\u0488\u048c"+
		"\u048e\u049f\u04c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}