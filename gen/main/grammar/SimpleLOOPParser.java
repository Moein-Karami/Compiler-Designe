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
		IF=1, ELSE=2, ELSE_IF=3, EACH=4, INT=5, DIVIDE=6, TIMES=7, PLUS=8, MINUS=9, 
		BOOL=10, SET=11, VOID=12, FPTR=13, PLUS_PLUS=14, MINUS_MINUS=15, QUESTION_MARK=16, 
		COLON=17, COMMA=18, NOT=19, ABS_SIGN=20, CLASS=21, SELF_SMALL_NAME=22, 
		ACCESS_TYPE=23, RBACK=24, LBACK=25, LCURL=26, RCURL=27, LPAR=28, RPAR=29, 
		ARROW=30, NEW_LINE=31, BEGIN_COMMENT=32, END_COMMENT=33, LT=34, GT=35, 
		EQUAL=36, DOT=37, SHARP_SIGN=38, CAP_NAME=39, NUM=40, SMALL_NAME=41, WS=42, 
		SEMICOLON=43, INIT=44, LBRACK=45, RBRACK=46, L_CURL=47, T=48, NUMBER=49, 
		BOOL_VALUE=50, DO=51, PRINT=52, IS_EQUAL=53, AND_AND=54, OR_OR=55, RETURN=56;
	public static final int
		RULE_simple_loop = 0, RULE_start_prog = 1, RULE_var_dec = 2, RULE_comment = 3, 
		RULE_class_dec = 4, RULE_prog_body = 5, RULE_set_dec = 6, RULE_func_var = 7, 
		RULE_begin_class = 8, RULE_init_dec = 9, RULE_init_begin = 10, RULE_self_var_dec = 11, 
		RULE_self_var = 12, RULE_class_body = 13, RULE_func_dec = 14, RULE_argumants = 15, 
		RULE_default_argumants = 16, RULE_func_begin = 17, RULE_func_body = 18, 
		RULE_scop_body = 19, RULE_line_command = 20, RULE_if_state = 21, RULE_my_else = 22, 
		RULE_else_if = 23, RULE_condition = 24, RULE_for_loop = 25, RULE_function_call = 26, 
		RULE_assigment = 27, RULE_print = 28, RULE_ternery_condition = 29, RULE_expr = 30, 
		RULE_sequence = 31, RULE_my_new = 32, RULE_func_input = 33, RULE_my_return = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"simple_loop", "start_prog", "var_dec", "comment", "class_dec", "prog_body", 
			"set_dec", "func_var", "begin_class", "init_dec", "init_begin", "self_var_dec", 
			"self_var", "class_body", "func_dec", "argumants", "default_argumants", 
			"func_begin", "func_body", "scop_body", "line_command", "if_state", "my_else", 
			"else_if", "condition", "for_loop", "function_call", "assigment", "print", 
			"ternery_condition", "expr", "sequence", "my_new", "func_input", "my_return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'elsif'", "'each'", "'int'", "'\\'", "'*'", 
			"'+'", "'-'", "'bool'", "'Set'", "'void'", "'fptr'", "'++'", "'--'", 
			"'?'", "':'", "','", "'!'", "'|'", "'class'", "'self'", null, "'['", 
			"']'", "'{'", "'}'", "'('", "')'", "'->'", null, "'=begin'", "'=end'", 
			"'<'", "'>'", "'='", "'.'", "'#'", null, null, null, null, "';'", "'initialize'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "ELSE_IF", "EACH", "INT", "DIVIDE", "TIMES", "PLUS", 
			"MINUS", "BOOL", "SET", "VOID", "FPTR", "PLUS_PLUS", "MINUS_MINUS", "QUESTION_MARK", 
			"COLON", "COMMA", "NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", "ACCESS_TYPE", 
			"RBACK", "LBACK", "LCURL", "RCURL", "LPAR", "RPAR", "ARROW", "NEW_LINE", 
			"BEGIN_COMMENT", "END_COMMENT", "LT", "GT", "EQUAL", "DOT", "SHARP_SIGN", 
			"CAP_NAME", "NUM", "SMALL_NAME", "WS", "SEMICOLON", "INIT", "LBRACK", 
			"RBRACK", "L_CURL", "T", "NUMBER", "BOOL_VALUE", "DO", "PRINT", "IS_EQUAL", 
			"AND_AND", "OR_OR", "RETURN"
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
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CLASS) | (1L << NEW_LINE) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN))) != 0)) {
				{
				setState(70);
				start_prog();
				}
			}

			setState(73);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Class_decContext class_dec() {
			return getRuleContext(Class_decContext.class,0);
		}
		public Prog_bodyContext prog_body() {
			return getRuleContext(Prog_bodyContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				var_dec();
				setState(76);
				start_prog();
				}
				break;
			case BEGIN_COMMENT:
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				comment();
				setState(79);
				start_prog();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				class_dec();
				setState(82);
				prog_body();
				}
				break;
			case NEW_LINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(NEW_LINE);
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
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Func_varContext func_var() {
			return getRuleContext(Func_varContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					match(INT);
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					match(BOOL);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL );
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					match(CAP_NAME);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAP_NAME );
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					set_dec();
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SET );
				setState(107);
				func_var();
				}
				setState(109);
				match(SMALL_NAME);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110);
					match(COMMA);
					setState(111);
					match(SMALL_NAME);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(NEW_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119);
					match(INT);
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					match(BOOL);
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL );
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(CAP_NAME);
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAP_NAME );
				setState(134);
				set_dec();
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(LBRACK);
					setState(137);
					match(NUM);
					setState(138);
					match(RBRACK);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(143);
				match(SMALL_NAME);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(144);
					match(COMMA);
					setState(145);
					match(SMALL_NAME);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SHARP_SIGN() { return getToken(SimpleLOOPParser.SHARP_SIGN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public TerminalNode BEGIN_COMMENT() { return getToken(SimpleLOOPParser.BEGIN_COMMENT, 0); }
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
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(SHARP_SIGN);
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(156);
						matchWildcard();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(162);
				match(NEW_LINE);
				}
				break;
			case BEGIN_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(BEGIN_COMMENT);
				setState(164);
				match(NEW_LINE);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						matchWildcard();
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(171);
				match(NEW_LINE);
				setState(172);
				match(END_COMMENT);
				setState(173);
				match(NEW_LINE);
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
		public TerminalNode L_CURL() { return getToken(SimpleLOOPParser.L_CURL, 0); }
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Begin_classContext begin_class() {
			return getRuleContext(Begin_classContext.class,0);
		}
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
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
			setState(176);
			match(CLASS);
			setState(177);
			match(CAP_NAME);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(178);
				match(LT);
				setState(179);
				match(CAP_NAME);
				}
			}

			setState(182);
			match(L_CURL);
			setState(183);
			match(NEW_LINE);
			setState(184);
			begin_class();
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				class_dec();
				setState(187);
				prog_body();
				}
				break;
			case BEGIN_COMMENT:
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				comment();
				setState(190);
				prog_body();
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
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SET);
			setState(195);
			match(LT);
			setState(196);
			match(INT);
			setState(197);
			match(GT);
			setState(198);
			match(SMALL_NAME);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(199);
				match(COMMA);
				setState(200);
				match(SMALL_NAME);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(NEW_LINE);
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
		public TerminalNode T() { return getToken(SimpleLOOPParser.T, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
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
			setState(208);
			match(FPTR);
			setState(209);
			match(T);
			{
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(VOID);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID );
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				match(INT);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				match(BOOL);
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOL );
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(CAP_NAME);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CAP_NAME );
			setState(230);
			set_dec();
			}
			setState(232);
			match(ARROW);
			{
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				match(VOID);
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID );
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				match(INT);
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				match(BOOL);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOL );
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(CAP_NAME);
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CAP_NAME );
			setState(253);
			set_dec();
			}
			setState(255);
			match(SMALL_NAME);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				match(SMALL_NAME);
				}
				}
				setState(262);
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
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Func_decContext func_dec() {
			return getRuleContext(Func_decContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				comment();
				setState(264);
				begin_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(ACCESS_TYPE);
				setState(267);
				var_dec();
				setState(268);
				begin_class();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				init_dec();
				setState(271);
				class_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				func_dec();
				setState(274);
				class_body();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(RCURL);
				setState(277);
				match(NEW_LINE);
				setState(278);
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

	public static class Init_decContext extends ParserRuleContext {
		public TerminalNode ACCESS_TYPE() { return getToken(SimpleLOOPParser.ACCESS_TYPE, 0); }
		public TerminalNode INIT() { return getToken(SimpleLOOPParser.INIT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Init_beginContext init_begin() {
			return getRuleContext(Init_beginContext.class,0);
		}
		public ArgumantsContext argumants() {
			return getRuleContext(ArgumantsContext.class,0);
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
			setState(281);
			match(ACCESS_TYPE);
			setState(282);
			match(INIT);
			setState(283);
			match(LPAR);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==BOOL) {
				{
				setState(284);
				argumants();
				}
			}

			setState(287);
			match(RPAR);
			setState(288);
			match(LCURL);
			setState(289);
			match(NEW_LINE);
			setState(290);
			init_begin();
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
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Self_var_decContext self_var_dec() {
			return getRuleContext(Self_var_decContext.class,0);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				comment();
				setState(293);
				init_begin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				var_dec();
				setState(296);
				init_begin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				func_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				self_var_dec();
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

	public static class Self_var_decContext extends ParserRuleContext {
		public Self_varContext self_var() {
			return getRuleContext(Self_varContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Func_varContext func_var() {
			return getRuleContext(Func_varContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
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
		public Self_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSelf_var_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSelf_var_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSelf_var_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_var_decContext self_var_dec() throws RecognitionException {
		Self_var_decContext _localctx = new Self_var_decContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_self_var_dec);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(302);
					match(INT);
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(307);
					match(BOOL);
					}
					}
					setState(310); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL );
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(312);
					match(CAP_NAME);
					}
					}
					setState(315); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAP_NAME );
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(317);
					set_dec();
					}
					}
					setState(320); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SET );
				setState(322);
				func_var();
				}
				setState(324);
				self_var();
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(325);
					match(COMMA);
					setState(326);
					match(SMALL_NAME);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(NEW_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(334);
					match(INT);
					}
					}
					setState(337); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(339);
					match(BOOL);
					}
					}
					setState(342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL );
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					match(CAP_NAME);
					}
					}
					setState(347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAP_NAME );
				setState(349);
				set_dec();
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(351);
					match(LBRACK);
					setState(352);
					match(NUM);
					setState(353);
					match(RBRACK);
					}
					}
					setState(356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(358);
				self_var();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					match(SMALL_NAME);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
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

	public static class Self_varContext extends ParserRuleContext {
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode SELF_SMALL_NAME() { return getToken(SimpleLOOPParser.SELF_SMALL_NAME, 0); }
		public Self_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSelf_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSelf_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSelf_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_varContext self_var() throws RecognitionException {
		Self_varContext _localctx = new Self_varContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_self_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==SELF_SMALL_NAME || _la==SMALL_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Class_bodyContext extends ParserRuleContext {
		public Func_decContext func_dec() {
			return getRuleContext(Func_decContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_class_body);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				func_dec();
				setState(373);
				class_body();
				}
				break;
			case RPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(RPAR);
				setState(376);
				match(NEW_LINE);
				setState(377);
				match(NEW_LINE);
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

	public static class Func_decContext extends ParserRuleContext {
		public TerminalNode ACCESS_TYPE() { return getToken(SimpleLOOPParser.ACCESS_TYPE, 0); }
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public ArgumantsContext argumants() {
			return getRuleContext(ArgumantsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Func_beginContext func_begin() {
			return getRuleContext(Func_beginContext.class,0);
		}
		public TerminalNode CAP_NAME() { return getToken(SimpleLOOPParser.CAP_NAME, 0); }
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
		public List<Set_decContext> set_dec() {
			return getRuleContexts(Set_decContext.class);
		}
		public Set_decContext set_dec(int i) {
			return getRuleContext(Set_decContext.class,i);
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
		enterRule(_localctx, 28, RULE_func_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ACCESS_TYPE);
			{
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				match(VOID);
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID );
			setState(387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(386);
				match(INT);
				}
				}
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(391);
				match(BOOL);
				}
				}
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOL );
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(396);
				set_dec();
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SET );
			setState(401);
			match(CAP_NAME);
			}
			setState(403);
			match(SMALL_NAME);
			setState(404);
			match(LPAR);
			setState(405);
			argumants();
			setState(406);
			match(RPAR);
			setState(407);
			match(LCURL);
			setState(408);
			match(NEW_LINE);
			setState(409);
			func_begin();
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
		public Func_varContext func_var() {
			return getRuleContext(Func_varContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimpleLOOPParser.COMMA, 0); }
		public ArgumantsContext argumants() {
			return getRuleContext(ArgumantsContext.class,0);
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
		enterRule(_localctx, 30, RULE_argumants);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(411);
					match(INT);
					}
					}
					setState(414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(416);
					match(BOOL);
					}
					}
					setState(419); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL );
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(421);
					match(CAP_NAME);
					}
					}
					setState(424); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAP_NAME );
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(426);
					set_dec();
					}
					}
					setState(429); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SET );
				setState(431);
				func_var();
				}
				setState(433);
				match(SMALL_NAME);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(434);
					match(COMMA);
					setState(435);
					argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
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
		public TerminalNode COMMA() { return getToken(SimpleLOOPParser.COMMA, 0); }
		public Default_argumantsContext default_argumants() {
			return getRuleContext(Default_argumantsContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SimpleLOOPParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleLOOPParser.NUMBER, i);
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
		enterRule(_localctx, 32, RULE_default_argumants);
		int _la;
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(INT);
				setState(442);
				match(SMALL_NAME);
				setState(443);
				match(EQUAL);
				{
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(444);
					match(NUMBER);
					}
					}
					setState(447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(449);
				match(SMALL_NAME);
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(451);
					match(COMMA);
					setState(452);
					default_argumants();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(BOOL);
				setState(456);
				match(SMALL_NAME);
				setState(457);
				match(EQUAL);
				{
				setState(459); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(458);
					match(NUMBER);
					}
					}
					setState(461); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(463);
				match(BOOL_VALUE);
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(465);
					match(COMMA);
					setState(466);
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
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
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
		enterRule(_localctx, 34, RULE_func_begin);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN_COMMENT:
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				comment();
				setState(472);
				func_begin();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				var_dec();
				setState(475);
				func_begin();
				}
				break;
			case IF:
			case MINUS:
			case LCURL:
			case RCURL:
			case LPAR:
			case NEW_LINE:
			case SMALL_NAME:
			case NUMBER:
			case PRINT:
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				func_body();
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

	public static class Func_bodyContext extends ParserRuleContext {
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public My_returnContext my_return() {
			return getRuleContext(My_returnContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_body);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(RCURL);
				setState(481);
				match(NEW_LINE);
				}
				break;
			case IF:
			case MINUS:
			case LCURL:
			case LPAR:
			case NEW_LINE:
			case SMALL_NAME:
			case NUMBER:
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				scop_body();
				setState(483);
				func_body();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				my_return();
				setState(486);
				func_body();
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

	public static class Scop_bodyContext extends ParserRuleContext {
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
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
		enterRule(_localctx, 38, RULE_scop_body);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case MINUS:
			case LPAR:
			case SMALL_NAME:
			case NUMBER:
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				line_command();
				setState(491);
				match(NEW_LINE);
				setState(492);
				scop_body();
				}
				break;
			case NEW_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(NEW_LINE);
				}
				break;
			case LCURL:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(LCURL);
				setState(496);
				match(NEW_LINE);
				setState(497);
				scop_body();
				setState(498);
				match(NEW_LINE);
				setState(499);
				match(RCURL);
				setState(500);
				match(NEW_LINE);
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
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Ternery_conditionContext ternery_condition() {
			return getRuleContext(Ternery_conditionContext.class,0);
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
		enterRule(_localctx, 40, RULE_line_command);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				if_state();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				assigment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				ternery_condition();
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public List<My_elseContext> my_else() {
			return getRuleContexts(My_elseContext.class);
		}
		public My_elseContext my_else(int i) {
			return getRuleContext(My_elseContext.class,i);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
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
		enterRule(_localctx, 42, RULE_if_state);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(IF);
				setState(513);
				condition();
				setState(514);
				match(NEW_LINE);
				setState(515);
				line_command();
				setState(516);
				match(NEW_LINE);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(518); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(517);
						my_else();
						}
						}
						setState(520); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ELSE );
					setState(522);
					else_if();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(IF);
				setState(527);
				condition();
				setState(528);
				match(LCURL);
				setState(529);
				match(NEW_LINE);
				setState(530);
				scop_body();
				setState(531);
				match(RCURL);
				setState(532);
				match(NEW_LINE);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(533);
						my_else();
						}
						}
						setState(536); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ELSE );
					setState(538);
					else_if();
					}
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

	public static class My_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimpleLOOPParser.ELSE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
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
		enterRule(_localctx, 44, RULE_my_else);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(ELSE);
				setState(545);
				condition();
				setState(546);
				match(NEW_LINE);
				setState(547);
				line_command();
				setState(548);
				match(NEW_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(ELSE);
				setState(551);
				condition();
				setState(552);
				match(LCURL);
				setState(553);
				match(NEW_LINE);
				setState(554);
				scop_body();
				setState(555);
				match(RCURL);
				setState(556);
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

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(SimpleLOOPParser.ELSE_IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
		}
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public List<My_elseContext> my_else() {
			return getRuleContexts(My_elseContext.class);
		}
		public My_elseContext my_else(int i) {
			return getRuleContext(My_elseContext.class,i);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
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
		enterRule(_localctx, 46, RULE_else_if);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(ELSE_IF);
				setState(561);
				condition();
				setState(562);
				match(NEW_LINE);
				setState(563);
				line_command();
				setState(564);
				match(NEW_LINE);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(565);
						my_else();
						}
						}
						setState(568); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ELSE );
					setState(570);
					else_if();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(ELSE_IF);
				setState(575);
				condition();
				setState(576);
				match(LCURL);
				setState(577);
				match(NEW_LINE);
				setState(578);
				scop_body();
				setState(579);
				match(RCURL);
				setState(580);
				match(NEW_LINE);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(582); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(581);
						my_else();
						}
						}
						setState(584); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ELSE );
					setState(586);
					else_if();
					}
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

	public static class ConditionContext extends ParserRuleContext {
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SMALL_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				assigment();
				}
				break;
			case MINUS:
			case LPAR:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				expr(0);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode EACH() { return getToken(SimpleLOOPParser.EACH, 0); }
		public TerminalNode DO() { return getToken(SimpleLOOPParser.DO, 0); }
		public List<TerminalNode> ABS_SIGN() { return getTokens(SimpleLOOPParser.ABS_SIGN); }
		public TerminalNode ABS_SIGN(int i) {
			return getToken(SimpleLOOPParser.ABS_SIGN, i);
		}
		public Self_varContext self_var() {
			return getRuleContext(Self_varContext.class,0);
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
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public TerminalNode LCURL() { return getToken(SimpleLOOPParser.LCURL, 0); }
		public Scop_bodyContext scop_body() {
			return getRuleContext(Scop_bodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(SimpleLOOPParser.RCURL, 0); }
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
		enterRule(_localctx, 50, RULE_for_loop);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(596);
					match(SMALL_NAME);
					}
					}
					setState(599); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SMALL_NAME );
				setState(601);
				sequence();
				}
				setState(603);
				match(DOT);
				setState(604);
				match(EACH);
				setState(605);
				match(DO);
				setState(606);
				match(ABS_SIGN);
				setState(607);
				self_var();
				setState(608);
				match(ABS_SIGN);
				setState(609);
				match(NEW_LINE);
				setState(610);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(613); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(612);
					match(SMALL_NAME);
					}
					}
					setState(615); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SMALL_NAME );
				setState(617);
				sequence();
				}
				setState(619);
				match(DOT);
				setState(620);
				match(EACH);
				setState(621);
				match(DO);
				setState(622);
				match(ABS_SIGN);
				setState(623);
				self_var();
				setState(624);
				match(ABS_SIGN);
				setState(625);
				match(LCURL);
				setState(626);
				match(NEW_LINE);
				setState(627);
				scop_body();
				setState(628);
				match(RCURL);
				setState(629);
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
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
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
		enterRule(_localctx, 52, RULE_function_call);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				match(SMALL_NAME);
				setState(634);
				match(LPAR);
				setState(635);
				func_input();
				setState(636);
				match(RPAR);
				setState(637);
				match(NEW_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(SMALL_NAME);
				setState(640);
				match(DOT);
				setState(641);
				match(SMALL_NAME);
				setState(642);
				match(LPAR);
				setState(643);
				func_input();
				setState(644);
				match(RPAR);
				setState(645);
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

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
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
		enterRule(_localctx, 54, RULE_assigment);
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(SMALL_NAME);
				setState(650);
				match(EQUAL);
				setState(651);
				expr(0);
				setState(652);
				match(NEW_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(SMALL_NAME);
				setState(655);
				match(EQUAL);
				setState(656);
				my_new();
				setState(657);
				match(NEW_LINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				match(SMALL_NAME);
				setState(660);
				match(PLUS_PLUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(661);
				match(SMALL_NAME);
				setState(662);
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
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
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
		enterRule(_localctx, 56, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(PRINT);
			setState(666);
			match(LPAR);
			setState(667);
			expr(0);
			setState(668);
			match(RPAR);
			setState(669);
			match(NEW_LINE);
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

	public static class Ternery_conditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode QUESTION_MARK() { return getToken(SimpleLOOPParser.QUESTION_MARK, 0); }
		public List<Line_commandContext> line_command() {
			return getRuleContexts(Line_commandContext.class);
		}
		public Line_commandContext line_command(int i) {
			return getRuleContext(Line_commandContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SimpleLOOPParser.COLON, 0); }
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
		public Ternery_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternery_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTernery_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTernery_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTernery_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternery_conditionContext ternery_condition() throws RecognitionException {
		Ternery_conditionContext _localctx = new Ternery_conditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ternery_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			condition();
			setState(672);
			match(QUESTION_MARK);
			setState(673);
			line_command();
			setState(674);
			match(COLON);
			setState(675);
			line_command();
			setState(676);
			match(NEW_LINE);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public List<TerminalNode> MINUS() { return getTokens(SimpleLOOPParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleLOOPParser.MINUS, i);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SimpleLOOPParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleLOOPParser.NUMBER, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<TerminalNode> SMALL_NAME() { return getTokens(SimpleLOOPParser.SMALL_NAME); }
		public TerminalNode SMALL_NAME(int i) {
			return getToken(SimpleLOOPParser.SMALL_NAME, i);
		}
		public List<Ternery_conditionContext> ternery_condition() {
			return getRuleContexts(Ternery_conditionContext.class);
		}
		public Ternery_conditionContext ternery_condition(int i) {
			return getRuleContext(Ternery_conditionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(SimpleLOOPParser.TIMES, 0); }
		public List<TerminalNode> DIVIDE() { return getTokens(SimpleLOOPParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SimpleLOOPParser.DIVIDE, i);
		}
		public TerminalNode PLUS() { return getToken(SimpleLOOPParser.PLUS, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
		public List<TerminalNode> LT() { return getTokens(SimpleLOOPParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(SimpleLOOPParser.LT, i);
		}
		public TerminalNode IS_EQUAL() { return getToken(SimpleLOOPParser.IS_EQUAL, 0); }
		public TerminalNode AND_AND() { return getToken(SimpleLOOPParser.AND_AND, 0); }
		public TerminalNode OR_OR() { return getToken(SimpleLOOPParser.OR_OR, 0); }
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(679);
				match(LPAR);
				setState(680);
				expr(0);
				setState(681);
				match(RPAR);
				}
				break;
			case MINUS:
				{
				{
				setState(684); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(683);
					match(MINUS);
					}
					}
					setState(686); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				setState(688);
				match(NOT);
				}
				setState(690);
				expr(8);
				}
				break;
			case NUMBER:
				{
				setState(692); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(691);
					match(NUMBER);
					}
					}
					setState(694); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(697); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(696);
						function_call();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(699); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(702); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(701);
						match(SMALL_NAME);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(704); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(707); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(706);
						ternery_condition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(709); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(711);
				assigment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(751);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(715);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(717); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(716);
							match(DIVIDE);
							}
							}
							setState(719); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==DIVIDE );
						setState(721);
						match(TIMES);
						}
						setState(723);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(724);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(726); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(725);
							match(MINUS);
							}
							}
							setState(728); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==MINUS );
						setState(730);
						match(PLUS);
						}
						setState(732);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(733);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(735); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(734);
							match(LT);
							}
							}
							setState(737); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LT );
						setState(739);
						match(GT);
						}
						setState(741);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(742);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(743);
						match(IS_EQUAL);
						setState(744);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(745);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(746);
						match(AND_AND);
						setState(747);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(748);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(749);
						match(OR_OR);
						setState(750);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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
		enterRule(_localctx, 62, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(LPAR);
			setState(757);
			expr(0);
			setState(758);
			match(DOT);
			setState(759);
			match(DOT);
			setState(760);
			expr(0);
			setState(761);
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
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode NEW_LINE() { return getToken(SimpleLOOPParser.NEW_LINE, 0); }
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
		enterRule(_localctx, 64, RULE_my_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(CAP_NAME);
			setState(764);
			match(DOT);
			setState(765);
			match(LPAR);
			setState(766);
			func_input();
			setState(767);
			match(RPAR);
			setState(768);
			match(NEW_LINE);
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
		enterRule(_localctx, 66, RULE_func_input);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MINUS:
			case LPAR:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				expr(0);
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(772);
					match(COMMA);
					setState(773);
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
		enterRule(_localctx, 68, RULE_my_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(RETURN);
			setState(779);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0310\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\5\2J\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3X\n\3\3\4\6\4[\n\4\r\4\16\4\\\3\4\6\4`\n\4\r\4\16\4"+
		"a\3\4\6\4e\n\4\r\4\16\4f\3\4\6\4j\n\4\r\4\16\4k\3\4\3\4\3\4\3\4\3\4\7"+
		"\4s\n\4\f\4\16\4v\13\4\3\4\3\4\3\4\6\4{\n\4\r\4\16\4|\3\4\6\4\u0080\n"+
		"\4\r\4\16\4\u0081\3\4\6\4\u0085\n\4\r\4\16\4\u0086\3\4\3\4\3\4\3\4\3\4"+
		"\6\4\u008e\n\4\r\4\16\4\u008f\3\4\3\4\3\4\7\4\u0095\n\4\f\4\16\4\u0098"+
		"\13\4\3\4\3\4\5\4\u009c\n\4\3\5\3\5\7\5\u00a0\n\5\f\5\16\5\u00a3\13\5"+
		"\3\5\3\5\3\5\3\5\7\5\u00a9\n\5\f\5\16\5\u00ac\13\5\3\5\3\5\3\5\5\5\u00b1"+
		"\n\5\3\6\3\6\3\6\3\6\5\6\u00b7\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00c3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cc\n\b\f\b\16\b"+
		"\u00cf\13\b\3\b\3\b\3\t\3\t\3\t\6\t\u00d6\n\t\r\t\16\t\u00d7\3\t\6\t\u00db"+
		"\n\t\r\t\16\t\u00dc\3\t\6\t\u00e0\n\t\r\t\16\t\u00e1\3\t\6\t\u00e5\n\t"+
		"\r\t\16\t\u00e6\3\t\3\t\3\t\3\t\6\t\u00ed\n\t\r\t\16\t\u00ee\3\t\6\t\u00f2"+
		"\n\t\r\t\16\t\u00f3\3\t\6\t\u00f7\n\t\r\t\16\t\u00f8\3\t\6\t\u00fc\n\t"+
		"\r\t\16\t\u00fd\3\t\3\t\3\t\3\t\3\t\7\t\u0105\n\t\f\t\16\t\u0108\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011a"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0120\n\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u012f\n\f\3\r\6\r\u0132\n\r\r\r\16\r"+
		"\u0133\3\r\6\r\u0137\n\r\r\r\16\r\u0138\3\r\6\r\u013c\n\r\r\r\16\r\u013d"+
		"\3\r\6\r\u0141\n\r\r\r\16\r\u0142\3\r\3\r\3\r\3\r\3\r\7\r\u014a\n\r\f"+
		"\r\16\r\u014d\13\r\3\r\3\r\3\r\6\r\u0152\n\r\r\r\16\r\u0153\3\r\6\r\u0157"+
		"\n\r\r\r\16\r\u0158\3\r\6\r\u015c\n\r\r\r\16\r\u015d\3\r\3\r\3\r\3\r\3"+
		"\r\6\r\u0165\n\r\r\r\16\r\u0166\3\r\3\r\3\r\7\r\u016c\n\r\f\r\16\r\u016f"+
		"\13\r\3\r\3\r\5\r\u0173\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u017d\n\17\3\20\3\20\6\20\u0181\n\20\r\20\16\20\u0182\3\20\6\20\u0186"+
		"\n\20\r\20\16\20\u0187\3\20\6\20\u018b\n\20\r\20\16\20\u018c\3\20\6\20"+
		"\u0190\n\20\r\20\16\20\u0191\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\6\21\u019f\n\21\r\21\16\21\u01a0\3\21\6\21\u01a4\n\21\r"+
		"\21\16\21\u01a5\3\21\6\21\u01a9\n\21\r\21\16\21\u01aa\3\21\6\21\u01ae"+
		"\n\21\r\21\16\21\u01af\3\21\3\21\3\21\3\21\3\21\5\21\u01b7\n\21\3\21\5"+
		"\21\u01ba\n\21\3\22\3\22\3\22\3\22\6\22\u01c0\n\22\r\22\16\22\u01c1\3"+
		"\22\3\22\3\22\3\22\5\22\u01c8\n\22\3\22\3\22\3\22\3\22\6\22\u01ce\n\22"+
		"\r\22\16\22\u01cf\3\22\3\22\3\22\3\22\5\22\u01d6\n\22\5\22\u01d8\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01e1\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01eb\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u01f9\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0201\n\26\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0209\n\27\r\27\16"+
		"\27\u020a\3\27\3\27\5\27\u020f\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\6\27\u0219\n\27\r\27\16\27\u021a\3\27\3\27\5\27\u021f\n\27\5\27"+
		"\u0221\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0231\n\30\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u0239\n"+
		"\31\r\31\16\31\u023a\3\31\3\31\5\31\u023f\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\6\31\u0249\n\31\r\31\16\31\u024a\3\31\3\31\5\31\u024f"+
		"\n\31\5\31\u0251\n\31\3\32\3\32\5\32\u0255\n\32\3\33\6\33\u0258\n\33\r"+
		"\33\16\33\u0259\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\6\33\u0268\n\33\r\33\16\33\u0269\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u027a\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u028a\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u029a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \6 \u02af\n \r \16 \u02b0\3 \3 \3 \3 \6 \u02b7"+
		"\n \r \16 \u02b8\3 \6 \u02bc\n \r \16 \u02bd\3 \6 \u02c1\n \r \16 \u02c2"+
		"\3 \6 \u02c6\n \r \16 \u02c7\3 \3 \5 \u02cc\n \3 \3 \6 \u02d0\n \r \16"+
		" \u02d1\3 \3 \3 \3 \3 \6 \u02d9\n \r \16 \u02da\3 \3 \3 \3 \3 \6 \u02e2"+
		"\n \r \16 \u02e3\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u02f2\n \f \16"+
		" \u02f5\13 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\5#\u0309\n#\5#\u030b\n#\3$\3$\3$\3$\2\3>%\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\3\4\2\30\30++\2\u035d\2"+
		"I\3\2\2\2\4W\3\2\2\2\6\u009b\3\2\2\2\b\u00b0\3\2\2\2\n\u00b2\3\2\2\2\f"+
		"\u00c2\3\2\2\2\16\u00c4\3\2\2\2\20\u00d2\3\2\2\2\22\u0119\3\2\2\2\24\u011b"+
		"\3\2\2\2\26\u012e\3\2\2\2\30\u0172\3\2\2\2\32\u0174\3\2\2\2\34\u017c\3"+
		"\2\2\2\36\u017e\3\2\2\2 \u01b9\3\2\2\2\"\u01d7\3\2\2\2$\u01e0\3\2\2\2"+
		"&\u01ea\3\2\2\2(\u01f8\3\2\2\2*\u0200\3\2\2\2,\u0220\3\2\2\2.\u0230\3"+
		"\2\2\2\60\u0250\3\2\2\2\62\u0254\3\2\2\2\64\u0279\3\2\2\2\66\u0289\3\2"+
		"\2\28\u0299\3\2\2\2:\u029b\3\2\2\2<\u02a1\3\2\2\2>\u02cb\3\2\2\2@\u02f6"+
		"\3\2\2\2B\u02fd\3\2\2\2D\u030a\3\2\2\2F\u030c\3\2\2\2HJ\5\4\3\2IH\3\2"+
		"\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\2\2\3L\3\3\2\2\2MN\5\6\4\2NO\5\4\3\2OX\3"+
		"\2\2\2PQ\5\b\5\2QR\5\4\3\2RX\3\2\2\2ST\5\n\6\2TU\5\f\7\2UX\3\2\2\2VX\7"+
		"!\2\2WM\3\2\2\2WP\3\2\2\2WS\3\2\2\2WV\3\2\2\2X\5\3\2\2\2Y[\7\7\2\2ZY\3"+
		"\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\7\f\2\2_^\3\2\2\2"+
		"`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\7)\2\2dc\3\2\2\2ef\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5\16\b\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2lm\3\2\2\2mn\5\20\t\2no\3\2\2\2ot\7+\2\2pq\7\24\2\2qs\7+\2"+
		"\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7!\2"+
		"\2x\u009c\3\2\2\2y{\7\7\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~\u0080\7\f\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\7)\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\16\b\2\u0089\u008d\3\2\2\2\u008a"+
		"\u008b\7/\2\2\u008b\u008c\7*\2\2\u008c\u008e\7\60\2\2\u008d\u008a\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0096\7+\2\2\u0092\u0093\7\24\2\2\u0093\u0095\7+"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7!"+
		"\2\2\u009a\u009c\3\2\2\2\u009bZ\3\2\2\2\u009bz\3\2\2\2\u009c\7\3\2\2\2"+
		"\u009d\u00a1\7(\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00b1\7!\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00aa\7!\2"+
		"\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7!\2\2\u00ae\u00af\7#\2\2\u00af\u00b1\7!\2\2\u00b0\u009d"+
		"\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b1\t\3\2\2\2\u00b2\u00b3\7\27\2\2\u00b3"+
		"\u00b6\7)\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b7\7)\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9"+
		"\u00ba\7!\2\2\u00ba\u00bb\5\22\n\2\u00bb\13\3\2\2\2\u00bc\u00bd\5\n\6"+
		"\2\u00bd\u00be\5\f\7\2\u00be\u00c3\3\2\2\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1"+
		"\5\f\7\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3"+
		"\r\3\2\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6\7$\2\2\u00c6\u00c7\7\7\2\2"+
		"\u00c7\u00c8\7%\2\2\u00c8\u00cd\7+\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cc"+
		"\7+\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7!"+
		"\2\2\u00d1\17\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d5\7\62\2\2\u00d4"+
		"\u00d6\7\16\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\7\7\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\7\f\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e5\7)\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5\16"+
		"\b\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7 \2\2\u00eb\u00ed\7\16\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\7\7\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f7\7\f\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\7)"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\5\16\b\2\u0100\u0101\3"+
		"\2\2\2\u0101\u0106\7+\2\2\u0102\u0103\7\24\2\2\u0103\u0105\7+\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\21\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\5\b\5\2\u010a\u010b"+
		"\5\22\n\2\u010b\u011a\3\2\2\2\u010c\u010d\7\31\2\2\u010d\u010e\5\6\4\2"+
		"\u010e\u010f\5\22\n\2\u010f\u011a\3\2\2\2\u0110\u0111\5\24\13\2\u0111"+
		"\u0112\5\34\17\2\u0112\u011a\3\2\2\2\u0113\u0114\5\36\20\2\u0114\u0115"+
		"\5\34\17\2\u0115\u011a\3\2\2\2\u0116\u0117\7\35\2\2\u0117\u0118\7!\2\2"+
		"\u0118\u011a\7!\2\2\u0119\u0109\3\2\2\2\u0119\u010c\3\2\2\2\u0119\u0110"+
		"\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0116\3\2\2\2\u011a\23\3\2\2\2\u011b"+
		"\u011c\7\31\2\2\u011c\u011d\7.\2\2\u011d\u011f\7\36\2\2\u011e\u0120\5"+
		" \21\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7\37\2\2\u0122\u0123\7\34\2\2\u0123\u0124\7!\2\2\u0124\u0125\5"+
		"\26\f\2\u0125\25\3\2\2\2\u0126\u0127\5\b\5\2\u0127\u0128\5\26\f\2\u0128"+
		"\u012f\3\2\2\2\u0129\u012a\5\6\4\2\u012a\u012b\5\26\f\2\u012b\u012f\3"+
		"\2\2\2\u012c\u012f\5&\24\2\u012d\u012f\5\30\r\2\u012e\u0126\3\2\2\2\u012e"+
		"\u0129\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\27\3\2\2"+
		"\2\u0130\u0132\7\7\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\7\f\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u013c\7)\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u0141\5\16\b\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\5\20"+
		"\t\2\u0145\u0146\3\2\2\2\u0146\u014b\5\32\16\2\u0147\u0148\7\24\2\2\u0148"+
		"\u014a\7+\2\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\7!\2\2\u014f\u0173\3\2\2\2\u0150\u0152\7\7\2\2\u0151\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0157\7\f\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u015c\7)\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5\16\b\2\u0160"+
		"\u0164\3\2\2\2\u0161\u0162\7/\2\2\u0162\u0163\7*\2\2\u0163\u0165\7\60"+
		"\2\2\u0164\u0161\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016d\5\32\16\2\u0169\u016a\7"+
		"\24\2\2\u016a\u016c\7+\2\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u0170\u0171\7!\2\2\u0171\u0173\3\2\2\2\u0172\u0131\3\2\2\2\u0172"+
		"\u0151\3\2\2\2\u0173\31\3\2\2\2\u0174\u0175\t\2\2\2\u0175\33\3\2\2\2\u0176"+
		"\u0177\5\36\20\2\u0177\u0178\5\34\17\2\u0178\u017d\3\2\2\2\u0179\u017a"+
		"\7\37\2\2\u017a\u017b\7!\2\2\u017b\u017d\7!\2\2\u017c\u0176\3\2\2\2\u017c"+
		"\u0179\3\2\2\2\u017d\35\3\2\2\2\u017e\u0180\7\31\2\2\u017f\u0181\7\16"+
		"\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\7\7\2\2\u0185\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u018b\7\f\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\5\16\b\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7)\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\7+\2\2\u0196\u0197\7\36\2\2\u0197\u0198\5 "+
		"\21\2\u0198\u0199\7\37\2\2\u0199\u019a\7\34\2\2\u019a\u019b\7!\2\2\u019b"+
		"\u019c\5$\23\2\u019c\37\3\2\2\2\u019d\u019f\7\7\2\2\u019e\u019d\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3"+
		"\3\2\2\2\u01a2\u01a4\7\f\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\7)"+
		"\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\5\16\b\2\u01ad\u01ac\3"+
		"\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\5\20\t\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\7"+
		"+\2\2\u01b4\u01b5\7\24\2\2\u01b5\u01b7\5 \21\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01ba\5\"\22\2\u01b9\u019e\3"+
		"\2\2\2\u01b9\u01b8\3\2\2\2\u01ba!\3\2\2\2\u01bb\u01bc\7\7\2\2\u01bc\u01bd"+
		"\7+\2\2\u01bd\u01bf\7&\2\2\u01be\u01c0\7\63\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c4\7+\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c6\7\24\2\2\u01c6"+
		"\u01c8\5\"\22\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01d8\3"+
		"\2\2\2\u01c9\u01ca\7\f\2\2\u01ca\u01cb\7+\2\2\u01cb\u01cd\7&\2\2\u01cc"+
		"\u01ce\7\63\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01cd\3"+
		"\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7\64\2\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d4\7\24\2\2\u01d4\u01d6\5\"\22\2\u01d5\u01d3\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01bb\3\2\2\2\u01d7"+
		"\u01c9\3\2\2\2\u01d8#\3\2\2\2\u01d9\u01da\5\b\5\2\u01da\u01db\5$\23\2"+
		"\u01db\u01e1\3\2\2\2\u01dc\u01dd\5\6\4\2\u01dd\u01de\5$\23\2\u01de\u01e1"+
		"\3\2\2\2\u01df\u01e1\5&\24\2\u01e0\u01d9\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e1%\3\2\2\2\u01e2\u01e3\7\35\2\2\u01e3\u01eb\7!\2\2"+
		"\u01e4\u01e5\5(\25\2\u01e5\u01e6\5&\24\2\u01e6\u01eb\3\2\2\2\u01e7\u01e8"+
		"\5F$\2\u01e8\u01e9\5&\24\2\u01e9\u01eb\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea"+
		"\u01e4\3\2\2\2\u01ea\u01e7\3\2\2\2\u01eb\'\3\2\2\2\u01ec\u01ed\5*\26\2"+
		"\u01ed\u01ee\7!\2\2\u01ee\u01ef\5(\25\2\u01ef\u01f9\3\2\2\2\u01f0\u01f9"+
		"\7!\2\2\u01f1\u01f2\7\34\2\2\u01f2\u01f3\7!\2\2\u01f3\u01f4\5(\25\2\u01f4"+
		"\u01f5\7!\2\2\u01f5\u01f6\7\35\2\2\u01f6\u01f7\7!\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01ec\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f1\3\2\2\2\u01f9"+
		")\3\2\2\2\u01fa\u0201\5,\27\2\u01fb\u0201\5\64\33\2\u01fc\u0201\5\66\34"+
		"\2\u01fd\u0201\58\35\2\u01fe\u0201\5:\36\2\u01ff\u0201\5<\37\2\u0200\u01fa"+
		"\3\2\2\2\u0200\u01fb\3\2\2\2\u0200\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201+\3\2\2\2\u0202\u0203\7\3\2\2"+
		"\u0203\u0204\5\62\32\2\u0204\u0205\7!\2\2\u0205\u0206\5*\26\2\u0206\u020e"+
		"\7!\2\2\u0207\u0209\5.\30\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5\60"+
		"\31\2\u020d\u020f\3\2\2\2\u020e\u0208\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0221\3\2\2\2\u0210\u0211\7\3\2\2\u0211\u0212\5\62\32\2\u0212\u0213\7"+
		"\34\2\2\u0213\u0214\7!\2\2\u0214\u0215\5(\25\2\u0215\u0216\7\35\2\2\u0216"+
		"\u021e\7!\2\2\u0217\u0219\5.\30\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\5\60\31\2\u021d\u021f\3\2\2\2\u021e\u0218\3\2\2\2\u021e\u021f\3"+
		"\2\2\2\u021f\u0221\3\2\2\2\u0220\u0202\3\2\2\2\u0220\u0210\3\2\2\2\u0221"+
		"-\3\2\2\2\u0222\u0223\7\4\2\2\u0223\u0224\5\62\32\2\u0224\u0225\7!\2\2"+
		"\u0225\u0226\5*\26\2\u0226\u0227\7!\2\2\u0227\u0231\3\2\2\2\u0228\u0229"+
		"\7\4\2\2\u0229\u022a\5\62\32\2\u022a\u022b\7\34\2\2\u022b\u022c\7!\2\2"+
		"\u022c\u022d\5(\25\2\u022d\u022e\7\35\2\2\u022e\u022f\7!\2\2\u022f\u0231"+
		"\3\2\2\2\u0230\u0222\3\2\2\2\u0230\u0228\3\2\2\2\u0231/\3\2\2\2\u0232"+
		"\u0233\7\5\2\2\u0233\u0234\5\62\32\2\u0234\u0235\7!\2\2\u0235\u0236\5"+
		"*\26\2\u0236\u023e\7!\2\2\u0237\u0239\5.\30\2\u0238\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u023d\5\60\31\2\u023d\u023f\3\2\2\2\u023e\u0238\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0251\3\2\2\2\u0240\u0241\7\5\2\2\u0241\u0242\5\62"+
		"\32\2\u0242\u0243\7\34\2\2\u0243\u0244\7!\2\2\u0244\u0245\5(\25\2\u0245"+
		"\u0246\7\35\2\2\u0246\u024e\7!\2\2\u0247\u0249\5.\30\2\u0248\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024d\5\60\31\2\u024d\u024f\3\2\2\2\u024e\u0248\3"+
		"\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0232\3\2\2\2\u0250"+
		"\u0240\3\2\2\2\u0251\61\3\2\2\2\u0252\u0255\58\35\2\u0253\u0255\5> \2"+
		"\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255\63\3\2\2\2\u0256\u0258"+
		"\7+\2\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\5@!\2\u025c\u025d\3\2\2"+
		"\2\u025d\u025e\7\'\2\2\u025e\u025f\7\6\2\2\u025f\u0260\7\65\2\2\u0260"+
		"\u0261\7\26\2\2\u0261\u0262\5\32\16\2\u0262\u0263\7\26\2\2\u0263\u0264"+
		"\7!\2\2\u0264\u0265\5*\26\2\u0265\u027a\3\2\2\2\u0266\u0268\7+\2\2\u0267"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2"+
		"\2\2\u026a\u026b\3\2\2\2\u026b\u026c\5@!\2\u026c\u026d\3\2\2\2\u026d\u026e"+
		"\7\'\2\2\u026e\u026f\7\6\2\2\u026f\u0270\7\65\2\2\u0270\u0271\7\26\2\2"+
		"\u0271\u0272\5\32\16\2\u0272\u0273\7\26\2\2\u0273\u0274\7\34\2\2\u0274"+
		"\u0275\7!\2\2\u0275\u0276\5(\25\2\u0276\u0277\7\35\2\2\u0277\u0278\7!"+
		"\2\2\u0278\u027a\3\2\2\2\u0279\u0257\3\2\2\2\u0279\u0267\3\2\2\2\u027a"+
		"\65\3\2\2\2\u027b\u027c\7+\2\2\u027c\u027d\7\36\2\2\u027d\u027e\5D#\2"+
		"\u027e\u027f\7\37\2\2\u027f\u0280\7!\2\2\u0280\u028a\3\2\2\2\u0281\u0282"+
		"\7+\2\2\u0282\u0283\7\'\2\2\u0283\u0284\7+\2\2\u0284\u0285\7\36\2\2\u0285"+
		"\u0286\5D#\2\u0286\u0287\7\37\2\2\u0287\u0288\7!\2\2\u0288\u028a\3\2\2"+
		"\2\u0289\u027b\3\2\2\2\u0289\u0281\3\2\2\2\u028a\67\3\2\2\2\u028b\u028c"+
		"\7+\2\2\u028c\u028d\7&\2\2\u028d\u028e\5> \2\u028e\u028f\7!\2\2\u028f"+
		"\u029a\3\2\2\2\u0290\u0291\7+\2\2\u0291\u0292\7&\2\2\u0292\u0293\5B\""+
		"\2\u0293\u0294\7!\2\2\u0294\u029a\3\2\2\2\u0295\u0296\7+\2\2\u0296\u029a"+
		"\7\20\2\2\u0297\u0298\7+\2\2\u0298\u029a\7\21\2\2\u0299\u028b\3\2\2\2"+
		"\u0299\u0290\3\2\2\2\u0299\u0295\3\2\2\2\u0299\u0297\3\2\2\2\u029a9\3"+
		"\2\2\2\u029b\u029c\7\66\2\2\u029c\u029d\7\36\2\2\u029d\u029e\5> \2\u029e"+
		"\u029f\7\37\2\2\u029f\u02a0\7!\2\2\u02a0;\3\2\2\2\u02a1\u02a2\5\62\32"+
		"\2\u02a2\u02a3\7\22\2\2\u02a3\u02a4\5*\26\2\u02a4\u02a5\7\23\2\2\u02a5"+
		"\u02a6\5*\26\2\u02a6\u02a7\7!\2\2\u02a7=\3\2\2\2\u02a8\u02a9\b \1\2\u02a9"+
		"\u02aa\7\36\2\2\u02aa\u02ab\5> \2\u02ab\u02ac\7\37\2\2\u02ac\u02cc\3\2"+
		"\2\2\u02ad\u02af\7\13\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\25"+
		"\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02cc\5> \n\u02b5\u02b7\7\63\2\2\u02b6"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02bc\5\66\34\2\u02bb\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3\2"+
		"\2\2\u02bf\u02c1\7+\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c6\5<"+
		"\37\2\u02c5\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\58\35\2\u02ca\u02cc\3\2"+
		"\2\2\u02cb\u02a8\3\2\2\2\u02cb\u02ae\3\2\2\2\u02cb\u02b6\3\2\2\2\u02cc"+
		"\u02f3\3\2\2\2\u02cd\u02cf\f\t\2\2\u02ce\u02d0\7\b\2\2\u02cf\u02ce\3\2"+
		"\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d4\7\t\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02f2\5>"+
		" \n\u02d6\u02d8\f\b\2\2\u02d7\u02d9\7\13\2\2\u02d8\u02d7\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\u02dd\7\n\2\2\u02dd\u02de\3\2\2\2\u02de\u02f2\5> \t\u02df\u02e1"+
		"\f\7\2\2\u02e0\u02e2\7$\2\2\u02e1\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\7%"+
		"\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02f2\5> \b\u02e8\u02e9\f\6\2\2\u02e9\u02ea"+
		"\7\67\2\2\u02ea\u02f2\5> \7\u02eb\u02ec\f\5\2\2\u02ec\u02ed\78\2\2\u02ed"+
		"\u02f2\5> \6\u02ee\u02ef\f\4\2\2\u02ef\u02f0\79\2\2\u02f0\u02f2\5> \5"+
		"\u02f1\u02cd\3\2\2\2\u02f1\u02d6\3\2\2\2\u02f1\u02df\3\2\2\2\u02f1\u02e8"+
		"\3\2\2\2\u02f1\u02eb\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4?\3\2\2\2\u02f5\u02f3\3\2\2\2"+
		"\u02f6\u02f7\7\36\2\2\u02f7\u02f8\5> \2\u02f8\u02f9\7\'\2\2\u02f9\u02fa"+
		"\7\'\2\2\u02fa\u02fb\5> \2\u02fb\u02fc\7\37\2\2\u02fcA\3\2\2\2\u02fd\u02fe"+
		"\7)\2\2\u02fe\u02ff\7\'\2\2\u02ff\u0300\7\36\2\2\u0300\u0301\5D#\2\u0301"+
		"\u0302\7\37\2\2\u0302\u0303\7!\2\2\u0303C\3\2\2\2\u0304\u030b\3\2\2\2"+
		"\u0305\u0308\5> \2\u0306\u0307\7\24\2\2\u0307\u0309\5D#\2\u0308\u0306"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0304\3\2\2\2\u030a"+
		"\u0305\3\2\2\2\u030bE\3\2\2\2\u030c\u030d\7:\2\2\u030d\u030e\5> \2\u030e"+
		"G\3\2\2\2^IW\\afkt|\u0081\u0086\u008f\u0096\u009b\u00a1\u00aa\u00b0\u00b6"+
		"\u00c2\u00cd\u00d7\u00dc\u00e1\u00e6\u00ee\u00f3\u00f8\u00fd\u0106\u0119"+
		"\u011f\u012e\u0133\u0138\u013d\u0142\u014b\u0153\u0158\u015d\u0166\u016d"+
		"\u0172\u017c\u0182\u0187\u018c\u0191\u01a0\u01a5\u01aa\u01af\u01b6\u01b9"+
		"\u01c1\u01c7\u01cf\u01d5\u01d7\u01e0\u01ea\u01f8\u0200\u020a\u020e\u021a"+
		"\u021e\u0220\u0230\u023a\u023e\u024a\u024e\u0250\u0254\u0259\u0269\u0279"+
		"\u0289\u0299\u02b0\u02b8\u02bd\u02c2\u02c7\u02cb\u02d1\u02da\u02e3\u02f1"+
		"\u02f3\u0308\u030a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}