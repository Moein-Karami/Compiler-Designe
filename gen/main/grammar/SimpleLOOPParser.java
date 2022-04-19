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
		T__0=1, WS=2, RETURN=3, PRINT=4, DO=5, BOOL_VALUE=6, IF=7, ELSE=8, ELSE_IF=9, 
		INIT=10, EACH=11, INT=12, NEW_WORD=13, DIVIDE=14, TIMES=15, PLUS=16, MINUS=17, 
		BOOL=18, VOID=19, FPTR=20, PLUS_PLUS=21, MINUS_MINUS=22, QUESTION_MARK=23, 
		COLON=24, COMMA=25, NOT=26, ABS_SIGN=27, CLASS=28, SELF_SMALL_NAME=29, 
		ACCESS_TYPE=30, RBRACK=31, LBRACK=32, LCURL=33, RCURL=34, LPAR=35, RPAR=36, 
		ARROW=37, NEW_LINE=38, BEGIN_COMMENT=39, END_COMMENT=40, LT=41, GT=42, 
		IS_EQUAL=43, EQUAL=44, DOT=45, SHARP_SIGN=46, SET=47, CAP_NAME=48, NUM=49, 
		ADD=50, MERGE=51, INCLUDE=52, DELETE=53, SMALL_NAME=54, AND_AND=55, OR_OR=56;
	public static final int
		RULE_simple_loop = 0, RULE_start_prog = 1, RULE_var_dec = 2, RULE_comment = 3, 
		RULE_class_dec = 4, RULE_prog_body = 5, RULE_set_dec = 6, RULE_set_op = 7, 
		RULE_func_var = 8, RULE_begin_class = 9, RULE_init_dec = 10, RULE_init_begin = 11, 
		RULE_func_dec = 12, RULE_argumants = 13, RULE_default_argumants = 14, 
		RULE_func_begin = 15, RULE_scop_body = 16, RULE_line_command = 17, RULE_func_call = 18, 
		RULE_if_state = 19, RULE_my_else = 20, RULE_else_if = 21, RULE_for_loop = 22, 
		RULE_print = 23, RULE_assigment = 24, RULE_expr = 25, RULE_expr_prime = 26, 
		RULE_sequence = 27, RULE_my_new = 28, RULE_func_input = 29, RULE_my_return = 30, 
		RULE_var = 31, RULE_ext = 32, RULE_const_expr = 33, RULE_const_expr_prime = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"simple_loop", "start_prog", "var_dec", "comment", "class_dec", "prog_body", 
			"set_dec", "set_op", "func_var", "begin_class", "init_dec", "init_begin", 
			"func_dec", "argumants", "default_argumants", "func_begin", "scop_body", 
			"line_command", "func_call", "if_state", "my_else", "else_if", "for_loop", 
			"print", "assigment", "expr", "expr_prime", "sequence", "my_new", "func_input", 
			"my_return", "var", "ext", "const_expr", "const_expr_prime"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, "'return'", "'print'", "'do'", null, "'if'", "'else'", 
			"'elsif'", "'initialize'", "'each'", "'int'", "'new'", "'/'", "'*'", 
			"'+'", "'-'", "'bool'", "'void'", "'fptr'", "'++'", "'--'", "'?'", "':'", 
			"','", "'!'", "'|'", "'class'", null, null, "']'", "'['", "'{'", "'}'", 
			"'('", "')'", "'->'", null, "'=begin'", "'=end'", "'<'", "'>'", "'=='", 
			"'='", "'.'", "'#'", "'Set'", null, null, "'add'", "'merge'", "'include'", 
			"'delete'", null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "RETURN", "PRINT", "DO", "BOOL_VALUE", "IF", "ELSE", 
			"ELSE_IF", "INIT", "EACH", "INT", "NEW_WORD", "DIVIDE", "TIMES", "PLUS", 
			"MINUS", "BOOL", "VOID", "FPTR", "PLUS_PLUS", "MINUS_MINUS", "QUESTION_MARK", 
			"COLON", "COMMA", "NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", "ACCESS_TYPE", 
			"RBRACK", "LBRACK", "LCURL", "RCURL", "LPAR", "RPAR", "ARROW", "NEW_LINE", 
			"BEGIN_COMMENT", "END_COMMENT", "LT", "GT", "IS_EQUAL", "EQUAL", "DOT", 
			"SHARP_SIGN", "SET", "CAP_NAME", "NUM", "ADD", "MERGE", "INCLUDE", "DELETE", 
			"SMALL_NAME", "AND_AND", "OR_OR"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(70);
				start_prog();
				}
				break;
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(73);
				match(T__0);
				}
			}

			setState(76);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				var_dec();
				setState(80); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(79);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(84);
				start_prog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				comment();
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(92);
				start_prog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				class_dec();
				setState(96); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(95);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(100);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(102);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(107);
				start_prog();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				var_dec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				comment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(114);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(115);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(116);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(117);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(118);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(121);
				match(LBRACK);
				setState(122);
				expr();
				setState(123);
				match(RBRACK);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
			System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
				}
				}
				setState(139);
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(SHARP_SIGN);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						matchWildcard();
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case BEGIN_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(BEGIN_COMMENT);
				setState(149); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(148);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(151); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						matchWildcard();
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					match(NEW_LINE);
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(164);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(CLASS);
				setState(168);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(170);
					match(LT);
					setState(171);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(175);
					match(NEW_LINE);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(LCURL);
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(182);
						match(NEW_LINE);
						}
						}
						setState(185); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(187);
					begin_class();
					}
					break;
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					match(NEW_LINE);
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(195);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(CLASS);
				setState(197);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(199);
					match(LT);
					setState(200);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(204);
					match(NEW_LINE);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(210);
					comment();
					}
					break;
				case 2:
					{
					setState(211);
					match(ACCESS_TYPE);
					setState(212);
					var_dec();
					}
					break;
				case 3:
					{
					setState(213);
					match(ACCESS_TYPE);
					setState(214);
					init_dec();
					}
					break;
				case 4:
					{
					setState(215);
					match(ACCESS_TYPE);
					setState(216);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				class_dec();
				setState(223); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(222);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(225); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(227);
				prog_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				comment();
				setState(231); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(230);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(233); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(235);
				prog_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(237);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(242);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				class_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
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
			setState(248);
			match(SET);
			setState(249);
			match(LT);
			setState(250);
			match(INT);
			setState(251);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(SET);
				setState(254);
				match(DOT);
				setState(255);
				match(NEW_WORD);
				System.out.println("NEW");
				setState(257);
				match(LPAR);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(258);
					func_input();
					}
				}

				setState(261);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				var();
				setState(263);
				match(DOT);
				setState(264);
				match(ADD);
				System.out.println("ADD");
				setState(266);
				match(LPAR);
				setState(267);
				expr();
				setState(268);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				var();
				setState(271);
				match(DOT);
				setState(272);
				match(MERGE);
				System.out.println("MERGE");
				setState(274);
				match(LPAR);
				setState(275);
				expr();
				setState(276);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				var();
				setState(279);
				match(DOT);
				setState(280);
				match(INCLUDE);
				System.out.println("INCLUDE");
				setState(282);
				match(LPAR);
				setState(283);
				expr();
				setState(284);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				var();
				setState(287);
				match(DOT);
				setState(288);
				match(DELETE);
				System.out.println("DELETE");
				setState(290);
				match(LPAR);
				setState(291);
				expr();
				setState(292);
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
			setState(296);
			match(FPTR);
			setState(297);
			match(LT);
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(298);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(299);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(300);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(301);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(302);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(303);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(307);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(308);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(309);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(310);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(311);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(312);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(ARROW);
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(321);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(322);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(323);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(324);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(325);
				set_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(328);
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
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				comment();
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(331);
					match(NEW_LINE);
					}
					}
					setState(334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(336);
				begin_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(ACCESS_TYPE);
				setState(339);
				var_dec();
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					match(NEW_LINE);
					}
					}
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(345);
				begin_class();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				init_dec();
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				func_dec();
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(356);
					match(NEW_LINE);
					}
					}
					setState(359); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(361);
				begin_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				match(ACCESS_TYPE);
				setState(365);
				var_dec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				init_dec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(367);
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
			setState(370);
			match(ACCESS_TYPE);
			setState(371);
			match(INIT);
			setState(372);
			match(LPAR);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
				{
				setState(373);
				argumants();
				}
			}

			setState(376);
			match(RPAR);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(377);
				match(NEW_LINE);
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(LCURL);
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(384);
					match(NEW_LINE);
					}
					}
					setState(387); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(389);
				init_begin();
				}
				break;
			}
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				match(NEW_LINE);
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINE );
			setState(397);
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
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				comment();
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(400);
					match(NEW_LINE);
					}
					}
					setState(403); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(405);
				init_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				var_dec();
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(408);
					match(NEW_LINE);
					}
					}
					setState(411); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(413);
				init_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(ACCESS_TYPE);
				setState(426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(421);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(422);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(423);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(424);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(425);
					match(CAP_NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(428);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(430);
				match(LPAR);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(431);
					argumants();
					}
				}

				setState(434);
				match(RPAR);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(435);
					match(NEW_LINE);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				match(LCURL);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(442);
						match(NEW_LINE);
						}
						}
						setState(445); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(447);
					func_begin();
					}
					break;
				}
				setState(451); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(450);
					match(NEW_LINE);
					}
					}
					setState(453); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(455);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(ACCESS_TYPE);
				setState(462);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(457);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(458);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(459);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(460);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(461);
					match(CAP_NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(464);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(466);
				match(LPAR);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(467);
					argumants();
					}
				}

				setState(470);
				match(RPAR);
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(471);
					match(NEW_LINE);
					}
					}
					setState(474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(476);
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
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(479);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(480);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(481);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(482);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(483);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(486);
					match(LBRACK);
					setState(487);
					expr();
					setState(488);
					match(RBRACK);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				((ArgumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("ArgumentDec : " + (((ArgumantsContext)_localctx).SMALL_NAME!=null?((ArgumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(497);
					match(COMMA);
					setState(498);
					argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
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
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(INT);
				setState(505);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(506);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(508);
				expr();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(509);
					match(COMMA);
					setState(510);
					default_argumants();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(BOOL);
				setState(514);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(515);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(517);
				expr();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(518);
					match(COMMA);
					setState(519);
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
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				comment();
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(525);
					match(NEW_LINE);
					}
					}
					setState(528); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(530);
				func_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				var_dec();
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(533);
					match(NEW_LINE);
					}
					}
					setState(536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(538);
				func_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
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
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				comment();
				setState(547); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(546);
					match(NEW_LINE);
					}
					}
					setState(549); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(551);
				scop_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				line_command();
				setState(555); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(554);
					match(NEW_LINE);
					}
					}
					setState(557); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(559);
				scop_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
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
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
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
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				if_state();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				my_return();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
				func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(570);
				assigment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571);
				set_op();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(572);
				expr();
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
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(LPAR);
				setState(576);
				func_call();
				setState(577);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("MethodCall");
				setState(580);
				var();
				setState(581);
				match(LPAR);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(582);
					func_input();
					}
				}

				setState(585);
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
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(591);
				expr();
				setState(593); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(592);
					match(NEW_LINE);
					}
					}
					setState(595); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(597);
				line_command();
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(598);
					match(NEW_LINE);
					}
					}
					setState(601); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(605);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(603);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(604);
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
				setState(607);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(609);
				expr();
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(610);
					match(NEW_LINE);
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(616);
				match(LCURL);
				setState(618); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(617);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(620); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(622);
					scop_body();
					}
				}

				setState(626); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(625);
					match(NEW_LINE);
					}
					}
					setState(628); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(630);
				match(RCURL);
				setState(632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(631);
					match(NEW_LINE);
					}
					}
					setState(634); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(638);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(636);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(637);
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
				setState(640);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(642);
				expr();
				setState(644); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(643);
					match(NEW_LINE);
					}
					}
					setState(646); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(648);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(652);
				expr();
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(653);
					match(NEW_LINE);
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(659);
				match(LCURL);
				setState(661); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(660);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(663); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(665);
					scop_body();
					}
				}

				setState(669); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(668);
					match(NEW_LINE);
					}
					}
					setState(671); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(673);
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
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(680); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(679);
					match(NEW_LINE);
					}
					}
					setState(682); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(684);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(687);
					match(NEW_LINE);
					}
					}
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(693);
				match(LCURL);
				setState(695); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(694);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(697); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(699);
					scop_body();
					}
				}

				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(702);
					match(NEW_LINE);
					}
					}
					setState(705); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(707);
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
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(712);
				expr();
				setState(714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(713);
					match(NEW_LINE);
					}
					}
					setState(716); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(718);
				line_command();
				setState(720); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(719);
					match(NEW_LINE);
					}
					}
					setState(722); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(726);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(724);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(725);
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
				setState(728);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(730);
				expr();
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(731);
					match(NEW_LINE);
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(737);
				match(LCURL);
				setState(739); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(738);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(741); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(743);
					scop_body();
					}
				}

				setState(747); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(746);
					match(NEW_LINE);
					}
					}
					setState(749); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(751);
				match(RCURL);
				setState(753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(752);
					match(NEW_LINE);
					}
					}
					setState(755); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(759);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(757);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(758);
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
				setState(761);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(763);
				expr();
				setState(765); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(764);
					match(NEW_LINE);
					}
					}
					setState(767); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(769);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(773);
				expr();
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(774);
					match(NEW_LINE);
					}
					}
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(780);
				match(LCURL);
				setState(782); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(781);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(784); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(786);
					scop_body();
					}
				}

				setState(790); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(789);
					match(NEW_LINE);
					}
					}
					setState(792); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(794);
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
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(798);
					var();
					}
					break;
				case 2:
					{
					setState(799);
					sequence();
					}
					break;
				}
				setState(802);
				match(DOT);
				setState(803);
				match(EACH);
				setState(804);
				match(DO);
				setState(805);
				match(ABS_SIGN);
				setState(806);
				var();
				setState(807);
				match(ABS_SIGN);
				setState(809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(808);
					match(NEW_LINE);
					}
					}
					setState(811); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				System.out.println("Loop : " + "each");
				setState(814);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(816);
					var();
					}
					break;
				case 2:
					{
					setState(817);
					sequence();
					}
					break;
				}
				setState(820);
				match(DOT);
				setState(821);
				match(EACH);
				setState(822);
				match(DO);
				setState(823);
				match(ABS_SIGN);
				setState(824);
				var();
				setState(825);
				match(ABS_SIGN);
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(826);
					match(NEW_LINE);
					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("Loop : " + "each");
				setState(833);
				match(LCURL);
				setState(840);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
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
					setState(839);
					scop_body();
					}
					break;
				}
				setState(843); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(842);
					match(NEW_LINE);
					}
					}
					setState(845); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(847);
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
			setState(851);
			match(PRINT);
			System.out.println("Built-in : " + "print");
			setState(853);
			match(LPAR);
			setState(854);
			expr();
			setState(855);
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

	public static class AssigmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SimpleLOOPParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SimpleLOOPParser.MINUS_MINUS, 0); }
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
		enterRule(_localctx, 48, RULE_assigment);
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				var();
				setState(858);
				match(EQUAL);
				setState(859);
				expr();
				System.out.println("Operator : =");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				expr();
				setState(867);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_PLUS:
					{
					setState(863);
					match(PLUS_PLUS);
					System.out.println("Operator : ++");
					}
					break;
				case MINUS_MINUS:
					{
					setState(865);
					match(MINUS_MINUS);
					System.out.println("Operator : --");
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public Set_opContext set_op() {
			return getRuleContext(Set_opContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public TerminalNode NUM() { return getToken(SimpleLOOPParser.NUM, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(SimpleLOOPParser.BOOL_VALUE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
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
		enterRule(_localctx, 50, RULE_expr);
		int _la;
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				var();
				setState(872);
				match(EQUAL);
				setState(873);
				expr();
				System.out.println("Operator : =");
				setState(875);
				expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				var();
				setState(878);
				expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				set_op();
				setState(881);
				expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				String sv_token;
				setState(888);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(884);
					match(MINUS);
					sv_token = "Operator : " + "-";
					}
					break;
				case NOT:
					{
					setState(886);
					match(NOT);
					sv_token = "Operator : " + "!";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(890);
				expr();
				System.out.println(sv_token);
				setState(892);
				expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(894);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(895);
				expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(896);
				match(LPAR);
				setState(897);
				expr();
				setState(898);
				match(RPAR);
				setState(899);
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
		public TerminalNode QUESTION_MARK() { return getToken(SimpleLOOPParser.QUESTION_MARK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SimpleLOOPParser.COLON, 0); }
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public TerminalNode OR_OR() { return getToken(SimpleLOOPParser.OR_OR, 0); }
		public TerminalNode AND_AND() { return getToken(SimpleLOOPParser.AND_AND, 0); }
		public TerminalNode IS_EQUAL() { return getToken(SimpleLOOPParser.IS_EQUAL, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SimpleLOOPParser.PLUS, 0); }
		public TerminalNode DIVIDE() { return getToken(SimpleLOOPParser.DIVIDE, 0); }
		public TerminalNode TIMES() { return getToken(SimpleLOOPParser.TIMES, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(SimpleLOOPParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SimpleLOOPParser.MINUS_MINUS, 0); }
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
		enterRule(_localctx, 52, RULE_expr_prime);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				match(QUESTION_MARK);
				setState(904);
				expr();
				setState(905);
				match(COLON);
				setState(906);
				expr();
				System.out.println("Operator : ?:");
				setState(908);
				expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				match(OR_OR);
				setState(911);
				expr();
				System.out.println("Operator : ||");
				setState(913);
				expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(915);
				match(AND_AND);
				setState(916);
				expr();
				System.out.println("Operator : &&");
				setState(918);
				expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
				match(IS_EQUAL);
				setState(921);
				expr();
				System.out.println("Operator : ==");
				setState(923);
				expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				String sv_token;
				setState(930);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(926);
					match(LT);
					sv_token = "Operator : " + "<";
					}
					break;
				case GT:
					{
					setState(928);
					match(GT);
					sv_token = "Operator : " + ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(932);
				expr();
				System.out.println(sv_token);
				setState(934);
				expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				String sv_token;
				setState(941);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(937);
					match(MINUS);
					sv_token = "Operator : " + "-";
					}
					break;
				case PLUS:
					{
					setState(939);
					match(PLUS);
					sv_token = "Operator : " + "+";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(943);
				expr();
				System.out.println(sv_token);
				setState(945);
				expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				String sv_token;
				setState(952);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIVIDE:
					{
					setState(948);
					match(DIVIDE);
					sv_token = "Operator : " + "/";
					}
					break;
				case TIMES:
					{
					setState(950);
					match(TIMES);
					sv_token = "Operator : " + "*";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(954);
				expr();
				System.out.println(sv_token);
				setState(956);
				expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(962);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_PLUS:
					{
					setState(958);
					match(PLUS_PLUS);
					System.out.println("Operator : ++");
					}
					break;
				case MINUS_MINUS:
					{
					setState(960);
					match(MINUS_MINUS);
					System.out.println("Operator : --");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(964);
				expr_prime();
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
		enterRule(_localctx, 54, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(LPAR);
			setState(969);
			expr();
			setState(970);
			match(DOT);
			setState(971);
			match(DOT);
			setState(972);
			expr();
			setState(973);
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
		enterRule(_localctx, 56, RULE_my_new);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(CAP_NAME);
			setState(976);
			match(DOT);
			setState(977);
			match(NEW_WORD);
			setState(978);
			match(LPAR);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
				{
				setState(979);
				func_input();
				}
			}

			setState(982);
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
		enterRule(_localctx, 58, RULE_func_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			expr();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(985);
				match(COMMA);
				setState(986);
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
		enterRule(_localctx, 60, RULE_my_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(RETURN);
			System.out.println("Return");
			setState(991);
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
		enterRule(_localctx, 62, RULE_var);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(SMALL_NAME);
				setState(995);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(994);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(SELF_SMALL_NAME);
				setState(999);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(998);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(LPAR);
				setState(1002);
				match(SMALL_NAME);
				setState(1003);
				match(RPAR);
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1004);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1007);
				match(LPAR);
				setState(1008);
				match(SELF_SMALL_NAME);
				setState(1009);
				match(RPAR);
				setState(1011);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1010);
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
		enterRule(_localctx, 64, RULE_ext);
		int _la;
		try {
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				match(LBRACK);
				setState(1016);
				expr();
				setState(1017);
				match(RBRACK);
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1018);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				match(DOT);
				setState(1022);
				match(SMALL_NAME);
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1023);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				match(DOT);
				setState(1027);
				_la = _input.LA(1);
				if ( !(_la==INIT || _la==SMALL_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1028);
				match(LPAR);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(1029);
					func_input();
					}
				}

				setState(1032);
				match(RPAR);
				setState(1034);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1033);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1036);
				match(LPAR);
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << SET) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(1037);
					func_input();
					}
				}

				setState(1040);
				match(RPAR);
				setState(1042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1041);
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
		enterRule(_localctx, 66, RULE_const_expr);
		int _la;
		try {
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				match(LPAR);
				setState(1047);
				const_expr();
				setState(1048);
				match(RPAR);
				setState(1049);
				const_expr_prime();
				}
				break;
			case BOOL_VALUE:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1052);
				const_expr_prime();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053);
				match(MINUS);
				setState(1054);
				const_expr();
				setState(1055);
				const_expr_prime();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				match(NOT);
				setState(1058);
				const_expr();
				setState(1059);
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
		enterRule(_localctx, 68, RULE_const_expr_prime);
		int _la;
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(PLUS_PLUS);
				setState(1064);
				const_expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(MINUS_MINUS);
				setState(1066);
				const_expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1068);
				const_expr();
				setState(1069);
				const_expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1071);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1072);
				const_expr();
				setState(1073);
				const_expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1075);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1076);
				const_expr();
				setState(1077);
				const_expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1079);
				match(IS_EQUAL);
				setState(1080);
				const_expr();
				setState(1081);
				const_expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1083);
				match(AND_AND);
				setState(1084);
				const_expr();
				setState(1085);
				const_expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1087);
				match(QUESTION_MARK);
				setState(1088);
				const_expr();
				setState(1089);
				match(COLON);
				setState(1090);
				const_expr();
				setState(1091);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u044b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\5\2J\n\2\3\2\5\2M\n\2\3\2\3\2\3\3\3\3\6\3"+
		"S\n\3\r\3\16\3T\3\3\3\3\3\3\3\3\6\3[\n\3\r\3\16\3\\\3\3\3\3\3\3\3\3\6"+
		"\3c\n\3\r\3\16\3d\3\3\3\3\3\3\6\3j\n\3\r\3\16\3k\3\3\3\3\3\3\3\3\3\3\5"+
		"\3s\n\3\3\4\3\4\3\4\3\4\3\4\5\4z\n\4\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4"+
		"\16\4\u0083\13\4\3\4\3\4\3\4\3\4\3\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4"+
		"\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094\13\5\3\5\3\5\6\5\u0098\n\5\r\5\16"+
		"\5\u0099\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5\3\5\6\5\u00a3\n\5\r\5\16"+
		"\5\u00a4\3\5\5\5\u00a8\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b0\n\6\3\6\7"+
		"\6\u00b3\n\6\f\6\16\6\u00b6\13\6\3\6\3\6\6\6\u00ba\n\6\r\6\16\6\u00bb"+
		"\3\6\5\6\u00bf\n\6\3\6\6\6\u00c2\n\6\r\6\16\6\u00c3\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00cd\n\6\3\6\7\6\u00d0\n\6\f\6\16\6\u00d3\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00dc\n\6\5\6\u00de\n\6\3\7\3\7\6\7\u00e2\n\7"+
		"\r\7\16\7\u00e3\3\7\3\7\3\7\3\7\6\7\u00ea\n\7\r\7\16\7\u00eb\3\7\3\7\3"+
		"\7\6\7\u00f1\n\7\r\7\16\7\u00f2\3\7\3\7\3\7\3\7\5\7\u00f9\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0106\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0129\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0133\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u013c"+
		"\n\n\7\n\u013e\n\n\f\n\16\n\u0141\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0149"+
		"\n\n\3\n\3\n\3\13\3\13\6\13\u014f\n\13\r\13\16\13\u0150\3\13\3\13\3\13"+
		"\3\13\3\13\6\13\u0158\n\13\r\13\16\13\u0159\3\13\3\13\3\13\3\13\6\13\u0160"+
		"\n\13\r\13\16\13\u0161\3\13\3\13\3\13\3\13\6\13\u0168\n\13\r\13\16\13"+
		"\u0169\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0173\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u0179\n\f\3\f\3\f\7\f\u017d\n\f\f\f\16\f\u0180\13\f\3\f\3\f\6"+
		"\f\u0184\n\f\r\f\16\f\u0185\3\f\5\f\u0189\n\f\3\f\6\f\u018c\n\f\r\f\16"+
		"\f\u018d\3\f\3\f\3\r\3\r\6\r\u0194\n\r\r\r\16\r\u0195\3\r\3\r\3\r\3\r"+
		"\6\r\u019c\n\r\r\r\16\r\u019d\3\r\3\r\3\r\3\r\3\r\5\r\u01a5\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01ad\n\16\3\16\3\16\3\16\3\16\5\16\u01b3"+
		"\n\16\3\16\3\16\7\16\u01b7\n\16\f\16\16\16\u01ba\13\16\3\16\3\16\6\16"+
		"\u01be\n\16\r\16\16\16\u01bf\3\16\5\16\u01c3\n\16\3\16\6\16\u01c6\n\16"+
		"\r\16\16\16\u01c7\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01d1\n\16\3"+
		"\16\3\16\3\16\3\16\5\16\u01d7\n\16\3\16\3\16\6\16\u01db\n\16\r\16\16\16"+
		"\u01dc\3\16\5\16\u01e0\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u01e7\n\17\3"+
		"\17\3\17\3\17\3\17\7\17\u01ed\n\17\f\17\16\17\u01f0\13\17\3\17\3\17\3"+
		"\17\3\17\5\17\u01f6\n\17\3\17\5\17\u01f9\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0202\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u020b"+
		"\n\20\5\20\u020d\n\20\3\21\3\21\6\21\u0211\n\21\r\21\16\21\u0212\3\21"+
		"\3\21\3\21\3\21\6\21\u0219\n\21\r\21\16\21\u021a\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0222\n\21\3\22\3\22\6\22\u0226\n\22\r\22\16\22\u0227\3\22\3"+
		"\22\3\22\3\22\6\22\u022e\n\22\r\22\16\22\u022f\3\22\3\22\3\22\3\22\5\22"+
		"\u0236\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0240\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u024a\n\24\3\24\3\24\5\24"+
		"\u024e\n\24\3\25\3\25\3\25\3\25\6\25\u0254\n\25\r\25\16\25\u0255\3\25"+
		"\3\25\6\25\u025a\n\25\r\25\16\25\u025b\3\25\3\25\5\25\u0260\n\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0266\n\25\f\25\16\25\u0269\13\25\3\25\3\25\6\25"+
		"\u026d\n\25\r\25\16\25\u026e\3\25\5\25\u0272\n\25\3\25\6\25\u0275\n\25"+
		"\r\25\16\25\u0276\3\25\3\25\6\25\u027b\n\25\r\25\16\25\u027c\3\25\3\25"+
		"\5\25\u0281\n\25\3\25\3\25\3\25\3\25\6\25\u0287\n\25\r\25\16\25\u0288"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0291\n\25\f\25\16\25\u0294\13\25"+
		"\3\25\3\25\6\25\u0298\n\25\r\25\16\25\u0299\3\25\5\25\u029d\n\25\3\25"+
		"\6\25\u02a0\n\25\r\25\16\25\u02a1\3\25\3\25\5\25\u02a6\n\25\3\26\3\26"+
		"\3\26\6\26\u02ab\n\26\r\26\16\26\u02ac\3\26\3\26\3\26\3\26\7\26\u02b3"+
		"\n\26\f\26\16\26\u02b6\13\26\3\26\3\26\6\26\u02ba\n\26\r\26\16\26\u02bb"+
		"\3\26\5\26\u02bf\n\26\3\26\6\26\u02c2\n\26\r\26\16\26\u02c3\3\26\5\26"+
		"\u02c7\n\26\3\27\3\27\3\27\3\27\6\27\u02cd\n\27\r\27\16\27\u02ce\3\27"+
		"\3\27\6\27\u02d3\n\27\r\27\16\27\u02d4\3\27\3\27\5\27\u02d9\n\27\3\27"+
		"\3\27\3\27\3\27\7\27\u02df\n\27\f\27\16\27\u02e2\13\27\3\27\3\27\6\27"+
		"\u02e6\n\27\r\27\16\27\u02e7\3\27\5\27\u02eb\n\27\3\27\6\27\u02ee\n\27"+
		"\r\27\16\27\u02ef\3\27\3\27\6\27\u02f4\n\27\r\27\16\27\u02f5\3\27\3\27"+
		"\5\27\u02fa\n\27\3\27\3\27\3\27\3\27\6\27\u0300\n\27\r\27\16\27\u0301"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u030a\n\27\f\27\16\27\u030d\13\27"+
		"\3\27\3\27\6\27\u0311\n\27\r\27\16\27\u0312\3\27\5\27\u0316\n\27\3\27"+
		"\6\27\u0319\n\27\r\27\16\27\u031a\3\27\3\27\5\27\u031f\n\27\3\30\3\30"+
		"\5\30\u0323\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u032c\n\30\r"+
		"\30\16\30\u032d\3\30\3\30\3\30\3\30\3\30\5\30\u0335\n\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u033e\n\30\f\30\16\30\u0341\13\30\3\30\3\30"+
		"\3\30\6\30\u0346\n\30\r\30\16\30\u0347\3\30\5\30\u034b\n\30\3\30\6\30"+
		"\u034e\n\30\r\30\16\30\u034f\3\30\3\30\5\30\u0354\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0366\n\32\5\32\u0368\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u037b\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0388\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u03a5\n\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u03b0\n\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u03bb\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u03c5\n\34\3\34\3\34\5\34\u03c9\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u03d7\n\36"+
		"\3\36\3\36\3\37\3\37\3\37\5\37\u03de\n\37\3 \3 \3 \3 \3!\3!\5!\u03e6\n"+
		"!\3!\3!\5!\u03ea\n!\3!\3!\3!\3!\5!\u03f0\n!\3!\3!\3!\3!\5!\u03f6\n!\5"+
		"!\u03f8\n!\3\"\3\"\3\"\3\"\5\"\u03fe\n\"\3\"\3\"\3\"\5\"\u0403\n\"\3\""+
		"\3\"\3\"\3\"\5\"\u0409\n\"\3\"\3\"\5\"\u040d\n\"\3\"\3\"\5\"\u0411\n\""+
		"\3\"\3\"\5\"\u0415\n\"\5\"\u0417\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\5#\u0428\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0449\n$\3$\2\2%\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\7"+
		"\4\2\b\b\63\63\4\2\f\f88\3\2\20\21\3\2\22\23\3\2+,\2\u050b\2I\3\2\2\2"+
		"\4r\3\2\2\2\6y\3\2\2\2\b\u00a7\3\2\2\2\n\u00dd\3\2\2\2\f\u00f8\3\2\2\2"+
		"\16\u00fa\3\2\2\2\20\u0128\3\2\2\2\22\u012a\3\2\2\2\24\u0172\3\2\2\2\26"+
		"\u0174\3\2\2\2\30\u01a4\3\2\2\2\32\u01df\3\2\2\2\34\u01f8\3\2\2\2\36\u020c"+
		"\3\2\2\2 \u0221\3\2\2\2\"\u0235\3\2\2\2$\u023f\3\2\2\2&\u024d\3\2\2\2"+
		"(\u02a5\3\2\2\2*\u02c6\3\2\2\2,\u031e\3\2\2\2.\u0353\3\2\2\2\60\u0355"+
		"\3\2\2\2\62\u0367\3\2\2\2\64\u0387\3\2\2\2\66\u03c8\3\2\2\28\u03ca\3\2"+
		"\2\2:\u03d1\3\2\2\2<\u03da\3\2\2\2>\u03df\3\2\2\2@\u03f7\3\2\2\2B\u0416"+
		"\3\2\2\2D\u0427\3\2\2\2F\u0448\3\2\2\2HJ\5\4\3\2IH\3\2\2\2IJ\3\2\2\2J"+
		"L\3\2\2\2KM\7\3\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\2\2\3O\3\3\2\2\2"+
		"PR\5\6\4\2QS\7(\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2"+
		"VW\5\4\3\2Ws\3\2\2\2XZ\5\b\5\2Y[\7(\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]^\3\2\2\2^_\5\4\3\2_s\3\2\2\2`b\5\n\6\2ac\7(\2\2ba\3\2\2"+
		"\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\f\7\2gs\3\2\2\2hj\7(\2"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2ms\5\4\3\2ns\5\6\4"+
		"\2os\5\b\5\2ps\5\n\6\2qs\3\2\2\2rP\3\2\2\2rX\3\2\2\2r`\3\2\2\2ri\3\2\2"+
		"\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\5\3\2\2\2tz\7\16\2\2uz\7\24"+
		"\2\2vz\7\62\2\2wz\5\16\b\2xz\5\22\n\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw"+
		"\3\2\2\2yx\3\2\2\2z\u0081\3\2\2\2{|\7\"\2\2|}\5\64\33\2}~\7!\2\2~\u0080"+
		"\3\2\2\2\177{\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\78\2\2\u0085"+
		"\u008b\b\4\1\2\u0086\u0087\7\33\2\2\u0087\u0088\78\2\2\u0088\u008a\b\4"+
		"\1\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\7\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0092\7\60\2"+
		"\2\u008f\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00a8\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0097\7)\2\2\u0096\u0098\7(\2\2\u0097\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\3\2\2\2\u009b"+
		"\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a3\7(\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\7*\2\2\u00a7"+
		"\u008e\3\2\2\2\u00a7\u0095\3\2\2\2\u00a8\t\3\2\2\2\u00a9\u00aa\7\36\2"+
		"\2\u00aa\u00ab\7\62\2\2\u00ab\u00af\b\6\1\2\u00ac\u00ad\7+\2\2\u00ad\u00ae"+
		"\7\62\2\2\u00ae\u00b0\b\6\1\2\u00af\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00b4\3\2\2\2\u00b1\u00b3\7(\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00be\7#\2\2\u00b8\u00ba\7(\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\5\24\13\2\u00be\u00b9\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c1\3\2\2\2\u00c0\u00c2\7(\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00de\7$\2\2\u00c6\u00c7\7\36\2\2\u00c7\u00c8\7\62\2\2\u00c8\u00cc\b"+
		"\6\1\2\u00c9\u00ca\7+\2\2\u00ca\u00cb\7\62\2\2\u00cb\u00cd\b\6\1\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\7("+
		"\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00db\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00dc\5\b"+
		"\5\2\u00d5\u00d6\7 \2\2\u00d6\u00dc\5\6\4\2\u00d7\u00d8\7 \2\2\u00d8\u00dc"+
		"\5\26\f\2\u00d9\u00da\7 \2\2\u00da\u00dc\5\32\16\2\u00db\u00d4\3\2\2\2"+
		"\u00db\u00d5\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de"+
		"\3\2\2\2\u00dd\u00a9\3\2\2\2\u00dd\u00c6\3\2\2\2\u00de\13\3\2\2\2\u00df"+
		"\u00e1\5\n\6\2\u00e0\u00e2\7(\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\5\f\7\2\u00e6\u00f9\3\2\2\2\u00e7\u00e9\5\b\5\2\u00e8\u00ea\7("+
		"\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5\f\7\2\u00ee\u00f9\3\2"+
		"\2\2\u00ef\u00f1\7(\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f9\5\f"+
		"\7\2\u00f5\u00f9\5\n\6\2\u00f6\u00f9\5\b\5\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00df\3\2\2\2\u00f8\u00e7\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f5\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\r\3\2\2\2\u00fa\u00fb"+
		"\7\61\2\2\u00fb\u00fc\7+\2\2\u00fc\u00fd\7\16\2\2\u00fd\u00fe\7,\2\2\u00fe"+
		"\17\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7/\2\2\u0101\u0102\7\17\2"+
		"\2\u0102\u0103\b\t\1\2\u0103\u0105\7%\2\2\u0104\u0106\5<\37\2\u0105\u0104"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0129\7&\2\2\u0108"+
		"\u0109\5@!\2\u0109\u010a\7/\2\2\u010a\u010b\7\64\2\2\u010b\u010c\b\t\1"+
		"\2\u010c\u010d\7%\2\2\u010d\u010e\5\64\33\2\u010e\u010f\7&\2\2\u010f\u0129"+
		"\3\2\2\2\u0110\u0111\5@!\2\u0111\u0112\7/\2\2\u0112\u0113\7\65\2\2\u0113"+
		"\u0114\b\t\1\2\u0114\u0115\7%\2\2\u0115\u0116\5\64\33\2\u0116\u0117\7"+
		"&\2\2\u0117\u0129\3\2\2\2\u0118\u0119\5@!\2\u0119\u011a\7/\2\2\u011a\u011b"+
		"\7\66\2\2\u011b\u011c\b\t\1\2\u011c\u011d\7%\2\2\u011d\u011e\5\64\33\2"+
		"\u011e\u011f\7&\2\2\u011f\u0129\3\2\2\2\u0120\u0121\5@!\2\u0121\u0122"+
		"\7/\2\2\u0122\u0123\7\67\2\2\u0123\u0124\b\t\1\2\u0124\u0125\7%\2\2\u0125"+
		"\u0126\5\64\33\2\u0126\u0127\7&\2\2\u0127\u0129\3\2\2\2\u0128\u00ff\3"+
		"\2\2\2\u0128\u0108\3\2\2\2\u0128\u0110\3\2\2\2\u0128\u0118\3\2\2\2\u0128"+
		"\u0120\3\2\2\2\u0129\21\3\2\2\2\u012a\u012b\7\26\2\2\u012b\u0132\7+\2"+
		"\2\u012c\u0133\7\25\2\2\u012d\u0133\7\16\2\2\u012e\u0133\7\24\2\2\u012f"+
		"\u0133\7\62\2\2\u0130\u0133\5\16\b\2\u0131\u0133\5\22\n\2\u0132\u012c"+
		"\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u013f\3\2\2\2\u0134\u013b\7\33"+
		"\2\2\u0135\u013c\7\25\2\2\u0136\u013c\7\16\2\2\u0137\u013c\7\24\2\2\u0138"+
		"\u013c\7\62\2\2\u0139\u013c\5\16\b\2\u013a\u013c\5\22\n\2\u013b\u0135"+
		"\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u0134\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0148\7\'\2\2\u0143\u0149\7\25"+
		"\2\2\u0144\u0149\7\16\2\2\u0145\u0149\7\24\2\2\u0146\u0149\7\62\2\2\u0147"+
		"\u0149\5\16\b\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3"+
		"\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\7,\2\2\u014b\23\3\2\2\2\u014c\u014e\5\b\5\2\u014d\u014f\7(\2\2"+
		"\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\5\24\13\2\u0153\u0173\3\2\2\2"+
		"\u0154\u0155\7 \2\2\u0155\u0157\5\6\4\2\u0156\u0158\7(\2\2\u0157\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\5\24\13\2\u015c\u0173\3\2\2\2\u015d\u015f\5"+
		"\26\f\2\u015e\u0160\7(\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\5\24"+
		"\13\2\u0164\u0173\3\2\2\2\u0165\u0167\5\32\16\2\u0166\u0168\7(\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5\24\13\2\u016c\u0173\3\2\2\2\u016d"+
		"\u0173\5\b\5\2\u016e\u016f\7 \2\2\u016f\u0173\5\6\4\2\u0170\u0173\5\26"+
		"\f\2\u0171\u0173\5\32\16\2\u0172\u014c\3\2\2\2\u0172\u0154\3\2\2\2\u0172"+
		"\u015d\3\2\2\2\u0172\u0165\3\2\2\2\u0172\u016d\3\2\2\2\u0172\u016e\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\25\3\2\2\2\u0174\u0175"+
		"\7 \2\2\u0175\u0176\7\f\2\2\u0176\u0178\7%\2\2\u0177\u0179\5\34\17\2\u0178"+
		"\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017e\7&"+
		"\2\2\u017b\u017d\7(\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0188\7#\2\2\u0182\u0184\7(\2\2\u0183\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\5\30\r\2\u0188\u0183\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3"+
		"\2\2\2\u018a\u018c\7(\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7$"+
		"\2\2\u0190\27\3\2\2\2\u0191\u0193\5\b\5\2\u0192\u0194\7(\2\2\u0193\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\5\30\r\2\u0198\u01a5\3\2\2\2\u0199\u019b\5"+
		"\6\4\2\u019a\u019c\7(\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5\30"+
		"\r\2\u01a0\u01a5\3\2\2\2\u01a1\u01a5\5\"\22\2\u01a2\u01a5\5\b\5\2\u01a3"+
		"\u01a5\5\6\4\2\u01a4\u0191\3\2\2\2\u01a4\u0199\3\2\2\2\u01a4\u01a1\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\31\3\2\2\2\u01a6\u01ac"+
		"\7 \2\2\u01a7\u01ad\7\25\2\2\u01a8\u01ad\7\16\2\2\u01a9\u01ad\7\24\2\2"+
		"\u01aa\u01ad\5\16\b\2\u01ab\u01ad\7\62\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8"+
		"\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\78\2\2\u01af\u01b0\b\16\1\2\u01b0\u01b2\7%"+
		"\2\2\u01b1\u01b3\5\34\17\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b8\7&\2\2\u01b5\u01b7\7(\2\2\u01b6\u01b5\3\2\2"+
		"\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01c2\7#\2\2\u01bc\u01be\7(\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\5 \21\2\u01c2\u01bd\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\7(\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01e0\7$\2\2\u01ca\u01d0\7 \2\2\u01cb\u01d1\7\25"+
		"\2\2\u01cc\u01d1\7\16\2\2\u01cd\u01d1\7\24\2\2\u01ce\u01d1\5\16\b\2\u01cf"+
		"\u01d1\7\62\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d0\u01cd\3"+
		"\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\78\2\2\u01d3\u01d4\b\16\1\2\u01d4\u01d6\7%\2\2\u01d5\u01d7\5\34"+
		"\17\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01da\7&\2\2\u01d9\u01db\7(\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2"+
		"\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0"+
		"\5$\23\2\u01df\u01a6\3\2\2\2\u01df\u01ca\3\2\2\2\u01e0\33\3\2\2\2\u01e1"+
		"\u01e7\7\16\2\2\u01e2\u01e7\7\24\2\2\u01e3\u01e7\7\62\2\2\u01e4\u01e7"+
		"\5\16\b\2\u01e5\u01e7\5\22\n\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2\3\2\2\2"+
		"\u01e6\u01e3\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ee"+
		"\3\2\2\2\u01e8\u01e9\7\"\2\2\u01e9\u01ea\5\64\33\2\u01ea\u01eb\7!\2\2"+
		"\u01eb\u01ed\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f2\78\2\2\u01f2\u01f5\b\17\1\2\u01f3\u01f4\7\33\2\2\u01f4\u01f6\5"+
		"\34\17\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7"+
		"\u01f9\5\36\20\2\u01f8\u01e6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\35\3\2"+
		"\2\2\u01fa\u01fb\7\16\2\2\u01fb\u01fc\78\2\2\u01fc\u01fd\7.\2\2\u01fd"+
		"\u01fe\b\20\1\2\u01fe\u0201\5\64\33\2\u01ff\u0200\7\33\2\2\u0200\u0202"+
		"\5\36\20\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020d\3\2\2\2"+
		"\u0203\u0204\7\24\2\2\u0204\u0205\78\2\2\u0205\u0206\7.\2\2\u0206\u0207"+
		"\b\20\1\2\u0207\u020a\5\64\33\2\u0208\u0209\7\33\2\2\u0209\u020b\5\36"+
		"\20\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c"+
		"\u01fa\3\2\2\2\u020c\u0203\3\2\2\2\u020d\37\3\2\2\2\u020e\u0210\5\b\5"+
		"\2\u020f\u0211\7(\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\5 \21\2\u0215"+
		"\u0222\3\2\2\2\u0216\u0218\5\6\4\2\u0217\u0219\7(\2\2\u0218\u0217\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\5 \21\2\u021d\u0222\3\2\2\2\u021e\u0222\5\""+
		"\22\2\u021f\u0222\5\b\5\2\u0220\u0222\5\6\4\2\u0221\u020e\3\2\2\2\u0221"+
		"\u0216\3\2\2\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2"+
		"\2\2\u0222!\3\2\2\2\u0223\u0225\5\b\5\2\u0224\u0226\7(\2\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\5\"\22\2\u022a\u0236\3\2\2\2\u022b\u022d\5"+
		"$\23\2\u022c\u022e\7(\2\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\5\""+
		"\22\2\u0232\u0236\3\2\2\2\u0233\u0236\5$\23\2\u0234\u0236\5\b\5\2\u0235"+
		"\u0223\3\2\2\2\u0235\u022b\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2"+
		"\2\2\u0236#\3\2\2\2\u0237\u0240\5(\25\2\u0238\u0240\5.\30\2\u0239\u0240"+
		"\5\60\31\2\u023a\u0240\5> \2\u023b\u0240\5&\24\2\u023c\u0240\5\62\32\2"+
		"\u023d\u0240\5\20\t\2\u023e\u0240\5\64\33\2\u023f\u0237\3\2\2\2\u023f"+
		"\u0238\3\2\2\2\u023f\u0239\3\2\2\2\u023f\u023a\3\2\2\2\u023f\u023b\3\2"+
		"\2\2\u023f\u023c\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240"+
		"%\3\2\2\2\u0241\u0242\7%\2\2\u0242\u0243\5&\24\2\u0243\u0244\7&\2\2\u0244"+
		"\u024e\3\2\2\2\u0245\u0246\b\24\1\2\u0246\u0247\5@!\2\u0247\u0249\7%\2"+
		"\2\u0248\u024a\5<\37\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024c\7&\2\2\u024c\u024e\3\2\2\2\u024d\u0241\3\2\2\2\u024d"+
		"\u0245\3\2\2\2\u024e\'\3\2\2\2\u024f\u0250\7\t\2\2\u0250\u0251\b\25\1"+
		"\2\u0251\u0253\5\64\33\2\u0252\u0254\7(\2\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0259\5$\23\2\u0258\u025a\7(\2\2\u0259\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025f\3\2"+
		"\2\2\u025d\u0260\5*\26\2\u025e\u0260\5,\27\2\u025f\u025d\3\2\2\2\u025f"+
		"\u025e\3\2\2\2\u0260\u02a6\3\2\2\2\u0261\u0262\7\t\2\2\u0262\u0263\b\25"+
		"\1\2\u0263\u0267\5\64\33\2\u0264\u0266\7(\2\2\u0265\u0264\3\2\2\2\u0266"+
		"\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u026a\u026c\7#\2\2\u026b\u026d\7(\2\2\u026c\u026b"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0271\3\2\2\2\u0270\u0272\5\"\22\2\u0271\u0270\3\2\2\2\u0271\u0272\3"+
		"\2\2\2\u0272\u0274\3\2\2\2\u0273\u0275\7(\2\2\u0274\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278\u027a\7$\2\2\u0279\u027b\7(\2\2\u027a\u0279\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0280\3\2\2\2\u027e"+
		"\u0281\5*\26\2\u027f\u0281\5,\27\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2"+
		"\2\2\u0281\u02a6\3\2\2\2\u0282\u0283\7\t\2\2\u0283\u0284\b\25\1\2\u0284"+
		"\u0286\5\64\33\2\u0285\u0287\7(\2\2\u0286\u0285\3\2\2\2\u0287\u0288\3"+
		"\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\5$\23\2\u028b\u02a6\3\2\2\2\u028c\u028d\7\t\2\2\u028d\u028e\b\25"+
		"\1\2\u028e\u0292\5\64\33\2\u028f\u0291\7(\2\2\u0290\u028f\3\2\2\2\u0291"+
		"\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0295\u0297\7#\2\2\u0296\u0298\7(\2\2\u0297\u0296"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u029d\5\"\22\2\u029c\u029b\3\2\2\2\u029c\u029d\3"+
		"\2\2\2\u029d\u029f\3\2\2\2\u029e\u02a0\7(\2\2\u029f\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a4\7$\2\2\u02a4\u02a6\3\2\2\2\u02a5\u024f\3\2\2\2\u02a5"+
		"\u0261\3\2\2\2\u02a5\u0282\3\2\2\2\u02a5\u028c\3\2\2\2\u02a6)\3\2\2\2"+
		"\u02a7\u02a8\7\n\2\2\u02a8\u02aa\b\26\1\2\u02a9\u02ab\7(\2\2\u02aa\u02a9"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02c7\5$\23\2\u02af\u02b0\7\n\2\2\u02b0\u02b4\b\26"+
		"\1\2\u02b1\u02b3\7(\2\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b7\u02b9\7#\2\2\u02b8\u02ba\7(\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd"+
		"\u02bf\5\"\22\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3"+
		"\2\2\2\u02c0\u02c2\7(\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\7$"+
		"\2\2\u02c6\u02a7\3\2\2\2\u02c6\u02af\3\2\2\2\u02c7+\3\2\2\2\u02c8\u02c9"+
		"\7\13\2\2\u02c9\u02ca\b\27\1\2\u02ca\u02cc\5\64\33\2\u02cb\u02cd\7(\2"+
		"\2\u02cc\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\5$\23\2\u02d1\u02d3\7(\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d9\5*\26\2\u02d7\u02d9\5,\27\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u031f\3\2\2\2\u02da\u02db\7\13"+
		"\2\2\u02db\u02dc\b\27\1\2\u02dc\u02e0\5\64\33\2\u02dd\u02df\7(\2\2\u02de"+
		"\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2"+
		"\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e5\7#\2\2\u02e4"+
		"\u02e6\7(\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e5\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02eb\5\"\22\2\u02ea"+
		"\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ee\7("+
		"\2\2\u02ed\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\7$\2\2\u02f2\u02f4\7(\2"+
		"\2\u02f3\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02fa\5*\26\2\u02f8\u02fa\5,\27\2\u02f9"+
		"\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa\u031f\3\2\2\2\u02fb\u02fc\7\13"+
		"\2\2\u02fc\u02fd\b\27\1\2\u02fd\u02ff\5\64\33\2\u02fe\u0300\7(\2\2\u02ff"+
		"\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2"+
		"\2\2\u0302\u0303\3\2\2\2\u0303\u0304\5$\23\2\u0304\u031f\3\2\2\2\u0305"+
		"\u0306\7\13\2\2\u0306\u0307\b\27\1\2\u0307\u030b\5\64\33\2\u0308\u030a"+
		"\7(\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0310\7#"+
		"\2\2\u030f\u0311\7(\2\2\u0310\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0316\5\""+
		"\22\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317"+
		"\u0319\7(\2\2\u0318\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\7$\2\2\u031d"+
		"\u031f\3\2\2\2\u031e\u02c8\3\2\2\2\u031e\u02da\3\2\2\2\u031e\u02fb\3\2"+
		"\2\2\u031e\u0305\3\2\2\2\u031f-\3\2\2\2\u0320\u0323\5@!\2\u0321\u0323"+
		"\58\35\2\u0322\u0320\3\2\2\2\u0322\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0325\7/\2\2\u0325\u0326\7\r\2\2\u0326\u0327\7\7\2\2\u0327\u0328\7\35"+
		"\2\2\u0328\u0329\5@!\2\u0329\u032b\7\35\2\2\u032a\u032c\7(\2\2\u032b\u032a"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032f\u0330\b\30\1\2\u0330\u0331\5$\23\2\u0331\u0354\3"+
		"\2\2\2\u0332\u0335\5@!\2\u0333\u0335\58\35\2\u0334\u0332\3\2\2\2\u0334"+
		"\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7/\2\2\u0337\u0338\7\r"+
		"\2\2\u0338\u0339\7\7\2\2\u0339\u033a\7\35\2\2\u033a\u033b\5@!\2\u033b"+
		"\u033f\7\35\2\2\u033c\u033e\7(\2\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2"+
		"\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341"+
		"\u033f\3\2\2\2\u0342\u0343\b\30\1\2\u0343\u034a\7#\2\2\u0344\u0346\7("+
		"\2\2\u0345\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0345\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\5\"\22\2\u034a\u0345\3"+
		"\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c\u034e\7(\2\2\u034d"+
		"\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0351\3\2\2\2\u0351\u0352\7$\2\2\u0352\u0354\3\2\2\2\u0353"+
		"\u0322\3\2\2\2\u0353\u0334\3\2\2\2\u0354/\3\2\2\2\u0355\u0356\7\6\2\2"+
		"\u0356\u0357\b\31\1\2\u0357\u0358\7%\2\2\u0358\u0359\5\64\33\2\u0359\u035a"+
		"\7&\2\2\u035a\61\3\2\2\2\u035b\u035c\5@!\2\u035c\u035d\7.\2\2\u035d\u035e"+
		"\5\64\33\2\u035e\u035f\b\32\1\2\u035f\u0368\3\2\2\2\u0360\u0365\5\64\33"+
		"\2\u0361\u0362\7\27\2\2\u0362\u0366\b\32\1\2\u0363\u0364\7\30\2\2\u0364"+
		"\u0366\b\32\1\2\u0365\u0361\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u0368\3"+
		"\2\2\2\u0367\u035b\3\2\2\2\u0367\u0360\3\2\2\2\u0368\63\3\2\2\2\u0369"+
		"\u036a\5@!\2\u036a\u036b\7.\2\2\u036b\u036c\5\64\33\2\u036c\u036d\b\33"+
		"\1\2\u036d\u036e\5\66\34\2\u036e\u0388\3\2\2\2\u036f\u0370\5@!\2\u0370"+
		"\u0371\5\66\34\2\u0371\u0388\3\2\2\2\u0372\u0373\5\20\t\2\u0373\u0374"+
		"\5\66\34\2\u0374\u0388\3\2\2\2\u0375\u037a\b\33\1\2\u0376\u0377\7\23\2"+
		"\2\u0377\u037b\b\33\1\2\u0378\u0379\7\34\2\2\u0379\u037b\b\33\1\2\u037a"+
		"\u0376\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\5\64"+
		"\33\2\u037d\u037e\b\33\1\2\u037e\u037f\5\66\34\2\u037f\u0388\3\2\2\2\u0380"+
		"\u0381\t\2\2\2\u0381\u0388\5\66\34\2\u0382\u0383\7%\2\2\u0383\u0384\5"+
		"\64\33\2\u0384\u0385\7&\2\2\u0385\u0386\5\66\34\2\u0386\u0388\3\2\2\2"+
		"\u0387\u0369\3\2\2\2\u0387\u036f\3\2\2\2\u0387\u0372\3\2\2\2\u0387\u0375"+
		"\3\2\2\2\u0387\u0380\3\2\2\2\u0387\u0382\3\2\2\2\u0388\65\3\2\2\2\u0389"+
		"\u038a\7\31\2\2\u038a\u038b\5\64\33\2\u038b\u038c\7\32\2\2\u038c\u038d"+
		"\5\64\33\2\u038d\u038e\b\34\1\2\u038e\u038f\5\66\34\2\u038f\u03c9\3\2"+
		"\2\2\u0390\u0391\7:\2\2\u0391\u0392\5\64\33\2\u0392\u0393\b\34\1\2\u0393"+
		"\u0394\5\66\34\2\u0394\u03c9\3\2\2\2\u0395\u0396\79\2\2\u0396\u0397\5"+
		"\64\33\2\u0397\u0398\b\34\1\2\u0398\u0399\5\66\34\2\u0399\u03c9\3\2\2"+
		"\2\u039a\u039b\7-\2\2\u039b\u039c\5\64\33\2\u039c\u039d\b\34\1\2\u039d"+
		"\u039e\5\66\34\2\u039e\u03c9\3\2\2\2\u039f\u03a4\b\34\1\2\u03a0\u03a1"+
		"\7+\2\2\u03a1\u03a5\b\34\1\2\u03a2\u03a3\7,\2\2\u03a3\u03a5\b\34\1\2\u03a4"+
		"\u03a0\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\5\64"+
		"\33\2\u03a7\u03a8\b\34\1\2\u03a8\u03a9\5\66\34\2\u03a9\u03c9\3\2\2\2\u03aa"+
		"\u03af\b\34\1\2\u03ab\u03ac\7\23\2\2\u03ac\u03b0\b\34\1\2\u03ad\u03ae"+
		"\7\22\2\2\u03ae\u03b0\b\34\1\2\u03af\u03ab\3\2\2\2\u03af\u03ad\3\2\2\2"+
		"\u03b0\u03b1\3\2\2\2\u03b1\u03b2\5\64\33\2\u03b2\u03b3\b\34\1\2\u03b3"+
		"\u03b4\5\66\34\2\u03b4\u03c9\3\2\2\2\u03b5\u03ba\b\34\1\2\u03b6\u03b7"+
		"\7\20\2\2\u03b7\u03bb\b\34\1\2\u03b8\u03b9\7\21\2\2\u03b9\u03bb\b\34\1"+
		"\2\u03ba\u03b6\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd"+
		"\5\64\33\2\u03bd\u03be\b\34\1\2\u03be\u03bf\5\66\34\2\u03bf\u03c9\3\2"+
		"\2\2\u03c0\u03c1\7\27\2\2\u03c1\u03c5\b\34\1\2\u03c2\u03c3\7\30\2\2\u03c3"+
		"\u03c5\b\34\1\2\u03c4\u03c0\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c6\3"+
		"\2\2\2\u03c6\u03c9\5\66\34\2\u03c7\u03c9\3\2\2\2\u03c8\u0389\3\2\2\2\u03c8"+
		"\u0390\3\2\2\2\u03c8\u0395\3\2\2\2\u03c8\u039a\3\2\2\2\u03c8\u039f\3\2"+
		"\2\2\u03c8\u03aa\3\2\2\2\u03c8\u03b5\3\2\2\2\u03c8\u03c4\3\2\2\2\u03c8"+
		"\u03c7\3\2\2\2\u03c9\67\3\2\2\2\u03ca\u03cb\7%\2\2\u03cb\u03cc\5\64\33"+
		"\2\u03cc\u03cd\7/\2\2\u03cd\u03ce\7/\2\2\u03ce\u03cf\5\64\33\2\u03cf\u03d0"+
		"\7&\2\2\u03d09\3\2\2\2\u03d1\u03d2\7\62\2\2\u03d2\u03d3\7/\2\2\u03d3\u03d4"+
		"\7\17\2\2\u03d4\u03d6\7%\2\2\u03d5\u03d7\5<\37\2\u03d6\u03d5\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\7&\2\2\u03d9;\3\2\2\2\u03da"+
		"\u03dd\5\64\33\2\u03db\u03dc\7\33\2\2\u03dc\u03de\5<\37\2\u03dd\u03db"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de=\3\2\2\2\u03df\u03e0\7\5\2\2\u03e0"+
		"\u03e1\b \1\2\u03e1\u03e2\5\64\33\2\u03e2?\3\2\2\2\u03e3\u03e5\78\2\2"+
		"\u03e4\u03e6\5B\"\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03f8"+
		"\3\2\2\2\u03e7\u03e9\7\37\2\2\u03e8\u03ea\5B\"\2\u03e9\u03e8\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03f8\3\2\2\2\u03eb\u03ec\7%\2\2\u03ec\u03ed\78\2"+
		"\2\u03ed\u03ef\7&\2\2\u03ee\u03f0\5B\"\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0"+
		"\3\2\2\2\u03f0\u03f8\3\2\2\2\u03f1\u03f2\7%\2\2\u03f2\u03f3\7\37\2\2\u03f3"+
		"\u03f5\7&\2\2\u03f4\u03f6\5B\"\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2"+
		"\2\u03f6\u03f8\3\2\2\2\u03f7\u03e3\3\2\2\2\u03f7\u03e7\3\2\2\2\u03f7\u03eb"+
		"\3\2\2\2\u03f7\u03f1\3\2\2\2\u03f8A\3\2\2\2\u03f9\u03fa\7\"\2\2\u03fa"+
		"\u03fb\5\64\33\2\u03fb\u03fd\7!\2\2\u03fc\u03fe\5B\"\2\u03fd\u03fc\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0417\3\2\2\2\u03ff\u0400\7/\2\2\u0400"+
		"\u0402\78\2\2\u0401\u0403\5B\"\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2"+
		"\2\u0403\u0417\3\2\2\2\u0404\u0405\7/\2\2\u0405\u0406\t\3\2\2\u0406\u0408"+
		"\7%\2\2\u0407\u0409\5<\37\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040c\7&\2\2\u040b\u040d\5B\"\2\u040c\u040b\3\2\2"+
		"\2\u040c\u040d\3\2\2\2\u040d\u0417\3\2\2\2\u040e\u0410\7%\2\2\u040f\u0411"+
		"\5<\37\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0414\7&\2\2\u0413\u0415\5B\"\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2"+
		"\2\u0415\u0417\3\2\2\2\u0416\u03f9\3\2\2\2\u0416\u03ff\3\2\2\2\u0416\u0404"+
		"\3\2\2\2\u0416\u040e\3\2\2\2\u0417C\3\2\2\2\u0418\u0419\7%\2\2\u0419\u041a"+
		"\5D#\2\u041a\u041b\7&\2\2\u041b\u041c\5F$\2\u041c\u0428\3\2\2\2\u041d"+
		"\u041e\t\2\2\2\u041e\u0428\5F$\2\u041f\u0420\7\23\2\2\u0420\u0421\5D#"+
		"\2\u0421\u0422\5F$\2\u0422\u0428\3\2\2\2\u0423\u0424\7\34\2\2\u0424\u0425"+
		"\5D#\2\u0425\u0426\5F$\2\u0426\u0428\3\2\2\2\u0427\u0418\3\2\2\2\u0427"+
		"\u041d\3\2\2\2\u0427\u041f\3\2\2\2\u0427\u0423\3\2\2\2\u0428E\3\2\2\2"+
		"\u0429\u042a\7\27\2\2\u042a\u0449\5F$\2\u042b\u042c\7\30\2\2\u042c\u0449"+
		"\5F$\2\u042d\u042e\t\4\2\2\u042e\u042f\5D#\2\u042f\u0430\5F$\2\u0430\u0449"+
		"\3\2\2\2\u0431\u0432\t\5\2\2\u0432\u0433\5D#\2\u0433\u0434\5F$\2\u0434"+
		"\u0449\3\2\2\2\u0435\u0436\t\6\2\2\u0436\u0437\5D#\2\u0437\u0438\5F$\2"+
		"\u0438\u0449\3\2\2\2\u0439\u043a\7-\2\2\u043a\u043b\5D#\2\u043b\u043c"+
		"\5F$\2\u043c\u0449\3\2\2\2\u043d\u043e\79\2\2\u043e\u043f\5D#\2\u043f"+
		"\u0440\5F$\2\u0440\u0449\3\2\2\2\u0441\u0442\7\31\2\2\u0442\u0443\5D#"+
		"\2\u0443\u0444\7\32\2\2\u0444\u0445\5D#\2\u0445\u0446\5F$\2\u0446\u0449"+
		"\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u0429\3\2\2\2\u0448\u042b\3\2\2\2\u0448"+
		"\u042d\3\2\2\2\u0448\u0431\3\2\2\2\u0448\u0435\3\2\2\2\u0448\u0439\3\2"+
		"\2\2\u0448\u043d\3\2\2\2\u0448\u0441\3\2\2\2\u0448\u0447\3\2\2\2\u0449"+
		"G\3\2\2\2\u0090ILT\\dkry\u0081\u008b\u0092\u0099\u009e\u00a4\u00a7\u00af"+
		"\u00b4\u00bb\u00be\u00c3\u00cc\u00d1\u00db\u00dd\u00e3\u00eb\u00f2\u00f8"+
		"\u0105\u0128\u0132\u013b\u013f\u0148\u0150\u0159\u0161\u0169\u0172\u0178"+
		"\u017e\u0185\u0188\u018d\u0195\u019d\u01a4\u01ac\u01b2\u01b8\u01bf\u01c2"+
		"\u01c7\u01d0\u01d6\u01dc\u01df\u01e6\u01ee\u01f5\u01f8\u0201\u020a\u020c"+
		"\u0212\u021a\u0221\u0227\u022f\u0235\u023f\u0249\u024d\u0255\u025b\u025f"+
		"\u0267\u026e\u0271\u0276\u027c\u0280\u0288\u0292\u0299\u029c\u02a1\u02a5"+
		"\u02ac\u02b4\u02bb\u02be\u02c3\u02c6\u02ce\u02d4\u02d8\u02e0\u02e7\u02ea"+
		"\u02ef\u02f5\u02f9\u0301\u030b\u0312\u0315\u031a\u031e\u0322\u032d\u0334"+
		"\u033f\u0347\u034a\u034f\u0353\u0365\u0367\u037a\u0387\u03a4\u03af\u03ba"+
		"\u03c4\u03c8\u03d6\u03dd\u03e5\u03e9\u03ef\u03f5\u03f7\u03fd\u0402\u0408"+
		"\u040c\u0410\u0414\u0416\u0427\u0448";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}