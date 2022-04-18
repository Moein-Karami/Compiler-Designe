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
		SMALL_NAME=50, AND_AND=51, OR_OR=52;
	public static final int
		RULE_simple_loop = 0, RULE_start_prog = 1, RULE_var_dec = 2, RULE_comment = 3, 
		RULE_class_dec = 4, RULE_prog_body = 5, RULE_set_dec = 6, RULE_func_var = 7, 
		RULE_begin_class = 8, RULE_init_dec = 9, RULE_init_begin = 10, RULE_func_dec = 11, 
		RULE_argumants = 12, RULE_default_argumants = 13, RULE_func_begin = 14, 
		RULE_scop_body = 15, RULE_line_command = 16, RULE_if_state = 17, RULE_my_else = 18, 
		RULE_else_if = 19, RULE_for_loop = 20, RULE_assigment = 21, RULE_print = 22, 
		RULE_expr = 23, RULE_expr_prime = 24, RULE_sequence = 25, RULE_my_new = 26, 
		RULE_func_input = 27, RULE_my_return = 28, RULE_var = 29, RULE_ext = 30, 
		RULE_const_expr = 31, RULE_const_expr_prime = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"simple_loop", "start_prog", "var_dec", "comment", "class_dec", "prog_body", 
			"set_dec", "func_var", "begin_class", "init_dec", "init_begin", "func_dec", 
			"argumants", "default_argumants", "func_begin", "scop_body", "line_command", 
			"if_state", "my_else", "else_if", "for_loop", "assigment", "print", "expr", 
			"expr_prime", "sequence", "my_new", "func_input", "my_return", "var", 
			"ext", "const_expr", "const_expr_prime"
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
			"'='", "'.'", "'#'", "'Set'", null, null, null, "'&&'", "'||'"
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
			"SHARP_SIGN", "SET", "CAP_NAME", "NUM", "SMALL_NAME", "AND_AND", "OR_OR"
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(66);
				start_prog();
				}
				break;
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(69);
				match(T__0);
				}
			}

			setState(72);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				var_dec();
				setState(76); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(75);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(78); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(80);
				start_prog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				comment();
				setState(84); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(83);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(86); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(88);
				start_prog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				class_dec();
				setState(92); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(91);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(94); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(96);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(103);
				start_prog();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				var_dec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				comment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(110);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(111);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(112);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(113);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(114);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(117);
				match(LBRACK);
				setState(118);
				expr();
				setState(119);
				match(RBRACK);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(SMALL_NAME);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				match(SMALL_NAME);
				}
				}
				setState(133);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(SHARP_SIGN);
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						matchWildcard();
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case BEGIN_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(BEGIN_COMMENT);
				setState(143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(142);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(147);
						matchWildcard();
						}
						} 
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					match(NEW_LINE);
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(158);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(CLASS);
				setState(162);
				match(CAP_NAME);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(163);
					match(LT);
					setState(164);
					match(CAP_NAME);
					}
				}

				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(167);
					match(NEW_LINE);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(LCURL);
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(174);
						match(NEW_LINE);
						}
						}
						setState(177); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(179);
					begin_class();
					}
					break;
				}
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
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(CLASS);
				setState(189);
				match(CAP_NAME);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(190);
					match(LT);
					setState(191);
					match(CAP_NAME);
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
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(200);
					comment();
					}
					break;
				case 2:
					{
					setState(201);
					match(ACCESS_TYPE);
					setState(202);
					var_dec();
					}
					break;
				case 3:
					{
					setState(203);
					match(ACCESS_TYPE);
					setState(204);
					init_dec();
					}
					break;
				case 4:
					{
					setState(205);
					match(ACCESS_TYPE);
					setState(206);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				class_dec();
				setState(213); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(212);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(215); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(217);
				prog_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				comment();
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(220);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(225);
				prog_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(227);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(230); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(232);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				class_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
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
			setState(238);
			match(SET);
			setState(239);
			match(LT);
			setState(240);
			match(INT);
			setState(241);
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
		enterRule(_localctx, 14, RULE_func_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(FPTR);
			setState(244);
			match(LT);
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(245);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(246);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(247);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(248);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(249);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(250);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(254);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(255);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(256);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(257);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(258);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(259);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(ARROW);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(268);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(269);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(270);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(271);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(272);
				set_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
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
		enterRule(_localctx, 16, RULE_begin_class);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				comment();
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278);
					match(NEW_LINE);
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(283);
				begin_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(ACCESS_TYPE);
				setState(286);
				var_dec();
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(287);
					match(NEW_LINE);
					}
					}
					setState(290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(292);
				begin_class();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				init_dec();
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(295);
					match(NEW_LINE);
					}
					}
					setState(298); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(300);
				begin_class();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				func_dec();
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(303);
					match(NEW_LINE);
					}
					}
					setState(306); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(308);
				begin_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				match(ACCESS_TYPE);
				setState(312);
				var_dec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				init_dec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(314);
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
		enterRule(_localctx, 18, RULE_init_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(ACCESS_TYPE);
			setState(318);
			match(INIT);
			setState(319);
			match(LPAR);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
				{
				setState(320);
				argumants();
				}
			}

			setState(323);
			match(RPAR);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(324);
				match(NEW_LINE);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(LCURL);
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
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
				init_begin();
				}
				break;
			}
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				match(NEW_LINE);
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINE );
			setState(344);
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
		enterRule(_localctx, 20, RULE_init_begin);
		int _la;
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				comment();
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(347);
					match(NEW_LINE);
					}
					}
					setState(350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(352);
				init_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				var_dec();
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(355);
					match(NEW_LINE);
					}
					}
					setState(358); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(360);
				init_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
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
			setState(367);
			match(ACCESS_TYPE);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(368);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(369);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(370);
				match(BOOL);
				}
				break;
			case SET:
				{
				setState(371);
				set_dec();
				}
				break;
			case CAP_NAME:
				{
				setState(372);
				match(CAP_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(375);
			match(SMALL_NAME);
			setState(376);
			match(LPAR);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
				{
				setState(377);
				argumants();
				}
			}

			setState(380);
			match(RPAR);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(381);
				match(NEW_LINE);
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(LCURL);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388);
					match(NEW_LINE);
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(393);
				func_begin();
				}
				break;
			}
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(396);
				match(NEW_LINE);
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINE );
			setState(401);
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
		enterRule(_localctx, 24, RULE_argumants);
		int _la;
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(403);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(404);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(405);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(406);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(407);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(410);
					match(LBRACK);
					setState(411);
					expr();
					setState(412);
					match(RBRACK);
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(SMALL_NAME);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(420);
					match(COMMA);
					setState(421);
					argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
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
		enterRule(_localctx, 26, RULE_default_argumants);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(INT);
				setState(428);
				match(SMALL_NAME);
				setState(429);
				match(EQUAL);
				setState(430);
				expr();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(431);
					match(COMMA);
					setState(432);
					default_argumants();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(BOOL);
				setState(436);
				match(SMALL_NAME);
				setState(437);
				match(EQUAL);
				setState(438);
				expr();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(439);
					match(COMMA);
					setState(440);
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
		enterRule(_localctx, 28, RULE_func_begin);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				comment();
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(446);
					match(NEW_LINE);
					}
					}
					setState(449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(451);
				func_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				var_dec();
				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(454);
					match(NEW_LINE);
					}
					}
					setState(457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(459);
				func_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
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
		enterRule(_localctx, 30, RULE_scop_body);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				comment();
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
				scop_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				line_command();
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(475);
					match(NEW_LINE);
					}
					}
					setState(478); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(480);
				scop_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
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
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				if_state();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
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
		enterRule(_localctx, 34, RULE_if_state);
		int _la;
		try {
			int _alt;
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(IF);
				setState(494);
				expr();
				setState(496); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(495);
					match(NEW_LINE);
					}
					}
					setState(498); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(500);
				line_command();
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(501);
					match(NEW_LINE);
					}
					}
					setState(504); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(506);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(507);
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
				setState(510);
				match(IF);
				setState(511);
				expr();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(512);
					match(NEW_LINE);
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(518);
				match(LCURL);
				setState(520); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(519);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(522); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(524);
					scop_body();
					}
				}

				setState(528); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(527);
					match(NEW_LINE);
					}
					}
					setState(530); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(532);
				match(RCURL);
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
				setState(540);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(538);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(539);
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
				setState(542);
				match(IF);
				setState(543);
				expr();
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(544);
					match(NEW_LINE);
					}
					}
					setState(547); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(549);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(IF);
				setState(552);
				expr();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(553);
					match(NEW_LINE);
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(LCURL);
				setState(561); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(560);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(563); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(565);
					scop_body();
					}
				}

				setState(569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(568);
					match(NEW_LINE);
					}
					}
					setState(571); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(573);
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
		enterRule(_localctx, 36, RULE_my_else);
		int _la;
		try {
			int _alt;
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(ELSE);
				setState(579); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(578);
					match(NEW_LINE);
					}
					}
					setState(581); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(583);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(ELSE);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(585);
					match(NEW_LINE);
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(LCURL);
				setState(593); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(592);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(595); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(597);
					scop_body();
					}
				}

				setState(601); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(600);
					match(NEW_LINE);
					}
					}
					setState(603); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(605);
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
		enterRule(_localctx, 38, RULE_else_if);
		int _la;
		try {
			int _alt;
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(ELSE_IF);
				setState(609);
				expr();
				setState(611); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(610);
					match(NEW_LINE);
					}
					}
					setState(613); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(615);
				line_command();
				setState(617); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(616);
					match(NEW_LINE);
					}
					}
					setState(619); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(623);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(621);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(622);
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
				setState(625);
				match(ELSE_IF);
				setState(626);
				expr();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(627);
					match(NEW_LINE);
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(633);
				match(LCURL);
				setState(635); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(634);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(637); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(639);
					scop_body();
					}
				}

				setState(643); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(642);
					match(NEW_LINE);
					}
					}
					setState(645); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(647);
				match(RCURL);
				setState(649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(648);
					match(NEW_LINE);
					}
					}
					setState(651); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(653);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(654);
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
				setState(657);
				match(ELSE_IF);
				setState(658);
				expr();
				setState(660); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(659);
					match(NEW_LINE);
					}
					}
					setState(662); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(664);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
				match(ELSE_IF);
				setState(667);
				expr();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(668);
					match(NEW_LINE);
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(LCURL);
				setState(676); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(675);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(678); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(680);
					scop_body();
					}
				}

				setState(684); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(683);
					match(NEW_LINE);
					}
					}
					setState(686); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(688);
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
		enterRule(_localctx, 40, RULE_for_loop);
		int _la;
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(692);
					var();
					}
					break;
				case 2:
					{
					setState(693);
					sequence();
					}
					break;
				}
				setState(696);
				match(DOT);
				setState(697);
				match(EACH);
				setState(698);
				match(DO);
				setState(699);
				match(ABS_SIGN);
				setState(700);
				var();
				setState(701);
				match(ABS_SIGN);
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
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(709);
					var();
					}
					break;
				case 2:
					{
					setState(710);
					sequence();
					}
					break;
				}
				setState(713);
				match(DOT);
				setState(714);
				match(EACH);
				setState(715);
				match(DO);
				setState(716);
				match(ABS_SIGN);
				setState(717);
				var();
				setState(718);
				match(ABS_SIGN);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(719);
					match(NEW_LINE);
					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(725);
				match(LCURL);
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(727); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(726);
						match(NEW_LINE);
						}
						}
						setState(729); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(731);
					scop_body();
					}
					break;
				}
				setState(735); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(734);
					match(NEW_LINE);
					}
					}
					setState(737); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(739);
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

	public static class AssigmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public My_newContext my_new() {
			return getRuleContext(My_newContext.class,0);
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
		enterRule(_localctx, 42, RULE_assigment);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				var();
				setState(744);
				match(EQUAL);
				setState(745);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				var();
				setState(748);
				match(EQUAL);
				setState(749);
				my_new();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				var();
				setState(752);
				match(PLUS_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
				var();
				setState(755);
				match(MINUS_MINUS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(757);
				var();
				setState(758);
				match(EQUAL);
				setState(759);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				var();
				setState(762);
				match(EQUAL);
				setState(763);
				my_new();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(765);
				var();
				setState(766);
				match(PLUS_PLUS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(768);
				var();
				setState(769);
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
		enterRule(_localctx, 44, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(PRINT);
			setState(774);
			match(LPAR);
			setState(775);
			expr();
			setState(776);
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
		public TerminalNode NUM() { return getToken(SimpleLOOPParser.NUM, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(SimpleLOOPParser.BOOL_VALUE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_expr);
		int _la;
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(LPAR);
				setState(779);
				expr();
				setState(780);
				match(RPAR);
				setState(781);
				expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(784);
				expr();
				setState(785);
				expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(788);
				expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				var();
				setState(790);
				expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(792);
				assigment();
				setState(793);
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
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public TerminalNode MINUS_MINUS() { return getToken(SimpleLOOPParser.MINUS_MINUS, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(SimpleLOOPParser.PLUS_PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 48, RULE_expr_prime);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(798);
				expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(800);
				expr();
				setState(801);
				expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(804);
				expr();
				setState(805);
				expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(808);
				expr();
				setState(809);
				expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				match(IS_EQUAL);
				setState(812);
				expr();
				setState(813);
				expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(815);
				match(AND_AND);
				setState(816);
				expr();
				setState(817);
				expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(819);
				match(OR_OR);
				setState(820);
				expr();
				setState(821);
				expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(823);
				match(QUESTION_MARK);
				setState(824);
				line_command();
				setState(825);
				match(COLON);
				setState(826);
				line_command();
				setState(827);
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
		enterRule(_localctx, 50, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(LPAR);
			setState(833);
			expr();
			setState(834);
			match(DOT);
			setState(835);
			match(DOT);
			setState(836);
			expr();
			setState(837);
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
		enterRule(_localctx, 52, RULE_my_new);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==CAP_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(840);
			match(DOT);
			setState(841);
			match(NEW_WORD);
			setState(842);
			match(LPAR);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
				{
				setState(843);
				func_input();
				}
			}

			setState(846);
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
		enterRule(_localctx, 54, RULE_func_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			expr();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(849);
				match(COMMA);
				setState(850);
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
		enterRule(_localctx, 56, RULE_my_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(RETURN);
			setState(854);
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
		enterRule(_localctx, 58, RULE_var);
		try {
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				match(SMALL_NAME);
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(857);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(SELF_SMALL_NAME);
				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(861);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				match(LPAR);
				setState(865);
				match(SMALL_NAME);
				setState(866);
				match(RPAR);
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(867);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(870);
				match(LPAR);
				setState(871);
				match(SELF_SMALL_NAME);
				setState(872);
				match(RPAR);
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(873);
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
		enterRule(_localctx, 60, RULE_ext);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				match(LBRACK);
				setState(879);
				expr();
				setState(880);
				match(RBRACK);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(881);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				match(DOT);
				setState(885);
				match(SMALL_NAME);
				setState(887);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(886);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				match(DOT);
				setState(890);
				_la = _input.LA(1);
				if ( !(_la==INIT || _la==SMALL_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(891);
				match(LPAR);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(892);
					func_input();
					}
				}

				setState(895);
				match(RPAR);
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(896);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(899);
				match(LPAR);
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(900);
					func_input();
					}
				}

				setState(903);
				match(RPAR);
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(904);
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
		enterRule(_localctx, 62, RULE_const_expr);
		int _la;
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(LPAR);
				setState(910);
				const_expr();
				setState(911);
				match(RPAR);
				setState(912);
				const_expr_prime();
				}
				break;
			case BOOL_VALUE:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(915);
				const_expr_prime();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				match(MINUS);
				setState(917);
				const_expr();
				setState(918);
				const_expr_prime();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
				match(NOT);
				setState(921);
				const_expr();
				setState(922);
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
		enterRule(_localctx, 64, RULE_const_expr_prime);
		int _la;
		try {
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				match(PLUS_PLUS);
				setState(927);
				const_expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				match(MINUS_MINUS);
				setState(929);
				const_expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(931);
				const_expr();
				setState(932);
				const_expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(935);
				const_expr();
				setState(936);
				const_expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(938);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(939);
				const_expr();
				setState(940);
				const_expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(942);
				match(IS_EQUAL);
				setState(943);
				const_expr();
				setState(944);
				const_expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(946);
				match(AND_AND);
				setState(947);
				const_expr();
				setState(948);
				const_expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(950);
				match(QUESTION_MARK);
				setState(951);
				const_expr();
				setState(952);
				match(COLON);
				setState(953);
				const_expr();
				setState(954);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u03c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\5\2I\n\2\3\2\3\2\3\3\3\3\6\3O\n\3\r\3\16"+
		"\3P\3\3\3\3\3\3\3\3\6\3W\n\3\r\3\16\3X\3\3\3\3\3\3\3\3\6\3_\n\3\r\3\16"+
		"\3`\3\3\3\3\3\3\6\3f\n\3\r\3\16\3g\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4v\n\4\3\4\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4"+
		"\3\4\3\4\7\4\u0084\n\4\f\4\16\4\u0087\13\4\3\5\3\5\7\5\u008b\n\5\f\5\16"+
		"\5\u008e\13\5\3\5\3\5\6\5\u0092\n\5\r\5\16\5\u0093\3\5\7\5\u0097\n\5\f"+
		"\5\16\5\u009a\13\5\3\5\6\5\u009d\n\5\r\5\16\5\u009e\3\5\5\5\u00a2\n\5"+
		"\3\6\3\6\3\6\3\6\5\6\u00a8\n\6\3\6\7\6\u00ab\n\6\f\6\16\6\u00ae\13\6\3"+
		"\6\3\6\6\6\u00b2\n\6\r\6\16\6\u00b3\3\6\5\6\u00b7\n\6\3\6\6\6\u00ba\n"+
		"\6\r\6\16\6\u00bb\3\6\3\6\3\6\3\6\3\6\5\6\u00c3\n\6\3\6\7\6\u00c6\n\6"+
		"\f\6\16\6\u00c9\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d2\n\6\5\6\u00d4"+
		"\n\6\3\7\3\7\6\7\u00d8\n\7\r\7\16\7\u00d9\3\7\3\7\3\7\3\7\6\7\u00e0\n"+
		"\7\r\7\16\7\u00e1\3\7\3\7\3\7\6\7\u00e7\n\7\r\7\16\7\u00e8\3\7\3\7\3\7"+
		"\3\7\5\7\u00ef\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00fe\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0107\n\t\7\t\u0109\n\t"+
		"\f\t\16\t\u010c\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0114\n\t\3\t\3\t\3\n"+
		"\3\n\6\n\u011a\n\n\r\n\16\n\u011b\3\n\3\n\3\n\3\n\3\n\6\n\u0123\n\n\r"+
		"\n\16\n\u0124\3\n\3\n\3\n\3\n\6\n\u012b\n\n\r\n\16\n\u012c\3\n\3\n\3\n"+
		"\3\n\6\n\u0133\n\n\r\n\16\n\u0134\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u013e"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0144\n\13\3\13\3\13\7\13\u0148\n\13\f\13"+
		"\16\13\u014b\13\13\3\13\3\13\6\13\u014f\n\13\r\13\16\13\u0150\3\13\5\13"+
		"\u0154\n\13\3\13\6\13\u0157\n\13\r\13\16\13\u0158\3\13\3\13\3\f\3\f\6"+
		"\f\u015f\n\f\r\f\16\f\u0160\3\f\3\f\3\f\3\f\6\f\u0167\n\f\r\f\16\f\u0168"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0170\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0178\n"+
		"\r\3\r\3\r\3\r\5\r\u017d\n\r\3\r\3\r\7\r\u0181\n\r\f\r\16\r\u0184\13\r"+
		"\3\r\3\r\6\r\u0188\n\r\r\r\16\r\u0189\3\r\5\r\u018d\n\r\3\r\6\r\u0190"+
		"\n\r\r\r\16\r\u0191\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u019b\n\16\3"+
		"\16\3\16\3\16\3\16\7\16\u01a1\n\16\f\16\16\16\u01a4\13\16\3\16\3\16\3"+
		"\16\5\16\u01a9\n\16\3\16\5\16\u01ac\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01b4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01bc\n\17\5\17\u01be"+
		"\n\17\3\20\3\20\6\20\u01c2\n\20\r\20\16\20\u01c3\3\20\3\20\3\20\3\20\6"+
		"\20\u01ca\n\20\r\20\16\20\u01cb\3\20\3\20\3\20\3\20\3\20\5\20\u01d3\n"+
		"\20\3\21\3\21\6\21\u01d7\n\21\r\21\16\21\u01d8\3\21\3\21\3\21\3\21\6\21"+
		"\u01df\n\21\r\21\16\21\u01e0\3\21\3\21\3\21\3\21\5\21\u01e7\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u01ee\n\22\3\23\3\23\3\23\6\23\u01f3\n\23\r"+
		"\23\16\23\u01f4\3\23\3\23\6\23\u01f9\n\23\r\23\16\23\u01fa\3\23\3\23\5"+
		"\23\u01ff\n\23\3\23\3\23\3\23\7\23\u0204\n\23\f\23\16\23\u0207\13\23\3"+
		"\23\3\23\6\23\u020b\n\23\r\23\16\23\u020c\3\23\5\23\u0210\n\23\3\23\6"+
		"\23\u0213\n\23\r\23\16\23\u0214\3\23\3\23\6\23\u0219\n\23\r\23\16\23\u021a"+
		"\3\23\3\23\5\23\u021f\n\23\3\23\3\23\3\23\6\23\u0224\n\23\r\23\16\23\u0225"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u022d\n\23\f\23\16\23\u0230\13\23\3\23"+
		"\3\23\6\23\u0234\n\23\r\23\16\23\u0235\3\23\5\23\u0239\n\23\3\23\6\23"+
		"\u023c\n\23\r\23\16\23\u023d\3\23\3\23\5\23\u0242\n\23\3\24\3\24\6\24"+
		"\u0246\n\24\r\24\16\24\u0247\3\24\3\24\3\24\7\24\u024d\n\24\f\24\16\24"+
		"\u0250\13\24\3\24\3\24\6\24\u0254\n\24\r\24\16\24\u0255\3\24\5\24\u0259"+
		"\n\24\3\24\6\24\u025c\n\24\r\24\16\24\u025d\3\24\5\24\u0261\n\24\3\25"+
		"\3\25\3\25\6\25\u0266\n\25\r\25\16\25\u0267\3\25\3\25\6\25\u026c\n\25"+
		"\r\25\16\25\u026d\3\25\3\25\5\25\u0272\n\25\3\25\3\25\3\25\7\25\u0277"+
		"\n\25\f\25\16\25\u027a\13\25\3\25\3\25\6\25\u027e\n\25\r\25\16\25\u027f"+
		"\3\25\5\25\u0283\n\25\3\25\6\25\u0286\n\25\r\25\16\25\u0287\3\25\3\25"+
		"\6\25\u028c\n\25\r\25\16\25\u028d\3\25\3\25\5\25\u0292\n\25\3\25\3\25"+
		"\3\25\6\25\u0297\n\25\r\25\16\25\u0298\3\25\3\25\3\25\3\25\3\25\7\25\u02a0"+
		"\n\25\f\25\16\25\u02a3\13\25\3\25\3\25\6\25\u02a7\n\25\r\25\16\25\u02a8"+
		"\3\25\5\25\u02ac\n\25\3\25\6\25\u02af\n\25\r\25\16\25\u02b0\3\25\3\25"+
		"\5\25\u02b5\n\25\3\26\3\26\5\26\u02b9\n\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\6\26\u02c2\n\26\r\26\16\26\u02c3\3\26\3\26\3\26\3\26\5\26\u02ca"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u02d3\n\26\f\26\16\26\u02d6"+
		"\13\26\3\26\3\26\6\26\u02da\n\26\r\26\16\26\u02db\3\26\5\26\u02df\n\26"+
		"\3\26\6\26\u02e2\n\26\r\26\16\26\u02e3\3\26\3\26\5\26\u02e8\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0306\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u031e\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0341\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u034f\n\34\3\34\3\34\3\35\3\35\3\35\5\35"+
		"\u0356\n\35\3\36\3\36\3\36\3\37\3\37\5\37\u035d\n\37\3\37\3\37\5\37\u0361"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u0367\n\37\3\37\3\37\3\37\3\37\5\37\u036d"+
		"\n\37\5\37\u036f\n\37\3 \3 \3 \3 \5 \u0375\n \3 \3 \3 \5 \u037a\n \3 "+
		"\3 \3 \3 \5 \u0380\n \3 \3 \5 \u0384\n \3 \3 \5 \u0388\n \3 \3 \5 \u038c"+
		"\n \5 \u038e\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u039f"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03c0\n"+
		"\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@B\2\n\4\2\23\23\34\34\4\2\b\b\63\63\3\2\27\30\3\2\20\21\3\2\22\23"+
		"\3\2+,\3\2\61\62\4\2\f\f\64\64\2\u0472\2E\3\2\2\2\4n\3\2\2\2\6u\3\2\2"+
		"\2\b\u00a1\3\2\2\2\n\u00d3\3\2\2\2\f\u00ee\3\2\2\2\16\u00f0\3\2\2\2\20"+
		"\u00f5\3\2\2\2\22\u013d\3\2\2\2\24\u013f\3\2\2\2\26\u016f\3\2\2\2\30\u0171"+
		"\3\2\2\2\32\u01ab\3\2\2\2\34\u01bd\3\2\2\2\36\u01d2\3\2\2\2 \u01e6\3\2"+
		"\2\2\"\u01ed\3\2\2\2$\u0241\3\2\2\2&\u0260\3\2\2\2(\u02b4\3\2\2\2*\u02e7"+
		"\3\2\2\2,\u0305\3\2\2\2.\u0307\3\2\2\2\60\u031d\3\2\2\2\62\u0340\3\2\2"+
		"\2\64\u0342\3\2\2\2\66\u0349\3\2\2\28\u0352\3\2\2\2:\u0357\3\2\2\2<\u036e"+
		"\3\2\2\2>\u038d\3\2\2\2@\u039e\3\2\2\2B\u03bf\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2EF\3\2\2\2FH\3\2\2\2GI\7\3\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\2"+
		"\2\3K\3\3\2\2\2LN\5\6\4\2MO\7(\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2QR\3\2\2\2RS\5\4\3\2So\3\2\2\2TV\5\b\5\2UW\7(\2\2VU\3\2\2\2WX\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\4\3\2[o\3\2\2\2\\^\5\n\6\2]_\7"+
		"(\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\f\7\2co\3"+
		"\2\2\2df\7(\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2io\5"+
		"\4\3\2jo\5\6\4\2ko\5\b\5\2lo\5\n\6\2mo\3\2\2\2nL\3\2\2\2nT\3\2\2\2n\\"+
		"\3\2\2\2ne\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\5\3\2\2\2"+
		"pv\7\16\2\2qv\7\24\2\2rv\7\62\2\2sv\5\16\b\2tv\5\20\t\2up\3\2\2\2uq\3"+
		"\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v}\3\2\2\2wx\7\"\2\2xy\5\60\31\2y"+
		"z\7!\2\2z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3"+
		"\2\2\2\177}\3\2\2\2\u0080\u0085\7\64\2\2\u0081\u0082\7\33\2\2\u0082\u0084"+
		"\7\64\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\7\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008c\7"+
		"\60\2\2\u0089\u008b\13\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u00a2\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0091\7)\2\2\u0090\u0092\7(\2\2\u0091\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098\3\2\2\2\u0095"+
		"\u0097\13\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009d\7(\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7*\2\2\u00a1"+
		"\u0088\3\2\2\2\u00a1\u008f\3\2\2\2\u00a2\t\3\2\2\2\u00a3\u00a4\7\36\2"+
		"\2\u00a4\u00a7\7\62\2\2\u00a5\u00a6\7+\2\2\u00a6\u00a8\7\62\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\7("+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b6\7#"+
		"\2\2\u00b0\u00b2\7(\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\5\22"+
		"\n\2\u00b6\u00b1\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00ba\7(\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00d4\7$\2\2\u00be"+
		"\u00bf\7\36\2\2\u00bf\u00c2\7\62\2\2\u00c0\u00c1\7+\2\2\u00c1\u00c3\7"+
		"\62\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\3\2\2\2\u00c4"+
		"\u00c6\7(\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00d2\5\b\5\2\u00cb\u00cc\7 \2\2\u00cc\u00d2\5\6\4\2\u00cd\u00ce\7 \2"+
		"\2\u00ce\u00d2\5\24\13\2\u00cf\u00d0\7 \2\2\u00d0\u00d2\5\30\r\2\u00d1"+
		"\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00a3\3\2\2\2\u00d3\u00be\3\2\2\2\u00d4"+
		"\13\3\2\2\2\u00d5\u00d7\5\n\6\2\u00d6\u00d8\7(\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\5\f\7\2\u00dc\u00ef\3\2\2\2\u00dd\u00df\5\b\5\2\u00de"+
		"\u00e0\7(\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\f\7\2\u00e4"+
		"\u00ef\3\2\2\2\u00e5\u00e7\7(\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ef\5\f\7\2\u00eb\u00ef\5\n\6\2\u00ec\u00ef\5\b\5\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00d5\3\2\2\2\u00ee\u00dd\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\r\3\2\2\2"+
		"\u00f0\u00f1\7\61\2\2\u00f1\u00f2\7+\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4"+
		"\7,\2\2\u00f4\17\3\2\2\2\u00f5\u00f6\7\26\2\2\u00f6\u00fd\7+\2\2\u00f7"+
		"\u00fe\7\25\2\2\u00f8\u00fe\7\16\2\2\u00f9\u00fe\7\24\2\2\u00fa\u00fe"+
		"\7\62\2\2\u00fb\u00fe\5\16\b\2\u00fc\u00fe\5\20\t\2\u00fd\u00f7\3\2\2"+
		"\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u010a\3\2\2\2\u00ff\u0106\7\33\2\2"+
		"\u0100\u0107\7\25\2\2\u0101\u0107\7\16\2\2\u0102\u0107\7\24\2\2\u0103"+
		"\u0107\7\62\2\2\u0104\u0107\5\16\b\2\u0105\u0107\5\20\t\2\u0106\u0100"+
		"\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u00ff\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0113\7\'\2\2\u010e\u0114\7\25"+
		"\2\2\u010f\u0114\7\16\2\2\u0110\u0114\7\24\2\2\u0111\u0114\7\62\2\2\u0112"+
		"\u0114\5\16\b\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\7,\2\2\u0116\21\3\2\2\2\u0117\u0119\5\b\5\2\u0118\u011a\7(\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5\22\n\2\u011e\u013e\3\2\2\2"+
		"\u011f\u0120\7 \2\2\u0120\u0122\5\6\4\2\u0121\u0123\7(\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\5\22\n\2\u0127\u013e\3\2\2\2\u0128\u012a\5"+
		"\24\13\2\u0129\u012b\7(\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5\22"+
		"\n\2\u012f\u013e\3\2\2\2\u0130\u0132\5\30\r\2\u0131\u0133\7(\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5\22\n\2\u0137\u013e\3\2\2\2\u0138"+
		"\u013e\5\b\5\2\u0139\u013a\7 \2\2\u013a\u013e\5\6\4\2\u013b\u013e\5\24"+
		"\13\2\u013c\u013e\5\30\r\2\u013d\u0117\3\2\2\2\u013d\u011f\3\2\2\2\u013d"+
		"\u0128\3\2\2\2\u013d\u0130\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\23\3\2\2\2\u013f\u0140"+
		"\7 \2\2\u0140\u0141\7\f\2\2\u0141\u0143\7%\2\2\u0142\u0144\5\32\16\2\u0143"+
		"\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0149\7&"+
		"\2\2\u0146\u0148\7(\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0153\7#\2\2\u014d\u014f\7(\2\2\u014e\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0154\5\26\f\2\u0153\u014e\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3"+
		"\2\2\2\u0155\u0157\7(\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7$"+
		"\2\2\u015b\25\3\2\2\2\u015c\u015e\5\b\5\2\u015d\u015f\7(\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\5\26\f\2\u0163\u0170\3\2\2\2\u0164\u0166\5"+
		"\6\4\2\u0165\u0167\7(\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5\26"+
		"\f\2\u016b\u0170\3\2\2\2\u016c\u0170\5 \21\2\u016d\u0170\5\b\5\2\u016e"+
		"\u0170\5\6\4\2\u016f\u015c\3\2\2\2\u016f\u0164\3\2\2\2\u016f\u016c\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\27\3\2\2\2\u0171\u0177"+
		"\7 \2\2\u0172\u0178\7\25\2\2\u0173\u0178\7\16\2\2\u0174\u0178\7\24\2\2"+
		"\u0175\u0178\5\16\b\2\u0176\u0178\7\62\2\2\u0177\u0172\3\2\2\2\u0177\u0173"+
		"\3\2\2\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\7\64\2\2\u017a\u017c\7%\2\2\u017b\u017d\5\32"+
		"\16\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0182\7&\2\2\u017f\u0181\7(\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2"+
		"\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0185\u018c\7#\2\2\u0186\u0188\7(\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\5\36\20\2\u018c\u0187\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u0190\7(\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\7$\2\2\u0194\31\3\2\2\2\u0195\u019b\7\16\2\2\u0196\u019b\7\24\2"+
		"\2\u0197\u019b\7\62\2\2\u0198\u019b\5\16\b\2\u0199\u019b\5\20\t\2\u019a"+
		"\u0195\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u0199\3\2\2\2\u019b\u01a2\3\2\2\2\u019c\u019d\7\"\2\2\u019d"+
		"\u019e\5\60\31\2\u019e\u019f\7!\2\2\u019f\u01a1\3\2\2\2\u01a0\u019c\3"+
		"\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\7\64\2\2\u01a6\u01a7\7"+
		"\33\2\2\u01a7\u01a9\5\32\16\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2"+
		"\u01a9\u01ac\3\2\2\2\u01aa\u01ac\5\34\17\2\u01ab\u019a\3\2\2\2\u01ab\u01aa"+
		"\3\2\2\2\u01ac\33\3\2\2\2\u01ad\u01ae\7\16\2\2\u01ae\u01af\7\64\2\2\u01af"+
		"\u01b0\7.\2\2\u01b0\u01b3\5\60\31\2\u01b1\u01b2\7\33\2\2\u01b2\u01b4\5"+
		"\34\17\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01be\3\2\2\2\u01b5"+
		"\u01b6\7\24\2\2\u01b6\u01b7\7\64\2\2\u01b7\u01b8\7.\2\2\u01b8\u01bb\5"+
		"\60\31\2\u01b9\u01ba\7\33\2\2\u01ba\u01bc\5\34\17\2\u01bb\u01b9\3\2\2"+
		"\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01ad\3\2\2\2\u01bd\u01b5"+
		"\3\2\2\2\u01be\35\3\2\2\2\u01bf\u01c1\5\b\5\2\u01c0\u01c2\7(\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\5\36\20\2\u01c6\u01d3\3\2\2\2\u01c7"+
		"\u01c9\5\6\4\2\u01c8\u01ca\7(\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\5\36\20\2\u01ce\u01d3\3\2\2\2\u01cf\u01d3\5 \21\2\u01d0\u01d3\5"+
		"\b\5\2\u01d1\u01d3\5\6\4\2\u01d2\u01bf\3\2\2\2\u01d2\u01c7\3\2\2\2\u01d2"+
		"\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\37\3\2\2"+
		"\2\u01d4\u01d6\5\b\5\2\u01d5\u01d7\7(\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\5 \21\2\u01db\u01e7\3\2\2\2\u01dc\u01de\5\"\22\2\u01dd\u01df\7"+
		"(\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\5 \21\2\u01e3\u01e7\3\2"+
		"\2\2\u01e4\u01e7\5\"\22\2\u01e5\u01e7\5\b\5\2\u01e6\u01d4\3\2\2\2\u01e6"+
		"\u01dc\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7!\3\2\2\2"+
		"\u01e8\u01ee\5$\23\2\u01e9\u01ee\5*\26\2\u01ea\u01ee\5.\30\2\u01eb\u01ee"+
		"\5\60\31\2\u01ec\u01ee\5:\36\2\u01ed\u01e8\3\2\2\2\u01ed\u01e9\3\2\2\2"+
		"\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee#\3"+
		"\2\2\2\u01ef\u01f0\7\t\2\2\u01f0\u01f2\5\60\31\2\u01f1\u01f3\7(\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\5\"\22\2\u01f7\u01f9\7(\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01ff\5&\24\2\u01fd\u01ff\5(\25\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0242\3\2\2\2\u0200\u0201\7\t"+
		"\2\2\u0201\u0205\5\60\31\2\u0202\u0204\7(\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0208\u020a\7#\2\2\u0209\u020b\7(\2\2\u020a\u0209"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u0210\5 \21\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0212\3\2\2\2\u0211\u0213\7(\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0218\7$\2\2\u0217\u0219\7(\2\2\u0218\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021f\5&\24\2\u021d\u021f\5(\25\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2"+
		"\2\2\u021f\u0242\3\2\2\2\u0220\u0221\7\t\2\2\u0221\u0223\5\60\31\2\u0222"+
		"\u0224\7(\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\5\"\22\2\u0228"+
		"\u0242\3\2\2\2\u0229\u022a\7\t\2\2\u022a\u022e\5\60\31\2\u022b\u022d\7"+
		"(\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\7#"+
		"\2\2\u0232\u0234\7(\2\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\5 "+
		"\21\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u023c\7(\2\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7$\2\2\u0240"+
		"\u0242\3\2\2\2\u0241\u01ef\3\2\2\2\u0241\u0200\3\2\2\2\u0241\u0220\3\2"+
		"\2\2\u0241\u0229\3\2\2\2\u0242%\3\2\2\2\u0243\u0245\7\n\2\2\u0244\u0246"+
		"\7(\2\2\u0245\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0261\5\"\22\2\u024a\u024e\7"+
		"\n\2\2\u024b\u024d\7(\2\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0251\u0253\7#\2\2\u0252\u0254\7(\2\2\u0253\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257"+
		"\u0259\5 \21\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2"+
		"\2\2\u025a\u025c\7(\2\2\u025b\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\7$"+
		"\2\2\u0260\u0243\3\2\2\2\u0260\u024a\3\2\2\2\u0261\'\3\2\2\2\u0262\u0263"+
		"\7\13\2\2\u0263\u0265\5\60\31\2\u0264\u0266\7(\2\2\u0265\u0264\3\2\2\2"+
		"\u0266\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269"+
		"\3\2\2\2\u0269\u026b\5\"\22\2\u026a\u026c\7(\2\2\u026b\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271\3\2"+
		"\2\2\u026f\u0272\5&\24\2\u0270\u0272\5(\25\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0270\3\2\2\2\u0272\u02b5\3\2\2\2\u0273\u0274\7\13\2\2\u0274\u0278\5"+
		"\60\31\2\u0275\u0277\7(\2\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2"+
		"\2\2\u027b\u027d\7#\2\2\u027c\u027e\7(\2\2\u027d\u027c\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281"+
		"\u0283\5 \21\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2"+
		"\2\2\u0284\u0286\7(\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\7$"+
		"\2\2\u028a\u028c\7(\2\2\u028b\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u0292\5&"+
		"\24\2\u0290\u0292\5(\25\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292"+
		"\u02b5\3\2\2\2\u0293\u0294\7\13\2\2\u0294\u0296\5\60\31\2\u0295\u0297"+
		"\7(\2\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\5\"\22\2\u029b\u02b5\3"+
		"\2\2\2\u029c\u029d\7\13\2\2\u029d\u02a1\5\60\31\2\u029e\u02a0\7(\2\2\u029f"+
		"\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a6\7#\2\2\u02a5"+
		"\u02a7\7(\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02ac\5 \21\2\u02ab"+
		"\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02af\7("+
		"\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7$\2\2\u02b3\u02b5\3\2"+
		"\2\2\u02b4\u0262\3\2\2\2\u02b4\u0273\3\2\2\2\u02b4\u0293\3\2\2\2\u02b4"+
		"\u029c\3\2\2\2\u02b5)\3\2\2\2\u02b6\u02b9\5<\37\2\u02b7\u02b9\5\64\33"+
		"\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb"+
		"\7/\2\2\u02bb\u02bc\7\r\2\2\u02bc\u02bd\7\7\2\2\u02bd\u02be\7\35\2\2\u02be"+
		"\u02bf\5<\37\2\u02bf\u02c1\7\35\2\2\u02c0\u02c2\7(\2\2\u02c1\u02c0\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\5\"\22\2\u02c6\u02e8\3\2\2\2\u02c7\u02ca\5"+
		"<\37\2\u02c8\u02ca\5\64\33\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02cc\7/\2\2\u02cc\u02cd\7\r\2\2\u02cd\u02ce\7\7"+
		"\2\2\u02ce\u02cf\7\35\2\2\u02cf\u02d0\5<\37\2\u02d0\u02d4\7\35\2\2\u02d1"+
		"\u02d3\7(\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7"+
		"\u02de\7#\2\2\u02d8\u02da\7(\2\2\u02d9\u02d8\3\2\2\2\u02da\u02db\3\2\2"+
		"\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df"+
		"\5 \21\2\u02de\u02d9\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0"+
		"\u02e2\7(\2\2\u02e1\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\7$\2\2\u02e6"+
		"\u02e8\3\2\2\2\u02e7\u02b8\3\2\2\2\u02e7\u02c9\3\2\2\2\u02e8+\3\2\2\2"+
		"\u02e9\u02ea\5<\37\2\u02ea\u02eb\7.\2\2\u02eb\u02ec\5\60\31\2\u02ec\u0306"+
		"\3\2\2\2\u02ed\u02ee\5<\37\2\u02ee\u02ef\7.\2\2\u02ef\u02f0\5\66\34\2"+
		"\u02f0\u0306\3\2\2\2\u02f1\u02f2\5<\37\2\u02f2\u02f3\7\27\2\2\u02f3\u0306"+
		"\3\2\2\2\u02f4\u02f5\5<\37\2\u02f5\u02f6\7\30\2\2\u02f6\u0306\3\2\2\2"+
		"\u02f7\u02f8\5<\37\2\u02f8\u02f9\7.\2\2\u02f9\u02fa\5\60\31\2\u02fa\u0306"+
		"\3\2\2\2\u02fb\u02fc\5<\37\2\u02fc\u02fd\7.\2\2\u02fd\u02fe\5\66\34\2"+
		"\u02fe\u0306\3\2\2\2\u02ff\u0300\5<\37\2\u0300\u0301\7\27\2\2\u0301\u0306"+
		"\3\2\2\2\u0302\u0303\5<\37\2\u0303\u0304\7\30\2\2\u0304\u0306\3\2\2\2"+
		"\u0305\u02e9\3\2\2\2\u0305\u02ed\3\2\2\2\u0305\u02f1\3\2\2\2\u0305\u02f4"+
		"\3\2\2\2\u0305\u02f7\3\2\2\2\u0305\u02fb\3\2\2\2\u0305\u02ff\3\2\2\2\u0305"+
		"\u0302\3\2\2\2\u0306-\3\2\2\2\u0307\u0308\7\6\2\2\u0308\u0309\7%\2\2\u0309"+
		"\u030a\5\60\31\2\u030a\u030b\7&\2\2\u030b/\3\2\2\2\u030c\u030d\7%\2\2"+
		"\u030d\u030e\5\60\31\2\u030e\u030f\7&\2\2\u030f\u0310\5\62\32\2\u0310"+
		"\u031e\3\2\2\2\u0311\u0312\t\2\2\2\u0312\u0313\5\60\31\2\u0313\u0314\5"+
		"\62\32\2\u0314\u031e\3\2\2\2\u0315\u0316\t\3\2\2\u0316\u031e\5\62\32\2"+
		"\u0317\u0318\5<\37\2\u0318\u0319\5\62\32\2\u0319\u031e\3\2\2\2\u031a\u031b"+
		"\5,\27\2\u031b\u031c\5\62\32\2\u031c\u031e\3\2\2\2\u031d\u030c\3\2\2\2"+
		"\u031d\u0311\3\2\2\2\u031d\u0315\3\2\2\2\u031d\u0317\3\2\2\2\u031d\u031a"+
		"\3\2\2\2\u031e\61\3\2\2\2\u031f\u0320\t\4\2\2\u0320\u0341\5\62\32\2\u0321"+
		"\u0322\t\5\2\2\u0322\u0323\5\60\31\2\u0323\u0324\5\62\32\2\u0324\u0341"+
		"\3\2\2\2\u0325\u0326\t\6\2\2\u0326\u0327\5\60\31\2\u0327\u0328\5\62\32"+
		"\2\u0328\u0341\3\2\2\2\u0329\u032a\t\7\2\2\u032a\u032b\5\60\31\2\u032b"+
		"\u032c\5\62\32\2\u032c\u0341\3\2\2\2\u032d\u032e\7-\2\2\u032e\u032f\5"+
		"\60\31\2\u032f\u0330\5\62\32\2\u0330\u0341\3\2\2\2\u0331\u0332\7\65\2"+
		"\2\u0332\u0333\5\60\31\2\u0333\u0334\5\62\32\2\u0334\u0341\3\2\2\2\u0335"+
		"\u0336\7\66\2\2\u0336\u0337\5\60\31\2\u0337\u0338\5\62\32\2\u0338\u0341"+
		"\3\2\2\2\u0339\u033a\7\31\2\2\u033a\u033b\5\"\22\2\u033b\u033c\7\32\2"+
		"\2\u033c\u033d\5\"\22\2\u033d\u033e\5\62\32\2\u033e\u0341\3\2\2\2\u033f"+
		"\u0341\3\2\2\2\u0340\u031f\3\2\2\2\u0340\u0321\3\2\2\2\u0340\u0325\3\2"+
		"\2\2\u0340\u0329\3\2\2\2\u0340\u032d\3\2\2\2\u0340\u0331\3\2\2\2\u0340"+
		"\u0335\3\2\2\2\u0340\u0339\3\2\2\2\u0340\u033f\3\2\2\2\u0341\63\3\2\2"+
		"\2\u0342\u0343\7%\2\2\u0343\u0344\5\60\31\2\u0344\u0345\7/\2\2\u0345\u0346"+
		"\7/\2\2\u0346\u0347\5\60\31\2\u0347\u0348\7&\2\2\u0348\65\3\2\2\2\u0349"+
		"\u034a\t\b\2\2\u034a\u034b\7/\2\2\u034b\u034c\7\17\2\2\u034c\u034e\7%"+
		"\2\2\u034d\u034f\58\35\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0351\7&\2\2\u0351\67\3\2\2\2\u0352\u0355\5\60\31"+
		"\2\u0353\u0354\7\33\2\2\u0354\u0356\58\35\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u03569\3\2\2\2\u0357\u0358\7\5\2\2\u0358\u0359\5\60\31"+
		"\2\u0359;\3\2\2\2\u035a\u035c\7\64\2\2\u035b\u035d\5> \2\u035c\u035b\3"+
		"\2\2\2\u035c\u035d\3\2\2\2\u035d\u036f\3\2\2\2\u035e\u0360\7\37\2\2\u035f"+
		"\u0361\5> \2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u036f\3\2\2"+
		"\2\u0362\u0363\7%\2\2\u0363\u0364\7\64\2\2\u0364\u0366\7&\2\2\u0365\u0367"+
		"\5> \2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u036f\3\2\2\2\u0368"+
		"\u0369\7%\2\2\u0369\u036a\7\37\2\2\u036a\u036c\7&\2\2\u036b\u036d\5> "+
		"\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u035a"+
		"\3\2\2\2\u036e\u035e\3\2\2\2\u036e\u0362\3\2\2\2\u036e\u0368\3\2\2\2\u036f"+
		"=\3\2\2\2\u0370\u0371\7\"\2\2\u0371\u0372\5\60\31\2\u0372\u0374\7!\2\2"+
		"\u0373\u0375\5> \2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u038e"+
		"\3\2\2\2\u0376\u0377\7/\2\2\u0377\u0379\7\64\2\2\u0378\u037a\5> \2\u0379"+
		"\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u038e\3\2\2\2\u037b\u037c\7/"+
		"\2\2\u037c\u037d\t\t\2\2\u037d\u037f\7%\2\2\u037e\u0380\58\35\2\u037f"+
		"\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\7&"+
		"\2\2\u0382\u0384\5> \2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u038e"+
		"\3\2\2\2\u0385\u0387\7%\2\2\u0386\u0388\58\35\2\u0387\u0386\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\7&\2\2\u038a\u038c\5> "+
		"\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u0370"+
		"\3\2\2\2\u038d\u0376\3\2\2\2\u038d\u037b\3\2\2\2\u038d\u0385\3\2\2\2\u038e"+
		"?\3\2\2\2\u038f\u0390\7%\2\2\u0390\u0391\5@!\2\u0391\u0392\7&\2\2\u0392"+
		"\u0393\5B\"\2\u0393\u039f\3\2\2\2\u0394\u0395\t\3\2\2\u0395\u039f\5B\""+
		"\2\u0396\u0397\7\23\2\2\u0397\u0398\5@!\2\u0398\u0399\5B\"\2\u0399\u039f"+
		"\3\2\2\2\u039a\u039b\7\34\2\2\u039b\u039c\5@!\2\u039c\u039d\5B\"\2\u039d"+
		"\u039f\3\2\2\2\u039e\u038f\3\2\2\2\u039e\u0394\3\2\2\2\u039e\u0396\3\2"+
		"\2\2\u039e\u039a\3\2\2\2\u039fA\3\2\2\2\u03a0\u03a1\7\27\2\2\u03a1\u03c0"+
		"\5B\"\2\u03a2\u03a3\7\30\2\2\u03a3\u03c0\5B\"\2\u03a4\u03a5\t\5\2\2\u03a5"+
		"\u03a6\5@!\2\u03a6\u03a7\5B\"\2\u03a7\u03c0\3\2\2\2\u03a8\u03a9\t\6\2"+
		"\2\u03a9\u03aa\5@!\2\u03aa\u03ab\5B\"\2\u03ab\u03c0\3\2\2\2\u03ac\u03ad"+
		"\t\7\2\2\u03ad\u03ae\5@!\2\u03ae\u03af\5B\"\2\u03af\u03c0\3\2\2\2\u03b0"+
		"\u03b1\7-\2\2\u03b1\u03b2\5@!\2\u03b2\u03b3\5B\"\2\u03b3\u03c0\3\2\2\2"+
		"\u03b4\u03b5\7\65\2\2\u03b5\u03b6\5@!\2\u03b6\u03b7\5B\"\2\u03b7\u03c0"+
		"\3\2\2\2\u03b8\u03b9\7\31\2\2\u03b9\u03ba\5@!\2\u03ba\u03bb\7\32\2\2\u03bb"+
		"\u03bc\5@!\2\u03bc\u03bd\5B\"\2\u03bd\u03c0\3\2\2\2\u03be\u03c0\3\2\2"+
		"\2\u03bf\u03a0\3\2\2\2\u03bf\u03a2\3\2\2\2\u03bf\u03a4\3\2\2\2\u03bf\u03a8"+
		"\3\2\2\2\u03bf\u03ac\3\2\2\2\u03bf\u03b0\3\2\2\2\u03bf\u03b4\3\2\2\2\u03bf"+
		"\u03b8\3\2\2\2\u03bf\u03be\3\2\2\2\u03c0C\3\2\2\2\u0082EHPX`gnu}\u0085"+
		"\u008c\u0093\u0098\u009e\u00a1\u00a7\u00ac\u00b3\u00b6\u00bb\u00c2\u00c7"+
		"\u00d1\u00d3\u00d9\u00e1\u00e8\u00ee\u00fd\u0106\u010a\u0113\u011b\u0124"+
		"\u012c\u0134\u013d\u0143\u0149\u0150\u0153\u0158\u0160\u0168\u016f\u0177"+
		"\u017c\u0182\u0189\u018c\u0191\u019a\u01a2\u01a8\u01ab\u01b3\u01bb\u01bd"+
		"\u01c3\u01cb\u01d2\u01d8\u01e0\u01e6\u01ed\u01f4\u01fa\u01fe\u0205\u020c"+
		"\u020f\u0214\u021a\u021e\u0225\u022e\u0235\u0238\u023d\u0241\u0247\u024e"+
		"\u0255\u0258\u025d\u0260\u0267\u026d\u0271\u0278\u027f\u0282\u0287\u028d"+
		"\u0291\u0298\u02a1\u02a8\u02ab\u02b0\u02b4\u02b8\u02c3\u02c9\u02d4\u02db"+
		"\u02de\u02e3\u02e7\u0305\u031d\u0340\u034e\u0355\u035c\u0360\u0366\u036c"+
		"\u036e\u0374\u0379\u037f\u0383\u0387\u038b\u038d\u039e\u03bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}