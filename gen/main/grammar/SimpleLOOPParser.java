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
			((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
			System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
				}
				}
				setState(135);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(SHARP_SIGN);
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						matchWildcard();
						}
						} 
					}
					setState(142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case BEGIN_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(BEGIN_COMMENT);
				setState(145); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(144);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(147); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						matchWildcard();
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					match(NEW_LINE);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(160);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(CLASS);
				setState(164);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(166);
					match(LT);
					setState(167);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(171);
					match(NEW_LINE);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(LCURL);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
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
					begin_class();
					}
					break;
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					match(NEW_LINE);
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(191);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(CLASS);
				setState(193);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(195);
					match(LT);
					setState(196);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(200);
					match(NEW_LINE);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(206);
					comment();
					}
					break;
				case 2:
					{
					setState(207);
					match(ACCESS_TYPE);
					setState(208);
					var_dec();
					}
					break;
				case 3:
					{
					setState(209);
					match(ACCESS_TYPE);
					setState(210);
					init_dec();
					}
					break;
				case 4:
					{
					setState(211);
					match(ACCESS_TYPE);
					setState(212);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				class_dec();
				setState(219); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(218);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(221); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(223);
				prog_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				comment();
				setState(227); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(229); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(231);
				prog_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(233);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(236); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(238);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				class_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
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
			setState(244);
			match(SET);
			setState(245);
			match(LT);
			setState(246);
			match(INT);
			setState(247);
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
			setState(249);
			match(FPTR);
			setState(250);
			match(LT);
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(251);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(252);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(253);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(254);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(255);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(256);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(260);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(261);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(262);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(263);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(264);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(265);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(ARROW);
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(274);
				match(VOID);
				}
				break;
			case INT:
				{
				setState(275);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(276);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(277);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(278);
				set_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
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
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				comment();
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(284);
					match(NEW_LINE);
					}
					}
					setState(287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(289);
				begin_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(ACCESS_TYPE);
				setState(292);
				var_dec();
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(293);
					match(NEW_LINE);
					}
					}
					setState(296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(298);
				begin_class();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				init_dec();
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(301);
					match(NEW_LINE);
					}
					}
					setState(304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(306);
				begin_class();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				func_dec();
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(309);
					match(NEW_LINE);
					}
					}
					setState(312); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(314);
				begin_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				match(ACCESS_TYPE);
				setState(318);
				var_dec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(319);
				init_dec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
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
			setState(323);
			match(ACCESS_TYPE);
			setState(324);
			match(INIT);
			setState(325);
			match(LPAR);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
				{
				setState(326);
				argumants();
				}
			}

			setState(329);
			match(RPAR);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(330);
				match(NEW_LINE);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(LCURL);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(337);
					match(NEW_LINE);
					}
					}
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(342);
				init_begin();
				}
				break;
			}
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				match(NEW_LINE);
				}
				}
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINE );
			setState(350);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				comment();
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(353);
					match(NEW_LINE);
					}
					}
					setState(356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(358);
				init_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				var_dec();
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(361);
					match(NEW_LINE);
					}
					}
					setState(364); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(366);
				init_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
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
		enterRule(_localctx, 22, RULE_func_dec);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(ACCESS_TYPE);
				setState(379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(374);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(375);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(376);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(377);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(378);
					match(CAP_NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(381);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(383);
				match(LPAR);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(384);
					argumants();
					}
				}

				setState(387);
				match(RPAR);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(388);
					match(NEW_LINE);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(LCURL);
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(396); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(395);
						match(NEW_LINE);
						}
						}
						setState(398); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(400);
					func_begin();
					}
					break;
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(403);
					match(NEW_LINE);
					}
					}
					setState(406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(408);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(ACCESS_TYPE);
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(410);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(411);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(412);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(413);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(414);
					match(CAP_NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(417);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(419);
				match(LPAR);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(420);
					argumants();
					}
				}

				setState(423);
				match(RPAR);
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(424);
					match(NEW_LINE);
					}
					}
					setState(427); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(429);
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
		enterRule(_localctx, 24, RULE_argumants);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(432);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(433);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(434);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(435);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(436);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(439);
					match(LBRACK);
					setState(440);
					expr();
					setState(441);
					match(RBRACK);
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				((ArgumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("ArgumentDec : " + (((ArgumantsContext)_localctx).SMALL_NAME!=null?((ArgumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(450);
					match(COMMA);
					setState(451);
					argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
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
		enterRule(_localctx, 26, RULE_default_argumants);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(INT);
				setState(458);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(459);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(461);
				expr();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(462);
					match(COMMA);
					setState(463);
					default_argumants();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(BOOL);
				setState(467);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(468);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(470);
				expr();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(471);
					match(COMMA);
					setState(472);
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
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				comment();
				setState(479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(478);
					match(NEW_LINE);
					}
					}
					setState(481); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(483);
				func_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				var_dec();
				setState(487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(486);
					match(NEW_LINE);
					}
					}
					setState(489); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(491);
				func_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				scop_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
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
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				comment();
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(499);
					match(NEW_LINE);
					}
					}
					setState(502); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(504);
				scop_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				line_command();
				setState(508); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(507);
					match(NEW_LINE);
					}
					}
					setState(510); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(512);
				scop_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
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
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				if_state();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(522);
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
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(527);
				expr();
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(528);
					match(NEW_LINE);
					}
					}
					setState(531); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(533);
				line_command();
				setState(535); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(534);
					match(NEW_LINE);
					}
					}
					setState(537); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(541);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(539);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(540);
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
				setState(543);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(545);
				expr();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(546);
					match(NEW_LINE);
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				match(LCURL);
				setState(554); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(553);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(556); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(558);
					scop_body();
					}
				}

				setState(562); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(561);
					match(NEW_LINE);
					}
					}
					setState(564); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(566);
				match(RCURL);
				setState(568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(567);
					match(NEW_LINE);
					}
					}
					setState(570); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(574);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(572);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(573);
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
				setState(576);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(578);
				expr();
				setState(580); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(579);
					match(NEW_LINE);
					}
					}
					setState(582); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(584);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(588);
				expr();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(589);
					match(NEW_LINE);
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(LCURL);
				setState(597); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(596);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(599); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(601);
					scop_body();
					}
				}

				setState(605); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(604);
					match(NEW_LINE);
					}
					}
					setState(607); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(609);
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
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(615);
					match(NEW_LINE);
					}
					}
					setState(618); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(620);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(623);
					match(NEW_LINE);
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
				match(LCURL);
				setState(631); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(630);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(633); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(635);
					scop_body();
					}
				}

				setState(639); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(638);
					match(NEW_LINE);
					}
					}
					setState(641); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(643);
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
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(648);
				expr();
				setState(650); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(649);
					match(NEW_LINE);
					}
					}
					setState(652); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(654);
				line_command();
				setState(656); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(655);
					match(NEW_LINE);
					}
					}
					setState(658); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(662);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(660);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(661);
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
				setState(664);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(666);
				expr();
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(667);
					match(NEW_LINE);
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
				match(LCURL);
				setState(675); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(674);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(677); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(679);
					scop_body();
					}
				}

				setState(683); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(682);
					match(NEW_LINE);
					}
					}
					setState(685); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(687);
				match(RCURL);
				setState(689); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(688);
					match(NEW_LINE);
					}
					}
					setState(691); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(695);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(693);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(694);
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
				setState(697);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(699);
				expr();
				setState(701); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(700);
					match(NEW_LINE);
					}
					}
					setState(703); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(705);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(707);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(709);
				expr();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(710);
					match(NEW_LINE);
					}
					}
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(716);
				match(LCURL);
				setState(718); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(717);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(720); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(722);
					scop_body();
					}
				}

				setState(726); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(725);
					match(NEW_LINE);
					}
					}
					setState(728); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(730);
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
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(734);
					var();
					}
					break;
				case 2:
					{
					setState(735);
					sequence();
					}
					break;
				}
				setState(738);
				match(DOT);
				setState(739);
				match(EACH);
				setState(740);
				match(DO);
				setState(741);
				match(ABS_SIGN);
				setState(742);
				var();
				setState(743);
				match(ABS_SIGN);
				setState(745); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(744);
					match(NEW_LINE);
					}
					}
					setState(747); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				System.out.println("Loop : " + "each");
				setState(750);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(752);
					var();
					}
					break;
				case 2:
					{
					setState(753);
					sequence();
					}
					break;
				}
				setState(756);
				match(DOT);
				setState(757);
				match(EACH);
				setState(758);
				match(DO);
				setState(759);
				match(ABS_SIGN);
				setState(760);
				var();
				setState(761);
				match(ABS_SIGN);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(762);
					match(NEW_LINE);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("Loop : " + "each");
				setState(769);
				match(LCURL);
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(771); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(770);
						match(NEW_LINE);
						}
						}
						setState(773); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(775);
					scop_body();
					}
					break;
				}
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
				setState(783);
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
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				var();
				setState(788);
				match(EQUAL);
				setState(789);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				var();
				setState(792);
				match(EQUAL);
				setState(793);
				my_new();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				var();
				System.out.println("Operator : " + "++");
				setState(797);
				match(PLUS_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(799);
				var();
				System.out.println("Operator : " + "--");
				setState(801);
				match(MINUS_MINUS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(803);
				var();
				setState(804);
				match(EQUAL);
				setState(805);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(807);
				var();
				setState(808);
				match(EQUAL);
				setState(809);
				my_new();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(811);
				var();
				System.out.println("Operator : " + "++");
				setState(813);
				match(PLUS_PLUS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(815);
				var();
				System.out.println("Operator : " + "--");
				setState(817);
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
			setState(821);
			match(PRINT);
			System.out.println("Built-in : " + "print");
			setState(823);
			match(LPAR);
			setState(824);
			expr();
			setState(825);
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
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode NUM() { return getToken(SimpleLOOPParser.NUM, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(SimpleLOOPParser.BOOL_VALUE, 0); }
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
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				assigment();
				setState(828);
				expr_prime();
				System.out.println("Operator : " + "=");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				var();
				setState(832);
				expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				String sv_token;
				setState(839);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(835);
					match(MINUS);
					sv_token = "Operator : " + "-";
					}
					break;
				case NOT:
					{
					setState(837);
					match(NOT);
					sv_token = "Operator : " + "!";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(841);
				expr();
				setState(842);
				expr_prime();
				System.out.println(sv_token);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				match(LPAR);
				setState(846);
				expr();
				setState(847);
				match(RPAR);
				setState(848);
				expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(850);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(851);
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
		public TerminalNode MINUS_MINUS() { return getToken(SimpleLOOPParser.MINUS_MINUS, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(SimpleLOOPParser.PLUS_PLUS, 0); }
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
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				match(QUESTION_MARK);
				setState(855);
				expr();
				setState(856);
				match(COLON);
				setState(857);
				expr();
				setState(858);
				expr_prime();
				System.out.println("Operator : " + "?:");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(OR_OR);
				setState(862);
				expr();
				setState(863);
				expr_prime();
				System.out.println("Operator : " + "||");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				match(AND_AND);
				setState(867);
				expr();
				setState(868);
				expr_prime();
				System.out.println("Operator : " + "&&");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(IS_EQUAL);
				setState(872);
				expr();
				setState(873);
				expr_prime();
				System.out.println("Operator : " + "==");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				String sv_token;
				setState(881);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(877);
					match(LT);
					sv_token = "Operator : " + "<";
					}
					break;
				case GT:
					{
					setState(879);
					match(GT);
					sv_token = "Operator : " + ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(883);
				expr();
				setState(884);
				expr_prime();
				System.out.println(sv_token);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				String sv_token;
				setState(892);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(888);
					match(MINUS);
					sv_token = "Operator : " + "-";
					}
					break;
				case PLUS:
					{
					setState(890);
					match(PLUS);
					sv_token = "Operator : " + "+";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(894);
				expr();
				setState(895);
				expr_prime();
				System.out.println(sv_token);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				String sv_token;
				setState(903);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIVIDE:
					{
					setState(899);
					match(DIVIDE);
					sv_token = "Operator : " + "/";
					}
					break;
				case TIMES:
					{
					setState(901);
					match(TIMES);
					sv_token = "Operator : " + "*";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(905);
				expr();
				setState(906);
				expr_prime();
				System.out.println(sv_token);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				String sv_token;
				setState(914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS_MINUS:
					{
					setState(910);
					match(MINUS_MINUS);
					sv_token = "Operator : " + "--";
					}
					break;
				case PLUS_PLUS:
					{
					setState(912);
					match(PLUS_PLUS);
					sv_token = "Operator : " + "++";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(916);
				expr_prime();
				System.out.println(sv_token);
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
			setState(922);
			match(LPAR);
			setState(923);
			expr();
			setState(924);
			match(DOT);
			setState(925);
			match(DOT);
			setState(926);
			expr();
			setState(927);
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
			setState(929);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==CAP_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(930);
			match(DOT);
			setState(931);
			match(NEW_WORD);
			setState(932);
			match(LPAR);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
				{
				setState(933);
				func_input();
				}
			}

			setState(936);
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
			setState(938);
			expr();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(939);
				match(COMMA);
				setState(940);
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
			setState(943);
			match(RETURN);
			System.out.println("Return");
			setState(945);
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
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(SMALL_NAME);
				setState(949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(948);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(SELF_SMALL_NAME);
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(952);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				match(LPAR);
				setState(956);
				match(SMALL_NAME);
				setState(957);
				match(RPAR);
				setState(959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(958);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(961);
				match(LPAR);
				setState(962);
				match(SELF_SMALL_NAME);
				setState(963);
				match(RPAR);
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(964);
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
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(969);
				match(LBRACK);
				setState(970);
				expr();
				setState(971);
				match(RBRACK);
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(972);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(DOT);
				setState(976);
				match(SMALL_NAME);
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(977);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				match(DOT);
				setState(981);
				_la = _input.LA(1);
				if ( !(_la==INIT || _la==SMALL_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(982);
				match(LPAR);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(983);
					func_input();
					}
				}

				setState(986);
				match(RPAR);
				setState(988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(987);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990);
				match(LPAR);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << MINUS) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LPAR) | (1L << NUM) | (1L << SMALL_NAME))) != 0)) {
					{
					setState(991);
					func_input();
					}
				}

				setState(994);
				match(RPAR);
				setState(996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(995);
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
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				match(LPAR);
				setState(1001);
				const_expr();
				setState(1002);
				match(RPAR);
				setState(1003);
				const_expr_prime();
				}
				break;
			case BOOL_VALUE:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1006);
				const_expr_prime();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(MINUS);
				setState(1008);
				const_expr();
				setState(1009);
				const_expr_prime();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1011);
				match(NOT);
				setState(1012);
				const_expr();
				setState(1013);
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
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				match(PLUS_PLUS);
				setState(1018);
				const_expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(MINUS_MINUS);
				setState(1020);
				const_expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1021);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1022);
				const_expr();
				setState(1023);
				const_expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1025);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1026);
				const_expr();
				setState(1027);
				const_expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1029);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1030);
				const_expr();
				setState(1031);
				const_expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1033);
				match(IS_EQUAL);
				setState(1034);
				const_expr();
				setState(1035);
				const_expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1037);
				match(AND_AND);
				setState(1038);
				const_expr();
				setState(1039);
				const_expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1041);
				match(QUESTION_MARK);
				setState(1042);
				const_expr();
				setState(1043);
				match(COLON);
				setState(1044);
				const_expr();
				setState(1045);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u041d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\5\2I\n\2\3\2\3\2\3\3\3\3\6\3O\n\3\r\3\16"+
		"\3P\3\3\3\3\3\3\3\3\6\3W\n\3\r\3\16\3X\3\3\3\3\3\3\3\3\6\3_\n\3\r\3\16"+
		"\3`\3\3\3\3\3\3\6\3f\n\3\r\3\16\3g\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4v\n\4\3\4\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u0086\n\4\f\4\16\4\u0089\13\4\3\5\3\5\7\5\u008d\n"+
		"\5\f\5\16\5\u0090\13\5\3\5\3\5\6\5\u0094\n\5\r\5\16\5\u0095\3\5\7\5\u0099"+
		"\n\5\f\5\16\5\u009c\13\5\3\5\6\5\u009f\n\5\r\5\16\5\u00a0\3\5\5\5\u00a4"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\7\6\u00af\n\6\f\6\16\6"+
		"\u00b2\13\6\3\6\3\6\6\6\u00b6\n\6\r\6\16\6\u00b7\3\6\5\6\u00bb\n\6\3\6"+
		"\6\6\u00be\n\6\r\6\16\6\u00bf\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c9\n"+
		"\6\3\6\7\6\u00cc\n\6\f\6\16\6\u00cf\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00d8\n\6\5\6\u00da\n\6\3\7\3\7\6\7\u00de\n\7\r\7\16\7\u00df\3\7\3"+
		"\7\3\7\3\7\6\7\u00e6\n\7\r\7\16\7\u00e7\3\7\3\7\3\7\6\7\u00ed\n\7\r\7"+
		"\16\7\u00ee\3\7\3\7\3\7\3\7\5\7\u00f5\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0104\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u010d\n\t\7\t\u010f\n\t\f\t\16\t\u0112\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u011a\n\t\3\t\3\t\3\n\3\n\6\n\u0120\n\n\r\n\16\n\u0121\3\n\3\n\3\n"+
		"\3\n\3\n\6\n\u0129\n\n\r\n\16\n\u012a\3\n\3\n\3\n\3\n\6\n\u0131\n\n\r"+
		"\n\16\n\u0132\3\n\3\n\3\n\3\n\6\n\u0139\n\n\r\n\16\n\u013a\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0144\n\n\3\13\3\13\3\13\3\13\5\13\u014a\n\13\3\13"+
		"\3\13\7\13\u014e\n\13\f\13\16\13\u0151\13\13\3\13\3\13\6\13\u0155\n\13"+
		"\r\13\16\13\u0156\3\13\5\13\u015a\n\13\3\13\6\13\u015d\n\13\r\13\16\13"+
		"\u015e\3\13\3\13\3\f\3\f\6\f\u0165\n\f\r\f\16\f\u0166\3\f\3\f\3\f\3\f"+
		"\6\f\u016d\n\f\r\f\16\f\u016e\3\f\3\f\3\f\3\f\3\f\5\f\u0176\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u017e\n\r\3\r\3\r\3\r\3\r\5\r\u0184\n\r\3\r\3\r"+
		"\7\r\u0188\n\r\f\r\16\r\u018b\13\r\3\r\3\r\6\r\u018f\n\r\r\r\16\r\u0190"+
		"\3\r\5\r\u0194\n\r\3\r\6\r\u0197\n\r\r\r\16\r\u0198\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u01a2\n\r\3\r\3\r\3\r\3\r\5\r\u01a8\n\r\3\r\3\r\6\r\u01ac"+
		"\n\r\r\r\16\r\u01ad\3\r\5\r\u01b1\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u01b8"+
		"\n\16\3\16\3\16\3\16\3\16\7\16\u01be\n\16\f\16\16\16\u01c1\13\16\3\16"+
		"\3\16\3\16\3\16\5\16\u01c7\n\16\3\16\5\16\u01ca\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u01d3\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01dc\n\17\5\17\u01de\n\17\3\20\3\20\6\20\u01e2\n\20\r\20\16\20"+
		"\u01e3\3\20\3\20\3\20\3\20\6\20\u01ea\n\20\r\20\16\20\u01eb\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u01f3\n\20\3\21\3\21\6\21\u01f7\n\21\r\21\16\21\u01f8"+
		"\3\21\3\21\3\21\3\21\6\21\u01ff\n\21\r\21\16\21\u0200\3\21\3\21\3\21\3"+
		"\21\5\21\u0207\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u020e\n\22\3\23\3\23"+
		"\3\23\3\23\6\23\u0214\n\23\r\23\16\23\u0215\3\23\3\23\6\23\u021a\n\23"+
		"\r\23\16\23\u021b\3\23\3\23\5\23\u0220\n\23\3\23\3\23\3\23\3\23\7\23\u0226"+
		"\n\23\f\23\16\23\u0229\13\23\3\23\3\23\6\23\u022d\n\23\r\23\16\23\u022e"+
		"\3\23\5\23\u0232\n\23\3\23\6\23\u0235\n\23\r\23\16\23\u0236\3\23\3\23"+
		"\6\23\u023b\n\23\r\23\16\23\u023c\3\23\3\23\5\23\u0241\n\23\3\23\3\23"+
		"\3\23\3\23\6\23\u0247\n\23\r\23\16\23\u0248\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u0251\n\23\f\23\16\23\u0254\13\23\3\23\3\23\6\23\u0258\n\23\r"+
		"\23\16\23\u0259\3\23\5\23\u025d\n\23\3\23\6\23\u0260\n\23\r\23\16\23\u0261"+
		"\3\23\3\23\5\23\u0266\n\23\3\24\3\24\3\24\6\24\u026b\n\24\r\24\16\24\u026c"+
		"\3\24\3\24\3\24\3\24\7\24\u0273\n\24\f\24\16\24\u0276\13\24\3\24\3\24"+
		"\6\24\u027a\n\24\r\24\16\24\u027b\3\24\5\24\u027f\n\24\3\24\6\24\u0282"+
		"\n\24\r\24\16\24\u0283\3\24\5\24\u0287\n\24\3\25\3\25\3\25\3\25\6\25\u028d"+
		"\n\25\r\25\16\25\u028e\3\25\3\25\6\25\u0293\n\25\r\25\16\25\u0294\3\25"+
		"\3\25\5\25\u0299\n\25\3\25\3\25\3\25\3\25\7\25\u029f\n\25\f\25\16\25\u02a2"+
		"\13\25\3\25\3\25\6\25\u02a6\n\25\r\25\16\25\u02a7\3\25\5\25\u02ab\n\25"+
		"\3\25\6\25\u02ae\n\25\r\25\16\25\u02af\3\25\3\25\6\25\u02b4\n\25\r\25"+
		"\16\25\u02b5\3\25\3\25\5\25\u02ba\n\25\3\25\3\25\3\25\3\25\6\25\u02c0"+
		"\n\25\r\25\16\25\u02c1\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u02ca\n\25\f"+
		"\25\16\25\u02cd\13\25\3\25\3\25\6\25\u02d1\n\25\r\25\16\25\u02d2\3\25"+
		"\5\25\u02d6\n\25\3\25\6\25\u02d9\n\25\r\25\16\25\u02da\3\25\3\25\5\25"+
		"\u02df\n\25\3\26\3\26\5\26\u02e3\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\6\26\u02ec\n\26\r\26\16\26\u02ed\3\26\3\26\3\26\3\26\3\26\5\26\u02f5"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u02fe\n\26\f\26\16\26\u0301"+
		"\13\26\3\26\3\26\3\26\6\26\u0306\n\26\r\26\16\26\u0307\3\26\5\26\u030b"+
		"\n\26\3\26\6\26\u030e\n\26\r\26\16\26\u030f\3\26\3\26\5\26\u0314\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0336\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u034a\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0357\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0374\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u037f\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u038a\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0395\n\32\3\32\3\32\3\32"+
		"\3\32\5\32\u039b\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u03a9\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u03b0\n\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\5\37\u03b8\n\37\3\37\3\37\5\37\u03bc\n\37"+
		"\3\37\3\37\3\37\3\37\5\37\u03c2\n\37\3\37\3\37\3\37\3\37\5\37\u03c8\n"+
		"\37\5\37\u03ca\n\37\3 \3 \3 \3 \5 \u03d0\n \3 \3 \3 \5 \u03d5\n \3 \3"+
		" \3 \3 \5 \u03db\n \3 \3 \5 \u03df\n \3 \3 \5 \u03e3\n \3 \3 \5 \u03e7"+
		"\n \5 \u03e9\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u03fa"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u041b\n"+
		"\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@B\2\b\4\2\b\b\63\63\3\2\61\62\4\2\f\f\64\64\3\2\20\21\3\2\22\23\3"+
		"\2+,\2\u04d9\2E\3\2\2\2\4n\3\2\2\2\6u\3\2\2\2\b\u00a3\3\2\2\2\n\u00d9"+
		"\3\2\2\2\f\u00f4\3\2\2\2\16\u00f6\3\2\2\2\20\u00fb\3\2\2\2\22\u0143\3"+
		"\2\2\2\24\u0145\3\2\2\2\26\u0175\3\2\2\2\30\u01b0\3\2\2\2\32\u01c9\3\2"+
		"\2\2\34\u01dd\3\2\2\2\36\u01f2\3\2\2\2 \u0206\3\2\2\2\"\u020d\3\2\2\2"+
		"$\u0265\3\2\2\2&\u0286\3\2\2\2(\u02de\3\2\2\2*\u0313\3\2\2\2,\u0335\3"+
		"\2\2\2.\u0337\3\2\2\2\60\u0356\3\2\2\2\62\u039a\3\2\2\2\64\u039c\3\2\2"+
		"\2\66\u03a3\3\2\2\28\u03ac\3\2\2\2:\u03b1\3\2\2\2<\u03c9\3\2\2\2>\u03e8"+
		"\3\2\2\2@\u03f9\3\2\2\2B\u041a\3\2\2\2DF\5\4\3\2ED\3\2\2\2EF\3\2\2\2F"+
		"H\3\2\2\2GI\7\3\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\2\2\3K\3\3\2\2\2"+
		"LN\5\6\4\2MO\7(\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2"+
		"RS\5\4\3\2So\3\2\2\2TV\5\b\5\2UW\7(\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2YZ\3\2\2\2Z[\5\4\3\2[o\3\2\2\2\\^\5\n\6\2]_\7(\2\2^]\3\2\2\2"+
		"_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\f\7\2co\3\2\2\2df\7(\2\2"+
		"ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2io\5\4\3\2jo\5\6\4\2"+
		"ko\5\b\5\2lo\5\n\6\2mo\3\2\2\2nL\3\2\2\2nT\3\2\2\2n\\\3\2\2\2ne\3\2\2"+
		"\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\5\3\2\2\2pv\7\16\2\2qv\7\24"+
		"\2\2rv\7\62\2\2sv\5\16\b\2tv\5\20\t\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us"+
		"\3\2\2\2ut\3\2\2\2v}\3\2\2\2wx\7\"\2\2xy\5\60\31\2yz\7!\2\2z|\3\2\2\2"+
		"{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\7\64\2\2\u0081\u0087\b\4\1\2\u0082\u0083\7\33\2\2\u0083"+
		"\u0084\7\64\2\2\u0084\u0086\b\4\1\2\u0085\u0082\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\7\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008e\7\60\2\2\u008b\u008d\13\2\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00a4"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7)\2\2\u0092\u0094\7(\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7(\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\7*\2\2\u00a3\u008a\3\2\2\2\u00a3\u0091\3\2\2\2\u00a4"+
		"\t\3\2\2\2\u00a5\u00a6\7\36\2\2\u00a6\u00a7\7\62\2\2\u00a7\u00ab\b\6\1"+
		"\2\u00a8\u00a9\7+\2\2\u00a9\u00aa\7\62\2\2\u00aa\u00ac\b\6\1\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\7(\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00ba\7#\2\2\u00b4"+
		"\u00b6\7(\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\5\22\n\2\u00ba"+
		"\u00b5\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\7("+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00da\7$\2\2\u00c2\u00c3\7\36"+
		"\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c8\b\6\1\2\u00c5\u00c6\7+\2\2\u00c6"+
		"\u00c7\7\62\2\2\u00c7\u00c9\b\6\1\2\u00c8\u00c5\3\2\2\2\u00c8\u00c9\3"+
		"\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\7(\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d7\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d8\5\b\5\2\u00d1\u00d2\7 \2\2\u00d2"+
		"\u00d8\5\6\4\2\u00d3\u00d4\7 \2\2\u00d4\u00d8\5\24\13\2\u00d5\u00d6\7"+
		" \2\2\u00d6\u00d8\5\30\r\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00a5\3\2"+
		"\2\2\u00d9\u00c2\3\2\2\2\u00da\13\3\2\2\2\u00db\u00dd\5\n\6\2\u00dc\u00de"+
		"\7(\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\5\f\7\2\u00e2\u00f5\3\2"+
		"\2\2\u00e3\u00e5\5\b\5\2\u00e4\u00e6\7(\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\5\f\7\2\u00ea\u00f5\3\2\2\2\u00eb\u00ed\7(\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f5\5\f\7\2\u00f1\u00f5\5\n\6\2\u00f2"+
		"\u00f5\5\b\5\2\u00f3\u00f5\3\2\2\2\u00f4\u00db\3\2\2\2\u00f4\u00e3\3\2"+
		"\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\r\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\7+\2\2"+
		"\u00f8\u00f9\7\16\2\2\u00f9\u00fa\7,\2\2\u00fa\17\3\2\2\2\u00fb\u00fc"+
		"\7\26\2\2\u00fc\u0103\7+\2\2\u00fd\u0104\7\25\2\2\u00fe\u0104\7\16\2\2"+
		"\u00ff\u0104\7\24\2\2\u0100\u0104\7\62\2\2\u0101\u0104\5\16\b\2\u0102"+
		"\u0104\5\20\t\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3"+
		"\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0110\3\2\2\2\u0105\u010c\7\33\2\2\u0106\u010d\7\25\2\2\u0107\u010d\7"+
		"\16\2\2\u0108\u010d\7\24\2\2\u0109\u010d\7\62\2\2\u010a\u010d\5\16\b\2"+
		"\u010b\u010d\5\20\t\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108"+
		"\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0105\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0119\7\'\2\2\u0114\u011a\7\25\2\2\u0115\u011a\7\16\2\2\u0116\u011a\7"+
		"\24\2\2\u0117\u011a\7\62\2\2\u0118\u011a\5\16\b\2\u0119\u0114\3\2\2\2"+
		"\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7,\2\2\u011c\21\3\2\2\2\u011d"+
		"\u011f\5\b\5\2\u011e\u0120\7(\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\5\22\n\2\u0124\u0144\3\2\2\2\u0125\u0126\7 \2\2\u0126\u0128\5\6"+
		"\4\2\u0127\u0129\7(\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5\22"+
		"\n\2\u012d\u0144\3\2\2\2\u012e\u0130\5\24\13\2\u012f\u0131\7(\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5\22\n\2\u0135\u0144\3\2\2\2\u0136"+
		"\u0138\5\30\r\2\u0137\u0139\7(\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\5\22\n\2\u013d\u0144\3\2\2\2\u013e\u0144\5\b\5\2\u013f\u0140\7"+
		" \2\2\u0140\u0144\5\6\4\2\u0141\u0144\5\24\13\2\u0142\u0144\5\30\r\2\u0143"+
		"\u011d\3\2\2\2\u0143\u0125\3\2\2\2\u0143\u012e\3\2\2\2\u0143\u0136\3\2"+
		"\2\2\u0143\u013e\3\2\2\2\u0143\u013f\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\23\3\2\2\2\u0145\u0146\7 \2\2\u0146\u0147\7\f\2\2"+
		"\u0147\u0149\7%\2\2\u0148\u014a\5\32\16\2\u0149\u0148\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f\7&\2\2\u014c\u014e\7(\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0159\7#\2\2\u0153"+
		"\u0155\7(\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\5\26\f\2\u0159"+
		"\u0154\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\7("+
		"\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7$\2\2\u0161\25\3\2\2\2"+
		"\u0162\u0164\5\b\5\2\u0163\u0165\7(\2\2\u0164\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\5\26\f\2\u0169\u0176\3\2\2\2\u016a\u016c\5\6\4\2\u016b\u016d\7"+
		"(\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5\26\f\2\u0171\u0176\3"+
		"\2\2\2\u0172\u0176\5 \21\2\u0173\u0176\5\b\5\2\u0174\u0176\5\6\4\2\u0175"+
		"\u0162\3\2\2\2\u0175\u016a\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0174\3\2\2\2\u0176\27\3\2\2\2\u0177\u017d\7 \2\2\u0178\u017e"+
		"\7\25\2\2\u0179\u017e\7\16\2\2\u017a\u017e\7\24\2\2\u017b\u017e\5\16\b"+
		"\2\u017c\u017e\7\62\2\2\u017d\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017d"+
		"\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0180\7\64\2\2\u0180\u0181\b\r\1\2\u0181\u0183\7%\2\2\u0182"+
		"\u0184\5\32\16\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3"+
		"\2\2\2\u0185\u0189\7&\2\2\u0186\u0188\7(\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u0193\7#\2\2\u018d\u018f\7(\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0194\5\36\20\2\u0193\u018e\3\2\2\2\u0193\u0194\3"+
		"\2\2\2\u0194\u0196\3\2\2\2\u0195\u0197\7(\2\2\u0196\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u01b1\7$\2\2\u019b\u01a1\7 \2\2\u019c\u01a2\7\25\2\2\u019d"+
		"\u01a2\7\16\2\2\u019e\u01a2\7\24\2\2\u019f\u01a2\5\16\b\2\u01a0\u01a2"+
		"\7\62\2\2\u01a1\u019c\3\2\2\2\u01a1\u019d\3\2\2\2\u01a1\u019e\3\2\2\2"+
		"\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4"+
		"\7\64\2\2\u01a4\u01a5\b\r\1\2\u01a5\u01a7\7%\2\2\u01a6\u01a8\5\32\16\2"+
		"\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab"+
		"\7&\2\2\u01aa\u01ac\7(\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\5\""+
		"\22\2\u01b0\u0177\3\2\2\2\u01b0\u019b\3\2\2\2\u01b1\31\3\2\2\2\u01b2\u01b8"+
		"\7\16\2\2\u01b3\u01b8\7\24\2\2\u01b4\u01b8\7\62\2\2\u01b5\u01b8\5\16\b"+
		"\2\u01b6\u01b8\5\20\t\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7"+
		"\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bf\3\2"+
		"\2\2\u01b9\u01ba\7\"\2\2\u01ba\u01bb\5\60\31\2\u01bb\u01bc\7!\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c3\7\64\2\2\u01c3\u01c6\b\16\1\2\u01c4\u01c5\7\33\2\2\u01c5\u01c7"+
		"\5\32\16\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2"+
		"\u01c8\u01ca\5\34\17\2\u01c9\u01b7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\33"+
		"\3\2\2\2\u01cb\u01cc\7\16\2\2\u01cc\u01cd\7\64\2\2\u01cd\u01ce\7.\2\2"+
		"\u01ce\u01cf\b\17\1\2\u01cf\u01d2\5\60\31\2\u01d0\u01d1\7\33\2\2\u01d1"+
		"\u01d3\5\34\17\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01de\3"+
		"\2\2\2\u01d4\u01d5\7\24\2\2\u01d5\u01d6\7\64\2\2\u01d6\u01d7\7.\2\2\u01d7"+
		"\u01d8\b\17\1\2\u01d8\u01db\5\60\31\2\u01d9\u01da\7\33\2\2\u01da\u01dc"+
		"\5\34\17\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2"+
		"\u01dd\u01cb\3\2\2\2\u01dd\u01d4\3\2\2\2\u01de\35\3\2\2\2\u01df\u01e1"+
		"\5\b\5\2\u01e0\u01e2\7(\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\5\36"+
		"\20\2\u01e6\u01f3\3\2\2\2\u01e7\u01e9\5\6\4\2\u01e8\u01ea\7(\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5\36\20\2\u01ee\u01f3\3\2\2\2\u01ef"+
		"\u01f3\5 \21\2\u01f0\u01f3\5\b\5\2\u01f1\u01f3\5\6\4\2\u01f2\u01df\3\2"+
		"\2\2\u01f2\u01e7\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\37\3\2\2\2\u01f4\u01f6\5\b\5\2\u01f5\u01f7\7(\2\2"+
		"\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5 \21\2\u01fb\u0207\3\2\2\2\u01fc"+
		"\u01fe\5\"\22\2\u01fd\u01ff\7(\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\5 \21\2\u0203\u0207\3\2\2\2\u0204\u0207\5\"\22\2\u0205\u0207\5"+
		"\b\5\2\u0206\u01f4\3\2\2\2\u0206\u01fc\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0205\3\2\2\2\u0207!\3\2\2\2\u0208\u020e\5$\23\2\u0209\u020e\5*\26\2"+
		"\u020a\u020e\5.\30\2\u020b\u020e\5\60\31\2\u020c\u020e\5:\36\2\u020d\u0208"+
		"\3\2\2\2\u020d\u0209\3\2\2\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020c\3\2\2\2\u020e#\3\2\2\2\u020f\u0210\7\t\2\2\u0210\u0211\b\23\1\2"+
		"\u0211\u0213\5\60\31\2\u0212\u0214\7(\2\2\u0213\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0219\5\"\22\2\u0218\u021a\7(\2\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u0220\5&\24\2\u021e\u0220\5(\25\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2"+
		"\2\2\u0220\u0266\3\2\2\2\u0221\u0222\7\t\2\2\u0222\u0223\b\23\1\2\u0223"+
		"\u0227\5\60\31\2\u0224\u0226\7(\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3"+
		"\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022c\7#\2\2\u022b\u022d\7(\2\2\u022c\u022b\3\2\2"+
		"\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231"+
		"\3\2\2\2\u0230\u0232\5 \21\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0234\3\2\2\2\u0233\u0235\7(\2\2\u0234\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u023a\7$\2\2\u0239\u023b\7(\2\2\u023a\u0239\3\2\2\2\u023b\u023c\3\2\2"+
		"\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u0241"+
		"\5&\24\2\u023f\u0241\5(\25\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241"+
		"\u0266\3\2\2\2\u0242\u0243\7\t\2\2\u0243\u0244\b\23\1\2\u0244\u0246\5"+
		"\60\31\2\u0245\u0247\7(\2\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\5\""+
		"\22\2\u024b\u0266\3\2\2\2\u024c\u024d\7\t\2\2\u024d\u024e\b\23\1\2\u024e"+
		"\u0252\5\60\31\2\u024f\u0251\7(\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3"+
		"\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0257\7#\2\2\u0256\u0258\7(\2\2\u0257\u0256\3\2\2"+
		"\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c"+
		"\3\2\2\2\u025b\u025d\5 \21\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\3\2\2\2\u025e\u0260\7(\2\2\u025f\u025e\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0264\7$\2\2\u0264\u0266\3\2\2\2\u0265\u020f\3\2\2\2\u0265\u0221\3\2"+
		"\2\2\u0265\u0242\3\2\2\2\u0265\u024c\3\2\2\2\u0266%\3\2\2\2\u0267\u0268"+
		"\7\n\2\2\u0268\u026a\b\24\1\2\u0269\u026b\7(\2\2\u026a\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u0287\5\"\22\2\u026f\u0270\7\n\2\2\u0270\u0274\b\24\1\2\u0271"+
		"\u0273\7(\2\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277"+
		"\u0279\7#\2\2\u0278\u027a\7(\2\2\u0279\u0278\3\2\2\2\u027a\u027b\3\2\2"+
		"\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f"+
		"\5 \21\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280"+
		"\u0282\7(\2\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\7$\2\2\u0286"+
		"\u0267\3\2\2\2\u0286\u026f\3\2\2\2\u0287\'\3\2\2\2\u0288\u0289\7\13\2"+
		"\2\u0289\u028a\b\25\1\2\u028a\u028c\5\60\31\2\u028b\u028d\7(\2\2\u028c"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290\u0292\5\"\22\2\u0291\u0293\7(\2\2\u0292"+
		"\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0298\3\2\2\2\u0296\u0299\5&\24\2\u0297\u0299\5(\25\2\u0298"+
		"\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u02df\3\2\2\2\u029a\u029b\7\13"+
		"\2\2\u029b\u029c\b\25\1\2\u029c\u02a0\5\60\31\2\u029d\u029f\7(\2\2\u029e"+
		"\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\7#\2\2\u02a4"+
		"\u02a6\7(\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2"+
		"\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02ab\5 \21\2\u02aa"+
		"\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02ae\7("+
		"\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02ad\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\7$\2\2\u02b2\u02b4\7(\2"+
		"\2\u02b3\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02ba\5&\24\2\u02b8\u02ba\5(\25\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02df\3\2\2\2\u02bb\u02bc\7\13"+
		"\2\2\u02bc\u02bd\b\25\1\2\u02bd\u02bf\5\60\31\2\u02be\u02c0\7(\2\2\u02bf"+
		"\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\5\"\22\2\u02c4\u02df\3\2\2\2\u02c5"+
		"\u02c6\7\13\2\2\u02c6\u02c7\b\25\1\2\u02c7\u02cb\5\60\31\2\u02c8\u02ca"+
		"\7(\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02d0\7#"+
		"\2\2\u02cf\u02d1\7(\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d6\5 "+
		"\21\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7"+
		"\u02d9\7(\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2"+
		"\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7$\2\2\u02dd"+
		"\u02df\3\2\2\2\u02de\u0288\3\2\2\2\u02de\u029a\3\2\2\2\u02de\u02bb\3\2"+
		"\2\2\u02de\u02c5\3\2\2\2\u02df)\3\2\2\2\u02e0\u02e3\5<\37\2\u02e1\u02e3"+
		"\5\64\33\2\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2"+
		"\u02e4\u02e5\7/\2\2\u02e5\u02e6\7\r\2\2\u02e6\u02e7\7\7\2\2\u02e7\u02e8"+
		"\7\35\2\2\u02e8\u02e9\5<\37\2\u02e9\u02eb\7\35\2\2\u02ea\u02ec\7(\2\2"+
		"\u02eb\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\b\26\1\2\u02f0\u02f1\5\"\22\2"+
		"\u02f1\u0314\3\2\2\2\u02f2\u02f5\5<\37\2\u02f3\u02f5\5\64\33\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\7/\2\2\u02f7"+
		"\u02f8\7\r\2\2\u02f8\u02f9\7\7\2\2\u02f9\u02fa\7\35\2\2\u02fa\u02fb\5"+
		"<\37\2\u02fb\u02ff\7\35\2\2\u02fc\u02fe\7(\2\2\u02fd\u02fc\3\2\2\2\u02fe"+
		"\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2"+
		"\2\2\u0301\u02ff\3\2\2\2\u0302\u0303\b\26\1\2\u0303\u030a\7#\2\2\u0304"+
		"\u0306\7(\2\2\u0305\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\5 \21\2\u030a"+
		"\u0305\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030e\7("+
		"\2\2\u030d\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u030d\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\7$\2\2\u0312\u0314\3\2"+
		"\2\2\u0313\u02e2\3\2\2\2\u0313\u02f4\3\2\2\2\u0314+\3\2\2\2\u0315\u0316"+
		"\5<\37\2\u0316\u0317\7.\2\2\u0317\u0318\5\60\31\2\u0318\u0336\3\2\2\2"+
		"\u0319\u031a\5<\37\2\u031a\u031b\7.\2\2\u031b\u031c\5\66\34\2\u031c\u0336"+
		"\3\2\2\2\u031d\u031e\5<\37\2\u031e\u031f\b\27\1\2\u031f\u0320\7\27\2\2"+
		"\u0320\u0336\3\2\2\2\u0321\u0322\5<\37\2\u0322\u0323\b\27\1\2\u0323\u0324"+
		"\7\30\2\2\u0324\u0336\3\2\2\2\u0325\u0326\5<\37\2\u0326\u0327\7.\2\2\u0327"+
		"\u0328\5\60\31\2\u0328\u0336\3\2\2\2\u0329\u032a\5<\37\2\u032a\u032b\7"+
		".\2\2\u032b\u032c\5\66\34\2\u032c\u0336\3\2\2\2\u032d\u032e\5<\37\2\u032e"+
		"\u032f\b\27\1\2\u032f\u0330\7\27\2\2\u0330\u0336\3\2\2\2\u0331\u0332\5"+
		"<\37\2\u0332\u0333\b\27\1\2\u0333\u0334\7\30\2\2\u0334\u0336\3\2\2\2\u0335"+
		"\u0315\3\2\2\2\u0335\u0319\3\2\2\2\u0335\u031d\3\2\2\2\u0335\u0321\3\2"+
		"\2\2\u0335\u0325\3\2\2\2\u0335\u0329\3\2\2\2\u0335\u032d\3\2\2\2\u0335"+
		"\u0331\3\2\2\2\u0336-\3\2\2\2\u0337\u0338\7\6\2\2\u0338\u0339\b\30\1\2"+
		"\u0339\u033a\7%\2\2\u033a\u033b\5\60\31\2\u033b\u033c\7&\2\2\u033c/\3"+
		"\2\2\2\u033d\u033e\5,\27\2\u033e\u033f\5\62\32\2\u033f\u0340\b\31\1\2"+
		"\u0340\u0357\3\2\2\2\u0341\u0342\5<\37\2\u0342\u0343\5\62\32\2\u0343\u0357"+
		"\3\2\2\2\u0344\u0349\b\31\1\2\u0345\u0346\7\23\2\2\u0346\u034a\b\31\1"+
		"\2\u0347\u0348\7\34\2\2\u0348\u034a\b\31\1\2\u0349\u0345\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\5\60\31\2\u034c\u034d\5"+
		"\62\32\2\u034d\u034e\b\31\1\2\u034e\u0357\3\2\2\2\u034f\u0350\7%\2\2\u0350"+
		"\u0351\5\60\31\2\u0351\u0352\7&\2\2\u0352\u0353\5\62\32\2\u0353\u0357"+
		"\3\2\2\2\u0354\u0355\t\2\2\2\u0355\u0357\5\62\32\2\u0356\u033d\3\2\2\2"+
		"\u0356\u0341\3\2\2\2\u0356\u0344\3\2\2\2\u0356\u034f\3\2\2\2\u0356\u0354"+
		"\3\2\2\2\u0357\61\3\2\2\2\u0358\u0359\7\31\2\2\u0359\u035a\5\60\31\2\u035a"+
		"\u035b\7\32\2\2\u035b\u035c\5\60\31\2\u035c\u035d\5\62\32\2\u035d\u035e"+
		"\b\32\1\2\u035e\u039b\3\2\2\2\u035f\u0360\7\66\2\2\u0360\u0361\5\60\31"+
		"\2\u0361\u0362\5\62\32\2\u0362\u0363\b\32\1\2\u0363\u039b\3\2\2\2\u0364"+
		"\u0365\7\65\2\2\u0365\u0366\5\60\31\2\u0366\u0367\5\62\32\2\u0367\u0368"+
		"\b\32\1\2\u0368\u039b\3\2\2\2\u0369\u036a\7-\2\2\u036a\u036b\5\60\31\2"+
		"\u036b\u036c\5\62\32\2\u036c\u036d\b\32\1\2\u036d\u039b\3\2\2\2\u036e"+
		"\u0373\b\32\1\2\u036f\u0370\7+\2\2\u0370\u0374\b\32\1\2\u0371\u0372\7"+
		",\2\2\u0372\u0374\b\32\1\2\u0373\u036f\3\2\2\2\u0373\u0371\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\5\60\31\2\u0376\u0377\5\62\32\2\u0377\u0378"+
		"\b\32\1\2\u0378\u039b\3\2\2\2\u0379\u037e\b\32\1\2\u037a\u037b\7\23\2"+
		"\2\u037b\u037f\b\32\1\2\u037c\u037d\7\22\2\2\u037d\u037f\b\32\1\2\u037e"+
		"\u037a\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\5\60"+
		"\31\2\u0381\u0382\5\62\32\2\u0382\u0383\b\32\1\2\u0383\u039b\3\2\2\2\u0384"+
		"\u0389\b\32\1\2\u0385\u0386\7\20\2\2\u0386\u038a\b\32\1\2\u0387\u0388"+
		"\7\21\2\2\u0388\u038a\b\32\1\2\u0389\u0385\3\2\2\2\u0389\u0387\3\2\2\2"+
		"\u038a\u038b\3\2\2\2\u038b\u038c\5\60\31\2\u038c\u038d\5\62\32\2\u038d"+
		"\u038e\b\32\1\2\u038e\u039b\3\2\2\2\u038f\u0394\b\32\1\2\u0390\u0391\7"+
		"\30\2\2\u0391\u0395\b\32\1\2\u0392\u0393\7\27\2\2\u0393\u0395\b\32\1\2"+
		"\u0394\u0390\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397"+
		"\5\62\32\2\u0397\u0398\b\32\1\2\u0398\u039b\3\2\2\2\u0399\u039b\3\2\2"+
		"\2\u039a\u0358\3\2\2\2\u039a\u035f\3\2\2\2\u039a\u0364\3\2\2\2\u039a\u0369"+
		"\3\2\2\2\u039a\u036e\3\2\2\2\u039a\u0379\3\2\2\2\u039a\u0384\3\2\2\2\u039a"+
		"\u038f\3\2\2\2\u039a\u0399\3\2\2\2\u039b\63\3\2\2\2\u039c\u039d\7%\2\2"+
		"\u039d\u039e\5\60\31\2\u039e\u039f\7/\2\2\u039f\u03a0\7/\2\2\u03a0\u03a1"+
		"\5\60\31\2\u03a1\u03a2\7&\2\2\u03a2\65\3\2\2\2\u03a3\u03a4\t\3\2\2\u03a4"+
		"\u03a5\7/\2\2\u03a5\u03a6\7\17\2\2\u03a6\u03a8\7%\2\2\u03a7\u03a9\58\35"+
		"\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab"+
		"\7&\2\2\u03ab\67\3\2\2\2\u03ac\u03af\5\60\31\2\u03ad\u03ae\7\33\2\2\u03ae"+
		"\u03b0\58\35\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b09\3\2\2\2"+
		"\u03b1\u03b2\7\5\2\2\u03b2\u03b3\b\36\1\2\u03b3\u03b4\5\60\31\2\u03b4"+
		";\3\2\2\2\u03b5\u03b7\7\64\2\2\u03b6\u03b8\5> \2\u03b7\u03b6\3\2\2\2\u03b7"+
		"\u03b8\3\2\2\2\u03b8\u03ca\3\2\2\2\u03b9\u03bb\7\37\2\2\u03ba\u03bc\5"+
		"> \2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03ca\3\2\2\2\u03bd"+
		"\u03be\7%\2\2\u03be\u03bf\7\64\2\2\u03bf\u03c1\7&\2\2\u03c0\u03c2\5> "+
		"\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03ca\3\2\2\2\u03c3\u03c4"+
		"\7%\2\2\u03c4\u03c5\7\37\2\2\u03c5\u03c7\7&\2\2\u03c6\u03c8\5> \2\u03c7"+
		"\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03b5\3\2"+
		"\2\2\u03c9\u03b9\3\2\2\2\u03c9\u03bd\3\2\2\2\u03c9\u03c3\3\2\2\2\u03ca"+
		"=\3\2\2\2\u03cb\u03cc\7\"\2\2\u03cc\u03cd\5\60\31\2\u03cd\u03cf\7!\2\2"+
		"\u03ce\u03d0\5> \2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03e9"+
		"\3\2\2\2\u03d1\u03d2\7/\2\2\u03d2\u03d4\7\64\2\2\u03d3\u03d5\5> \2\u03d4"+
		"\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03e9\3\2\2\2\u03d6\u03d7\7/"+
		"\2\2\u03d7\u03d8\t\4\2\2\u03d8\u03da\7%\2\2\u03d9\u03db\58\35\2\u03da"+
		"\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03de\7&"+
		"\2\2\u03dd\u03df\5> \2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e9"+
		"\3\2\2\2\u03e0\u03e2\7%\2\2\u03e1\u03e3\58\35\2\u03e2\u03e1\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\7&\2\2\u03e5\u03e7\5> "+
		"\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03cb"+
		"\3\2\2\2\u03e8\u03d1\3\2\2\2\u03e8\u03d6\3\2\2\2\u03e8\u03e0\3\2\2\2\u03e9"+
		"?\3\2\2\2\u03ea\u03eb\7%\2\2\u03eb\u03ec\5@!\2\u03ec\u03ed\7&\2\2\u03ed"+
		"\u03ee\5B\"\2\u03ee\u03fa\3\2\2\2\u03ef\u03f0\t\2\2\2\u03f0\u03fa\5B\""+
		"\2\u03f1\u03f2\7\23\2\2\u03f2\u03f3\5@!\2\u03f3\u03f4\5B\"\2\u03f4\u03fa"+
		"\3\2\2\2\u03f5\u03f6\7\34\2\2\u03f6\u03f7\5@!\2\u03f7\u03f8\5B\"\2\u03f8"+
		"\u03fa\3\2\2\2\u03f9\u03ea\3\2\2\2\u03f9\u03ef\3\2\2\2\u03f9\u03f1\3\2"+
		"\2\2\u03f9\u03f5\3\2\2\2\u03faA\3\2\2\2\u03fb\u03fc\7\27\2\2\u03fc\u041b"+
		"\5B\"\2\u03fd\u03fe\7\30\2\2\u03fe\u041b\5B\"\2\u03ff\u0400\t\5\2\2\u0400"+
		"\u0401\5@!\2\u0401\u0402\5B\"\2\u0402\u041b\3\2\2\2\u0403\u0404\t\6\2"+
		"\2\u0404\u0405\5@!\2\u0405\u0406\5B\"\2\u0406\u041b\3\2\2\2\u0407\u0408"+
		"\t\7\2\2\u0408\u0409\5@!\2\u0409\u040a\5B\"\2\u040a\u041b\3\2\2\2\u040b"+
		"\u040c\7-\2\2\u040c\u040d\5@!\2\u040d\u040e\5B\"\2\u040e\u041b\3\2\2\2"+
		"\u040f\u0410\7\65\2\2\u0410\u0411\5@!\2\u0411\u0412\5B\"\2\u0412\u041b"+
		"\3\2\2\2\u0413\u0414\7\31\2\2\u0414\u0415\5@!\2\u0415\u0416\7\32\2\2\u0416"+
		"\u0417\5@!\2\u0417\u0418\5B\"\2\u0418\u041b\3\2\2\2\u0419\u041b\3\2\2"+
		"\2\u041a\u03fb\3\2\2\2\u041a\u03fd\3\2\2\2\u041a\u03ff\3\2\2\2\u041a\u0403"+
		"\3\2\2\2\u041a\u0407\3\2\2\2\u041a\u040b\3\2\2\2\u041a\u040f\3\2\2\2\u041a"+
		"\u0413\3\2\2\2\u041a\u0419\3\2\2\2\u041bC\3\2\2\2\u008bEHPX`gnu}\u0087"+
		"\u008e\u0095\u009a\u00a0\u00a3\u00ab\u00b0\u00b7\u00ba\u00bf\u00c8\u00cd"+
		"\u00d7\u00d9\u00df\u00e7\u00ee\u00f4\u0103\u010c\u0110\u0119\u0121\u012a"+
		"\u0132\u013a\u0143\u0149\u014f\u0156\u0159\u015e\u0166\u016e\u0175\u017d"+
		"\u0183\u0189\u0190\u0193\u0198\u01a1\u01a7\u01ad\u01b0\u01b7\u01bf\u01c6"+
		"\u01c9\u01d2\u01db\u01dd\u01e3\u01eb\u01f2\u01f8\u0200\u0206\u020d\u0215"+
		"\u021b\u021f\u0227\u022e\u0231\u0236\u023c\u0240\u0248\u0252\u0259\u025c"+
		"\u0261\u0265\u026c\u0274\u027b\u027e\u0283\u0286\u028e\u0294\u0298\u02a0"+
		"\u02a7\u02aa\u02af\u02b5\u02b9\u02c1\u02cb\u02d2\u02d5\u02da\u02de\u02e2"+
		"\u02ed\u02f4\u02ff\u0307\u030a\u030f\u0313\u0335\u0349\u0356\u0373\u037e"+
		"\u0389\u0394\u039a\u03a8\u03af\u03b7\u03bb\u03c1\u03c7\u03c9\u03cf\u03d4"+
		"\u03da\u03de\u03e2\u03e6\u03e8\u03f9\u041a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}