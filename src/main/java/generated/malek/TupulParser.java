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
		T__17=18, T__18=19, T__19=20, INTEGER=21, FLOAT=22, DOUBLE=23, PLUS_EQUALS=24, 
		MINUS_EQUALS=25, DOUBLE_EQUALS_LIST=26, EQUALS_LIT=27, RETURN_LIT=28, 
		SEMICOLON=29, LEFT_PAREN=30, RIGHT_PAREN=31, LEFT_CURLY=32, RIGHT_CURLY=33, 
		LEFT_SQUARE=34, RIGHT_SQUARE=35, LEFT_ANGLE=36, RIGHT_ANGLE=37, ADD_OP=38, 
		MULTI_OP=39, DIV_OP=40, SUB_OP=41, SINGLE_OR=42, SINGLE_AND=43, HASHTAG=44, 
		POINTER=45, COMMA=46, DOUBLE_OR=47, DOUBLE_AND=48, THIS_KEYWORD=49, INT_TYPE=50, 
		FLOAT_TYPE=51, DOUBLE_TYPE=52, CHAR_TYPE=53, VOID_TYPE=54, BOOL_TYPE=55, 
		STRING_TYPE=56, NULL_TYPE=57, FALSE_KEYWORD=58, TRUE_KEYWORD=59, UNION_KEYWORD=60, 
		INSTANCEOF_KEYWORD=61, SUBSET_KEYWORD=62, STRICT_SUBSET_KEYWORD=63, SUPERSET_KEYWORD=64, 
		TYPE=65, INTERFACE=66, EXTENDS=67, OVERRIDE=68, IMPLEMENT=69, IMPORT=70, 
		PUBLIC=71, PRIVATE=72, CHAR=73, STRING=74, WHITESPACE=75, IDENTIFIER=76;
	public static final int
		RULE_file = 0, RULE_importSomething = 1, RULE_fromDependency = 2, RULE_interfaceDeclaration = 3, 
		RULE_interfaceExtensions = 4, RULE_interfaceExtensionName = 5, RULE_interfaceCodeBlock = 6, 
		RULE_interfaceFunctionDeclaration = 7, RULE_interfaceAbstractFuncDec = 8, 
		RULE_typeDeclaration = 9, RULE_typeCodeBlock = 10, RULE_typeFunctionDeclaration = 11, 
		RULE_universalFunctionPost = 12, RULE_functionWithinFunctionDec = 13, 
		RULE_universalFunctionModifiers = 14, RULE_typeWithVoid = 15, RULE_functionDecArguments = 16, 
		RULE_functionCallArguments = 17, RULE_universalPostIdentifierFuncDec = 18, 
		RULE_functionTagOperation = 19, RULE_functionTagAppend = 20, RULE_functionTagRemove = 21, 
		RULE_functionTagEquals = 22, RULE_functionTagNotEquals = 23, RULE_tagID = 24, 
		RULE_functionCodeBlock = 25, RULE_functionCall = 26, RULE_whileLoop = 27, 
		RULE_forLoop = 28, RULE_specialForLoop = 29, RULE_chainedIfStatement = 30, 
		RULE_ifStatement = 31, RULE_elseStatement = 32, RULE_elseIfStatement = 33, 
		RULE_conditional = 34, RULE_type = 35, RULE_finalValue = 36, RULE_varID = 37, 
		RULE_intermediateValue = 38, RULE_variableDeclaration = 39, RULE_singleVarDec = 40, 
		RULE_multiVarDec = 41, RULE_singleVarAssignment = 42, RULE_multiVarAssignment = 43, 
		RULE_variableSwap = 44, RULE_variableIncrement = 45, RULE_variableDecrement = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "importSomething", "fromDependency", "interfaceDeclaration", 
			"interfaceExtensions", "interfaceExtensionName", "interfaceCodeBlock", 
			"interfaceFunctionDeclaration", "interfaceAbstractFuncDec", "typeDeclaration", 
			"typeCodeBlock", "typeFunctionDeclaration", "universalFunctionPost", 
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
			null, "'from'", "'::'", "'fluid'", "'const'", "'fixed'", "'dirty'", "'tidy'", 
			"'pure'", "'!='", "'while'", "'for'", "':'", "'if'", "'else'", "'else if'", 
			"'<='", "'>='", "'<->'", "'++'", "'--'", null, null, null, "'+='", "'-='", 
			"'=='", "'='", "'return'", "';'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'<'", "'>'", "'+'", "'*'", "'/'", "'-'", "'|'", "'&'", "'#'", 
			"'@'", "','", "'||'", "'&&'", "'this'", "'int'", "'float'", "'double'", 
			"'char'", "'void'", "'bool'", "'string'", "'null'", "'false'", "'true'", 
			"'union'", "'instanceof'", "'subset'", "'strictsubset'", "'superset'", 
			"'type'", "'interface'", "'extends'", "'override'", "'implement'", "'import'", 
			"'public'", "'private'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INTEGER", "FLOAT", 
			"DOUBLE", "PLUS_EQUALS", "MINUS_EQUALS", "DOUBLE_EQUALS_LIST", "EQUALS_LIT", 
			"RETURN_LIT", "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_CURLY", 
			"RIGHT_CURLY", "LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_ANGLE", "RIGHT_ANGLE", 
			"ADD_OP", "MULTI_OP", "DIV_OP", "SUB_OP", "SINGLE_OR", "SINGLE_AND", 
			"HASHTAG", "POINTER", "COMMA", "DOUBLE_OR", "DOUBLE_AND", "THIS_KEYWORD", 
			"INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "VOID_TYPE", "BOOL_TYPE", 
			"STRING_TYPE", "NULL_TYPE", "FALSE_KEYWORD", "TRUE_KEYWORD", "UNION_KEYWORD", 
			"INSTANCEOF_KEYWORD", "SUBSET_KEYWORD", "STRICT_SUBSET_KEYWORD", "SUPERSET_KEYWORD", 
			"TYPE", "INTERFACE", "EXTENDS", "OVERRIDE", "IMPLEMENT", "IMPORT", "PUBLIC", 
			"PRIVATE", "CHAR", "STRING", "WHITESPACE", "IDENTIFIER"
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

	public static class FileContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<FromDependencyContext> fromDependency() {
			return getRuleContexts(FromDependencyContext.class);
		}
		public FromDependencyContext fromDependency(int i) {
			return getRuleContext(FromDependencyContext.class,i);
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
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(94);
				fromDependency();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(100);
				importSomething();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(106);
				typeDeclaration();
				}
				break;
			case INTERFACE:
				{
				setState(107);
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

	public static class ImportSomethingContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(TupulParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(TupulParser.STRING, 0); }
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
		enterRule(_localctx, 2, RULE_importSomething);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IMPORT);
			setState(111);
			match(STRING);
			setState(112);
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

	public static class FromDependencyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TupulParser.STRING, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<ImportSomethingContext> importSomething() {
			return getRuleContexts(ImportSomethingContext.class);
		}
		public ImportSomethingContext importSomething(int i) {
			return getRuleContext(ImportSomethingContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TupulParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TupulParser.SEMICOLON, i);
		}
		public FromDependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromDependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFromDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFromDependency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFromDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromDependencyContext fromDependency() throws RecognitionException {
		FromDependencyContext _localctx = new FromDependencyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fromDependency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
			setState(115);
			match(STRING);
			setState(116);
			match(LEFT_CURLY);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(117);
				importSomething();
				setState(118);
				match(SEMICOLON);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(RIGHT_CURLY);
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
		enterRule(_localctx, 6, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(INTERFACE);
			setState(128);
			match(IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(129);
				match(EXTENDS);
				setState(130);
				interfaceExtensions();
				}
			}

			setState(133);
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
		enterRule(_localctx, 8, RULE_interfaceExtensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENTIFIER);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				interfaceExtensionName();
				}
				}
				setState(141);
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
		enterRule(_localctx, 10, RULE_interfaceExtensionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(COMMA);
			setState(143);
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
		enterRule(_localctx, 12, RULE_interfaceCodeBlock);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(LEFT_CURLY);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (LEFT_PAREN - 30)) | (1L << (LEFT_CURLY - 30)) | (1L << (INT_TYPE - 30)) | (1L << (FLOAT_TYPE - 30)) | (1L << (DOUBLE_TYPE - 30)) | (1L << (CHAR_TYPE - 30)) | (1L << (VOID_TYPE - 30)) | (1L << (STRING_TYPE - 30)) | (1L << (TYPE - 30)) | (1L << (INTERFACE - 30)) | (1L << (OVERRIDE - 30)) | (1L << (IMPLEMENT - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					{
					setState(146);
					interfaceCodeBlock();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				variableDeclaration();
				setState(154);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				interfaceFunctionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				typeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
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
		enterRule(_localctx, 14, RULE_interfaceFunctionDeclaration);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				universalFunctionModifiers();
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(T__1);
				setState(166);
				universalFunctionPost();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
		enterRule(_localctx, 16, RULE_interfaceAbstractFuncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			universalFunctionModifiers();
			setState(172);
			universalPostIdentifierFuncDec();
			setState(173);
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
			setState(175);
			match(TYPE);
			setState(176);
			match(IDENTIFIER);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(177);
				match(EXTENDS);
				setState(178);
				interfaceExtensions();
				}
			}

			setState(181);
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
		enterRule(_localctx, 20, RULE_typeCodeBlock);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(LEFT_CURLY);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (LEFT_PAREN - 30)) | (1L << (LEFT_CURLY - 30)) | (1L << (INT_TYPE - 30)) | (1L << (FLOAT_TYPE - 30)) | (1L << (DOUBLE_TYPE - 30)) | (1L << (CHAR_TYPE - 30)) | (1L << (VOID_TYPE - 30)) | (1L << (STRING_TYPE - 30)) | (1L << (TYPE - 30)) | (1L << (INTERFACE - 30)) | (1L << (OVERRIDE - 30)) | (1L << (IMPLEMENT - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					{
					setState(184);
					typeCodeBlock();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				typeFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				typeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				variableDeclaration();
				setState(195);
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
		enterRule(_localctx, 22, RULE_typeFunctionDeclaration);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				universalFunctionModifiers();
				setState(201);
				match(IDENTIFIER);
				setState(202);
				match(T__1);
				setState(203);
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
				setState(205);
				universalFunctionModifiers();
				setState(206);
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
		enterRule(_localctx, 24, RULE_universalFunctionPost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			universalPostIdentifierFuncDec();
			setState(211);
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
		enterRule(_localctx, 26, RULE_functionWithinFunctionDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			universalFunctionModifiers();
			setState(214);
			universalPostIdentifierFuncDec();
			setState(215);
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
		enterRule(_localctx, 28, RULE_universalFunctionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
				setState(217);
				typeWithVoid();
				}
				break;
			case LEFT_PAREN:
				{
				setState(218);
				match(LEFT_PAREN);
				setState(219);
				typeWithVoid();
				{
				setState(220);
				match(COMMA);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INT_TYPE - 50)) | (1L << (FLOAT_TYPE - 50)) | (1L << (DOUBLE_TYPE - 50)) | (1L << (CHAR_TYPE - 50)) | (1L << (VOID_TYPE - 50)) | (1L << (STRING_TYPE - 50)) | (1L << (IDENTIFIER - 50)))) != 0)) {
					{
					{
					setState(221);
					typeWithVoid();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(227);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(231);
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

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(234);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(237);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_typeWithVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case IDENTIFIER:
				{
				setState(240);
				type();
				}
				break;
			case VOID_TYPE:
				{
				setState(241);
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
		enterRule(_localctx, 32, RULE_functionDecArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			type();
			setState(245);
			match(IDENTIFIER);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246);
				match(COMMA);
				setState(247);
				type();
				setState(248);
				match(IDENTIFIER);
				}
				}
				setState(254);
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
		enterRule(_localctx, 34, RULE_functionCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFIER);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				match(IDENTIFIER);
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
		enterRule(_localctx, 36, RULE_universalPostIdentifierFuncDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(IDENTIFIER);
			setState(264);
			match(LEFT_PAREN);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INT_TYPE - 50)) | (1L << (FLOAT_TYPE - 50)) | (1L << (DOUBLE_TYPE - 50)) | (1L << (CHAR_TYPE - 50)) | (1L << (STRING_TYPE - 50)) | (1L << (IDENTIFIER - 50)))) != 0)) {
				{
				setState(265);
				functionDecArguments();
				}
			}

			setState(268);
			match(RIGHT_PAREN);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANGLE) {
				{
				setState(269);
				match(LEFT_ANGLE);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INTEGER - 21)) | (1L << (FLOAT - 21)) | (1L << (DOUBLE - 21)) | (1L << (LEFT_PAREN - 21)) | (1L << (THIS_KEYWORD - 21)) | (1L << (CHAR - 21)) | (1L << (STRING - 21)) | (1L << (IDENTIFIER - 21)))) != 0)) {
					{
					{
					setState(270);
					functionTagOperation();
					setState(271);
					match(SEMICOLON);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
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
		enterRule(_localctx, 38, RULE_functionTagOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(281);
				functionTagAppend();
				}
				break;
			case 2:
				{
				setState(282);
				functionTagRemove();
				}
				break;
			case 3:
				{
				setState(283);
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
		enterRule(_localctx, 40, RULE_functionTagAppend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			finalValue();
			setState(287);
			match(PLUS_EQUALS);
			setState(288);
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
		enterRule(_localctx, 42, RULE_functionTagRemove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			finalValue();
			setState(291);
			match(MINUS_EQUALS);
			setState(292);
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
		enterRule(_localctx, 44, RULE_functionTagEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			finalValue();
			setState(295);
			match(DOUBLE_EQUALS_LIST);
			setState(296);
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
		enterRule(_localctx, 46, RULE_functionTagNotEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			finalValue();
			setState(299);
			match(T__8);
			setState(300);
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
		enterRule(_localctx, 48, RULE_tagID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(IDENTIFIER);
			setState(303);
			match(HASHTAG);
			setState(304);
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
		enterRule(_localctx, 50, RULE_functionCodeBlock);
		int _la;
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(LEFT_CURLY);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << RETURN_LIT) | (1L << SEMICOLON) | (1L << LEFT_PAREN) | (1L << LEFT_CURLY) | (1L << THIS_KEYWORD) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << STRING_TYPE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TYPE - 65)) | (1L << (INTERFACE - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(307);
					functionCodeBlock();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				functionCall();
				setState(315);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(RETURN_LIT);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(318);
					finalValue();
					}
					break;
				case 2:
					{
					setState(319);
					match(LEFT_PAREN);
					setState(320);
					finalValue();
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(321);
						match(COMMA);
						setState(322);
						finalValue();
						}
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(328);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(332);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				functionTagOperation();
				setState(334);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				chainedIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				forLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				singleVarDec();
				setState(340);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				singleVarAssignment();
				setState(343);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(345);
				multiVarAssignment();
				setState(346);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(348);
				variableSwap();
				setState(349);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(351);
				variableIncrement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(352);
				variableDecrement();
				setState(353);
				match(SEMICOLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(355);
				typeDeclaration();
				setState(356);
				match(SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(358);
				interfaceDeclaration();
				setState(359);
				match(SEMICOLON);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(361);
				functionWithinFunctionDec();
				setState(362);
				match(SEMICOLON);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(364);
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
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IDENTIFIER);
			setState(368);
			match(LEFT_PAREN);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(369);
				functionCallArguments();
				}
			}

			setState(372);
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
		enterRule(_localctx, 54, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__9);
			setState(375);
			match(LEFT_PAREN);
			setState(376);
			conditional();
			setState(377);
			match(RIGHT_PAREN);
			setState(378);
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
		enterRule(_localctx, 56, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__10);
			setState(381);
			match(LEFT_PAREN);
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
			conditional();
			setState(387);
			match(SEMICOLON);
			setState(388);
			functionCodeBlock();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(389);
				match(SEMICOLON);
				}
			}

			setState(392);
			match(RIGHT_PAREN);
			setState(393);
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
		enterRule(_localctx, 58, RULE_specialForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__10);
			setState(396);
			match(LEFT_PAREN);
			setState(397);
			match(IDENTIFIER);
			setState(398);
			match(IDENTIFIER);
			setState(399);
			match(T__11);
			setState(400);
			match(IDENTIFIER);
			setState(401);
			match(RIGHT_PAREN);
			setState(402);
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
		enterRule(_localctx, 60, RULE_chainedIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			ifStatement();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					elseIfStatement();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(411);
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
		enterRule(_localctx, 62, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__12);
			setState(415);
			match(LEFT_PAREN);
			setState(416);
			conditional();
			setState(417);
			match(RIGHT_PAREN);
			setState(418);
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
		enterRule(_localctx, 64, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__13);
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
		enterRule(_localctx, 66, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__14);
			setState(424);
			match(LEFT_PAREN);
			setState(425);
			conditional();
			setState(426);
			match(RIGHT_PAREN);
			setState(427);
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
		enterRule(_localctx, 68, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 70, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INT_TYPE - 50)) | (1L << (FLOAT_TYPE - 50)) | (1L << (DOUBLE_TYPE - 50)) | (1L << (CHAR_TYPE - 50)) | (1L << (STRING_TYPE - 50)) | (1L << (IDENTIFIER - 50)))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 74, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_intermediateValue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(438);
				functionCall();
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(439);
					match(T__11);
					setState(468);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case FLOAT_TYPE:
					case DOUBLE_TYPE:
					case CHAR_TYPE:
					case STRING_TYPE:
					case IDENTIFIER:
						{
						setState(444);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(440);
							type();
							setState(441);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(443);
							match(IDENTIFIER);
							}
							break;
						}
						}
						break;
					case LEFT_PAREN:
						{
						setState(446);
						match(LEFT_PAREN);
						{
						setState(451); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
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
							setState(453); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INT_TYPE - 50)) | (1L << (FLOAT_TYPE - 50)) | (1L << (DOUBLE_TYPE - 50)) | (1L << (CHAR_TYPE - 50)) | (1L << (STRING_TYPE - 50)) | (1L << (IDENTIFIER - 50)))) != 0) );
						setState(464);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(455);
							match(COMMA);
							setState(460);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
							case 1:
								{
								setState(456);
								type();
								setState(457);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(459);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							setState(466);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						setState(467);
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
				setState(472);
				match(LEFT_PAREN);
				setState(473);
				intermediateValue(0);
				setState(474);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(476);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(477);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(478);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				setState(479);
				match(CHAR);
				}
				break;
			case 7:
				{
				setState(480);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(481);
				varID();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(484);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(485);
						match(LEFT_ANGLE);
						setState(486);
						intermediateValue(12);
						}
						break;
					case 2:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(487);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(488);
						match(T__15);
						setState(489);
						intermediateValue(11);
						}
						break;
					case 3:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(490);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(491);
						match(T__16);
						setState(492);
						intermediateValue(10);
						}
						break;
					case 4:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(493);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(494);
						match(RIGHT_ANGLE);
						setState(495);
						intermediateValue(9);
						}
						break;
					case 5:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(496);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(497);
						match(DOUBLE_EQUALS_LIST);
						setState(498);
						intermediateValue(8);
						}
						break;
					case 6:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(499);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(500);
						match(T__8);
						setState(501);
						intermediateValue(7);
						}
						break;
					case 7:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(502);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(503);
						match(MULTI_OP);
						setState(504);
						intermediateValue(6);
						}
						break;
					case 8:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(505);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(506);
						match(DIV_OP);
						setState(507);
						intermediateValue(5);
						}
						break;
					case 9:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(508);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(509);
						match(ADD_OP);
						setState(510);
						intermediateValue(4);
						}
						break;
					case 10:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(511);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(512);
						match(SUB_OP);
						setState(513);
						intermediateValue(3);
						}
						break;
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 78, RULE_variableDeclaration);
		try {
			setState(521);
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
				setState(519);
				singleVarDec();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
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
		enterRule(_localctx, 80, RULE_singleVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			type();
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
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
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(533);
				match(COMMA);
				setState(534);
				match(IDENTIFIER);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_LIT) {
					{
					setState(535);
					match(EQUALS_LIT);
					setState(536);
					finalValue();
					}
				}

				}
				}
				setState(543);
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
		enterRule(_localctx, 82, RULE_multiVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(LEFT_PAREN);
			setState(548); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(545);
				type();
				setState(546);
				match(IDENTIFIER);
				}
				}
				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INT_TYPE - 50)) | (1L << (FLOAT_TYPE - 50)) | (1L << (DOUBLE_TYPE - 50)) | (1L << (CHAR_TYPE - 50)) | (1L << (STRING_TYPE - 50)) | (1L << (IDENTIFIER - 50)))) != 0) );
			setState(552);
			match(RIGHT_PAREN);
			setState(553);
			match(EQUALS_LIT);
			setState(554);
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
		enterRule(_localctx, 84, RULE_singleVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(IDENTIFIER);
			setState(557);
			match(EQUALS_LIT);
			setState(558);
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
		enterRule(_localctx, 86, RULE_multiVarAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(LEFT_PAREN);
			setState(565); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(561);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(562);
					type();
					setState(563);
					match(IDENTIFIER);
					}
					break;
				}
				}
				setState(567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (INT_TYPE - 50)) | (1L << (FLOAT_TYPE - 50)) | (1L << (DOUBLE_TYPE - 50)) | (1L << (CHAR_TYPE - 50)) | (1L << (STRING_TYPE - 50)) | (1L << (IDENTIFIER - 50)))) != 0) );
			setState(569);
			match(RIGHT_PAREN);
			setState(570);
			match(EQUALS_LIT);
			setState(571);
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
		enterRule(_localctx, 88, RULE_variableSwap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(IDENTIFIER);
			setState(574);
			match(T__17);
			setState(575);
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
		enterRule(_localctx, 90, RULE_variableIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(IDENTIFIER);
			setState(578);
			match(T__18);
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
		enterRule(_localctx, 92, RULE_variableDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(IDENTIFIER);
			setState(581);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u024a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\7\2h"+
		"\n\2\f\2\16\2k\13\2\3\2\3\2\5\2o\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4{\n\4\f\4\16\4~\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0086\n\5\3"+
		"\5\3\5\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\7\3\7\3\7\3\b\3\b\7"+
		"\b\u0096\n\b\f\b\16\b\u0099\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a3"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13\u00b6\n\13\3\13\3\13\3\f\3\f\7\f\u00bc\n\f\f\f\16\f"+
		"\u00bf\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00d3\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20\3\20"+
		"\3\20\5\20\u00e8\n\20\3\20\5\20\u00eb\n\20\3\20\5\20\u00ee\n\20\3\20\5"+
		"\20\u00f1\n\20\3\21\3\21\5\21\u00f5\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\23\3\23\3\23\7\23\u0105\n\23"+
		"\f\23\16\23\u0108\13\23\3\24\3\24\3\24\5\24\u010d\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0114\n\24\f\24\16\24\u0117\13\24\3\24\5\24\u011a\n\24"+
		"\3\25\3\25\3\25\5\25\u011f\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\7\33\u0137\n\33\f\33\16\33\u013a\13\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0146\n\33\f\33\16\33\u0149\13\33\3\33\3\33"+
		"\5\33\u014d\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0170\n\33\3\34\3\34\3\34"+
		"\5\34\u0175\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\5\36\u0183\n\36\3\36\3\36\3\36\3\36\5\36\u0189\n\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u0199\n \f "+
		"\16 \u019c\13 \3 \5 \u019f\n \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u01bf\n(\3("+
		"\3(\3(\3(\3(\6(\u01c6\n(\r(\16(\u01c7\3(\3(\3(\3(\3(\5(\u01cf\n(\7(\u01d1"+
		"\n(\f(\16(\u01d4\13(\3(\5(\u01d7\n(\5(\u01d9\n(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u01e5\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0205\n(\f(\16(\u0208\13("+
		"\3)\3)\5)\u020c\n)\3*\3*\3*\3*\5*\u0212\n*\6*\u0214\n*\r*\16*\u0215\3"+
		"*\3*\3*\3*\5*\u021c\n*\7*\u021e\n*\f*\16*\u0221\13*\3+\3+\3+\3+\6+\u0227"+
		"\n+\r+\16+\u0228\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\6-\u0238\n-\r"+
		"-\16-\u0239\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\2\3N"+
		"\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^\2\b\3\2FG\3\2IJ\3\2\5\7\3\2\b\n\5\2\64\67::NN\4\2\63\63"+
		"NN\2\u0274\2c\3\2\2\2\4p\3\2\2\2\6t\3\2\2\2\b\u0081\3\2\2\2\n\u0089\3"+
		"\2\2\2\f\u0090\3\2\2\2\16\u00a2\3\2\2\2\20\u00ab\3\2\2\2\22\u00ad\3\2"+
		"\2\2\24\u00b1\3\2\2\2\26\u00c7\3\2\2\2\30\u00d2\3\2\2\2\32\u00d4\3\2\2"+
		"\2\34\u00d7\3\2\2\2\36\u00e7\3\2\2\2 \u00f4\3\2\2\2\"\u00f6\3\2\2\2$\u0101"+
		"\3\2\2\2&\u0109\3\2\2\2(\u011e\3\2\2\2*\u0120\3\2\2\2,\u0124\3\2\2\2."+
		"\u0128\3\2\2\2\60\u012c\3\2\2\2\62\u0130\3\2\2\2\64\u016f\3\2\2\2\66\u0171"+
		"\3\2\2\28\u0178\3\2\2\2:\u017e\3\2\2\2<\u018d\3\2\2\2>\u0196\3\2\2\2@"+
		"\u01a0\3\2\2\2B\u01a6\3\2\2\2D\u01a9\3\2\2\2F\u01af\3\2\2\2H\u01b1\3\2"+
		"\2\2J\u01b3\3\2\2\2L\u01b5\3\2\2\2N\u01e4\3\2\2\2P\u020b\3\2\2\2R\u020d"+
		"\3\2\2\2T\u0222\3\2\2\2V\u022e\3\2\2\2X\u0232\3\2\2\2Z\u023f\3\2\2\2\\"+
		"\u0243\3\2\2\2^\u0246\3\2\2\2`b\5\6\4\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2di\3\2\2\2ec\3\2\2\2fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2jn\3\2\2\2ki\3\2\2\2lo\5\24\13\2mo\5\b\5\2nl\3\2\2\2nm\3\2\2"+
		"\2o\3\3\2\2\2pq\7H\2\2qr\7L\2\2rs\7\37\2\2s\5\3\2\2\2tu\7\3\2\2uv\7L\2"+
		"\2v|\7\"\2\2wx\5\4\3\2xy\7\37\2\2y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7#\2\2\u0080\7\3\2\2\2"+
		"\u0081\u0082\7D\2\2\u0082\u0085\7N\2\2\u0083\u0084\7E\2\2\u0084\u0086"+
		"\5\n\6\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\5\16\b\2\u0088\t\3\2\2\2\u0089\u008d\7N\2\2\u008a\u008c\5\f\7\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\13\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\60\2\2\u0091"+
		"\u0092\7N\2\2\u0092\r\3\2\2\2\u0093\u0097\7\"\2\2\u0094\u0096\5\16\b\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a3\7#\2\2\u009b"+
		"\u009c\5P)\2\u009c\u009d\7\37\2\2\u009d\u00a3\3\2\2\2\u009e\u00a3\5\20"+
		"\t\2\u009f\u00a3\5\b\5\2\u00a0\u00a3\5\24\13\2\u00a1\u00a3\5\22\n\2\u00a2"+
		"\u0093\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5"+
		"\t\2\2\2\u00a5\u00a6\5\36\20\2\u00a6\u00a7\7N\2\2\u00a7\u00a8\7\4\2\2"+
		"\u00a8\u00a9\5\32\16\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\5\32\16\2\u00ab"+
		"\u00a4\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\5\36\20"+
		"\2\u00ae\u00af\5&\24\2\u00af\u00b0\7\37\2\2\u00b0\23\3\2\2\2\u00b1\u00b2"+
		"\7C\2\2\u00b2\u00b5\7N\2\2\u00b3\u00b4\7E\2\2\u00b4\u00b6\5\n\6\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\26"+
		"\f\2\u00b8\25\3\2\2\2\u00b9\u00bd\7\"\2\2\u00ba\u00bc\5\26\f\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c8\7#\2\2\u00c1\u00c8\5\30"+
		"\r\2\u00c2\u00c8\5\24\13\2\u00c3\u00c8\5\b\5\2\u00c4\u00c5\5P)\2\u00c5"+
		"\u00c6\7\37\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00c1\3"+
		"\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8"+
		"\27\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\7N\2"+
		"\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00d3\3\2\2\2\u00cf"+
		"\u00d0\5\36\20\2\u00d0\u00d1\5\32\16\2\u00d1\u00d3\3\2\2\2\u00d2\u00c9"+
		"\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\5&\24\2\u00d5"+
		"\u00d6\5\64\33\2\u00d6\33\3\2\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\5"+
		"&\24\2\u00d9\u00da\5\64\33\2\u00da\35\3\2\2\2\u00db\u00e8\5 \21\2\u00dc"+
		"\u00dd\7 \2\2\u00dd\u00de\5 \21\2\u00de\u00e2\7\60\2\2\u00df\u00e1\5 "+
		"\21\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7!"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00eb\t\3\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f5\5H%\2\u00f3\u00f5"+
		"\78\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5!\3\2\2\2\u00f6\u00f7"+
		"\5H%\2\u00f7\u00fe\7N\2\2\u00f8\u00f9\7\60\2\2\u00f9\u00fa\5H%\2\u00fa"+
		"\u00fb\7N\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff#\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0106\7N\2\2\u0102\u0103\7\60\2\2\u0103\u0105\7N\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107%\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7N\2\2\u010a\u010c"+
		"\7 \2\2\u010b\u010d\5\"\22\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0119\7!\2\2\u010f\u0115\7&\2\2\u0110\u0111\5(\25"+
		"\2\u0111\u0112\7\37\2\2\u0112\u0114\3\2\2\2\u0113\u0110\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\'\2\2\u0119\u010f\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\'\3\2\2\2\u011b\u011f\5*\26\2\u011c\u011f\5,\27\2"+
		"\u011d\u011f\5.\30\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d"+
		"\3\2\2\2\u011f)\3\2\2\2\u0120\u0121\5J&\2\u0121\u0122\7\32\2\2\u0122\u0123"+
		"\5\62\32\2\u0123+\3\2\2\2\u0124\u0125\5J&\2\u0125\u0126\7\33\2\2\u0126"+
		"\u0127\5\62\32\2\u0127-\3\2\2\2\u0128\u0129\5J&\2\u0129\u012a\7\34\2\2"+
		"\u012a\u012b\5\62\32\2\u012b/\3\2\2\2\u012c\u012d\5J&\2\u012d\u012e\7"+
		"\13\2\2\u012e\u012f\5\62\32\2\u012f\61\3\2\2\2\u0130\u0131\7N\2\2\u0131"+
		"\u0132\7.\2\2\u0132\u0133\7N\2\2\u0133\63\3\2\2\2\u0134\u0138\7\"\2\2"+
		"\u0135\u0137\5\64\33\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u0170\7#\2\2\u013c\u013d\5\66\34\2\u013d\u013e\7\37\2\2\u013e\u0170\3"+
		"\2\2\2\u013f\u014c\7\36\2\2\u0140\u014d\5J&\2\u0141\u0142\7 \2\2\u0142"+
		"\u0147\5J&\2\u0143\u0144\7\60\2\2\u0144\u0146\5J&\2\u0145\u0143\3\2\2"+
		"\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7!\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u0140\3\2\2\2\u014c\u0141\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0170\7\37\2\2\u014f\u0150\5(\25\2\u0150\u0151\7\37\2\2\u0151"+
		"\u0170\3\2\2\2\u0152\u0170\5> \2\u0153\u0170\58\35\2\u0154\u0170\5:\36"+
		"\2\u0155\u0156\5R*\2\u0156\u0157\7\37\2\2\u0157\u0170\3\2\2\2\u0158\u0159"+
		"\5V,\2\u0159\u015a\7\37\2\2\u015a\u0170\3\2\2\2\u015b\u015c\5X-\2\u015c"+
		"\u015d\7\37\2\2\u015d\u0170\3\2\2\2\u015e\u015f\5Z.\2\u015f\u0160\7\37"+
		"\2\2\u0160\u0170\3\2\2\2\u0161\u0170\5\\/\2\u0162\u0163\5^\60\2\u0163"+
		"\u0164\7\37\2\2\u0164\u0170\3\2\2\2\u0165\u0166\5\24\13\2\u0166\u0167"+
		"\7\37\2\2\u0167\u0170\3\2\2\2\u0168\u0169\5\b\5\2\u0169\u016a\7\37\2\2"+
		"\u016a\u0170\3\2\2\2\u016b\u016c\5\34\17\2\u016c\u016d\7\37\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u0170\7\37\2\2\u016f\u0134\3\2\2\2\u016f\u013c\3"+
		"\2\2\2\u016f\u013f\3\2\2\2\u016f\u014f\3\2\2\2\u016f\u0152\3\2\2\2\u016f"+
		"\u0153\3\2\2\2\u016f\u0154\3\2\2\2\u016f\u0155\3\2\2\2\u016f\u0158\3\2"+
		"\2\2\u016f\u015b\3\2\2\2\u016f\u015e\3\2\2\2\u016f\u0161\3\2\2\2\u016f"+
		"\u0162\3\2\2\2\u016f\u0165\3\2\2\2\u016f\u0168\3\2\2\2\u016f\u016b\3\2"+
		"\2\2\u016f\u016e\3\2\2\2\u0170\65\3\2\2\2\u0171\u0172\7N\2\2\u0172\u0174"+
		"\7 \2\2\u0173\u0175\5$\23\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\7!\2\2\u0177\67\3\2\2\2\u0178\u0179\7\f\2\2"+
		"\u0179\u017a\7 \2\2\u017a\u017b\5F$\2\u017b\u017c\7!\2\2\u017c\u017d\5"+
		"\64\33\2\u017d9\3\2\2\2\u017e\u017f\7\r\2\2\u017f\u0180\7 \2\2\u0180\u0182"+
		"\5\64\33\2\u0181\u0183\7\37\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2"+
		"\2\u0183\u0184\3\2\2\2\u0184\u0185\5F$\2\u0185\u0186\7\37\2\2\u0186\u0188"+
		"\5\64\33\2\u0187\u0189\7\37\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018b\7!\2\2\u018b\u018c\5\64\33\2\u018c"+
		";\3\2\2\2\u018d\u018e\7\r\2\2\u018e\u018f\7 \2\2\u018f\u0190\7N\2\2\u0190"+
		"\u0191\7N\2\2\u0191\u0192\7\16\2\2\u0192\u0193\7N\2\2\u0193\u0194\7!\2"+
		"\2\u0194\u0195\5\64\33\2\u0195=\3\2\2\2\u0196\u019a\5@!\2\u0197\u0199"+
		"\5D#\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\5B"+
		"\"\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f?\3\2\2\2\u01a0\u01a1"+
		"\7\17\2\2\u01a1\u01a2\7 \2\2\u01a2\u01a3\5F$\2\u01a3\u01a4\7!\2\2\u01a4"+
		"\u01a5\5\64\33\2\u01a5A\3\2\2\2\u01a6\u01a7\7\20\2\2\u01a7\u01a8\5\64"+
		"\33\2\u01a8C\3\2\2\2\u01a9\u01aa\7\21\2\2\u01aa\u01ab\7 \2\2\u01ab\u01ac"+
		"\5F$\2\u01ac\u01ad\7!\2\2\u01ad\u01ae\5\64\33\2\u01aeE\3\2\2\2\u01af\u01b0"+
		"\5J&\2\u01b0G\3\2\2\2\u01b1\u01b2\t\6\2\2\u01b2I\3\2\2\2\u01b3\u01b4\5"+
		"N(\2\u01b4K\3\2\2\2\u01b5\u01b6\t\7\2\2\u01b6M\3\2\2\2\u01b7\u01b8\b("+
		"\1\2\u01b8\u01d8\5\66\34\2\u01b9\u01d6\7\16\2\2\u01ba\u01bb\5H%\2\u01bb"+
		"\u01bc\7N\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bf\7N\2\2\u01be\u01ba\3\2\2"+
		"\2\u01be\u01bd\3\2\2\2\u01bf\u01d7\3\2\2\2\u01c0\u01c5\7 \2\2\u01c1\u01c2"+
		"\5H%\2\u01c2\u01c3\7N\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c6\7N\2\2\u01c5"+
		"\u01c1\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01d2\3\2\2\2\u01c9\u01ce\7\60\2\2\u01ca"+
		"\u01cb\5H%\2\u01cb\u01cc\7N\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cf\7N\2\2"+
		"\u01ce\u01ca\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01c9"+
		"\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7\7!\2\2\u01d6\u01be\3\2"+
		"\2\2\u01d6\u01c0\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01b9\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01e5\3\2\2\2\u01da\u01db\7 \2\2\u01db\u01dc\5N("+
		"\2\u01dc\u01dd\7!\2\2\u01dd\u01e5\3\2\2\2\u01de\u01e5\7\27\2\2\u01df\u01e5"+
		"\7\30\2\2\u01e0\u01e5\7\31\2\2\u01e1\u01e5\7K\2\2\u01e2\u01e5\7L\2\2\u01e3"+
		"\u01e5\5L\'\2\u01e4\u01b7\3\2\2\2\u01e4\u01da\3\2\2\2\u01e4\u01de\3\2"+
		"\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u0206\3\2\2\2\u01e6\u01e7\f\r"+
		"\2\2\u01e7\u01e8\7&\2\2\u01e8\u0205\5N(\16\u01e9\u01ea\f\f\2\2\u01ea\u01eb"+
		"\7\22\2\2\u01eb\u0205\5N(\r\u01ec\u01ed\f\13\2\2\u01ed\u01ee\7\23\2\2"+
		"\u01ee\u0205\5N(\f\u01ef\u01f0\f\n\2\2\u01f0\u01f1\7\'\2\2\u01f1\u0205"+
		"\5N(\13\u01f2\u01f3\f\t\2\2\u01f3\u01f4\7\34\2\2\u01f4\u0205\5N(\n\u01f5"+
		"\u01f6\f\b\2\2\u01f6\u01f7\7\13\2\2\u01f7\u0205\5N(\t\u01f8\u01f9\f\7"+
		"\2\2\u01f9\u01fa\7)\2\2\u01fa\u0205\5N(\b\u01fb\u01fc\f\6\2\2\u01fc\u01fd"+
		"\7*\2\2\u01fd\u0205\5N(\7\u01fe\u01ff\f\5\2\2\u01ff\u0200\7(\2\2\u0200"+
		"\u0205\5N(\6\u0201\u0202\f\4\2\2\u0202\u0203\7+\2\2\u0203\u0205\5N(\5"+
		"\u0204\u01e6\3\2\2\2\u0204\u01e9\3\2\2\2\u0204\u01ec\3\2\2\2\u0204\u01ef"+
		"\3\2\2\2\u0204\u01f2\3\2\2\2\u0204\u01f5\3\2\2\2\u0204\u01f8\3\2\2\2\u0204"+
		"\u01fb\3\2\2\2\u0204\u01fe\3\2\2\2\u0204\u0201\3\2\2\2\u0205\u0208\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207O\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0209\u020c\5R*\2\u020a\u020c\5T+\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020a\3\2\2\2\u020cQ\3\2\2\2\u020d\u0213\5H%\2\u020e\u0211\7N\2\2\u020f"+
		"\u0210\7\35\2\2\u0210\u0212\5J&\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\3\2\2\2\u0213\u020e\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021f\3\2\2\2\u0217\u0218\7\60"+
		"\2\2\u0218\u021b\7N\2\2\u0219\u021a\7\35\2\2\u021a\u021c\5J&\2\u021b\u0219"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u0217\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220S\3\2\2\2"+
		"\u0221\u021f\3\2\2\2\u0222\u0226\7 \2\2\u0223\u0224\5H%\2\u0224\u0225"+
		"\7N\2\2\u0225\u0227\3\2\2\2\u0226\u0223\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7!"+
		"\2\2\u022b\u022c\7\35\2\2\u022c\u022d\5J&\2\u022dU\3\2\2\2\u022e\u022f"+
		"\7N\2\2\u022f\u0230\7\35\2\2\u0230\u0231\5J&\2\u0231W\3\2\2\2\u0232\u0237"+
		"\7 \2\2\u0233\u0238\7N\2\2\u0234\u0235\5H%\2\u0235\u0236\7N\2\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0233\3\2\2\2\u0237\u0234\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\7!\2\2\u023c\u023d\7\35\2\2\u023d\u023e\5J&\2\u023eY\3\2\2\2\u023f"+
		"\u0240\7N\2\2\u0240\u0241\7\24\2\2\u0241\u0242\7N\2\2\u0242[\3\2\2\2\u0243"+
		"\u0244\7N\2\2\u0244\u0245\7\25\2\2\u0245]\3\2\2\2\u0246\u0247\7N\2\2\u0247"+
		"\u0248\7\26\2\2\u0248_\3\2\2\2\66cin|\u0085\u008d\u0097\u00a2\u00ab\u00b5"+
		"\u00bd\u00c7\u00d2\u00e2\u00e7\u00ea\u00ed\u00f0\u00f4\u00fe\u0106\u010c"+
		"\u0115\u0119\u011e\u0138\u0147\u014c\u016f\u0174\u0182\u0188\u019a\u019e"+
		"\u01be\u01c5\u01c7\u01ce\u01d2\u01d6\u01d8\u01e4\u0204\u0206\u020b\u0211"+
		"\u0215\u021b\u021f\u0228\u0237\u0239";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}