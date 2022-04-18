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
		RETURN=1, PRINT=2, BOOL_VALUE=3, IF=4, ELSE=5, ELSE_IF=6, INIT=7, EACH=8, 
		INT=9, NEW_WORD=10, DIVIDE=11, TIMES=12, PLUS=13, MINUS=14, BOOL=15, VOID=16, 
		FPTR=17, PLUS_PLUS=18, MINUS_MINUS=19, QUESTION_MARK=20, COLON=21, COMMA=22, 
		NOT=23, ABS_SIGN=24, CLASS=25, SELF_SMALL_NAME=26, ACCESS_TYPE=27, RBACK=28, 
		LBACK=29, LCURL=30, RCURL=31, LPAR=32, RPAR=33, ARROW=34, NEW_LINE=35, 
		BEGIN_COMMENT=36, END_COMMENT=37, LT=38, GT=39, EQUAL=40, DOT=41, SHARP_SIGN=42, 
		SET=43, CAP_NAME=44, NUM=45, SMALL_NAME=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RETURN", "PRINT", "BOOL_VALUE", "IF", "ELSE", "ELSE_IF", "INIT", "EACH", 
			"INT", "NEW_WORD", "DIVIDE", "TIMES", "PLUS", "MINUS", "BOOL", "VOID", 
			"FPTR", "PLUS_PLUS", "MINUS_MINUS", "QUESTION_MARK", "COLON", "COMMA", 
			"NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", "ACCESS_TYPE", "RBACK", 
			"LBACK", "LCURL", "RCURL", "LPAR", "RPAR", "ARROW", "NEW_LINE", "BEGIN_COMMENT", 
			"END_COMMENT", "LT", "GT", "EQUAL", "DOT", "SHARP_SIGN", "SET", "CAP_NAME", 
			"NUM", "SMALL_NAME", "WS"
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
			"SET", "CAP_NAME", "NUM", "SMALL_NAME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0137\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4x\n\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00d5"+
		"\n\33\f\33\16\33\u00d8\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u00e7\n\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\6$\u00f9\n$\r$\16$\u00fa\3$\3$\6$\u00ff"+
		"\n$\r$\16$\u0100\5$\u0103\n$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3-\3-\7-\u0121\n-\f-\16-\u0124"+
		"\13-\3.\6.\u0127\n.\r.\16.\u0128\3/\5/\u012c\n/\3/\7/\u012f\n/\f/\16/"+
		"\u0132\13/\3\60\3\60\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61\3\2\b\3\2c|\5\2\62;aac|\3\2C\\\3\2\62;\4\2aac|\5\2\13\13\17"+
		"\17\"\"\2\u013f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\3a\3\2\2\2\5h\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13|\3\2\2\2\r\u0081"+
		"\3\2\2\2\17\u0087\3\2\2\2\21\u0092\3\2\2\2\23\u0097\3\2\2\2\25\u009b\3"+
		"\2\2\2\27\u009f\3\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2\2\2\35\u00a5\3\2"+
		"\2\2\37\u00a7\3\2\2\2!\u00ac\3\2\2\2#\u00b1\3\2\2\2%\u00b6\3\2\2\2\'\u00b9"+
		"\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61"+
		"\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00cc\3\2\2\2\67\u00e6\3\2\2\29\u00e8"+
		"\3\2\2\2;\u00ea\3\2\2\2=\u00ec\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C"+
		"\u00f2\3\2\2\2E\u00f4\3\2\2\2G\u0102\3\2\2\2I\u0104\3\2\2\2K\u010b\3\2"+
		"\2\2M\u0110\3\2\2\2O\u0112\3\2\2\2Q\u0114\3\2\2\2S\u0116\3\2\2\2U\u0118"+
		"\3\2\2\2W\u011a\3\2\2\2Y\u011e\3\2\2\2[\u0126\3\2\2\2]\u012b\3\2\2\2_"+
		"\u0133\3\2\2\2ab\7t\2\2bc\7g\2\2cd\7v\2\2de\7w\2\2ef\7t\2\2fg\7p\2\2g"+
		"\4\3\2\2\2hi\7r\2\2ij\7t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2m\6\3\2\2\2no\7"+
		"v\2\2op\7t\2\2pq\7w\2\2qx\7g\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2v"+
		"x\7g\2\2wn\3\2\2\2wr\3\2\2\2x\b\3\2\2\2yz\7k\2\2z{\7h\2\2{\n\3\2\2\2|"+
		"}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080\f\3\2\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7h\2\2\u0086\16\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7c\2\2"+
		"\u008d\u008e\7n\2\2\u008e\u008f\7k\2\2\u008f\u0090\7|\2\2\u0090\u0091"+
		"\7g\2\2\u0091\20\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7e\2\2\u0095\u0096\7j\2\2\u0096\22\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7v\2\2\u009a\24\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7y\2\2\u009e\26\3\2\2\2\u009f\u00a0\7^\2\2\u00a0\30"+
		"\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4"+
		"\34\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7n\2\2\u00ab \3\2\2\2\u00ac"+
		"\u00ad\7x\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7f\2\2"+
		"\u00b0\"\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7v"+
		"\2\2\u00b4\u00b5\7t\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7\u00b8"+
		"\7-\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bb\7/\2\2\u00bb(\3"+
		"\2\2\2\u00bc\u00bd\7A\2\2\u00bd*\3\2\2\2\u00be\u00bf\7<\2\2\u00bf,\3\2"+
		"\2\2\u00c0\u00c1\7.\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7#\2\2\u00c3\60\3\2"+
		"\2\2\u00c4\u00c5\7~\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\64\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7h\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\t\2"+
		"\2\2\u00d3\u00d5\t\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\66\3\2\2\2\u00d8\u00d6\3\2\2"+
		"\2\u00d9\u00da\7r\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7x\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7v\2\2\u00df\u00e7\7g\2\2\u00e0"+
		"\u00e1\7r\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4\u00e5\7k\2\2\u00e5\u00e7\7e\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00e0"+
		"\3\2\2\2\u00e78\3\2\2\2\u00e8\u00e9\7_\2\2\u00e9:\3\2\2\2\u00ea\u00eb"+
		"\7]\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7}\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7"+
		"\177\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1B\3\2\2\2\u00f2\u00f3"+
		"\7+\2\2\u00f3D\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\7@\2\2\u00f6F\3"+
		"\2\2\2\u00f7\u00f9\7\f\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0103\3\2\2\2\u00fc\u00fe\7="+
		"\2\2\u00fd\u00ff\7\f\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00f8\3\2"+
		"\2\2\u0102\u00fc\3\2\2\2\u0103H\3\2\2\2\u0104\u0105\7?\2\2\u0105\u0106"+
		"\7d\2\2\u0106\u0107\7g\2\2\u0107\u0108\7i\2\2\u0108\u0109\7k\2\2\u0109"+
		"\u010a\7p\2\2\u010aJ\3\2\2\2\u010b\u010c\7?\2\2\u010c\u010d\7g\2\2\u010d"+
		"\u010e\7p\2\2\u010e\u010f\7f\2\2\u010fL\3\2\2\2\u0110\u0111\7>\2\2\u0111"+
		"N\3\2\2\2\u0112\u0113\7@\2\2\u0113P\3\2\2\2\u0114\u0115\7?\2\2\u0115R"+
		"\3\2\2\2\u0116\u0117\7\60\2\2\u0117T\3\2\2\2\u0118\u0119\7%\2\2\u0119"+
		"V\3\2\2\2\u011a\u011b\7U\2\2\u011b\u011c\7g\2\2\u011c\u011d\7v\2\2\u011d"+
		"X\3\2\2\2\u011e\u0122\t\4\2\2\u011f\u0121\t\3\2\2\u0120\u011f\3\2\2\2"+
		"\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123Z\3"+
		"\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\t\5\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\\\3\2\2\2"+
		"\u012a\u012c\t\6\2\2\u012b\u012a\3\2\2\2\u012c\u0130\3\2\2\2\u012d\u012f"+
		"\t\3\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131^\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\t\7\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0136\b\60\2\2\u0136`\3\2\2\2\20\2w\u00d4\u00d6"+
		"\u00e6\u00fa\u0100\u0102\u0120\u0122\u0128\u012b\u012e\u0130\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}