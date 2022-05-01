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
		WS=1, ONELINE_COMMENT=2, RETURN=3, PRINT=4, DO=5, BOOL_VALUE=6, IF=7, 
		ELSE=8, ELSE_IF=9, INIT=10, EACH=11, INT=12, NEW_WORD=13, DIVIDE=14, TIMES=15, 
		PLUS=16, MINUS=17, BOOL=18, VOID=19, FPTR=20, PLUS_PLUS=21, MINUS_MINUS=22, 
		QUESTION_MARK=23, COLON=24, COMMA=25, NOT=26, ABS_SIGN=27, CLASS=28, SELF_SMALL_NAME=29, 
		ACCESS_TYPE=30, RBRACK=31, LBRACK=32, LCURL=33, RCURL=34, LPAR=35, RPAR=36, 
		ARROW=37, NEW_LINE=38, BEGIN_COMMENT=39, END_COMMENT=40, LT=41, GT=42, 
		IS_EQUAL=43, EQUAL=44, DOT=45, SHARP_SIGN=46, SET=47, CAP_NAME=48, NUM=49, 
		ADD=50, MERGE=51, INCLUDE=52, DELETE=53, SMALL_NAME=54, AND_AND=55, OR_OR=56, 
		Unknown=57, STRING=58, VAR_DEC=59;
	public static final int
		RULE_simpleLoop = 0, RULE_start_prog = 1, RULE_var_dec = 2, RULE_comment = 3, 
		RULE_class_dec = 4, RULE_prog_body = 5, RULE_set_dec = 6, RULE_set_op = 7, 
		RULE_loop_arr = 8, RULE_func_var = 9, RULE_begin_class = 10, RULE_init_dec = 11, 
		RULE_init_begin = 12, RULE_func_dec = 13, RULE_argumants = 14, RULE_default_argumants = 15, 
		RULE_func_begin = 16, RULE_scop_body = 17, RULE_line_command = 18, RULE_func_call = 19, 
		RULE_if_state = 20, RULE_my_else = 21, RULE_else_if = 22, RULE_for_loop = 23, 
		RULE_print = 24, RULE_expr = 25, RULE_ternery_expr = 26, RULE_or_or_expr = 27, 
		RULE_and_and_expr = 28, RULE_is_equal_expr = 29, RULE_comp_expr = 30, 
		RULE_sn_expr = 31, RULE_md_expr = 32, RULE_single_expr = 33, RULE_inneg_expr = 34, 
		RULE_arr_expr = 35, RULE_dot_expr = 36, RULE_par_expr = 37, RULE_name_expr = 38, 
		RULE_sequence = 39, RULE_my_new = 40, RULE_func_input = 41, RULE_my_return = 42, 
		RULE_var = 43, RULE_ext = 44, RULE_const_expr = 45, RULE_const_expr_prime = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLoop", "start_prog", "var_dec", "comment", "class_dec", "prog_body", 
			"set_dec", "set_op", "loop_arr", "func_var", "begin_class", "init_dec", 
			"init_begin", "func_dec", "argumants", "default_argumants", "func_begin", 
			"scop_body", "line_command", "func_call", "if_state", "my_else", "else_if", 
			"for_loop", "print", "expr", "ternery_expr", "or_or_expr", "and_and_expr", 
			"is_equal_expr", "comp_expr", "sn_expr", "md_expr", "single_expr", "inneg_expr", 
			"arr_expr", "dot_expr", "par_expr", "name_expr", "sequence", "my_new", 
			"func_input", "my_return", "var", "ext", "const_expr", "const_expr_prime"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'return'", "'print'", "'do'", null, "'if'", "'else'", 
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
			null, "WS", "ONELINE_COMMENT", "RETURN", "PRINT", "DO", "BOOL_VALUE", 
			"IF", "ELSE", "ELSE_IF", "INIT", "EACH", "INT", "NEW_WORD", "DIVIDE", 
			"TIMES", "PLUS", "MINUS", "BOOL", "VOID", "FPTR", "PLUS_PLUS", "MINUS_MINUS", 
			"QUESTION_MARK", "COLON", "COMMA", "NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", 
			"ACCESS_TYPE", "RBRACK", "LBRACK", "LCURL", "RCURL", "LPAR", "RPAR", 
			"ARROW", "NEW_LINE", "BEGIN_COMMENT", "END_COMMENT", "LT", "GT", "IS_EQUAL", 
			"EQUAL", "DOT", "SHARP_SIGN", "SET", "CAP_NAME", "NUM", "ADD", "MERGE", 
			"INCLUDE", "DELETE", "SMALL_NAME", "AND_AND", "OR_OR", "Unknown", "STRING", 
			"VAR_DEC"
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(94);
				start_prog();
				}
				break;
			}
			setState(97);
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
		public List<TerminalNode> NEW_LINE() { return getTokens(SimpleLOOPParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SimpleLOOPParser.NEW_LINE, i);
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
		int _la;
		try {
			int _alt;
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				var_dec();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BEGIN_COMMENT || _la==SHARP_SIGN) {
					{
					setState(100);
					comment();
					}
				}

				setState(104); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(103);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(106); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(108);
				start_prog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				comment();
				setState(112); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(111);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(114); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(116);
				start_prog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				class_dec();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BEGIN_COMMENT || _la==SHARP_SIGN) {
					{
					setState(119);
					comment();
					}
				}

				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(127);
				prog_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(129);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(134);
				start_prog();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				var_dec();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BEGIN_COMMENT || _la==SHARP_SIGN) {
					{
					setState(136);
					comment();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				comment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(144);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(145);
				match(BOOL);
				}
				break;
			case CAP_NAME:
				{
				setState(146);
				match(CAP_NAME);
				}
				break;
			case SET:
				{
				setState(147);
				set_dec();
				}
				break;
			case FPTR:
				{
				setState(148);
				func_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(151);
				match(LBRACK);
				setState(152);
				expr();
				setState(153);
				match(RBRACK);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
			System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				((Var_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("VarDec : " + (((Var_decContext)_localctx).SMALL_NAME!=null?((Var_decContext)_localctx).SMALL_NAME.getText():null));
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(165);
					comment();
					}
					break;
				}
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(173);
				comment();
				}
				break;
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
		public List<TerminalNode> BEGIN_COMMENT() { return getTokens(SimpleLOOPParser.BEGIN_COMMENT); }
		public TerminalNode BEGIN_COMMENT(int i) {
			return getToken(SimpleLOOPParser.BEGIN_COMMENT, i);
		}
		public List<TerminalNode> END_COMMENT() { return getTokens(SimpleLOOPParser.END_COMMENT); }
		public TerminalNode END_COMMENT(int i) {
			return getToken(SimpleLOOPParser.END_COMMENT, i);
		}
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHARP_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(SHARP_SIGN);
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						matchWildcard();
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case BEGIN_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(BEGIN_COMMENT);
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(184);
						match(NEW_LINE);
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(190);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==BEGIN_COMMENT || _la==END_COMMENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(196);
					match(NEW_LINE);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(CLASS);
				setState(206);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(208);
					match(LT);
					setState(209);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(213);
					match(NEW_LINE);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(LCURL);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(220);
						match(NEW_LINE);
						}
						}
						setState(223); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(225);
					begin_class();
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BEGIN_COMMENT || _la==SHARP_SIGN) {
						{
						setState(226);
						comment();
						}
					}

					}
					break;
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(231);
					match(NEW_LINE);
					}
					}
					setState(234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(236);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(CLASS);
				setState(238);
				((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
				System.out.println("ClassDec : " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null)); String class_before = (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(240);
					match(LT);
					setState(241);
					((Class_decContext)_localctx).CAP_NAME = match(CAP_NAME);
					System.out.println("Inheritance : " + class_before + " < " + (((Class_decContext)_localctx).CAP_NAME!=null?((Class_decContext)_localctx).CAP_NAME.getText():null) );
					}
				}

				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(245);
						match(NEW_LINE);
						}
						} 
					}
					setState(250);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(251);
					comment();
					}
					break;
				case 2:
					{
					setState(252);
					match(ACCESS_TYPE);
					setState(253);
					var_dec();
					}
					break;
				case 3:
					{
					setState(254);
					init_dec();
					}
					break;
				case 4:
					{
					setState(255);
					func_dec();
					}
					break;
				}
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(258);
					comment();
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				class_dec();
				setState(265); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(264);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(267); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(269);
				prog_body();
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(270);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				comment();
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(274);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(279);
				prog_body();
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(280);
					comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(283);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(286); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(288);
				prog_body();
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(289);
					comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				class_dec();
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(293);
					comment();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				comment();
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(297);
					comment();
					}
					break;
				}
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
			setState(303);
			match(SET);
			setState(304);
			match(LT);
			setState(305);
			match(INT);
			setState(306);
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
		public Loop_arrContext loop_arr() {
			return getRuleContext(Loop_arrContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
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
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(SET);
				setState(309);
				match(DOT);
				setState(310);
				match(NEW_WORD);
				System.out.println("NEW");
				setState(312);
				match(LPAR);
				setState(313);
				loop_arr();
				setState(314);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				var();
				setState(317);
				match(DOT);
				setState(318);
				match(ADD);
				System.out.println("ADD");
				setState(320);
				match(LPAR);
				setState(321);
				expr();
				setState(322);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				var();
				setState(325);
				match(DOT);
				setState(326);
				match(MERGE);
				System.out.println("MERGE");
				setState(328);
				match(LPAR);
				setState(329);
				loop_arr();
				setState(330);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				var();
				setState(333);
				match(DOT);
				setState(334);
				match(INCLUDE);
				System.out.println("INCLUDE");
				setState(336);
				match(LPAR);
				setState(337);
				expr();
				setState(338);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				var();
				setState(341);
				match(DOT);
				setState(342);
				match(DELETE);
				System.out.println("DELETE");
				setState(344);
				match(LPAR);
				setState(345);
				expr();
				setState(346);
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

	public static class Loop_arrContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public Loop_arrContext loop_arr() {
			return getRuleContext(Loop_arrContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public Func_inputContext func_input() {
			return getRuleContext(Func_inputContext.class,0);
		}
		public Loop_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLoop_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLoop_arr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLoop_arr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_arrContext loop_arr() throws RecognitionException {
		Loop_arrContext _localctx = new Loop_arrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop_arr);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(LPAR);
				setState(351);
				loop_arr();
				setState(352);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(354);
					func_input();
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

	public static class Func_varContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LT() { return getToken(SimpleLOOPParser.LT, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode GT() { return getToken(SimpleLOOPParser.GT, 0); }
		public List<TerminalNode> VOID() { return getTokens(SimpleLOOPParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SimpleLOOPParser.VOID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
		enterRule(_localctx, 18, RULE_func_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(FPTR);
			setState(360);
			match(LT);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(361);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CAP_NAME:
				{
				{
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(362);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(363);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(364);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(365);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(366);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(369);
					match(LBRACK);
					setState(370);
					expr();
					setState(371);
					match(RBRACK);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(380);
				match(COMMA);
				setState(398);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(381);
					match(VOID);
					}
					break;
				case INT:
				case BOOL:
				case FPTR:
				case SET:
				case CAP_NAME:
					{
					{
					setState(387);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(382);
						match(INT);
						}
						break;
					case BOOL:
						{
						setState(383);
						match(BOOL);
						}
						break;
					case CAP_NAME:
						{
						setState(384);
						match(CAP_NAME);
						}
						break;
					case SET:
						{
						setState(385);
						set_dec();
						}
						break;
					case FPTR:
						{
						setState(386);
						func_var();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
						{
						setState(389);
						match(LBRACK);
						setState(390);
						expr();
						setState(391);
						match(RBRACK);
						}
						}
						setState(397);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(ARROW);
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(406);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CAP_NAME:
				{
				{
				setState(412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(407);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(408);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(409);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(410);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(411);
					func_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(414);
					match(LBRACK);
					setState(415);
					expr();
					setState(416);
					match(RBRACK);
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(425);
			match(GT);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(426);
				comment();
				}
				break;
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
		enterRule(_localctx, 20, RULE_begin_class);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				comment();
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(430);
					match(NEW_LINE);
					}
					}
					setState(433); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(435);
				begin_class();
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(436);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(ACCESS_TYPE);
				setState(440);
				var_dec();
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(441);
					match(NEW_LINE);
					}
					}
					setState(444); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(446);
				begin_class();
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(447);
					comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				init_dec();
				setState(452); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(451);
					match(NEW_LINE);
					}
					}
					setState(454); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(456);
				begin_class();
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(457);
					comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				func_dec();
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(461);
					match(NEW_LINE);
					}
					}
					setState(464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(466);
				begin_class();
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(467);
					comment();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				comment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471);
				match(ACCESS_TYPE);
				setState(472);
				var_dec();
				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(473);
					comment();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(476);
				init_dec();
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(477);
					comment();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(480);
				func_dec();
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(481);
					comment();
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
		public Line_commandContext line_command() {
			return getRuleContext(Line_commandContext.class,0);
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
		enterRule(_localctx, 22, RULE_init_dec);
		int _la;
		try {
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(ACCESS_TYPE);
				setState(487);
				match(INIT);
				setState(488);
				match(LPAR);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(489);
					argumants();
					}
				}

				setState(492);
				match(RPAR);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(493);
					match(NEW_LINE);
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
				match(LCURL);
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(501); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(500);
						match(NEW_LINE);
						}
						}
						setState(503); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(505);
					init_begin();
					}
					break;
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(508);
					match(NEW_LINE);
					}
					}
					setState(511); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(513);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(ACCESS_TYPE);
				setState(515);
				match(INIT);
				setState(516);
				match(LPAR);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(517);
					argumants();
					}
				}

				setState(520);
				match(RPAR);
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(521);
					match(NEW_LINE);
					}
					}
					setState(524); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(526);
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

	public static class Init_beginContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
		enterRule(_localctx, 24, RULE_init_begin);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				comment();
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(530);
					match(NEW_LINE);
					}
					}
					setState(533); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(535);
				init_begin();
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(536);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				var_dec();
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(540);
					match(NEW_LINE);
					}
					}
					setState(543); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(545);
				init_begin();
				setState(547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(546);
					comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				scop_body();
				setState(551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(550);
					comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				comment();
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(554);
					comment();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(557);
				var_dec();
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(558);
					comment();
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
		enterRule(_localctx, 26, RULE_func_dec);
		int _la;
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(ACCESS_TYPE);
				setState(570);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(564);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(565);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(566);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(567);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(568);
					match(CAP_NAME);
					}
					break;
				case FPTR:
					{
					setState(569);
					func_var();
					}
					break;
				case LBRACK:
				case SMALL_NAME:
					break;
				default:
					break;
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(572);
					match(LBRACK);
					setState(573);
					expr();
					setState(574);
					match(RBRACK);
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(583);
				match(LPAR);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(584);
					argumants();
					}
				}

				setState(587);
				match(RPAR);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(588);
					match(NEW_LINE);
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(LCURL);
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(596); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(595);
						match(NEW_LINE);
						}
						}
						setState(598); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(600);
					func_begin();
					}
					break;
				}
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(603);
					match(NEW_LINE);
					}
					}
					setState(606); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(608);
				match(RCURL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(ACCESS_TYPE);
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(610);
					match(VOID);
					}
					break;
				case INT:
					{
					setState(611);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(612);
					match(BOOL);
					}
					break;
				case SET:
					{
					setState(613);
					set_dec();
					}
					break;
				case CAP_NAME:
					{
					setState(614);
					match(CAP_NAME);
					}
					break;
				case FPTR:
					{
					setState(615);
					func_var();
					}
					break;
				case LBRACK:
				case SMALL_NAME:
					break;
				default:
					break;
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(618);
					match(LBRACK);
					setState(619);
					expr();
					setState(620);
					match(RBRACK);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
				((Func_decContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("MethodDec : " + (((Func_decContext)_localctx).SMALL_NAME!=null?((Func_decContext)_localctx).SMALL_NAME.getText():null));
				setState(629);
				match(LPAR);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << VOID) | (1L << FPTR) | (1L << SET) | (1L << CAP_NAME))) != 0)) {
					{
					setState(630);
					argumants();
					}
				}

				setState(633);
				match(RPAR);
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(634);
					match(NEW_LINE);
					}
					}
					setState(637); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(639);
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
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
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
		enterRule(_localctx, 28, RULE_argumants);
		int _la;
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(642);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(643);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(644);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(645);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(646);
					func_var();
					}
					break;
				case VOID:
					{
					setState(647);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(650);
					match(LBRACK);
					setState(651);
					expr();
					setState(652);
					match(RBRACK);
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(659);
				((ArgumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				System.out.println("ArgumentDec : " + (((ArgumantsContext)_localctx).SMALL_NAME!=null?((ArgumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(661);
					match(COMMA);
					setState(662);
					argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
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
		public TerminalNode SMALL_NAME() { return getToken(SimpleLOOPParser.SMALL_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public TerminalNode COMMA() { return getToken(SimpleLOOPParser.COMMA, 0); }
		public Default_argumantsContext default_argumants() {
			return getRuleContext(Default_argumantsContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_default_argumants);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(668);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(669);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(670);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(671);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(672);
					func_var();
					}
					break;
				case VOID:
					{
					setState(673);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(676);
					match(LBRACK);
					setState(677);
					expr();
					setState(678);
					match(RBRACK);
					}
					}
					setState(684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(685);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(686);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(688);
				expr();
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(689);
					match(COMMA);
					setState(690);
					default_argumants();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(693);
					match(INT);
					}
					break;
				case BOOL:
					{
					setState(694);
					match(BOOL);
					}
					break;
				case CAP_NAME:
					{
					setState(695);
					match(CAP_NAME);
					}
					break;
				case SET:
					{
					setState(696);
					set_dec();
					}
					break;
				case FPTR:
					{
					setState(697);
					func_var();
					}
					break;
				case VOID:
					{
					setState(698);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(701);
					match(LBRACK);
					setState(702);
					expr();
					setState(703);
					match(RBRACK);
					}
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(710);
				((Default_argumantsContext)_localctx).SMALL_NAME = match(SMALL_NAME);
				setState(711);
				match(EQUAL);
				System.out.println("ArgumentDec : " + (((Default_argumantsContext)_localctx).SMALL_NAME!=null?((Default_argumantsContext)_localctx).SMALL_NAME.getText():null));
				setState(713);
				expr();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(714);
					match(COMMA);
					setState(715);
					default_argumants();
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

	public static class Func_beginContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
		enterRule(_localctx, 32, RULE_func_begin);
		int _la;
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				comment();
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(721);
					match(NEW_LINE);
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(726);
				func_begin();
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(727);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				var_dec();
				setState(732); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(731);
					match(NEW_LINE);
					}
					}
					setState(734); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(736);
				func_begin();
				setState(738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(737);
					comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				scop_body();
				setState(742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(741);
					comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(744);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(745);
				var_dec();
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(746);
					comment();
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

	public static class Scop_bodyContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
		enterRule(_localctx, 34, RULE_scop_body);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				comment();
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
				setState(757);
				scop_body();
				setState(759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(758);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				line_command();
				setState(763); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(762);
					match(NEW_LINE);
					}
					}
					setState(765); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(767);
				scop_body();
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(768);
					comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				line_command();
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(772);
					comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
		enterRule(_localctx, 36, RULE_line_command);
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				if_state();
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(779);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				for_loop();
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(783);
					comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				print();
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(787);
					comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
				my_return();
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(791);
					comment();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(794);
				func_call();
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(795);
					comment();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(798);
				set_op();
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(799);
					comment();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(802);
				expr();
				setState(804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(803);
					comment();
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
		enterRule(_localctx, 38, RULE_func_call);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(LPAR);
				setState(809);
				func_call();
				setState(810);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("MethodCall");
				setState(813);
				var();
				setState(814);
				match(LPAR);
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(815);
					func_input();
					}
				}

				setState(818);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.println("MethodCall");
				setState(821);
				var();
				setState(822);
				match(DOT);
				setState(823);
				match(INIT);
				setState(824);
				match(LPAR);
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(825);
					func_input();
					}
				}

				setState(828);
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
		enterRule(_localctx, 40, RULE_if_state);
		int _la;
		try {
			int _alt;
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(834);
				expr();
				setState(836); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(835);
					match(NEW_LINE);
					}
					}
					setState(838); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(840);
				line_command();
				setState(842); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(841);
					match(NEW_LINE);
					}
					}
					setState(844); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(848);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(846);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(847);
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
				setState(850);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(852);
				expr();
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(853);
					match(NEW_LINE);
					}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859);
				match(LCURL);
				setState(861); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(860);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(863); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(865);
					scop_body();
					}
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
				setState(875); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(874);
					match(NEW_LINE);
					}
					}
					setState(877); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(881);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(879);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(880);
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
				setState(883);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(885);
				expr();
				setState(887); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(886);
					match(NEW_LINE);
					}
					}
					setState(889); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(891);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(893);
				match(IF);
				System.out.println("Conditional : " + "if");
				setState(895);
				expr();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(896);
					match(NEW_LINE);
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(902);
				match(LCURL);
				setState(904); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(903);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(906); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(908);
					scop_body();
					}
				}

				setState(912); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(911);
					match(NEW_LINE);
					}
					}
					setState(914); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(916);
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
		enterRule(_localctx, 42, RULE_my_else);
		int _la;
		try {
			int _alt;
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(923); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(922);
					match(NEW_LINE);
					}
					}
					setState(925); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(927);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				match(ELSE);
				System.out.println("Conditional : " + "else");
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(930);
					match(NEW_LINE);
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				match(LCURL);
				setState(938); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(937);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(940); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(942);
					scop_body();
					}
				}

				setState(946); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(945);
					match(NEW_LINE);
					}
					}
					setState(948); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(950);
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
		enterRule(_localctx, 44, RULE_else_if);
		int _la;
		try {
			int _alt;
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(955);
				expr();
				setState(957); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(956);
					match(NEW_LINE);
					}
					}
					setState(959); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(961);
				line_command();
				setState(963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(962);
					match(NEW_LINE);
					}
					}
					setState(965); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(969);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(967);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(968);
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
				setState(971);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(973);
				expr();
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(974);
					match(NEW_LINE);
					}
					}
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(980);
				match(LCURL);
				setState(982); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(981);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(984); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(986);
					scop_body();
					}
				}

				setState(990); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(989);
					match(NEW_LINE);
					}
					}
					setState(992); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(994);
				match(RCURL);
				setState(996); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(995);
					match(NEW_LINE);
					}
					}
					setState(998); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(1002);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(1000);
					my_else();
					}
					break;
				case ELSE_IF:
					{
					setState(1001);
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
				setState(1004);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(1006);
				expr();
				setState(1008); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1007);
					match(NEW_LINE);
					}
					}
					setState(1010); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(1012);
				line_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				match(ELSE_IF);
				System.out.println("Conditional : " + "elsif");
				setState(1016);
				expr();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(1017);
					match(NEW_LINE);
					}
					}
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1023);
				match(LCURL);
				setState(1025); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1024);
						match(NEW_LINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1027); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << BOOL_VALUE) | (1L << IF) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << BEGIN_COMMENT) | (1L << SHARP_SIGN) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(1029);
					scop_body();
					}
				}

				setState(1033); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1032);
					match(NEW_LINE);
					}
					}
					setState(1035); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(1037);
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
		enterRule(_localctx, 46, RULE_for_loop);
		int _la;
		try {
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1041);
					var();
					}
					break;
				case 2:
					{
					setState(1042);
					sequence();
					}
					break;
				}
				setState(1045);
				match(DOT);
				setState(1046);
				match(EACH);
				setState(1047);
				match(DO);
				setState(1048);
				match(ABS_SIGN);
				setState(1049);
				var();
				setState(1050);
				match(ABS_SIGN);
				setState(1052); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1051);
					match(NEW_LINE);
					}
					}
					setState(1054); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				System.out.println("Loop : " + "each");
				setState(1057);
				line_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1059);
					var();
					}
					break;
				case 2:
					{
					setState(1060);
					sequence();
					}
					break;
				}
				setState(1063);
				match(DOT);
				setState(1064);
				match(EACH);
				setState(1065);
				match(DO);
				setState(1066);
				match(ABS_SIGN);
				setState(1067);
				var();
				setState(1068);
				match(ABS_SIGN);
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(1069);
					match(NEW_LINE);
					}
					}
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("Loop : " + "each");
				setState(1076);
				match(LCURL);
				setState(1083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1078); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1077);
						match(NEW_LINE);
						}
						}
						setState(1080); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(1082);
					scop_body();
					}
					break;
				}
				setState(1086); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1085);
					match(NEW_LINE);
					}
					}
					setState(1088); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(1090);
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
		enterRule(_localctx, 48, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(PRINT);
			System.out.println("Built-in : " + "print");
			setState(1096);
			match(LPAR);
			setState(1097);
			expr();
			setState(1098);
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
		public TerminalNode EQUAL() { return getToken(SimpleLOOPParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 50, RULE_expr);
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				ternery_expr(0);
				setState(1101);
				match(EQUAL);
				setState(1102);
				expr();
				System.out.println("Operator : =");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				ternery_expr(0);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_ternery_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1109);
			or_or_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ternery_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ternery_expr);
					setState(1111);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1112);
					match(QUESTION_MARK);
					setState(1113);
					ternery_expr(0);
					setState(1114);
					match(COLON);
					setState(1115);
					or_or_expr(0);
					System.out.println("Operator : ?:");
					}
					} 
				}
				setState(1122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_or_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1124);
			and_and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_or_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_or_or_expr);
					setState(1126);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1127);
					match(OR_OR);
					setState(1128);
					and_and_expr(0);
					System.out.println("Operator : ||");
					}
					} 
				}
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_and_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1137);
			is_equal_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_and_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and_and_expr);
					setState(1139);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1140);
					match(AND_AND);
					setState(1141);
					is_equal_expr(0);
					System.out.println("Operator : &&");
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_is_equal_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1150);
			comp_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Is_equal_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_is_equal_expr);
					setState(1152);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1153);
					match(IS_EQUAL);
					setState(1154);
					comp_expr(0);
					System.out.println("Operator : ==");
					}
					} 
				}
				setState(1161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_comp_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1163);
			sn_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new Comp_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comp_expr);
						setState(1165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1166);
						match(LT);
						setState(1167);
						sn_expr(0);
						System.out.println("Operator : <");
						}
						break;
					case 2:
						{
						_localctx = new Comp_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comp_expr);
						setState(1170);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1171);
						match(GT);
						setState(1172);
						sn_expr(0);
						System.out.println("Operator : >");
						}
						break;
					}
					} 
				}
				setState(1179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_sn_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1181);
			md_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						_localctx = new Sn_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sn_expr);
						setState(1183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1184);
						match(PLUS);
						setState(1185);
						md_expr(0);
						System.out.println("Operator : +");
						}
						break;
					case 2:
						{
						_localctx = new Sn_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sn_expr);
						setState(1188);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1189);
						match(MINUS);
						setState(1190);
						md_expr(0);
						System.out.println("Operator : -");
						}
						break;
					}
					} 
				}
				setState(1197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_md_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1199);
			single_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(1213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new Md_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_md_expr);
						setState(1201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1202);
						match(TIMES);
						setState(1203);
						single_expr();
						System.out.println("Operator : *");
						}
						break;
					case 2:
						{
						_localctx = new Md_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_md_expr);
						setState(1206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1207);
						match(DIVIDE);
						setState(1208);
						single_expr();
						System.out.println("Operator : /");
						}
						break;
					}
					} 
				}
				setState(1215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
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
		enterRule(_localctx, 66, RULE_single_expr);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				match(NOT);
				setState(1217);
				single_expr();
				System.out.println("Operator : !");
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				match(MINUS);
				setState(1221);
				single_expr();
				System.out.println("Operator : -");
				}
				break;
			case BOOL_VALUE:
			case NEW_WORD:
			case BOOL:
			case FPTR:
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
				setState(1224);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_inneg_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1228);
			arr_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						_localctx = new Inneg_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inneg_expr);
						setState(1230);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1231);
						match(PLUS_PLUS);
						System.out.println("Operator : ++");
						}
						break;
					case 2:
						{
						_localctx = new Inneg_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inneg_expr);
						setState(1233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1234);
						match(MINUS_MINUS);
						System.out.println("Operator : --");
						}
						break;
					}
					} 
				}
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_arr_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_VALUE:
			case NEW_WORD:
			case BOOL:
			case FPTR:
			case SELF_SMALL_NAME:
			case LPAR:
			case SET:
			case CAP_NAME:
			case NUM:
			case SMALL_NAME:
			case STRING:
			case VAR_DEC:
				{
				setState(1242);
				dot_expr(0);
				}
				break;
			case LBRACK:
				{
				setState(1243);
				match(LBRACK);
				setState(1244);
				dot_expr(0);
				setState(1245);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arr_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arr_expr);
					setState(1249);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(1250);
					match(LBRACK);
					setState(1251);
					dot_expr(0);
					setState(1252);
					match(RBRACK);
					}
					} 
				}
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_dot_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1260);
				set_op();
				}
				break;
			case 2:
				{
				setState(1261);
				par_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dot_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dot_expr);
					setState(1264);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1265);
					match(DOT);
					setState(1266);
					par_expr(0);
					}
					} 
				}
				setState(1271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_par_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1273);
				match(LPAR);
				setState(1274);
				expr();
				setState(1275);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(1277);
				name_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Par_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_par_expr);
					setState(1280);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1281);
					match(LPAR);
					setState(1282);
					match(RPAR);
					}
					} 
				}
				setState(1287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
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
		public Func_varContext func_var() {
			return getRuleContext(Func_varContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_name_expr);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				match(NEW_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1290);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1291);
				match(SMALL_NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1292);
				match(CAP_NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1293);
				match(SET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1294);
				match(VAR_DEC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1295);
				match(NUM);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1296);
				var();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1297);
				match(BOOL_VALUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1298);
				func_var();
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
		enterRule(_localctx, 78, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(LPAR);
			setState(1302);
			expr();
			setState(1303);
			match(DOT);
			setState(1304);
			match(DOT);
			setState(1305);
			expr();
			setState(1306);
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
		enterRule(_localctx, 80, RULE_my_new);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(CAP_NAME);
			setState(1309);
			match(DOT);
			setState(1310);
			match(NEW_WORD);
			setState(1311);
			match(LPAR);
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
				{
				setState(1312);
				func_input();
				}
			}

			setState(1315);
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
		enterRule(_localctx, 82, RULE_func_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			expr();
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1318);
				match(COMMA);
				setState(1319);
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
		enterRule(_localctx, 84, RULE_my_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(RETURN);
			System.out.println("Return");
			setState(1324);
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
		enterRule(_localctx, 86, RULE_var);
		try {
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				match(SMALL_NAME);
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1327);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				match(SELF_SMALL_NAME);
				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1331);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1334);
				match(LPAR);
				setState(1335);
				match(SMALL_NAME);
				setState(1336);
				match(RPAR);
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1337);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1340);
				match(LPAR);
				setState(1341);
				match(SELF_SMALL_NAME);
				setState(1342);
				match(RPAR);
				setState(1344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1343);
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
		enterRule(_localctx, 88, RULE_ext);
		int _la;
		try {
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				match(LBRACK);
				setState(1349);
				expr();
				setState(1350);
				match(RBRACK);
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1351);
					ext();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				match(DOT);
				setState(1355);
				match(SMALL_NAME);
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1356);
					ext();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1359);
				match(DOT);
				setState(1360);
				_la = _input.LA(1);
				if ( !(_la==INIT || _la==SMALL_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1361);
				match(LPAR);
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(1362);
					func_input();
					}
				}

				setState(1365);
				match(RPAR);
				setState(1367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1366);
					ext();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1369);
				match(LPAR);
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_VALUE) | (1L << NEW_WORD) | (1L << MINUS) | (1L << BOOL) | (1L << FPTR) | (1L << NOT) | (1L << SELF_SMALL_NAME) | (1L << LBRACK) | (1L << LPAR) | (1L << SET) | (1L << CAP_NAME) | (1L << NUM) | (1L << SMALL_NAME) | (1L << STRING) | (1L << VAR_DEC))) != 0)) {
					{
					setState(1370);
					func_input();
					}
				}

				setState(1373);
				match(RPAR);
				setState(1375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1374);
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
		enterRule(_localctx, 90, RULE_const_expr);
		int _la;
		try {
			setState(1394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				match(LPAR);
				setState(1380);
				const_expr();
				setState(1381);
				match(RPAR);
				setState(1382);
				const_expr_prime();
				}
				break;
			case BOOL_VALUE:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				_la = _input.LA(1);
				if ( !(_la==BOOL_VALUE || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1385);
				const_expr_prime();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1386);
				match(MINUS);
				setState(1387);
				const_expr();
				setState(1388);
				const_expr_prime();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1390);
				match(NOT);
				setState(1391);
				const_expr();
				setState(1392);
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
		enterRule(_localctx, 92, RULE_const_expr_prime);
		int _la;
		try {
			setState(1427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				match(PLUS_PLUS);
				setState(1397);
				const_expr_prime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				match(MINUS_MINUS);
				setState(1399);
				const_expr_prime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1400);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==TIMES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1401);
				const_expr();
				setState(1402);
				const_expr_prime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1404);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1405);
				const_expr();
				setState(1406);
				const_expr_prime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1408);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1409);
				const_expr();
				setState(1410);
				const_expr_prime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1412);
				match(IS_EQUAL);
				setState(1413);
				const_expr();
				setState(1414);
				const_expr_prime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1416);
				match(AND_AND);
				setState(1417);
				const_expr();
				setState(1418);
				const_expr_prime();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1420);
				match(QUESTION_MARK);
				setState(1421);
				const_expr();
				setState(1422);
				match(COLON);
				setState(1423);
				const_expr();
				setState(1424);
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
		case 26:
			return ternery_expr_sempred((Ternery_exprContext)_localctx, predIndex);
		case 27:
			return or_or_expr_sempred((Or_or_exprContext)_localctx, predIndex);
		case 28:
			return and_and_expr_sempred((And_and_exprContext)_localctx, predIndex);
		case 29:
			return is_equal_expr_sempred((Is_equal_exprContext)_localctx, predIndex);
		case 30:
			return comp_expr_sempred((Comp_exprContext)_localctx, predIndex);
		case 31:
			return sn_expr_sempred((Sn_exprContext)_localctx, predIndex);
		case 32:
			return md_expr_sempred((Md_exprContext)_localctx, predIndex);
		case 34:
			return inneg_expr_sempred((Inneg_exprContext)_localctx, predIndex);
		case 35:
			return arr_expr_sempred((Arr_exprContext)_localctx, predIndex);
		case 36:
			return dot_expr_sempred((Dot_exprContext)_localctx, predIndex);
		case 37:
			return par_expr_sempred((Par_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ternery_expr_sempred(Ternery_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean or_or_expr_sempred(Or_or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_and_expr_sempred(And_and_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean is_equal_expr_sempred(Is_equal_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comp_expr_sempred(Comp_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sn_expr_sempred(Sn_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean md_expr_sempred(Md_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean inneg_expr_sempred(Inneg_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arr_expr_sempred(Arr_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean dot_expr_sempred(Dot_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean par_expr_sempred(Par_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0598\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2b\n\2\3\2\3\2\3\3\3\3\5\3h\n\3"+
		"\3\3\6\3k\n\3\r\3\16\3l\3\3\3\3\3\3\3\3\6\3s\n\3\r\3\16\3t\3\3\3\3\3\3"+
		"\3\3\5\3{\n\3\3\3\6\3~\n\3\r\3\16\3\177\3\3\3\3\3\3\6\3\u0085\n\3\r\3"+
		"\16\3\u0086\3\3\3\3\3\3\5\3\u008c\n\3\3\3\3\3\3\3\5\3\u0091\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u0098\n\4\3\4\3\4\3\4\3\4\7\4\u009e\n\4\f\4\16\4\u00a1"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a9\n\4\7\4\u00ab\n\4\f\4\16\4\u00ae"+
		"\13\4\3\4\5\4\u00b1\n\4\3\5\3\5\7\5\u00b5\n\5\f\5\16\5\u00b8\13\5\3\5"+
		"\3\5\7\5\u00bc\n\5\f\5\16\5\u00bf\13\5\3\5\7\5\u00c2\n\5\f\5\16\5\u00c5"+
		"\13\5\3\5\7\5\u00c8\n\5\f\5\16\5\u00cb\13\5\3\5\5\5\u00ce\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u00d6\n\6\3\6\7\6\u00d9\n\6\f\6\16\6\u00dc\13\6\3"+
		"\6\3\6\6\6\u00e0\n\6\r\6\16\6\u00e1\3\6\3\6\5\6\u00e6\n\6\5\6\u00e8\n"+
		"\6\3\6\6\6\u00eb\n\6\r\6\16\6\u00ec\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f6"+
		"\n\6\3\6\7\6\u00f9\n\6\f\6\16\6\u00fc\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u0103"+
		"\n\6\3\6\5\6\u0106\n\6\5\6\u0108\n\6\3\7\3\7\6\7\u010c\n\7\r\7\16\7\u010d"+
		"\3\7\3\7\5\7\u0112\n\7\3\7\3\7\6\7\u0116\n\7\r\7\16\7\u0117\3\7\3\7\5"+
		"\7\u011c\n\7\3\7\6\7\u011f\n\7\r\7\16\7\u0120\3\7\3\7\5\7\u0125\n\7\3"+
		"\7\3\7\5\7\u0129\n\7\3\7\3\7\5\7\u012d\n\7\3\7\5\7\u0130\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u015f\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0166"+
		"\n\n\5\n\u0168\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0172"+
		"\n\13\3\13\3\13\3\13\3\13\7\13\u0178\n\13\f\13\16\13\u017b\13\13\5\13"+
		"\u017d\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0186\n\13\3\13\3"+
		"\13\3\13\3\13\7\13\u018c\n\13\f\13\16\13\u018f\13\13\5\13\u0191\n\13\7"+
		"\13\u0193\n\13\f\13\16\13\u0196\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u019f\n\13\3\13\3\13\3\13\3\13\7\13\u01a5\n\13\f\13\16\13\u01a8"+
		"\13\13\5\13\u01aa\n\13\3\13\3\13\5\13\u01ae\n\13\3\f\3\f\6\f\u01b2\n\f"+
		"\r\f\16\f\u01b3\3\f\3\f\5\f\u01b8\n\f\3\f\3\f\3\f\6\f\u01bd\n\f\r\f\16"+
		"\f\u01be\3\f\3\f\5\f\u01c3\n\f\3\f\3\f\6\f\u01c7\n\f\r\f\16\f\u01c8\3"+
		"\f\3\f\5\f\u01cd\n\f\3\f\3\f\6\f\u01d1\n\f\r\f\16\f\u01d2\3\f\3\f\5\f"+
		"\u01d7\n\f\3\f\3\f\3\f\3\f\5\f\u01dd\n\f\3\f\3\f\5\f\u01e1\n\f\3\f\3\f"+
		"\5\f\u01e5\n\f\5\f\u01e7\n\f\3\r\3\r\3\r\3\r\5\r\u01ed\n\r\3\r\3\r\7\r"+
		"\u01f1\n\r\f\r\16\r\u01f4\13\r\3\r\3\r\6\r\u01f8\n\r\r\r\16\r\u01f9\3"+
		"\r\5\r\u01fd\n\r\3\r\6\r\u0200\n\r\r\r\16\r\u0201\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0209\n\r\3\r\3\r\6\r\u020d\n\r\r\r\16\r\u020e\3\r\5\r\u0212\n\r"+
		"\3\16\3\16\6\16\u0216\n\16\r\16\16\16\u0217\3\16\3\16\5\16\u021c\n\16"+
		"\3\16\3\16\6\16\u0220\n\16\r\16\16\16\u0221\3\16\3\16\5\16\u0226\n\16"+
		"\3\16\3\16\5\16\u022a\n\16\3\16\3\16\5\16\u022e\n\16\3\16\3\16\5\16\u0232"+
		"\n\16\5\16\u0234\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u023d\n"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0243\n\17\f\17\16\17\u0246\13\17\3\17\3"+
		"\17\3\17\3\17\5\17\u024c\n\17\3\17\3\17\7\17\u0250\n\17\f\17\16\17\u0253"+
		"\13\17\3\17\3\17\6\17\u0257\n\17\r\17\16\17\u0258\3\17\5\17\u025c\n\17"+
		"\3\17\6\17\u025f\n\17\r\17\16\17\u0260\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u026b\n\17\3\17\3\17\3\17\3\17\7\17\u0271\n\17\f\17\16\17"+
		"\u0274\13\17\3\17\3\17\3\17\3\17\5\17\u027a\n\17\3\17\3\17\6\17\u027e"+
		"\n\17\r\17\16\17\u027f\3\17\5\17\u0283\n\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u028b\n\20\3\20\3\20\3\20\3\20\7\20\u0291\n\20\f\20\16\20\u0294"+
		"\13\20\3\20\3\20\3\20\3\20\5\20\u029a\n\20\3\20\5\20\u029d\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u02a5\n\21\3\21\3\21\3\21\3\21\7\21\u02ab"+
		"\n\21\f\21\16\21\u02ae\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02b6"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02be\n\21\3\21\3\21\3\21\3\21"+
		"\7\21\u02c4\n\21\f\21\16\21\u02c7\13\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u02cf\n\21\5\21\u02d1\n\21\3\22\3\22\6\22\u02d5\n\22\r\22\16\22"+
		"\u02d6\3\22\3\22\5\22\u02db\n\22\3\22\3\22\6\22\u02df\n\22\r\22\16\22"+
		"\u02e0\3\22\3\22\5\22\u02e5\n\22\3\22\3\22\5\22\u02e9\n\22\3\22\3\22\3"+
		"\22\5\22\u02ee\n\22\5\22\u02f0\n\22\3\23\3\23\6\23\u02f4\n\23\r\23\16"+
		"\23\u02f5\3\23\3\23\5\23\u02fa\n\23\3\23\3\23\6\23\u02fe\n\23\r\23\16"+
		"\23\u02ff\3\23\3\23\5\23\u0304\n\23\3\23\3\23\5\23\u0308\n\23\3\23\5\23"+
		"\u030b\n\23\3\24\3\24\5\24\u030f\n\24\3\24\3\24\5\24\u0313\n\24\3\24\3"+
		"\24\5\24\u0317\n\24\3\24\3\24\5\24\u031b\n\24\3\24\3\24\5\24\u031f\n\24"+
		"\3\24\3\24\5\24\u0323\n\24\3\24\3\24\5\24\u0327\n\24\5\24\u0329\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0333\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u033d\n\25\3\25\3\25\5\25\u0341\n\25\3"+
		"\26\3\26\3\26\3\26\6\26\u0347\n\26\r\26\16\26\u0348\3\26\3\26\6\26\u034d"+
		"\n\26\r\26\16\26\u034e\3\26\3\26\5\26\u0353\n\26\3\26\3\26\3\26\3\26\7"+
		"\26\u0359\n\26\f\26\16\26\u035c\13\26\3\26\3\26\6\26\u0360\n\26\r\26\16"+
		"\26\u0361\3\26\5\26\u0365\n\26\3\26\6\26\u0368\n\26\r\26\16\26\u0369\3"+
		"\26\3\26\6\26\u036e\n\26\r\26\16\26\u036f\3\26\3\26\5\26\u0374\n\26\3"+
		"\26\3\26\3\26\3\26\6\26\u037a\n\26\r\26\16\26\u037b\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0384\n\26\f\26\16\26\u0387\13\26\3\26\3\26\6\26\u038b"+
		"\n\26\r\26\16\26\u038c\3\26\5\26\u0390\n\26\3\26\6\26\u0393\n\26\r\26"+
		"\16\26\u0394\3\26\3\26\5\26\u0399\n\26\3\27\3\27\3\27\6\27\u039e\n\27"+
		"\r\27\16\27\u039f\3\27\3\27\3\27\3\27\7\27\u03a6\n\27\f\27\16\27\u03a9"+
		"\13\27\3\27\3\27\6\27\u03ad\n\27\r\27\16\27\u03ae\3\27\5\27\u03b2\n\27"+
		"\3\27\6\27\u03b5\n\27\r\27\16\27\u03b6\3\27\5\27\u03ba\n\27\3\30\3\30"+
		"\3\30\3\30\6\30\u03c0\n\30\r\30\16\30\u03c1\3\30\3\30\6\30\u03c6\n\30"+
		"\r\30\16\30\u03c7\3\30\3\30\5\30\u03cc\n\30\3\30\3\30\3\30\3\30\7\30\u03d2"+
		"\n\30\f\30\16\30\u03d5\13\30\3\30\3\30\6\30\u03d9\n\30\r\30\16\30\u03da"+
		"\3\30\5\30\u03de\n\30\3\30\6\30\u03e1\n\30\r\30\16\30\u03e2\3\30\3\30"+
		"\6\30\u03e7\n\30\r\30\16\30\u03e8\3\30\3\30\5\30\u03ed\n\30\3\30\3\30"+
		"\3\30\3\30\6\30\u03f3\n\30\r\30\16\30\u03f4\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\7\30\u03fd\n\30\f\30\16\30\u0400\13\30\3\30\3\30\6\30\u0404\n\30\r"+
		"\30\16\30\u0405\3\30\5\30\u0409\n\30\3\30\6\30\u040c\n\30\r\30\16\30\u040d"+
		"\3\30\3\30\5\30\u0412\n\30\3\31\3\31\5\31\u0416\n\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\6\31\u041f\n\31\r\31\16\31\u0420\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0428\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0431\n"+
		"\31\f\31\16\31\u0434\13\31\3\31\3\31\3\31\6\31\u0439\n\31\r\31\16\31\u043a"+
		"\3\31\5\31\u043e\n\31\3\31\6\31\u0441\n\31\r\31\16\31\u0442\3\31\3\31"+
		"\5\31\u0447\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0455\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u0461\n\34\f\34\16\34\u0464\13\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u046e\n\35\f\35\16\35\u0471\13\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u047b\n\36\f\36\16\36\u047e\13\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0488\n\37\f\37\16\37\u048b\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u049a\n \f \16 \u049d\13 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u04ac\n!\f!\16!\u04af\13!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u04be\n\"\f\"\16"+
		"\"\u04c1\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u04cc\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u04d7\n$\f$\16$\u04da\13$\3%\3%\3%\3%\3%\3%\5%\u04e2\n%"+
		"\3%\3%\3%\3%\3%\7%\u04e9\n%\f%\16%\u04ec\13%\3&\3&\3&\5&\u04f1\n&\3&\3"+
		"&\3&\7&\u04f6\n&\f&\16&\u04f9\13&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0501\n"+
		"\'\3\'\3\'\3\'\7\'\u0506\n\'\f\'\16\'\u0509\13\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u0516\n(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u0524"+
		"\n*\3*\3*\3+\3+\3+\5+\u052b\n+\3,\3,\3,\3,\3-\3-\5-\u0533\n-\3-\3-\5-"+
		"\u0537\n-\3-\3-\3-\3-\5-\u053d\n-\3-\3-\3-\3-\5-\u0543\n-\5-\u0545\n-"+
		"\3.\3.\3.\3.\5.\u054b\n.\3.\3.\3.\5.\u0550\n.\3.\3.\3.\3.\5.\u0556\n."+
		"\3.\3.\5.\u055a\n.\3.\3.\5.\u055e\n.\3.\3.\5.\u0562\n.\5.\u0564\n.\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0575\n/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0596\n\60\3\60\2\r\668:<>@BFHJL\61\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\b\3\2)*\4\2\f\f"+
		"88\4\2\b\b\63\63\3\2\20\21\3\2\22\23\3\2+,\2\u069a\2a\3\2\2\2\4\u0090"+
		"\3\2\2\2\6\u0097\3\2\2\2\b\u00cd\3\2\2\2\n\u0107\3\2\2\2\f\u012f\3\2\2"+
		"\2\16\u0131\3\2\2\2\20\u015e\3\2\2\2\22\u0167\3\2\2\2\24\u0169\3\2\2\2"+
		"\26\u01e6\3\2\2\2\30\u0211\3\2\2\2\32\u0233\3\2\2\2\34\u0282\3\2\2\2\36"+
		"\u029c\3\2\2\2 \u02d0\3\2\2\2\"\u02ef\3\2\2\2$\u030a\3\2\2\2&\u0328\3"+
		"\2\2\2(\u0340\3\2\2\2*\u0398\3\2\2\2,\u03b9\3\2\2\2.\u0411\3\2\2\2\60"+
		"\u0446\3\2\2\2\62\u0448\3\2\2\2\64\u0454\3\2\2\2\66\u0456\3\2\2\28\u0465"+
		"\3\2\2\2:\u0472\3\2\2\2<\u047f\3\2\2\2>\u048c\3\2\2\2@\u049e\3\2\2\2B"+
		"\u04b0\3\2\2\2D\u04cb\3\2\2\2F\u04cd\3\2\2\2H\u04e1\3\2\2\2J\u04f0\3\2"+
		"\2\2L\u0500\3\2\2\2N\u0515\3\2\2\2P\u0517\3\2\2\2R\u051e\3\2\2\2T\u0527"+
		"\3\2\2\2V\u052c\3\2\2\2X\u0544\3\2\2\2Z\u0563\3\2\2\2\\\u0574\3\2\2\2"+
		"^\u0595\3\2\2\2`b\5\4\3\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\2\2\3d\3\3"+
		"\2\2\2eg\5\6\4\2fh\5\b\5\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\7(\2\2ji\3"+
		"\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\5\4\3\2o\u0091\3\2\2"+
		"\2pr\5\b\5\2qs\7(\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2"+
		"\2vw\5\4\3\2w\u0091\3\2\2\2xz\5\n\6\2y{\5\b\5\2zy\3\2\2\2z{\3\2\2\2{}"+
		"\3\2\2\2|~\7(\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0082\5\f\7\2\u0082\u0091\3\2\2\2\u0083\u0085"+
		"\7(\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0091\5\4\3\2\u0089\u008b\5\6"+
		"\4\2\u008a\u008c\5\b\5\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0091\3\2\2\2\u008d\u0091\5\b\5\2\u008e\u0091\5\n\6\2\u008f\u0091\3\2"+
		"\2\2\u0090e\3\2\2\2\u0090p\3\2\2\2\u0090x\3\2\2\2\u0090\u0084\3\2\2\2"+
		"\u0090\u0089\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\5\3\2\2\2\u0092\u0098\7\16\2\2\u0093\u0098\7\24\2\2\u0094"+
		"\u0098\7\62\2\2\u0095\u0098\5\16\b\2\u0096\u0098\5\24\13\2\u0097\u0092"+
		"\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009f\3\2\2\2\u0099\u009a\7\"\2\2\u009a\u009b\5\64"+
		"\33\2\u009b\u009c\7!\2\2\u009c\u009e\3\2\2\2\u009d\u0099\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\78\2\2\u00a3\u00ac\b\4\1\2\u00a4"+
		"\u00a5\7\33\2\2\u00a5\u00a6\78\2\2\u00a6\u00a8\b\4\1\2\u00a7\u00a9\5\b"+
		"\5\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a4\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\5\b\5\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\7\3\2\2\2\u00b2\u00b6\7\60\2"+
		"\2\u00b3\u00b5\13\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ce\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00bd\7)\2\2\u00ba\u00bc\7(\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c3\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c2\n\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c9\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c8\7(\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00ce\7*\2\2\u00cd\u00b2\3\2\2\2\u00cd\u00b9\3\2"+
		"\2\2\u00ce\t\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\7\62\2\2\u00d1\u00d5"+
		"\b\6\1\2\u00d2\u00d3\7+\2\2\u00d3\u00d4\7\62\2\2\u00d4\u00d6\b\6\1\2\u00d5"+
		"\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\7("+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e7\7#"+
		"\2\2\u00de\u00e0\7(\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\5\26"+
		"\f\2\u00e4\u00e6\5\b\5\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00eb\7(\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u0108\7$"+
		"\2\2\u00ef\u00f0\7\36\2\2\u00f0\u00f1\7\62\2\2\u00f1\u00f5\b\6\1\2\u00f2"+
		"\u00f3\7+\2\2\u00f3\u00f4\7\62\2\2\u00f4\u00f6\b\6\1\2\u00f5\u00f2\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\7(\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0102\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0103\5\b\5\2\u00fe"+
		"\u00ff\7 \2\2\u00ff\u0103\5\6\4\2\u0100\u0103\5\30\r\2\u0101\u0103\5\34"+
		"\17\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\5\b"+
		"\5\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u00cf\3\2\2\2\u0107\u00ef\3\2\2\2\u0108\13\3\2\2\2\u0109\u010b\5\n\6"+
		"\2\u010a\u010c\7(\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\5\f\7\2\u0110"+
		"\u0112\5\b\5\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0130\3\2"+
		"\2\2\u0113\u0115\5\b\5\2\u0114\u0116\7(\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\5\f\7\2\u011a\u011c\5\b\5\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u0130\3\2\2\2\u011d\u011f\7(\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0124\5\f\7\2\u0123\u0125\5\b\5\2\u0124\u0123\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0130\3\2\2\2\u0126\u0128\5\n\6\2\u0127"+
		"\u0129\5\b\5\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0130\3\2"+
		"\2\2\u012a\u012c\5\b\5\2\u012b\u012d\5\b\5\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0109\3\2"+
		"\2\2\u012f\u0113\3\2\2\2\u012f\u011e\3\2\2\2\u012f\u0126\3\2\2\2\u012f"+
		"\u012a\3\2\2\2\u012f\u012e\3\2\2\2\u0130\r\3\2\2\2\u0131\u0132\7\61\2"+
		"\2\u0132\u0133\7+\2\2\u0133\u0134\7\16\2\2\u0134\u0135\7,\2\2\u0135\17"+
		"\3\2\2\2\u0136\u0137\7\61\2\2\u0137\u0138\7/\2\2\u0138\u0139\7\17\2\2"+
		"\u0139\u013a\b\t\1\2\u013a\u013b\7%\2\2\u013b\u013c\5\22\n\2\u013c\u013d"+
		"\7&\2\2\u013d\u015f\3\2\2\2\u013e\u013f\5X-\2\u013f\u0140\7/\2\2\u0140"+
		"\u0141\7\64\2\2\u0141\u0142\b\t\1\2\u0142\u0143\7%\2\2\u0143\u0144\5\64"+
		"\33\2\u0144\u0145\7&\2\2\u0145\u015f\3\2\2\2\u0146\u0147\5X-\2\u0147\u0148"+
		"\7/\2\2\u0148\u0149\7\65\2\2\u0149\u014a\b\t\1\2\u014a\u014b\7%\2\2\u014b"+
		"\u014c\5\22\n\2\u014c\u014d\7&\2\2\u014d\u015f\3\2\2\2\u014e\u014f\5X"+
		"-\2\u014f\u0150\7/\2\2\u0150\u0151\7\66\2\2\u0151\u0152\b\t\1\2\u0152"+
		"\u0153\7%\2\2\u0153\u0154\5\64\33\2\u0154\u0155\7&\2\2\u0155\u015f\3\2"+
		"\2\2\u0156\u0157\5X-\2\u0157\u0158\7/\2\2\u0158\u0159\7\67\2\2\u0159\u015a"+
		"\b\t\1\2\u015a\u015b\7%\2\2\u015b\u015c\5\64\33\2\u015c\u015d\7&\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0136\3\2\2\2\u015e\u013e\3\2\2\2\u015e\u0146\3\2"+
		"\2\2\u015e\u014e\3\2\2\2\u015e\u0156\3\2\2\2\u015f\21\3\2\2\2\u0160\u0161"+
		"\7%\2\2\u0161\u0162\5\22\n\2\u0162\u0163\7&\2\2\u0163\u0168\3\2\2\2\u0164"+
		"\u0166\5T+\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2"+
		"\2\u0167\u0160\3\2\2\2\u0167\u0165\3\2\2\2\u0168\23\3\2\2\2\u0169\u016a"+
		"\7\26\2\2\u016a\u017c\7+\2\2\u016b\u017d\7\25\2\2\u016c\u0172\7\16\2\2"+
		"\u016d\u0172\7\24\2\2\u016e\u0172\7\62\2\2\u016f\u0172\5\16\b\2\u0170"+
		"\u0172\5\24\13\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016e\3"+
		"\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0179\3\2\2\2\u0173"+
		"\u0174\7\"\2\2\u0174\u0175\5\64\33\2\u0175\u0176\7!\2\2\u0176\u0178\3"+
		"\2\2\2\u0177\u0173\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u016b\3\2"+
		"\2\2\u017c\u0171\3\2\2\2\u017d\u0194\3\2\2\2\u017e\u0190\7\33\2\2\u017f"+
		"\u0191\7\25\2\2\u0180\u0186\7\16\2\2\u0181\u0186\7\24\2\2\u0182\u0186"+
		"\7\62\2\2\u0183\u0186\5\16\b\2\u0184\u0186\5\24\13\2\u0185\u0180\3\2\2"+
		"\2\u0185\u0181\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u018d\3\2\2\2\u0187\u0188\7\"\2\2\u0188\u0189\5\64\33\2"+
		"\u0189\u018a\7!\2\2\u018a\u018c\3\2\2\2\u018b\u0187\3\2\2\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u017f\3\2\2\2\u0190\u0185\3\2\2\2\u0191\u0193\3\2"+
		"\2\2\u0192\u017e\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u01a9\7\'"+
		"\2\2\u0198\u01aa\7\25\2\2\u0199\u019f\7\16\2\2\u019a\u019f\7\24\2\2\u019b"+
		"\u019f\7\62\2\2\u019c\u019f\5\16\b\2\u019d\u019f\5\24\13\2\u019e\u0199"+
		"\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a6\3\2\2\2\u01a0\u01a1\7\"\2\2\u01a1\u01a2\5\64"+
		"\33\2\u01a2\u01a3\7!\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9\u0198\3\2\2\2\u01a9\u019e\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\7,\2\2\u01ac\u01ae\5\b\5\2\u01ad\u01ac\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\25\3\2\2\2\u01af\u01b1\5\b\5\2\u01b0\u01b2"+
		"\7(\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\5\26\f\2\u01b6\u01b8\5"+
		"\b\5\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01e7\3\2\2\2\u01b9"+
		"\u01ba\7 \2\2\u01ba\u01bc\5\6\4\2\u01bb\u01bd\7(\2\2\u01bc\u01bb\3\2\2"+
		"\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c2\5\26\f\2\u01c1\u01c3\5\b\5\2\u01c2\u01c1\3\2\2\2"+
		"\u01c2\u01c3\3\2\2\2\u01c3\u01e7\3\2\2\2\u01c4\u01c6\5\30\r\2\u01c5\u01c7"+
		"\7(\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\5\26\f\2\u01cb\u01cd\5"+
		"\b\5\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01e7\3\2\2\2\u01ce"+
		"\u01d0\5\34\17\2\u01cf\u01d1\7(\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d6\5\26\f\2\u01d5\u01d7\5\b\5\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3"+
		"\2\2\2\u01d7\u01e7\3\2\2\2\u01d8\u01e7\5\b\5\2\u01d9\u01da\7 \2\2\u01da"+
		"\u01dc\5\6\4\2\u01db\u01dd\5\b\5\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01e7\3\2\2\2\u01de\u01e0\5\30\r\2\u01df\u01e1\5\b\5\2\u01e0"+
		"\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e7\3\2\2\2\u01e2\u01e4\5\34"+
		"\17\2\u01e3\u01e5\5\b\5\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01af\3\2\2\2\u01e6\u01b9\3\2\2\2\u01e6\u01c4\3\2"+
		"\2\2\u01e6\u01ce\3\2\2\2\u01e6\u01d8\3\2\2\2\u01e6\u01d9\3\2\2\2\u01e6"+
		"\u01de\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e7\27\3\2\2\2\u01e8\u01e9\7 \2\2"+
		"\u01e9\u01ea\7\f\2\2\u01ea\u01ec\7%\2\2\u01eb\u01ed\5\36\20\2\u01ec\u01eb"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f2\7&\2\2\u01ef"+
		"\u01f1\7(\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01fc\7#\2\2\u01f6\u01f8\7(\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2"+
		"\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd"+
		"\5\32\16\2\u01fc\u01f7\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2"+
		"\u01fe\u0200\7(\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0212\7$\2\2\u0204"+
		"\u0205\7 \2\2\u0205\u0206\7\f\2\2\u0206\u0208\7%\2\2\u0207\u0209\5\36"+
		"\20\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\7&\2\2\u020b\u020d\7(\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2"+
		"\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212"+
		"\5&\24\2\u0211\u01e8\3\2\2\2\u0211\u0204\3\2\2\2\u0212\31\3\2\2\2\u0213"+
		"\u0215\5\b\5\2\u0214\u0216\7(\2\2\u0215\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021b\5\32\16\2\u021a\u021c\5\b\5\2\u021b\u021a\3\2\2\2\u021b\u021c\3"+
		"\2\2\2\u021c\u0234\3\2\2\2\u021d\u021f\5\6\4\2\u021e\u0220\7(\2\2\u021f"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0225\5\32\16\2\u0224\u0226\5\b\5\2\u0225"+
		"\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0234\3\2\2\2\u0227\u0229\5$"+
		"\23\2\u0228\u022a\5\b\5\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u0234\3\2\2\2\u022b\u022d\5\b\5\2\u022c\u022e\5\b\5\2\u022d\u022c\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u0234\3\2\2\2\u022f\u0231\5\6\4\2\u0230"+
		"\u0232\5\b\5\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2"+
		"\2\2\u0233\u0213\3\2\2\2\u0233\u021d\3\2\2\2\u0233\u0227\3\2\2\2\u0233"+
		"\u022b\3\2\2\2\u0233\u022f\3\2\2\2\u0234\33\3\2\2\2\u0235\u023c\7 \2\2"+
		"\u0236\u023d\7\25\2\2\u0237\u023d\7\16\2\2\u0238\u023d\7\24\2\2\u0239"+
		"\u023d\5\16\b\2\u023a\u023d\7\62\2\2\u023b\u023d\5\24\13\2\u023c\u0236"+
		"\3\2\2\2\u023c\u0237\3\2\2\2\u023c\u0238\3\2\2\2\u023c\u0239\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0244\3\2"+
		"\2\2\u023e\u023f\7\"\2\2\u023f\u0240\5\64\33\2\u0240\u0241\7!\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u023e\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u0248\78\2\2\u0248\u0249\b\17\1\2\u0249\u024b\7%\2\2\u024a\u024c\5\36"+
		"\20\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u0251\7&\2\2\u024e\u0250\7(\2\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2"+
		"\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251"+
		"\3\2\2\2\u0254\u025b\7#\2\2\u0255\u0257\7(\2\2\u0256\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a\u025c\5\"\22\2\u025b\u0256\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025e\3\2\2\2\u025d\u025f\7(\2\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0283\7$\2\2\u0263\u026a\7 \2\2\u0264\u026b\7\25\2\2\u0265\u026b\7\16"+
		"\2\2\u0266\u026b\7\24\2\2\u0267\u026b\5\16\b\2\u0268\u026b\7\62\2\2\u0269"+
		"\u026b\5\24\13\2\u026a\u0264\3\2\2\2\u026a\u0265\3\2\2\2\u026a\u0266\3"+
		"\2\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u0272\3\2\2\2\u026c\u026d\7\"\2\2\u026d\u026e\5\64"+
		"\33\2\u026e\u026f\7!\2\2\u026f\u0271\3\2\2\2\u0270\u026c\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0276\78\2\2\u0276\u0277\b\17\1\2\u0277"+
		"\u0279\7%\2\2\u0278\u027a\5\36\20\2\u0279\u0278\3\2\2\2\u0279\u027a\3"+
		"\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\7&\2\2\u027c\u027e\7(\2\2\u027d"+
		"\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u0283\5&\24\2\u0282\u0235\3\2\2\2\u0282"+
		"\u0263\3\2\2\2\u0283\35\3\2\2\2\u0284\u028b\7\16\2\2\u0285\u028b\7\24"+
		"\2\2\u0286\u028b\7\62\2\2\u0287\u028b\5\16\b\2\u0288\u028b\5\24\13\2\u0289"+
		"\u028b\7\25\2\2\u028a\u0284\3\2\2\2\u028a\u0285\3\2\2\2\u028a\u0286\3"+
		"\2\2\2\u028a\u0287\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028b"+
		"\u0292\3\2\2\2\u028c\u028d\7\"\2\2\u028d\u028e\5\64\33\2\u028e\u028f\7"+
		"!\2\2\u028f\u0291\3\2\2\2\u0290\u028c\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0295\u0296\78\2\2\u0296\u0299\b\20\1\2\u0297\u0298\7\33\2\2\u0298"+
		"\u029a\5\36\20\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029d\3"+
		"\2\2\2\u029b\u029d\5 \21\2\u029c\u028a\3\2\2\2\u029c\u029b\3\2\2\2\u029d"+
		"\37\3\2\2\2\u029e\u02a5\7\16\2\2\u029f\u02a5\7\24\2\2\u02a0\u02a5\7\62"+
		"\2\2\u02a1\u02a5\5\16\b\2\u02a2\u02a5\5\24\13\2\u02a3\u02a5\7\25\2\2\u02a4"+
		"\u029e\3\2\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a4\u02a1\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02ac\3\2\2\2\u02a6"+
		"\u02a7\7\"\2\2\u02a7\u02a8\5\64\33\2\u02a8\u02a9\7!\2\2\u02a9\u02ab\3"+
		"\2\2\2\u02aa\u02a6\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b0\78"+
		"\2\2\u02b0\u02b1\7.\2\2\u02b1\u02b2\b\21\1\2\u02b2\u02b5\5\64\33\2\u02b3"+
		"\u02b4\7\33\2\2\u02b4\u02b6\5 \21\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3"+
		"\2\2\2\u02b6\u02d1\3\2\2\2\u02b7\u02be\7\16\2\2\u02b8\u02be\7\24\2\2\u02b9"+
		"\u02be\7\62\2\2\u02ba\u02be\5\16\b\2\u02bb\u02be\5\24\13\2\u02bc\u02be"+
		"\7\25\2\2\u02bd\u02b7\3\2\2\2\u02bd\u02b8\3\2\2\2\u02bd\u02b9\3\2\2\2"+
		"\u02bd\u02ba\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c5"+
		"\3\2\2\2\u02bf\u02c0\7\"\2\2\u02c0\u02c1\5\64\33\2\u02c1\u02c2\7!\2\2"+
		"\u02c2\u02c4\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3"+
		"\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02c9\78\2\2\u02c9\u02ca\7.\2\2\u02ca\u02cb\b\21\1\2\u02cb\u02ce\5\64"+
		"\33\2\u02cc\u02cd\7\33\2\2\u02cd\u02cf\5 \21\2\u02ce\u02cc\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02a4\3\2\2\2\u02d0\u02bd\3\2"+
		"\2\2\u02d1!\3\2\2\2\u02d2\u02d4\5\b\5\2\u02d3\u02d5\7(\2\2\u02d4\u02d3"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02da\5\"\22\2\u02d9\u02db\5\b\5\2\u02da\u02d9\3"+
		"\2\2\2\u02da\u02db\3\2\2\2\u02db\u02f0\3\2\2\2\u02dc\u02de\5\6\4\2\u02dd"+
		"\u02df\7(\2\2\u02de\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02de\3\2"+
		"\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\5\"\22\2\u02e3"+
		"\u02e5\5\b\5\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02f0\3\2"+
		"\2\2\u02e6\u02e8\5$\23\2\u02e7\u02e9\5\b\5\2\u02e8\u02e7\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02f0\3\2\2\2\u02ea\u02f0\5\b\5\2\u02eb\u02ed\5\6"+
		"\4\2\u02ec\u02ee\5\b\5\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02d2\3\2\2\2\u02ef\u02dc\3\2\2\2\u02ef\u02e6\3\2"+
		"\2\2\u02ef\u02ea\3\2\2\2\u02ef\u02eb\3\2\2\2\u02f0#\3\2\2\2\u02f1\u02f3"+
		"\5\b\5\2\u02f2\u02f4\7(\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\5$"+
		"\23\2\u02f8\u02fa\5\b\5\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u030b\3\2\2\2\u02fb\u02fd\5&\24\2\u02fc\u02fe\7(\2\2\u02fd\u02fc\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0303\5$\23\2\u0302\u0304\5\b\5\2\u0303\u0302\3\2"+
		"\2\2\u0303\u0304\3\2\2\2\u0304\u030b\3\2\2\2\u0305\u0307\5&\24\2\u0306"+
		"\u0308\5\b\5\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030b\3\2"+
		"\2\2\u0309\u030b\5\b\5\2\u030a\u02f1\3\2\2\2\u030a\u02fb\3\2\2\2\u030a"+
		"\u0305\3\2\2\2\u030a\u0309\3\2\2\2\u030b%\3\2\2\2\u030c\u030e\5*\26\2"+
		"\u030d\u030f\5\b\5\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0329"+
		"\3\2\2\2\u0310\u0312\5\60\31\2\u0311\u0313\5\b\5\2\u0312\u0311\3\2\2\2"+
		"\u0312\u0313\3\2\2\2\u0313\u0329\3\2\2\2\u0314\u0316\5\62\32\2\u0315\u0317"+
		"\5\b\5\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0329\3\2\2\2\u0318"+
		"\u031a\5V,\2\u0319\u031b\5\b\5\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2"+
		"\2\u031b\u0329\3\2\2\2\u031c\u031e\5(\25\2\u031d\u031f\5\b\5\2\u031e\u031d"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0329\3\2\2\2\u0320\u0322\5\20\t\2"+
		"\u0321\u0323\5\b\5\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0329"+
		"\3\2\2\2\u0324\u0326\5\64\33\2\u0325\u0327\5\b\5\2\u0326\u0325\3\2\2\2"+
		"\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u030c\3\2\2\2\u0328\u0310"+
		"\3\2\2\2\u0328\u0314\3\2\2\2\u0328\u0318\3\2\2\2\u0328\u031c\3\2\2\2\u0328"+
		"\u0320\3\2\2\2\u0328\u0324\3\2\2\2\u0329\'\3\2\2\2\u032a\u032b\7%\2\2"+
		"\u032b\u032c\5(\25\2\u032c\u032d\7&\2\2\u032d\u0341\3\2\2\2\u032e\u032f"+
		"\b\25\1\2\u032f\u0330\5X-\2\u0330\u0332\7%\2\2\u0331\u0333\5T+\2\u0332"+
		"\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\7&"+
		"\2\2\u0335\u0341\3\2\2\2\u0336\u0337\b\25\1\2\u0337\u0338\5X-\2\u0338"+
		"\u0339\7/\2\2\u0339\u033a\7\f\2\2\u033a\u033c\7%\2\2\u033b\u033d\5T+\2"+
		"\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f"+
		"\7&\2\2\u033f\u0341\3\2\2\2\u0340\u032a\3\2\2\2\u0340\u032e\3\2\2\2\u0340"+
		"\u0336\3\2\2\2\u0341)\3\2\2\2\u0342\u0343\7\t\2\2\u0343\u0344\b\26\1\2"+
		"\u0344\u0346\5\64\33\2\u0345\u0347\7(\2\2\u0346\u0345\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034c\5&\24\2\u034b\u034d\7(\2\2\u034c\u034b\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0352\3\2\2\2\u0350"+
		"\u0353\5,\27\2\u0351\u0353\5.\30\2\u0352\u0350\3\2\2\2\u0352\u0351\3\2"+
		"\2\2\u0353\u0399\3\2\2\2\u0354\u0355\7\t\2\2\u0355\u0356\b\26\1\2\u0356"+
		"\u035a\5\64\33\2\u0357\u0359\7(\2\2\u0358\u0357\3\2\2\2\u0359\u035c\3"+
		"\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c"+
		"\u035a\3\2\2\2\u035d\u035f\7#\2\2\u035e\u0360\7(\2\2\u035f\u035e\3\2\2"+
		"\2\u0360\u0361\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364"+
		"\3\2\2\2\u0363\u0365\5$\23\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0367\3\2\2\2\u0366\u0368\7(\2\2\u0367\u0366\3\2\2\2\u0368\u0369\3\2"+
		"\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036d\7$\2\2\u036c\u036e\7(\2\2\u036d\u036c\3\2\2\2\u036e\u036f\3\2\2"+
		"\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u0374"+
		"\5,\27\2\u0372\u0374\5.\30\2\u0373\u0371\3\2\2\2\u0373\u0372\3\2\2\2\u0374"+
		"\u0399\3\2\2\2\u0375\u0376\7\t\2\2\u0376\u0377\b\26\1\2\u0377\u0379\5"+
		"\64\33\2\u0378\u037a\7(\2\2\u0379\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\5&"+
		"\24\2\u037e\u0399\3\2\2\2\u037f\u0380\7\t\2\2\u0380\u0381\b\26\1\2\u0381"+
		"\u0385\5\64\33\2\u0382\u0384\7(\2\2\u0383\u0382\3\2\2\2\u0384\u0387\3"+
		"\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0388\u038a\7#\2\2\u0389\u038b\7(\2\2\u038a\u0389\3\2\2"+
		"\2\u038b\u038c\3\2\2\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f"+
		"\3\2\2\2\u038e\u0390\5$\23\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u0393\7(\2\2\u0392\u0391\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0397\7$\2\2\u0397\u0399\3\2\2\2\u0398\u0342\3\2\2\2\u0398\u0354\3\2"+
		"\2\2\u0398\u0375\3\2\2\2\u0398\u037f\3\2\2\2\u0399+\3\2\2\2\u039a\u039b"+
		"\7\n\2\2\u039b\u039d\b\27\1\2\u039c\u039e\7(\2\2\u039d\u039c\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2"+
		"\2\2\u03a1\u03ba\5&\24\2\u03a2\u03a3\7\n\2\2\u03a3\u03a7\b\27\1\2\u03a4"+
		"\u03a6\7(\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2"+
		"\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa"+
		"\u03ac\7#\2\2\u03ab\u03ad\7(\2\2\u03ac\u03ab\3\2\2\2\u03ad\u03ae\3\2\2"+
		"\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03b2"+
		"\5$\23\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3"+
		"\u03b5\7(\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b4\3\2"+
		"\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\7$\2\2\u03b9"+
		"\u039a\3\2\2\2\u03b9\u03a2\3\2\2\2\u03ba-\3\2\2\2\u03bb\u03bc\7\13\2\2"+
		"\u03bc\u03bd\b\30\1\2\u03bd\u03bf\5\64\33\2\u03be\u03c0\7(\2\2\u03bf\u03be"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c3\3\2\2\2\u03c3\u03c5\5&\24\2\u03c4\u03c6\7(\2\2\u03c5\u03c4\3\2"+
		"\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03cb\3\2\2\2\u03c9\u03cc\5,\27\2\u03ca\u03cc\5.\30\2\u03cb\u03c9\3\2"+
		"\2\2\u03cb\u03ca\3\2\2\2\u03cc\u0412\3\2\2\2\u03cd\u03ce\7\13\2\2\u03ce"+
		"\u03cf\b\30\1\2\u03cf\u03d3\5\64\33\2\u03d0\u03d2\7(\2\2\u03d1\u03d0\3"+
		"\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03d6\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d8\7#\2\2\u03d7\u03d9\7(\2"+
		"\2\u03d8\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db"+
		"\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03de\5$\23\2\u03dd\u03dc\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df\u03e1\7(\2\2\u03e0\u03df\3\2"+
		"\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3"+
		"\u03e4\3\2\2\2\u03e4\u03e6\7$\2\2\u03e5\u03e7\7(\2\2\u03e6\u03e5\3\2\2"+
		"\2\u03e7\u03e8\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ec"+
		"\3\2\2\2\u03ea\u03ed\5,\27\2\u03eb\u03ed\5.\30\2\u03ec\u03ea\3\2\2\2\u03ec"+
		"\u03eb\3\2\2\2\u03ed\u0412\3\2\2\2\u03ee\u03ef\7\13\2\2\u03ef\u03f0\b"+
		"\30\1\2\u03f0\u03f2\5\64\33\2\u03f1\u03f3\7(\2\2\u03f2\u03f1\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2"+
		"\2\2\u03f6\u03f7\5&\24\2\u03f7\u0412\3\2\2\2\u03f8\u03f9\7\13\2\2\u03f9"+
		"\u03fa\b\30\1\2\u03fa\u03fe\5\64\33\2\u03fb\u03fd\7(\2\2\u03fc\u03fb\3"+
		"\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0401\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\7#\2\2\u0402\u0404\7(\2"+
		"\2\u0403\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406\u0408\3\2\2\2\u0407\u0409\5$\23\2\u0408\u0407\3\2\2\2\u0408"+
		"\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u040c\7(\2\2\u040b\u040a\3\2"+
		"\2\2\u040c\u040d\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0410\7$\2\2\u0410\u0412\3\2\2\2\u0411\u03bb\3\2"+
		"\2\2\u0411\u03cd\3\2\2\2\u0411\u03ee\3\2\2\2\u0411\u03f8\3\2\2\2\u0412"+
		"/\3\2\2\2\u0413\u0416\5X-\2\u0414\u0416\5P)\2\u0415\u0413\3\2\2\2\u0415"+
		"\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418\7/\2\2\u0418\u0419\7\r"+
		"\2\2\u0419\u041a\7\7\2\2\u041a\u041b\7\35\2\2\u041b\u041c\5X-\2\u041c"+
		"\u041e\7\35\2\2\u041d\u041f\7(\2\2\u041e\u041d\3\2\2\2\u041f\u0420\3\2"+
		"\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0423\b\31\1\2\u0423\u0424\5&\24\2\u0424\u0447\3\2\2\2\u0425\u0428\5"+
		"X-\2\u0426\u0428\5P)\2\u0427\u0425\3\2\2\2\u0427\u0426\3\2\2\2\u0428\u0429"+
		"\3\2\2\2\u0429\u042a\7/\2\2\u042a\u042b\7\r\2\2\u042b\u042c\7\7\2\2\u042c"+
		"\u042d\7\35\2\2\u042d\u042e\5X-\2\u042e\u0432\7\35\2\2\u042f\u0431\7("+
		"\2\2\u0430\u042f\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0435\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\b\31"+
		"\1\2\u0436\u043d\7#\2\2\u0437\u0439\7(\2\2\u0438\u0437\3\2\2\2\u0439\u043a"+
		"\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043e\5$\23\2\u043d\u0438\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\3\2"+
		"\2\2\u043f\u0441\7(\2\2\u0440\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\7$"+
		"\2\2\u0445\u0447\3\2\2\2\u0446\u0415\3\2\2\2\u0446\u0427\3\2\2\2\u0447"+
		"\61\3\2\2\2\u0448\u0449\7\6\2\2\u0449\u044a\b\32\1\2\u044a\u044b\7%\2"+
		"\2\u044b\u044c\5\64\33\2\u044c\u044d\7&\2\2\u044d\63\3\2\2\2\u044e\u044f"+
		"\5\66\34\2\u044f\u0450\7.\2\2\u0450\u0451\5\64\33\2\u0451\u0452\b\33\1"+
		"\2\u0452\u0455\3\2\2\2\u0453\u0455\5\66\34\2\u0454\u044e\3\2\2\2\u0454"+
		"\u0453\3\2\2\2\u0455\65\3\2\2\2\u0456\u0457\b\34\1\2\u0457\u0458\58\35"+
		"\2\u0458\u0462\3\2\2\2\u0459\u045a\f\4\2\2\u045a\u045b\7\31\2\2\u045b"+
		"\u045c\5\66\34\2\u045c\u045d\7\32\2\2\u045d\u045e\58\35\2\u045e\u045f"+
		"\b\34\1\2\u045f\u0461\3\2\2\2\u0460\u0459\3\2\2\2\u0461\u0464\3\2\2\2"+
		"\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\67\3\2\2\2\u0464\u0462"+
		"\3\2\2\2\u0465\u0466\b\35\1\2\u0466\u0467\5:\36\2\u0467\u046f\3\2\2\2"+
		"\u0468\u0469\f\4\2\2\u0469\u046a\7:\2\2\u046a\u046b\5:\36\2\u046b\u046c"+
		"\b\35\1\2\u046c\u046e\3\2\2\2\u046d\u0468\3\2\2\2\u046e\u0471\3\2\2\2"+
		"\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u04709\3\2\2\2\u0471\u046f\3"+
		"\2\2\2\u0472\u0473\b\36\1\2\u0473\u0474\5<\37\2\u0474\u047c\3\2\2\2\u0475"+
		"\u0476\f\4\2\2\u0476\u0477\79\2\2\u0477\u0478\5<\37\2\u0478\u0479\b\36"+
		"\1\2\u0479\u047b\3\2\2\2\u047a\u0475\3\2\2\2\u047b\u047e\3\2\2\2\u047c"+
		"\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d;\3\2\2\2\u047e\u047c\3\2\2\2"+
		"\u047f\u0480\b\37\1\2\u0480\u0481\5> \2\u0481\u0489\3\2\2\2\u0482\u0483"+
		"\f\4\2\2\u0483\u0484\7-\2\2\u0484\u0485\5> \2\u0485\u0486\b\37\1\2\u0486"+
		"\u0488\3\2\2\2\u0487\u0482\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2"+
		"\2\2\u0489\u048a\3\2\2\2\u048a=\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u048d"+
		"\b \1\2\u048d\u048e\5@!\2\u048e\u049b\3\2\2\2\u048f\u0490\f\5\2\2\u0490"+
		"\u0491\7+\2\2\u0491\u0492\5@!\2\u0492\u0493\b \1\2\u0493\u049a\3\2\2\2"+
		"\u0494\u0495\f\4\2\2\u0495\u0496\7,\2\2\u0496\u0497\5@!\2\u0497\u0498"+
		"\b \1\2\u0498\u049a\3\2\2\2\u0499\u048f\3\2\2\2\u0499\u0494\3\2\2\2\u049a"+
		"\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c?\3\2\2\2"+
		"\u049d\u049b\3\2\2\2\u049e\u049f\b!\1\2\u049f\u04a0\5B\"\2\u04a0\u04ad"+
		"\3\2\2\2\u04a1\u04a2\f\5\2\2\u04a2\u04a3\7\22\2\2\u04a3\u04a4\5B\"\2\u04a4"+
		"\u04a5\b!\1\2\u04a5\u04ac\3\2\2\2\u04a6\u04a7\f\4\2\2\u04a7\u04a8\7\23"+
		"\2\2\u04a8\u04a9\5B\"\2\u04a9\u04aa\b!\1\2\u04aa\u04ac\3\2\2\2\u04ab\u04a1"+
		"\3\2\2\2\u04ab\u04a6\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04aeA\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b1\b\"\1\2"+
		"\u04b1\u04b2\5D#\2\u04b2\u04bf\3\2\2\2\u04b3\u04b4\f\5\2\2\u04b4\u04b5"+
		"\7\21\2\2\u04b5\u04b6\5D#\2\u04b6\u04b7\b\"\1\2\u04b7\u04be\3\2\2\2\u04b8"+
		"\u04b9\f\4\2\2\u04b9\u04ba\7\20\2\2\u04ba\u04bb\5D#\2\u04bb\u04bc\b\""+
		"\1\2\u04bc\u04be\3\2\2\2\u04bd\u04b3\3\2\2\2\u04bd\u04b8\3\2\2\2\u04be"+
		"\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0C\3\2\2\2"+
		"\u04c1\u04bf\3\2\2\2\u04c2\u04c3\7\34\2\2\u04c3\u04c4\5D#\2\u04c4\u04c5"+
		"\b#\1\2\u04c5\u04cc\3\2\2\2\u04c6\u04c7\7\23\2\2\u04c7\u04c8\5D#\2\u04c8"+
		"\u04c9\b#\1\2\u04c9\u04cc\3\2\2\2\u04ca\u04cc\5F$\2\u04cb\u04c2\3\2\2"+
		"\2\u04cb\u04c6\3\2\2\2\u04cb\u04ca\3\2\2\2\u04ccE\3\2\2\2\u04cd\u04ce"+
		"\b$\1\2\u04ce\u04cf\5H%\2\u04cf\u04d8\3\2\2\2\u04d0\u04d1\f\5\2\2\u04d1"+
		"\u04d2\7\27\2\2\u04d2\u04d7\b$\1\2\u04d3\u04d4\f\4\2\2\u04d4\u04d5\7\30"+
		"\2\2\u04d5\u04d7\b$\1\2\u04d6\u04d0\3\2\2\2\u04d6\u04d3\3\2\2\2\u04d7"+
		"\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9G\3\2\2\2"+
		"\u04da\u04d8\3\2\2\2\u04db\u04dc\b%\1\2\u04dc\u04e2\5J&\2\u04dd\u04de"+
		"\7\"\2\2\u04de\u04df\5J&\2\u04df\u04e0\7!\2\2\u04e0\u04e2\3\2\2\2\u04e1"+
		"\u04db\3\2\2\2\u04e1\u04dd\3\2\2\2\u04e2\u04ea\3\2\2\2\u04e3\u04e4\f\5"+
		"\2\2\u04e4\u04e5\7\"\2\2\u04e5\u04e6\5J&\2\u04e6\u04e7\7!\2\2\u04e7\u04e9"+
		"\3\2\2\2\u04e8\u04e3\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04ebI\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04ee\b&\1\2\u04ee"+
		"\u04f1\5\20\t\2\u04ef\u04f1\5L\'\2\u04f0\u04ed\3\2\2\2\u04f0\u04ef\3\2"+
		"\2\2\u04f1\u04f7\3\2\2\2\u04f2\u04f3\f\4\2\2\u04f3\u04f4\7/\2\2\u04f4"+
		"\u04f6\5L\'\2\u04f5\u04f2\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2"+
		"\2\2\u04f7\u04f8\3\2\2\2\u04f8K\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fb"+
		"\b\'\1\2\u04fb\u04fc\7%\2\2\u04fc\u04fd\5\64\33\2\u04fd\u04fe\7&\2\2\u04fe"+
		"\u0501\3\2\2\2\u04ff\u0501\5N(\2\u0500\u04fa\3\2\2\2\u0500\u04ff\3\2\2"+
		"\2\u0501\u0507\3\2\2\2\u0502\u0503\f\3\2\2\u0503\u0504\7%\2\2\u0504\u0506"+
		"\7&\2\2\u0505\u0502\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508M\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u0516\7\17\2\2"+
		"\u050b\u0516\7\24\2\2\u050c\u0516\7<\2\2\u050d\u0516\78\2\2\u050e\u0516"+
		"\7\62\2\2\u050f\u0516\7\61\2\2\u0510\u0516\7=\2\2\u0511\u0516\7\63\2\2"+
		"\u0512\u0516\5X-\2\u0513\u0516\7\b\2\2\u0514\u0516\5\24\13\2\u0515\u050a"+
		"\3\2\2\2\u0515\u050b\3\2\2\2\u0515\u050c\3\2\2\2\u0515\u050d\3\2\2\2\u0515"+
		"\u050e\3\2\2\2\u0515\u050f\3\2\2\2\u0515\u0510\3\2\2\2\u0515\u0511\3\2"+
		"\2\2\u0515\u0512\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0514\3\2\2\2\u0516"+
		"O\3\2\2\2\u0517\u0518\7%\2\2\u0518\u0519\5\64\33\2\u0519\u051a\7/\2\2"+
		"\u051a\u051b\7/\2\2\u051b\u051c\5\64\33\2\u051c\u051d\7&\2\2\u051dQ\3"+
		"\2\2\2\u051e\u051f\7\62\2\2\u051f\u0520\7/\2\2\u0520\u0521\7\17\2\2\u0521"+
		"\u0523\7%\2\2\u0522\u0524\5T+\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2"+
		"\2\u0524\u0525\3\2\2\2\u0525\u0526\7&\2\2\u0526S\3\2\2\2\u0527\u052a\5"+
		"\64\33\2\u0528\u0529\7\33\2\2\u0529\u052b\5T+\2\u052a\u0528\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052bU\3\2\2\2\u052c\u052d\7\5\2\2\u052d\u052e\b,\1\2\u052e"+
		"\u052f\5\64\33\2\u052fW\3\2\2\2\u0530\u0532\78\2\2\u0531\u0533\5Z.\2\u0532"+
		"\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0545\3\2\2\2\u0534\u0536\7\37"+
		"\2\2\u0535\u0537\5Z.\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0545"+
		"\3\2\2\2\u0538\u0539\7%\2\2\u0539\u053a\78\2\2\u053a\u053c\7&\2\2\u053b"+
		"\u053d\5Z.\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u0545\3\2\2"+
		"\2\u053e\u053f\7%\2\2\u053f\u0540\7\37\2\2\u0540\u0542\7&\2\2\u0541\u0543"+
		"\5Z.\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544"+
		"\u0530\3\2\2\2\u0544\u0534\3\2\2\2\u0544\u0538\3\2\2\2\u0544\u053e\3\2"+
		"\2\2\u0545Y\3\2\2\2\u0546\u0547\7\"\2\2\u0547\u0548\5\64\33\2\u0548\u054a"+
		"\7!\2\2\u0549\u054b\5Z.\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u0564\3\2\2\2\u054c\u054d\7/\2\2\u054d\u054f\78\2\2\u054e\u0550\5Z.\2"+
		"\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0564\3\2\2\2\u0551\u0552"+
		"\7/\2\2\u0552\u0553\t\3\2\2\u0553\u0555\7%\2\2\u0554\u0556\5T+\2\u0555"+
		"\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559\7&"+
		"\2\2\u0558\u055a\5Z.\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u0564"+
		"\3\2\2\2\u055b\u055d\7%\2\2\u055c\u055e\5T+\2\u055d\u055c\3\2\2\2\u055d"+
		"\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561\7&\2\2\u0560\u0562\5Z."+
		"\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0546"+
		"\3\2\2\2\u0563\u054c\3\2\2\2\u0563\u0551\3\2\2\2\u0563\u055b\3\2\2\2\u0564"+
		"[\3\2\2\2\u0565\u0566\7%\2\2\u0566\u0567\5\\/\2\u0567\u0568\7&\2\2\u0568"+
		"\u0569\5^\60\2\u0569\u0575\3\2\2\2\u056a\u056b\t\4\2\2\u056b\u0575\5^"+
		"\60\2\u056c\u056d\7\23\2\2\u056d\u056e\5\\/\2\u056e\u056f\5^\60\2\u056f"+
		"\u0575\3\2\2\2\u0570\u0571\7\34\2\2\u0571\u0572\5\\/\2\u0572\u0573\5^"+
		"\60\2\u0573\u0575\3\2\2\2\u0574\u0565\3\2\2\2\u0574\u056a\3\2\2\2\u0574"+
		"\u056c\3\2\2\2\u0574\u0570\3\2\2\2\u0575]\3\2\2\2\u0576\u0577\7\27\2\2"+
		"\u0577\u0596\5^\60\2\u0578\u0579\7\30\2\2\u0579\u0596\5^\60\2\u057a\u057b"+
		"\t\5\2\2\u057b\u057c\5\\/\2\u057c\u057d\5^\60\2\u057d\u0596\3\2\2\2\u057e"+
		"\u057f\t\6\2\2\u057f\u0580\5\\/\2\u0580\u0581\5^\60\2\u0581\u0596\3\2"+
		"\2\2\u0582\u0583\t\7\2\2\u0583\u0584\5\\/\2\u0584\u0585\5^\60\2\u0585"+
		"\u0596\3\2\2\2\u0586\u0587\7-\2\2\u0587\u0588\5\\/\2\u0588\u0589\5^\60"+
		"\2\u0589\u0596\3\2\2\2\u058a\u058b\79\2\2\u058b\u058c\5\\/\2\u058c\u058d"+
		"\5^\60\2\u058d\u0596\3\2\2\2\u058e\u058f\7\31\2\2\u058f\u0590\5\\/\2\u0590"+
		"\u0591\7\32\2\2\u0591\u0592\5\\/\2\u0592\u0593\5^\60\2\u0593\u0596\3\2"+
		"\2\2\u0594\u0596\3\2\2\2\u0595\u0576\3\2\2\2\u0595\u0578\3\2\2\2\u0595"+
		"\u057a\3\2\2\2\u0595\u057e\3\2\2\2\u0595\u0582\3\2\2\2\u0595\u0586\3\2"+
		"\2\2\u0595\u058a\3\2\2\2\u0595\u058e\3\2\2\2\u0595\u0594\3\2\2\2\u0596"+
		"_\3\2\2\2\u00d3agltz\177\u0086\u008b\u0090\u0097\u009f\u00a8\u00ac\u00b0"+
		"\u00b6\u00bd\u00c3\u00c9\u00cd\u00d5\u00da\u00e1\u00e5\u00e7\u00ec\u00f5"+
		"\u00fa\u0102\u0105\u0107\u010d\u0111\u0117\u011b\u0120\u0124\u0128\u012c"+
		"\u012f\u015e\u0165\u0167\u0171\u0179\u017c\u0185\u018d\u0190\u0194\u019e"+
		"\u01a6\u01a9\u01ad\u01b3\u01b7\u01be\u01c2\u01c8\u01cc\u01d2\u01d6\u01dc"+
		"\u01e0\u01e4\u01e6\u01ec\u01f2\u01f9\u01fc\u0201\u0208\u020e\u0211\u0217"+
		"\u021b\u0221\u0225\u0229\u022d\u0231\u0233\u023c\u0244\u024b\u0251\u0258"+
		"\u025b\u0260\u026a\u0272\u0279\u027f\u0282\u028a\u0292\u0299\u029c\u02a4"+
		"\u02ac\u02b5\u02bd\u02c5\u02ce\u02d0\u02d6\u02da\u02e0\u02e4\u02e8\u02ed"+
		"\u02ef\u02f5\u02f9\u02ff\u0303\u0307\u030a\u030e\u0312\u0316\u031a\u031e"+
		"\u0322\u0326\u0328\u0332\u033c\u0340\u0348\u034e\u0352\u035a\u0361\u0364"+
		"\u0369\u036f\u0373\u037b\u0385\u038c\u038f\u0394\u0398\u039f\u03a7\u03ae"+
		"\u03b1\u03b6\u03b9\u03c1\u03c7\u03cb\u03d3\u03da\u03dd\u03e2\u03e8\u03ec"+
		"\u03f4\u03fe\u0405\u0408\u040d\u0411\u0415\u0420\u0427\u0432\u043a\u043d"+
		"\u0442\u0446\u0454\u0462\u046f\u047c\u0489\u0499\u049b\u04ab\u04ad\u04bd"+
		"\u04bf\u04cb\u04d6\u04d8\u04e1\u04ea\u04f0\u04f7\u0500\u0507\u0515\u0523"+
		"\u052a\u0532\u0536\u053c\u0542\u0544\u054a\u054f\u0555\u0559\u055d\u0561"+
		"\u0563\u0574\u0595";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}