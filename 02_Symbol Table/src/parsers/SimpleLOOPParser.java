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
			_localctx.constructor_ret.setLine(((ConstructorContext)_localctx).INITIALIZE.getLine());
				    Identifier new_id = new Identifier(((ConstructorContext)_localctx).INITIALIZE.getText());
				    new_id.setLine(((ConstructorContext)_localctx).INITIALIZE.getLine());
				    _localctx.constructor_ret.setMethodName(new_id);
				
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

					        for (Declaration declerations: ((ClassDeclarationContext)_localctx).fd.field_decleration_ret)
					        {
					            FieldDeclaration new_fd;
					            ConstructorDeclaration new2_fd;
					            MethodDeclaration new3_fd;
					            if(declerations instanceof FieldDeclaration)
					            {
					                new_fd = (FieldDeclaration)declerations;
					                _localctx.classDeclaration_ret.addField(new_fd);
					             }
					            if(declerations instanceof ConstructorDeclaration)
					            {
					                new2_fd = (ConstructorDeclaration)declerations;
					                _localctx.classDeclaration_ret.setConstructor(new2_fd);
					            }
					            if(declerations instanceof MethodDeclaration)
					            {
					                new3_fd = (MethodDeclaration)declerations;
					                _localctx.classDeclaration_ret.addMethod(new3_fd);
					            }
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

				   for (Declaration declerations: ((ClassDeclarationContext)_localctx).fd2.field_decleration_ret)
				   {
				        FieldDeclaration new_fd2;
				        ConstructorDeclaration new2_fd2;
				        MethodDeclaration new3_fd2;
				        if(declerations instanceof FieldDeclaration)
				        {
				            new_fd2 = (FieldDeclaration)declerations;
				            _localctx.classDeclaration_ret.addField(new_fd2);
				        }
				        if(declerations instanceof ConstructorDeclaration)
				        {
				            new2_fd2 = (ConstructorDeclaration)declerations;
				            _localctx.classDeclaration_ret.setConstructor(new2_fd2);
				        }
				        if(declerations instanceof MethodDeclaration)
				        {
				            new3_fd2 = (MethodDeclaration)declerations;
				            _localctx.classDeclaration_ret.addMethod(new3_fd2);
				        }
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
		public ArrayList<Declaration> field_decleration_ret;
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
			       ((Field_declerationContext)_localctx).field_decleration_ret =  new ArrayList<Declaration>();
			    
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				boolean bl;
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUBLIC:
					{
					setState(196);
					match(PUBLIC);
					bl = false;
					}
					break;
				case PRIVATE:
					{
					setState(198);
					match(PRIVATE);
					bl = true;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					VariableDeclaration dl;
					setState(203);
					((Field_declerationContext)_localctx).vd = varDecStatement();

					       for (VariableDeclaration variables : ((Field_declerationContext)_localctx).vd.varDecStatement_ret)
					       {
					            dl = variables;

					            FieldDeclaration fd_new = new FieldDeclaration(dl, bl);
					            fd_new.setLine(dl.getLine());
					            _localctx.field_decleration_ret.add(fd_new);
					       }
					    
					}
					break;
				case 2:
					{
					setState(206);
					((Field_declerationContext)_localctx).me = method();
					_localctx.field_decleration_ret.add(((Field_declerationContext)_localctx).me.method_ret);
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(211);
				((Field_declerationContext)_localctx).cn = constructor();
				_localctx.field_decleration_ret.add(((Field_declerationContext)_localctx).cn.constructor_ret);
				}
				break;
			}
			setState(217); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(216);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219); 
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(222);
				((MethodContext)_localctx).tmp = type();
				tp = ((MethodContext)_localctx).tmp.type_ret;
				}
				break;
			case VOID:
				{
				setState(225);
				match(VOID);
				tp = new NoType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			((MethodContext)_localctx).id = identifier();
			setState(230);
			((MethodContext)_localctx).ma = methodArgsDec();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(231);
				match(NEWLINE);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		public Token LBRACE;
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
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				((MethodBodyContext)_localctx).methodBody_ret =  new MethodDeclaration();
				{
				setState(241);
				((MethodBodyContext)_localctx).LBRACE = match(LBRACE);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					match(NEWLINE);
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						((MethodBodyContext)_localctx).vd = varDecStatement();

						          for (VariableDeclaration varDec: ((MethodBodyContext)_localctx).vd.varDecStatement_ret)
						                _localctx.methodBody_ret.addLocalVar(varDec);
						        _localctx.methodBody_ret.setLine(((MethodBodyContext)_localctx).LBRACE.getLine());
						    
						setState(250); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(249);
							match(NEWLINE);
							}
							}
							setState(252); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
					{
					{
					setState(259);
					((MethodBodyContext)_localctx).ss = singleStatement();
					_localctx.methodBody_ret.addBodyStatement(((MethodBodyContext)_localctx).ss.singleStatement_ret);
					setState(262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(261);
						match(NEWLINE);
						}
						}
						setState(264); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
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
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					{
					setState(273);
					((MethodBodyContext)_localctx).vd = varDecStatement();

					        for (VariableDeclaration varDec: ((MethodBodyContext)_localctx).vd.varDecStatement_ret)
					        {
					            _localctx.methodBody_ret.addLocalVar(varDec);
					            _localctx.methodBody_ret.setLine(varDec.getLine());
					         }

					    
					setState(276); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(275);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(278); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				case 2:
					{
					{
					setState(280);
					((MethodBodyContext)_localctx).ss = singleStatement();
					_localctx.methodBody_ret.addBodyStatement(((MethodBodyContext)_localctx).ss.singleStatement_ret);_localctx.methodBody_ret.setLine(((MethodBodyContext)_localctx).ss.singleStatement_ret.getLine());

					}
					setState(284); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(283);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(286); 
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
			setState(293);
			match(LPAR);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(294);
				((MethodArgsDecContext)_localctx).ad = argDec();
				_localctx.methodArgsDec_ret.add(((MethodArgsDecContext)_localctx).ad.argDec_ret);
				setState(307);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(296);
					match(ASSIGN);
					setState(297);
					orExpression();
					}
					}
					break;
				case RPAR:
				case COMMA:
					{
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(298);
							match(COMMA);
							setState(299);
							((MethodArgsDecContext)_localctx).ad2 = argDec();
							_localctx.methodArgsDec_ret.add(((MethodArgsDecContext)_localctx).ad2.argDec_ret);
							}
							} 
						}
						setState(306);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
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
					setState(309);
					match(COMMA);
					setState(310);
					((MethodArgsDecContext)_localctx).arg = argDec();
					_localctx.methodArgsDec_ret.add(((MethodArgsDecContext)_localctx).arg.argDec_ret);
					setState(312);
					match(ASSIGN);
					setState(313);
					orExpression();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(322);
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
			setState(324);
			((ArgDecContext)_localctx).tp = type();
			setState(325);
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
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(329);
				((MethodArgsContext)_localctx).e1 = expression();
				_localctx.methodArgs_ret.add(((MethodArgsContext)_localctx).e1.expression_ret);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(331);
					match(COMMA);
					setState(332);
					((MethodArgsContext)_localctx).e2 = expression();
					_localctx.methodArgs_ret.add(((MethodArgsContext)_localctx).e2.expression_ret);
					}
					}
					setState(339);
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
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(342);
				((BodyContext)_localctx).bs = blockStatement();
				((BodyContext)_localctx).body_ret =  ((BodyContext)_localctx).bs.blockStatement_ret;
				}
				break;
			case NEWLINE:
				{
				{
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(345);
					match(NEWLINE);
					}
					}
					setState(348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(350);
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
		public Token LBRACE;
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
			setState(356);
			((BlockStatementContext)_localctx).LBRACE = match(LBRACE);
			_localctx.blockStatement_ret.setLine(((BlockStatementContext)_localctx).LBRACE.getLine());
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				match(NEWLINE);
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(363);
				((BlockStatementContext)_localctx).ss = singleStatement();
				_localctx.blockStatement_ret.addStatement(((BlockStatementContext)_localctx).ss.singleStatement_ret);
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(365);
					match(NEWLINE);
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				((SingleStatementContext)_localctx).my_if = ifStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).my_if.ifStatement_ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				((SingleStatementContext)_localctx).pr = printStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).pr.printStatement_ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				((SingleStatementContext)_localctx).mc = methodCallStmt();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).mc.methodCallStmt_ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				((SingleStatementContext)_localctx).rs = returnStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).rs.returnStatement_ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				((SingleStatementContext)_localctx).as = assignmentStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).as.assignmentStatement_ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				((SingleStatementContext)_localctx).ls = loopStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).ls.loopStatement_ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(395);
				((SingleStatementContext)_localctx).ad = addStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).ad.addStatement_ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(398);
				((SingleStatementContext)_localctx).ms = mergeStatement();
				((SingleStatementContext)_localctx).singleStatement_ret =  ((SingleStatementContext)_localctx).ms.mergeStatement_ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(401);
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
			setState(406);
			((AddStatementContext)_localctx).ex = expression();
			setState(407);
			match(DOT);
			setState(408);
			((AddStatementContext)_localctx).ADD = match(ADD);
			setState(409);
			match(LPAR);
			setState(410);
			((AddStatementContext)_localctx).oe = orExpression();
			setState(411);
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
			setState(415);
			((MergeStatementContext)_localctx).ex = expression();
			setState(416);
			match(DOT);
			setState(417);
			((MergeStatementContext)_localctx).MERGE = match(MERGE);
			setState(418);
			match(LPAR);
			setState(419);
			((MergeStatementContext)_localctx).ox = orExpression();
			tmp.add(((MergeStatementContext)_localctx).ox.orExpression_ret);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				((MergeStatementContext)_localctx).oe = orExpression();
				tmp.add(((MergeStatementContext)_localctx).oe.orExpression_ret);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
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
			setState(433);
			((DeleteStatementContext)_localctx).ex = expression();
			setState(434);
			match(DOT);
			setState(435);
			((DeleteStatementContext)_localctx).DELETE = match(DELETE);
			setState(436);
			match(LPAR);
			setState(437);
			((DeleteStatementContext)_localctx).oe = orExpression();
			setState(438);
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
			setState(442);
			((VarDecStatementContext)_localctx).tp = type();
			setState(443);
			((VarDecStatementContext)_localctx).id = identifier();

			        VariableDeclaration tmp1;
			        tmp1 = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifier_ret, ((VarDecStatementContext)_localctx).tp.type_ret);
			        tmp1.setLine(((VarDecStatementContext)_localctx).id.identifier_ret.getLine());
			        _localctx.varDecStatement_ret.add(tmp1);
			   
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(445);
				match(COMMA);
				setState(446);
				((VarDecStatementContext)_localctx).id2 = identifier();

				        VariableDeclaration tmp2;
				        tmp2 = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifier_ret, ((VarDecStatementContext)_localctx).tp.type_ret);
				        tmp2.setLine(((VarDecStatementContext)_localctx).id.identifier_ret.getLine());
				        _localctx.varDecStatement_ret.add(tmp2);
				    
				}
				}
				setState(453);
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
			setState(454);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(455);
			((IfStatementContext)_localctx).cn = condition();
			setState(456);
			((IfStatementContext)_localctx).bd = body();
			((IfStatementContext)_localctx).ifStatement_ret =  new ConditionalStmt(((IfStatementContext)_localctx).cn.condition_ret, ((IfStatementContext)_localctx).bd.body_ret);
			    _localctx.ifStatement_ret.setLine(((IfStatementContext)_localctx).IF.getLine());
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					((IfStatementContext)_localctx).eif = elsifStatement();
					_localctx.ifStatement_ret.addElsif(((IfStatementContext)_localctx).eif.elsifStatement_ret);
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(466);
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
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(471);
				match(NEWLINE);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			((ElsifStatementContext)_localctx).ELSIF = match(ELSIF);
			setState(478);
			((ElsifStatementContext)_localctx).cn = condition();
			setState(479);
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
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(482);
				match(LPAR);
				setState(483);
				((ConditionContext)_localctx).ex = expression();
				((ConditionContext)_localctx).condition_ret =  ((ConditionContext)_localctx).ex.expression_ret;
				setState(485);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(487);
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
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(492);
				match(NEWLINE);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(ELSE);
			setState(499);
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
			setState(502);
			((PrintStatementContext)_localctx).PRINT = match(PRINT);
			setState(503);
			match(LPAR);
			setState(504);
			((PrintStatementContext)_localctx).ex = expression();
			((PrintStatementContext)_localctx).printStatement_ret =  new PrintStmt(((PrintStatementContext)_localctx).ex.expression_ret);
			    _localctx.printStatement_ret.setLine(((PrintStatementContext)_localctx).PRINT.getLine());
			setState(506);
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
			setState(509);
			((MethodCallStmtContext)_localctx).ae = accessExpression();
			ex = ((MethodCallStmtContext)_localctx).ae.accessExpression_ret;
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(511);
				match(DOT);
				setState(517);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INITIALIZE:
					{
					setState(512);
					((MethodCallStmtContext)_localctx).INITIALIZE = match(INITIALIZE);

					    Identifier id_temp = new Identifier(((MethodCallStmtContext)_localctx).INITIALIZE.getText());
					    id_temp.setLine(((MethodCallStmtContext)_localctx).INITIALIZE.getLine());
					    ex = new ObjectMemberAccess(ex, id_temp);
					    ex.setLine(id_temp.getLine());
					    
					}
					break;
				case IDENTIFIER:
					{
					setState(514);
					((MethodCallStmtContext)_localctx).id = identifier();


					        ex = new ObjectMemberAccess(ex, ((MethodCallStmtContext)_localctx).id.identifier_ret);
					        ex.setLine(((MethodCallStmtContext)_localctx).id.identifier_ret.getLine());
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			{
			setState(524);
			((MethodCallStmtContext)_localctx).LPAR = match(LPAR);
			setState(525);
			((MethodCallStmtContext)_localctx).ma = methodArgs();

			        MethodCall mt_call = new MethodCall(ex, ((MethodCallStmtContext)_localctx).ma.methodArgs_ret);
			        mt_call.setLine(((MethodCallStmtContext)_localctx).LPAR.getLine());
			        ((MethodCallStmtContext)_localctx).methodCallStmt_ret =  new MethodCallStmt(mt_call);
			        _localctx.methodCallStmt_ret.setLine(((MethodCallStmtContext)_localctx).LPAR.getLine());
			    
			setState(527);
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
			setState(529);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			((ReturnStatementContext)_localctx).returnStatement_ret =  new ReturnStmt(); _localctx.returnStatement_ret.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(531);
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
			setState(536);
			((AssignmentStatementContext)_localctx).oe = orExpression();
			setState(537);
			((AssignmentStatementContext)_localctx).ASSIGN = match(ASSIGN);
			setState(538);
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
		public BodyContext body;
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
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				{
				setState(542);
				((LoopStatementContext)_localctx).ae = accessExpression();
				ex_val = ((LoopStatementContext)_localctx).ae.accessExpression_ret;
				}
				}
				break;
			case 2:
				{
				{
				setState(545);
				match(LPAR);
				setState(546);
				((LoopStatementContext)_localctx).ex1 = expression();
				setState(547);
				match(DOT);
				setState(548);
				match(DOT);
				setState(549);
				((LoopStatementContext)_localctx).ex2 = expression();
				ex_val = new RangeExpression(((LoopStatementContext)_localctx).ex1.expression_ret, ((LoopStatementContext)_localctx).ex2.expression_ret);
				setState(551);
				match(RPAR);
				}
				}
				break;
			}
			setState(555);
			match(DOT);
			setState(556);
			((LoopStatementContext)_localctx).EACH = match(EACH);
			setState(557);
			match(DO);
			setState(558);
			match(BAR);
			setState(559);
			((LoopStatementContext)_localctx).id = identifier();
			((LoopStatementContext)_localctx).loopStatement_ret =  new EachStmt(((LoopStatementContext)_localctx).id.identifier_ret, ex_val); _localctx.loopStatement_ret.setLine(((LoopStatementContext)_localctx).EACH.getLine());
			setState(561);
			match(BAR);
			setState(562);
			((LoopStatementContext)_localctx).body = body();
			_localctx.loopStatement_ret.setBody(((LoopStatementContext)_localctx).body.body_ret);
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
			setState(565);
			((ExpressionContext)_localctx).te = ternaryExpression();
			((ExpressionContext)_localctx).expression_ret =  ((ExpressionContext)_localctx).te.ternaryExpression_ret;
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(567);
				((ExpressionContext)_localctx).ASSIGN = match(ASSIGN);
				setState(568);
				((ExpressionContext)_localctx).ex = expression();
				((ExpressionContext)_localctx).expression_ret =  new BinaryExpression(_localctx.expression_ret, ((ExpressionContext)_localctx).ex.expression_ret, BinaryOperator.assign);
				    _localctx.expression_ret.setLine(((ExpressionContext)_localctx).ASSIGN.getLine());
				}
			}

			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(573);
				match(DOT);
				setState(574);
				((ExpressionContext)_localctx).INCLUDE = match(INCLUDE);
				setState(575);
				match(LPAR);
				setState(576);
				((ExpressionContext)_localctx).oe = orExpression();
				setState(577);
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
			setState(582);
			((TernaryExpressionContext)_localctx).oe = orExpression();
			((TernaryExpressionContext)_localctx).ternaryExpression_ret =  ((TernaryExpressionContext)_localctx).oe.orExpression_ret;
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIF) {
				{
				setState(584);
				((TernaryExpressionContext)_localctx).TIF = match(TIF);
				setState(585);
				((TernaryExpressionContext)_localctx).te1 = ternaryExpression();
				setState(586);
				match(TELSE);
				setState(587);
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
			setState(592);
			((OrExpressionContext)_localctx).ae = andExpression();
			((OrExpressionContext)_localctx).orExpression_ret =  ((OrExpressionContext)_localctx).ae.andExpression_ret;
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(594);
				((OrExpressionContext)_localctx).OR = match(OR);
				setState(595);
				((OrExpressionContext)_localctx).aeq = andExpression();
				((OrExpressionContext)_localctx).orExpression_ret =  new BinaryExpression(_localctx.orExpression_ret,
				    ((OrExpressionContext)_localctx).aeq.andExpression_ret, BinaryOperator.or); _localctx.orExpression_ret.setLine(((OrExpressionContext)_localctx).OR.getLine());
				}
				}
				setState(602);
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
			setState(603);
			((AndExpressionContext)_localctx).ee = equalityExpression();
			((AndExpressionContext)_localctx).andExpression_ret =  ((AndExpressionContext)_localctx).ee.equalityExpression_ret;
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(605);
				((AndExpressionContext)_localctx).AND = match(AND);
				setState(606);
				((AndExpressionContext)_localctx).eqe = equalityExpression();
				((AndExpressionContext)_localctx).andExpression_ret =  new BinaryExpression(_localctx.andExpression_ret, ((AndExpressionContext)_localctx).eqe.equalityExpression_ret, BinaryOperator.and);
				    _localctx.andExpression_ret.setLine(((AndExpressionContext)_localctx).AND.getLine());
				}
				}
				setState(613);
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
			setState(614);
			((EqualityExpressionContext)_localctx).re = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExpression_ret =  ((EqualityExpressionContext)_localctx).re.relationalExpression_ret;
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(616);
				((EqualityExpressionContext)_localctx).EQUAL = match(EQUAL);
				setState(617);
				((EqualityExpressionContext)_localctx).expr = relationalExpression();
				((EqualityExpressionContext)_localctx).equalityExpression_ret =  new BinaryExpression(_localctx.equalityExpression_ret, ((EqualityExpressionContext)_localctx).expr.relationalExpression_ret, BinaryOperator.eq);
				    _localctx.equalityExpression_ret.setLine(((EqualityExpressionContext)_localctx).EQUAL.getLine());
				}
				}
				setState(624);
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
			setState(625);
			((RelationalExpressionContext)_localctx).ae = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExpression_ret =  ((RelationalExpressionContext)_localctx).ae.additiveExpression_ret;
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				BinaryOperator bo; int ln;
				setState(632);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(628);
					((RelationalExpressionContext)_localctx).GREATER_THAN = match(GREATER_THAN);
					bo = BinaryOperator.gt;ln = ((RelationalExpressionContext)_localctx).GREATER_THAN.getLine();
					}
					break;
				case LESS_THAN:
					{
					setState(630);
					((RelationalExpressionContext)_localctx).LESS_THAN = match(LESS_THAN);
					bo = BinaryOperator.lt;ln = ((RelationalExpressionContext)_localctx).LESS_THAN.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(634);
				((RelationalExpressionContext)_localctx).ade = additiveExpression();
				((RelationalExpressionContext)_localctx).relationalExpression_ret =  new BinaryExpression(_localctx.relationalExpression_ret, ((RelationalExpressionContext)_localctx).ade.additiveExpression_ret, bo);
				    _localctx.relationalExpression_ret.setLine(ln);
				}
				}
				setState(641);
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
			setState(642);
			((AdditiveExpressionContext)_localctx).me = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExpression_ret =  ((AdditiveExpressionContext)_localctx).me.multiplicativeExpression_ret;
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				BinaryOperator bo; int ln;
				setState(649);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(645);
					((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
					bo = BinaryOperator.add;ln = ((AdditiveExpressionContext)_localctx).PLUS.getLine();
					}
					break;
				case MINUS:
					{
					setState(647);
					((AdditiveExpressionContext)_localctx).MINUS = match(MINUS);
					bo = BinaryOperator.sub;ln = ((AdditiveExpressionContext)_localctx).MINUS.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(651);
				((AdditiveExpressionContext)_localctx).mpe = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).additiveExpression_ret =  new BinaryExpression(_localctx.additiveExpression_ret, ((AdditiveExpressionContext)_localctx).mpe.multiplicativeExpression_ret, bo);
				    _localctx.additiveExpression_ret.setLine(ln);
				}
				}
				setState(658);
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
			setState(659);
			((MultiplicativeExpressionContext)_localctx).pe = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpression_ret =  ((MultiplicativeExpressionContext)_localctx).pe.preUnaryExpression_ret;
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				BinaryOperator bo; int ln;
				setState(666);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(662);
					((MultiplicativeExpressionContext)_localctx).MULT = match(MULT);
					bo = BinaryOperator.mult;ln = ((MultiplicativeExpressionContext)_localctx).MULT.getLine();
					}
					break;
				case DIVIDE:
					{
					setState(664);
					((MultiplicativeExpressionContext)_localctx).DIVIDE = match(DIVIDE);
					bo = BinaryOperator.div;ln = ((MultiplicativeExpressionContext)_localctx).DIVIDE.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(668);
				((MultiplicativeExpressionContext)_localctx).pue = preUnaryExpression();
				((MultiplicativeExpressionContext)_localctx).multiplicativeExpression_ret =  new BinaryExpression(_localctx.multiplicativeExpression_ret, ((MultiplicativeExpressionContext)_localctx).pue.preUnaryExpression_ret, bo);
				    _localctx.multiplicativeExpression_ret.setLine(ln);
				}
				}
				setState(675);
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
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator uo;
				{
				setState(681);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(677);
					match(NOT);
					uo = UnaryOperator.not;
					}
					break;
				case MINUS:
					{
					setState(679);
					match(MINUS);
					uo = UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(683);
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
				setState(686);
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
			setState(691);
			((PostUnaryExpressionContext)_localctx).ae = accessExpression();
			((PostUnaryExpressionContext)_localctx).postUnaryExpression_ret =  ((PostUnaryExpressionContext)_localctx).ae.accessExpression_ret; UnaryOperator uo; int ln;
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INC || _la==DEC) {
				{
				setState(697);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(693);
					((PostUnaryExpressionContext)_localctx).INC = match(INC);
					uo = UnaryOperator.postinc; ln = ((PostUnaryExpressionContext)_localctx).INC.getLine();
					}
					break;
				case DEC:
					{
					setState(695);
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
			setState(703);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			((AccessExpressionContext)_localctx).accessExpression_ret =  ((AccessExpressionContext)_localctx).oe.otherExpression_ret;
			setState(722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(720);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(705);
						((AccessExpressionContext)_localctx).LPAR = match(LPAR);
						setState(706);
						((AccessExpressionContext)_localctx).ma = methodArgs();
						((AccessExpressionContext)_localctx).accessExpression_ret =  new MethodCall(((AccessExpressionContext)_localctx).oe.otherExpression_ret, ((AccessExpressionContext)_localctx).ma.methodArgs_ret);
						    _localctx.accessExpression_ret.setLine(((AccessExpressionContext)_localctx).LPAR.getLine());
						setState(708);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						{
						setState(710);
						match(DOT);
						setState(718);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(711);
							((AccessExpressionContext)_localctx).i = identifier();
							System.out.println(((AccessExpressionContext)_localctx).i.identifier_ret.toString());((AccessExpressionContext)_localctx).accessExpression_ret =  new ObjectMemberAccess(_localctx.accessExpression_ret, ((AccessExpressionContext)_localctx).i.identifier_ret); _localctx.accessExpression_ret.setLine(((AccessExpressionContext)_localctx).i.identifier_ret.getLine());
							}
							break;
						case NEW:
							{
							setState(714);
							((AccessExpressionContext)_localctx).NEW = match(NEW);
							id = new Identifier(((AccessExpressionContext)_localctx).NEW.getText()); id.setLine(((AccessExpressionContext)_localctx).NEW.getLine());
							}
							break;
						case INITIALIZE:
							{
							setState(716);
							((AccessExpressionContext)_localctx).INITIALIZE = match(INITIALIZE);
							id = new Identifier(((AccessExpressionContext)_localctx).INITIALIZE.getText()); id.setLine(((AccessExpressionContext)_localctx).INITIALIZE.getLine());
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(734);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(725);
						match(DOT);
						{
						setState(726);
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
						setState(729);
						((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
						setState(730);
						((AccessExpressionContext)_localctx).ex = expression();
						((AccessExpressionContext)_localctx).accessExpression_ret =  new ArrayAccessByIndex(_localctx.accessExpression_ret, ((AccessExpressionContext)_localctx).ex.expression_ret);
						     _localctx.accessExpression_ret.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
						setState(732);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(738);
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
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				((OtherExpressionContext)_localctx).SELF = match(SELF);
				((OtherExpressionContext)_localctx).otherExpression_ret =  new SelfClass(); _localctx.otherExpression_ret.setLine(((OtherExpressionContext)_localctx).SELF.getLine());
				}
				break;
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				((OtherExpressionContext)_localctx).ci = class_identifier();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).ci.class_identifier_ret;
				}
				break;
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				((OtherExpressionContext)_localctx).v = value();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).v.value_ret;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				((OtherExpressionContext)_localctx).id = identifier();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).id.identifier_ret;
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(750);
				((OtherExpressionContext)_localctx).sn = setNew();
				((OtherExpressionContext)_localctx).otherExpression_ret =  ((OtherExpressionContext)_localctx).sn.setNew_ret;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(753);
				match(LPAR);
				setState(754);
				((OtherExpressionContext)_localctx).ex = expression();
				setState(755);
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
			setState(761);
			match(SET);
			setState(762);
			match(DOT);
			setState(763);
			match(NEW);
			setState(764);
			match(LPAR);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(765);
				match(LPAR);
				setState(766);
				((SetNewContext)_localctx).oe = orExpression();
				arr_list.add(((SetNewContext)_localctx).oe.orExpression_ret);
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(768);
					match(COMMA);
					setState(769);
					((SetNewContext)_localctx).oe2 = orExpression();
					arr_list.add(((SetNewContext)_localctx).oe2.orExpression_ret);
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(777);
				((SetNewContext)_localctx).RPAR = match(RPAR);
				}
			}

			setState(781);
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
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				((ValueContext)_localctx).bv = boolValue();
				((ValueContext)_localctx).value_ret =  ((ValueContext)_localctx).bv.boolValue_ret;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
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
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).boolValue_ret =  new BoolValue(true); _localctx.boolValue_ret.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
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
			setState(798);
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
			setState(801);
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
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(INT);
				((TypeContext)_localctx).type_ret =  new IntType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(BOOL);
				((TypeContext)_localctx).type_ret =  new BoolType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				((TypeContext)_localctx).arr_tp = array_type();
				((TypeContext)_localctx).type_ret =  ((TypeContext)_localctx).arr_tp.array_type_ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				((TypeContext)_localctx).fptr_tp = fptr_type();
				((TypeContext)_localctx).type_ret =  ((TypeContext)_localctx).fptr_tp.fptr_type_ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(814);
				((TypeContext)_localctx).set_tp = set_type();
				((TypeContext)_localctx).type_ret =  ((TypeContext)_localctx).set_tp.set_type_ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(817);
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
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(823);
				((Array_typeContext)_localctx).INT = match(INT);
				tp = new IntType(); ln = ((Array_typeContext)_localctx).INT.getLine();
				}
				break;
			case BOOL:
				{
				setState(825);
				match(BOOL);
				tp = new BoolType();
				}
				break;
			case CLASS_IDENTIFIER:
				{
				setState(827);
				((Array_typeContext)_localctx).ci = class_identifier();
				tp = new ClassType(((Array_typeContext)_localctx).ci.class_identifier_ret);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(837); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(832);
				match(LBRACK);
				setState(833);
				((Array_typeContext)_localctx).ex = expression();
				arr_list.add(((Array_typeContext)_localctx).ex.expression_ret);
				setState(835);
				match(RBRACK);
				}
				}
				setState(839); 
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
			setState(844);
			match(FPTR);
			setState(845);
			match(LESS_THAN);
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(846);
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
				setState(848);
				((Fptr_typeContext)_localctx).tp = type();
				_localctx.fptr_type_ret.addArgumentType
				    (((Fptr_typeContext)_localctx).tp.type_ret);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(850);
					match(COMMA);
					setState(851);
					((Fptr_typeContext)_localctx).tp2 = type();
					_localctx.fptr_type_ret.addArgumentType(((Fptr_typeContext)_localctx).tp2.type_ret);
					}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(861);
			match(ARROW);
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(862);
				((Fptr_typeContext)_localctx).tp3 = type();
				_localctx.fptr_type_ret.setReturnType(((Fptr_typeContext)_localctx).tp3.type_ret);
				}
				break;
			case VOID:
				{
				setState(865);
				match(VOID);
				_localctx.fptr_type_ret.setReturnType (new VoidType());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(869);
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
			setState(871);
			match(SET);
			setState(872);
			match(LESS_THAN);
			{
			setState(873);
			match(INT);
			}
			setState(874);
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
			setState(877);
			((Int_valueContext)_localctx).INT_VALUE = match(INT_VALUE);
			((Int_valueContext)_localctx).int_value_ret =  new IntValue(Integer.parseInt(((Int_valueContext)_localctx).INT_VALUE.getText()));
				    _localctx.int_value_ret.setLine(((Int_valueContext)_localctx).INT_VALUE.getLine());
				
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0373\4\2\t\2\4"+
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
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cb\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00d4\n\6\3\6\3\6\3\6\5\6\u00d9\n\6\3\6\6\6\u00dc\n\6\r\6\16\6\u00dd"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e6\n\7\3\7\3\7\3\7\7\7\u00eb\n\7\f\7\16"+
		"\7\u00ee\13\7\3\7\3\7\3\7\3\b\3\b\3\b\6\b\u00f6\n\b\r\b\16\b\u00f7\3\b"+
		"\3\b\3\b\6\b\u00fd\n\b\r\b\16\b\u00fe\7\b\u0101\n\b\f\b\16\b\u0104\13"+
		"\b\3\b\3\b\3\b\6\b\u0109\n\b\r\b\16\b\u010a\7\b\u010d\n\b\f\b\16\b\u0110"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\6\b\u0117\n\b\r\b\16\b\u0118\3\b\3\b\3\b\3\b"+
		"\6\b\u011f\n\b\r\b\16\b\u0120\5\b\u0123\n\b\5\b\u0125\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0131\n\t\f\t\16\t\u0134\13\t\5\t\u0136"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u013e\n\t\f\t\16\t\u0141\13\t\5\t\u0143"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0152"+
		"\n\13\f\13\16\13\u0155\13\13\5\13\u0157\n\13\3\f\3\f\3\f\3\f\6\f\u015d"+
		"\n\f\r\f\16\f\u015e\3\f\3\f\3\f\5\f\u0164\n\f\3\r\3\r\3\r\3\r\6\r\u016a"+
		"\n\r\r\r\16\r\u016b\3\r\3\r\3\r\6\r\u0171\n\r\r\r\16\r\u0172\7\r\u0175"+
		"\n\r\f\r\16\r\u0178\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0197\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u01ac\n\20\f\20\16\20\u01af\13\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u01c4\n\22\f\22\16\22\u01c7\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u01d0\n\23\f\23\16\23\u01d3\13\23\3\23\3\23\3\23\5\23\u01d8\n\23"+
		"\3\24\7\24\u01db\n\24\f\24\16\24\u01de\13\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01ed\n\25\3\26\7\26\u01f0"+
		"\n\26\f\26\16\26\u01f3\13\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0208\n\30"+
		"\7\30\u020a\n\30\f\30\16\30\u020d\13\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0219\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u022c\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u023e\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0247\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0251\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0259\n\36\f\36\16\36\u025c\13\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0264\n\37\f\37\16\37\u0267\13\37\3 \3 \3 \3"+
		" \3 \3 \7 \u026f\n \f \16 \u0272\13 \3!\3!\3!\3!\3!\3!\3!\5!\u027b\n!"+
		"\3!\3!\3!\7!\u0280\n!\f!\16!\u0283\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u028c\n\"\3\"\3\"\3\"\7\"\u0291\n\"\f\"\16\"\u0294\13\"\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u029d\n#\3#\3#\3#\7#\u02a2\n#\f#\16#\u02a5\13#\3$\3$\3$\3$"+
		"\3$\5$\u02ac\n$\3$\3$\3$\3$\3$\3$\5$\u02b4\n$\3%\3%\3%\3%\3%\3%\5%\u02bc"+
		"\n%\3%\5%\u02bf\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u02d1\n&\7&\u02d3\n&\f&\16&\u02d6\13&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u02e1"+
		"\n&\f&\16&\u02e4\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02f9\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\7(\u0307\n(\f(\16(\u030a\13(\3(\3(\5(\u030e\n(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\5)\u0319\n)\3*\3*\3*\3*\5*\u031f\n*\3+\3+\3+\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0337\n-\3.\3.\3.\3."+
		"\3.\3.\3.\3.\5.\u0341\n.\3.\3.\3.\3.\3.\6.\u0348\n.\r.\16.\u0349\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0359\n/\f/\16/\u035c\13/\5/\u035e"+
		"\n/\3/\3/\3/\3/\3/\3/\5/\u0366\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\2\2\u03a6\2e\3\2\2\2\4r\3\2"+
		"\2\2\6\u008d\3\2\2\2\b\u009b\3\2\2\2\n\u00c4\3\2\2\2\f\u00df\3\2\2\2\16"+
		"\u0124\3\2\2\2\20\u0126\3\2\2\2\22\u0146\3\2\2\2\24\u014a\3\2\2\2\26\u0163"+
		"\3\2\2\2\30\u0165\3\2\2\2\32\u0196\3\2\2\2\34\u0198\3\2\2\2\36\u01a0\3"+
		"\2\2\2 \u01b3\3\2\2\2\"\u01bb\3\2\2\2$\u01c8\3\2\2\2&\u01dc\3\2\2\2(\u01ec"+
		"\3\2\2\2*\u01f1\3\2\2\2,\u01f8\3\2\2\2.\u01fe\3\2\2\2\60\u0213\3\2\2\2"+
		"\62\u021a\3\2\2\2\64\u021f\3\2\2\2\66\u0237\3\2\2\28\u0248\3\2\2\2:\u0252"+
		"\3\2\2\2<\u025d\3\2\2\2>\u0268\3\2\2\2@\u0273\3\2\2\2B\u0284\3\2\2\2D"+
		"\u0295\3\2\2\2F\u02b3\3\2\2\2H\u02b5\3\2\2\2J\u02c0\3\2\2\2L\u02f8\3\2"+
		"\2\2N\u02fa\3\2\2\2P\u0318\3\2\2\2R\u031e\3\2\2\2T\u0320\3\2\2\2V\u0323"+
		"\3\2\2\2X\u0336\3\2\2\2Z\u0338\3\2\2\2\\\u034d\3\2\2\2^\u0369\3\2\2\2"+
		"`\u036f\3\2\2\2bd\7:\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2"+
		"\2\2ge\3\2\2\2hi\5\4\3\2im\b\2\1\2jl\7:\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\3\3\2\2\2r}\b\3\1\2su\5"+
		"\"\22\2tv\7:\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b"+
		"\3\1\2z|\3\2\2\2{s\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u008a\3\2"+
		"\2\2\177}\3\2\2\2\u0080\u0082\5\b\5\2\u0081\u0083\7:\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\3\1\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2"+
		"\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\5\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\4\1\2\u008e\u008f\7\5\2\2"+
		"\u008f\u0090\7\7\2\2\u0090\u0091\b\4\1\2\u0091\u0095\5\20\t\2\u0092\u0094"+
		"\7:\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\16"+
		"\b\2\u0099\u009a\b\4\1\2\u009a\7\3\2\2\2\u009b\u009c\7\4\2\2\u009c\u009d"+
		"\5T+\2\u009d\u00a2\b\5\1\2\u009e\u009f\7\34\2\2\u009f\u00a0\5T+\2\u00a0"+
		"\u00a1\b\5\1\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a6\7:\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00bc\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\7\65\2\2\u00ab\u00ad\7:\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\b\5\1\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\66\2\2\u00b8"+
		"\u00bd\3\2\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb\b\5\1\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00aa\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be"+
		"\u00c0\7:\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\t\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00d8"+
		"\b\6\1\2\u00c5\u00ca\b\6\1\2\u00c6\u00c7\7\5\2\2\u00c7\u00cb\b\6\1\2\u00c8"+
		"\u00c9\7\6\2\2\u00c9\u00cb\b\6\1\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00d3\3\2\2\2\u00cc\u00cd\b\6\1\2\u00cd\u00ce\5\"\22\2\u00ce"+
		"\u00cf\b\6\1\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\5\f\7\2\u00d1\u00d2\b\6"+
		"\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4"+
		"\u00d9\3\2\2\2\u00d5\u00d6\5\6\4\2\u00d6\u00d7\b\6\1\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00c5\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00dc\7:\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\13\3\2\2\2\u00df\u00e5\b\7\1\2\u00e0\u00e1"+
		"\5X-\2\u00e1\u00e2\b\7\1\2\u00e2\u00e6\3\2\2\2\u00e3\u00e4\7\13\2\2\u00e4"+
		"\u00e6\b\7\1\2\u00e5\u00e0\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\5V,\2\u00e8\u00ec\5\20\t\2\u00e9\u00eb\7:\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5\16\b\2\u00f0\u00f1\b"+
		"\7\1\2\u00f1\r\3\2\2\2\u00f2\u00f3\b\b\1\2\u00f3\u00f5\7\65\2\2\u00f4"+
		"\u00f6\7:\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0102\3\2\2\2\u00f9\u00fa\5\"\22\2\u00fa"+
		"\u00fc\b\b\1\2\u00fb\u00fd\7:\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u010e\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5\32\16\2\u0106"+
		"\u0108\b\b\1\2\u0107\u0109\7:\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0105\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0125\7\66\2\2\u0112"+
		"\u0122\b\b\1\2\u0113\u0114\5\"\22\2\u0114\u0116\b\b\1\2\u0115\u0117\7"+
		":\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0123\3\2\2\2\u011a\u011b\5\32\16\2\u011b\u011c\b"+
		"\b\1\2\u011c\u011e\3\2\2\2\u011d\u011f\7:\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0113\3\2\2\2\u0122\u011a\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u00f2\3\2\2\2\u0124\u0112\3\2\2\2\u0125\17\3\2\2\2\u0126\u0127\b\t\1"+
		"\2\u0127\u0142\7\61\2\2\u0128\u0129\5\22\n\2\u0129\u0135\b\t\1\2\u012a"+
		"\u012b\7/\2\2\u012b\u0136\5:\36\2\u012c\u012d\7\67\2\2\u012d\u012e\5\22"+
		"\n\2\u012e\u012f\b\t\1\2\u012f\u0131\3\2\2\2\u0130\u012c\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u012a\3\2\2\2\u0135\u0132\3\2\2\2\u0136"+
		"\u013f\3\2\2\2\u0137\u0138\7\67\2\2\u0138\u0139\5\22\n\2\u0139\u013a\b"+
		"\t\1\2\u013a\u013b\7/\2\2\u013b\u013c\5:\36\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0137\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0128\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\62\2\2\u0145\21\3\2\2"+
		"\2\u0146\u0147\5X-\2\u0147\u0148\5V,\2\u0148\u0149\b\n\1\2\u0149\23\3"+
		"\2\2\2\u014a\u0156\b\13\1\2\u014b\u014c\5\66\34\2\u014c\u0153\b\13\1\2"+
		"\u014d\u014e\7\67\2\2\u014e\u014f\5\66\34\2\u014f\u0150\b\13\1\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014d\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u014b\3\2\2\2\u0156\u0157\3\2\2\2\u0157\25\3\2\2\2\u0158\u0159\5\30\r"+
		"\2\u0159\u015a\b\f\1\2\u015a\u0164\3\2\2\2\u015b\u015d\7:\2\2\u015c\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\5\32\16\2\u0161\u0162\b\f\1\2\u0162\u0164\3"+
		"\2\2\2\u0163\u0158\3\2\2\2\u0163\u015c\3\2\2\2\u0164\27\3\2\2\2\u0165"+
		"\u0166\b\r\1\2\u0166\u0167\7\65\2\2\u0167\u0169\b\r\1\2\u0168\u016a\7"+
		":\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u0176\3\2\2\2\u016d\u016e\5\32\16\2\u016e\u0170\b"+
		"\r\1\2\u016f\u0171\7:\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u016d\3\2"+
		"\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7\66\2\2\u017a\31\3\2\2"+
		"\2\u017b\u017c\5$\23\2\u017c\u017d\b\16\1\2\u017d\u0197\3\2\2\2\u017e"+
		"\u017f\5,\27\2\u017f\u0180\b\16\1\2\u0180\u0197\3\2\2\2\u0181\u0182\5"+
		".\30\2\u0182\u0183\b\16\1\2\u0183\u0197\3\2\2\2\u0184\u0185\5\60\31\2"+
		"\u0185\u0186\b\16\1\2\u0186\u0197\3\2\2\2\u0187\u0188\5\62\32\2\u0188"+
		"\u0189\b\16\1\2\u0189\u0197\3\2\2\2\u018a\u018b\5\64\33\2\u018b\u018c"+
		"\b\16\1\2\u018c\u0197\3\2\2\2\u018d\u018e\5\34\17\2\u018e\u018f\b\16\1"+
		"\2\u018f\u0197\3\2\2\2\u0190\u0191\5\36\20\2\u0191\u0192\b\16\1\2\u0192"+
		"\u0197\3\2\2\2\u0193\u0194\5 \21\2\u0194\u0195\b\16\1\2\u0195\u0197\3"+
		"\2\2\2\u0196\u017b\3\2\2\2\u0196\u017e\3\2\2\2\u0196\u0181\3\2\2\2\u0196"+
		"\u0184\3\2\2\2\u0196\u0187\3\2\2\2\u0196\u018a\3\2\2\2\u0196\u018d\3\2"+
		"\2\2\u0196\u0190\3\2\2\2\u0196\u0193\3\2\2\2\u0197\33\3\2\2\2\u0198\u0199"+
		"\5\66\34\2\u0199\u019a\78\2\2\u019a\u019b\7\16\2\2\u019b\u019c\7\61\2"+
		"\2\u019c\u019d\5:\36\2\u019d\u019e\7\62\2\2\u019e\u019f\b\17\1\2\u019f"+
		"\35\3\2\2\2\u01a0\u01a1\b\20\1\2\u01a1\u01a2\5\66\34\2\u01a2\u01a3\78"+
		"\2\2\u01a3\u01a4\7\17\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a6\5:\36\2\u01a6"+
		"\u01ad\b\20\1\2\u01a7\u01a8\7\67\2\2\u01a8\u01a9\5:\36\2\u01a9\u01aa\b"+
		"\20\1\2\u01aa\u01ac\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01b0\u01b1\7\62\2\2\u01b1\u01b2\b\20\1\2\u01b2\37\3\2\2\2\u01b3"+
		"\u01b4\5\66\34\2\u01b4\u01b5\78\2\2\u01b5\u01b6\7\f\2\2\u01b6\u01b7\7"+
		"\61\2\2\u01b7\u01b8\5:\36\2\u01b8\u01b9\7\62\2\2\u01b9\u01ba\b\21\1\2"+
		"\u01ba!\3\2\2\2\u01bb\u01bc\b\22\1\2\u01bc\u01bd\5X-\2\u01bd\u01be\5V"+
		",\2\u01be\u01c5\b\22\1\2\u01bf\u01c0\7\67\2\2\u01c0\u01c1\5V,\2\u01c1"+
		"\u01c2\b\22\1\2\u01c2\u01c4\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c4\u01c7\3"+
		"\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6#\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c8\u01c9\7\21\2\2\u01c9\u01ca\5(\25\2\u01ca\u01cb\5\26\f\2"+
		"\u01cb\u01d1\b\23\1\2\u01cc\u01cd\5&\24\2\u01cd\u01ce\b\23\1\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d7\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\5*"+
		"\26\2\u01d5\u01d6\b\23\1\2\u01d6\u01d8\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8%\3\2\2\2\u01d9\u01db\7:\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7\23\2\2\u01e0\u01e1\5(\25\2\u01e1"+
		"\u01e2\5\26\f\2\u01e2\u01e3\b\24\1\2\u01e3\'\3\2\2\2\u01e4\u01e5\7\61"+
		"\2\2\u01e5\u01e6\5\66\34\2\u01e6\u01e7\b\25\1\2\u01e7\u01e8\7\62\2\2\u01e8"+
		"\u01ed\3\2\2\2\u01e9\u01ea\5\66\34\2\u01ea\u01eb\b\25\1\2\u01eb\u01ed"+
		"\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ed)\3\2\2\2\u01ee"+
		"\u01f0\7:\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f5\7\22\2\2\u01f5\u01f6\5\26\f\2\u01f6\u01f7\b\26\1\2\u01f7+\3\2\2"+
		"\2\u01f8\u01f9\7\20\2\2\u01f9\u01fa\7\61\2\2\u01fa\u01fb\5\66\34\2\u01fb"+
		"\u01fc\b\27\1\2\u01fc\u01fd\7\62\2\2\u01fd-\3\2\2\2\u01fe\u01ff\b\30\1"+
		"\2\u01ff\u0200\5J&\2\u0200\u020b\b\30\1\2\u0201\u0207\78\2\2\u0202\u0203"+
		"\7\7\2\2\u0203\u0208\b\30\1\2\u0204\u0205\5V,\2\u0205\u0206\b\30\1\2\u0206"+
		"\u0208\3\2\2\2\u0207\u0202\3\2\2\2\u0207\u0204\3\2\2\2\u0208\u020a\3\2"+
		"\2\2\u0209\u0201\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7\61"+
		"\2\2\u020f\u0210\5\24\13\2\u0210\u0211\b\30\1\2\u0211\u0212\7\62\2\2\u0212"+
		"/\3\2\2\2\u0213\u0214\7\n\2\2\u0214\u0218\b\31\1\2\u0215\u0216\5\66\34"+
		"\2\u0216\u0217\b\31\1\2\u0217\u0219\3\2\2\2\u0218\u0215\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\61\3\2\2\2\u021a\u021b\5:\36\2\u021b\u021c\7/\2\2"+
		"\u021c\u021d\5\66\34\2\u021d\u021e\b\32\1\2\u021e\63\3\2\2\2\u021f\u022b"+
		"\b\33\1\2\u0220\u0221\5J&\2\u0221\u0222\b\33\1\2\u0222\u022c\3\2\2\2\u0223"+
		"\u0224\7\61\2\2\u0224\u0225\5\66\34\2\u0225\u0226\78\2\2\u0226\u0227\7"+
		"8\2\2\u0227\u0228\5\66\34\2\u0228\u0229\b\33\1\2\u0229\u022a\7\62\2\2"+
		"\u022a\u022c\3\2\2\2\u022b\u0220\3\2\2\2\u022b\u0223\3\2\2\2\u022c\u022d"+
		"\3\2\2\2\u022d\u022e\78\2\2\u022e\u022f\7-\2\2\u022f\u0230\7.\2\2\u0230"+
		"\u0231\7\36\2\2\u0231\u0232\5V,\2\u0232\u0233\b\33\1\2\u0233\u0234\7\36"+
		"\2\2\u0234\u0235\5\26\f\2\u0235\u0236\b\33\1\2\u0236\65\3\2\2\2\u0237"+
		"\u0238\58\35\2\u0238\u023d\b\34\1\2\u0239\u023a\7/\2\2\u023a\u023b\5\66"+
		"\34\2\u023b\u023c\b\34\1\2\u023c\u023e\3\2\2\2\u023d\u0239\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0246\3\2\2\2\u023f\u0240\78\2\2\u0240\u0241\7\r"+
		"\2\2\u0241\u0242\7\61\2\2\u0242\u0243\5:\36\2\u0243\u0244\7\62\2\2\u0244"+
		"\u0245\b\34\1\2\u0245\u0247\3\2\2\2\u0246\u023f\3\2\2\2\u0246\u0247\3"+
		"\2\2\2\u0247\67\3\2\2\2\u0248\u0249\5:\36\2\u0249\u0250\b\35\1\2\u024a"+
		"\u024b\7\"\2\2\u024b\u024c\58\35\2\u024c\u024d\7#\2\2\u024d\u024e\58\35"+
		"\2\u024e\u024f\b\35\1\2\u024f\u0251\3\2\2\2\u0250\u024a\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u02519\3\2\2\2\u0252\u0253\5<\37\2\u0253\u025a\b\36\1\2"+
		"\u0254\u0255\7 \2\2\u0255\u0256\5<\37\2\u0256\u0257\b\36\1\2\u0257\u0259"+
		"\3\2\2\2\u0258\u0254\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b;\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\5> \2\u025e"+
		"\u0265\b\37\1\2\u025f\u0260\7\37\2\2\u0260\u0261\5> \2\u0261\u0262\b\37"+
		"\1\2\u0262\u0264\3\2\2\2\u0263\u025f\3\2\2\2\u0264\u0267\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266=\3\2\2\2\u0267\u0265\3\2\2\2"+
		"\u0268\u0269\5@!\2\u0269\u0270\b \1\2\u026a\u026b\7\32\2\2\u026b\u026c"+
		"\5@!\2\u026c\u026d\b \1\2\u026d\u026f\3\2\2\2\u026e\u026a\3\2\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271?\3\2\2\2"+
		"\u0272\u0270\3\2\2\2\u0273\u0274\5B\"\2\u0274\u0281\b!\1\2\u0275\u027a"+
		"\b!\1\2\u0276\u0277\7\33\2\2\u0277\u027b\b!\1\2\u0278\u0279\7\34\2\2\u0279"+
		"\u027b\b!\1\2\u027a\u0276\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u027d\5B\"\2\u027d\u027e\b!\1\2\u027e\u0280\3\2\2\2\u027f\u0275"+
		"\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"A\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\5D#\2\u0285\u0292\b\"\1\2\u0286"+
		"\u028b\b\"\1\2\u0287\u0288\7\24\2\2\u0288\u028c\b\"\1\2\u0289\u028a\7"+
		"\25\2\2\u028a\u028c\b\"\1\2\u028b\u0287\3\2\2\2\u028b\u0289\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\5D#\2\u028e\u028f\b\"\1\2\u028f\u0291\3\2\2"+
		"\2\u0290\u0286\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293C\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\5F$\2\u0296\u02a3"+
		"\b#\1\2\u0297\u029c\b#\1\2\u0298\u0299\7\26\2\2\u0299\u029d\b#\1\2\u029a"+
		"\u029b\7\27\2\2\u029b\u029d\b#\1\2\u029c\u0298\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u029f\5F$\2\u029f\u02a0\b#\1\2\u02a0\u02a2"+
		"\3\2\2\2\u02a1\u0297\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4E\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02ab\b$\1\2\u02a7"+
		"\u02a8\7!\2\2\u02a8\u02ac\b$\1\2\u02a9\u02aa\7\25\2\2\u02aa\u02ac\b$\1"+
		"\2\u02ab\u02a7\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae"+
		"\5F$\2\u02ae\u02af\b$\1\2\u02af\u02b4\3\2\2\2\u02b0\u02b1\5H%\2\u02b1"+
		"\u02b2\b$\1\2\u02b2\u02b4\3\2\2\2\u02b3\u02a6\3\2\2\2\u02b3\u02b0\3\2"+
		"\2\2\u02b4G\3\2\2\2\u02b5\u02b6\5J&\2\u02b6\u02be\b%\1\2\u02b7\u02b8\7"+
		"\30\2\2\u02b8\u02bc\b%\1\2\u02b9\u02ba\7\31\2\2\u02ba\u02bc\b%\1\2\u02bb"+
		"\u02b7\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\b%"+
		"\1\2\u02be\u02bb\3\2\2\2\u02be\u02bf\3\2\2\2\u02bfI\3\2\2\2\u02c0\u02c1"+
		"\b&\1\2\u02c1\u02c2\5L\'\2\u02c2\u02d4\b&\1\2\u02c3\u02c4\7\61\2\2\u02c4"+
		"\u02c5\5\24\13\2\u02c5\u02c6\b&\1\2\u02c6\u02c7\7\62\2\2\u02c7\u02d3\3"+
		"\2\2\2\u02c8\u02d0\78\2\2\u02c9\u02ca\5V,\2\u02ca\u02cb\b&\1\2\u02cb\u02d1"+
		"\3\2\2\2\u02cc\u02cd\7\b\2\2\u02cd\u02d1\b&\1\2\u02ce\u02cf\7\7\2\2\u02cf"+
		"\u02d1\b&\1\2\u02d0\u02c9\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02c3\3\2\2\2\u02d2\u02c8\3\2\2\2\u02d3"+
		"\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02e2\3\2"+
		"\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\78\2\2\u02d8\u02d9\5V,\2\u02d9\u02da"+
		"\b&\1\2\u02da\u02e1\3\2\2\2\u02db\u02dc\7\63\2\2\u02dc\u02dd\5\66\34\2"+
		"\u02dd\u02de\b&\1\2\u02de\u02df\7\64\2\2\u02df\u02e1\3\2\2\2\u02e0\u02d7"+
		"\3\2\2\2\u02e0\u02db\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3K\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\7\t\2\2"+
		"\u02e6\u02f9\b\'\1\2\u02e7\u02e8\5T+\2\u02e8\u02e9\b\'\1\2\u02e9\u02f9"+
		"\3\2\2\2\u02ea\u02eb\5P)\2\u02eb\u02ec\b\'\1\2\u02ec\u02f9\3\2\2\2\u02ed"+
		"\u02ee\5V,\2\u02ee\u02ef\b\'\1\2\u02ef\u02f9\3\2\2\2\u02f0\u02f1\5N(\2"+
		"\u02f1\u02f2\b\'\1\2\u02f2\u02f9\3\2\2\2\u02f3\u02f4\7\61\2\2\u02f4\u02f5"+
		"\5\66\34\2\u02f5\u02f6\7\62\2\2\u02f6\u02f7\b\'\1\2\u02f7\u02f9\3\2\2"+
		"\2\u02f8\u02e5\3\2\2\2\u02f8\u02e7\3\2\2\2\u02f8\u02ea\3\2\2\2\u02f8\u02ed"+
		"\3\2\2\2\u02f8\u02f0\3\2\2\2\u02f8\u02f3\3\2\2\2\u02f9M\3\2\2\2\u02fa"+
		"\u02fb\b(\1\2\u02fb\u02fc\7,\2\2\u02fc\u02fd\78\2\2\u02fd\u02fe\7\b\2"+
		"\2\u02fe\u030d\7\61\2\2\u02ff\u0300\7\61\2\2\u0300\u0301\5:\36\2\u0301"+
		"\u0308\b(\1\2\u0302\u0303\7\67\2\2\u0303\u0304\5:\36\2\u0304\u0305\b("+
		"\1\2\u0305\u0307\3\2\2\2\u0306\u0302\3\2\2\2\u0307\u030a\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030b\u030c\7\62\2\2\u030c\u030e\3\2\2\2\u030d\u02ff\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\7\62\2\2\u0310\u0311\b"+
		"(\1\2\u0311O\3\2\2\2\u0312\u0313\5R*\2\u0313\u0314\b)\1\2\u0314\u0319"+
		"\3\2\2\2\u0315\u0316\5`\61\2\u0316\u0317\b)\1\2\u0317\u0319\3\2\2\2\u0318"+
		"\u0312\3\2\2\2\u0318\u0315\3\2\2\2\u0319Q\3\2\2\2\u031a\u031b\7$\2\2\u031b"+
		"\u031f\b*\1\2\u031c\u031d\7%\2\2\u031d\u031f\b*\1\2\u031e\u031a\3\2\2"+
		"\2\u031e\u031c\3\2\2\2\u031fS\3\2\2\2\u0320\u0321\7=\2\2\u0321\u0322\b"+
		"+\1\2\u0322U\3\2\2\2\u0323\u0324\7<\2\2\u0324\u0325\b,\1\2\u0325W\3\2"+
		"\2\2\u0326\u0327\7)\2\2\u0327\u0337\b-\1\2\u0328\u0329\7*\2\2\u0329\u0337"+
		"\b-\1\2\u032a\u032b\5Z.\2\u032b\u032c\b-\1\2\u032c\u0337\3\2\2\2\u032d"+
		"\u032e\5\\/\2\u032e\u032f\b-\1\2\u032f\u0337\3\2\2\2\u0330\u0331\5^\60"+
		"\2\u0331\u0332\b-\1\2\u0332\u0337\3\2\2\2\u0333\u0334\5T+\2\u0334\u0335"+
		"\b-\1\2\u0335\u0337\3\2\2\2\u0336\u0326\3\2\2\2\u0336\u0328\3\2\2\2\u0336"+
		"\u032a\3\2\2\2\u0336\u032d\3\2\2\2\u0336\u0330\3\2\2\2\u0336\u0333\3\2"+
		"\2\2\u0337Y\3\2\2\2\u0338\u0340\b.\1\2\u0339\u033a\7)\2\2\u033a\u0341"+
		"\b.\1\2\u033b\u033c\7*\2\2\u033c\u0341\b.\1\2\u033d\u033e\5T+\2\u033e"+
		"\u033f\b.\1\2\u033f\u0341\3\2\2\2\u0340\u0339\3\2\2\2\u0340\u033b\3\2"+
		"\2\2\u0340\u033d\3\2\2\2\u0341\u0347\3\2\2\2\u0342\u0343\7\63\2\2\u0343"+
		"\u0344\5\66\34\2\u0344\u0345\b.\1\2\u0345\u0346\7\64\2\2\u0346\u0348\3"+
		"\2\2\2\u0347\u0342\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\b.\1\2\u034c[\3\2\2\2\u034d"+
		"\u034e\b/\1\2\u034e\u034f\7+\2\2\u034f\u035d\7\34\2\2\u0350\u0351\7\13"+
		"\2\2\u0351\u035e\b/\1\2\u0352\u0353\5X-\2\u0353\u035a\b/\1\2\u0354\u0355"+
		"\7\67\2\2\u0355\u0356\5X-\2\u0356\u0357\b/\1\2\u0357\u0359\3\2\2\2\u0358"+
		"\u0354\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2"+
		"\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u0350\3\2\2\2\u035d"+
		"\u0352\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0365\7\35\2\2\u0360\u0361\5"+
		"X-\2\u0361\u0362\b/\1\2\u0362\u0366\3\2\2\2\u0363\u0364\7\13\2\2\u0364"+
		"\u0366\b/\1\2\u0365\u0360\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u0367\3\2"+
		"\2\2\u0367\u0368\7\33\2\2\u0368]\3\2\2\2\u0369\u036a\7,\2\2\u036a\u036b"+
		"\7\34\2\2\u036b\u036c\7)\2\2\u036c\u036d\7\33\2\2\u036d\u036e\b\60\1\2"+
		"\u036e_\3\2\2\2\u036f\u0370\7;\2\2\u0370\u0371\b\61\1\2\u0371a\3\2\2\2"+
		"Uemw}\u0084\u008a\u0095\u00a2\u00a7\u00ae\u00b5\u00bc\u00c1\u00ca\u00d3"+
		"\u00d8\u00dd\u00e5\u00ec\u00f7\u00fe\u0102\u010a\u010e\u0118\u0120\u0122"+
		"\u0124\u0132\u0135\u013f\u0142\u0153\u0156\u015e\u0163\u016b\u0172\u0176"+
		"\u0196\u01ad\u01c5\u01d1\u01d7\u01dc\u01ec\u01f1\u0207\u020b\u0218\u022b"+
		"\u023d\u0246\u0250\u025a\u0265\u0270\u027a\u0281\u028b\u0292\u029c\u02a3"+
		"\u02ab\u02b3\u02bb\u02be\u02d0\u02d2\u02d4\u02e0\u02e2\u02f8\u0308\u030d"+
		"\u0318\u031e\u0336\u0340\u0349\u035a\u035d\u0365";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}