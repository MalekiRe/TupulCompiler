// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/PreProcessor.g4 by ANTLR 4.9.3
package generated.preprocessor;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreProcessorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IMPORT=3, FROM=4, AS=5, SEMICOLON=6, IDENTIFIER=7, FILE_IDENTIFIER=8, 
		WHITESPACE=9, GARBAGE=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IMPORT", "FROM", "AS", "SEMICOLON", "IDENTIFIER", "FILE_IDENTIFIER", 
			"WHITESPACE", "GARBAGE"
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


	public PreProcessorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PreProcessor.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fL\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\6\b.\n\b\r\b\16\b/\3\b\7\b\63\n\b\f\b\16\b\66\13"+
		"\b\3\t\3\t\6\t:\n\t\r\t\16\t;\3\t\3\t\3\n\6\nA\n\n\r\n\16\nB\3\n\3\n\3"+
		"\13\3\13\6\13I\n\13\r\13\16\13J\4;J\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\3\2\5\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2Q\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31"+
		"\3\2\2\2\7\33\3\2\2\2\t\"\3\2\2\2\13\'\3\2\2\2\r*\3\2\2\2\17-\3\2\2\2"+
		"\21\67\3\2\2\2\23@\3\2\2\2\25H\3\2\2\2\27\30\7}\2\2\30\4\3\2\2\2\31\32"+
		"\7\177\2\2\32\6\3\2\2\2\33\34\7k\2\2\34\35\7o\2\2\35\36\7r\2\2\36\37\7"+
		"q\2\2\37 \7t\2\2 !\7v\2\2!\b\3\2\2\2\"#\7h\2\2#$\7t\2\2$%\7q\2\2%&\7o"+
		"\2\2&\n\3\2\2\2\'(\7c\2\2()\7u\2\2)\f\3\2\2\2*+\7=\2\2+\16\3\2\2\2,.\t"+
		"\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61\63\t"+
		"\3\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\20\3"+
		"\2\2\2\66\64\3\2\2\2\679\7)\2\28:\13\2\2\298\3\2\2\2:;\3\2\2\2;<\3\2\2"+
		"\2;9\3\2\2\2<=\3\2\2\2=>\7)\2\2>\22\3\2\2\2?A\t\4\2\2@?\3\2\2\2AB\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\n\2\2E\24\3\2\2\2FI\13\2\2\2GI"+
		"\7\f\2\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2JH\3\2\2\2K\26\3\2\2\2"+
		"\t\2/\64;BHJ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}