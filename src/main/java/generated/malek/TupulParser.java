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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INTEGER=9, 
		FLOAT=10, DOUBLE=11, DOUBLE_EQUALS_LIST=12, EQUALS_LIT=13, RETURN_LIT=14, 
		SEMICOLON=15, LEFT_PAREN=16, RIGHT_PAREN=17, LEFT_CURLY=18, RIGHT_CURLY=19, 
		LEFT_SQUARE=20, RIGHT_SQUARE=21, LEFT_ANGLE=22, RIGHT_ANGLE=23, ADD_OP=24, 
		MULTI_OP=25, DIV_OP=26, SUB_OP=27, SINGLE_OR=28, SINGLE_AND=29, HASHTAG=30, 
		POINTER=31, COMMA=32, DOUBLE_OR=33, DOUBLE_AND=34, INT_TYPE=35, FLOAT_TYPE=36, 
		DOUBLE_TYPE=37, CHAR_TYPE=38, VOID_TYPE=39, NULL_TYPE=40, UNION_KEYWORD=41, 
		INSTANCEOF_KEYWORD=42, SUBSET_KEYWORD=43, STRICT_SUBSET_KEYWORD=44, SUPERSET_KEYWORD=45, 
		TYPE=46, INTERFACE=47, EXTENDS=48, OVERRIDE=49, IMPLEMENT=50, IMPORT=51, 
		PUBLIC=52, PRIVATE=53, CHAR=54, STRING=55, WHITESPACE=56, IDENTIFIER=57;
	public static final int
		RULE_type = 0, RULE_file = 1, RULE_importSomething = 2, RULE_interfaceFile = 3, 
		RULE_interfaceDeclaration = 4, RULE_interfaceExtensions = 5, RULE_interfaceCodeBlock = 6, 
		RULE_interfaceFunctionDeclaration = 7, RULE_typeFile = 8, RULE_typeDeclaration = 9, 
		RULE_typeCodeBlock = 10, RULE_typeFunctionDeclaration = 11, RULE_universalFunctionModifiers = 12, 
		RULE_functionDecArguments = 13, RULE_functionCallArguments = 14, RULE_functionCodeBlock = 15, 
		RULE_functionCall = 16, RULE_finalValue = 17, RULE_intermediateValue = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "file", "importSomething", "interfaceFile", "interfaceDeclaration", 
			"interfaceExtensions", "interfaceCodeBlock", "interfaceFunctionDeclaration", 
			"typeFile", "typeDeclaration", "typeCodeBlock", "typeFunctionDeclaration", 
			"universalFunctionModifiers", "functionDecArguments", "functionCallArguments", 
			"functionCodeBlock", "functionCall", "finalValue", "intermediateValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'::'", "'fluid'", "'const'", "'fixed'", "'dirty'", "'tidy'", 
			"'pure'", null, null, null, "'=='", "'='", "'return'", "';'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "'+'", "'*'", "'/'", 
			"'-'", "'|'", "'&'", "'#'", "'@'", "','", "'||'", "'&&'", "'int'", "'float'", 
			"'double'", "'char'", "'void'", "'null'", "'union'", "'instanceof'", 
			"'subset'", "'strictsubset'", "'superset'", "'type'", "'interface'", 
			"'extends'", "'override'", "'implement'", "'import'", "'public'", "'private'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "INTEGER", "FLOAT", 
			"DOUBLE", "DOUBLE_EQUALS_LIST", "EQUALS_LIT", "RETURN_LIT", "SEMICOLON", 
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE", 
			"RIGHT_SQUARE", "LEFT_ANGLE", "RIGHT_ANGLE", "ADD_OP", "MULTI_OP", "DIV_OP", 
			"SUB_OP", "SINGLE_OR", "SINGLE_AND", "HASHTAG", "POINTER", "COMMA", "DOUBLE_OR", 
			"DOUBLE_AND", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "VOID_TYPE", 
			"NULL_TYPE", "UNION_KEYWORD", "INSTANCEOF_KEYWORD", "SUBSET_KEYWORD", 
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode INT_TYPE() { return getToken(TupulParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(TupulParser.CHAR_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(TupulParser.DOUBLE_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(TupulParser.FLOAT_TYPE, 0); }
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
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << IDENTIFIER))) != 0)) ) {
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

	public static class FileContext extends ParserRuleContext {
		public InterfaceFileContext interfaceFile() {
			return getRuleContext(InterfaceFileContext.class,0);
		}
		public TypeFileContext typeFile() {
			return getRuleContext(TypeFileContext.class,0);
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
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				interfaceFile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				typeFile();
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
		enterRule(_localctx, 4, RULE_importSomething);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IMPORT);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					match(IDENTIFIER);
					setState(46);
					match(T__0);
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(52);
			match(IDENTIFIER);
			setState(53);
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

	public static class InterfaceFileContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ImportSomethingContext> importSomething() {
			return getRuleContexts(ImportSomethingContext.class);
		}
		public ImportSomethingContext importSomething(int i) {
			return getRuleContext(ImportSomethingContext.class,i);
		}
		public InterfaceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterInterfaceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitInterfaceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitInterfaceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFileContext interfaceFile() throws RecognitionException {
		InterfaceFileContext _localctx = new InterfaceFileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interfaceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(55);
				importSomething();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			interfaceDeclaration();
			}
		}
		catch (RecognitionException re) {
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
			setState(63);
			match(INTERFACE);
			setState(64);
			match(IDENTIFIER);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(65);
				match(EXTENDS);
				setState(66);
				interfaceExtensions();
				}
			}

			setState(69);
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
			setState(71);
			match(IDENTIFIER);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					match(COMMA);
					setState(73);
					interfaceExtensions();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(LEFT_CURLY);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_CURLY) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << TYPE) | (1L << INTERFACE) | (1L << OVERRIDE) | (1L << IMPLEMENT) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(80);
					interfaceCodeBlock();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(RIGHT_CURLY);
				}
				break;
			case LEFT_PAREN:
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case OVERRIDE:
			case IMPLEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				interfaceFunctionDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				interfaceDeclaration();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				typeDeclaration();
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

	public static class InterfaceFunctionDeclarationContext extends ParserRuleContext {
		public UniversalFunctionModifiersContext universalFunctionModifiers() {
			return getRuleContext(UniversalFunctionModifiersContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(TupulParser.OVERRIDE, 0); }
		public TerminalNode IMPLEMENT() { return getToken(TupulParser.IMPLEMENT, 0); }
		public FunctionDecArgumentsContext functionDecArguments() {
			return getRuleContext(FunctionDecArgumentsContext.class,0);
		}
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				universalFunctionModifiers();
				setState(94);
				match(IDENTIFIER);
				setState(95);
				match(T__1);
				setState(96);
				match(IDENTIFIER);
				setState(97);
				match(LEFT_PAREN);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(98);
					functionDecArguments();
					}
				}

				setState(101);
				match(RIGHT_PAREN);
				setState(102);
				functionCodeBlock();
				}
				break;
			case LEFT_PAREN:
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				universalFunctionModifiers();
				setState(105);
				match(IDENTIFIER);
				setState(106);
				match(LEFT_PAREN);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(107);
					functionDecArguments();
					}
				}

				setState(110);
				match(RIGHT_PAREN);
				setState(111);
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

	public static class TypeFileContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public List<ImportSomethingContext> importSomething() {
			return getRuleContexts(ImportSomethingContext.class);
		}
		public ImportSomethingContext importSomething(int i) {
			return getRuleContext(ImportSomethingContext.class,i);
		}
		public TypeFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterTypeFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitTypeFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitTypeFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFileContext typeFile() throws RecognitionException {
		TypeFileContext _localctx = new TypeFileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(115);
				importSomething();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			typeDeclaration();
			}
		}
		catch (RecognitionException re) {
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
			setState(123);
			match(TYPE);
			setState(124);
			match(IDENTIFIER);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(125);
				match(EXTENDS);
				setState(126);
				interfaceExtensions();
				}
			}

			setState(129);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(LEFT_CURLY);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAREN) | (1L << LEFT_CURLY) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << TYPE) | (1L << INTERFACE) | (1L << OVERRIDE) | (1L << IMPLEMENT) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(132);
					typeCodeBlock();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(RIGHT_CURLY);
				}
				break;
			case LEFT_PAREN:
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case OVERRIDE:
			case IMPLEMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				typeFunctionDeclaration();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				typeDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TupulParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TupulParser.IDENTIFIER, i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(TupulParser.OVERRIDE, 0); }
		public TerminalNode IMPLEMENT() { return getToken(TupulParser.IMPLEMENT, 0); }
		public FunctionDecArgumentsContext functionDecArguments() {
			return getRuleContext(FunctionDecArgumentsContext.class,0);
		}
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				universalFunctionModifiers();
				setState(146);
				match(IDENTIFIER);
				setState(147);
				match(T__1);
				setState(148);
				match(IDENTIFIER);
				setState(149);
				match(LEFT_PAREN);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(150);
					functionDecArguments();
					}
				}

				setState(153);
				match(RIGHT_PAREN);
				setState(154);
				functionCodeBlock();
				}
				break;
			case LEFT_PAREN:
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				universalFunctionModifiers();
				setState(157);
				match(IDENTIFIER);
				setState(158);
				match(LEFT_PAREN);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(159);
					functionDecArguments();
					}
				}

				setState(162);
				match(RIGHT_PAREN);
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
		enterRule(_localctx, 24, RULE_universalFunctionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
			case IDENTIFIER:
				{
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case FLOAT_TYPE:
				case DOUBLE_TYPE:
				case CHAR_TYPE:
				case IDENTIFIER:
					{
					setState(167);
					type();
					}
					break;
				case VOID_TYPE:
					{
					setState(168);
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
				setState(171);
				match(LEFT_PAREN);
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case FLOAT_TYPE:
				case DOUBLE_TYPE:
				case CHAR_TYPE:
				case IDENTIFIER:
					{
					setState(172);
					type();
					}
					break;
				case VOID_TYPE:
					{
					setState(173);
					match(VOID_TYPE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(176);
				match(COMMA);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(179);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case FLOAT_TYPE:
					case DOUBLE_TYPE:
					case CHAR_TYPE:
					case IDENTIFIER:
						{
						setState(177);
						type();
						}
						break;
					case VOID_TYPE:
						{
						setState(178);
						match(VOID_TYPE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(184);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(187);
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

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(190);
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

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(193);
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
		enterRule(_localctx, 26, RULE_functionDecArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			type();
			setState(197);
			match(IDENTIFIER);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				type();
				setState(200);
				match(IDENTIFIER);
				}
				}
				setState(206);
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
		enterRule(_localctx, 28, RULE_functionCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			type();
			setState(208);
			match(IDENTIFIER);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209);
				match(COMMA);
				setState(210);
				type();
				setState(211);
				match(IDENTIFIER);
				}
				}
				setState(217);
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

	public static class FunctionCodeBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<FunctionCodeBlockContext> functionCodeBlock() {
			return getRuleContexts(FunctionCodeBlockContext.class);
		}
		public FunctionCodeBlockContext functionCodeBlock(int i) {
			return getRuleContext(FunctionCodeBlockContext.class,i);
		}
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
		enterRule(_localctx, 30, RULE_functionCodeBlock);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(LEFT_CURLY);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RETURN_LIT || _la==LEFT_CURLY) {
					{
					{
					setState(219);
					functionCodeBlock();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(RIGHT_CURLY);
				}
				break;
			case RETURN_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(RETURN_LIT);
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(227);
					finalValue();
					}
					break;
				case 2:
					{
					setState(228);
					match(LEFT_PAREN);
					setState(229);
					finalValue();
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(230);
						match(COMMA);
						setState(231);
						finalValue();
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(237);
					match(RIGHT_PAREN);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 32, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IDENTIFIER);
			setState(244);
			match(LEFT_PAREN);
			setState(245);
			functionCallArguments();
			setState(246);
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
		enterRule(_localctx, 34, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			intermediateValue();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(TupulParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(TupulParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(TupulParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(TupulParser.CHAR, 0); }
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
		IntermediateValueContext _localctx = new IntermediateValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intermediateValue);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(INTEGER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(DOUBLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(CHAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\7\4\62\n\4\f"+
		"\4\16\4\65\13\4\3\4\3\4\3\4\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6F\n\6\3\6\3\6\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3"+
		"\b\7\bT\n\b\f\b\16\bW\13\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tf\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\t\3\t\3\t\5"+
		"\tt\n\t\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\13\3\13\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0091\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\5"+
		"\16\u00ac\n\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\16\3\16\3\16\7\16\u00b6"+
		"\n\16\f\16\16\16\u00b9\13\16\3\16\5\16\u00bc\n\16\3\16\5\16\u00bf\n\16"+
		"\3\16\5\16\u00c2\n\16\3\16\5\16\u00c5\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00cd\n\17\f\17\16\17\u00d0\13\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00d8\n\20\f\20\16\20\u00db\13\20\3\21\3\21\7\21\u00df\n\21\f"+
		"\21\16\21\u00e2\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00eb\n"+
		"\21\f\21\16\21\u00ee\13\21\3\21\3\21\5\21\u00f2\n\21\5\21\u00f4\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0103"+
		"\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\4\2"+
		"%(;;\3\2\63\64\3\2\66\67\3\2\5\7\3\2\b\n\2\u011a\2(\3\2\2\2\4,\3\2\2\2"+
		"\6.\3\2\2\2\b<\3\2\2\2\nA\3\2\2\2\fI\3\2\2\2\16\\\3\2\2\2\20s\3\2\2\2"+
		"\22x\3\2\2\2\24}\3\2\2\2\26\u0090\3\2\2\2\30\u00a7\3\2\2\2\32\u00bb\3"+
		"\2\2\2\34\u00c6\3\2\2\2\36\u00d1\3\2\2\2 \u00f3\3\2\2\2\"\u00f5\3\2\2"+
		"\2$\u00fa\3\2\2\2&\u0102\3\2\2\2()\t\2\2\2)\3\3\2\2\2*-\5\b\5\2+-\5\22"+
		"\n\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\63\7\65\2\2/\60\7;\2\2\60\62\7\3"+
		"\2\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2"+
		"\2\65\63\3\2\2\2\66\67\7;\2\2\678\7\21\2\28\7\3\2\2\29;\5\6\4\2:9\3\2"+
		"\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\5\n\6\2@\t\3"+
		"\2\2\2AB\7\61\2\2BE\7;\2\2CD\7\62\2\2DF\5\f\7\2EC\3\2\2\2EF\3\2\2\2FG"+
		"\3\2\2\2GH\5\16\b\2H\13\3\2\2\2IN\7;\2\2JK\7\"\2\2KM\5\f\7\2LJ\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PN\3\2\2\2QU\7\24\2\2RT\5\16"+
		"\b\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X]\7\25"+
		"\2\2Y]\5\20\t\2Z]\5\n\6\2[]\5\24\13\2\\Q\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2"+
		"\\[\3\2\2\2]\17\3\2\2\2^_\t\3\2\2_`\5\32\16\2`a\7;\2\2ab\7\4\2\2bc\7;"+
		"\2\2ce\7\22\2\2df\5\34\17\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\23\2\2h"+
		"i\5 \21\2it\3\2\2\2jk\5\32\16\2kl\7;\2\2ln\7\22\2\2mo\5\34\17\2nm\3\2"+
		"\2\2no\3\2\2\2op\3\2\2\2pq\7\23\2\2qr\5 \21\2rt\3\2\2\2s^\3\2\2\2sj\3"+
		"\2\2\2t\21\3\2\2\2uw\5\6\4\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y"+
		"{\3\2\2\2zx\3\2\2\2{|\5\24\13\2|\23\3\2\2\2}~\7\60\2\2~\u0081\7;\2\2\177"+
		"\u0080\7\62\2\2\u0080\u0082\5\f\7\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\26\f\2\u0084\25\3\2\2\2\u0085\u0089"+
		"\7\24\2\2\u0086\u0088\5\26\f\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u0091\7\25\2\2\u008d\u0091\5\30\r\2\u008e\u0091\5\24\13"+
		"\2\u008f\u0091\5\n\6\2\u0090\u0085\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u008f\3\2\2\2\u0091\27\3\2\2\2\u0092\u0093\t\3\2\2\u0093"+
		"\u0094\5\32\16\2\u0094\u0095\7;\2\2\u0095\u0096\7\4\2\2\u0096\u0097\7"+
		";\2\2\u0097\u0099\7\22\2\2\u0098\u009a\5\34\17\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\23\2\2\u009c\u009d\5"+
		" \21\2\u009d\u00a8\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\7;\2\2\u00a0"+
		"\u00a2\7\22\2\2\u00a1\u00a3\5\34\17\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\5 \21\2"+
		"\u00a6\u00a8\3\2\2\2\u00a7\u0092\3\2\2\2\u00a7\u009e\3\2\2\2\u00a8\31"+
		"\3\2\2\2\u00a9\u00ac\5\2\2\2\u00aa\u00ac\7)\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00bc\3\2\2\2\u00ad\u00b0\7\22\2\2\u00ae\u00b1\5"+
		"\2\2\2\u00af\u00b1\7)\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b7\7\"\2\2\u00b3\u00b6\5\2\2\2\u00b4\u00b6\7)"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bc\7\23\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00ad\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bf\t\4\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\t\5\2\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\t\6\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\5\2\2\2\u00c7\u00ce"+
		"\7;\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\5\2\2\2\u00ca\u00cb\7;\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\5\2\2\2\u00d2\u00d9\7;\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\5\2\2\2\u00d5"+
		"\u00d6\7;\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\37\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00e0\7\24\2\2\u00dd\u00df\5 \21\2\u00de\u00dd\3\2\2\2"+
		"\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00f4\7\25\2\2\u00e4\u00f1\7\20\2\2"+
		"\u00e5\u00f2\5$\23\2\u00e6\u00e7\7\22\2\2\u00e7\u00ec\5$\23\2\u00e8\u00e9"+
		"\7\"\2\2\u00e9\u00eb\5$\23\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e5\3\2\2\2\u00f1"+
		"\u00e6\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00dc\3\2"+
		"\2\2\u00f3\u00e4\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f6\7;\2\2\u00f6\u00f7"+
		"\7\22\2\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9\7\23\2\2\u00f9#\3\2\2\2\u00fa"+
		"\u00fb\5&\24\2\u00fb%\3\2\2\2\u00fc\u0103\7;\2\2\u00fd\u0103\5\"\22\2"+
		"\u00fe\u0103\7\13\2\2\u00ff\u0103\7\f\2\2\u0100\u0103\7\r\2\2\u0101\u0103"+
		"\78\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\'\3\2\2\2"+
		"\",\63<ENU\\ensx\u0081\u0089\u0090\u0099\u00a2\u00a7\u00ab\u00b0\u00b5"+
		"\u00b7\u00bb\u00be\u00c1\u00c4\u00ce\u00d9\u00e0\u00ec\u00f1\u00f3\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}