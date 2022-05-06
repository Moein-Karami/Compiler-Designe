// Generated from C:/Users/AryanSM/Desktop/Aryan/University/Compiler/Compiler-Designe/02_Symbol Table/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package parsers;

     import main.ast.nodes.*;
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.classDec.classMembersDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 
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
		LINE_BREAK=1, CLASS=2, PUBLIC=3, PRIVATE=4, INITIALIZE=5, NEW=6, SELF=7, 
		RETURN=8, VOID=9, DELETE=10, INCLUDE=11, ADD=12, MERGE=13, PRINT=14, IF=15, 
		ELSE=16, ELSIF=17, PLUS=18, MINUS=19, MULT=20, DIVIDE=21, INC=22, DEC=23, 
		EQUAL=24, GREATER_THAN=25, LESS_THAN=26, ARROW=27, BAR=28, AND=29, OR=30, 
		NOT=31, TIF=32, TELSE=33, TRUE=34, FALSE=35, NULL=36, BEGIN=37, END=38, 
		INT=39, BOOL=40, FPTR=41, SET=42, EACH=43, DO=44, ASSIGN=45, SHARP=46, 
		LPAR=47, RPAR=48, LBRACK=49, RBRACK=50, LBRACE=51, RBRACE=52, COMMA=53, 
		DOT=54, SEMICOLON=55, NEWLINE=56, INT_VALUE=57, IDENTIFIER=58, CLASS_IDENTIFIER=59, 
		COMMENT=60, MLCOMMENT=61, WS=62;
	public static final int
		RULE_simpleLOOP = 0, RULE_program = 1, RULE_constructor = 2, RULE_classDeclaration = 3, 
		RULE_field_decleration = 4, RULE_method = 5, RULE_methodBody = 6, RULE_methodArgsDec = 7, 
		RULE_argDec = 8, RULE_methodArgs = 9, RULE_body = 10, RULE_blockStatement = 11, 
		RULE_singleStatement = 12, RULE_addStatement = 13, RULE_mergeStatement = 14, 
		RULE_deleteStatement = 15, RULE_varDecStatement = 16, RULE_ifStatement = 17, 
		RULE_elsifStatement = 18, RULE_condition = 19, RULE_elseStatement = 20, 
		RULE_printStatement = 21, RULE_methodCallStmt = 22, RULE_returnStatement = 23, 
		RULE_assignmentStatement = 24, RULE_loopStatement = 25, RULE_expression = 26, 
		RULE_ternaryExpression = 27, RULE_orExpression = 28, RULE_andExpression = 29, 
		RULE_equalityExpression = 30, RULE_relationalExpression = 31, RULE_additiveExpression = 32, 
		RULE_multiplicativeExpression = 33, RULE_preUnaryExpression = 34, RULE_postUnaryExpression = 35, 
		RULE_accessExpression = 36, RULE_otherExpression = 37, RULE_setNew = 38, 
		RULE_value = 39, RULE_boolValue = 40, RULE_class_identifier = 41, RULE_identifier = 42, 
		RULE_type = 43, RULE_array_type = 44, RULE_fptr_type = 45, RULE_set_type = 46, 
		RULE_int_value = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLOOP", "program", "constructor", "classDeclaration", "field_decleration", 
			"method", "methodBody", "methodArgsDec", "argDec", "methodArgs", "body", 
			"blockStatement", "singleStatement", "addStatement", "mergeStatement", 
			"deleteStatement", "varDecStatement", "ifStatement", "elsifStatement", 
			"condition", "elseStatement", "printStatement", "methodCallStmt", "returnStatement", 
			"assignmentStatement", "loopStatement", "expression", "ternaryExpression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"postUnaryExpression", "accessExpression", "otherExpression", "setNew", 
			"value", "boolValue", "class_identifier", "identifier", "type", "array_type", 
			"fptr_type", "set_type", "int_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'public'", "'private'", "'initialize'", "'new'", 
			"'self'", "'return'", "'void'", "'delete'", "'include'", "'add'", "'merge'", 
			"'print'", "'if'", "'else'", "'elsif'", "'+'", "'-'", "'*'", "'/'", "'++'", 
			"'--'", "'=='", "'>'", "'<'", "'->'", "'|'", "'&&'", "'||'", "'!'", "'?'", 
			"':'", "'true'", "'false'", "'null'", "'=begin'", "'=end'", "'int'", 
			"'bool'", "'fptr'", "'Set'", "'each'", "'do'", "'='", "'#'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'.'", "';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_BREAK", "CLASS", "PUBLIC", "PRIVATE", "INITIALIZE", "NEW", 
			"SELF", "RETURN", "VOID", "DELETE", "INCLUDE", "ADD", "MERGE", "PRINT", 
			"IF", "ELSE", "ELSIF", "PLUS", "MINUS", "MULT", "DIVIDE", "INC", "DEC", 
			"EQUAL", "GREATER_THAN", "LESS_THAN", "ARROW", "BAR", "AND", "OR", "NOT", 
			"TIF", "TELSE", "TRUE", "FALSE", "NULL", "BEGIN", "END", "INT", "BOOL", 
			"FPTR", "SET", "EACH", "DO", "ASSIGN", "SHARP", "LPAR", "RPAR", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "SEMICOLON", "NEWLINE", 
			"INT_VALUE", "IDENTIFIER", "CLASS_IDENTIFIER", "COMMENT", "MLCOMMENT", 
			"WS"
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

	public static class SimpleLOOPContext extends ParserRuleContext {
		public Program simpleLOOPProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SimpleLOOPParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public SimpleLOOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLOOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSimpleLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSimpleLOOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSimpleLOOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleLOOPContext simpleLOOP() throws RecognitionException {
		SimpleLOOPContext _localctx = new SimpleLOOPContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simpleLOOP);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(NEWLINE);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(102);
			((SimpleLOOPContext)_localctx).p = program();
			((SimpleLOOPContext)_localctx).simpleLOOPProgram =  ((SimpleLOOPContext)_localctx).p.programRet;
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(104);
				match(NEWLINE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public VarDecStatementContext v;
		public ClassDeclarationContext c;
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(113);
				((ProgramContext)_localctx).v = varDecStatement();
				setState(115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        for (VariableDeclaration varDec: ((ProgramContext)_localctx).v.varDecStatement_ret)
				            _localctx.programRet.addGlobalVariable(varDec);
				    
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(126);
				((ProgramContext)_localctx).c = classDeclaration();
				setState(128); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(127);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(130); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.programRet.addClass(((ProgramContext)_localctx).c.classDeclaration_ret);
				}
				}
				setState(138);
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration constructor_ret;
		public Token INITIALIZE;
		public MethodArgsDecContext ma;
		public MethodBodyContext mb;
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public TerminalNode INITIALIZE() { return getToken(SimpleLOOPParser.INITIALIZE, 0); }
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorContext)_localctx).constructor_ret =  new ConstructorDeclaration();
			setState(140);
			match(PUBLIC);
			setState(141);
			((ConstructorContext)_localctx).INITIALIZE = match(INITIALIZE);
			_localctx.constructor_ret.setLine(((ConstructorContext)_localctx).INITIALIZE.getLine()); _localctx.constructor_ret.setMethodName(new Identifier(((ConstructorContext)_localctx).INITIALIZE.getText()));
			setState(143);
			((ConstructorContext)_localctx).ma = methodArgsDec();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(144);
				match(NEWLINE);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			((ConstructorContext)_localctx).mb = methodBody();
			_localctx.constructor_ret.setArgs(((ConstructorContext)_localctx).ma.methodArgsDec_ret);
				_localctx.constructor_ret.setBody(((ConstructorContext)_localctx).mb.methodBody_ret.getBody()); _localctx.constructor_ret.setLocalVars(((ConstructorContext)_localctx).mb.methodBody_ret.getLocalVars());
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclaration classDeclaration_ret;
		public Token CLASS;
		public Class_identifierContext ci;
		public Class_identifierContext pci;
		public Field_declerationContext fd;
		public Field_declerationContext fd2;
		public TerminalNode CLASS() { return getToken(SimpleLOOPParser.CLASS, 0); }
		public List<Class_identifierContext> class_identifier() {
			return getRuleContexts(Class_identifierContext.class);
		}
		public Class_identifierContext class_identifier(int i) {
			return getRuleContext(Class_identifierContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<Field_declerationContext> field_decleration() {
			return getRuleContexts(Field_declerationContext.class);
		}
		public Field_declerationContext field_decleration(int i) {
			return getRuleContext(Field_declerationContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((ClassDeclarationContext)_localctx).CLASS = match(CLASS);
			setState(154);
			((ClassDeclarationContext)_localctx).ci = class_identifier();
			((ClassDeclarationContext)_localctx).classDeclaration_ret =  new ClassDeclaration(((ClassDeclarationContext)_localctx).ci.class_identifier_ret);
			    _localctx.classDeclaration_ret.setLine(((ClassDeclarationContext)_localctx).CLASS.getLine());
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(156);
				match(LESS_THAN);
				setState(157);
				((ClassDeclarationContext)_localctx).pci = class_identifier();
				_localctx.classDeclaration_ret.setParentClassName(((ClassDeclarationContext)_localctx).pci.class_identifier_ret);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(162);
				match(NEWLINE);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(168);
				match(LBRACE);
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					match(NEWLINE);
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					((ClassDeclarationContext)_localctx).fd = field_decleration();

					            FieldDeclaration new_fd;
					            ConstructorDeclaration new2_fd;
					            MethodDeclaration new3_fd;
					            if(((ClassDeclarationContext)_localctx).fd.field_decleration_ret instanceof FieldDeclaration)
					            {
					                new_fd = (FieldDeclaration)((ClassDeclarationContext)_localctx).fd.field_decleration_ret;
					                _localctx.classDeclaration_ret.addField(new_fd);
					             }
					            if(((ClassDeclarationContext)_localctx).fd.field_decleration_ret instanceof ConstructorDeclaration)
					            {
					                new2_fd = (ConstructorDeclaration)((ClassDeclarationContext)_localctx).fd.field_decleration_ret;
					                _localctx.classDeclaration_ret.setConstructor(new2_fd);
					            }
					            if(((ClassDeclarationContext)_localctx).fd.field_decleration_ret instanceof MethodDeclaration)
					            {
					                new3_fd = (MethodDeclaration)((ClassDeclarationContext)_localctx).fd.field_decleration_ret;
					                _localctx.classDeclaration_ret.addMethod(new3_fd);
					            }
					        
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PUBLIC || _la==PRIVATE );
				setState(181);
				match(RBRACE);
				}
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				setState(183);
				((ClassDeclarationContext)_localctx).fd2 = field_decleration();

				        FieldDeclaration new_fd2;
				        ConstructorDeclaration new2_fd2;
				        MethodDeclaration new3_fd2;
				        if(((ClassDeclarationContext)_localctx).fd2.field_decleration_ret instanceof FieldDeclaration)
				        {
				            new_fd2 = (FieldDeclaration)((ClassDeclarationContext)_localctx).fd2.field_decleration_ret;
				            _localctx.classDeclaration_ret.addField(new_fd2);
				        }
				        if(((ClassDeclarationContext)_localctx).fd2.field_decleration_ret instanceof ConstructorDeclaration)
				        {
				            new2_fd2 = (ConstructorDeclaration)((ClassDeclarationContext)_localctx).fd2.field_decleration_ret;
				            _localctx.classDeclaration_ret.setConstructor(new2_fd2);
				        }
				        if(((ClassDeclarationContext)_localctx).fd2.field_decleration_ret instanceof MethodDeclaration)
				        {
				            new3_fd2 = (MethodDeclaration)((ClassDeclarationContext)_localctx).fd.field_decleration_ret;
				            _localctx.classDeclaration_ret.addMethod(new3_fd2);
				        }
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(NEWLINE);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Field_declerationContext extends ParserRuleContext {
		public Declaration field_decleration_ret;
		public VarDecStatementContext vd;
		public MethodContext me;
		public ConstructorContext cn;
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SimpleLOOPParser.PRIVATE, 0); }
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Field_declerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterField_decleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitField_decleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitField_decleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declerationContext field_decleration() throws RecognitionException {
		Field_declerationContext _localctx = new Field_declerationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_decleration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				boolean bl;
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUBLIC:
					{
					setState(195);
					match(PUBLIC);
					bl = false;
					}
					break;
				case PRIVATE:
					{
					setState(197);
					match(PRIVATE);
					bl = true;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					VariableDeclaration dl;
					setState(202);
					((Field_declerationContext)_localctx).vd = varDecStatement();

					        ArrayList<VariableDeclaration> var_all = ((Field_declerationContext)_localctx).vd.varDecStatement_ret;
					        dl = var_all.get(0);
					        ((Field_declerationContext)_localctx).field_decleration_ret =  new FieldDeclaration(dl, bl);
					        _localctx.field_decleration_ret.setLine(dl.getLine());
					    
					}
					break;
				case 2:
					{
					setState(205);
					((Field_declerationContext)_localctx).me = method();
					((Field_declerationContext)_localctx).field_decleration_ret =  ((Field_declerationContext)_localctx).me.method_ret;
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(210);
				((Field_declerationContext)_localctx).cn = constructor();
				((Field_declerationContext)_localctx).field_decleration_ret =  ((Field_declerationContext)_localctx).cn.constructor_ret;
				}
				break;
			}
			setState(216); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(215);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration method_ret;
		public TypeContext tmp;
		public IdentifierContext id;
		public MethodArgsDecContext ma;
		public MethodBodyContext mb;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Type tp;
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(221);
				((MethodContext)_localctx).tmp = type();
				tp = ((MethodContext)_localctx).tmp.type_ret;
				}
				break;
			case VOID:
				{
				setState(224);
				match(VOID);
				tp = new NoType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			((MethodContext)_localctx).id = identifier();
			setState(229);
			((MethodContext)_localctx).ma = methodArgsDec();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(230);
				match(NEWLINE);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			((MethodContext)_localctx).mb = methodBody();
			((MethodContext)_localctx).method_ret =  ((MethodContext)_localctx).mb.methodBody_ret; _localctx.method_ret.setMethodName(((MethodContext)_localctx).id.identifier_ret); _localctx.method_ret.setReturnType(tp);
			    _localctx.method_ret.setLine(((MethodContext)_localctx).id.identifier_ret.getLine());_localctx.method_ret.setArgs(((MethodContext)_localctx).ma.methodArgsDec_ret);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public MethodDeclaration methodBody_ret;
		public VarDecStatementContext vd;
		public SingleStatementContext ss;
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		int _la;
		try {
			int _alt;
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				((MethodBodyContext)_localctx).methodBody_ret =  new MethodDeclaration();
				{
				setState(240);
				match(LBRACE);
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(241);
					match(NEWLINE);
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						((MethodBodyContext)_localctx).vd = varDecStatement();

						          for (VariableDeclaration varDec: ((MethodBodyContext)_localctx).vd.varDecStatement_ret)
						                _localctx.methodBody_ret.addLocalVar(varDec);

						    
						setState(249); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(248);
							match(NEWLINE);
							}
							}
							setState(251); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						}
						} 
					}
					setState(257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
					{
					{
					setState(258);
					((MethodBodyContext)_localctx).ss = singleStatement();
					_localctx.methodBody_ret.addBodyStatement(((MethodBodyContext)_localctx).ss.singleStatement_ret);
					setState(261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(260);
						match(NEWLINE);
						}
						}
						setState(263); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(RBRACE);
				}
				}
				break;
			case SELF:
			case RETURN:
			case PRINT:
			case IF:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				((MethodBodyContext)_localctx).methodBody_ret =  new MethodDeclaration();
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					{
					setState(272);
					((MethodBodyContext)_localctx).vd = varDecStatement();

					        for (VariableDeclaration varDec: ((MethodBodyContext)_localctx).vd.varDecStatement_ret)
					            _localctx.methodBody_ret.addLocalVar(varDec);
					    
					setState(275); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(274);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(277); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				case 2:
					{
					{
					setState(279);
					((MethodBodyContext)_localctx).ss = singleStatement();
					_localctx.methodBody_ret.addBodyStatement(((MethodBodyContext)_localctx).ss.singleStatement_ret);
					}
					setState(283); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(282);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(285); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
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

	public static class MethodArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> methodArgsDec_ret;
		public ArgDecContext ad;
		public ArgDecContext ad2;
		public ArgDecContext arg;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<ArgDecContext> argDec() {
			return getRuleContexts(ArgDecContext.class);
		}
		public ArgDecContext argDec(int i) {
			return getRuleContext(ArgDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SimpleLOOPParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SimpleLOOPParser.ASSIGN, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public MethodArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsDecContext methodArgsDec() throws RecognitionException {
		MethodArgsDecContext _localctx = new MethodArgsDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodArgsDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((MethodArgsDecContext)_localctx).methodArgsDec_ret =  new ArrayList<VariableDeclaration>();
			setState(292);
			match(LPAR);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(293);
				((MethodArgsDecContext)_localctx).ad = argDec();
				_localctx.methodArgsDec_ret.add(((MethodArgsDecContext)_localctx).ad.argDec_ret);
				setState(306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(295);
					match(ASSIGN);
					setState(296);
					orExpression();
					}
					}
					break;
				case RPAR:
				case COMMA:
					{
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(297);
							match(COMMA);
							setState(298);
							((MethodArgsDecContext)_localctx).ad2 = argDec();
							_localctx.methodArgsDec_ret.add(((MethodArgsDecContext)_localctx).ad2.argDec_ret);
							}
							} 
						}
						setState(305);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(308);
					match(COMMA);
					setState(309);
					((MethodArgsDecContext)_localctx).arg = argDec();
					_localctx.methodArgsDec_ret.add(((MethodArgsDecContext)_localctx).arg.argDec_ret);
					setState(311);
					match(ASSIGN);
					setState(312);
					orExpression();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(321);
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

	public static class ArgDecContext extends ParserRuleContext {
		public VariableDeclaration argDec_ret;
		public TypeContext tp;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArgDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArgDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArgDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDecContext argDec() throws RecognitionException {
		ArgDecContext _localctx = new ArgDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((ArgDecContext)_localctx).tp = type();
			setState(324);
			((ArgDecContext)_localctx).id = identifier();

			        ((ArgDecContext)_localctx).argDec_ret =  new VariableDeclaration(((ArgDecContext)_localctx).id.identifier_ret, ((ArgDecContext)_localctx).tp.type_ret);
			        _localctx.argDec_ret.setLine(((ArgDecContext)_localctx).id.identifier_ret.getLine());
			    
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

	public static class MethodArgsContext extends ParserRuleContext {
		public ArrayList<Expression> methodArgs_ret;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodArgsContext)_localctx).methodArgs_ret =  new ArrayList<Expression>();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(328);
				((MethodArgsContext)_localctx).e1 = expression();
				_localctx.methodArgs_ret.add(((MethodArgsContext)_localctx).e1.expression_ret);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(330);
					match(COMMA);
					setState(331);
					((MethodArgsContext)_localctx).e2 = expression();
					_localctx.methodArgs_ret.add(((MethodArgsContext)_localctx).e2.expression_ret);
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class BodyContext extends ParserRuleContext {
		public Statement body_ret;
		public BlockStatementContext bs;
		public SingleStatementContext ss;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(341);
				((BodyContext)_localctx).bs = blockStatement();
				((BodyContext)_localctx).body_ret =  ((BodyContext)_localctx).bs.blockStatement_ret;
				}
				break;
			case NEWLINE:
				{
				{
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					match(NEWLINE);
					}
					}
					setState(347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(349);
				((BodyContext)_localctx).ss = singleStatement();
				((BodyContext)_localctx).body_ret =  ((BodyContext)_localctx).ss.singleStatement_ret;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStmt blockStatement_ret;
		public SingleStatementContext ss;
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockStatementContext)_localctx).blockStatement_ret =  new BlockStmt();
			setState(355);
			match(LBRACE);
			setState(357); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(356);
				match(NEWLINE);
				}
				}
				setState(359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(361);
				((BlockStatementContext)_localctx).ss = singleStatement();
				_localctx.blockStatement_ret.addStatement(((BlockStatementContext)_localctx).ss.singleStatement_ret);
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(363);
					match(NEWLINE);
					}
					}
					setState(366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(RBRACE);
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement singleStatement_ret;
		public IfStatementContext my_if;
		public PrintStatementContext pr;
		public MethodCallStmtContext mc;
		public ReturnStatementContext rs;
		public AssignmentStatementContext as;
		public LoopStatementContext ls;
		public AddStatementContext ad;
		public MergeStatementContext ms;
		public DeleteStatementContext ds;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public MethodCallStmtContext methodCallStmt() {
			return getRuleContext(MethodCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AddStatementContext addStatement() {
			return getRuleContext(AddStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleStatement);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				((SingleStatementContext)_localctx).my_if = ifStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).my_if.ifStatement_ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				((SingleStatementContext)_localctx).pr = printStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).pr.printStatement_ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				((SingleStatementContext)_localctx).mc = methodCallStmt();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).mc.methodCallStmt_ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				((SingleStatementContext)_localctx).rs = returnStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).rs.returnStatement_ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				((SingleStatementContext)_localctx).as = assignmentStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).as.assignmentStatement_ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				((SingleStatementContext)_localctx).ls = loopStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).ls.loopStatement_ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(393);
				((SingleStatementContext)_localctx).ad = addStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).ad.addStatement_ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(396);
				((SingleStatementContext)_localctx).ms = mergeStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).ms.mergeStatement_ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(399);
				((SingleStatementContext)_localctx).ds = deleteStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).ds.deleteStatement_ret;
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

	public static class AddStatementContext extends ParserRuleContext {
		public SetAdd addStatement_ret;
		public ExpressionContext ex;
		public Token ADD;
		public OrExpressionContext oe;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode ADD() { return getToken(SimpleLOOPParser.ADD, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public AddStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAddStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAddStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAddStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddStatementContext addStatement() throws RecognitionException {
		AddStatementContext _localctx = new AddStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			((AddStatementContext)_localctx).ex = expression();
			setState(405);
			match(DOT);
			setState(406);
			((AddStatementContext)_localctx).ADD = match(ADD);
			setState(407);
			match(LPAR);
			setState(408);
			((AddStatementContext)_localctx).oe = orExpression();
			setState(409);
			match(RPAR);
			((AddStatementContext)_localctx).addStatement_ret =  new SetAdd(((AddStatementContext)_localctx).ex.expression_ret, ((AddStatementContext)_localctx).oe.orExpression_ret);
			    _localctx.addStatement_ret.setLine(((AddStatementContext)_localctx).ADD.getLine());
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

	public static class MergeStatementContext extends ParserRuleContext {
		public SetMerge mergeStatement_ret;
		public ExpressionContext ex;
		public Token MERGE;
		public OrExpressionContext ox;
		public OrExpressionContext oe;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode MERGE() { return getToken(SimpleLOOPParser.MERGE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMergeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMergeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMergeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mergeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Expression> tmp = new ArrayList<Expression>();
			setState(413);
			((MergeStatementContext)_localctx).ex = expression();
			setState(414);
			match(DOT);
			setState(415);
			((MergeStatementContext)_localctx).MERGE = match(MERGE);
			setState(416);
			match(LPAR);
			setState(417);
			((MergeStatementContext)_localctx).ox = orExpression();
			tmp.add(((MergeStatementContext)_localctx).ox.orExpression_ret);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				match(COMMA);
				setState(420);
				((MergeStatementContext)_localctx).oe = orExpression();
				tmp.add(((MergeStatementContext)_localctx).oe.orExpression_ret);
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(RPAR);
			((MergeStatementContext)_localctx).mergeStatement_ret =  new SetMerge(((MergeStatementContext)_localctx).ex.expression_ret,
			    tmp); _localctx.mergeStatement_ret.setLine(((MergeStatementContext)_localctx).MERGE.getLine());
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public SetDelete deleteStatement_ret;
		public ExpressionContext ex;
		public Token DELETE;
		public OrExpressionContext oe;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode DELETE() { return getToken(SimpleLOOPParser.DELETE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			((DeleteStatementContext)_localctx).ex = expression();
			setState(432);
			match(DOT);
			setState(433);
			((DeleteStatementContext)_localctx).DELETE = match(DELETE);
			setState(434);
			match(LPAR);
			setState(435);
			((DeleteStatementContext)_localctx).oe = orExpression();
			setState(436);
			match(RPAR);
			((DeleteStatementContext)_localctx).deleteStatement_ret =  new SetDelete(((DeleteStatementContext)_localctx).ex.expression_ret,
			    ((DeleteStatementContext)_localctx).oe.orExpression_ret); _localctx.deleteStatement_ret.setLine(((DeleteStatementContext)_localctx).DELETE.getLine());
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> varDecStatement_ret;
		public TypeContext tp;
		public IdentifierContext id;
		public IdentifierContext id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VarDecStatementContext)_localctx).varDecStatement_ret =  new ArrayList<VariableDeclaration>();
			setState(440);
			((VarDecStatementContext)_localctx).tp = type();
			setState(441);
			((VarDecStatementContext)_localctx).id = identifier();

			        VariableDeclaration tmp1;
			        tmp1 = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifier_ret, ((VarDecStatementContext)_localctx).tp.type_ret);
			        tmp1.setLine(((VarDecStatementContext)_localctx).id.identifier_ret.getLine());
			        _localctx.varDecStatement_ret.add(tmp1);
			   
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(443);
				match(COMMA);
				setState(444);
				((VarDecStatementContext)_localctx).id2 = identifier();

				        VariableDeclaration tmp2;
				        tmp2 = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifier_ret, ((VarDecStatementContext)_localctx).tp.type_ret);
				        tmp2.setLine(((VarDecStatementContext)_localctx).id.identifier_ret.getLine());
				        _localctx.varDecStatement_ret.add(tmp2);
				    
				}
				}
				setState(451);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifStatement_ret;
		public Token IF;
		public ConditionContext cn;
		public BodyContext bd;
		public ElsifStatementContext eif;
		public ElseStatementContext es;
		public TerminalNode IF() { return getToken(SimpleLOOPParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ElsifStatementContext> elsifStatement() {
			return getRuleContexts(ElsifStatementContext.class);
		}
		public ElsifStatementContext elsifStatement(int i) {
			return getRuleContext(ElsifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(453);
			((IfStatementContext)_localctx).cn = condition();
			setState(454);
			((IfStatementContext)_localctx).bd = body();
			((IfStatementContext)_localctx).ifStatement_ret =  new ConditionalStmt(((IfStatementContext)_localctx).cn.condition_ret, ((IfStatementContext)_localctx).bd.body_ret);
			    _localctx.ifStatement_ret.setLine(((IfStatementContext)_localctx).IF.getLine());
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					((IfStatementContext)_localctx).eif = elsifStatement();
					_localctx.ifStatement_ret.addElsif(((IfStatementContext)_localctx).eif.elsifStatement_ret);
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(464);
				((IfStatementContext)_localctx).es = elseStatement();
				_localctx.ifStatement_ret.setElseBody(((IfStatementContext)_localctx).es.elseStatement_ret);
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

	public static class ElsifStatementContext extends ParserRuleContext {
		public ElsifStmt elsifStatement_ret;
		public Token ELSIF;
		public ConditionContext cn;
		public BodyContext b;
		public TerminalNode ELSIF() { return getToken(SimpleLOOPParser.ELSIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElsifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElsifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElsifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElsifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifStatementContext elsifStatement() throws RecognitionException {
		ElsifStatementContext _localctx = new ElsifStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(469);
				match(NEWLINE);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			((ElsifStatementContext)_localctx).ELSIF = match(ELSIF);
			setState(476);
			((ElsifStatementContext)_localctx).cn = condition();
			setState(477);
			((ElsifStatementContext)_localctx).b = body();
			((ElsifStatementContext)_localctx).elsifStatement_ret =  new ElsifStmt(((ElsifStatementContext)_localctx).cn.condition_ret, ((ElsifStatementContext)_localctx).b.body_ret);
			     _localctx.elsifStatement_ret.setLine(((ElsifStatementContext)_localctx).ELSIF.getLine());
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
		public Expression condition_ret;
		public ExpressionContext ex;
		public ExpressionContext ex2;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(480);
				match(LPAR);
				setState(481);
				((ConditionContext)_localctx).ex = expression();
				((ConditionContext)_localctx).condition_ret =  ((ConditionContext)_localctx).ex.expression_ret;
				setState(483);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(485);
				((ConditionContext)_localctx).ex2 = expression();
				((ConditionContext)_localctx).condition_ret =  ((ConditionContext)_localctx).ex2.expression_ret;
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

	public static class ElseStatementContext extends ParserRuleContext {
		public Statement elseStatement_ret;
		public BodyContext b;
		public TerminalNode ELSE() { return getToken(SimpleLOOPParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(490);
				match(NEWLINE);
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(ELSE);
			setState(497);
			((ElseStatementContext)_localctx).b = body();
			((ElseStatementContext)_localctx).elseStatement_ret =  ((ElseStatementContext)_localctx).b.body_ret;
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt printStatement_ret;
		public Token PRINT;
		public ExpressionContext ex;
		public TerminalNode PRINT() { return getToken(SimpleLOOPParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			((PrintStatementContext)_localctx).PRINT = match(PRINT);
			setState(501);
			match(LPAR);
			setState(502);
			((PrintStatementContext)_localctx).ex = expression();
			((PrintStatementContext)_localctx).printStatement_ret =  new PrintStmt(((PrintStatementContext)_localctx).ex.expression_ret);
			    _localctx.printStatement_ret.setLine(((PrintStatementContext)_localctx).PRINT.getLine());
			setState(504);
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

	public static class MethodCallStmtContext extends ParserRuleContext {
		public MethodCallStmt methodCallStmt_ret;
		public AccessExpressionContext ae;
		public Token INITIALIZE;
		public IdentifierContext id;
		public Token LPAR;
		public MethodArgsContext ma;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
		}
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MethodCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStmtContext methodCallStmt() throws RecognitionException {
		MethodCallStmtContext _localctx = new MethodCallStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCallStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression ex;
			setState(507);
			((MethodCallStmtContext)_localctx).ae = accessExpression();
			ex = ((MethodCallStmtContext)_localctx).ae.accessExpression_ret;
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(509);
				match(DOT);
				setState(515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INITIALIZE:
					{
					setState(510);
					((MethodCallStmtContext)_localctx).INITIALIZE = match(INITIALIZE);
					ex = new ObjectMemberAccess(ex, new Identifier(((MethodCallStmtContext)_localctx).INITIALIZE.getText()));
					}
					break;
				case IDENTIFIER:
					{
					setState(512);
					((MethodCallStmtContext)_localctx).id = identifier();
					ex = new ObjectMemberAccess(ex, ((MethodCallStmtContext)_localctx).id.identifier_ret);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			{
			setState(522);
			((MethodCallStmtContext)_localctx).LPAR = match(LPAR);
			setState(523);
			((MethodCallStmtContext)_localctx).ma = methodArgs();
			((MethodCallStmtContext)_localctx).methodCallStmt_ret =  new MethodCallStmt(new MethodCall(ex, ((MethodCallStmtContext)_localctx).ma.methodArgs_ret));
			    _localctx.methodCallStmt_ret.setLine(((MethodCallStmtContext)_localctx).LPAR.getLine());
			setState(525);
			match(RPAR);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStatement_ret;
		public Token RETURN;
		public ExpressionContext ex;
		public TerminalNode RETURN() { return getToken(SimpleLOOPParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			((ReturnStatementContext)_localctx).returnStatement_ret =  new ReturnStmt(); _localctx.returnStatement_ret.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(529);
				((ReturnStatementContext)_localctx).ex = expression();
				{_localctx.returnStatement_ret.setReturnedExpr(((ReturnStatementContext)_localctx).ex.expression_ret);}
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentStatement_ret;
		public OrExpressionContext oe;
		public Token ASSIGN;
		public ExpressionContext ex;
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			((AssignmentStatementContext)_localctx).oe = orExpression();
			setState(535);
			((AssignmentStatementContext)_localctx).ASSIGN = match(ASSIGN);
			setState(536);
			((AssignmentStatementContext)_localctx).ex = expression();
			((AssignmentStatementContext)_localctx).assignmentStatement_ret =  new AssignmentStmt(((AssignmentStatementContext)_localctx).oe.orExpression_ret, ((AssignmentStatementContext)_localctx).ex.expression_ret);
			    _localctx.assignmentStatement_ret.setLine(((AssignmentStatementContext)_localctx).ASSIGN.getLine());
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

	public static class LoopStatementContext extends ParserRuleContext {
		public EachStmt loopStatement_ret;
		public AccessExpressionContext ae;
		public ExpressionContext ex1;
		public ExpressionContext ex2;
		public Token EACH;
		public IdentifierContext id;
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode EACH() { return getToken(SimpleLOOPParser.EACH, 0); }
		public TerminalNode DO() { return getToken(SimpleLOOPParser.DO, 0); }
		public List<TerminalNode> BAR() { return getTokens(SimpleLOOPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(SimpleLOOPParser.BAR, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression ex_val = null;
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				{
				setState(540);
				((LoopStatementContext)_localctx).ae = accessExpression();
				ex_val = ((LoopStatementContext)_localctx).ae.accessExpression_ret;
				}
				}
				break;
			case 2:
				{
				{
				setState(543);
				match(LPAR);
				setState(544);
				((LoopStatementContext)_localctx).ex1 = expression();
				setState(545);
				match(DOT);
				setState(546);
				match(DOT);
				setState(547);
				((LoopStatementContext)_localctx).ex2 = expression();
				ex_val = new RangeExpression(((LoopStatementContext)_localctx).ex1.expression_ret, ((LoopStatementContext)_localctx).ex2.expression_ret);
				setState(549);
				match(RPAR);
				}
				}
				break;
			}
			setState(553);
			match(DOT);
			setState(554);
			((LoopStatementContext)_localctx).EACH = match(EACH);
			setState(555);
			match(DO);
			setState(556);
			match(BAR);
			setState(557);
			((LoopStatementContext)_localctx).id = identifier();
			((LoopStatementContext)_localctx).loopStatement_ret =  new EachStmt(((LoopStatementContext)_localctx).id.identifier_ret, ex_val); _localctx.loopStatement_ret.setLine(((LoopStatementContext)_localctx).EACH.getLine());
			setState(559);
			match(BAR);
			setState(560);
			body();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression expression_ret;
		public TernaryExpressionContext te;
		public Token ASSIGN;
		public ExpressionContext ex;
		public Token INCLUDE;
		public OrExpressionContext oe;
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode INCLUDE() { return getToken(SimpleLOOPParser.INCLUDE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			((ExpressionContext)_localctx).te = ternaryExpression();
			((ExpressionContext)_localctx).expression_ret =  ((ExpressionContext)_localctx).te.ternaryExpression_ret;
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(564);
				((ExpressionContext)_localctx).ASSIGN = match(ASSIGN);
				setState(565);
				((ExpressionContext)_localctx).ex = expression();
				((ExpressionContext)_localctx).expression_ret =  new BinaryExpression(_localctx.expression_ret, ((ExpressionContext)_localctx).ex.expression_ret, BinaryOperator.assign);
				    _localctx.expression_ret.setLine(((ExpressionContext)_localctx).ASSIGN.getLine());
				}
			}

			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(570);
				match(DOT);
				setState(571);
				((ExpressionContext)_localctx).INCLUDE = match(INCLUDE);
				setState(572);
				match(LPAR);
				setState(573);
				((ExpressionContext)_localctx).oe = orExpression();
				setState(574);
				match(RPAR);
				((ExpressionContext)_localctx).expression_ret =  new SetInclude(_localctx.expression_ret, ((ExpressionContext)_localctx).oe.orExpression_ret);
				    _localctx.expression_ret.setLine(((ExpressionContext)_localctx).INCLUDE.getLine());
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

	public static class TernaryExpressionContext extends ParserRuleContext {
		public Expression ternaryExpression_ret;
		public OrExpressionContext oe;
		public Token TIF;
		public TernaryExpressionContext te1;
		public TernaryExpressionContext te2;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode TIF() { return getToken(SimpleLOOPParser.TIF, 0); }
		public TerminalNode TELSE() { return getToken(SimpleLOOPParser.TELSE, 0); }
		public List<TernaryExpressionContext> ternaryExpression() {
			return getRuleContexts(TernaryExpressionContext.class);
		}
		public TernaryExpressionContext ternaryExpression(int i) {
			return getRuleContext(TernaryExpressionContext.class,i);
		}
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ternaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			((TernaryExpressionContext)_localctx).oe = orExpression();
			((TernaryExpressionContext)_localctx).ternaryExpression_ret =  ((TernaryExpressionContext)_localctx).oe.orExpression_ret;
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIF) {
				{
				setState(581);
				((TernaryExpressionContext)_localctx).TIF = match(TIF);
				setState(582);
				((TernaryExpressionContext)_localctx).te1 = ternaryExpression();
				setState(583);
				match(TELSE);
				setState(584);
				((TernaryExpressionContext)_localctx).te2 = ternaryExpression();
				((TernaryExpressionContext)_localctx).ternaryExpression_ret =  new TernaryExpression(_localctx.ternaryExpression_ret, ((TernaryExpressionContext)_localctx).te1.ternaryExpression_ret, ((TernaryExpressionContext)_localctx).te2.ternaryExpression_ret);
				    _localctx.ternaryExpression_ret.setLine(((TernaryExpressionContext)_localctx).TIF.getLine());
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpression_ret;
		public AndExpressionContext ae;
		public Token OR;
		public AndExpressionContext aeq;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SimpleLOOPParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SimpleLOOPParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			((OrExpressionContext)_localctx).ae = andExpression();
			((OrExpressionContext)_localctx).orExpression_ret =  ((OrExpressionContext)_localctx).ae.andExpression_ret;
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(591);
				((OrExpressionContext)_localctx).OR = match(OR);
				setState(592);
				((OrExpressionContext)_localctx).aeq = andExpression();
				((OrExpressionContext)_localctx).orExpression_ret =  new BinaryExpression(_localctx.orExpression_ret,
				    ((OrExpressionContext)_localctx).aeq.andExpression_ret, BinaryOperator.or); _localctx.orExpression_ret.setLine(((OrExpressionContext)_localctx).OR.getLine());
				}
				}
				setState(599);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpression_ret;
		public EqualityExpressionContext ee;
		public Token AND;
		public EqualityExpressionContext eqe;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpleLOOPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SimpleLOOPParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			((AndExpressionContext)_localctx).ee = equalityExpression();
			((AndExpressionContext)_localctx).andExpression_ret =  ((AndExpressionContext)_localctx).ee.equalityExpression_ret;
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(602);
				((AndExpressionContext)_localctx).AND = match(AND);
				setState(603);
				((AndExpressionContext)_localctx).eqe = equalityExpression();
				((AndExpressionContext)_localctx).andExpression_ret =  new BinaryExpression(_localctx.andExpression_ret, ((AndExpressionContext)_localctx).eqe.equalityExpression_ret, BinaryOperator.and);
				    _localctx.andExpression_ret.setLine(((AndExpressionContext)_localctx).AND.getLine());
				}
				}
				setState(610);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression equalityExpression_ret;
		public RelationalExpressionContext re;
		public Token EQUAL;
		public RelationalExpressionContext expr;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SimpleLOOPParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SimpleLOOPParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			((EqualityExpressionContext)_localctx).re = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExpression_ret =  ((EqualityExpressionContext)_localctx).re.relationalExpression_ret;
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(613);
				((EqualityExpressionContext)_localctx).EQUAL = match(EQUAL);
				setState(614);
				((EqualityExpressionContext)_localctx).expr = relationalExpression();
				((EqualityExpressionContext)_localctx).equalityExpression_ret =  new BinaryExpression(_localctx.equalityExpression_ret, ((EqualityExpressionContext)_localctx).expr.relationalExpression_ret, BinaryOperator.eq);
				    _localctx.equalityExpression_ret.setLine(((EqualityExpressionContext)_localctx).EQUAL.getLine());
				}
				}
				setState(621);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relationalExpression_ret;
		public AdditiveExpressionContext ae;
		public Token GREATER_THAN;
		public Token LESS_THAN;
		public AdditiveExpressionContext ade;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SimpleLOOPParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SimpleLOOPParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SimpleLOOPParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SimpleLOOPParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			((RelationalExpressionContext)_localctx).ae = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExpression_ret =  ((RelationalExpressionContext)_localctx).ae.additiveExpression_ret;
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				BinaryOperator bo; int ln;
				setState(629);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(625);
					((RelationalExpressionContext)_localctx).GREATER_THAN = match(GREATER_THAN);
					bo = BinaryOperator.gt;ln = ((RelationalExpressionContext)_localctx).GREATER_THAN.getLine();
					}
					break;
				case LESS_THAN:
					{
					setState(627);
					((RelationalExpressionContext)_localctx).LESS_THAN = match(LESS_THAN);
					bo = BinaryOperator.lt;ln = ((RelationalExpressionContext)_localctx).LESS_THAN.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(631);
				((RelationalExpressionContext)_localctx).ade = additiveExpression();
				((RelationalExpressionContext)_localctx).relationalExpression_ret =  new BinaryExpression(_localctx.relationalExpression_ret, ((RelationalExpressionContext)_localctx).ade.additiveExpression_ret, bo);
				    _localctx.relationalExpression_ret.setLine(ln);
				}
				}
				setState(638);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExpression_ret;
		public MultiplicativeExpressionContext me;
		public Token PLUS;
		public Token MINUS;
		public MultiplicativeExpressionContext mpe;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleLOOPParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleLOOPParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleLOOPParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleLOOPParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			((AdditiveExpressionContext)_localctx).me = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExpression_ret =  ((AdditiveExpressionContext)_localctx).me.multiplicativeExpression_ret;
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				BinaryOperator bo; int ln;
				setState(646);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(642);
					((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
					bo = BinaryOperator.add;ln = ((AdditiveExpressionContext)_localctx).PLUS.getLine();
					}
					break;
				case MINUS:
					{
					setState(644);
					((AdditiveExpressionContext)_localctx).MINUS = match(MINUS);
					bo = BinaryOperator.sub;ln = ((AdditiveExpressionContext)_localctx).MINUS.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(648);
				((AdditiveExpressionContext)_localctx).mpe = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).additiveExpression_ret =  new BinaryExpression(_localctx.additiveExpression_ret, ((AdditiveExpressionContext)_localctx).mpe.multiplicativeExpression_ret, bo);
				    _localctx.additiveExpression_ret.setLine(ln);
				}
				}
				setState(655);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiplicativeExpression_ret;
		public PreUnaryExpressionContext pe;
		public Token MULT;
		public Token DIVIDE;
		public PreUnaryExpressionContext pue;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleLOOPParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleLOOPParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SimpleLOOPParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SimpleLOOPParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			((MultiplicativeExpressionContext)_localctx).pe = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpression_ret =  ((MultiplicativeExpressionContext)_localctx).pe.preUnaryExpression_ret;
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				BinaryOperator bo; int ln;
				setState(663);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(659);
					((MultiplicativeExpressionContext)_localctx).MULT = match(MULT);
					bo = BinaryOperator.mult;ln = ((MultiplicativeExpressionContext)_localctx).MULT.getLine();
					}
					break;
				case DIVIDE:
					{
					setState(661);
					((MultiplicativeExpressionContext)_localctx).DIVIDE = match(DIVIDE);
					bo = BinaryOperator.div;ln = ((MultiplicativeExpressionContext)_localctx).DIVIDE.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(665);
				((MultiplicativeExpressionContext)_localctx).pue = preUnaryExpression();
				((MultiplicativeExpressionContext)_localctx).multiplicativeExpression_ret =  new BinaryExpression(_localctx.multiplicativeExpression_ret, ((MultiplicativeExpressionContext)_localctx).pue.preUnaryExpression_ret, bo);
				    _localctx.multiplicativeExpression_ret.setLine(ln);
				}
				}
				setState(672);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExpression_ret;
		public PreUnaryExpressionContext pe;
		public PostUnaryExpressionContext po;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_preUnaryExpression);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator uo;
				{
				setState(678);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(674);
					match(NOT);
					uo = UnaryOperator.not;
					}
					break;
				case MINUS:
					{
					setState(676);
					match(MINUS);
					uo = UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(680);
				((PreUnaryExpressionContext)_localctx).pe = preUnaryExpression();
				((PreUnaryExpressionContext)_localctx).preUnaryExpression_ret =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pe.preUnaryExpression_ret, uo);
				}
				}
				break;
			case SELF:
			case TRUE:
			case FALSE:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				((PreUnaryExpressionContext)_localctx).po = postUnaryExpression();
				((PreUnaryExpressionContext)_localctx).preUnaryExpression_ret =  ((PreUnaryExpressionContext)_localctx).po.postUnaryExpression_ret;
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

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression postUnaryExpression_ret;
		public AccessExpressionContext ae;
		public Token INC;
		public Token DEC;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(SimpleLOOPParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SimpleLOOPParser.DEC, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_postUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			((PostUnaryExpressionContext)_localctx).ae = accessExpression();
			((PostUnaryExpressionContext)_localctx).postUnaryExpression_ret =  ((PostUnaryExpressionContext)_localctx).ae.accessExpression_ret; UnaryOperator uo; int ln;
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INC || _la==DEC) {
				{
				setState(694);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(690);
					((PostUnaryExpressionContext)_localctx).INC = match(INC);
					uo = UnaryOperator.postinc; ln = ((PostUnaryExpressionContext)_localctx).INC.getLine();
					}
					break;
				case DEC:
					{
					setState(692);
					((PostUnaryExpressionContext)_localctx).DEC = match(DEC);
					uo = UnaryOperator.postdec; ln = ((PostUnaryExpressionContext)_localctx).DEC.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				((PostUnaryExpressionContext)_localctx).postUnaryExpression_ret =  new UnaryExpression(_localctx.postUnaryExpression_ret, uo);
				    _localctx.postUnaryExpression_ret.setLine(ln);
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExpression_ret;
		public OtherExpressionContext oe;
		public Token LPAR;
		public MethodArgsContext ma;
		public IdentifierContext i;
		public Token NEW;
		public Token INITIALIZE;
		public IdentifierContext i2;
		public Token LBRACK;
		public ExpressionContext ex;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<MethodArgsContext> methodArgs() {
			return getRuleContexts(MethodArgsContext.class);
		}
		public MethodArgsContext methodArgs(int i) {
			return getRuleContext(MethodArgsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NEW() { return getTokens(SimpleLOOPParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(SimpleLOOPParser.NEW, i);
		}
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_accessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			Identifier id;
			setState(700);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			((AccessExpressionContext)_localctx).accessExpression_ret =  ((AccessExpressionContext)_localctx).oe.otherExpression_ret;
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(718);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(702);
						((AccessExpressionContext)_localctx).LPAR = match(LPAR);
						setState(703);
						((AccessExpressionContext)_localctx).ma = methodArgs();
						((AccessExpressionContext)_localctx).accessExpression_ret =  new MethodCall(((AccessExpressionContext)_localctx).oe.otherExpression_ret, ((AccessExpressionContext)_localctx).ma.methodArgs_ret);
						    _localctx.accessExpression_ret.setLine(((AccessExpressionContext)_localctx).LPAR.getLine());
						setState(705);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						{
						setState(707);
						match(DOT);
						setState(715);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(708);
							((AccessExpressionContext)_localctx).i = identifier();
							id = ((AccessExpressionContext)_localctx).i.identifier_ret;
							}
							break;
						case NEW:
							{
							setState(711);
							((AccessExpressionContext)_localctx).NEW = match(NEW);
							id = new Identifier(((AccessExpressionContext)_localctx).NEW.getText()); id.setLine(((AccessExpressionContext)_localctx).NEW.getLine());
							}
							break;
						case INITIALIZE:
							{
							setState(713);
							((AccessExpressionContext)_localctx).INITIALIZE = match(INITIALIZE);
							id = new Identifier(((AccessExpressionContext)_localctx).INITIALIZE.getText()); id.setLine(((AccessExpressionContext)_localctx).INITIALIZE.getLine());
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						((AccessExpressionContext)_localctx).accessExpression_ret =  new ObjectMemberAccess(_localctx.accessExpression_ret, id); _localctx.accessExpression_ret.setLine(id.getLine());
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(732);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(723);
						match(DOT);
						{
						setState(724);
						((AccessExpressionContext)_localctx).i2 = identifier();
						((AccessExpressionContext)_localctx).accessExpression_ret =  new ObjectMemberAccess(_localctx.accessExpression_ret, ((AccessExpressionContext)_localctx).i2.identifier_ret);
						    _localctx.accessExpression_ret.setLine(((AccessExpressionContext)_localctx).i2.identifier_ret.getLine());
						}
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(727);
						((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
						setState(728);
						((AccessExpressionContext)_localctx).ex = expression();
						((AccessExpressionContext)_localctx).accessExpression_ret =  new ArrayAccessByIndex(_localctx.accessExpression_ret, ((AccessExpressionContext)_localctx).ex.expression_ret);
						     _localctx.accessExpression_ret.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
						setState(730);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpression_ret;
		public Token SELF;
		public Class_identifierContext ci;
		public ValueContext v;
		public IdentifierContext id;
		public SetNewContext sn;
		public ExpressionContext ex;
		public TerminalNode SELF() { return getToken(SimpleLOOPParser.SELF, 0); }
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetNewContext setNew() {
			return getRuleContext(SetNewContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_otherExpression);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				((OtherExpressionContext)_localctx).SELF = match(SELF);
				((OtherExpressionContext)_localctx).otherExpression_ret =  new SelfClass(); _localctx.otherExpression_ret.setLine(((OtherExpressionContext)_localctx).SELF.getLine());
				}
				break;
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				((OtherExpressionContext)_localctx).ci = class_identifier();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).ci.class_identifier_ret;
				}
				break;
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
				((OtherExpressionContext)_localctx).v = value();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).v.value_ret;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				((OtherExpressionContext)_localctx).id = identifier();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).id.identifier_ret;
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(748);
				((OtherExpressionContext)_localctx).sn = setNew();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).sn.setNew_ret;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(751);
				match(LPAR);
				setState(752);
				((OtherExpressionContext)_localctx).ex = expression();
				setState(753);
				match(RPAR);
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).ex.expression_ret;
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

	public static class SetNewContext extends ParserRuleContext {
		public SetNew setNew_ret;
		public OrExpressionContext oe;
		public OrExpressionContext oe2;
		public Token RPAR;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(SimpleLOOPParser.NEW, 0); }
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public SetNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSetNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSetNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSetNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNewContext setNew() throws RecognitionException {
		SetNewContext _localctx = new SetNewContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_setNew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Expression>arr_list =new ArrayList<Expression>();
			setState(759);
			match(SET);
			setState(760);
			match(DOT);
			setState(761);
			match(NEW);
			setState(762);
			match(LPAR);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(763);
				match(LPAR);
				setState(764);
				((SetNewContext)_localctx).oe = orExpression();
				arr_list.add(((SetNewContext)_localctx).oe.orExpression_ret);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(766);
					match(COMMA);
					setState(767);
					((SetNewContext)_localctx).oe2 = orExpression();
					arr_list.add(((SetNewContext)_localctx).oe2.orExpression_ret);
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				((SetNewContext)_localctx).RPAR = match(RPAR);
				}
			}

			setState(779);
			((SetNewContext)_localctx).RPAR = match(RPAR);
			((SetNewContext)_localctx).setNew_ret =  new SetNew(arr_list); _localctx.setNew_ret.setLine(((SetNewContext)_localctx).RPAR.getLine());
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

	public static class ValueContext extends ParserRuleContext {
		public Value value_ret;
		public BoolValueContext bv;
		public Int_valueContext iv;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public Int_valueContext int_value() {
			return getRuleContext(Int_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				((ValueContext)_localctx).bv = boolValue();
				((ValueContext)_localctx).value_ret =  ((ValueContext)_localctx).bv.boolValue_ret;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				((ValueContext)_localctx).iv = int_value();
				((ValueContext)_localctx).value_ret =  ((ValueContext)_localctx).iv.int_value_ret;
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValue_ret;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(SimpleLOOPParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimpleLOOPParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolValue);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).boolValue_ret =  new BoolValue(true); _localctx.boolValue_ret.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				((BoolValueContext)_localctx).FALSE = match(FALSE);
				((BoolValueContext)_localctx).boolValue_ret =  new BoolValue(false); _localctx.boolValue_ret.setLine(((BoolValueContext)_localctx).FALSE.getLine());
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

	public static class Class_identifierContext extends ParserRuleContext {
		public Identifier class_identifier_ret;
		public Token CLASS_IDENTIFIER;
		public TerminalNode CLASS_IDENTIFIER() { return getToken(SimpleLOOPParser.CLASS_IDENTIFIER, 0); }
		public Class_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClass_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClass_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClass_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_identifierContext class_identifier() throws RecognitionException {
		Class_identifierContext _localctx = new Class_identifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_class_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			((Class_identifierContext)_localctx).CLASS_IDENTIFIER = match(CLASS_IDENTIFIER);
			((Class_identifierContext)_localctx).class_identifier_ret =  new Identifier(((Class_identifierContext)_localctx).CLASS_IDENTIFIER.getText()); _localctx.class_identifier_ret.setName(((Class_identifierContext)_localctx).CLASS_IDENTIFIER.getText());
			    _localctx.class_identifier_ret.setLine(((Class_identifierContext)_localctx).CLASS_IDENTIFIER.getLine());
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifier_ret;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(SimpleLOOPParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			((IdentifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((IdentifierContext)_localctx).identifier_ret =  new Identifier(((IdentifierContext)_localctx).IDENTIFIER.getText()); _localctx.identifier_ret.setName(((IdentifierContext)_localctx).IDENTIFIER.getText());
			    _localctx.identifier_ret.setLine(((IdentifierContext)_localctx).IDENTIFIER.getLine());
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

	public static class TypeContext extends ParserRuleContext {
		public Type type_ret;
		public Array_typeContext arr_tp;
		public Fptr_typeContext fptr_tp;
		public Set_typeContext set_tp;
		public Class_identifierContext class_tp;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Fptr_typeContext fptr_type() {
			return getRuleContext(Fptr_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type);
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(INT);
				((TypeContext)_localctx).type_ret =  new IntType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(BOOL);
				((TypeContext)_localctx).type_ret =  new BoolType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				((TypeContext)_localctx).arr_tp = array_type();
				((TypeContext)_localctx).type_ret =  ((TypeContext)_localctx).arr_tp.array_type_ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				((TypeContext)_localctx).fptr_tp = fptr_type();
				((TypeContext)_localctx).type_ret =  ((TypeContext)_localctx).fptr_tp.fptr_type_ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(812);
				((TypeContext)_localctx).set_tp = set_type();
				((TypeContext)_localctx).type_ret =  ((TypeContext)_localctx).set_tp.set_type_ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(815);
				((TypeContext)_localctx).class_tp = class_identifier();
				((TypeContext)_localctx).type_ret =  new ClassType(((TypeContext)_localctx).class_tp.class_identifier_ret);
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

	public static class Array_typeContext extends ParserRuleContext {
		public ArrayType array_type_ret;
		public Token INT;
		public Class_identifierContext ci;
		public ExpressionContext ex;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Type tp; ArrayList<Expression>arr_list =new ArrayList<Expression>(); int ln;
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(821);
				((Array_typeContext)_localctx).INT = match(INT);
				tp = new IntType(); ln = ((Array_typeContext)_localctx).INT.getLine();
				}
				break;
			case BOOL:
				{
				setState(823);
				match(BOOL);
				tp = new BoolType();
				}
				break;
			case CLASS_IDENTIFIER:
				{
				setState(825);
				((Array_typeContext)_localctx).ci = class_identifier();
				tp = new ClassType(((Array_typeContext)_localctx).ci.class_identifier_ret);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(835); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(830);
				match(LBRACK);
				setState(831);
				((Array_typeContext)_localctx).ex = expression();
				arr_list.add(((Array_typeContext)_localctx).ex.expression_ret);
				setState(833);
				match(RBRACK);
				}
				}
				setState(837); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			((Array_typeContext)_localctx).array_type_ret =  new ArrayType(tp, arr_list);
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

	public static class Fptr_typeContext extends ParserRuleContext {
		public FptrType fptr_type_ret;
		public TypeContext tp;
		public TypeContext tp2;
		public TypeContext tp3;
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SimpleLOOPParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SimpleLOOPParser.VOID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public Fptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFptr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFptr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_typeContext fptr_type() throws RecognitionException {
		Fptr_typeContext _localctx = new Fptr_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fptr_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Fptr_typeContext)_localctx).fptr_type_ret =  new FptrType();
			setState(842);
			match(FPTR);
			setState(843);
			match(LESS_THAN);
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(844);
				match(VOID);
				_localctx.fptr_type_ret.addArgumentType(new VoidType());
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				{
				setState(846);
				((Fptr_typeContext)_localctx).tp = type();
				_localctx.fptr_type_ret.addArgumentType
				    (((Fptr_typeContext)_localctx).tp.type_ret);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(848);
					match(COMMA);
					setState(849);
					((Fptr_typeContext)_localctx).tp2 = type();
					_localctx.fptr_type_ret.addArgumentType(((Fptr_typeContext)_localctx).tp2.type_ret);
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(859);
			match(ARROW);
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(860);
				((Fptr_typeContext)_localctx).tp3 = type();
				_localctx.fptr_type_ret.setReturnType(((Fptr_typeContext)_localctx).tp3.type_ret);
				}
				break;
			case VOID:
				{
				setState(863);
				match(VOID);
				_localctx.fptr_type_ret.setReturnType (new VoidType());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(867);
			match(GREATER_THAN);
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

	public static class Set_typeContext extends ParserRuleContext {
		public SetType set_type_ret;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSet_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(SET);
			setState(870);
			match(LESS_THAN);
			{
			setState(871);
			match(INT);
			}
			setState(872);
			match(GREATER_THAN);
			((Set_typeContext)_localctx).set_type_ret =  new SetType();
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

	public static class Int_valueContext extends ParserRuleContext {
		public IntValue int_value_ret;
		public Token INT_VALUE;
		public TerminalNode INT_VALUE() { return getToken(SimpleLOOPParser.INT_VALUE, 0); }
		public Int_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterInt_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitInt_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitInt_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_valueContext int_value() throws RecognitionException {
		Int_valueContext _localctx = new Int_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_int_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			((Int_valueContext)_localctx).INT_VALUE = match(INT_VALUE);
			((Int_valueContext)_localctx).int_value_ret =  new IntValue(Integer.parseInt(((Int_valueContext)_localctx).INT_VALUE.getText()));
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0371\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\3\3\3\3\3\6\3v\n\3\r\3"+
		"\16\3w\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\6\3\u0083\n\3\r\3\16"+
		"\3\u0084\3\3\3\3\7\3\u0089\n\3\f\3\16\3\u008c\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u0094\n\4\f\4\16\4\u0097\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00a3\n\5\3\5\7\5\u00a6\n\5\f\5\16\5\u00a9\13\5\3\5\3\5\6"+
		"\5\u00ad\n\5\r\5\16\5\u00ae\3\5\3\5\3\5\6\5\u00b4\n\5\r\5\16\5\u00b5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u00bd\n\5\3\5\7\5\u00c0\n\5\f\5\16\5\u00c3\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d3"+
		"\n\6\3\6\3\6\3\6\5\6\u00d8\n\6\3\6\6\6\u00db\n\6\r\6\16\6\u00dc\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00e5\n\7\3\7\3\7\3\7\7\7\u00ea\n\7\f\7\16\7\u00ed"+
		"\13\7\3\7\3\7\3\7\3\b\3\b\3\b\6\b\u00f5\n\b\r\b\16\b\u00f6\3\b\3\b\3\b"+
		"\6\b\u00fc\n\b\r\b\16\b\u00fd\7\b\u0100\n\b\f\b\16\b\u0103\13\b\3\b\3"+
		"\b\3\b\6\b\u0108\n\b\r\b\16\b\u0109\7\b\u010c\n\b\f\b\16\b\u010f\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\6\b\u0116\n\b\r\b\16\b\u0117\3\b\3\b\3\b\3\b\6\b"+
		"\u011e\n\b\r\b\16\b\u011f\5\b\u0122\n\b\5\b\u0124\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0130\n\t\f\t\16\t\u0133\13\t\5\t\u0135\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u013d\n\t\f\t\16\t\u0140\13\t\5\t\u0142"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0151"+
		"\n\13\f\13\16\13\u0154\13\13\5\13\u0156\n\13\3\f\3\f\3\f\3\f\6\f\u015c"+
		"\n\f\r\f\16\f\u015d\3\f\3\f\3\f\5\f\u0163\n\f\3\r\3\r\3\r\6\r\u0168\n"+
		"\r\r\r\16\r\u0169\3\r\3\r\3\r\6\r\u016f\n\r\r\r\16\r\u0170\7\r\u0173\n"+
		"\r\f\r\16\r\u0176\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0195\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u01aa\n\20\f\20\16\20\u01ad\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01c2"+
		"\n\22\f\22\16\22\u01c5\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01ce"+
		"\n\23\f\23\16\23\u01d1\13\23\3\23\3\23\3\23\5\23\u01d6\n\23\3\24\7\24"+
		"\u01d9\n\24\f\24\16\24\u01dc\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01eb\n\25\3\26\7\26\u01ee\n\26\f"+
		"\26\16\26\u01f1\13\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0206\n\30\7\30\u0208"+
		"\n\30\f\30\16\30\u020b\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u0217\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u022a\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u023b"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0244\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u024e\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0256\n\36\f\36\16\36\u0259\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0261\n\37\f\37\16\37\u0264\13\37\3 \3 \3 \3 \3 \3 \7 \u026c\n "+
		"\f \16 \u026f\13 \3!\3!\3!\3!\3!\3!\3!\5!\u0278\n!\3!\3!\3!\7!\u027d\n"+
		"!\f!\16!\u0280\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0289\n\"\3\"\3\"\3"+
		"\"\7\"\u028e\n\"\f\"\16\"\u0291\13\"\3#\3#\3#\3#\3#\3#\3#\5#\u029a\n#"+
		"\3#\3#\3#\7#\u029f\n#\f#\16#\u02a2\13#\3$\3$\3$\3$\3$\5$\u02a9\n$\3$\3"+
		"$\3$\3$\3$\3$\5$\u02b1\n$\3%\3%\3%\3%\3%\3%\5%\u02b9\n%\3%\5%\u02bc\n"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02ce\n&\3&\7&\u02d1"+
		"\n&\f&\16&\u02d4\13&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u02df\n&\f&\16&\u02e2"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u02f7\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0305"+
		"\n(\f(\16(\u0308\13(\3(\3(\5(\u030c\n(\3(\3(\3(\3)\3)\3)\3)\3)\3)\5)\u0317"+
		"\n)\3*\3*\3*\3*\5*\u031d\n*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0335\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u033f"+
		"\n.\3.\3.\3.\3.\3.\6.\u0346\n.\r.\16.\u0347\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\7/\u0357\n/\f/\16/\u035a\13/\5/\u035c\n/\3/\3/\3/\3/\3/"+
		"\3/\5/\u0364\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`\2\2\2\u03a4\2e\3\2\2\2\4r\3\2\2\2\6\u008d\3\2\2\2"+
		"\b\u009b\3\2\2\2\n\u00d7\3\2\2\2\f\u00de\3\2\2\2\16\u0123\3\2\2\2\20\u0125"+
		"\3\2\2\2\22\u0145\3\2\2\2\24\u0149\3\2\2\2\26\u0162\3\2\2\2\30\u0164\3"+
		"\2\2\2\32\u0194\3\2\2\2\34\u0196\3\2\2\2\36\u019e\3\2\2\2 \u01b1\3\2\2"+
		"\2\"\u01b9\3\2\2\2$\u01c6\3\2\2\2&\u01da\3\2\2\2(\u01ea\3\2\2\2*\u01ef"+
		"\3\2\2\2,\u01f6\3\2\2\2.\u01fc\3\2\2\2\60\u0211\3\2\2\2\62\u0218\3\2\2"+
		"\2\64\u021d\3\2\2\2\66\u0234\3\2\2\28\u0245\3\2\2\2:\u024f\3\2\2\2<\u025a"+
		"\3\2\2\2>\u0265\3\2\2\2@\u0270\3\2\2\2B\u0281\3\2\2\2D\u0292\3\2\2\2F"+
		"\u02b0\3\2\2\2H\u02b2\3\2\2\2J\u02bd\3\2\2\2L\u02f6\3\2\2\2N\u02f8\3\2"+
		"\2\2P\u0316\3\2\2\2R\u031c\3\2\2\2T\u031e\3\2\2\2V\u0321\3\2\2\2X\u0334"+
		"\3\2\2\2Z\u0336\3\2\2\2\\\u034b\3\2\2\2^\u0367\3\2\2\2`\u036d\3\2\2\2"+
		"bd\7:\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2"+
		"hi\5\4\3\2im\b\2\1\2jl\7:\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2"+
		"np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\3\3\2\2\2r}\b\3\1\2su\5\"\22\2tv\7:\2"+
		"\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\3\1\2z|\3\2\2"+
		"\2{s\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u008a\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0082\5\b\5\2\u0081\u0083\7:\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\b\3\1\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\5\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008d\u008e\b\4\1\2\u008e\u008f\7\5\2\2\u008f\u0090"+
		"\7\7\2\2\u0090\u0091\b\4\1\2\u0091\u0095\5\20\t\2\u0092\u0094\7:\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\16\b\2\u0099"+
		"\u009a\b\4\1\2\u009a\7\3\2\2\2\u009b\u009c\7\4\2\2\u009c\u009d\5T+\2\u009d"+
		"\u00a2\b\5\1\2\u009e\u009f\7\34\2\2\u009f\u00a0\5T+\2\u00a0\u00a1\b\5"+
		"\1\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a7\3\2\2\2\u00a4\u00a6\7:\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00bc\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ac\7\65\2\2\u00ab\u00ad\7:\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b3\3\2\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\b\5\1\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\66\2\2\u00b8\u00bd\3"+
		"\2\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb\b\5\1\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00aa\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\7:"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\t\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\b\6\1\2"+
		"\u00c5\u00c6\7\5\2\2\u00c6\u00ca\b\6\1\2\u00c7\u00c8\7\6\2\2\u00c8\u00ca"+
		"\b\6\1\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d2\3\2\2\2\u00cb"+
		"\u00cc\b\6\1\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce\b\6\1\2\u00ce\u00d3\3"+
		"\2\2\2\u00cf\u00d0\5\f\7\2\u00d0\u00d1\b\6\1\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cb\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d5\5\6"+
		"\4\2\u00d5\u00d6\b\6\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00c4\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\7:\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\13\3\2\2\2\u00de\u00e4\b\7\1\2\u00df\u00e0\5X-\2\u00e0\u00e1\b\7\1\2"+
		"\u00e1\u00e5\3\2\2\2\u00e2\u00e3\7\13\2\2\u00e3\u00e5\b\7\1\2\u00e4\u00df"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5V,\2\u00e7"+
		"\u00eb\5\20\t\2\u00e8\u00ea\7:\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0\b\7\1\2\u00f0\r\3\2\2"+
		"\2\u00f1\u00f2\b\b\1\2\u00f2\u00f4\7\65\2\2\u00f3\u00f5\7:\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u0101\3\2\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fb\b\b\1\2\u00fa\u00fc\7"+
		":\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f8\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u010d\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\5\32\16\2\u0105\u0107\b\b\1\2\u0106\u0108\7"+
		":\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0104\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0124\7\66\2\2\u0111\u0121\b\b\1\2\u0112\u0113\5"+
		"\"\22\2\u0113\u0115\b\b\1\2\u0114\u0116\7:\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0122\3\2"+
		"\2\2\u0119\u011a\5\32\16\2\u011a\u011b\b\b\1\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011e\7:\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u0112\3\2\2\2\u0121"+
		"\u0119\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u00f1\3\2\2\2\u0123\u0111\3\2"+
		"\2\2\u0124\17\3\2\2\2\u0125\u0126\b\t\1\2\u0126\u0141\7\61\2\2\u0127\u0128"+
		"\5\22\n\2\u0128\u0134\b\t\1\2\u0129\u012a\7/\2\2\u012a\u0135\5:\36\2\u012b"+
		"\u012c\7\67\2\2\u012c\u012d\5\22\n\2\u012d\u012e\b\t\1\2\u012e\u0130\3"+
		"\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0129\3\2"+
		"\2\2\u0134\u0131\3\2\2\2\u0135\u013e\3\2\2\2\u0136\u0137\7\67\2\2\u0137"+
		"\u0138\5\22\n\2\u0138\u0139\b\t\1\2\u0139\u013a\7/\2\2\u013a\u013b\5:"+
		"\36\2\u013b\u013d\3\2\2\2\u013c\u0136\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0127\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\7\62\2\2\u0144\21\3\2\2\2\u0145\u0146\5X-\2\u0146\u0147\5V,\2\u0147"+
		"\u0148\b\n\1\2\u0148\23\3\2\2\2\u0149\u0155\b\13\1\2\u014a\u014b\5\66"+
		"\34\2\u014b\u0152\b\13\1\2\u014c\u014d\7\67\2\2\u014d\u014e\5\66\34\2"+
		"\u014e\u014f\b\13\1\2\u014f\u0151\3\2\2\2\u0150\u014c\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u0156\3\2\2\2\u0156\25\3\2\2"+
		"\2\u0157\u0158\5\30\r\2\u0158\u0159\b\f\1\2\u0159\u0163\3\2\2\2\u015a"+
		"\u015c\7:\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5\32\16\2\u0160"+
		"\u0161\b\f\1\2\u0161\u0163\3\2\2\2\u0162\u0157\3\2\2\2\u0162\u015b\3\2"+
		"\2\2\u0163\27\3\2\2\2\u0164\u0165\b\r\1\2\u0165\u0167\7\65\2\2\u0166\u0168"+
		"\7:\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u0174\3\2\2\2\u016b\u016c\5\32\16\2\u016c\u016e\b"+
		"\r\1\2\u016d\u016f\7:\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u016b\3\2"+
		"\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7\66\2\2\u0178\31\3\2\2"+
		"\2\u0179\u017a\5$\23\2\u017a\u017b\b\16\1\2\u017b\u0195\3\2\2\2\u017c"+
		"\u017d\5,\27\2\u017d\u017e\b\16\1\2\u017e\u0195\3\2\2\2\u017f\u0180\5"+
		".\30\2\u0180\u0181\b\16\1\2\u0181\u0195\3\2\2\2\u0182\u0183\5\60\31\2"+
		"\u0183\u0184\b\16\1\2\u0184\u0195\3\2\2\2\u0185\u0186\5\62\32\2\u0186"+
		"\u0187\b\16\1\2\u0187\u0195\3\2\2\2\u0188\u0189\5\64\33\2\u0189\u018a"+
		"\b\16\1\2\u018a\u0195\3\2\2\2\u018b\u018c\5\34\17\2\u018c\u018d\b\16\1"+
		"\2\u018d\u0195\3\2\2\2\u018e\u018f\5\36\20\2\u018f\u0190\b\16\1\2\u0190"+
		"\u0195\3\2\2\2\u0191\u0192\5 \21\2\u0192\u0193\b\16\1\2\u0193\u0195\3"+
		"\2\2\2\u0194\u0179\3\2\2\2\u0194\u017c\3\2\2\2\u0194\u017f\3\2\2\2\u0194"+
		"\u0182\3\2\2\2\u0194\u0185\3\2\2\2\u0194\u0188\3\2\2\2\u0194\u018b\3\2"+
		"\2\2\u0194\u018e\3\2\2\2\u0194\u0191\3\2\2\2\u0195\33\3\2\2\2\u0196\u0197"+
		"\5\66\34\2\u0197\u0198\78\2\2\u0198\u0199\7\16\2\2\u0199\u019a\7\61\2"+
		"\2\u019a\u019b\5:\36\2\u019b\u019c\7\62\2\2\u019c\u019d\b\17\1\2\u019d"+
		"\35\3\2\2\2\u019e\u019f\b\20\1\2\u019f\u01a0\5\66\34\2\u01a0\u01a1\78"+
		"\2\2\u01a1\u01a2\7\17\2\2\u01a2\u01a3\7\61\2\2\u01a3\u01a4\5:\36\2\u01a4"+
		"\u01ab\b\20\1\2\u01a5\u01a6\7\67\2\2\u01a6\u01a7\5:\36\2\u01a7\u01a8\b"+
		"\20\1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01af\7\62\2\2\u01af\u01b0\b\20\1\2\u01b0\37\3\2\2\2\u01b1"+
		"\u01b2\5\66\34\2\u01b2\u01b3\78\2\2\u01b3\u01b4\7\f\2\2\u01b4\u01b5\7"+
		"\61\2\2\u01b5\u01b6\5:\36\2\u01b6\u01b7\7\62\2\2\u01b7\u01b8\b\21\1\2"+
		"\u01b8!\3\2\2\2\u01b9\u01ba\b\22\1\2\u01ba\u01bb\5X-\2\u01bb\u01bc\5V"+
		",\2\u01bc\u01c3\b\22\1\2\u01bd\u01be\7\67\2\2\u01be\u01bf\5V,\2\u01bf"+
		"\u01c0\b\22\1\2\u01c0\u01c2\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c2\u01c5\3"+
		"\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4#\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c6\u01c7\7\21\2\2\u01c7\u01c8\5(\25\2\u01c8\u01c9\5\26\f\2"+
		"\u01c9\u01cf\b\23\1\2\u01ca\u01cb\5&\24\2\u01cb\u01cc\b\23\1\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d5\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\5*"+
		"\26\2\u01d3\u01d4\b\23\1\2\u01d4\u01d6\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6%\3\2\2\2\u01d7\u01d9\7:\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7\23\2\2\u01de\u01df\5(\25\2\u01df"+
		"\u01e0\5\26\f\2\u01e0\u01e1\b\24\1\2\u01e1\'\3\2\2\2\u01e2\u01e3\7\61"+
		"\2\2\u01e3\u01e4\5\66\34\2\u01e4\u01e5\b\25\1\2\u01e5\u01e6\7\62\2\2\u01e6"+
		"\u01eb\3\2\2\2\u01e7\u01e8\5\66\34\2\u01e8\u01e9\b\25\1\2\u01e9\u01eb"+
		"\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e7\3\2\2\2\u01eb)\3\2\2\2\u01ec"+
		"\u01ee\7:\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f3\7\22\2\2\u01f3\u01f4\5\26\f\2\u01f4\u01f5\b\26\1\2\u01f5+\3\2\2"+
		"\2\u01f6\u01f7\7\20\2\2\u01f7\u01f8\7\61\2\2\u01f8\u01f9\5\66\34\2\u01f9"+
		"\u01fa\b\27\1\2\u01fa\u01fb\7\62\2\2\u01fb-\3\2\2\2\u01fc\u01fd\b\30\1"+
		"\2\u01fd\u01fe\5J&\2\u01fe\u0209\b\30\1\2\u01ff\u0205\78\2\2\u0200\u0201"+
		"\7\7\2\2\u0201\u0206\b\30\1\2\u0202\u0203\5V,\2\u0203\u0204\b\30\1\2\u0204"+
		"\u0206\3\2\2\2\u0205\u0200\3\2\2\2\u0205\u0202\3\2\2\2\u0206\u0208\3\2"+
		"\2\2\u0207\u01ff\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\61"+
		"\2\2\u020d\u020e\5\24\13\2\u020e\u020f\b\30\1\2\u020f\u0210\7\62\2\2\u0210"+
		"/\3\2\2\2\u0211\u0212\7\n\2\2\u0212\u0216\b\31\1\2\u0213\u0214\5\66\34"+
		"\2\u0214\u0215\b\31\1\2\u0215\u0217\3\2\2\2\u0216\u0213\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\61\3\2\2\2\u0218\u0219\5:\36\2\u0219\u021a\7/\2\2"+
		"\u021a\u021b\5\66\34\2\u021b\u021c\b\32\1\2\u021c\63\3\2\2\2\u021d\u0229"+
		"\b\33\1\2\u021e\u021f\5J&\2\u021f\u0220\b\33\1\2\u0220\u022a\3\2\2\2\u0221"+
		"\u0222\7\61\2\2\u0222\u0223\5\66\34\2\u0223\u0224\78\2\2\u0224\u0225\7"+
		"8\2\2\u0225\u0226\5\66\34\2\u0226\u0227\b\33\1\2\u0227\u0228\7\62\2\2"+
		"\u0228\u022a\3\2\2\2\u0229\u021e\3\2\2\2\u0229\u0221\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u022c\78\2\2\u022c\u022d\7-\2\2\u022d\u022e\7.\2\2\u022e"+
		"\u022f\7\36\2\2\u022f\u0230\5V,\2\u0230\u0231\b\33\1\2\u0231\u0232\7\36"+
		"\2\2\u0232\u0233\5\26\f\2\u0233\65\3\2\2\2\u0234\u0235\58\35\2\u0235\u023a"+
		"\b\34\1\2\u0236\u0237\7/\2\2\u0237\u0238\5\66\34\2\u0238\u0239\b\34\1"+
		"\2\u0239\u023b\3\2\2\2\u023a\u0236\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0243"+
		"\3\2\2\2\u023c\u023d\78\2\2\u023d\u023e\7\r\2\2\u023e\u023f\7\61\2\2\u023f"+
		"\u0240\5:\36\2\u0240\u0241\7\62\2\2\u0241\u0242\b\34\1\2\u0242\u0244\3"+
		"\2\2\2\u0243\u023c\3\2\2\2\u0243\u0244\3\2\2\2\u0244\67\3\2\2\2\u0245"+
		"\u0246\5:\36\2\u0246\u024d\b\35\1\2\u0247\u0248\7\"\2\2\u0248\u0249\5"+
		"8\35\2\u0249\u024a\7#\2\2\u024a\u024b\58\35\2\u024b\u024c\b\35\1\2\u024c"+
		"\u024e\3\2\2\2\u024d\u0247\3\2\2\2\u024d\u024e\3\2\2\2\u024e9\3\2\2\2"+
		"\u024f\u0250\5<\37\2\u0250\u0257\b\36\1\2\u0251\u0252\7 \2\2\u0252\u0253"+
		"\5<\37\2\u0253\u0254\b\36\1\2\u0254\u0256\3\2\2\2\u0255\u0251\3\2\2\2"+
		"\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258;\3"+
		"\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\5> \2\u025b\u0262\b\37\1\2\u025c"+
		"\u025d\7\37\2\2\u025d\u025e\5> \2\u025e\u025f\b\37\1\2\u025f\u0261\3\2"+
		"\2\2\u0260\u025c\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263=\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266\5@!\2\u0266"+
		"\u026d\b \1\2\u0267\u0268\7\32\2\2\u0268\u0269\5@!\2\u0269\u026a\b \1"+
		"\2\u026a\u026c\3\2\2\2\u026b\u0267\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e?\3\2\2\2\u026f\u026d\3\2\2\2\u0270"+
		"\u0271\5B\"\2\u0271\u027e\b!\1\2\u0272\u0277\b!\1\2\u0273\u0274\7\33\2"+
		"\2\u0274\u0278\b!\1\2\u0275\u0276\7\34\2\2\u0276\u0278\b!\1\2\u0277\u0273"+
		"\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5B\"\2\u027a"+
		"\u027b\b!\1\2\u027b\u027d\3\2\2\2\u027c\u0272\3\2\2\2\u027d\u0280\3\2"+
		"\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027fA\3\2\2\2\u0280\u027e"+
		"\3\2\2\2\u0281\u0282\5D#\2\u0282\u028f\b\"\1\2\u0283\u0288\b\"\1\2\u0284"+
		"\u0285\7\24\2\2\u0285\u0289\b\"\1\2\u0286\u0287\7\25\2\2\u0287\u0289\b"+
		"\"\1\2\u0288\u0284\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\5D#\2\u028b\u028c\b\"\1\2\u028c\u028e\3\2\2\2\u028d\u0283\3\2\2"+
		"\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290C"+
		"\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\5F$\2\u0293\u02a0\b#\1\2\u0294"+
		"\u0299\b#\1\2\u0295\u0296\7\26\2\2\u0296\u029a\b#\1\2\u0297\u0298\7\27"+
		"\2\2\u0298\u029a\b#\1\2\u0299\u0295\3\2\2\2\u0299\u0297\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\5F$\2\u029c\u029d\b#\1\2\u029d\u029f\3\2\2"+
		"\2\u029e\u0294\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1E\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a8\b$\1\2\u02a4\u02a5"+
		"\7!\2\2\u02a5\u02a9\b$\1\2\u02a6\u02a7\7\25\2\2\u02a7\u02a9\b$\1\2\u02a8"+
		"\u02a4\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\5F"+
		"$\2\u02ab\u02ac\b$\1\2\u02ac\u02b1\3\2\2\2\u02ad\u02ae\5H%\2\u02ae\u02af"+
		"\b$\1\2\u02af\u02b1\3\2\2\2\u02b0\u02a3\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b1"+
		"G\3\2\2\2\u02b2\u02b3\5J&\2\u02b3\u02bb\b%\1\2\u02b4\u02b5\7\30\2\2\u02b5"+
		"\u02b9\b%\1\2\u02b6\u02b7\7\31\2\2\u02b7\u02b9\b%\1\2\u02b8\u02b4\3\2"+
		"\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\b%\1\2\u02bb"+
		"\u02b8\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bcI\3\2\2\2\u02bd\u02be\b&\1\2\u02be"+
		"\u02bf\5L\'\2\u02bf\u02d2\b&\1\2\u02c0\u02c1\7\61\2\2\u02c1\u02c2\5\24"+
		"\13\2\u02c2\u02c3\b&\1\2\u02c3\u02c4\7\62\2\2\u02c4\u02d1\3\2\2\2\u02c5"+
		"\u02cd\78\2\2\u02c6\u02c7\5V,\2\u02c7\u02c8\b&\1\2\u02c8\u02ce\3\2\2\2"+
		"\u02c9\u02ca\7\b\2\2\u02ca\u02ce\b&\1\2\u02cb\u02cc\7\7\2\2\u02cc\u02ce"+
		"\b&\1\2\u02cd\u02c6\3\2\2\2\u02cd\u02c9\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d1\b&\1\2\u02d0\u02c0\3\2\2\2\u02d0\u02c5\3\2"+
		"\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02e0\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\78\2\2\u02d6\u02d7\5V,"+
		"\2\u02d7\u02d8\b&\1\2\u02d8\u02df\3\2\2\2\u02d9\u02da\7\63\2\2\u02da\u02db"+
		"\5\66\34\2\u02db\u02dc\b&\1\2\u02dc\u02dd\7\64\2\2\u02dd\u02df\3\2\2\2"+
		"\u02de\u02d5\3\2\2\2\u02de\u02d9\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de"+
		"\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1K\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3"+
		"\u02e4\7\t\2\2\u02e4\u02f7\b\'\1\2\u02e5\u02e6\5T+\2\u02e6\u02e7\b\'\1"+
		"\2\u02e7\u02f7\3\2\2\2\u02e8\u02e9\5P)\2\u02e9\u02ea\b\'\1\2\u02ea\u02f7"+
		"\3\2\2\2\u02eb\u02ec\5V,\2\u02ec\u02ed\b\'\1\2\u02ed\u02f7\3\2\2\2\u02ee"+
		"\u02ef\5N(\2\u02ef\u02f0\b\'\1\2\u02f0\u02f7\3\2\2\2\u02f1\u02f2\7\61"+
		"\2\2\u02f2\u02f3\5\66\34\2\u02f3\u02f4\7\62\2\2\u02f4\u02f5\b\'\1\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02e3\3\2\2\2\u02f6\u02e5\3\2\2\2\u02f6\u02e8\3\2"+
		"\2\2\u02f6\u02eb\3\2\2\2\u02f6\u02ee\3\2\2\2\u02f6\u02f1\3\2\2\2\u02f7"+
		"M\3\2\2\2\u02f8\u02f9\b(\1\2\u02f9\u02fa\7,\2\2\u02fa\u02fb\78\2\2\u02fb"+
		"\u02fc\7\b\2\2\u02fc\u030b\7\61\2\2\u02fd\u02fe\7\61\2\2\u02fe\u02ff\5"+
		":\36\2\u02ff\u0306\b(\1\2\u0300\u0301\7\67\2\2\u0301\u0302\5:\36\2\u0302"+
		"\u0303\b(\1\2\u0303\u0305\3\2\2\2\u0304\u0300\3\2\2\2\u0305\u0308\3\2"+
		"\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0309\u030a\7\62\2\2\u030a\u030c\3\2\2\2\u030b\u02fd\3"+
		"\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\7\62\2\2\u030e"+
		"\u030f\b(\1\2\u030fO\3\2\2\2\u0310\u0311\5R*\2\u0311\u0312\b)\1\2\u0312"+
		"\u0317\3\2\2\2\u0313\u0314\5`\61\2\u0314\u0315\b)\1\2\u0315\u0317\3\2"+
		"\2\2\u0316\u0310\3\2\2\2\u0316\u0313\3\2\2\2\u0317Q\3\2\2\2\u0318\u0319"+
		"\7$\2\2\u0319\u031d\b*\1\2\u031a\u031b\7%\2\2\u031b\u031d\b*\1\2\u031c"+
		"\u0318\3\2\2\2\u031c\u031a\3\2\2\2\u031dS\3\2\2\2\u031e\u031f\7=\2\2\u031f"+
		"\u0320\b+\1\2\u0320U\3\2\2\2\u0321\u0322\7<\2\2\u0322\u0323\b,\1\2\u0323"+
		"W\3\2\2\2\u0324\u0325\7)\2\2\u0325\u0335\b-\1\2\u0326\u0327\7*\2\2\u0327"+
		"\u0335\b-\1\2\u0328\u0329\5Z.\2\u0329\u032a\b-\1\2\u032a\u0335\3\2\2\2"+
		"\u032b\u032c\5\\/\2\u032c\u032d\b-\1\2\u032d\u0335\3\2\2\2\u032e\u032f"+
		"\5^\60\2\u032f\u0330\b-\1\2\u0330\u0335\3\2\2\2\u0331\u0332\5T+\2\u0332"+
		"\u0333\b-\1\2\u0333\u0335\3\2\2\2\u0334\u0324\3\2\2\2\u0334\u0326\3\2"+
		"\2\2\u0334\u0328\3\2\2\2\u0334\u032b\3\2\2\2\u0334\u032e\3\2\2\2\u0334"+
		"\u0331\3\2\2\2\u0335Y\3\2\2\2\u0336\u033e\b.\1\2\u0337\u0338\7)\2\2\u0338"+
		"\u033f\b.\1\2\u0339\u033a\7*\2\2\u033a\u033f\b.\1\2\u033b\u033c\5T+\2"+
		"\u033c\u033d\b.\1\2\u033d\u033f\3\2\2\2\u033e\u0337\3\2\2\2\u033e\u0339"+
		"\3\2\2\2\u033e\u033b\3\2\2\2\u033f\u0345\3\2\2\2\u0340\u0341\7\63\2\2"+
		"\u0341\u0342\5\66\34\2\u0342\u0343\b.\1\2\u0343\u0344\7\64\2\2\u0344\u0346"+
		"\3\2\2\2\u0345\u0340\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0345\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\b.\1\2\u034a[\3\2\2\2\u034b"+
		"\u034c\b/\1\2\u034c\u034d\7+\2\2\u034d\u035b\7\34\2\2\u034e\u034f\7\13"+
		"\2\2\u034f\u035c\b/\1\2\u0350\u0351\5X-\2\u0351\u0358\b/\1\2\u0352\u0353"+
		"\7\67\2\2\u0353\u0354\5X-\2\u0354\u0355\b/\1\2\u0355\u0357\3\2\2\2\u0356"+
		"\u0352\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u034e\3\2\2\2\u035b"+
		"\u0350\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0363\7\35\2\2\u035e\u035f\5"+
		"X-\2\u035f\u0360\b/\1\2\u0360\u0364\3\2\2\2\u0361\u0362\7\13\2\2\u0362"+
		"\u0364\b/\1\2\u0363\u035e\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u0366\7\33\2\2\u0366]\3\2\2\2\u0367\u0368\7,\2\2\u0368\u0369"+
		"\7\34\2\2\u0369\u036a\7)\2\2\u036a\u036b\7\33\2\2\u036b\u036c\b\60\1\2"+
		"\u036c_\3\2\2\2\u036d\u036e\7;\2\2\u036e\u036f\b\61\1\2\u036fa\3\2\2\2"+
		"Uemw}\u0084\u008a\u0095\u00a2\u00a7\u00ae\u00b5\u00bc\u00c1\u00c9\u00d2"+
		"\u00d7\u00dc\u00e4\u00eb\u00f6\u00fd\u0101\u0109\u010d\u0117\u011f\u0121"+
		"\u0123\u0131\u0134\u013e\u0141\u0152\u0155\u015d\u0162\u0169\u0170\u0174"+
		"\u0194\u01ab\u01c3\u01cf\u01d5\u01da\u01ea\u01ef\u0205\u0209\u0216\u0229"+
		"\u023a\u0243\u024d\u0257\u0262\u026d\u0277\u027e\u0288\u028f\u0299\u02a0"+
		"\u02a8\u02b0\u02b8\u02bb\u02cd\u02d0\u02d2\u02de\u02e0\u02f6\u0306\u030b"+
		"\u0316\u031c\u0334\u033e\u0347\u0358\u035b\u0363";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}