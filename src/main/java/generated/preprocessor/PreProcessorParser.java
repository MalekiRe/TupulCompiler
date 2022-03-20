// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/PreProcessor.g4 by ANTLR 4.9.3
package generated.preprocessor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreProcessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IMPORT=3, FROM=4, AS=5, SEMICOLON=6, IDENTIFIER=7, FILE_IDENTIFIER=8, 
		WHITESPACE=9, GARBAGE=10;
	public static final int
		RULE_fileImports = 0, RULE_fileImport = 1, RULE_fromImport = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"fileImports", "fileImport", "fromImport"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'import'", "'from'", "'as'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IMPORT", "FROM", "AS", "SEMICOLON", "IDENTIFIER", 
			"FILE_IDENTIFIER", "WHITESPACE", "GARBAGE"
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
	public String getGrammarFileName() { return "PreProcessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PreProcessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileImportsContext extends ParserRuleContext {
		public List<FileImportContext> fileImport() {
			return getRuleContexts(FileImportContext.class);
		}
		public FileImportContext fileImport(int i) {
			return getRuleContext(FileImportContext.class,i);
		}
		public List<FromImportContext> fromImport() {
			return getRuleContexts(FromImportContext.class);
		}
		public FromImportContext fromImport(int i) {
			return getRuleContext(FromImportContext.class,i);
		}
		public List<TerminalNode> GARBAGE() { return getTokens(PreProcessorParser.GARBAGE); }
		public TerminalNode GARBAGE(int i) {
			return getToken(PreProcessorParser.GARBAGE, i);
		}
		public FileImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileImports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProcessorListener ) ((PreProcessorListener)listener).enterFileImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProcessorListener ) ((PreProcessorListener)listener).exitFileImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreProcessorVisitor ) return ((PreProcessorVisitor<? extends T>)visitor).visitFileImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileImportsContext fileImports() throws RecognitionException {
		FileImportsContext _localctx = new FileImportsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fileImports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==FROM) {
				{
				setState(8);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(6);
					fileImport();
					}
					break;
				case FROM:
					{
					setState(7);
					fromImport();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==GARBAGE) {
					{
					{
					setState(13);
					match(GARBAGE);
					}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
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

	public static class FileImportContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PreProcessorParser.IMPORT, 0); }
		public TerminalNode FILE_IDENTIFIER() { return getToken(PreProcessorParser.FILE_IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(PreProcessorParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PreProcessorParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(PreProcessorParser.SEMICOLON, 0); }
		public FileImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreProcessorListener ) ((PreProcessorListener)listener).enterFileImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProcessorListener ) ((PreProcessorListener)listener).exitFileImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreProcessorVisitor ) return ((PreProcessorVisitor<? extends T>)visitor).visitFileImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileImportContext fileImport() throws RecognitionException {
		FileImportContext _localctx = new FileImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(IMPORT);
			setState(23);
			match(FILE_IDENTIFIER);
			setState(24);
			match(AS);
			setState(25);
			match(IDENTIFIER);
			setState(26);
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
		public TerminalNode FROM() { return getToken(PreProcessorParser.FROM, 0); }
		public TerminalNode FILE_IDENTIFIER() { return getToken(PreProcessorParser.FILE_IDENTIFIER, 0); }
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
			if ( listener instanceof PreProcessorListener ) ((PreProcessorListener)listener).enterFromImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreProcessorListener ) ((PreProcessorListener)listener).exitFromImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreProcessorVisitor ) return ((PreProcessorVisitor<? extends T>)visitor).visitFromImport(this);
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
			setState(28);
			match(FROM);
			setState(29);
			match(FILE_IDENTIFIER);
			setState(30);
			match(T__0);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				fileImport();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(36);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\7\2\21\n\2\f\2\16\2"+
		"\24\13\2\3\2\5\2\27\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4#\n"+
		"\4\r\4\16\4$\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2*\2\f\3\2\2\2\4\30\3\2\2\2\6"+
		"\36\3\2\2\2\b\13\5\4\3\2\t\13\5\6\4\2\n\b\3\2\2\2\n\t\3\2\2\2\13\16\3"+
		"\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\26\3\2\2\2\16\f\3\2\2\2\17\21\7\f\2\2"+
		"\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\27\3\2\2\2"+
		"\24\22\3\2\2\2\25\27\3\2\2\2\26\22\3\2\2\2\26\25\3\2\2\2\27\3\3\2\2\2"+
		"\30\31\7\5\2\2\31\32\7\n\2\2\32\33\7\7\2\2\33\34\7\t\2\2\34\35\7\b\2\2"+
		"\35\5\3\2\2\2\36\37\7\6\2\2\37 \7\n\2\2 \"\7\3\2\2!#\5\4\3\2\"!\3\2\2"+
		"\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\4\2\2\'\7\3\2\2\2\7\n"+
		"\f\22\26$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}