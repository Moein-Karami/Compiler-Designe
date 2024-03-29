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
		WS=1, ONELINE_COMMENT=2, RETURN=3, PRINT=4, DO=5, BOOL_VALUE=6, IF=7, 
		ELSE=8, ELSE_IF=9, INIT=10, EACH=11, INT=12, NEW_WORD=13, DIVIDE=14, TIMES=15, 
		PLUS=16, MINUS=17, BOOL=18, VOID=19, FPTR=20, PLUS_PLUS=21, MINUS_MINUS=22, 
		QUESTION_MARK=23, COLON=24, COMMA=25, NOT=26, ABS_SIGN=27, CLASS=28, SELF_SMALL_NAME=29, 
		ACCESS_TYPE=30, RBRACK=31, LBRACK=32, LCURL=33, RCURL=34, LPAR=35, RPAR=36, 
		ARROW=37, NEW_LINE=38, BEGIN_COMMENT=39, END_COMMENT=40, LT=41, GT=42, 
		IS_EQUAL=43, EQUAL=44, DOT=45, SHARP_SIGN=46, SET=47, CAP_NAME=48, NUM=49, 
		ADD=50, MERGE=51, INCLUDE=52, DELETE=53, SMALL_NAME=54, AND_AND=55, OR_OR=56, 
		Unknown=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "ONELINE_COMMENT", "RETURN", "PRINT", "DO", "BOOL_VALUE", "IF", 
			"ELSE", "ELSE_IF", "INIT", "EACH", "INT", "NEW_WORD", "DIVIDE", "TIMES", 
			"PLUS", "MINUS", "BOOL", "VOID", "FPTR", "PLUS_PLUS", "MINUS_MINUS", 
			"QUESTION_MARK", "COLON", "COMMA", "NOT", "ABS_SIGN", "CLASS", "SELF_SMALL_NAME", 
			"ACCESS_TYPE", "RBRACK", "LBRACK", "LCURL", "RCURL", "LPAR", "RPAR", 
			"ARROW", "NEW_LINE", "BEGIN_COMMENT", "END_COMMENT", "LT", "GT", "IS_EQUAL", 
			"EQUAL", "DOT", "SHARP_SIGN", "SET", "CAP_NAME", "NUM", "ADD", "MERGE", 
			"INCLUDE", "DELETE", "SMALL_NAME", "AND_AND", "OR_OR", "Unknown"
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
			"INCLUDE", "DELETE", "SMALL_NAME", "AND_AND", "OR_OR", "Unknown"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u009c\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u00fb\n\36\f\36\16\36\u00fe"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u010d\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\5"+
		"\'\u011f\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u0140\n\61\f\61"+
		"\16\61\u0143\13\61\3\62\6\62\u0146\n\62\r\62\16\62\u0147\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\5\67\u0164\n\67\3\67\7\67"+
		"\u0167\n\67\f\67\16\67\u016a\13\67\38\38\38\39\39\39\3:\3:\2\2;\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";\3\2\n\4\2\13\13\"\"\4\2\f\f\17\17\3\2c|\6\2\62;C\\aac|\5\2\f\f\17\17"+
		"==\3\2C\\\3\2\62;\4\2aac|\2\u0179\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3"+
		"u\3\2\2\2\5y\3\2\2\2\7\u0082\3\2\2\2\t\u0089\3\2\2\2\13\u008f\3\2\2\2"+
		"\r\u009b\3\2\2\2\17\u009d\3\2\2\2\21\u00a0\3\2\2\2\23\u00a5\3\2\2\2\25"+
		"\u00ab\3\2\2\2\27\u00b6\3\2\2\2\31\u00bb\3\2\2\2\33\u00bf\3\2\2\2\35\u00c3"+
		"\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2\2\2#\u00c9\3\2\2\2%\u00cb\3\2\2\2"+
		"\'\u00d0\3\2\2\2)\u00d5\3\2\2\2+\u00da\3\2\2\2-\u00dd\3\2\2\2/\u00e0\3"+
		"\2\2\2\61\u00e2\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2\2\2\67\u00e8\3\2"+
		"\2\29\u00ea\3\2\2\2;\u00f0\3\2\2\2=\u010c\3\2\2\2?\u010e\3\2\2\2A\u0110"+
		"\3\2\2\2C\u0112\3\2\2\2E\u0114\3\2\2\2G\u0116\3\2\2\2I\u0118\3\2\2\2K"+
		"\u011a\3\2\2\2M\u011e\3\2\2\2O\u0120\3\2\2\2Q\u0127\3\2\2\2S\u012c\3\2"+
		"\2\2U\u012e\3\2\2\2W\u0130\3\2\2\2Y\u0133\3\2\2\2[\u0135\3\2\2\2]\u0137"+
		"\3\2\2\2_\u0139\3\2\2\2a\u013d\3\2\2\2c\u0145\3\2\2\2e\u0149\3\2\2\2g"+
		"\u014d\3\2\2\2i\u0153\3\2\2\2k\u015b\3\2\2\2m\u0163\3\2\2\2o\u016b\3\2"+
		"\2\2q\u016e\3\2\2\2s\u0171\3\2\2\2uv\t\2\2\2vw\3\2\2\2wx\b\2\2\2x\4\3"+
		"\2\2\2y}\7%\2\2z|\n\3\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~"+
		"\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\3\2\2\u0081\6\3\2\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086\7w\2\2"+
		"\u0086\u0087\7t\2\2\u0087\u0088\7p\2\2\u0088\b\3\2\2\2\u0089\u008a\7r"+
		"\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e"+
		"\7v\2\2\u008e\n\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7q\2\2\u0091\f"+
		"\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7w\2\2\u0095"+
		"\u009c\7g\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7u\2\2\u009a\u009c\7g\2\2\u009b\u0092\3\2\2\2\u009b\u0096"+
		"\3\2\2\2\u009c\16\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f"+
		"\20\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa\24\3\2\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7v\2\2"+
		"\u00af\u00b0\7k\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3"+
		"\7k\2\2\u00b3\u00b4\7|\2\2\u00b4\u00b5\7g\2\2\u00b5\26\3\2\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7j\2\2\u00ba"+
		"\30\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\32\3\2\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7y\2\2\u00c2"+
		"\34\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6"+
		" \3\2\2\2\u00c7\u00c8\7-\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca"+
		"$\3\2\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7x\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"\u00d3\7k\2\2\u00d3\u00d4\7f\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6"+
		"\u00d7\7r\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9*\3\2\2\2\u00da"+
		"\u00db\7-\2\2\u00db\u00dc\7-\2\2\u00dc,\3\2\2\2\u00dd\u00de\7/\2\2\u00de"+
		"\u00df\7/\2\2\u00df.\3\2\2\2\u00e0\u00e1\7A\2\2\u00e1\60\3\2\2\2\u00e2"+
		"\u00e3\7<\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5\64\3\2\2\2\u00e6"+
		"\u00e7\7#\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7~\2\2\u00e98\3\2\2\2\u00ea"+
		"\u00eb\7e\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7u\2\2"+
		"\u00ee\u00ef\7u\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2"+
		"\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7\60\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f7\t\4\2\2\u00f7\u00f8\7a\2\2\u00f8\u00fc\3\2\2\2\u00f9"+
		"\u00fb\t\5\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd<\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100"+
		"\7r\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2\u0102\u0103\7x\2\2\u0103"+
		"\u0104\7c\2\2\u0104\u0105\7v\2\2\u0105\u010d\7g\2\2\u0106\u0107\7r\2\2"+
		"\u0107\u0108\7w\2\2\u0108\u0109\7d\2\2\u0109\u010a\7n\2\2\u010a\u010b"+
		"\7k\2\2\u010b\u010d\7e\2\2\u010c\u00ff\3\2\2\2\u010c\u0106\3\2\2\2\u010d"+
		">\3\2\2\2\u010e\u010f\7_\2\2\u010f@\3\2\2\2\u0110\u0111\7]\2\2\u0111B"+
		"\3\2\2\2\u0112\u0113\7}\2\2\u0113D\3\2\2\2\u0114\u0115\7\177\2\2\u0115"+
		"F\3\2\2\2\u0116\u0117\7*\2\2\u0117H\3\2\2\2\u0118\u0119\7+\2\2\u0119J"+
		"\3\2\2\2\u011a\u011b\7/\2\2\u011b\u011c\7@\2\2\u011cL\3\2\2\2\u011d\u011f"+
		"\t\6\2\2\u011e\u011d\3\2\2\2\u011fN\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122"+
		"\7d\2\2\u0122\u0123\7g\2\2\u0123\u0124\7i\2\2\u0124\u0125\7k\2\2\u0125"+
		"\u0126\7p\2\2\u0126P\3\2\2\2\u0127\u0128\7?\2\2\u0128\u0129\7g\2\2\u0129"+
		"\u012a\7p\2\2\u012a\u012b\7f\2\2\u012bR\3\2\2\2\u012c\u012d\7>\2\2\u012d"+
		"T\3\2\2\2\u012e\u012f\7@\2\2\u012fV\3\2\2\2\u0130\u0131\7?\2\2\u0131\u0132"+
		"\7?\2\2\u0132X\3\2\2\2\u0133\u0134\7?\2\2\u0134Z\3\2\2\2\u0135\u0136\7"+
		"\60\2\2\u0136\\\3\2\2\2\u0137\u0138\7%\2\2\u0138^\3\2\2\2\u0139\u013a"+
		"\7U\2\2\u013a\u013b\7g\2\2\u013b\u013c\7v\2\2\u013c`\3\2\2\2\u013d\u0141"+
		"\t\7\2\2\u013e\u0140\t\5\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142b\3\2\2\2\u0143\u0141\3\2\2\2"+
		"\u0144\u0146\t\b\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148d\3\2\2\2\u0149\u014a\7c\2\2\u014a\u014b"+
		"\7f\2\2\u014b\u014c\7f\2\2\u014cf\3\2\2\2\u014d\u014e\7o\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0150\7t\2\2\u0150\u0151\7i\2\2\u0151\u0152\7g\2\2\u0152"+
		"h\3\2\2\2\u0153\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155\u0156\7e\2\2\u0156"+
		"\u0157\7n\2\2\u0157\u0158\7w\2\2\u0158\u0159\7f\2\2\u0159\u015a\7g\2\2"+
		"\u015aj\3\2\2\2\u015b\u015c\7f\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2"+
		"\2\u015e\u015f\7g\2\2\u015f\u0160\7v\2\2\u0160\u0161\7g\2\2\u0161l\3\2"+
		"\2\2\u0162\u0164\t\t\2\2\u0163\u0162\3\2\2\2\u0164\u0168\3\2\2\2\u0165"+
		"\u0167\t\5\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169n\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c"+
		"\7(\2\2\u016c\u016d\7(\2\2\u016dp\3\2\2\2\u016e\u016f\7~\2\2\u016f\u0170"+
		"\7~\2\2\u0170r\3\2\2\2\u0171\u0172\3\2\2\2\u0172t\3\2\2\2\17\2}\u009b"+
		"\u00fa\u00fc\u010c\u011e\u013f\u0141\u0147\u0163\u0166\u0168\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}