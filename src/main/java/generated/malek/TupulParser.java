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
		RULE_interfaceCodeBlock = 6, RULE_interfaceFunctionDeclaration = 7, RULE_interfaceAbstractFuncDec = 8, 
		RULE_typeDeclaration = 9, RULE_typeCodeBlock = 10, RULE_typeFunctionDeclaration = 11, 
		RULE_functionWithinFunctionDec = 12, RULE_universalFunctionModifiers = 13, 
		RULE_functionDecArguments = 14, RULE_functionCallArguments = 15, RULE_universalPostIdentifierFuncDec = 16, 
		RULE_functionTagOperation = 17, RULE_functionTagAppend = 18, RULE_functionTagRemove = 19, 
		RULE_functionTagEquals = 20, RULE_functionTagNotEquals = 21, RULE_tagID = 22, 
		RULE_functionCodeBlock = 23, RULE_functionCall = 24, RULE_whileLoop = 25, 
		RULE_forLoop = 26, RULE_specialForLoop = 27, RULE_chainedIfStatement = 28, 
		RULE_ifStatement = 29, RULE_elseStatement = 30, RULE_elseIfStatement = 31, 
		RULE_conditional = 32, RULE_type = 33, RULE_finalValue = 34, RULE_varID = 35, 
		RULE_intermediateValue = 36, RULE_singleVarDec = 37, RULE_singleVarAssignment = 38, 
		RULE_multiVarAssignment = 39, RULE_variableSwap = 40, RULE_variableIncrement = 41, 
		RULE_variableDecrement = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"allMultipleLinkedFiles", "file", "declarePackage", "importSomething", 
			"interfaceDeclaration", "interfaceExtensions", "interfaceCodeBlock", 
			"interfaceFunctionDeclaration", "interfaceAbstractFuncDec", "typeDeclaration", 
			"typeCodeBlock", "typeFunctionDeclaration", "functionWithinFunctionDec", 
			"universalFunctionModifiers", "functionDecArguments", "functionCallArguments", 
			"universalPostIdentifierFuncDec", "functionTagOperation", "functionTagAppend", 
			"functionTagRemove", "functionTagEquals", "functionTagNotEquals", "tagID", 
			"functionCodeBlock", "functionCall", "whileLoop", "forLoop", "specialForLoop", 
			"chainedIfStatement", "ifStatement", "elseStatement", "elseIfStatement", 
			"conditional", "type", "finalValue", "varID", "intermediateValue", "singleVarDec", 
			"singleVarAssignment", "multiVarAssignment", "variableSwap", "variableIncrement", 
			"variableDecrement"
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
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				file();
				}
				}
				setState(89); 
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
			setState(91);
			declarePackage();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(92);
				importSomething();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(98);
				typeDeclaration();
				}
				break;
			case INTERFACE:
				{
				setState(99);
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
			setState(102);
			match(T__0);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(IDENTIFIER);
					setState(104);
					match(T__1);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(110);
			match(IDENTIFIER);
			setState(111);
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
			setState(113);
			match(IMPORT);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					match(IDENTIFIER);
					setState(115);
					match(T__1);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(121);
			match(IDENTIFIER);
			setState(122);
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
			setState(124);
			match(INTERFACE);
			setState(125);
			match(IDENTIFIER);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(126);
				match(EXTENDS);
				setState(127);
				interfaceExtensions();
				}
			}

			setState(130);
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
		public List<TerminalNode> COMMA() { return getTokens(TupulParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TupulParser.COMMA, i);
		}
		public List<InterfaceExtensionsContext> interfaceExtensions() {
			return getRuleContexts(InterfaceExtensionsContext.class);
		}
		public InterfaceExtensionsContext interfaceExtensions(int i) {
			return getRuleContext(InterfaceExtensionsContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENTIFIER);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(COMMA);
					setState(134);
					interfaceExtensions();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class InterfaceCodeBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<InterfaceCodeBlockContext> interfaceCodeBlock() {
			return getRuleContexts(InterfaceCodeBlockContext.class);
		}
		public InterfaceCodeBlockContext interfaceCodeBlock(int i) {
			return getRuleContext(InterfaceCodeBlockContext.class,i);
		}
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
		enterRule(_localctx, 12, RULE_interfaceCodeBlock);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(LEFT_CURLY);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (LEFT_PAREN - 31)) | (1L << (LEFT_CURLY - 31)) | (1L << (INT_TYPE - 31)) | (1L << (FLOAT_TYPE - 31)) | (1L << (DOUBLE_TYPE - 31)) | (1L << (CHAR_TYPE - 31)) | (1L << (VOID_TYPE - 31)) | (1L << (STRING_TYPE - 31)) | (1L << (TYPE - 31)) | (1L << (INTERFACE - 31)) | (1L << (OVERRIDE - 31)) | (1L << (IMPLEMENT - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					{
					setState(141);
					interfaceCodeBlock();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				interfaceFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				typeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
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
		public UniversalPostIdentifierFuncDecContext universalPostIdentifierFuncDec() {
			return getRuleContext(UniversalPostIdentifierFuncDecContext.class,0);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
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
		enterRule(_localctx, 14, RULE_interfaceFunctionDeclaration);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				universalFunctionModifiers();
				setState(156);
				match(IDENTIFIER);
				setState(157);
				match(T__2);
				setState(158);
				universalPostIdentifierFuncDec();
				setState(159);
				functionCodeBlock();
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
				setState(161);
				universalFunctionModifiers();
				setState(162);
				universalPostIdentifierFuncDec();
				setState(163);
				functionCodeBlock();
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
		enterRule(_localctx, 16, RULE_interfaceAbstractFuncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			universalFunctionModifiers();
			setState(168);
			universalPostIdentifierFuncDec();
			setState(169);
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
		enterRule(_localctx, 18, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(TYPE);
			setState(172);
			match(IDENTIFIER);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(173);
				match(EXTENDS);
				setState(174);
				interfaceExtensions();
				}
			}

			setState(177);
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
		enterRule(_localctx, 20, RULE_typeCodeBlock);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(LEFT_CURLY);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (LEFT_PAREN - 31)) | (1L << (LEFT_CURLY - 31)) | (1L << (INT_TYPE - 31)) | (1L << (FLOAT_TYPE - 31)) | (1L << (DOUBLE_TYPE - 31)) | (1L << (CHAR_TYPE - 31)) | (1L << (VOID_TYPE - 31)) | (1L << (STRING_TYPE - 31)) | (1L << (TYPE - 31)) | (1L << (INTERFACE - 31)) | (1L << (OVERRIDE - 31)) | (1L << (IMPLEMENT - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					{
					setState(180);
					typeCodeBlock();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(RIGHT_CURLY);
				}
				break;
			case LEFT_PAREN:
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case STRING_TYPE:
			case OVERRIDE:
			case IMPLEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				typeFunctionDeclaration();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				typeDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				interfaceDeclaration();
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

	public static class TypeFunctionDeclarationContext extends ParserRuleContext {
		public UniversalFunctionModifiersContext universalFunctionModifiers() {
			return getRuleContext(UniversalFunctionModifiersContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public UniversalPostIdentifierFuncDecContext universalPostIdentifierFuncDec() {
			return getRuleContext(UniversalPostIdentifierFuncDecContext.class,0);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
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
		enterRule(_localctx, 22, RULE_typeFunctionDeclaration);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				universalFunctionModifiers();
				setState(194);
				match(IDENTIFIER);
				setState(195);
				match(T__2);
				setState(196);
				universalPostIdentifierFuncDec();
				setState(197);
				functionCodeBlock();
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
				setState(199);
				universalFunctionModifiers();
				setState(200);
				universalPostIdentifierFuncDec();
				setState(201);
				functionCodeBlock();
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
		enterRule(_localctx, 24, RULE_functionWithinFunctionDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			universalFunctionModifiers();
			setState(206);
			universalPostIdentifierFuncDec();
			setState(207);
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
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> VOID_TYPE() { return getTokens(TupulParser.VOID_TYPE); }
		public TerminalNode VOID_TYPE(int i) {
			return getToken(TupulParser.VOID_TYPE, i);
		}
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
		enterRule(_localctx, 26, RULE_universalFunctionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case FLOAT_TYPE:
				case DOUBLE_TYPE:
				case CHAR_TYPE:
				case STRING_TYPE:
				case IDENTIFIER:
					{
					setState(209);
					type();
					}
					break;
				case VOID_TYPE:
					{
					setState(210);
					match(VOID_TYPE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case LEFT_PAREN:
				{
				setState(213);
				match(LEFT_PAREN);
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case FLOAT_TYPE:
				case DOUBLE_TYPE:
				case CHAR_TYPE:
				case STRING_TYPE:
				case IDENTIFIER:
					{
					setState(214);
					type();
					}
					break;
				case VOID_TYPE:
					{
					setState(215);
					match(VOID_TYPE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(218);
				match(COMMA);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (VOID_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
					{
					setState(221);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case FLOAT_TYPE:
					case DOUBLE_TYPE:
					case CHAR_TYPE:
					case STRING_TYPE:
					case IDENTIFIER:
						{
						setState(219);
						type();
						}
						break;
					case VOID_TYPE:
						{
						setState(220);
						match(VOID_TYPE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(226);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(229);
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

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(232);
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

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(235);
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
		enterRule(_localctx, 28, RULE_functionDecArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			type();
			setState(239);
			match(IDENTIFIER);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				type();
				setState(242);
				match(IDENTIFIER);
				}
				}
				setState(248);
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
		enterRule(_localctx, 30, RULE_functionCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENTIFIER);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				match(IDENTIFIER);
				}
				}
				setState(256);
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
		enterRule(_localctx, 32, RULE_universalPostIdentifierFuncDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IDENTIFIER);
			setState(258);
			match(LEFT_PAREN);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
				{
				setState(259);
				functionDecArguments();
				}
			}

			setState(262);
			match(RIGHT_PAREN);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANGLE) {
				{
				setState(263);
				match(LEFT_ANGLE);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (INTEGER - 22)) | (1L << (FLOAT - 22)) | (1L << (DOUBLE - 22)) | (1L << (LEFT_PAREN - 22)) | (1L << (THIS_KEYWORD - 22)) | (1L << (CHAR - 22)) | (1L << (STRING - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
					{
					{
					setState(264);
					functionTagOperation();
					setState(265);
					match(SEMICOLON);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
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
		enterRule(_localctx, 34, RULE_functionTagOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(275);
				functionTagAppend();
				}
				break;
			case 2:
				{
				setState(276);
				functionTagRemove();
				}
				break;
			case 3:
				{
				setState(277);
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
		enterRule(_localctx, 36, RULE_functionTagAppend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			finalValue();
			setState(281);
			match(PLUS_EQUALS);
			setState(282);
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
		enterRule(_localctx, 38, RULE_functionTagRemove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			finalValue();
			setState(285);
			match(MINUS_EQUALS);
			setState(286);
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
		enterRule(_localctx, 40, RULE_functionTagEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			finalValue();
			setState(289);
			match(DOUBLE_EQUALS_LIST);
			setState(290);
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
		enterRule(_localctx, 42, RULE_functionTagNotEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			finalValue();
			setState(293);
			match(T__9);
			setState(294);
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
		enterRule(_localctx, 44, RULE_tagID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IDENTIFIER);
			setState(297);
			match(HASHTAG);
			setState(298);
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
		enterRule(_localctx, 46, RULE_functionCodeBlock);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(LEFT_CURLY);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << RETURN_LIT) | (1L << SEMICOLON) | (1L << LEFT_PAREN) | (1L << LEFT_CURLY) | (1L << THIS_KEYWORD) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << STRING_TYPE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TYPE - 66)) | (1L << (INTERFACE - 66)) | (1L << (CHAR - 66)) | (1L << (STRING - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(301);
					functionCodeBlock();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				functionCall();
				setState(309);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(RETURN_LIT);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(312);
					finalValue();
					}
					break;
				case 2:
					{
					setState(313);
					match(LEFT_PAREN);
					setState(314);
					finalValue();
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(315);
						match(COMMA);
						setState(316);
						finalValue();
						}
						}
						setState(321);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(322);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(326);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				functionTagOperation();
				setState(328);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				chainedIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(331);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				forLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(333);
				singleVarDec();
				setState(334);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(336);
				singleVarAssignment();
				setState(337);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(339);
				multiVarAssignment();
				setState(340);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(342);
				variableSwap();
				setState(343);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(345);
				variableIncrement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(346);
				variableDecrement();
				setState(347);
				match(SEMICOLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(349);
				typeDeclaration();
				setState(350);
				match(SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(352);
				interfaceDeclaration();
				setState(353);
				match(SEMICOLON);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(355);
				functionWithinFunctionDec();
				setState(356);
				match(SEMICOLON);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(358);
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
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(IDENTIFIER);
			setState(362);
			match(LEFT_PAREN);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(363);
				functionCallArguments();
				}
			}

			setState(366);
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
		enterRule(_localctx, 50, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__10);
			setState(369);
			match(LEFT_PAREN);
			setState(370);
			conditional();
			setState(371);
			match(RIGHT_PAREN);
			setState(372);
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
		enterRule(_localctx, 52, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__11);
			setState(375);
			match(LEFT_PAREN);
			setState(376);
			functionCodeBlock();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(377);
				match(SEMICOLON);
				}
			}

			setState(380);
			conditional();
			setState(381);
			match(SEMICOLON);
			setState(382);
			functionCodeBlock();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(383);
				match(SEMICOLON);
				}
			}

			setState(386);
			match(RIGHT_PAREN);
			setState(387);
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
		enterRule(_localctx, 54, RULE_specialForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__11);
			setState(390);
			match(LEFT_PAREN);
			setState(391);
			match(IDENTIFIER);
			setState(392);
			match(IDENTIFIER);
			setState(393);
			match(T__12);
			setState(394);
			match(IDENTIFIER);
			setState(395);
			match(RIGHT_PAREN);
			setState(396);
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
		enterRule(_localctx, 56, RULE_chainedIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			ifStatement();
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					elseIfStatement();
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(405);
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
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__13);
			setState(409);
			match(LEFT_PAREN);
			setState(410);
			conditional();
			setState(411);
			match(RIGHT_PAREN);
			setState(412);
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
		enterRule(_localctx, 60, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__14);
			setState(415);
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
		enterRule(_localctx, 62, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__15);
			setState(418);
			match(LEFT_PAREN);
			setState(419);
			conditional();
			setState(420);
			match(RIGHT_PAREN);
			setState(421);
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
		enterRule(_localctx, 64, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		enterRule(_localctx, 66, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		enterRule(_localctx, 68, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 70, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_intermediateValue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(432);
				functionCall();
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(433);
					match(T__12);
					setState(462);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case FLOAT_TYPE:
					case DOUBLE_TYPE:
					case CHAR_TYPE:
					case STRING_TYPE:
					case IDENTIFIER:
						{
						setState(438);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(434);
							type();
							setState(435);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(437);
							match(IDENTIFIER);
							}
							break;
						}
						}
						break;
					case LEFT_PAREN:
						{
						setState(440);
						match(LEFT_PAREN);
						{
						setState(445); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(445);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(441);
								type();
								setState(442);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(444);
								match(IDENTIFIER);
								}
								break;
							}
							}
							setState(447); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0) );
						setState(458);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(449);
							match(COMMA);
							setState(454);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
							case 1:
								{
								setState(450);
								type();
								setState(451);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(453);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							setState(460);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						setState(461);
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
				setState(466);
				match(LEFT_PAREN);
				setState(467);
				intermediateValue(0);
				setState(468);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(470);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(471);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(472);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				setState(473);
				match(CHAR);
				}
				break;
			case 7:
				{
				setState(474);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(475);
				varID();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(508);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(478);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(479);
						match(LEFT_ANGLE);
						setState(480);
						intermediateValue(12);
						}
						break;
					case 2:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(481);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(482);
						match(T__16);
						setState(483);
						intermediateValue(11);
						}
						break;
					case 3:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(484);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(485);
						match(T__17);
						setState(486);
						intermediateValue(10);
						}
						break;
					case 4:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(487);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(488);
						match(RIGHT_ANGLE);
						setState(489);
						intermediateValue(9);
						}
						break;
					case 5:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(490);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(491);
						match(DOUBLE_EQUALS_LIST);
						setState(492);
						intermediateValue(8);
						}
						break;
					case 6:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(493);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(494);
						match(T__9);
						setState(495);
						intermediateValue(7);
						}
						break;
					case 7:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(496);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(497);
						match(MULTI_OP);
						setState(498);
						intermediateValue(6);
						}
						break;
					case 8:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(499);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(500);
						match(DIV_OP);
						setState(501);
						intermediateValue(5);
						}
						break;
					case 9:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(502);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(503);
						match(ADD_OP);
						setState(504);
						intermediateValue(4);
						}
						break;
					case 10:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(505);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(506);
						match(SUB_OP);
						setState(507);
						intermediateValue(3);
						}
						break;
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 74, RULE_singleVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			type();
			setState(519); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(514);
				match(IDENTIFIER);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_LIT) {
					{
					setState(515);
					match(EQUALS_LIT);
					setState(516);
					finalValue();
					}
				}

				}
				}
				setState(521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(523);
				match(COMMA);
				setState(524);
				match(IDENTIFIER);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_LIT) {
					{
					setState(525);
					match(EQUALS_LIT);
					setState(526);
					finalValue();
					}
				}

				}
				}
				setState(533);
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
		enterRule(_localctx, 76, RULE_singleVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(IDENTIFIER);
			setState(535);
			match(EQUALS_LIT);
			setState(536);
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
		enterRule(_localctx, 78, RULE_multiVarAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(LEFT_PAREN);
			setState(543); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(539);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(540);
					type();
					setState(541);
					match(IDENTIFIER);
					}
					break;
				}
				}
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (INT_TYPE - 51)) | (1L << (FLOAT_TYPE - 51)) | (1L << (DOUBLE_TYPE - 51)) | (1L << (CHAR_TYPE - 51)) | (1L << (STRING_TYPE - 51)) | (1L << (IDENTIFIER - 51)))) != 0) );
			setState(547);
			match(RIGHT_PAREN);
			setState(548);
			match(EQUALS_LIT);
			setState(549);
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
		enterRule(_localctx, 80, RULE_variableSwap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(IDENTIFIER);
			setState(552);
			match(T__18);
			setState(553);
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
		enterRule(_localctx, 82, RULE_variableIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(IDENTIFIER);
			setState(556);
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
		enterRule(_localctx, 84, RULE_variableDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(IDENTIFIER);
			setState(559);
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
		case 36:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0234\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\6\2Z\n\2\r\2\16\2[\3\3\3\3\7\3`\n\3\f\3\16\3c\13\3\3\3\3\3\5"+
		"\3g\n\3\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\4\3\5\3\5\3\5\7"+
		"\5w\n\5\f\5\16\5z\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\b\3\b\7\b\u0091\n\b"+
		"\f\b\16\b\u0094\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\5\13\u00b2\n\13\3\13\3\13\3\f\3\f\7\f\u00b8\n\f\f\f\16\f\u00bb"+
		"\13\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00d6\n\17"+
		"\3\17\3\17\3\17\5\17\u00db\n\17\3\17\3\17\3\17\7\17\u00e0\n\17\f\17\16"+
		"\17\u00e3\13\17\3\17\5\17\u00e6\n\17\3\17\5\17\u00e9\n\17\3\17\5\17\u00ec"+
		"\n\17\3\17\5\17\u00ef\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f7\n"+
		"\20\f\20\16\20\u00fa\13\20\3\21\3\21\3\21\7\21\u00ff\n\21\f\21\16\21\u0102"+
		"\13\21\3\22\3\22\3\22\5\22\u0107\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u010e"+
		"\n\22\f\22\16\22\u0111\13\22\3\22\5\22\u0114\n\22\3\23\3\23\3\23\5\23"+
		"\u0119\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u0131\n\31\f\31"+
		"\16\31\u0134\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7"+
		"\31\u0140\n\31\f\31\16\31\u0143\13\31\3\31\3\31\5\31\u0147\n\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u016a\n\31\3\32\3\32\3\32\5\32\u016f\n\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u017d\n\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0183\n\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u0193\n\36\f\36\16\36\u0196\13"+
		"\36\3\36\5\36\u0199\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\5&\u01b9\n"+
		"&\3&\3&\3&\3&\3&\6&\u01c0\n&\r&\16&\u01c1\3&\3&\3&\3&\3&\5&\u01c9\n&\7"+
		"&\u01cb\n&\f&\16&\u01ce\13&\3&\5&\u01d1\n&\5&\u01d3\n&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\5&\u01df\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u01ff\n&\f&\16&\u0202"+
		"\13&\3\'\3\'\3\'\3\'\5\'\u0208\n\'\6\'\u020a\n\'\r\'\16\'\u020b\3\'\3"+
		"\'\3\'\3\'\5\'\u0212\n\'\7\'\u0214\n\'\f\'\16\'\u0217\13\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\6)\u0222\n)\r)\16)\u0223\3)\3)\3)\3)\3*\3*\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3,\2\3J-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTV\2\b\3\2GH\3\2JK\3\2\6\b\3\2\t\13\5\2\65"+
		"8;;OO\4\2\64\64OO\2\u0261\2Y\3\2\2\2\4]\3\2\2\2\6h\3\2\2\2\bs\3\2\2\2"+
		"\n~\3\2\2\2\f\u0086\3\2\2\2\16\u009a\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9"+
		"\3\2\2\2\24\u00ad\3\2\2\2\26\u00c0\3\2\2\2\30\u00cd\3\2\2\2\32\u00cf\3"+
		"\2\2\2\34\u00e5\3\2\2\2\36\u00f0\3\2\2\2 \u00fb\3\2\2\2\"\u0103\3\2\2"+
		"\2$\u0118\3\2\2\2&\u011a\3\2\2\2(\u011e\3\2\2\2*\u0122\3\2\2\2,\u0126"+
		"\3\2\2\2.\u012a\3\2\2\2\60\u0169\3\2\2\2\62\u016b\3\2\2\2\64\u0172\3\2"+
		"\2\2\66\u0178\3\2\2\28\u0187\3\2\2\2:\u0190\3\2\2\2<\u019a\3\2\2\2>\u01a0"+
		"\3\2\2\2@\u01a3\3\2\2\2B\u01a9\3\2\2\2D\u01ab\3\2\2\2F\u01ad\3\2\2\2H"+
		"\u01af\3\2\2\2J\u01de\3\2\2\2L\u0203\3\2\2\2N\u0218\3\2\2\2P\u021c\3\2"+
		"\2\2R\u0229\3\2\2\2T\u022d\3\2\2\2V\u0230\3\2\2\2XZ\5\4\3\2YX\3\2\2\2"+
		"Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\3\3\2\2\2]a\5\6\4\2^`\5\b\5\2_^\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bf\3\2\2\2ca\3\2\2\2dg\5\24\13\2eg\5"+
		"\n\6\2fd\3\2\2\2fe\3\2\2\2g\5\3\2\2\2hm\7\3\2\2ij\7O\2\2jl\7\4\2\2ki\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7O\2\2qr\7"+
		" \2\2r\7\3\2\2\2sx\7I\2\2tu\7O\2\2uw\7\4\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7O\2\2|}\7 \2\2}\t\3\2\2\2~\177\7"+
		"E\2\2\177\u0082\7O\2\2\u0080\u0081\7F\2\2\u0081\u0083\5\f\7\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\16\b\2"+
		"\u0085\13\3\2\2\2\u0086\u008b\7O\2\2\u0087\u0088\7\61\2\2\u0088\u008a"+
		"\5\f\7\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\r\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0092\7#\2\2"+
		"\u008f\u0091\5\16\b\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u009b\7$\2\2\u0096\u009b\5\20\t\2\u0097\u009b\5\n\6\2\u0098\u009b\5\24"+
		"\13\2\u0099\u009b\5\22\n\2\u009a\u008e\3\2\2\2\u009a\u0096\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\17\3\2\2"+
		"\2\u009c\u009d\t\2\2\2\u009d\u009e\5\34\17\2\u009e\u009f\7O\2\2\u009f"+
		"\u00a0\7\5\2\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2\5\60\31\2\u00a2\u00a8"+
		"\3\2\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a5\5\"\22\2\u00a5\u00a6\5\60\31"+
		"\2\u00a6\u00a8\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\21"+
		"\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7 \2\2"+
		"\u00ac\23\3\2\2\2\u00ad\u00ae\7D\2\2\u00ae\u00b1\7O\2\2\u00af\u00b0\7"+
		"F\2\2\u00b0\u00b2\5\f\7\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\5\26\f\2\u00b4\25\3\2\2\2\u00b5\u00b9\7#\2"+
		"\2\u00b6\u00b8\5\26\f\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00c1\7$\2\2\u00bd\u00c1\5\30\r\2\u00be\u00c1\5\24\13\2\u00bf"+
		"\u00c1\5\n\6\2\u00c0\u00b5\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\27\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\u00c4"+
		"\5\34\17\2\u00c4\u00c5\7O\2\2\u00c5\u00c6\7\5\2\2\u00c6\u00c7\5\"\22\2"+
		"\u00c7\u00c8\5\60\31\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca\5\34\17\2\u00ca"+
		"\u00cb\5\"\22\2\u00cb\u00cc\5\60\31\2\u00cc\u00ce\3\2\2\2\u00cd\u00c2"+
		"\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\5\34\17\2\u00d0"+
		"\u00d1\5\"\22\2\u00d1\u00d2\5\60\31\2\u00d2\33\3\2\2\2\u00d3\u00d6\5D"+
		"#\2\u00d4\u00d6\79\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00e6"+
		"\3\2\2\2\u00d7\u00da\7!\2\2\u00d8\u00db\5D#\2\u00d9\u00db\79\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e1\7\61"+
		"\2\2\u00dd\u00e0\5D#\2\u00de\u00e0\79\2\2\u00df\u00dd\3\2\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\7\"\2\2\u00e5\u00d5\3\2"+
		"\2\2\u00e5\u00d7\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\t\3\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\t\4"+
		"\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00ef\t\5\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\35\3\2\2"+
		"\2\u00f0\u00f1\5D#\2\u00f1\u00f8\7O\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4"+
		"\5D#\2\u00f4\u00f5\7O\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\37\3\2\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fb\u0100\7O\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00ff"+
		"\7O\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101!\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7O\2\2\u0104"+
		"\u0106\7!\2\2\u0105\u0107\5\36\20\2\u0106\u0105\3\2\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u0113\7\"\2\2\u0109\u010f\7\'\2\2\u010a"+
		"\u010b\5$\23\2\u010b\u010c\7 \2\2\u010c\u010e\3\2\2\2\u010d\u010a\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\7(\2\2\u0113\u0109\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114#\3\2\2\2\u0115\u0119\5&\24\2\u0116\u0119"+
		"\5(\25\2\u0117\u0119\5*\26\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119%\3\2\2\2\u011a\u011b\5F$\2\u011b\u011c\7\33\2\2\u011c"+
		"\u011d\5.\30\2\u011d\'\3\2\2\2\u011e\u011f\5F$\2\u011f\u0120\7\34\2\2"+
		"\u0120\u0121\5.\30\2\u0121)\3\2\2\2\u0122\u0123\5F$\2\u0123\u0124\7\35"+
		"\2\2\u0124\u0125\5.\30\2\u0125+\3\2\2\2\u0126\u0127\5F$\2\u0127\u0128"+
		"\7\f\2\2\u0128\u0129\5.\30\2\u0129-\3\2\2\2\u012a\u012b\7O\2\2\u012b\u012c"+
		"\7/\2\2\u012c\u012d\7O\2\2\u012d/\3\2\2\2\u012e\u0132\7#\2\2\u012f\u0131"+
		"\5\60\31\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u016a"+
		"\7$\2\2\u0136\u0137\5\62\32\2\u0137\u0138\7 \2\2\u0138\u016a\3\2\2\2\u0139"+
		"\u0146\7\37\2\2\u013a\u0147\5F$\2\u013b\u013c\7!\2\2\u013c\u0141\5F$\2"+
		"\u013d\u013e\7\61\2\2\u013e\u0140\5F$\2\u013f\u013d\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0145\7\"\2\2\u0145\u0147\3\2\2\2\u0146\u013a\3\2"+
		"\2\2\u0146\u013b\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u016a\7 \2\2\u0149\u014a\5$\23\2\u014a\u014b\7 \2\2\u014b\u016a\3\2\2"+
		"\2\u014c\u016a\5:\36\2\u014d\u016a\5\64\33\2\u014e\u016a\5\66\34\2\u014f"+
		"\u0150\5L\'\2\u0150\u0151\7 \2\2\u0151\u016a\3\2\2\2\u0152\u0153\5N(\2"+
		"\u0153\u0154\7 \2\2\u0154\u016a\3\2\2\2\u0155\u0156\5P)\2\u0156\u0157"+
		"\7 \2\2\u0157\u016a\3\2\2\2\u0158\u0159\5R*\2\u0159\u015a\7 \2\2\u015a"+
		"\u016a\3\2\2\2\u015b\u016a\5T+\2\u015c\u015d\5V,\2\u015d\u015e\7 \2\2"+
		"\u015e\u016a\3\2\2\2\u015f\u0160\5\24\13\2\u0160\u0161\7 \2\2\u0161\u016a"+
		"\3\2\2\2\u0162\u0163\5\n\6\2\u0163\u0164\7 \2\2\u0164\u016a\3\2\2\2\u0165"+
		"\u0166\5\32\16\2\u0166\u0167\7 \2\2\u0167\u016a\3\2\2\2\u0168\u016a\7"+
		" \2\2\u0169\u012e\3\2\2\2\u0169\u0136\3\2\2\2\u0169\u0139\3\2\2\2\u0169"+
		"\u0149\3\2\2\2\u0169\u014c\3\2\2\2\u0169\u014d\3\2\2\2\u0169\u014e\3\2"+
		"\2\2\u0169\u014f\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0155\3\2\2\2\u0169"+
		"\u0158\3\2\2\2\u0169\u015b\3\2\2\2\u0169\u015c\3\2\2\2\u0169\u015f\3\2"+
		"\2\2\u0169\u0162\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\61\3\2\2\2\u016b\u016c\7O\2\2\u016c\u016e\7!\2\2\u016d\u016f\5 \21\2"+
		"\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171"+
		"\7\"\2\2\u0171\63\3\2\2\2\u0172\u0173\7\r\2\2\u0173\u0174\7!\2\2\u0174"+
		"\u0175\5B\"\2\u0175\u0176\7\"\2\2\u0176\u0177\5\60\31\2\u0177\65\3\2\2"+
		"\2\u0178\u0179\7\16\2\2\u0179\u017a\7!\2\2\u017a\u017c\5\60\31\2\u017b"+
		"\u017d\7 \2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\5B\"\2\u017f\u0180\7 \2\2\u0180\u0182\5\60\31\2\u0181"+
		"\u0183\7 \2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0185\7\"\2\2\u0185\u0186\5\60\31\2\u0186\67\3\2\2\2\u0187"+
		"\u0188\7\16\2\2\u0188\u0189\7!\2\2\u0189\u018a\7O\2\2\u018a\u018b\7O\2"+
		"\2\u018b\u018c\7\17\2\2\u018c\u018d\7O\2\2\u018d\u018e\7\"\2\2\u018e\u018f"+
		"\5\60\31\2\u018f9\3\2\2\2\u0190\u0194\5<\37\2\u0191\u0193\5@!\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\5> \2\u0198\u0197"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199;\3\2\2\2\u019a\u019b\7\20\2\2\u019b"+
		"\u019c\7!\2\2\u019c\u019d\5B\"\2\u019d\u019e\7\"\2\2\u019e\u019f\5\60"+
		"\31\2\u019f=\3\2\2\2\u01a0\u01a1\7\21\2\2\u01a1\u01a2\5\60\31\2\u01a2"+
		"?\3\2\2\2\u01a3\u01a4\7\22\2\2\u01a4\u01a5\7!\2\2\u01a5\u01a6\5B\"\2\u01a6"+
		"\u01a7\7\"\2\2\u01a7\u01a8\5\60\31\2\u01a8A\3\2\2\2\u01a9\u01aa\5F$\2"+
		"\u01aaC\3\2\2\2\u01ab\u01ac\t\6\2\2\u01acE\3\2\2\2\u01ad\u01ae\5J&\2\u01ae"+
		"G\3\2\2\2\u01af\u01b0\t\7\2\2\u01b0I\3\2\2\2\u01b1\u01b2\b&\1\2\u01b2"+
		"\u01d2\5\62\32\2\u01b3\u01d0\7\17\2\2\u01b4\u01b5\5D#\2\u01b5\u01b6\7"+
		"O\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b9\7O\2\2\u01b8\u01b4\3\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01d1\3\2\2\2\u01ba\u01bf\7!\2\2\u01bb\u01bc\5D#"+
		"\2\u01bc\u01bd\7O\2\2\u01bd\u01c0\3\2\2\2\u01be\u01c0\7O\2\2\u01bf\u01bb"+
		"\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01cc\3\2\2\2\u01c3\u01c8\7\61\2\2\u01c4\u01c5\5"+
		"D#\2\u01c5\u01c6\7O\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c9\7O\2\2\u01c8\u01c4"+
		"\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c3\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\7\"\2\2\u01d0\u01b8\3\2\2\2\u01d0"+
		"\u01ba\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01b3\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01df\3\2\2\2\u01d4\u01d5\7!\2\2\u01d5\u01d6\5J&\2\u01d6\u01d7"+
		"\7\"\2\2\u01d7\u01df\3\2\2\2\u01d8\u01df\7\30\2\2\u01d9\u01df\7\31\2\2"+
		"\u01da\u01df\7\32\2\2\u01db\u01df\7L\2\2\u01dc\u01df\7M\2\2\u01dd\u01df"+
		"\5H%\2\u01de\u01b1\3\2\2\2\u01de\u01d4\3\2\2\2\u01de\u01d8\3\2\2\2\u01de"+
		"\u01d9\3\2\2\2\u01de\u01da\3\2\2\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01de\u01dd\3\2\2\2\u01df\u0200\3\2\2\2\u01e0\u01e1\f\r\2\2\u01e1"+
		"\u01e2\7\'\2\2\u01e2\u01ff\5J&\16\u01e3\u01e4\f\f\2\2\u01e4\u01e5\7\23"+
		"\2\2\u01e5\u01ff\5J&\r\u01e6\u01e7\f\13\2\2\u01e7\u01e8\7\24\2\2\u01e8"+
		"\u01ff\5J&\f\u01e9\u01ea\f\n\2\2\u01ea\u01eb\7(\2\2\u01eb\u01ff\5J&\13"+
		"\u01ec\u01ed\f\t\2\2\u01ed\u01ee\7\35\2\2\u01ee\u01ff\5J&\n\u01ef\u01f0"+
		"\f\b\2\2\u01f0\u01f1\7\f\2\2\u01f1\u01ff\5J&\t\u01f2\u01f3\f\7\2\2\u01f3"+
		"\u01f4\7*\2\2\u01f4\u01ff\5J&\b\u01f5\u01f6\f\6\2\2\u01f6\u01f7\7+\2\2"+
		"\u01f7\u01ff\5J&\7\u01f8\u01f9\f\5\2\2\u01f9\u01fa\7)\2\2\u01fa\u01ff"+
		"\5J&\6\u01fb\u01fc\f\4\2\2\u01fc\u01fd\7,\2\2\u01fd\u01ff\5J&\5\u01fe"+
		"\u01e0\3\2\2\2\u01fe\u01e3\3\2\2\2\u01fe\u01e6\3\2\2\2\u01fe\u01e9\3\2"+
		"\2\2\u01fe\u01ec\3\2\2\2\u01fe\u01ef\3\2\2\2\u01fe\u01f2\3\2\2\2\u01fe"+
		"\u01f5\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe\u01fb\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201K\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0209\5D#\2\u0204\u0207\7O\2\2\u0205\u0206\7\36\2\2\u0206"+
		"\u0208\5F$\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2"+
		"\2\u0209\u0204\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u0215\3\2\2\2\u020d\u020e\7\61\2\2\u020e\u0211\7O\2\2\u020f"+
		"\u0210\7\36\2\2\u0210\u0212\5F$\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\3\2\2\2\u0213\u020d\3\2\2\2\u0214\u0217\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216M\3\2\2\2\u0217\u0215\3\2\2\2"+
		"\u0218\u0219\7O\2\2\u0219\u021a\7\36\2\2\u021a\u021b\5F$\2\u021bO\3\2"+
		"\2\2\u021c\u0221\7!\2\2\u021d\u0222\7O\2\2\u021e\u021f\5D#\2\u021f\u0220"+
		"\7O\2\2\u0220\u0222\3\2\2\2\u0221\u021d\3\2\2\2\u0221\u021e\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0226\7\"\2\2\u0226\u0227\7\36\2\2\u0227\u0228\5F$\2\u0228"+
		"Q\3\2\2\2\u0229\u022a\7O\2\2\u022a\u022b\7\25\2\2\u022b\u022c\7O\2\2\u022c"+
		"S\3\2\2\2\u022d\u022e\7O\2\2\u022e\u022f\7\26\2\2\u022fU\3\2\2\2\u0230"+
		"\u0231\7O\2\2\u0231\u0232\7\27\2\2\u0232W\3\2\2\2\67[afmx\u0082\u008b"+
		"\u0092\u009a\u00a7\u00b1\u00b9\u00c0\u00cd\u00d5\u00da\u00df\u00e1\u00e5"+
		"\u00e8\u00eb\u00ee\u00f8\u0100\u0106\u010f\u0113\u0118\u0132\u0141\u0146"+
		"\u0169\u016e\u017c\u0182\u0194\u0198\u01b8\u01bf\u01c1\u01c8\u01cc\u01d0"+
		"\u01d2\u01de\u01fe\u0200\u0207\u020b\u0211\u0215\u0221\u0223";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}