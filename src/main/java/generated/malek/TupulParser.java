// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.3
package generated.malek;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TupulParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, INTEGER=22, FLOAT=23, DOUBLE=24, 
		PLUS_EQUALS=25, MINUS_EQUALS=26, DOUBLE_EQUALS_LIST=27, EQUALS_LIT=28, 
		RETURN_LIT=29, SEMICOLON=30, LEFT_PAREN=31, RIGHT_PAREN=32, LEFT_CURLY=33, 
		RIGHT_CURLY=34, LEFT_SQUARE=35, RIGHT_SQUARE=36, LEFT_ANGLE=37, RIGHT_ANGLE=38, 
		ADD_OP=39, MULTI_OP=40, DIV_OP=41, SUB_OP=42, SINGLE_OR=43, SINGLE_AND=44, 
		HASHTAG=45, POINTER=46, COMMA=47, DOUBLE_OR=48, DOUBLE_AND=49, THIS_KEYWORD=50, 
		INT_TYPE=51, FLOAT_TYPE=52, DOUBLE_TYPE=53, CHAR_TYPE=54, VOID_TYPE=55, 
		BOOL_TYPE=56, STRING_TYPE=57, NULL_TYPE=58, FALSE_KEYWORD=59, TRUE_KEYWORD=60, 
		UNION_KEYWORD=61, INSTANCEOF_KEYWORD=62, SUBSET_KEYWORD=63, STRICT_SUBSET_KEYWORD=64, 
		SUPERSET_KEYWORD=65, TYPE=66, INTERFACE=67, EXTENDS=68, OVERRIDE=69, IMPLEMENT=70, 
		IMPORT=71, PUBLIC=72, PRIVATE=73, CHAR=74, STRING=75, WHITESPACE=76, IDENTIFIER=77;
	public static final int
		RULE_allMultipleLinkedFiles = 0, RULE_file = 1, RULE_declarePackage = 2, 
		RULE_importSomething = 3, RULE_interfaceDeclaration = 4, RULE_interfaceExtensions = 5, 
		RULE_interfaceExtensionName = 6, RULE_interfaceCodeBlock = 7, RULE_interfaceFunctionDeclaration = 8, 
		RULE_interfaceAbstractFuncDec = 9, RULE_typeDeclaration = 10, RULE_typeCodeBlock = 11, 
		RULE_typeFunctionDeclaration = 12, RULE_universalFunctionPost = 13, RULE_functionWithinFunctionDec = 14, 
		RULE_universalFunctionModifiers = 15, RULE_typeWithVoid = 16, RULE_functionDecArguments = 17, 
		RULE_functionCallArguments = 18, RULE_universalPostIdentifierFuncDec = 19, 
		RULE_functionTagOperation = 20, RULE_functionTagAppend = 21, RULE_functionTagRemove = 22, 
		RULE_functionTagEquals = 23, RULE_functionTagNotEquals = 24, RULE_tagID = 25, 
		RULE_functionCodeBlock = 26, RULE_functionCall = 27, RULE_whileLoop = 28, 
		RULE_forLoop = 29, RULE_specialForLoop = 30, RULE_chainedIfStatement = 31, 
		RULE_ifStatement = 32, RULE_elseStatement = 33, RULE_elseIfStatement = 34, 
		RULE_conditional = 35, RULE_type = 36, RULE_finalValue = 37, RULE_varID = 38, 
		RULE_intermediateValue = 39, RULE_variableDeclaration = 40, RULE_singleVarDec = 41, 
		RULE_multiVarDec = 42, RULE_singleVarAssignment = 43, RULE_multiVarAssignment = 44, 
		RULE_variableSwap = 45, RULE_variableIncrement = 46, RULE_variableDecrement = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"allMultipleLinkedFiles", "file", "declarePackage", "importSomething", 
			"interfaceDeclaration", "interfaceExtensions", "interfaceExtensionName", 
			"interfaceCodeBlock", "interfaceFunctionDeclaration", "interfaceAbstractFuncDec", 
			"typeDeclaration", "typeCodeBlock", "typeFunctionDeclaration", "universalFunctionPost", 
			"functionWithinFunctionDec", "universalFunctionModifiers", "typeWithVoid", 
			"functionDecArguments", "functionCallArguments", "universalPostIdentifierFuncDec", 
			"functionTagOperation", "functionTagAppend", "functionTagRemove", "functionTagEquals", 
			"functionTagNotEquals", "tagID", "functionCodeBlock", "functionCall", 
			"whileLoop", "forLoop", "specialForLoop", "chainedIfStatement", "ifStatement", 
			"elseStatement", "elseIfStatement", "conditional", "type", "finalValue", 
			"varID", "intermediateValue", "variableDeclaration", "singleVarDec", 
			"multiVarDec", "singleVarAssignment", "multiVarAssignment", "variableSwap", 
			"variableIncrement", "variableDecrement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'file'", "'.'", "'::'", "'fluid'", "'const'", "'fixed'", "'dirty'", 
			"'tidy'", "'pure'", "'!='", "'while'", "'for'", "':'", "'if'", "'else'", 
			"'else if'", "'<='", "'>='", "'<->'", "'++'", "'--'", null, null, null, 
			"'+='", "'-='", "'=='", "'='", "'return'", "';'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'<'", "'>'", "'+'", "'*'", "'/'", "'-'", "'|'", 
			"'&'", "'#'", "'@'", "','", "'||'", "'&&'", "'this'", "'int'", "'float'", 
			"'double'", "'char'", "'void'", "'bool'", "'string'", "'null'", "'false'", 
			"'true'", "'union'", "'instanceof'", "'subset'", "'strictsubset'", "'superset'", 
			"'type'", "'interface'", "'extends'", "'override'", "'implement'", "'import'", 
			"'public'", "'private'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "INTEGER", 
			"FLOAT", "DOUBLE", "PLUS_EQUALS", "MINUS_EQUALS", "DOUBLE_EQUALS_LIST", 
			"EQUALS_LIT", "RETURN_LIT", "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", 
			"LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_ANGLE", 
			"RIGHT_ANGLE", "ADD_OP", "MULTI_OP", "DIV_OP", "SUB_OP", "SINGLE_OR", 
			"SINGLE_AND", "HASHTAG", "POINTER", "COMMA", "DOUBLE_OR", "DOUBLE_AND", 
			"THIS_KEYWORD", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", 
			"VOID_TYPE", "BOOL_TYPE", "STRING_TYPE", "NULL_TYPE", "FALSE_KEYWORD", 
			"TRUE_KEYWORD", "UNION_KEYWORD", "INSTANCEOF_KEYWORD", "SUBSET_KEYWORD", 
			"STRICT_SUBSET_KEYWORD", "SUPERSET_KEYWORD", "TYPE", "INTERFACE", "EXTENDS", 
			"OVERRIDE", "IMPLEMENT", "IMPORT", "PUBLIC", "PRIVATE", "CHAR", "STRING", 
			"WHITESPACE", "IDENTIFIER"
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
	public String getGrammarFileName() { return "Tupul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TupulParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AllMultipleLinkedFilesContext extends ParserRuleContext {
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public AllMultipleLinkedFilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allMultipleLinkedFiles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterAllMultipleLinkedFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitAllMultipleLinkedFiles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitAllMultipleLinkedFiles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllMultipleLinkedFilesContext allMultipleLinkedFiles() throws RecognitionException {
		AllMultipleLinkedFilesContext _localctx = new AllMultipleLinkedFilesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_allMultipleLinkedFiles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				file();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class FileContext extends ParserRuleContext {
		public DeclarePackageContext declarePackage() {
			return getRuleContext(DeclarePackageContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ImportSomethingContext> importSomething() {
			return getRuleContexts(ImportSomethingContext.class);
		}
		public ImportSomethingContext importSomething(int i) {
			return getRuleContext(ImportSomethingContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			declarePackage();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(102);
				importSomething();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(108);
				typeDeclaration();
				}
				break;
			case INTERFACE:
				{
				setState(109);
				interfaceDeclaration();
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

	public static class DeclarePackageContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public DeclarePackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarePackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterDeclarePackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitDeclarePackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitDeclarePackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarePackageContext declarePackage() throws RecognitionException {
		DeclarePackageContext _localctx = new DeclarePackageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarePackage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__0);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(IDENTIFIER);
					setState(114);
					match(T__1);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(SEMICOLON);
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

	public static class ImportSomethingContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(TupulParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public ImportSomethingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSomething; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterImportSomething(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitImportSomething(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitImportSomething(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSomethingContext importSomething() throws RecognitionException {
		ImportSomethingContext _localctx = new ImportSomethingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSomething);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IMPORT);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(IDENTIFIER);
					setState(125);
					match(T__1);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(SEMICOLON);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(TupulParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public InterfaceCodeBlockContext interfaceCodeBlock() {
			return getRuleContext(InterfaceCodeBlockContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(TupulParser.EXTENDS, 0); }
		public InterfaceExtensionsContext interfaceExtensions() {
			return getRuleContext(InterfaceExtensionsContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(INTERFACE);
			setState(135);
			match(IDENTIFIER);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(136);
				match(EXTENDS);
				setState(137);
				interfaceExtensions();
				}
			}

			setState(140);
			interfaceCodeBlock();
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

	public static class InterfaceExtensionsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public List<InterfaceExtensionNameContext> interfaceExtensionName() {
			return getRuleContexts(InterfaceExtensionNameContext.class);
		}
		public InterfaceExtensionNameContext interfaceExtensionName(int i) {
			return getRuleContext(InterfaceExtensionNameContext.class,i);
		}
		public InterfaceExtensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceExtensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterInterfaceExtensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitInterfaceExtensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitInterfaceExtensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceExtensionsContext interfaceExtensions() throws RecognitionException {
		InterfaceExtensionsContext _localctx = new InterfaceExtensionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceExtensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENTIFIER);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				interfaceExtensionName();
				}
				}
				setState(148);
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

	public static class InterfaceExtensionNameContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TupulParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public InterfaceExtensionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceExtensionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterInterfaceExtensionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitInterfaceExtensionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitInterfaceExtensionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceExtensionNameContext interfaceExtensionName() throws RecognitionException {
		InterfaceExtensionNameContext _localctx = new InterfaceExtensionNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceExtensionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(COMMA);
			setState(150);
			match(IDENTIFIER);
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

	public static class InterfaceCodeBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<InterfaceCodeBlockContext> interfaceCodeBlock() {
			return getRuleContexts(InterfaceCodeBlockContext.class);
		}
		public InterfaceCodeBlockContext interfaceCodeBlock(int i) {
			return getRuleContext(InterfaceCodeBlockContext.class,i);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public InterfaceFunctionDeclarationContext interfaceFunctionDeclaration() {
			return getRuleContext(InterfaceFunctionDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public InterfaceAbstractFuncDecContext interfaceAbstractFuncDec() {
			return getRuleContext(InterfaceAbstractFuncDecContext.class,0);
		}
		public InterfaceCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCodeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterInterfaceCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitInterfaceCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitInterfaceCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceCodeBlockContext interfaceCodeBlock() throws RecognitionException {
		InterfaceCodeBlockContext _localctx = new InterfaceCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceCodeBlock);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(LEFT_CURLY);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (LEFT_PAREN - 31)) | (1L << (LEFT_CURLY - 31)) | (1L << (INT_TYPE - 31)) | (1L << (FLOAT_TYPE - 31)) | (1L << (DOUBLE_TYPE - 31)) | (1L << (CHAR_TYPE - 31)) | (1L << (VOID_TYPE - 31)) | (1L << (STRING_TYPE - 31)) | (1L << (TYPE - 31)) | (1L << (INTERFACE - 31)) | (1L << (OVERRIDE - 31)) | (1L << (IMPLEMENT - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					{
					setState(153);
					interfaceCodeBlock();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				variableDeclaration();
				setState(161);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				interfaceFunctionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				typeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				interfaceAbstractFuncDec();
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

	public static class InterfaceFunctionDeclarationContext extends ParserRuleContext {
		public UniversalFunctionModifiersContext universalFunctionModifiers() {
			return getRuleContext(UniversalFunctionModifiersContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public UniversalFunctionPostContext universalFunctionPost() {
			return getRuleContext(UniversalFunctionPostContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(TupulParser.OVERRIDE, 0); }
		public TerminalNode IMPLEMENT() { return getToken(TupulParser.IMPLEMENT, 0); }
		public InterfaceFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterInterfaceFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitInterfaceFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitInterfaceFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFunctionDeclarationContext interfaceFunctionDeclaration() throws RecognitionException {
		InterfaceFunctionDeclarationContext _localctx = new InterfaceFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interfaceFunctionDeclaration);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				universalFunctionModifiers();
				setState(171);
				match(IDENTIFIER);
				setState(172);
				match(T__2);
				setState(173);
				universalFunctionPost();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				universalFunctionPost();
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

	public static class InterfaceAbstractFuncDecContext extends ParserRuleContext {
		public UniversalFunctionModifiersContext universalFunctionModifiers() {
			return getRuleContext(UniversalFunctionModifiersContext.class,0);
		}
		public UniversalPostIdentifierFuncDecContext universalPostIdentifierFuncDec() {
			return getRuleContext(UniversalPostIdentifierFuncDecContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public InterfaceAbstractFuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceAbstractFuncDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterInterfaceAbstractFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitInterfaceAbstractFuncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitInterfaceAbstractFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceAbstractFuncDecContext interfaceAbstractFuncDec() throws RecognitionException {
		InterfaceAbstractFuncDecContext _localctx = new InterfaceAbstractFuncDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceAbstractFuncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			universalFunctionModifiers();
			setState(179);
			universalPostIdentifierFuncDec();
			setState(180);
			match(SEMICOLON);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(TupulParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TypeCodeBlockContext typeCodeBlock() {
			return getRuleContext(TypeCodeBlockContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(TupulParser.EXTENDS, 0); }
		public InterfaceExtensionsContext interfaceExtensions() {
			return getRuleContext(InterfaceExtensionsContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(TYPE);
			setState(183);
			match(IDENTIFIER);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(184);
				match(EXTENDS);
				setState(185);
				interfaceExtensions();
				}
			}

			setState(188);
			typeCodeBlock();
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

	public static class TypeCodeBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<TypeCodeBlockContext> typeCodeBlock() {
			return getRuleContexts(TypeCodeBlockContext.class);
		}
		public TypeCodeBlockContext typeCodeBlock(int i) {
			return getRuleContext(TypeCodeBlockContext.class,i);
		}
		public TypeFunctionDeclarationContext typeFunctionDeclaration() {
			return getRuleContext(TypeFunctionDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public TypeCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCodeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterTypeCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitTypeCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitTypeCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCodeBlockContext typeCodeBlock() throws RecognitionException {
		TypeCodeBlockContext _localctx = new TypeCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeCodeBlock);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(LEFT_CURLY);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (LEFT_PAREN - 31)) | (1L << (LEFT_CURLY - 31)) | (1L << (INT_TYPE - 31)) | (1L << (FLOAT_TYPE - 31)) | (1L << (DOUBLE_TYPE - 31)) | (1L << (CHAR_TYPE - 31)) | (1L << (VOID_TYPE - 31)) | (1L << (STRING_TYPE - 31)) | (1L << (TYPE - 31)) | (1L << (INTERFACE - 31)) | (1L << (OVERRIDE - 31)) | (1L << (IMPLEMENT - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					{
					setState(191);
					typeCodeBlock();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				typeFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				typeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				variableDeclaration();
				setState(202);
				match(SEMICOLON);
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

	public static class TypeFunctionDeclarationContext extends ParserRuleContext {
		public UniversalFunctionModifiersContext universalFunctionModifiers() {
			return getRuleContext(UniversalFunctionModifiersContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public UniversalFunctionPostContext universalFunctionPost() {
			return getRuleContext(UniversalFunctionPostContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(TupulParser.OVERRIDE, 0); }
		public TerminalNode IMPLEMENT() { return getToken(TupulParser.IMPLEMENT, 0); }
		public TypeFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterTypeFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitTypeFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitTypeFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFunctionDeclarationContext typeFunctionDeclaration() throws RecognitionException {
		TypeFunctionDeclarationContext _localctx = new TypeFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeFunctionDeclaration);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				universalFunctionModifiers();
				setState(208);
				match(IDENTIFIER);
				setState(209);
				match(T__2);
				setState(210);
				universalFunctionPost();
				}
				break;
			case LEFT_PAREN:
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case STRING_TYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				universalFunctionModifiers();
				setState(213);
				universalFunctionPost();
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

	public static class UniversalFunctionPostContext extends ParserRuleContext {
		public UniversalPostIdentifierFuncDecContext universalPostIdentifierFuncDec() {
			return getRuleContext(UniversalPostIdentifierFuncDecContext.class,0);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public UniversalFunctionPostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalFunctionPost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterUniversalFunctionPost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitUniversalFunctionPost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitUniversalFunctionPost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalFunctionPostContext universalFunctionPost() throws RecognitionException {
		UniversalFunctionPostContext _localctx = new UniversalFunctionPostContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_universalFunctionPost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			universalPostIdentifierFuncDec();
			setState(218);
			functionCodeBlock();
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

	public static class FunctionWithinFunctionDecContext extends ParserRuleContext {
		public UniversalFunctionModifiersContext universalFunctionModifiers() {
			return getRuleContext(UniversalFunctionModifiersContext.class,0);
		}
		public UniversalPostIdentifierFuncDecContext universalPostIdentifierFuncDec() {
			return getRuleContext(UniversalPostIdentifierFuncDecContext.class,0);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public FunctionWithinFunctionDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionWithinFunctionDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionWithinFunctionDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionWithinFunctionDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionWithinFunctionDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionWithinFunctionDecContext functionWithinFunctionDec() throws RecognitionException {
		FunctionWithinFunctionDecContext _localctx = new FunctionWithinFunctionDecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionWithinFunctionDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			universalFunctionModifiers();
			setState(221);
			universalPostIdentifierFuncDec();
			setState(222);
			functionCodeBlock();
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

	public static class UniversalFunctionModifiersContext extends ParserRuleContext {
		public List<TypeWithVoidContext> typeWithVoid() {
			return getRuleContexts(TypeWithVoidContext.class);
		}
		public TypeWithVoidContext typeWithVoid(int i) {
			return getRuleContext(TypeWithVoidContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(TupulParser.COMMA, 0); }
		public TerminalNode PUBLIC() { return getToken(TupulParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(TupulParser.PRIVATE, 0); }
		public UniversalFunctionModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalFunctionModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterUniversalFunctionModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitUniversalFunctionModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitUniversalFunctionModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalFunctionModifiersContext universalFunctionModifiers() throws RecognitionException {
		UniversalFunctionModifiersContext _localctx = new UniversalFunctionModifiersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_universalFunctionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case STRING_TYPE:
			case IDENTIFIER:
				{
				setState(224);
				typeWithVoid();
				}
				break;
			case LEFT_PAREN:
				{
				setState(225);
				match(LEFT_PAREN);
				setState(226);
				typeWithVoid();
				{
				setState(227);
				match(COMMA);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (VOID_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
					{
					{
					setState(228);
					typeWithVoid();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(234);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(241);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class TypeWithVoidContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID_TYPE() { return getToken(TupulParser.VOID_TYPE, 0); }
		public TypeWithVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeWithVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterTypeWithVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitTypeWithVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitTypeWithVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeWithVoidContext typeWithVoid() throws RecognitionException {
		TypeWithVoidContext _localctx = new TypeWithVoidContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeWithVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case IDENTIFIER:
				{
				setState(247);
				type();
				}
				break;
			case VOID_TYPE:
				{
				setState(248);
				match(VOID_TYPE);
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

	public static class FunctionDecArgumentsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TupulParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TupulParser.COMMA, i);
		}
		public FunctionDecArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionDecArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionDecArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionDecArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDecArgumentsContext functionDecArguments() throws RecognitionException {
		FunctionDecArgumentsContext _localctx = new FunctionDecArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDecArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			type();
			setState(252);
			match(IDENTIFIER);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				type();
				setState(255);
				match(IDENTIFIER);
				}
				}
				setState(261);
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TupulParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TupulParser.COMMA, i);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDENTIFIER);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				match(IDENTIFIER);
				}
				}
				setState(269);
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

	public static class UniversalPostIdentifierFuncDecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionDecArgumentsContext functionDecArguments() {
			return getRuleContext(FunctionDecArgumentsContext.class,0);
		}
		public TerminalNode LEFT_ANGLE() { return getToken(TupulParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(TupulParser.RIGHT_ANGLE, 0); }
		public List<FunctionTagOperationContext> functionTagOperation() {
			return getRuleContexts(FunctionTagOperationContext.class);
		}
		public FunctionTagOperationContext functionTagOperation(int i) {
			return getRuleContext(FunctionTagOperationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TupulParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TupulParser.SEMICOLON, i);
		}
		public UniversalPostIdentifierFuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalPostIdentifierFuncDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterUniversalPostIdentifierFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitUniversalPostIdentifierFuncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitUniversalPostIdentifierFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalPostIdentifierFuncDecContext universalPostIdentifierFuncDec() throws RecognitionException {
		UniversalPostIdentifierFuncDecContext _localctx = new UniversalPostIdentifierFuncDecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_universalPostIdentifierFuncDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(IDENTIFIER);
			setState(271);
			match(LEFT_PAREN);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
				{
				setState(272);
				functionDecArguments();
				}
			}

			setState(275);
			match(RIGHT_PAREN);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANGLE) {
				{
				setState(276);
				match(LEFT_ANGLE);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (INTEGER - 22)) | (1L << (FLOAT - 22)) | (1L << (DOUBLE - 22)) | (1L << (LEFT_PAREN - 22)) | (1L << (THIS_KEYWORD - 22)) | (1L << (CHAR - 22)) | (1L << (STRING - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
					{
					{
					setState(277);
					functionTagOperation();
					setState(278);
					match(SEMICOLON);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(RIGHT_ANGLE);
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

	public static class FunctionTagOperationContext extends ParserRuleContext {
		public FunctionTagAppendContext functionTagAppend() {
			return getRuleContext(FunctionTagAppendContext.class,0);
		}
		public FunctionTagRemoveContext functionTagRemove() {
			return getRuleContext(FunctionTagRemoveContext.class,0);
		}
		public FunctionTagEqualsContext functionTagEquals() {
			return getRuleContext(FunctionTagEqualsContext.class,0);
		}
		public FunctionTagOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTagOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionTagOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionTagOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionTagOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTagOperationContext functionTagOperation() throws RecognitionException {
		FunctionTagOperationContext _localctx = new FunctionTagOperationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionTagOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(288);
				functionTagAppend();
				}
				break;
			case 2:
				{
				setState(289);
				functionTagRemove();
				}
				break;
			case 3:
				{
				setState(290);
				functionTagEquals();
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

	public static class FunctionTagAppendContext extends ParserRuleContext {
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode PLUS_EQUALS() { return getToken(TupulParser.PLUS_EQUALS, 0); }
		public TagIDContext tagID() {
			return getRuleContext(TagIDContext.class,0);
		}
		public FunctionTagAppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTagAppend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionTagAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionTagAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionTagAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTagAppendContext functionTagAppend() throws RecognitionException {
		FunctionTagAppendContext _localctx = new FunctionTagAppendContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionTagAppend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			finalValue();
			setState(294);
			match(PLUS_EQUALS);
			setState(295);
			tagID();
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

	public static class FunctionTagRemoveContext extends ParserRuleContext {
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode MINUS_EQUALS() { return getToken(TupulParser.MINUS_EQUALS, 0); }
		public TagIDContext tagID() {
			return getRuleContext(TagIDContext.class,0);
		}
		public FunctionTagRemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTagRemove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionTagRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionTagRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionTagRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTagRemoveContext functionTagRemove() throws RecognitionException {
		FunctionTagRemoveContext _localctx = new FunctionTagRemoveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionTagRemove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			finalValue();
			setState(298);
			match(MINUS_EQUALS);
			setState(299);
			tagID();
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

	public static class FunctionTagEqualsContext extends ParserRuleContext {
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode DOUBLE_EQUALS_LIST() { return getToken(TupulParser.DOUBLE_EQUALS_LIST, 0); }
		public TagIDContext tagID() {
			return getRuleContext(TagIDContext.class,0);
		}
		public FunctionTagEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTagEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionTagEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionTagEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionTagEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTagEqualsContext functionTagEquals() throws RecognitionException {
		FunctionTagEqualsContext _localctx = new FunctionTagEqualsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionTagEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			finalValue();
			setState(302);
			match(DOUBLE_EQUALS_LIST);
			setState(303);
			tagID();
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

	public static class FunctionTagNotEqualsContext extends ParserRuleContext {
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TagIDContext tagID() {
			return getRuleContext(TagIDContext.class,0);
		}
		public FunctionTagNotEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTagNotEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionTagNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionTagNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionTagNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTagNotEqualsContext functionTagNotEquals() throws RecognitionException {
		FunctionTagNotEqualsContext _localctx = new FunctionTagNotEqualsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionTagNotEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			finalValue();
			setState(306);
			match(T__9);
			setState(307);
			tagID();
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

	public static class TagIDContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public TerminalNode HASHTAG() { return getToken(TupulParser.HASHTAG, 0); }
		public TagIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterTagID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitTagID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitTagID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagIDContext tagID() throws RecognitionException {
		TagIDContext _localctx = new TagIDContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tagID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDENTIFIER);
			setState(310);
			match(HASHTAG);
			setState(311);
			match(IDENTIFIER);
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

	public static class FunctionCodeBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<FunctionCodeBlockContext> functionCodeBlock() {
			return getRuleContexts(FunctionCodeBlockContext.class);
		}
		public FunctionCodeBlockContext functionCodeBlock(int i) {
			return getRuleContext(FunctionCodeBlockContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public TerminalNode RETURN_LIT() { return getToken(TupulParser.RETURN_LIT, 0); }
		public List<FinalValueContext> finalValue() {
			return getRuleContexts(FinalValueContext.class);
		}
		public FinalValueContext finalValue(int i) {
			return getRuleContext(FinalValueContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TupulParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TupulParser.COMMA, i);
		}
		public FunctionTagOperationContext functionTagOperation() {
			return getRuleContext(FunctionTagOperationContext.class,0);
		}
		public ChainedIfStatementContext chainedIfStatement() {
			return getRuleContext(ChainedIfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public SingleVarDecContext singleVarDec() {
			return getRuleContext(SingleVarDecContext.class,0);
		}
		public SingleVarAssignmentContext singleVarAssignment() {
			return getRuleContext(SingleVarAssignmentContext.class,0);
		}
		public MultiVarAssignmentContext multiVarAssignment() {
			return getRuleContext(MultiVarAssignmentContext.class,0);
		}
		public VariableSwapContext variableSwap() {
			return getRuleContext(VariableSwapContext.class,0);
		}
		public VariableIncrementContext variableIncrement() {
			return getRuleContext(VariableIncrementContext.class,0);
		}
		public VariableDecrementContext variableDecrement() {
			return getRuleContext(VariableDecrementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public FunctionWithinFunctionDecContext functionWithinFunctionDec() {
			return getRuleContext(FunctionWithinFunctionDecContext.class,0);
		}
		public FunctionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCodeBlockContext functionCodeBlock() throws RecognitionException {
		FunctionCodeBlockContext _localctx = new FunctionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCodeBlock);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(LEFT_CURLY);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << RETURN_LIT) | (1L << SEMICOLON) | (1L << LEFT_PAREN) | (1L << LEFT_CURLY) | (1L << THIS_KEYWORD) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << STRING_TYPE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TYPE - 66)) | (1L << (INTERFACE - 66)) | (1L << (CHAR - 66)) | (1L << (STRING - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(314);
					functionCodeBlock();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				functionCall();
				setState(322);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(RETURN_LIT);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(325);
					finalValue();
					}
					break;
				case 2:
					{
					setState(326);
					match(LEFT_PAREN);
					setState(327);
					finalValue();
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(328);
						match(COMMA);
						setState(329);
						finalValue();
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(335);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(339);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				functionTagOperation();
				setState(341);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				chainedIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				forLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				singleVarDec();
				setState(347);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(349);
				singleVarAssignment();
				setState(350);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(352);
				multiVarAssignment();
				setState(353);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(355);
				variableSwap();
				setState(356);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(358);
				variableIncrement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(359);
				variableDecrement();
				setState(360);
				match(SEMICOLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(362);
				typeDeclaration();
				setState(363);
				match(SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(365);
				interfaceDeclaration();
				setState(366);
				match(SEMICOLON);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(368);
				functionWithinFunctionDec();
				setState(369);
				match(SEMICOLON);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(371);
				match(SEMICOLON);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(IDENTIFIER);
			setState(375);
			match(LEFT_PAREN);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(376);
				functionCallArguments();
				}
			}

			setState(379);
			match(RIGHT_PAREN);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__10);
			setState(382);
			match(LEFT_PAREN);
			setState(383);
			conditional();
			setState(384);
			match(RIGHT_PAREN);
			setState(385);
			functionCodeBlock();
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public List<FunctionCodeBlockContext> functionCodeBlock() {
			return getRuleContexts(FunctionCodeBlockContext.class);
		}
		public FunctionCodeBlockContext functionCodeBlock(int i) {
			return getRuleContext(FunctionCodeBlockContext.class,i);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TupulParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TupulParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__11);
			setState(388);
			match(LEFT_PAREN);
			setState(389);
			functionCodeBlock();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(390);
				match(SEMICOLON);
				}
			}

			setState(393);
			conditional();
			setState(394);
			match(SEMICOLON);
			setState(395);
			functionCodeBlock();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(396);
				match(SEMICOLON);
				}
			}

			setState(399);
			match(RIGHT_PAREN);
			setState(400);
			functionCodeBlock();
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

	public static class SpecialForLoopContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public SpecialForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterSpecialForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitSpecialForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitSpecialForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialForLoopContext specialForLoop() throws RecognitionException {
		SpecialForLoopContext _localctx = new SpecialForLoopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_specialForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__11);
			setState(403);
			match(LEFT_PAREN);
			setState(404);
			match(IDENTIFIER);
			setState(405);
			match(IDENTIFIER);
			setState(406);
			match(T__12);
			setState(407);
			match(IDENTIFIER);
			setState(408);
			match(RIGHT_PAREN);
			setState(409);
			functionCodeBlock();
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

	public static class ChainedIfStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ChainedIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainedIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterChainedIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitChainedIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitChainedIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainedIfStatementContext chainedIfStatement() throws RecognitionException {
		ChainedIfStatementContext _localctx = new ChainedIfStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chainedIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			ifStatement();
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					elseIfStatement();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(418);
				elseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__13);
			setState(422);
			match(LEFT_PAREN);
			setState(423);
			conditional();
			setState(424);
			match(RIGHT_PAREN);
			setState(425);
			functionCodeBlock();
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
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__14);
			setState(428);
			functionCodeBlock();
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__15);
			setState(431);
			match(LEFT_PAREN);
			setState(432);
			conditional();
			setState(433);
			match(RIGHT_PAREN);
			setState(434);
			functionCodeBlock();
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

	public static class ConditionalContext extends ParserRuleContext {
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			finalValue();
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
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode INT_TYPE() { return getToken(TupulParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(TupulParser.CHAR_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(TupulParser.DOUBLE_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(TupulParser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(TupulParser.STRING_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) ) {
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

	public static class FinalValueContext extends ParserRuleContext {
		public IntermediateValueContext intermediateValue() {
			return getRuleContext(IntermediateValueContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			intermediateValue(0);
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

	public static class VarIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode THIS_KEYWORD() { return getToken(TupulParser.THIS_KEYWORD, 0); }
		public VarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIDContext varID() throws RecognitionException {
		VarIDContext _localctx = new VarIDContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !(_la==THIS_KEYWORD || _la==IDENTIFIER) ) {
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

	public static class IntermediateValueContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TupulParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TupulParser.COMMA, i);
		}
		public List<IntermediateValueContext> intermediateValue() {
			return getRuleContexts(IntermediateValueContext.class);
		}
		public IntermediateValueContext intermediateValue(int i) {
			return getRuleContext(IntermediateValueContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(TupulParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(TupulParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(TupulParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(TupulParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(TupulParser.STRING, 0); }
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public TerminalNode LEFT_ANGLE() { return getToken(TupulParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(TupulParser.RIGHT_ANGLE, 0); }
		public TerminalNode DOUBLE_EQUALS_LIST() { return getToken(TupulParser.DOUBLE_EQUALS_LIST, 0); }
		public TerminalNode MULTI_OP() { return getToken(TupulParser.MULTI_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(TupulParser.DIV_OP, 0); }
		public TerminalNode ADD_OP() { return getToken(TupulParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(TupulParser.SUB_OP, 0); }
		public IntermediateValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intermediateValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterIntermediateValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitIntermediateValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitIntermediateValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntermediateValueContext intermediateValue() throws RecognitionException {
		return intermediateValue(0);
	}

	private IntermediateValueContext intermediateValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntermediateValueContext _localctx = new IntermediateValueContext(_ctx, _parentState);
		IntermediateValueContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_intermediateValue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(445);
				functionCall();
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(446);
					match(T__12);
					setState(475);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case FLOAT_TYPE:
					case DOUBLE_TYPE:
					case CHAR_TYPE:
					case STRING_TYPE:
					case IDENTIFIER:
						{
						setState(451);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(447);
							type();
							setState(448);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(450);
							match(IDENTIFIER);
							}
							break;
						}
						}
						break;
					case LEFT_PAREN:
						{
						setState(453);
						match(LEFT_PAREN);
						{
						setState(458); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(458);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
							case 1:
								{
								setState(454);
								type();
								setState(455);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(457);
								match(IDENTIFIER);
								}
								break;
							}
							}
							setState(460); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0) );
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(462);
							match(COMMA);
							setState(467);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(463);
								type();
								setState(464);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(466);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							setState(473);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						setState(474);
						match(RIGHT_PAREN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(479);
				match(LEFT_PAREN);
				setState(480);
				intermediateValue(0);
				setState(481);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(483);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(484);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(485);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				setState(486);
				match(CHAR);
				}
				break;
			case 7:
				{
				setState(487);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(488);
				varID();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(491);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(492);
						match(LEFT_ANGLE);
						setState(493);
						intermediateValue(12);
						}
						break;
					case 2:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(494);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(495);
						match(T__16);
						setState(496);
						intermediateValue(11);
						}
						break;
					case 3:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(497);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(498);
						match(T__17);
						setState(499);
						intermediateValue(10);
						}
						break;
					case 4:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(500);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(501);
						match(RIGHT_ANGLE);
						setState(502);
						intermediateValue(9);
						}
						break;
					case 5:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(503);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(504);
						match(DOUBLE_EQUALS_LIST);
						setState(505);
						intermediateValue(8);
						}
						break;
					case 6:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(506);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(507);
						match(T__9);
						setState(508);
						intermediateValue(7);
						}
						break;
					case 7:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(509);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(510);
						match(MULTI_OP);
						setState(511);
						intermediateValue(6);
						}
						break;
					case 8:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(512);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(513);
						match(DIV_OP);
						setState(514);
						intermediateValue(5);
						}
						break;
					case 9:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(515);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(516);
						match(ADD_OP);
						setState(517);
						intermediateValue(4);
						}
						break;
					case 10:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(518);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(519);
						match(SUB_OP);
						setState(520);
						intermediateValue(3);
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public SingleVarDecContext singleVarDec() {
			return getRuleContext(SingleVarDecContext.class,0);
		}
		public MultiVarDecContext multiVarDec() {
			return getRuleContext(MultiVarDecContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaration);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				singleVarDec();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				multiVarDec();
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

	public static class SingleVarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TupulParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TupulParser.COMMA, i);
		}
		public List<TerminalNode> EQUALS_LIT() { return getTokens(TupulParser.EQUALS_LIT); }
		public TerminalNode EQUALS_LIT(int i) {
			return getToken(TupulParser.EQUALS_LIT, i);
		}
		public List<FinalValueContext> finalValue() {
			return getRuleContexts(FinalValueContext.class);
		}
		public FinalValueContext finalValue(int i) {
			return getRuleContext(FinalValueContext.class,i);
		}
		public SingleVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterSingleVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitSingleVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitSingleVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarDecContext singleVarDec() throws RecognitionException {
		SingleVarDecContext _localctx = new SingleVarDecContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_singleVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			type();
			setState(536); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(531);
				match(IDENTIFIER);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_LIT) {
					{
					setState(532);
					match(EQUALS_LIT);
					setState(533);
					finalValue();
					}
				}

				}
				}
				setState(538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(540);
				match(COMMA);
				setState(541);
				match(IDENTIFIER);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_LIT) {
					{
					setState(542);
					match(EQUALS_LIT);
					setState(543);
					finalValue();
					}
				}

				}
				}
				setState(550);
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

	public static class MultiVarDecContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public TerminalNode EQUALS_LIT() { return getToken(TupulParser.EQUALS_LIT, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public MultiVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiVarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterMultiVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitMultiVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitMultiVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiVarDecContext multiVarDec() throws RecognitionException {
		MultiVarDecContext _localctx = new MultiVarDecContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(LEFT_PAREN);
			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(552);
				type();
				setState(553);
				match(IDENTIFIER);
				}
				}
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0) );
			setState(559);
			match(RIGHT_PAREN);
			setState(560);
			match(EQUALS_LIT);
			setState(561);
			finalValue();
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

	public static class SingleVarAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_LIT() { return getToken(TupulParser.EQUALS_LIT, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public SingleVarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterSingleVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitSingleVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitSingleVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarAssignmentContext singleVarAssignment() throws RecognitionException {
		SingleVarAssignmentContext _localctx = new SingleVarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_singleVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(IDENTIFIER);
			setState(564);
			match(EQUALS_LIT);
			setState(565);
			finalValue();
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

	public static class MultiVarAssignmentContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public TerminalNode EQUALS_LIT() { return getToken(TupulParser.EQUALS_LIT, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public MultiVarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiVarAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterMultiVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitMultiVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitMultiVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiVarAssignmentContext multiVarAssignment() throws RecognitionException {
		MultiVarAssignmentContext _localctx = new MultiVarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multiVarAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(LEFT_PAREN);
			setState(572); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(568);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(569);
					type();
					setState(570);
					match(IDENTIFIER);
					}
					break;
				}
				}
				setState(574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0) );
			setState(576);
			match(RIGHT_PAREN);
			setState(577);
			match(EQUALS_LIT);
			setState(578);
			finalValue();
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

	public static class VariableSwapContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public VariableSwapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSwap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVariableSwap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVariableSwap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVariableSwap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableSwapContext variableSwap() throws RecognitionException {
		VariableSwapContext _localctx = new VariableSwapContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableSwap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(IDENTIFIER);
			setState(581);
			match(T__18);
			setState(582);
			match(IDENTIFIER);
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

	public static class VariableIncrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public VariableIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVariableIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVariableIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVariableIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIncrementContext variableIncrement() throws RecognitionException {
		VariableIncrementContext _localctx = new VariableIncrementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(IDENTIFIER);
			setState(585);
			match(T__19);
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

	public static class VariableDecrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public VariableDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVariableDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVariableDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVariableDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDecrementContext variableDecrement() throws RecognitionException {
		VariableDecrementContext _localctx = new VariableDecrementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(IDENTIFIER);
			setState(588);
			match(T__20);
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
		case 39:
			return intermediateValue_sempred((IntermediateValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intermediateValue_sempred(IntermediateValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0251\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\6\2d\n\2\r\2\16\2e\3\3"+
		"\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\5\3q\n\3\3\4\3\4\3\4\7\4v\n\4\f\4"+
		"\16\4y\13\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u0081\n\5\f\5\16\5\u0084\13\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\3\7\3\7\7\7\u0093\n"+
		"\7\f\7\16\7\u0096\13\7\3\b\3\b\3\b\3\t\3\t\7\t\u009d\n\t\f\t\16\t\u00a0"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00bd"+
		"\n\f\3\f\3\f\3\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00cf\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00da\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00e8\n\21\f\21\16\21\u00eb\13\21\3\21\3\21\5\21\u00ef\n\21"+
		"\3\21\5\21\u00f2\n\21\3\21\5\21\u00f5\n\21\3\21\5\21\u00f8\n\21\3\22\3"+
		"\22\5\22\u00fc\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0104\n\23\f\23"+
		"\16\23\u0107\13\23\3\24\3\24\3\24\7\24\u010c\n\24\f\24\16\24\u010f\13"+
		"\24\3\25\3\25\3\25\5\25\u0114\n\25\3\25\3\25\3\25\3\25\3\25\7\25\u011b"+
		"\n\25\f\25\16\25\u011e\13\25\3\25\5\25\u0121\n\25\3\26\3\26\3\26\5\26"+
		"\u0126\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u013e\n\34\f\34"+
		"\16\34\u0141\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7"+
		"\34\u014d\n\34\f\34\16\34\u0150\13\34\3\34\3\34\5\34\u0154\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0177\n\34\3\35\3\35\3\35\5\35\u017c\n\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u018a\n\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0190\n\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\7!\u01a0\n!\f!\16!\u01a3\13!\3!\5!\u01a6\n!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u01c6\n)\3)\3)\3)\3)\3)\6)\u01cd\n)\r)\16)\u01ce"+
		"\3)\3)\3)\3)\3)\5)\u01d6\n)\7)\u01d8\n)\f)\16)\u01db\13)\3)\5)\u01de\n"+
		")\5)\u01e0\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01ec\n)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\7)\u020c\n)\f)\16)\u020f\13)\3*\3*\5*\u0213\n*\3+\3+\3+\3+\5+"+
		"\u0219\n+\6+\u021b\n+\r+\16+\u021c\3+\3+\3+\3+\5+\u0223\n+\7+\u0225\n"+
		"+\f+\16+\u0228\13+\3,\3,\3,\3,\6,\u022e\n,\r,\16,\u022f\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\6.\u023f\n.\r.\16.\u0240\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\2\3P\62\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\b\3\2GH\3"+
		"\2JK\3\2\6\b\3\2\t\13\5\2\658;;OO\4\2\64\64OO\2\u027b\2c\3\2\2\2\4g\3"+
		"\2\2\2\6r\3\2\2\2\b}\3\2\2\2\n\u0088\3\2\2\2\f\u0090\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u00a9\3\2\2\2\22\u00b2\3\2\2\2\24\u00b4\3\2\2\2\26\u00b8\3"+
		"\2\2\2\30\u00ce\3\2\2\2\32\u00d9\3\2\2\2\34\u00db\3\2\2\2\36\u00de\3\2"+
		"\2\2 \u00ee\3\2\2\2\"\u00fb\3\2\2\2$\u00fd\3\2\2\2&\u0108\3\2\2\2(\u0110"+
		"\3\2\2\2*\u0125\3\2\2\2,\u0127\3\2\2\2.\u012b\3\2\2\2\60\u012f\3\2\2\2"+
		"\62\u0133\3\2\2\2\64\u0137\3\2\2\2\66\u0176\3\2\2\28\u0178\3\2\2\2:\u017f"+
		"\3\2\2\2<\u0185\3\2\2\2>\u0194\3\2\2\2@\u019d\3\2\2\2B\u01a7\3\2\2\2D"+
		"\u01ad\3\2\2\2F\u01b0\3\2\2\2H\u01b6\3\2\2\2J\u01b8\3\2\2\2L\u01ba\3\2"+
		"\2\2N\u01bc\3\2\2\2P\u01eb\3\2\2\2R\u0212\3\2\2\2T\u0214\3\2\2\2V\u0229"+
		"\3\2\2\2X\u0235\3\2\2\2Z\u0239\3\2\2\2\\\u0246\3\2\2\2^\u024a\3\2\2\2"+
		"`\u024d\3\2\2\2bd\5\4\3\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\3\3"+
		"\2\2\2gk\5\6\4\2hj\5\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lp\3"+
		"\2\2\2mk\3\2\2\2nq\5\26\f\2oq\5\n\6\2pn\3\2\2\2po\3\2\2\2q\5\3\2\2\2r"+
		"w\7\3\2\2st\7O\2\2tv\7\4\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x"+
		"z\3\2\2\2yw\3\2\2\2z{\7O\2\2{|\7 \2\2|\7\3\2\2\2}\u0082\7I\2\2~\177\7"+
		"O\2\2\177\u0081\7\4\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7O\2\2\u0086\u0087\7 \2\2\u0087\t\3\2\2\2\u0088\u0089\7E\2\2\u0089"+
		"\u008c\7O\2\2\u008a\u008b\7F\2\2\u008b\u008d\5\f\7\2\u008c\u008a\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5\20\t\2\u008f"+
		"\13\3\2\2\2\u0090\u0094\7O\2\2\u0091\u0093\5\16\b\2\u0092\u0091\3\2\2"+
		"\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\r"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7O\2\2\u0099"+
		"\17\3\2\2\2\u009a\u009e\7#\2\2\u009b\u009d\5\20\t\2\u009c\u009b\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00aa\7$\2\2\u00a2\u00a3\5R*\2\u00a3"+
		"\u00a4\7 \2\2\u00a4\u00aa\3\2\2\2\u00a5\u00aa\5\22\n\2\u00a6\u00aa\5\n"+
		"\6\2\u00a7\u00aa\5\26\f\2\u00a8\u00aa\5\24\13\2\u00a9\u009a\3\2\2\2\u00a9"+
		"\u00a2\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\u00ad"+
		"\5 \21\2\u00ad\u00ae\7O\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\5\34\17\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00b3\5\34\17\2\u00b2\u00ab\3\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6\5(\25\2\u00b6"+
		"\u00b7\7 \2\2\u00b7\25\3\2\2\2\u00b8\u00b9\7D\2\2\u00b9\u00bc\7O\2\2\u00ba"+
		"\u00bb\7F\2\2\u00bb\u00bd\5\f\7\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf\27\3\2\2\2\u00c0\u00c4"+
		"\7#\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00cf\7$\2\2\u00c8\u00cf\5\32\16\2\u00c9\u00cf\5\26\f\2\u00ca"+
		"\u00cf\5\n\6\2\u00cb\u00cc\5R*\2\u00cc\u00cd\7 \2\2\u00cd\u00cf\3\2\2"+
		"\2\u00ce\u00c0\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca"+
		"\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00d1\t\2\2\2\u00d1"+
		"\u00d2\5 \21\2\u00d2\u00d3\7O\2\2\u00d3\u00d4\7\5\2\2\u00d4\u00d5\5\34"+
		"\17\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\5\34\17\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\33\3\2\2"+
		"\2\u00db\u00dc\5(\25\2\u00dc\u00dd\5\66\34\2\u00dd\35\3\2\2\2\u00de\u00df"+
		"\5 \21\2\u00df\u00e0\5(\25\2\u00e0\u00e1\5\66\34\2\u00e1\37\3\2\2\2\u00e2"+
		"\u00ef\5\"\22\2\u00e3\u00e4\7!\2\2\u00e4\u00e5\5\"\22\2\u00e5\u00e9\7"+
		"\61\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee"+
		"\u00e3\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\t\4\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\t\5"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8!\3\2\2\2\u00f9\u00fc"+
		"\5J&\2\u00fa\u00fc\79\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"#\3\2\2\2\u00fd\u00fe\5J&\2\u00fe\u0105\7O\2\2\u00ff\u0100\7\61\2\2\u0100"+
		"\u0101\5J&\2\u0101\u0102\7O\2\2\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2"+
		"\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106%"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\7O\2\2\u0109\u010a\7\61\2\2\u010a"+
		"\u010c\7O\2\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\'\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111"+
		"\7O\2\2\u0111\u0113\7!\2\2\u0112\u0114\5$\23\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0120\7\"\2\2\u0116\u011c\7\'"+
		"\2\2\u0117\u0118\5*\26\2\u0118\u0119\7 \2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\7(\2\2\u0120"+
		"\u0116\3\2\2\2\u0120\u0121\3\2\2\2\u0121)\3\2\2\2\u0122\u0126\5,\27\2"+
		"\u0123\u0126\5.\30\2\u0124\u0126\5\60\31\2\u0125\u0122\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0124\3\2\2\2\u0126+\3\2\2\2\u0127\u0128\5L\'\2\u0128\u0129"+
		"\7\33\2\2\u0129\u012a\5\64\33\2\u012a-\3\2\2\2\u012b\u012c\5L\'\2\u012c"+
		"\u012d\7\34\2\2\u012d\u012e\5\64\33\2\u012e/\3\2\2\2\u012f\u0130\5L\'"+
		"\2\u0130\u0131\7\35\2\2\u0131\u0132\5\64\33\2\u0132\61\3\2\2\2\u0133\u0134"+
		"\5L\'\2\u0134\u0135\7\f\2\2\u0135\u0136\5\64\33\2\u0136\63\3\2\2\2\u0137"+
		"\u0138\7O\2\2\u0138\u0139\7/\2\2\u0139\u013a\7O\2\2\u013a\65\3\2\2\2\u013b"+
		"\u013f\7#\2\2\u013c\u013e\5\66\34\2\u013d\u013c\3\2\2\2\u013e\u0141\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0177\7$\2\2\u0143\u0144\58\35\2\u0144\u0145\7 \2"+
		"\2\u0145\u0177\3\2\2\2\u0146\u0153\7\37\2\2\u0147\u0154\5L\'\2\u0148\u0149"+
		"\7!\2\2\u0149\u014e\5L\'\2\u014a\u014b\7\61\2\2\u014b\u014d\5L\'\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\"\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u0147\3\2\2\2\u0153\u0148\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0177\7 \2\2\u0156\u0157\5*\26\2\u0157"+
		"\u0158\7 \2\2\u0158\u0177\3\2\2\2\u0159\u0177\5@!\2\u015a\u0177\5:\36"+
		"\2\u015b\u0177\5<\37\2\u015c\u015d\5T+\2\u015d\u015e\7 \2\2\u015e\u0177"+
		"\3\2\2\2\u015f\u0160\5X-\2\u0160\u0161\7 \2\2\u0161\u0177\3\2\2\2\u0162"+
		"\u0163\5Z.\2\u0163\u0164\7 \2\2\u0164\u0177\3\2\2\2\u0165\u0166\5\\/\2"+
		"\u0166\u0167\7 \2\2\u0167\u0177\3\2\2\2\u0168\u0177\5^\60\2\u0169\u016a"+
		"\5`\61\2\u016a\u016b\7 \2\2\u016b\u0177\3\2\2\2\u016c\u016d\5\26\f\2\u016d"+
		"\u016e\7 \2\2\u016e\u0177\3\2\2\2\u016f\u0170\5\n\6\2\u0170\u0171\7 \2"+
		"\2\u0171\u0177\3\2\2\2\u0172\u0173\5\36\20\2\u0173\u0174\7 \2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0177\7 \2\2\u0176\u013b\3\2\2\2\u0176\u0143\3\2"+
		"\2\2\u0176\u0146\3\2\2\2\u0176\u0156\3\2\2\2\u0176\u0159\3\2\2\2\u0176"+
		"\u015a\3\2\2\2\u0176\u015b\3\2\2\2\u0176\u015c\3\2\2\2\u0176\u015f\3\2"+
		"\2\2\u0176\u0162\3\2\2\2\u0176\u0165\3\2\2\2\u0176\u0168\3\2\2\2\u0176"+
		"\u0169\3\2\2\2\u0176\u016c\3\2\2\2\u0176\u016f\3\2\2\2\u0176\u0172\3\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177\67\3\2\2\2\u0178\u0179\7O\2\2\u0179\u017b"+
		"\7!\2\2\u017a\u017c\5&\24\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\7\"\2\2\u017e9\3\2\2\2\u017f\u0180\7\r\2\2"+
		"\u0180\u0181\7!\2\2\u0181\u0182\5H%\2\u0182\u0183\7\"\2\2\u0183\u0184"+
		"\5\66\34\2\u0184;\3\2\2\2\u0185\u0186\7\16\2\2\u0186\u0187\7!\2\2\u0187"+
		"\u0189\5\66\34\2\u0188\u018a\7 \2\2\u0189\u0188\3\2\2\2\u0189\u018a\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5H%\2\u018c\u018d\7 \2\2\u018d"+
		"\u018f\5\66\34\2\u018e\u0190\7 \2\2\u018f\u018e\3\2\2\2\u018f\u0190\3"+
		"\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\"\2\2\u0192\u0193\5\66\34\2\u0193"+
		"=\3\2\2\2\u0194\u0195\7\16\2\2\u0195\u0196\7!\2\2\u0196\u0197\7O\2\2\u0197"+
		"\u0198\7O\2\2\u0198\u0199\7\17\2\2\u0199\u019a\7O\2\2\u019a\u019b\7\""+
		"\2\2\u019b\u019c\5\66\34\2\u019c?\3\2\2\2\u019d\u01a1\5B\"\2\u019e\u01a0"+
		"\5F$\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\5D"+
		"#\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6A\3\2\2\2\u01a7\u01a8"+
		"\7\20\2\2\u01a8\u01a9\7!\2\2\u01a9\u01aa\5H%\2\u01aa\u01ab\7\"\2\2\u01ab"+
		"\u01ac\5\66\34\2\u01acC\3\2\2\2\u01ad\u01ae\7\21\2\2\u01ae\u01af\5\66"+
		"\34\2\u01afE\3\2\2\2\u01b0\u01b1\7\22\2\2\u01b1\u01b2\7!\2\2\u01b2\u01b3"+
		"\5H%\2\u01b3\u01b4\7\"\2\2\u01b4\u01b5\5\66\34\2\u01b5G\3\2\2\2\u01b6"+
		"\u01b7\5L\'\2\u01b7I\3\2\2\2\u01b8\u01b9\t\6\2\2\u01b9K\3\2\2\2\u01ba"+
		"\u01bb\5P)\2\u01bbM\3\2\2\2\u01bc\u01bd\t\7\2\2\u01bdO\3\2\2\2\u01be\u01bf"+
		"\b)\1\2\u01bf\u01df\58\35\2\u01c0\u01dd\7\17\2\2\u01c1\u01c2\5J&\2\u01c2"+
		"\u01c3\7O\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c6\7O\2\2\u01c5\u01c1\3\2\2"+
		"\2\u01c5\u01c4\3\2\2\2\u01c6\u01de\3\2\2\2\u01c7\u01cc\7!\2\2\u01c8\u01c9"+
		"\5J&\2\u01c9\u01ca\7O\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01cd\7O\2\2\u01cc"+
		"\u01c8\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d9\3\2\2\2\u01d0\u01d5\7\61\2\2\u01d1"+
		"\u01d2\5J&\2\u01d2\u01d3\7O\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d6\7O\2\2"+
		"\u01d5\u01d1\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d0"+
		"\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\7\"\2\2\u01dd\u01c5\3\2"+
		"\2\2\u01dd\u01c7\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01c0\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01ec\3\2\2\2\u01e1\u01e2\7!\2\2\u01e2\u01e3\5P)"+
		"\2\u01e3\u01e4\7\"\2\2\u01e4\u01ec\3\2\2\2\u01e5\u01ec\7\30\2\2\u01e6"+
		"\u01ec\7\31\2\2\u01e7\u01ec\7\32\2\2\u01e8\u01ec\7L\2\2\u01e9\u01ec\7"+
		"M\2\2\u01ea\u01ec\5N(\2\u01eb\u01be\3\2\2\2\u01eb\u01e1\3\2\2\2\u01eb"+
		"\u01e5\3\2\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u020d\3\2\2\2\u01ed"+
		"\u01ee\f\r\2\2\u01ee\u01ef\7\'\2\2\u01ef\u020c\5P)\16\u01f0\u01f1\f\f"+
		"\2\2\u01f1\u01f2\7\23\2\2\u01f2\u020c\5P)\r\u01f3\u01f4\f\13\2\2\u01f4"+
		"\u01f5\7\24\2\2\u01f5\u020c\5P)\f\u01f6\u01f7\f\n\2\2\u01f7\u01f8\7(\2"+
		"\2\u01f8\u020c\5P)\13\u01f9\u01fa\f\t\2\2\u01fa\u01fb\7\35\2\2\u01fb\u020c"+
		"\5P)\n\u01fc\u01fd\f\b\2\2\u01fd\u01fe\7\f\2\2\u01fe\u020c\5P)\t\u01ff"+
		"\u0200\f\7\2\2\u0200\u0201\7*\2\2\u0201\u020c\5P)\b\u0202\u0203\f\6\2"+
		"\2\u0203\u0204\7+\2\2\u0204\u020c\5P)\7\u0205\u0206\f\5\2\2\u0206\u0207"+
		"\7)\2\2\u0207\u020c\5P)\6\u0208\u0209\f\4\2\2\u0209\u020a\7,\2\2\u020a"+
		"\u020c\5P)\5\u020b\u01ed\3\2\2\2\u020b\u01f0\3\2\2\2\u020b\u01f3\3\2\2"+
		"\2\u020b\u01f6\3\2\2\2\u020b\u01f9\3\2\2\2\u020b\u01fc\3\2\2\2\u020b\u01ff"+
		"\3\2\2\2\u020b\u0202\3\2\2\2\u020b\u0205\3\2\2\2\u020b\u0208\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020eQ\3\2\2\2"+
		"\u020f\u020d\3\2\2\2\u0210\u0213\5T+\2\u0211\u0213\5V,\2\u0212\u0210\3"+
		"\2\2\2\u0212\u0211\3\2\2\2\u0213S\3\2\2\2\u0214\u021a\5J&\2\u0215\u0218"+
		"\7O\2\2\u0216\u0217\7\36\2\2\u0217\u0219\5L\'\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0215\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0226\3\2\2\2\u021e"+
		"\u021f\7\61\2\2\u021f\u0222\7O\2\2\u0220\u0221\7\36\2\2\u0221\u0223\5"+
		"L\'\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u021e\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227U\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022d\7!\2\2\u022a\u022b"+
		"\5J&\2\u022b\u022c\7O\2\2\u022c\u022e\3\2\2\2\u022d\u022a\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0232\7\"\2\2\u0232\u0233\7\36\2\2\u0233\u0234\5L\'\2\u0234"+
		"W\3\2\2\2\u0235\u0236\7O\2\2\u0236\u0237\7\36\2\2\u0237\u0238\5L\'\2\u0238"+
		"Y\3\2\2\2\u0239\u023e\7!\2\2\u023a\u023f\7O\2\2\u023b\u023c\5J&\2\u023c"+
		"\u023d\7O\2\2\u023d\u023f\3\2\2\2\u023e\u023a\3\2\2\2\u023e\u023b\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\7\"\2\2\u0243\u0244\7\36\2\2\u0244\u0245\5"+
		"L\'\2\u0245[\3\2\2\2\u0246\u0247\7O\2\2\u0247\u0248\7\25\2\2\u0248\u0249"+
		"\7O\2\2\u0249]\3\2\2\2\u024a\u024b\7O\2\2\u024b\u024c\7\26\2\2\u024c_"+
		"\3\2\2\2\u024d\u024e\7O\2\2\u024e\u024f\7\27\2\2\u024fa\3\2\2\2\67ekp"+
		"w\u0082\u008c\u0094\u009e\u00a9\u00b2\u00bc\u00c4\u00ce\u00d9\u00e9\u00ee"+
		"\u00f1\u00f4\u00f7\u00fb\u0105\u010d\u0113\u011c\u0120\u0125\u013f\u014e"+
		"\u0153\u0176\u017b\u0189\u018f\u01a1\u01a5\u01c5\u01cc\u01ce\u01d5\u01d9"+
		"\u01dd\u01df\u01eb\u020b\u020d\u0212\u0218\u021c\u0222\u0226\u022f\u023e"+
		"\u0240";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}