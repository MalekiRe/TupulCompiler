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
		POINTER=45, COMMA=46, DOUBLE_OR=47, DOUBLE_AND=48, THIS_KEYWORD=49, SUPERSET_KEYWORD=50, 
		SUPER_KEYWORD=51, INT_TYPE=52, FLOAT_TYPE=53, DOUBLE_TYPE=54, CHAR_TYPE=55, 
		VOID_TYPE=56, BOOL_TYPE=57, STRING_TYPE=58, NULL_TYPE=59, FALSE_KEYWORD=60, 
		TRUE_KEYWORD=61, UNION_KEYWORD=62, INSTANCEOF_KEYWORD=63, SUBSET_KEYWORD=64, 
		STRICT_SUBSET_KEYWORD=65, TYPE=66, INTERFACE=67, EXTENDS=68, OVERRIDE=69, 
		IMPLEMENT=70, IMPORT=71, AS=72, FROM=73, PUBLIC=74, PRIVATE=75, CHAR=76, 
		STRING=77, WHITESPACE=78, FILE_IDENTIFIER=79, IDENTIFIER=80;
	public static final int
		RULE_file = 0, RULE_fileImport = 1, RULE_fromImport = 2, RULE_fileOrNormalID = 3, 
		RULE_interfaceDeclaration = 4, RULE_interfaceExtensions = 5, RULE_interfaceExtensionName = 6, 
		RULE_interfaceCodeBlock = 7, RULE_interfaceFunctionDeclaration = 8, RULE_interfaceAbstractFuncDec = 9, 
		RULE_typeDeclaration = 10, RULE_typeCodeBlock = 11, RULE_typeFunctionDeclaration = 12, 
		RULE_universalFunctionPost = 13, RULE_functionWithinFunctionDec = 14, 
		RULE_universalFunctionModifiers = 15, RULE_typeWithVoid = 16, RULE_functionDecArguments = 17, 
		RULE_functionCallArguments = 18, RULE_universalPostIdentifierFuncDec = 19, 
		RULE_functionTagOperation = 20, RULE_functionTagAppend = 21, RULE_functionTagRemove = 22, 
		RULE_functionTagEquals = 23, RULE_functionTagNotEquals = 24, RULE_tagID = 25, 
		RULE_functionCodeBlock = 26, RULE_superCall = 27, RULE_functionCall = 28, 
		RULE_whileLoop = 29, RULE_forLoop = 30, RULE_specialForLoop = 31, RULE_chainedIfStatement = 32, 
		RULE_ifStatement = 33, RULE_elseStatement = 34, RULE_elseIfStatement = 35, 
		RULE_conditional = 36, RULE_type = 37, RULE_finalValue = 38, RULE_varID = 39, 
		RULE_intermediateValue = 40, RULE_variableDeclaration = 41, RULE_singleVarDec = 42, 
		RULE_multiVarDec = 43, RULE_singleVarAssignment = 44, RULE_multiVarAssignment = 45, 
		RULE_variableSwap = 46, RULE_variableIncrement = 47, RULE_variableDecrement = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "fileImport", "fromImport", "fileOrNormalID", "interfaceDeclaration", 
			"interfaceExtensions", "interfaceExtensionName", "interfaceCodeBlock", 
			"interfaceFunctionDeclaration", "interfaceAbstractFuncDec", "typeDeclaration", 
			"typeCodeBlock", "typeFunctionDeclaration", "universalFunctionPost", 
			"functionWithinFunctionDec", "universalFunctionModifiers", "typeWithVoid", 
			"functionDecArguments", "functionCallArguments", "universalPostIdentifierFuncDec", 
			"functionTagOperation", "functionTagAppend", "functionTagRemove", "functionTagEquals", 
			"functionTagNotEquals", "tagID", "functionCodeBlock", "superCall", "functionCall", 
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
			null, "'::'", "'fluid'", "'const'", "'fixed'", "'dirty'", "'tidy'", "'pure'", 
			"'!='", "'.'", "'while'", "'for'", "':'", "'if'", "'else'", "'else if'", 
			"'<='", "'>='", "'<->'", "'++'", "'--'", null, null, null, "'+='", "'-='", 
			"'=='", "'='", "'return'", "';'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'<'", "'>'", "'+'", "'*'", "'/'", "'-'", "'|'", "'&'", "'#'", 
			"'@'", "','", "'||'", "'&&'", "'this'", "'superset'", "'super'", "'int'", 
			"'float'", "'double'", "'char'", "'void'", "'bool'", "'string'", "'null'", 
			"'false'", "'true'", "'union'", "'instanceof'", "'subset'", "'strictsubset'", 
			"'type'", "'interface'", "'extends'", "'override'", "'implement'", "'import'", 
			"'as'", "'from'", "'public'", "'private'"
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
			"SUPERSET_KEYWORD", "SUPER_KEYWORD", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", 
			"CHAR_TYPE", "VOID_TYPE", "BOOL_TYPE", "STRING_TYPE", "NULL_TYPE", "FALSE_KEYWORD", 
			"TRUE_KEYWORD", "UNION_KEYWORD", "INSTANCEOF_KEYWORD", "SUBSET_KEYWORD", 
			"STRICT_SUBSET_KEYWORD", "TYPE", "INTERFACE", "EXTENDS", "OVERRIDE", 
			"IMPLEMENT", "IMPORT", "AS", "FROM", "PUBLIC", "PRIVATE", "CHAR", "STRING", 
			"WHITESPACE", "FILE_IDENTIFIER", "IDENTIFIER"
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
		public List<FromImportContext> fromImport() {
			return getRuleContexts(FromImportContext.class);
		}
		public FromImportContext fromImport(int i) {
			return getRuleContext(FromImportContext.class,i);
		}
		public List<FileImportContext> fileImport() {
			return getRuleContexts(FileImportContext.class);
		}
		public FileImportContext fileImport(int i) {
			return getRuleContext(FileImportContext.class,i);
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(98);
				fromImport();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(104);
				fileImport();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(110);
				typeDeclaration();
				}
				break;
			case INTERFACE:
				{
				setState(111);
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

	public static class FileImportContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(TupulParser.IMPORT, 0); }
		public TerminalNode FILE_IDENTIFIER() { return getToken(TupulParser.FILE_IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(TupulParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public FileImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFileImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFileImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFileImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileImportContext fileImport() throws RecognitionException {
		FileImportContext _localctx = new FileImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IMPORT);
			setState(115);
			match(FILE_IDENTIFIER);
			setState(116);
			match(AS);
			setState(117);
			match(IDENTIFIER);
			setState(118);
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

	public static class FromImportContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(TupulParser.FROM, 0); }
		public TerminalNode FILE_IDENTIFIER() { return getToken(TupulParser.FILE_IDENTIFIER, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<FileImportContext> fileImport() {
			return getRuleContexts(FileImportContext.class);
		}
		public FileImportContext fileImport(int i) {
			return getRuleContext(FileImportContext.class,i);
		}
		public FromImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFromImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFromImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFromImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromImportContext fromImport() throws RecognitionException {
		FromImportContext _localctx = new FromImportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fromImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FROM);
			setState(121);
			match(FILE_IDENTIFIER);
			setState(122);
			match(LEFT_CURLY);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				fileImport();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(128);
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

	public static class FileOrNormalIDContext extends ParserRuleContext {
		public TerminalNode FILE_IDENTIFIER() { return getToken(TupulParser.FILE_IDENTIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public FileOrNormalIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileOrNormalID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFileOrNormalID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFileOrNormalID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFileOrNormalID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileOrNormalIDContext fileOrNormalID() throws RecognitionException {
		FileOrNormalIDContext _localctx = new FileOrNormalIDContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileOrNormalID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==FILE_IDENTIFIER || _la==IDENTIFIER) ) {
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
			setState(132);
			match(INTERFACE);
			setState(133);
			match(IDENTIFIER);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(134);
				match(EXTENDS);
				setState(135);
				interfaceExtensions();
				}
			}

			setState(138);
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
		public FileOrNormalIDContext fileOrNormalID() {
			return getRuleContext(FileOrNormalIDContext.class,0);
		}
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
			setState(140);
			fileOrNormalID();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				interfaceExtensionName();
				}
				}
				setState(146);
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
		public FileOrNormalIDContext fileOrNormalID() {
			return getRuleContext(FileOrNormalIDContext.class,0);
		}
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
			setState(147);
			match(COMMA);
			setState(148);
			fileOrNormalID();
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(LEFT_CURLY);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (LEFT_PAREN - 30)) | (1L << (LEFT_CURLY - 30)) | (1L << (INT_TYPE - 30)) | (1L << (FLOAT_TYPE - 30)) | (1L << (DOUBLE_TYPE - 30)) | (1L << (CHAR_TYPE - 30)) | (1L << (VOID_TYPE - 30)) | (1L << (STRING_TYPE - 30)) | (1L << (TYPE - 30)) | (1L << (INTERFACE - 30)) | (1L << (OVERRIDE - 30)) | (1L << (IMPLEMENT - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					{
					setState(151);
					interfaceCodeBlock();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				variableDeclaration();
				setState(159);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				interfaceFunctionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				typeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
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
		public FileOrNormalIDContext fileOrNormalID() {
			return getRuleContext(FileOrNormalIDContext.class,0);
		}
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
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				universalFunctionModifiers();
				setState(169);
				fileOrNormalID();
				setState(170);
				match(T__0);
				setState(171);
				universalFunctionPost();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
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
			setState(176);
			universalFunctionModifiers();
			setState(177);
			universalPostIdentifierFuncDec();
			setState(178);
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
			setState(180);
			match(TYPE);
			setState(181);
			match(IDENTIFIER);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(182);
				match(EXTENDS);
				setState(183);
				interfaceExtensions();
				}
			}

			setState(186);
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(LEFT_CURLY);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (LEFT_PAREN - 30)) | (1L << (LEFT_CURLY - 30)) | (1L << (INT_TYPE - 30)) | (1L << (FLOAT_TYPE - 30)) | (1L << (DOUBLE_TYPE - 30)) | (1L << (CHAR_TYPE - 30)) | (1L << (VOID_TYPE - 30)) | (1L << (STRING_TYPE - 30)) | (1L << (TYPE - 30)) | (1L << (INTERFACE - 30)) | (1L << (OVERRIDE - 30)) | (1L << (IMPLEMENT - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					{
					setState(189);
					typeCodeBlock();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				typeFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				typeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				variableDeclaration();
				setState(200);
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
		public FileOrNormalIDContext fileOrNormalID() {
			return getRuleContext(FileOrNormalIDContext.class,0);
		}
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case IMPLEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==OVERRIDE || _la==IMPLEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				universalFunctionModifiers();
				setState(206);
				fileOrNormalID();
				setState(207);
				match(T__0);
				setState(208);
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
				setState(210);
				universalFunctionModifiers();
				setState(211);
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
			setState(215);
			universalPostIdentifierFuncDec();
			setState(216);
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
			setState(218);
			universalFunctionModifiers();
			setState(219);
			universalPostIdentifierFuncDec();
			setState(220);
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
			setState(234);
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
				setState(222);
				typeWithVoid();
				}
				break;
			case LEFT_PAREN:
				{
				setState(223);
				match(LEFT_PAREN);
				setState(224);
				typeWithVoid();
				{
				setState(225);
				match(COMMA);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (INT_TYPE - 52)) | (1L << (FLOAT_TYPE - 52)) | (1L << (DOUBLE_TYPE - 52)) | (1L << (CHAR_TYPE - 52)) | (1L << (VOID_TYPE - 52)) | (1L << (STRING_TYPE - 52)) | (1L << (IDENTIFIER - 52)))) != 0)) {
					{
					{
					setState(226);
					typeWithVoid();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(232);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(236);
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

			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(239);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case IDENTIFIER:
				{
				setState(245);
				type();
				}
				break;
			case VOID_TYPE:
				{
				setState(246);
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
			setState(249);
			type();
			setState(250);
			match(IDENTIFIER);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				type();
				setState(253);
				match(IDENTIFIER);
				}
				}
				setState(259);
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
			setState(260);
			match(IDENTIFIER);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				match(IDENTIFIER);
				}
				}
				setState(267);
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
			setState(268);
			match(IDENTIFIER);
			setState(269);
			match(LEFT_PAREN);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (INT_TYPE - 52)) | (1L << (FLOAT_TYPE - 52)) | (1L << (DOUBLE_TYPE - 52)) | (1L << (CHAR_TYPE - 52)) | (1L << (STRING_TYPE - 52)) | (1L << (IDENTIFIER - 52)))) != 0)) {
				{
				setState(270);
				functionDecArguments();
				}
			}

			setState(273);
			match(RIGHT_PAREN);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_ANGLE) {
				{
				setState(274);
				match(LEFT_ANGLE);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INTEGER - 21)) | (1L << (FLOAT - 21)) | (1L << (DOUBLE - 21)) | (1L << (LEFT_PAREN - 21)) | (1L << (THIS_KEYWORD - 21)) | (1L << (CHAR - 21)) | (1L << (STRING - 21)) | (1L << (IDENTIFIER - 21)))) != 0)) {
					{
					{
					setState(275);
					functionTagOperation();
					setState(276);
					match(SEMICOLON);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(286);
				functionTagAppend();
				}
				break;
			case 2:
				{
				setState(287);
				functionTagRemove();
				}
				break;
			case 3:
				{
				setState(288);
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
			setState(291);
			finalValue();
			setState(292);
			match(PLUS_EQUALS);
			setState(293);
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
			setState(295);
			finalValue();
			setState(296);
			match(MINUS_EQUALS);
			setState(297);
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
			setState(299);
			finalValue();
			setState(300);
			match(DOUBLE_EQUALS_LIST);
			setState(301);
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
			setState(303);
			finalValue();
			setState(304);
			match(T__7);
			setState(305);
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
			setState(307);
			match(IDENTIFIER);
			setState(308);
			match(HASHTAG);
			setState(309);
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
		public SuperCallContext superCall() {
			return getRuleContext(SuperCallContext.class,0);
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
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(LEFT_CURLY);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << RETURN_LIT) | (1L << SEMICOLON) | (1L << LEFT_PAREN) | (1L << LEFT_CURLY) | (1L << THIS_KEYWORD) | (1L << SUPER_KEYWORD) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << STRING_TYPE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TYPE - 66)) | (1L << (INTERFACE - 66)) | (1L << (CHAR - 66)) | (1L << (STRING - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(312);
					functionCodeBlock();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				functionCall();
				setState(320);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(RETURN_LIT);
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(323);
					finalValue();
					}
					break;
				case 2:
					{
					setState(324);
					match(LEFT_PAREN);
					setState(325);
					finalValue();
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(326);
						match(COMMA);
						setState(327);
						finalValue();
						}
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(333);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(337);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				functionTagOperation();
				setState(339);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				chainedIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				forLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				singleVarDec();
				setState(345);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				singleVarAssignment();
				setState(348);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(350);
				multiVarAssignment();
				setState(351);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(353);
				variableSwap();
				setState(354);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(356);
				variableIncrement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(357);
				variableDecrement();
				setState(358);
				match(SEMICOLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(360);
				typeDeclaration();
				setState(361);
				match(SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(363);
				interfaceDeclaration();
				setState(364);
				match(SEMICOLON);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(366);
				functionWithinFunctionDec();
				setState(367);
				match(SEMICOLON);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(369);
				superCall();
				setState(370);
				match(SEMICOLON);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(372);
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

	public static class SuperCallContext extends ParserRuleContext {
		public TerminalNode SUPER_KEYWORD() { return getToken(TupulParser.SUPER_KEYWORD, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public SuperCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterSuperCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitSuperCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitSuperCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperCallContext superCall() throws RecognitionException {
		SuperCallContext _localctx = new SuperCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_superCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(SUPER_KEYWORD);
			setState(376);
			match(LEFT_PAREN);
			setState(377);
			match(IDENTIFIER);
			setState(378);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public TerminalNode THIS_KEYWORD() { return getToken(TupulParser.THIS_KEYWORD, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 56, RULE_functionCall);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(IDENTIFIER);
				setState(381);
				match(LEFT_PAREN);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(382);
					functionCallArguments();
					}
				}

				setState(385);
				match(RIGHT_PAREN);
				}
				break;
			case THIS_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(THIS_KEYWORD);
				setState(387);
				match(T__8);
				setState(388);
				functionCall();
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
		enterRule(_localctx, 58, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__9);
			setState(392);
			match(LEFT_PAREN);
			setState(393);
			conditional();
			setState(394);
			match(RIGHT_PAREN);
			setState(395);
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
		enterRule(_localctx, 60, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__10);
			setState(398);
			match(LEFT_PAREN);
			setState(399);
			functionCodeBlock();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(400);
				match(SEMICOLON);
				}
			}

			setState(403);
			conditional();
			setState(404);
			match(SEMICOLON);
			setState(405);
			functionCodeBlock();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(406);
				match(SEMICOLON);
				}
			}

			setState(409);
			match(RIGHT_PAREN);
			setState(410);
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
		enterRule(_localctx, 62, RULE_specialForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__10);
			setState(413);
			match(LEFT_PAREN);
			setState(414);
			match(IDENTIFIER);
			setState(415);
			match(IDENTIFIER);
			setState(416);
			match(T__11);
			setState(417);
			match(IDENTIFIER);
			setState(418);
			match(RIGHT_PAREN);
			setState(419);
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
		enterRule(_localctx, 64, RULE_chainedIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			ifStatement();
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					elseIfStatement();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(428);
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
		enterRule(_localctx, 66, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__12);
			setState(432);
			match(LEFT_PAREN);
			setState(433);
			conditional();
			setState(434);
			match(RIGHT_PAREN);
			setState(435);
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
		enterRule(_localctx, 68, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__13);
			setState(438);
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
		enterRule(_localctx, 70, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__14);
			setState(441);
			match(LEFT_PAREN);
			setState(442);
			conditional();
			setState(443);
			match(RIGHT_PAREN);
			setState(444);
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
		enterRule(_localctx, 72, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		enterRule(_localctx, 74, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (INT_TYPE - 52)) | (1L << (FLOAT_TYPE - 52)) | (1L << (DOUBLE_TYPE - 52)) | (1L << (CHAR_TYPE - 52)) | (1L << (STRING_TYPE - 52)) | (1L << (IDENTIFIER - 52)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 78, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_intermediateValue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(455);
				functionCall();
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(456);
					match(T__11);
					setState(485);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_TYPE:
					case FLOAT_TYPE:
					case DOUBLE_TYPE:
					case CHAR_TYPE:
					case STRING_TYPE:
					case IDENTIFIER:
						{
						setState(461);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(457);
							type();
							setState(458);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(460);
							match(IDENTIFIER);
							}
							break;
						}
						}
						break;
					case LEFT_PAREN:
						{
						setState(463);
						match(LEFT_PAREN);
						{
						setState(468); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(468);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
							case 1:
								{
								setState(464);
								type();
								setState(465);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(467);
								match(IDENTIFIER);
								}
								break;
							}
							}
							setState(470); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (INT_TYPE - 52)) | (1L << (FLOAT_TYPE - 52)) | (1L << (DOUBLE_TYPE - 52)) | (1L << (CHAR_TYPE - 52)) | (1L << (STRING_TYPE - 52)) | (1L << (IDENTIFIER - 52)))) != 0) );
						setState(481);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(472);
							match(COMMA);
							setState(477);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(473);
								type();
								setState(474);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(476);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							setState(483);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						setState(484);
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
				setState(489);
				match(LEFT_PAREN);
				setState(490);
				intermediateValue(0);
				setState(491);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(493);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(494);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(495);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				setState(496);
				match(CHAR);
				}
				break;
			case 7:
				{
				setState(497);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(498);
				varID();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(531);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(501);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(502);
						match(LEFT_ANGLE);
						setState(503);
						intermediateValue(12);
						}
						break;
					case 2:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(504);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(505);
						match(T__15);
						setState(506);
						intermediateValue(11);
						}
						break;
					case 3:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(507);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(508);
						match(T__16);
						setState(509);
						intermediateValue(10);
						}
						break;
					case 4:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(510);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(511);
						match(RIGHT_ANGLE);
						setState(512);
						intermediateValue(9);
						}
						break;
					case 5:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(513);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(514);
						match(DOUBLE_EQUALS_LIST);
						setState(515);
						intermediateValue(8);
						}
						break;
					case 6:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(516);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(517);
						match(T__7);
						setState(518);
						intermediateValue(7);
						}
						break;
					case 7:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(519);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(520);
						match(MULTI_OP);
						setState(521);
						intermediateValue(6);
						}
						break;
					case 8:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(522);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(523);
						match(DIV_OP);
						setState(524);
						intermediateValue(5);
						}
						break;
					case 9:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(525);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(526);
						match(ADD_OP);
						setState(527);
						intermediateValue(4);
						}
						break;
					case 10:
						{
						_localctx = new IntermediateValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intermediateValue);
						setState(528);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(529);
						match(SUB_OP);
						setState(530);
						intermediateValue(3);
						}
						break;
					}
					} 
				}
				setState(535);
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
		enterRule(_localctx, 82, RULE_variableDeclaration);
		try {
			setState(538);
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
				setState(536);
				singleVarDec();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
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
		enterRule(_localctx, 84, RULE_singleVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			type();
			setState(546); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
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
				setState(548); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(550);
				match(COMMA);
				setState(551);
				match(IDENTIFIER);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_LIT) {
					{
					setState(552);
					match(EQUALS_LIT);
					setState(553);
					finalValue();
					}
				}

				}
				}
				setState(560);
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
		enterRule(_localctx, 86, RULE_multiVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(LEFT_PAREN);
			setState(565); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(562);
				type();
				setState(563);
				match(IDENTIFIER);
				}
				}
				setState(567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (INT_TYPE - 52)) | (1L << (FLOAT_TYPE - 52)) | (1L << (DOUBLE_TYPE - 52)) | (1L << (CHAR_TYPE - 52)) | (1L << (STRING_TYPE - 52)) | (1L << (IDENTIFIER - 52)))) != 0) );
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
		enterRule(_localctx, 88, RULE_singleVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(IDENTIFIER);
			setState(574);
			match(EQUALS_LIT);
			setState(575);
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
		enterRule(_localctx, 90, RULE_multiVarAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(LEFT_PAREN);
			setState(582); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(578);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(579);
					type();
					setState(580);
					match(IDENTIFIER);
					}
					break;
				}
				}
				setState(584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (INT_TYPE - 52)) | (1L << (FLOAT_TYPE - 52)) | (1L << (DOUBLE_TYPE - 52)) | (1L << (CHAR_TYPE - 52)) | (1L << (STRING_TYPE - 52)) | (1L << (IDENTIFIER - 52)))) != 0) );
			setState(586);
			match(RIGHT_PAREN);
			setState(587);
			match(EQUALS_LIT);
			setState(588);
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
		enterRule(_localctx, 92, RULE_variableSwap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(IDENTIFIER);
			setState(591);
			match(T__17);
			setState(592);
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
		enterRule(_localctx, 94, RULE_variableIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(IDENTIFIER);
			setState(595);
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
		enterRule(_localctx, 96, RULE_variableDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(IDENTIFIER);
			setState(598);
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
		case 40:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u025b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\5\2s\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4\177\n\4\r\4\16\4\u0080\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\7\3\7\7\7\u0091\n\7\f\7\16\7"+
		"\u0094\13\7\3\b\3\b\3\b\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00b1\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00bb\n\f\3\f\3"+
		"\f\3\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00cd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d8"+
		"\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00e6\n\21\f\21\16\21\u00e9\13\21\3\21\3\21\5\21\u00ed\n\21\3\21\5\21"+
		"\u00f0\n\21\3\21\5\21\u00f3\n\21\3\21\5\21\u00f6\n\21\3\22\3\22\5\22\u00fa"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105\13"+
		"\23\3\24\3\24\3\24\7\24\u010a\n\24\f\24\16\24\u010d\13\24\3\25\3\25\3"+
		"\25\5\25\u0112\n\25\3\25\3\25\3\25\3\25\3\25\7\25\u0119\n\25\f\25\16\25"+
		"\u011c\13\25\3\25\5\25\u011f\n\25\3\26\3\26\3\26\5\26\u0124\n\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u013c\n\34\f\34\16\34\u013f\13"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u014b\n\34"+
		"\f\34\16\34\u014e\13\34\3\34\3\34\5\34\u0152\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0178\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\5\36\u0182\n\36\3\36\3\36\3\36\3\36\5\36\u0188\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u0194\n \3 \3 \3 \3 \5 \u019a\n \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\7\"\u01aa\n\"\f\"\16\"\u01ad"+
		"\13\"\3\"\5\"\u01b0\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u01d0\n*\3*\3*\3*\3*"+
		"\3*\6*\u01d7\n*\r*\16*\u01d8\3*\3*\3*\3*\3*\5*\u01e0\n*\7*\u01e2\n*\f"+
		"*\16*\u01e5\13*\3*\5*\u01e8\n*\5*\u01ea\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\5*\u01f6\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0216\n*\f*\16*\u0219\13*\3+\3"+
		"+\5+\u021d\n+\3,\3,\3,\3,\5,\u0223\n,\6,\u0225\n,\r,\16,\u0226\3,\3,\3"+
		",\3,\5,\u022d\n,\7,\u022f\n,\f,\16,\u0232\13,\3-\3-\3-\3-\6-\u0238\n-"+
		"\r-\16-\u0239\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\6/\u0249\n/\r/\16"+
		"/\u024a\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\2\3R\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`b\2\t\3\2QR\3\2GH\3\2LM\3\2\4\6\3\2\7\t\5\2\66"+
		"9<<RR\4\2\63\63RR\2\u0285\2g\3\2\2\2\4t\3\2\2\2\6z\3\2\2\2\b\u0084\3\2"+
		"\2\2\n\u0086\3\2\2\2\f\u008e\3\2\2\2\16\u0095\3\2\2\2\20\u00a7\3\2\2\2"+
		"\22\u00b0\3\2\2\2\24\u00b2\3\2\2\2\26\u00b6\3\2\2\2\30\u00cc\3\2\2\2\32"+
		"\u00d7\3\2\2\2\34\u00d9\3\2\2\2\36\u00dc\3\2\2\2 \u00ec\3\2\2\2\"\u00f9"+
		"\3\2\2\2$\u00fb\3\2\2\2&\u0106\3\2\2\2(\u010e\3\2\2\2*\u0123\3\2\2\2,"+
		"\u0125\3\2\2\2.\u0129\3\2\2\2\60\u012d\3\2\2\2\62\u0131\3\2\2\2\64\u0135"+
		"\3\2\2\2\66\u0177\3\2\2\28\u0179\3\2\2\2:\u0187\3\2\2\2<\u0189\3\2\2\2"+
		">\u018f\3\2\2\2@\u019e\3\2\2\2B\u01a7\3\2\2\2D\u01b1\3\2\2\2F\u01b7\3"+
		"\2\2\2H\u01ba\3\2\2\2J\u01c0\3\2\2\2L\u01c2\3\2\2\2N\u01c4\3\2\2\2P\u01c6"+
		"\3\2\2\2R\u01f5\3\2\2\2T\u021c\3\2\2\2V\u021e\3\2\2\2X\u0233\3\2\2\2Z"+
		"\u023f\3\2\2\2\\\u0243\3\2\2\2^\u0250\3\2\2\2`\u0254\3\2\2\2b\u0257\3"+
		"\2\2\2df\5\6\4\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hm\3\2\2\2ig\3"+
		"\2\2\2jl\5\4\3\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nr\3\2\2\2om\3"+
		"\2\2\2ps\5\26\f\2qs\5\n\6\2rp\3\2\2\2rq\3\2\2\2s\3\3\2\2\2tu\7I\2\2uv"+
		"\7Q\2\2vw\7J\2\2wx\7R\2\2xy\7\37\2\2y\5\3\2\2\2z{\7K\2\2{|\7Q\2\2|~\7"+
		"\"\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7#\2\2\u0083\7\3\2\2\2\u0084"+
		"\u0085\t\2\2\2\u0085\t\3\2\2\2\u0086\u0087\7E\2\2\u0087\u008a\7R\2\2\u0088"+
		"\u0089\7F\2\2\u0089\u008b\5\f\7\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\5\20\t\2\u008d\13\3\2\2\2\u008e\u0092"+
		"\5\b\5\2\u008f\u0091\5\16\b\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\r\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0095\u0096\7\60\2\2\u0096\u0097\5\b\5\2\u0097\17\3\2\2\2\u0098"+
		"\u009c\7\"\2\2\u0099\u009b\5\20\t\2\u009a\u0099\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a8\7#\2\2\u00a0\u00a1\5T+\2\u00a1\u00a2\7\37\2"+
		"\2\u00a2\u00a8\3\2\2\2\u00a3\u00a8\5\22\n\2\u00a4\u00a8\5\n\6\2\u00a5"+
		"\u00a8\5\26\f\2\u00a6\u00a8\5\24\13\2\u00a7\u0098\3\2\2\2\u00a7\u00a0"+
		"\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\u00ab\5 \21"+
		"\2\u00ab\u00ac\5\b\5\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\5\34\17\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00b1\5\34\17\2\u00b0\u00a9\3\2\2\2\u00b0\u00af\3"+
		"\2\2\2\u00b1\23\3\2\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\5(\25\2\u00b4"+
		"\u00b5\7\37\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7D\2\2\u00b7\u00ba\7R\2\2"+
		"\u00b8\u00b9\7F\2\2\u00b9\u00bb\5\f\7\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5\30\r\2\u00bd\27\3\2\2\2\u00be"+
		"\u00c2\7\"\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00cd\7#\2\2\u00c6\u00cd\5\32\16\2\u00c7\u00cd\5"+
		"\26\f\2\u00c8\u00cd\5\n\6\2\u00c9\u00ca\5T+\2\u00ca\u00cb\7\37\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2"+
		"\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\31\3\2\2\2\u00ce\u00cf"+
		"\t\3\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\5\b\5\2\u00d1\u00d2\7\3\2\2\u00d2"+
		"\u00d3\5\34\17\2\u00d3\u00d8\3\2\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\5"+
		"\34\17\2\u00d6\u00d8\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8"+
		"\33\3\2\2\2\u00d9\u00da\5(\25\2\u00da\u00db\5\66\34\2\u00db\35\3\2\2\2"+
		"\u00dc\u00dd\5 \21\2\u00dd\u00de\5(\25\2\u00de\u00df\5\66\34\2\u00df\37"+
		"\3\2\2\2\u00e0\u00ed\5\"\22\2\u00e1\u00e2\7 \2\2\u00e2\u00e3\5\"\22\2"+
		"\u00e3\u00e7\7\60\2\2\u00e4\u00e6\5\"\22\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\7!\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e0\3\2"+
		"\2\2\u00ec\u00e1\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0\t\4\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\t\5"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f6\t\6\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6!\3\2\2\2"+
		"\u00f7\u00fa\5L\'\2\u00f8\u00fa\7:\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa#\3\2\2\2\u00fb\u00fc\5L\'\2\u00fc\u0103\7R\2\2\u00fd\u00fe"+
		"\7\60\2\2\u00fe\u00ff\5L\'\2\u00ff\u0100\7R\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104%\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010b\7R\2\2\u0107\u0108"+
		"\7\60\2\2\u0108\u010a\7R\2\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\'\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010e\u010f\7R\2\2\u010f\u0111\7 \2\2\u0110\u0112\5$\23\2\u0111\u0110"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011e\7!\2\2\u0114"+
		"\u011a\7&\2\2\u0115\u0116\5*\26\2\u0116\u0117\7\37\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\7\'"+
		"\2\2\u011e\u0114\3\2\2\2\u011e\u011f\3\2\2\2\u011f)\3\2\2\2\u0120\u0124"+
		"\5,\27\2\u0121\u0124\5.\30\2\u0122\u0124\5\60\31\2\u0123\u0120\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124+\3\2\2\2\u0125\u0126\5"+
		"N(\2\u0126\u0127\7\32\2\2\u0127\u0128\5\64\33\2\u0128-\3\2\2\2\u0129\u012a"+
		"\5N(\2\u012a\u012b\7\33\2\2\u012b\u012c\5\64\33\2\u012c/\3\2\2\2\u012d"+
		"\u012e\5N(\2\u012e\u012f\7\34\2\2\u012f\u0130\5\64\33\2\u0130\61\3\2\2"+
		"\2\u0131\u0132\5N(\2\u0132\u0133\7\n\2\2\u0133\u0134\5\64\33\2\u0134\63"+
		"\3\2\2\2\u0135\u0136\7R\2\2\u0136\u0137\7.\2\2\u0137\u0138\7R\2\2\u0138"+
		"\65\3\2\2\2\u0139\u013d\7\"\2\2\u013a\u013c\5\66\34\2\u013b\u013a\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0178\7#\2\2\u0141\u0142\5:\36"+
		"\2\u0142\u0143\7\37\2\2\u0143\u0178\3\2\2\2\u0144\u0151\7\36\2\2\u0145"+
		"\u0152\5N(\2\u0146\u0147\7 \2\2\u0147\u014c\5N(\2\u0148\u0149\7\60\2\2"+
		"\u0149\u014b\5N(\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0150\7!\2\2\u0150\u0152\3\2\2\2\u0151\u0145\3\2\2\2\u0151\u0146\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0178\7\37\2\2\u0154"+
		"\u0155\5*\26\2\u0155\u0156\7\37\2\2\u0156\u0178\3\2\2\2\u0157\u0178\5"+
		"B\"\2\u0158\u0178\5<\37\2\u0159\u0178\5> \2\u015a\u015b\5V,\2\u015b\u015c"+
		"\7\37\2\2\u015c\u0178\3\2\2\2\u015d\u015e\5Z.\2\u015e\u015f\7\37\2\2\u015f"+
		"\u0178\3\2\2\2\u0160\u0161\5\\/\2\u0161\u0162\7\37\2\2\u0162\u0178\3\2"+
		"\2\2\u0163\u0164\5^\60\2\u0164\u0165\7\37\2\2\u0165\u0178\3\2\2\2\u0166"+
		"\u0178\5`\61\2\u0167\u0168\5b\62\2\u0168\u0169\7\37\2\2\u0169\u0178\3"+
		"\2\2\2\u016a\u016b\5\26\f\2\u016b\u016c\7\37\2\2\u016c\u0178\3\2\2\2\u016d"+
		"\u016e\5\n\6\2\u016e\u016f\7\37\2\2\u016f\u0178\3\2\2\2\u0170\u0171\5"+
		"\36\20\2\u0171\u0172\7\37\2\2\u0172\u0178\3\2\2\2\u0173\u0174\58\35\2"+
		"\u0174\u0175\7\37\2\2\u0175\u0178\3\2\2\2\u0176\u0178\7\37\2\2\u0177\u0139"+
		"\3\2\2\2\u0177\u0141\3\2\2\2\u0177\u0144\3\2\2\2\u0177\u0154\3\2\2\2\u0177"+
		"\u0157\3\2\2\2\u0177\u0158\3\2\2\2\u0177\u0159\3\2\2\2\u0177\u015a\3\2"+
		"\2\2\u0177\u015d\3\2\2\2\u0177\u0160\3\2\2\2\u0177\u0163\3\2\2\2\u0177"+
		"\u0166\3\2\2\2\u0177\u0167\3\2\2\2\u0177\u016a\3\2\2\2\u0177\u016d\3\2"+
		"\2\2\u0177\u0170\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\67\3\2\2\2\u0179\u017a\7\65\2\2\u017a\u017b\7 \2\2\u017b\u017c\7R\2\2"+
		"\u017c\u017d\7!\2\2\u017d9\3\2\2\2\u017e\u017f\7R\2\2\u017f\u0181\7 \2"+
		"\2\u0180\u0182\5&\24\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0188\7!\2\2\u0184\u0185\7\63\2\2\u0185\u0186\7\13\2\2"+
		"\u0186\u0188\5:\36\2\u0187\u017e\3\2\2\2\u0187\u0184\3\2\2\2\u0188;\3"+
		"\2\2\2\u0189\u018a\7\f\2\2\u018a\u018b\7 \2\2\u018b\u018c\5J&\2\u018c"+
		"\u018d\7!\2\2\u018d\u018e\5\66\34\2\u018e=\3\2\2\2\u018f\u0190\7\r\2\2"+
		"\u0190\u0191\7 \2\2\u0191\u0193\5\66\34\2\u0192\u0194\7\37\2\2\u0193\u0192"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5J&\2\u0196"+
		"\u0197\7\37\2\2\u0197\u0199\5\66\34\2\u0198\u019a\7\37\2\2\u0199\u0198"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7!\2\2\u019c"+
		"\u019d\5\66\34\2\u019d?\3\2\2\2\u019e\u019f\7\r\2\2\u019f\u01a0\7 \2\2"+
		"\u01a0\u01a1\7R\2\2\u01a1\u01a2\7R\2\2\u01a2\u01a3\7\16\2\2\u01a3\u01a4"+
		"\7R\2\2\u01a4\u01a5\7!\2\2\u01a5\u01a6\5\66\34\2\u01a6A\3\2\2\2\u01a7"+
		"\u01ab\5D#\2\u01a8\u01aa\5H%\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2"+
		"\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ae\u01b0\5F$\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"C\3\2\2\2\u01b1\u01b2\7\17\2\2\u01b2\u01b3\7 \2\2\u01b3\u01b4\5J&\2\u01b4"+
		"\u01b5\7!\2\2\u01b5\u01b6\5\66\34\2\u01b6E\3\2\2\2\u01b7\u01b8\7\20\2"+
		"\2\u01b8\u01b9\5\66\34\2\u01b9G\3\2\2\2\u01ba\u01bb\7\21\2\2\u01bb\u01bc"+
		"\7 \2\2\u01bc\u01bd\5J&\2\u01bd\u01be\7!\2\2\u01be\u01bf\5\66\34\2\u01bf"+
		"I\3\2\2\2\u01c0\u01c1\5N(\2\u01c1K\3\2\2\2\u01c2\u01c3\t\7\2\2\u01c3M"+
		"\3\2\2\2\u01c4\u01c5\5R*\2\u01c5O\3\2\2\2\u01c6\u01c7\t\b\2\2\u01c7Q\3"+
		"\2\2\2\u01c8\u01c9\b*\1\2\u01c9\u01e9\5:\36\2\u01ca\u01e7\7\16\2\2\u01cb"+
		"\u01cc\5L\'\2\u01cc\u01cd\7R\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01d0\7R\2"+
		"\2\u01cf\u01cb\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01e8\3\2\2\2\u01d1\u01d6"+
		"\7 \2\2\u01d2\u01d3\5L\'\2\u01d3\u01d4\7R\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d7\7R\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e3\3\2\2\2\u01da"+
		"\u01df\7\60\2\2\u01db\u01dc\5L\'\2\u01dc\u01dd\7R\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01e0\7R\2\2\u01df\u01db\3\2\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01da\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01e8\7!\2\2\u01e7\u01cf\3\2\2\2\u01e7\u01d1\3\2\2\2\u01e8\u01ea\3\2"+
		"\2\2\u01e9\u01ca\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01f6\3\2\2\2\u01eb"+
		"\u01ec\7 \2\2\u01ec\u01ed\5R*\2\u01ed\u01ee\7!\2\2\u01ee\u01f6\3\2\2\2"+
		"\u01ef\u01f6\7\27\2\2\u01f0\u01f6\7\30\2\2\u01f1\u01f6\7\31\2\2\u01f2"+
		"\u01f6\7N\2\2\u01f3\u01f6\7O\2\2\u01f4\u01f6\5P)\2\u01f5\u01c8\3\2\2\2"+
		"\u01f5\u01eb\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f1"+
		"\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"\u0217\3\2\2\2\u01f7\u01f8\f\r\2\2\u01f8\u01f9\7&\2\2\u01f9\u0216\5R*"+
		"\16\u01fa\u01fb\f\f\2\2\u01fb\u01fc\7\22\2\2\u01fc\u0216\5R*\r\u01fd\u01fe"+
		"\f\13\2\2\u01fe\u01ff\7\23\2\2\u01ff\u0216\5R*\f\u0200\u0201\f\n\2\2\u0201"+
		"\u0202\7\'\2\2\u0202\u0216\5R*\13\u0203\u0204\f\t\2\2\u0204\u0205\7\34"+
		"\2\2\u0205\u0216\5R*\n\u0206\u0207\f\b\2\2\u0207\u0208\7\n\2\2\u0208\u0216"+
		"\5R*\t\u0209\u020a\f\7\2\2\u020a\u020b\7)\2\2\u020b\u0216\5R*\b\u020c"+
		"\u020d\f\6\2\2\u020d\u020e\7*\2\2\u020e\u0216\5R*\7\u020f\u0210\f\5\2"+
		"\2\u0210\u0211\7(\2\2\u0211\u0216\5R*\6\u0212\u0213\f\4\2\2\u0213\u0214"+
		"\7+\2\2\u0214\u0216\5R*\5\u0215\u01f7\3\2\2\2\u0215\u01fa\3\2\2\2\u0215"+
		"\u01fd\3\2\2\2\u0215\u0200\3\2\2\2\u0215\u0203\3\2\2\2\u0215\u0206\3\2"+
		"\2\2\u0215\u0209\3\2\2\2\u0215\u020c\3\2\2\2\u0215\u020f\3\2\2\2\u0215"+
		"\u0212\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218S\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021d\5V,\2\u021b\u021d"+
		"\5X-\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021dU\3\2\2\2\u021e\u0224"+
		"\5L\'\2\u021f\u0222\7R\2\2\u0220\u0221\7\35\2\2\u0221\u0223\5N(\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u021f\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0230\3\2\2\2\u0228\u0229\7\60\2\2\u0229\u022c\7R\2\2\u022a\u022b\7\35"+
		"\2\2\u022b\u022d\5N(\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f"+
		"\3\2\2\2\u022e\u0228\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231W\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0237\7 \2\2\u0234"+
		"\u0235\5L\'\2\u0235\u0236\7R\2\2\u0236\u0238\3\2\2\2\u0237\u0234\3\2\2"+
		"\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023b\u023c\7!\2\2\u023c\u023d\7\35\2\2\u023d\u023e\5N(\2\u023e"+
		"Y\3\2\2\2\u023f\u0240\7R\2\2\u0240\u0241\7\35\2\2\u0241\u0242\5N(\2\u0242"+
		"[\3\2\2\2\u0243\u0248\7 \2\2\u0244\u0249\7R\2\2\u0245\u0246\5L\'\2\u0246"+
		"\u0247\7R\2\2\u0247\u0249\3\2\2\2\u0248\u0244\3\2\2\2\u0248\u0245\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024d\7!\2\2\u024d\u024e\7\35\2\2\u024e\u024f\5N"+
		"(\2\u024f]\3\2\2\2\u0250\u0251\7R\2\2\u0251\u0252\7\24\2\2\u0252\u0253"+
		"\7R\2\2\u0253_\3\2\2\2\u0254\u0255\7R\2\2\u0255\u0256\7\25\2\2\u0256a"+
		"\3\2\2\2\u0257\u0258\7R\2\2\u0258\u0259\7\26\2\2\u0259c\3\2\2\2\67gmr"+
		"\u0080\u008a\u0092\u009c\u00a7\u00b0\u00ba\u00c2\u00cc\u00d7\u00e7\u00ec"+
		"\u00ef\u00f2\u00f5\u00f9\u0103\u010b\u0111\u011a\u011e\u0123\u013d\u014c"+
		"\u0151\u0177\u0181\u0187\u0193\u0199\u01ab\u01af\u01cf\u01d6\u01d8\u01df"+
		"\u01e3\u01e7\u01e9\u01f5\u0215\u0217\u021c\u0222\u0226\u022c\u0230\u0239"+
		"\u0248\u024a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}