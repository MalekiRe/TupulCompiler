// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.3
package generated.malek;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TupulLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "DIGIT", "INTEGER", "FLOAT", "DOUBLE", "PLUS_EQUALS", 
			"MINUS_EQUALS", "DOUBLE_EQUALS_LIST", "EQUALS_LIT", "RETURN_LIT", "SEMICOLON", 
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE", 
			"RIGHT_SQUARE", "LEFT_ANGLE", "RIGHT_ANGLE", "ADD_OP", "MULTI_OP", "DIV_OP", 
			"SUB_OP", "SINGLE_OR", "SINGLE_AND", "HASHTAG", "POINTER", "COMMA", "DOUBLE_OR", 
			"DOUBLE_AND", "THIS_KEYWORD", "SUPERSET_KEYWORD", "SUPER_KEYWORD", "INT_TYPE", 
			"FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "VOID_TYPE", "BOOL_TYPE", "STRING_TYPE", 
			"NULL_TYPE", "FALSE_KEYWORD", "TRUE_KEYWORD", "UNION_KEYWORD", "INSTANCEOF_KEYWORD", 
			"SUBSET_KEYWORD", "STRICT_SUBSET_KEYWORD", "TYPE", "INTERFACE", "EXTENDS", 
			"OVERRIDE", "IMPLEMENT", "IMPORT", "AS", "FROM", "PUBLIC", "PRIVATE", 
			"CHAR", "STRING", "WHITESPACE", "FILE_IDENTIFIER", "IDENTIFIER"
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


	public TupulLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tupul.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u023b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\27\6\27\u00ff\n\27\r\27\16\27\u0100\3"+
		"\30\6\30\u0104\n\30\r\30\16\30\u0105\3\30\3\30\6\30\u010a\n\30\r\30\16"+
		"\30\u010b\5\30\u010e\n\30\3\30\3\30\3\31\6\31\u0113\n\31\r\31\16\31\u0114"+
		"\3\31\3\31\6\31\u0119\n\31\r\31\16\31\u011a\5\31\u011d\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\3:"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>"+
		"\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I"+
		"\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\7O\u021b\nO\fO\16O\u021e\13O\3O\3O\3"+
		"P\6P\u0223\nP\rP\16P\u0224\3P\3P\3Q\3Q\6Q\u022b\nQ\rQ\16Q\u022c\3Q\3Q"+
		"\3R\6R\u0232\nR\rR\16R\u0233\3R\7R\u0237\nR\fR\16R\u023a\13R\3\u022c\2"+
		"S\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\2-\27/\30\61\31\63\32\65\33\67\349\35;\36"+
		"=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67"+
		"o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008d"+
		"G\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1"+
		"Q\u00a3R\3\2\b\3\2\62;\4\2..\60\60\5\2\62;C\\c|\5\2\f\f\17\17$$\5\2\13"+
		"\f\17\17\"\"\4\2C\\c|\2\u0246\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2"+
		"\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2"+
		"\2\5\u00a8\3\2\2\2\7\u00ae\3\2\2\2\t\u00b4\3\2\2\2\13\u00ba\3\2\2\2\r"+
		"\u00c0\3\2\2\2\17\u00c5\3\2\2\2\21\u00ca\3\2\2\2\23\u00cd\3\2\2\2\25\u00cf"+
		"\3\2\2\2\27\u00d5\3\2\2\2\31\u00d9\3\2\2\2\33\u00db\3\2\2\2\35\u00de\3"+
		"\2\2\2\37\u00e3\3\2\2\2!\u00eb\3\2\2\2#\u00ee\3\2\2\2%\u00f1\3\2\2\2\'"+
		"\u00f5\3\2\2\2)\u00f8\3\2\2\2+\u00fb\3\2\2\2-\u00fe\3\2\2\2/\u0103\3\2"+
		"\2\2\61\u0112\3\2\2\2\63\u011e\3\2\2\2\65\u0121\3\2\2\2\67\u0124\3\2\2"+
		"\29\u0127\3\2\2\2;\u0129\3\2\2\2=\u0130\3\2\2\2?\u0132\3\2\2\2A\u0134"+
		"\3\2\2\2C\u0136\3\2\2\2E\u0138\3\2\2\2G\u013a\3\2\2\2I\u013c\3\2\2\2K"+
		"\u013e\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2\2\2Q\u0144\3\2\2\2S\u0146\3\2"+
		"\2\2U\u0148\3\2\2\2W\u014a\3\2\2\2Y\u014c\3\2\2\2[\u014e\3\2\2\2]\u0150"+
		"\3\2\2\2_\u0152\3\2\2\2a\u0154\3\2\2\2c\u0157\3\2\2\2e\u015a\3\2\2\2g"+
		"\u015f\3\2\2\2i\u0168\3\2\2\2k\u016e\3\2\2\2m\u0172\3\2\2\2o\u0178\3\2"+
		"\2\2q\u017f\3\2\2\2s\u0184\3\2\2\2u\u0189\3\2\2\2w\u018e\3\2\2\2y\u0195"+
		"\3\2\2\2{\u019a\3\2\2\2}\u01a0\3\2\2\2\177\u01a5\3\2\2\2\u0081\u01ab\3"+
		"\2\2\2\u0083\u01b6\3\2\2\2\u0085\u01bd\3\2\2\2\u0087\u01ca\3\2\2\2\u0089"+
		"\u01cf\3\2\2\2\u008b\u01d9\3\2\2\2\u008d\u01e1\3\2\2\2\u008f\u01ea\3\2"+
		"\2\2\u0091\u01f4\3\2\2\2\u0093\u01fb\3\2\2\2\u0095\u01fe\3\2\2\2\u0097"+
		"\u0203\3\2\2\2\u0099\u020a\3\2\2\2\u009b\u0212\3\2\2\2\u009d\u0216\3\2"+
		"\2\2\u009f\u0222\3\2\2\2\u00a1\u0228\3\2\2\2\u00a3\u0231\3\2\2\2\u00a5"+
		"\u00a6\7<\2\2\u00a6\u00a7\7<\2\2\u00a7\4\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7f\2\2"+
		"\u00ad\6\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7p"+
		"\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\b\3\2\2\2\u00b4\u00b5"+
		"\7h\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7z\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7f\2\2\u00b9\n\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7{\2\2\u00bf\f\3\2\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7{\2\2"+
		"\u00c4\16\3\2\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7"+
		"t\2\2\u00c8\u00c9\7g\2\2\u00c9\20\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc\22\3\2\2\2\u00cd\u00ce\7\60\2\2\u00ce\24\3\2\2\2\u00cf\u00d0"+
		"\7y\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\26\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\30\3\2\2\2\u00d9\u00da\7<\2\2\u00da\32\3\2\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd\34\3\2\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\36\3\2\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7h\2\2\u00ea \3\2"+
		"\2\2\u00eb\u00ec\7>\2\2\u00ec\u00ed\7?\2\2\u00ed\"\3\2\2\2\u00ee\u00ef"+
		"\7@\2\2\u00ef\u00f0\7?\2\2\u00f0$\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3"+
		"\7/\2\2\u00f3\u00f4\7@\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7-\2\2\u00f6\u00f7"+
		"\7-\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fa\7/\2\2\u00fa*\3"+
		"\2\2\2\u00fb\u00fc\t\2\2\2\u00fc,\3\2\2\2\u00fd\u00ff\5+\26\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		".\3\2\2\2\u0102\u0104\5+\26\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010d\3\2\2\2\u0107\u0109"+
		"\t\3\2\2\u0108\u010a\5+\26\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0107\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7h\2\2\u0110"+
		"\60\3\2\2\2\u0111\u0113\5+\26\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2"+
		"\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011c\3\2\2\2\u0116\u0118"+
		"\t\3\2\2\u0117\u0119\5+\26\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\62\3\2\2\2\u011e\u011f\7-\2\2\u011f\u0120"+
		"\7?\2\2\u0120\64\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\7?\2\2\u0123\66"+
		"\3\2\2\2\u0124\u0125\7?\2\2\u0125\u0126\7?\2\2\u01268\3\2\2\2\u0127\u0128"+
		"\7?\2\2\u0128:\3\2\2\2\u0129\u012a\7t\2\2\u012a\u012b\7g\2\2\u012b\u012c"+
		"\7v\2\2\u012c\u012d\7w\2\2\u012d\u012e\7t\2\2\u012e\u012f\7p\2\2\u012f"+
		"<\3\2\2\2\u0130\u0131\7=\2\2\u0131>\3\2\2\2\u0132\u0133\7*\2\2\u0133@"+
		"\3\2\2\2\u0134\u0135\7+\2\2\u0135B\3\2\2\2\u0136\u0137\7}\2\2\u0137D\3"+
		"\2\2\2\u0138\u0139\7\177\2\2\u0139F\3\2\2\2\u013a\u013b\7]\2\2\u013bH"+
		"\3\2\2\2\u013c\u013d\7_\2\2\u013dJ\3\2\2\2\u013e\u013f\7>\2\2\u013fL\3"+
		"\2\2\2\u0140\u0141\7@\2\2\u0141N\3\2\2\2\u0142\u0143\7-\2\2\u0143P\3\2"+
		"\2\2\u0144\u0145\7,\2\2\u0145R\3\2\2\2\u0146\u0147\7\61\2\2\u0147T\3\2"+
		"\2\2\u0148\u0149\7/\2\2\u0149V\3\2\2\2\u014a\u014b\7~\2\2\u014bX\3\2\2"+
		"\2\u014c\u014d\7(\2\2\u014dZ\3\2\2\2\u014e\u014f\7%\2\2\u014f\\\3\2\2"+
		"\2\u0150\u0151\7B\2\2\u0151^\3\2\2\2\u0152\u0153\7.\2\2\u0153`\3\2\2\2"+
		"\u0154\u0155\7~\2\2\u0155\u0156\7~\2\2\u0156b\3\2\2\2\u0157\u0158\7(\2"+
		"\2\u0158\u0159\7(\2\2\u0159d\3\2\2\2\u015a\u015b\7v\2\2\u015b\u015c\7"+
		"j\2\2\u015c\u015d\7k\2\2\u015d\u015e\7u\2\2\u015ef\3\2\2\2\u015f\u0160"+
		"\7u\2\2\u0160\u0161\7w\2\2\u0161\u0162\7r\2\2\u0162\u0163\7g\2\2\u0163"+
		"\u0164\7t\2\2\u0164\u0165\7u\2\2\u0165\u0166\7g\2\2\u0166\u0167\7v\2\2"+
		"\u0167h\3\2\2\2\u0168\u0169\7u\2\2\u0169\u016a\7w\2\2\u016a\u016b\7r\2"+
		"\2\u016b\u016c\7g\2\2\u016c\u016d\7t\2\2\u016dj\3\2\2\2\u016e\u016f\7"+
		"k\2\2\u016f\u0170\7p\2\2\u0170\u0171\7v\2\2\u0171l\3\2\2\2\u0172\u0173"+
		"\7h\2\2\u0173\u0174\7n\2\2\u0174\u0175\7q\2\2\u0175\u0176\7c\2\2\u0176"+
		"\u0177\7v\2\2\u0177n\3\2\2\2\u0178\u0179\7f\2\2\u0179\u017a\7q\2\2\u017a"+
		"\u017b\7w\2\2\u017b\u017c\7d\2\2\u017c\u017d\7n\2\2\u017d\u017e\7g\2\2"+
		"\u017ep\3\2\2\2\u017f\u0180\7e\2\2\u0180\u0181\7j\2\2\u0181\u0182\7c\2"+
		"\2\u0182\u0183\7t\2\2\u0183r\3\2\2\2\u0184\u0185\7x\2\2\u0185\u0186\7"+
		"q\2\2\u0186\u0187\7k\2\2\u0187\u0188\7f\2\2\u0188t\3\2\2\2\u0189\u018a"+
		"\7d\2\2\u018a\u018b\7q\2\2\u018b\u018c\7q\2\2\u018c\u018d\7n\2\2\u018d"+
		"v\3\2\2\2\u018e\u018f\7u\2\2\u018f\u0190\7v\2\2\u0190\u0191\7t\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7p\2\2\u0193\u0194\7i\2\2\u0194x\3\2\2\2\u0195"+
		"\u0196\7p\2\2\u0196\u0197\7w\2\2\u0197\u0198\7n\2\2\u0198\u0199\7n\2\2"+
		"\u0199z\3\2\2\2\u019a\u019b\7h\2\2\u019b\u019c\7c\2\2\u019c\u019d\7n\2"+
		"\2\u019d\u019e\7u\2\2\u019e\u019f\7g\2\2\u019f|\3\2\2\2\u01a0\u01a1\7"+
		"v\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a3\7w\2\2\u01a3\u01a4\7g\2\2\u01a4~"+
		"\3\2\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7k\2\2\u01a8"+
		"\u01a9\7q\2\2\u01a9\u01aa\7p\2\2\u01aa\u0080\3\2\2\2\u01ab\u01ac\7k\2"+
		"\2\u01ac\u01ad\7p\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7v\2\2\u01af\u01b0"+
		"\7c\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7e\2\2\u01b2\u01b3\7g\2\2\u01b3"+
		"\u01b4\7q\2\2\u01b4\u01b5\7h\2\2\u01b5\u0082\3\2\2\2\u01b6\u01b7\7u\2"+
		"\2\u01b7\u01b8\7w\2\2\u01b8\u01b9\7d\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb"+
		"\7g\2\2\u01bb\u01bc\7v\2\2\u01bc\u0084\3\2\2\2\u01bd\u01be\7u\2\2\u01be"+
		"\u01bf\7v\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7e\2\2"+
		"\u01c2\u01c3\7v\2\2\u01c3\u01c4\7u\2\2\u01c4\u01c5\7w\2\2\u01c5\u01c6"+
		"\7d\2\2\u01c6\u01c7\7u\2\2\u01c7\u01c8\7g\2\2\u01c8\u01c9\7v\2\2\u01c9"+
		"\u0086\3\2\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7{\2\2\u01cc\u01cd\7r\2"+
		"\2\u01cd\u01ce\7g\2\2\u01ce\u0088\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1"+
		"\7p\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7t\2\2\u01d4"+
		"\u01d5\7h\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7e\2\2\u01d7\u01d8\7g\2\2"+
		"\u01d8\u008a\3\2\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7z\2\2\u01db\u01dc"+
		"\7v\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7p\2\2\u01de\u01df\7f\2\2\u01df"+
		"\u01e0\7u\2\2\u01e0\u008c\3\2\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7x\2"+
		"\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7"+
		"\7k\2\2\u01e7\u01e8\7f\2\2\u01e8\u01e9\7g\2\2\u01e9\u008e\3\2\2\2\u01ea"+
		"\u01eb\7k\2\2\u01eb\u01ec\7o\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee\7n\2\2"+
		"\u01ee\u01ef\7g\2\2\u01ef\u01f0\7o\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2"+
		"\7p\2\2\u01f2\u01f3\7v\2\2\u01f3\u0090\3\2\2\2\u01f4\u01f5\7k\2\2\u01f5"+
		"\u01f6\7o\2\2\u01f6\u01f7\7r\2\2\u01f7\u01f8\7q\2\2\u01f8\u01f9\7t\2\2"+
		"\u01f9\u01fa\7v\2\2\u01fa\u0092\3\2\2\2\u01fb\u01fc\7c\2\2\u01fc\u01fd"+
		"\7u\2\2\u01fd\u0094\3\2\2\2\u01fe\u01ff\7h\2\2\u01ff\u0200\7t\2\2\u0200"+
		"\u0201\7q\2\2\u0201\u0202\7o\2\2\u0202\u0096\3\2\2\2\u0203\u0204\7r\2"+
		"\2\u0204\u0205\7w\2\2\u0205\u0206\7d\2\2\u0206\u0207\7n\2\2\u0207\u0208"+
		"\7k\2\2\u0208\u0209\7e\2\2\u0209\u0098\3\2\2\2\u020a\u020b\7r\2\2\u020b"+
		"\u020c\7t\2\2\u020c\u020d\7k\2\2\u020d\u020e\7x\2\2\u020e\u020f\7c\2\2"+
		"\u020f\u0210\7v\2\2\u0210\u0211\7g\2\2\u0211\u009a\3\2\2\2\u0212\u0213"+
		"\7)\2\2\u0213\u0214\t\4\2\2\u0214\u0215\7)\2\2\u0215\u009c\3\2\2\2\u0216"+
		"\u021c\7$\2\2\u0217\u021b\n\5\2\2\u0218\u0219\7$\2\2\u0219\u021b\7$\2"+
		"\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0220\7$\2\2\u0220\u009e\3\2\2\2\u0221\u0223\t\6\2\2\u0222\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\bP\2\2\u0227\u00a0\3\2\2\2\u0228\u022a\7)\2"+
		"\2\u0229\u022b\13\2\2\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7)"+
		"\2\2\u022f\u00a2\3\2\2\2\u0230\u0232\t\7\2\2\u0231\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0238\3\2"+
		"\2\2\u0235\u0237\t\4\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u00a4\3\2\2\2\u023a\u0238\3\2"+
		"\2\2\20\2\u0100\u0105\u010b\u010d\u0114\u011a\u011c\u021a\u021c\u0224"+
		"\u022c\u0233\u0238\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}