// Generated from /home/c/University/Term6/Compiler Designe/projects/SimpleLOOP/src/main/grammar/SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLOOPLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "RETURN", "PRINT", "DO", "BOOL_VALUE", "IF", "ELSE", "ELSE_IF", 
			"INIT", "EACH", "INT", "NEW_WORD", "DIVIDE", "TIMES", "PLUS", "MINUS", 
			"BOOL", "VOID", "FPTR", "PLUS_PLUS", "MINUS_MINUS", "QUESTION_MARK", 
			"COLON", "COMMA", "NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", "ACCESS_TYPE", 
			"RBRACK", "LBRACK", "LCURL", "RCURL", "LPAR", "RPAR", "ARROW", "NEW_LINE", 
			"BEGIN_COMMENT", "END_COMMENT", "LT", "GT", "IS_EQUAL", "EQUAL", "DOT", 
			"SHARP_SIGN", "SET", "CAP_NAME", "NUM", "ADD", "MERGE", "INCLUDE", "DELETE", 
			"SMALL_NAME", "AND_AND", "OR_OR"
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


	public SimpleLOOPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLOOP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u016a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u00f2\n\36\f\36\16\36\u00f5\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0104\n\37\3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\5\'\u0118\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\7\61\u0139\n\61\f\61\16\61\u013c\13\61\3\62\6\62\u013f"+
		"\n\62\r\62\16\62\u0140\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\5\67\u015d\n\67\3\67\7\67\u0160\n\67\f\67\16\67\u0163\13"+
		"\67\38\38\38\39\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:\3\2\t\4\2\13\13\"\"\3\2c|\5\2\62;aac|\4"+
		"\2\f\f\17\17\3\2C\\\3\2\62;\4\2aac|\2\u0170\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3"+
		"s\3\2\2\2\5u\3\2\2\2\7y\3\2\2\2\t\u0080\3\2\2\2\13\u0086\3\2\2\2\r\u0092"+
		"\3\2\2\2\17\u0094\3\2\2\2\21\u0097\3\2\2\2\23\u009c\3\2\2\2\25\u00a2\3"+
		"\2\2\2\27\u00ad\3\2\2\2\31\u00b2\3\2\2\2\33\u00b6\3\2\2\2\35\u00ba\3\2"+
		"\2\2\37\u00bc\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2%\u00c2\3\2\2\2\'\u00c7"+
		"\3\2\2\2)\u00cc\3\2\2\2+\u00d1\3\2\2\2-\u00d4\3\2\2\2/\u00d7\3\2\2\2\61"+
		"\u00d9\3\2\2\2\63\u00db\3\2\2\2\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e1"+
		"\3\2\2\2;\u00e7\3\2\2\2=\u0103\3\2\2\2?\u0105\3\2\2\2A\u0107\3\2\2\2C"+
		"\u0109\3\2\2\2E\u010b\3\2\2\2G\u010d\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2"+
		"\2\2M\u0117\3\2\2\2O\u0119\3\2\2\2Q\u0120\3\2\2\2S\u0125\3\2\2\2U\u0127"+
		"\3\2\2\2W\u0129\3\2\2\2Y\u012c\3\2\2\2[\u012e\3\2\2\2]\u0130\3\2\2\2_"+
		"\u0132\3\2\2\2a\u0136\3\2\2\2c\u013e\3\2\2\2e\u0142\3\2\2\2g\u0146\3\2"+
		"\2\2i\u014c\3\2\2\2k\u0154\3\2\2\2m\u015c\3\2\2\2o\u0164\3\2\2\2q\u0167"+
		"\3\2\2\2st\7=\2\2t\4\3\2\2\2uv\t\2\2\2vw\3\2\2\2wx\b\3\2\2x\6\3\2\2\2"+
		"yz\7t\2\2z{\7g\2\2{|\7v\2\2|}\7w\2\2}~\7t\2\2~\177\7p\2\2\177\b\3\2\2"+
		"\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7v\2\2\u0085\n\3\2\2\2\u0086\u0087\7f\2\2\u0087\u0088"+
		"\7q\2\2\u0088\f\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c"+
		"\7w\2\2\u008c\u0093\7g\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0093\7g\2\2\u0092\u0089\3\2\2"+
		"\2\u0092\u008d\3\2\2\2\u0093\16\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7h\2\2\u0096\20\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7u\2\2\u009a\u009b\7g\2\2\u009b\22\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\24\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7n\2\2"+
		"\u00a9\u00aa\7k\2\2\u00aa\u00ab\7|\2\2\u00ab\u00ac\7g\2\2\u00ac\26\3\2"+
		"\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1"+
		"\7j\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7y\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\36\3\2\2\2\u00bc\u00bd"+
		"\7,\2\2\u00bd \3\2\2\2\u00be\u00bf\7-\2\2\u00bf\"\3\2\2\2\u00c0\u00c1"+
		"\7/\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7n\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7f\2\2\u00cb(\3\2\2\2\u00cc\u00cd"+
		"\7h\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"*\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\u00d3\7-\2\2\u00d3,\3\2\2\2\u00d4\u00d5"+
		"\7/\2\2\u00d5\u00d6\7/\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7A\2\2\u00d8\60"+
		"\3\2\2\2\u00d9\u00da\7<\2\2\u00da\62\3\2\2\2\u00db\u00dc\7.\2\2\u00dc"+
		"\64\3\2\2\2\u00dd\u00de\7#\2\2\u00de\66\3\2\2\2\u00df\u00e0\7~\2\2\u00e0"+
		"8\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7u\2\2\u00e5\u00e6\7u\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7\60\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\t\3\2\2\u00ee\u00ef\7a\2\2\u00ef\u00f3"+
		"\3\2\2\2\u00f0\u00f2\t\4\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4<\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f6\u00f7\7r\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7x\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fc\u0104\7g\2\2\u00fd"+
		"\u00fe\7r\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7n\2\2"+
		"\u0101\u0102\7k\2\2\u0102\u0104\7e\2\2\u0103\u00f6\3\2\2\2\u0103\u00fd"+
		"\3\2\2\2\u0104>\3\2\2\2\u0105\u0106\7_\2\2\u0106@\3\2\2\2\u0107\u0108"+
		"\7]\2\2\u0108B\3\2\2\2\u0109\u010a\7}\2\2\u010aD\3\2\2\2\u010b\u010c\7"+
		"\177\2\2\u010cF\3\2\2\2\u010d\u010e\7*\2\2\u010eH\3\2\2\2\u010f\u0110"+
		"\7+\2\2\u0110J\3\2\2\2\u0111\u0112\7/\2\2\u0112\u0113\7@\2\2\u0113L\3"+
		"\2\2\2\u0114\u0118\t\5\2\2\u0115\u0116\7=\2\2\u0116\u0118\t\5\2\2\u0117"+
		"\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0118N\3\2\2\2\u0119\u011a\7?\2\2\u011a"+
		"\u011b\7d\2\2\u011b\u011c\7g\2\2\u011c\u011d\7i\2\2\u011d\u011e\7k\2\2"+
		"\u011e\u011f\7p\2\2\u011fP\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122\7g\2"+
		"\2\u0122\u0123\7p\2\2\u0123\u0124\7f\2\2\u0124R\3\2\2\2\u0125\u0126\7"+
		">\2\2\u0126T\3\2\2\2\u0127\u0128\7@\2\2\u0128V\3\2\2\2\u0129\u012a\7?"+
		"\2\2\u012a\u012b\7?\2\2\u012bX\3\2\2\2\u012c\u012d\7?\2\2\u012dZ\3\2\2"+
		"\2\u012e\u012f\7\60\2\2\u012f\\\3\2\2\2\u0130\u0131\7%\2\2\u0131^\3\2"+
		"\2\2\u0132\u0133\7U\2\2\u0133\u0134\7g\2\2\u0134\u0135\7v\2\2\u0135`\3"+
		"\2\2\2\u0136\u013a\t\6\2\2\u0137\u0139\t\4\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bb\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013d\u013f\t\7\2\2\u013e\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141d\3\2\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7f\2\2\u0144\u0145\7f\2\2\u0145f\3\2\2\2\u0146"+
		"\u0147\7o\2\2\u0147\u0148\7g\2\2\u0148\u0149\7t\2\2\u0149\u014a\7i\2\2"+
		"\u014a\u014b\7g\2\2\u014bh\3\2\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2"+
		"\2\u014e\u014f\7e\2\2\u014f\u0150\7n\2\2\u0150\u0151\7w\2\2\u0151\u0152"+
		"\7f\2\2\u0152\u0153\7g\2\2\u0153j\3\2\2\2\u0154\u0155\7f\2\2\u0155\u0156"+
		"\7g\2\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2\u0158\u0159\7v\2\2\u0159"+
		"\u015a\7g\2\2\u015al\3\2\2\2\u015b\u015d\t\b\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0161\3\2\2\2\u015e\u0160\t\4\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162n\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7(\2\2\u0165\u0166\7(\2\2\u0166p\3\2\2\2\u0167\u0168"+
		"\7~\2\2\u0168\u0169\7~\2\2\u0169r\3\2\2\2\16\2\u0092\u00f1\u00f3\u0103"+
		"\u0117\u0138\u013a\u0140\u015c\u015f\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}