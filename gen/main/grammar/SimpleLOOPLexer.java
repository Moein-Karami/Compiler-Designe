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
		SMALL_NAME=50, AND_AND=51, OR_OR=52;
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
			"SHARP_SIGN", "SET", "CAP_NAME", "NUM", "SMALL_NAME", "AND_AND", "OR_OR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u008b\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u00ea\n\36\f\36\16\36\u00ed"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u00fc\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\5\'\u0110\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u0131\n\61"+
		"\f\61\16\61\u0134\13\61\3\62\6\62\u0137\n\62\r\62\16\62\u0138\3\63\5\63"+
		"\u013c\n\63\3\63\7\63\u013f\n\63\f\63\16\63\u0142\13\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66\3\2\t\4\2\13\13\"\"\3\2c|\5\2\62;aac|\4\2\f\f\17\17\3\2C"+
		"\\\3\2\62;\4\2aac|\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\3k\3\2\2\2\5m\3\2\2\2\7q\3\2\2\2\tx\3\2\2\2\13~\3\2\2\2\r\u008a\3"+
		"\2\2\2\17\u008c\3\2\2\2\21\u008f\3\2\2\2\23\u0094\3\2\2\2\25\u009a\3\2"+
		"\2\2\27\u00a5\3\2\2\2\31\u00aa\3\2\2\2\33\u00ae\3\2\2\2\35\u00b2\3\2\2"+
		"\2\37\u00b4\3\2\2\2!\u00b6\3\2\2\2#\u00b8\3\2\2\2%\u00ba\3\2\2\2\'\u00bf"+
		"\3\2\2\2)\u00c4\3\2\2\2+\u00c9\3\2\2\2-\u00cc\3\2\2\2/\u00cf\3\2\2\2\61"+
		"\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00d9"+
		"\3\2\2\2;\u00df\3\2\2\2=\u00fb\3\2\2\2?\u00fd\3\2\2\2A\u00ff\3\2\2\2C"+
		"\u0101\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I\u0107\3\2\2\2K\u0109\3\2"+
		"\2\2M\u010f\3\2\2\2O\u0111\3\2\2\2Q\u0118\3\2\2\2S\u011d\3\2\2\2U\u011f"+
		"\3\2\2\2W\u0121\3\2\2\2Y\u0124\3\2\2\2[\u0126\3\2\2\2]\u0128\3\2\2\2_"+
		"\u012a\3\2\2\2a\u012e\3\2\2\2c\u0136\3\2\2\2e\u013b\3\2\2\2g\u0143\3\2"+
		"\2\2i\u0146\3\2\2\2kl\7=\2\2l\4\3\2\2\2mn\t\2\2\2no\3\2\2\2op\b\3\2\2"+
		"p\6\3\2\2\2qr\7t\2\2rs\7g\2\2st\7v\2\2tu\7w\2\2uv\7t\2\2vw\7p\2\2w\b\3"+
		"\2\2\2xy\7r\2\2yz\7t\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\n\3\2\2\2~\177\7"+
		"f\2\2\177\u0080\7q\2\2\u0080\f\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7w\2\2\u0084\u008b\7g\2\2\u0085\u0086\7h\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089\u008b\7g\2\2"+
		"\u008a\u0081\3\2\2\2\u008a\u0085\3\2\2\2\u008b\16\3\2\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7h\2\2\u008e\20\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\22\3\2\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7h\2\2\u0099\24\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7n\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7|\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7e\2\2\u00a8\u00a9\7j\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7y\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3"+
		"\36\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7-\2\2\u00b7"+
		"\"\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7n\2\2\u00be&\3\2\2\2\u00bf"+
		"\u00c0\7x\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7f\2\2"+
		"\u00c3(\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7v\2"+
		"\2\u00c7\u00c8\7t\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\u00cb\7"+
		"-\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\7/\2\2\u00ce.\3\2"+
		"\2\2\u00cf\u00d0\7A\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2\62\3"+
		"\2\2\2\u00d3\u00d4\7.\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\66"+
		"\3\2\2\2\u00d7\u00d8\7~\2\2\u00d88\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db"+
		"\7n\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7u\2\2\u00de"+
		":\3\2\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7n\2\2\u00e2"+
		"\u00e3\7h\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\t\3"+
		"\2\2\u00e6\u00e7\7a\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec<\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7c\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00fc\7g\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7w\2\2"+
		"\u00f7\u00f8\7d\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fc"+
		"\7e\2\2\u00fb\u00ee\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fc>\3\2\2\2\u00fd\u00fe"+
		"\7_\2\2\u00fe@\3\2\2\2\u00ff\u0100\7]\2\2\u0100B\3\2\2\2\u0101\u0102\7"+
		"}\2\2\u0102D\3\2\2\2\u0103\u0104\7\177\2\2\u0104F\3\2\2\2\u0105\u0106"+
		"\7*\2\2\u0106H\3\2\2\2\u0107\u0108\7+\2\2\u0108J\3\2\2\2\u0109\u010a\7"+
		"/\2\2\u010a\u010b\7@\2\2\u010bL\3\2\2\2\u010c\u0110\t\5\2\2\u010d\u010e"+
		"\7=\2\2\u010e\u0110\t\5\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"N\3\2\2\2\u0111\u0112\7?\2\2\u0112\u0113\7d\2\2\u0113\u0114\7g\2\2\u0114"+
		"\u0115\7i\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117P\3\2\2\2\u0118"+
		"\u0119\7?\2\2\u0119\u011a\7g\2\2\u011a\u011b\7p\2\2\u011b\u011c\7f\2\2"+
		"\u011cR\3\2\2\2\u011d\u011e\7>\2\2\u011eT\3\2\2\2\u011f\u0120\7@\2\2\u0120"+
		"V\3\2\2\2\u0121\u0122\7?\2\2\u0122\u0123\7?\2\2\u0123X\3\2\2\2\u0124\u0125"+
		"\7?\2\2\u0125Z\3\2\2\2\u0126\u0127\7\60\2\2\u0127\\\3\2\2\2\u0128\u0129"+
		"\7%\2\2\u0129^\3\2\2\2\u012a\u012b\7U\2\2\u012b\u012c\7g\2\2\u012c\u012d"+
		"\7v\2\2\u012d`\3\2\2\2\u012e\u0132\t\6\2\2\u012f\u0131\t\4\2\2\u0130\u012f"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"b\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\t\7\2\2\u0136\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139d\3"+
		"\2\2\2\u013a\u013c\t\b\2\2\u013b\u013a\3\2\2\2\u013c\u0140\3\2\2\2\u013d"+
		"\u013f\t\4\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141f\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144"+
		"\7(\2\2\u0144\u0145\7(\2\2\u0145h\3\2\2\2\u0146\u0147\7~\2\2\u0147\u0148"+
		"\7~\2\2\u0148j\3\2\2\2\16\2\u008a\u00e9\u00eb\u00fb\u010f\u0130\u0132"+
		"\u0138\u013b\u013e\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}