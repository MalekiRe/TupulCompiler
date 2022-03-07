// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INTEGER=2, FLOAT=3, DOUBLE=4, EQUALS_LIT=5, RETURN_LIT=6, SEMICOLON=7, 
		LEFT_PAREN=8, RIGHT_PAREN=9, LEFT_CURLY=10, RIGHT_CURLY=11, ADD_OP=12, 
		MULTI_OP=13, REF_OP=14, DIV_OP=15, SUB_OP=16, INT_TYPE=17, FLOAT_TYPE=18, 
		DOUBLE_TYPE=19, CHAR_TYPE=20, VOID_TYPE=21, CHAR=22, STRING=23, WHITESPACE=24, 
		IDENTIFIER=25;
	public static final int
		RULE_fullFile = 0, RULE_varDec = 1, RULE_varAssignment = 2, RULE_functionType = 3, 
		RULE_variableType = 4, RULE_functionDec = 5, RULE_functionDecArgs = 6, 
		RULE_functionDecArg = 7, RULE_functionCall = 8, RULE_functionCallArgs = 9, 
		RULE_functionCallArg = 10, RULE_functionCode = 11, RULE_functionCodeBlock = 12, 
		RULE_number = 13, RULE_expressionValue = 14, RULE_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"fullFile", "varDec", "varAssignment", "functionType", "variableType", 
			"functionDec", "functionDecArgs", "functionDecArg", "functionCall", "functionCallArgs", 
			"functionCallArg", "functionCode", "functionCodeBlock", "number", "expressionValue", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, "'='", "'return'", "';'", "'('", "')'", 
			"'{'", "'}'", "'+'", "'*'", "'&'", "'/'", "'-'", "'int'", "'float'", 
			"'double'", "'char'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INTEGER", "FLOAT", "DOUBLE", "EQUALS_LIT", "RETURN_LIT", 
			"SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_CURLY", "RIGHT_CURLY", 
			"ADD_OP", "MULTI_OP", "REF_OP", "DIV_OP", "SUB_OP", "INT_TYPE", "FLOAT_TYPE", 
			"DOUBLE_TYPE", "CHAR_TYPE", "VOID_TYPE", "CHAR", "STRING", "WHITESPACE", 
			"IDENTIFIER"
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

	public static class FullFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TupulParser.EOF, 0); }
		public List<FunctionDecContext> functionDec() {
			return getRuleContexts(FunctionDecContext.class);
		}
		public FunctionDecContext functionDec(int i) {
			return getRuleContext(FunctionDecContext.class,i);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public FullFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFullFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFullFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFullFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullFileContext fullFile() throws RecognitionException {
		FullFileContext _localctx = new FullFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fullFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					functionDec();
					}
					break;
				case 2:
					{
					setState(33);
					varDec();
					}
					break;
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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

	public static class VarDecContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public TerminalNode EQUALS_LIT() { return getToken(TupulParser.EQUALS_LIT, 0); }
		public ExpressionValueContext expressionValue() {
			return getRuleContext(ExpressionValueContext.class,0);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			variableType();
			setState(42);
			match(IDENTIFIER);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS_LIT) {
				{
				setState(43);
				match(EQUALS_LIT);
				setState(44);
				expressionValue();
				}
			}

			setState(47);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_LIT() { return getToken(TupulParser.EQUALS_LIT, 0); }
		public ExpressionValueContext expressionValue() {
			return getRuleContext(ExpressionValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IDENTIFIER);
			setState(50);
			match(EQUALS_LIT);
			setState(51);
			expressionValue();
			setState(52);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	 
		public FunctionTypeContext() { }
		public void copyFrom(FunctionTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatFunctionTypeContext extends FunctionTypeContext {
		public TerminalNode FLOAT_TYPE() { return getToken(TupulParser.FLOAT_TYPE, 0); }
		public FloatFunctionTypeContext(FunctionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFloatFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFloatFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFloatFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntFunctionTypeContext extends FunctionTypeContext {
		public TerminalNode INT_TYPE() { return getToken(TupulParser.INT_TYPE, 0); }
		public IntFunctionTypeContext(FunctionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterIntFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitIntFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitIntFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionTypeContext extends FunctionTypeContext {
		public TerminalNode VOID_TYPE() { return getToken(TupulParser.VOID_TYPE, 0); }
		public VoidFunctionTypeContext(FunctionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterVoidFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitVoidFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitVoidFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleFunctionTypeContext extends FunctionTypeContext {
		public TerminalNode DOUBLE_TYPE() { return getToken(TupulParser.DOUBLE_TYPE, 0); }
		public DoubleFunctionTypeContext(FunctionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterDoubleFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitDoubleFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitDoubleFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharFunctionTypeContext extends FunctionTypeContext {
		public TerminalNode CHAR_TYPE() { return getToken(TupulParser.CHAR_TYPE, 0); }
		public CharFunctionTypeContext(FunctionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterCharFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitCharFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitCharFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionType);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				_localctx = new IntFunctionTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(INT_TYPE);
				}
				break;
			case FLOAT_TYPE:
				_localctx = new FloatFunctionTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(FLOAT_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				_localctx = new DoubleFunctionTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(DOUBLE_TYPE);
				}
				break;
			case CHAR_TYPE:
				_localctx = new CharFunctionTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(CHAR_TYPE);
				}
				break;
			case VOID_TYPE:
				_localctx = new VoidFunctionTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(VOID_TYPE);
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

	public static class VariableTypeContext extends ParserRuleContext {
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
	 
		public VariableTypeContext() { }
		public void copyFrom(VariableTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleVariableTypeContext extends VariableTypeContext {
		public TerminalNode DOUBLE_TYPE() { return getToken(TupulParser.DOUBLE_TYPE, 0); }
		public DoubleVariableTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterDoubleVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitDoubleVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitDoubleVariableType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatVariableTypeContext extends VariableTypeContext {
		public TerminalNode FLOAT_TYPE() { return getToken(TupulParser.FLOAT_TYPE, 0); }
		public FloatVariableTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFloatVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFloatVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFloatVariableType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharVariableTypeContext extends VariableTypeContext {
		public TerminalNode CHAR_TYPE() { return getToken(TupulParser.CHAR_TYPE, 0); }
		public CharVariableTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterCharVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitCharVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitCharVariableType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntVariableTypeContext extends VariableTypeContext {
		public TerminalNode INT_TYPE() { return getToken(TupulParser.INT_TYPE, 0); }
		public IntVariableTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterIntVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitIntVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitIntVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableType);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				_localctx = new IntVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(INT_TYPE);
				}
				break;
			case FLOAT_TYPE:
				_localctx = new FloatVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(FLOAT_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				_localctx = new DoubleVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(DOUBLE_TYPE);
				}
				break;
			case CHAR_TYPE:
				_localctx = new CharVariableTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(CHAR_TYPE);
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

	public static class FunctionDecContext extends ParserRuleContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public FunctionDecArgsContext functionDecArgs() {
			return getRuleContext(FunctionDecArgsContext.class,0);
		}
		public FunctionCodeContext functionCode() {
			return getRuleContext(FunctionCodeContext.class,0);
		}
		public FunctionDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDecContext functionDec() throws RecognitionException {
		FunctionDecContext _localctx = new FunctionDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			functionType();
			setState(68);
			match(IDENTIFIER);
			setState(69);
			functionDecArgs();
			setState(70);
			functionCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDecArgsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public List<FunctionDecArgContext> functionDecArg() {
			return getRuleContexts(FunctionDecArgContext.class);
		}
		public FunctionDecArgContext functionDecArg(int i) {
			return getRuleContext(FunctionDecArgContext.class,i);
		}
		public FunctionDecArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionDecArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionDecArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionDecArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDecArgsContext functionDecArgs() throws RecognitionException {
		FunctionDecArgsContext _localctx = new FunctionDecArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDecArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LEFT_PAREN);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE))) != 0)) {
				{
				setState(73);
				functionDecArg();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(74);
					match(T__0);
					setState(75);
					functionDecArg();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
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

	public static class FunctionDecArgContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public FunctionDecArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionDecArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionDecArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionDecArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDecArgContext functionDecArg() throws RecognitionException {
		FunctionDecArgContext _localctx = new FunctionDecArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDecArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			variableType();
			setState(86);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TupulParser.IDENTIFIER, 0); }
		public FunctionCallArgsContext functionCallArgs() {
			return getRuleContext(FunctionCallArgsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			setState(89);
			functionCallArgs();
			setState(90);
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

	public static class FunctionCallArgsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public List<FunctionCallArgContext> functionCallArg() {
			return getRuleContexts(FunctionCallArgContext.class);
		}
		public FunctionCallArgContext functionCallArg(int i) {
			return getRuleContext(FunctionCallArgContext.class,i);
		}
		public FunctionCallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgsContext functionCallArgs() throws RecognitionException {
		FunctionCallArgsContext _localctx = new FunctionCallArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCallArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LEFT_PAREN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << LEFT_PAREN) | (1L << CHAR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(93);
				functionCallArg();
				{
				setState(94);
				match(T__0);
				setState(95);
				functionCallArg();
				}
				}
			}

			setState(99);
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

	public static class FunctionCallArgContext extends ParserRuleContext {
		public ExpressionValueContext expressionValue() {
			return getRuleContext(ExpressionValueContext.class,0);
		}
		public FunctionCallArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgContext functionCallArg() throws RecognitionException {
		FunctionCallArgContext _localctx = new FunctionCallArgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			expressionValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCodeContext extends ParserRuleContext {
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public FunctionCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunctionCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunctionCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunctionCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCodeContext functionCode() throws RecognitionException {
		FunctionCodeContext _localctx = new FunctionCodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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

	public static class FunctionCodeBlockContext extends ParserRuleContext {
		public FunctionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlock; }
	 
		public FunctionCodeBlockContext() { }
		public void copyFrom(FunctionCodeBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunCodeBlockContext extends FunctionCodeBlockContext {
		public TerminalNode LEFT_CURLY() { return getToken(TupulParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TupulParser.RIGHT_CURLY, 0); }
		public List<FunctionCodeBlockContext> functionCodeBlock() {
			return getRuleContexts(FunctionCodeBlockContext.class);
		}
		public FunctionCodeBlockContext functionCodeBlock(int i) {
			return getRuleContext(FunctionCodeBlockContext.class,i);
		}
		public FunCodeBlockContext(FunctionCodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFunCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFunCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFunCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCodeReturnContext extends FunctionCodeBlockContext {
		public TerminalNode RETURN_LIT() { return getToken(TupulParser.RETURN_LIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(TupulParser.SEMICOLON, 0); }
		public ExpressionValueContext expressionValue() {
			return getRuleContext(ExpressionValueContext.class,0);
		}
		public FuncCodeReturnContext(FunctionCodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFuncCodeReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFuncCodeReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFuncCodeReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCodeVarDecContext extends FunctionCodeBlockContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public FuncCodeVarDecContext(FunctionCodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFuncCodeVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFuncCodeVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFuncCodeVarDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCodeVarAssignmentContext extends FunctionCodeBlockContext {
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public FuncCodeVarAssignmentContext(FunctionCodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFuncCodeVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFuncCodeVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFuncCodeVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCodeFuncCallContext extends FunctionCodeBlockContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCodeFuncCallContext(FunctionCodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterFuncCodeFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitFuncCodeFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitFuncCodeFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCodeBlockContext functionCodeBlock() throws RecognitionException {
		FunctionCodeBlockContext _localctx = new FunctionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCodeBlock);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new FunCodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(LEFT_CURLY);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN_LIT) | (1L << LEFT_CURLY) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(106);
					functionCodeBlock();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(RIGHT_CURLY);
				}
				break;
			case 2:
				_localctx = new FuncCodeVarDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				varDec();
				}
				break;
			case 3:
				_localctx = new FuncCodeVarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				varAssignment();
				}
				break;
			case 4:
				_localctx = new FuncCodeFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				functionCall();
				}
				break;
			case 5:
				_localctx = new FuncCodeReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(RETURN_LIT);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << LEFT_PAREN) | (1L << CHAR) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(117);
					expressionValue();
					}
				}

				setState(120);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberFloatContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(TupulParser.FLOAT, 0); }
		public NumberFloatContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterNumberFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitNumberFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitNumberFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberCharContext extends NumberContext {
		public TerminalNode CHAR() { return getToken(TupulParser.CHAR, 0); }
		public NumberCharContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterNumberChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitNumberChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitNumberChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberIntegerContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(TupulParser.INTEGER, 0); }
		public NumberIntegerContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterNumberInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitNumberInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitNumberInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberDoubleContext extends NumberContext {
		public TerminalNode DOUBLE() { return getToken(TupulParser.DOUBLE, 0); }
		public NumberDoubleContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterNumberDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitNumberDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitNumberDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new NumberIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new NumberFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				_localctx = new NumberDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(DOUBLE);
				}
				break;
			case CHAR:
				_localctx = new NumberCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(CHAR);
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

	public static class ExpressionValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionValueContext expressionValue() throws RecognitionException {
		ExpressionValueContext _localctx = new ExpressionValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpNumberContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterExpNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitExpNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitExpNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(TupulParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(TupulParser.RIGHT_PAREN, 0); }
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpFunctionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterExpFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitExpFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitExpFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpBiOpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTI_OP() { return getToken(TupulParser.MULTI_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(TupulParser.DIV_OP, 0); }
		public TerminalNode ADD_OP() { return getToken(TupulParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(TupulParser.SUB_OP, 0); }
		public ExpBiOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).enterExpBiOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TupulListener ) ((TupulListener)listener).exitExpBiOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TupulVisitor ) return ((TupulVisitor<? extends T>)visitor).visitExpBiOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case DOUBLE:
			case CHAR:
				{
				_localctx = new ExpNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				number();
				}
				break;
			case LEFT_PAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(LEFT_PAREN);
				setState(134);
				expression(0);
				setState(135);
				match(RIGHT_PAREN);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new ExpFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpBiOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(141);
						((ExpBiOpContext)_localctx).op = match(MULTI_OP);
						setState(142);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpBiOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(144);
						((ExpBiOpContext)_localctx).op = match(DIV_OP);
						setState(145);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpBiOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(147);
						((ExpBiOpContext)_localctx).op = match(ADD_OP);
						setState(148);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpBiOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(150);
						((ExpBiOpContext)_localctx).op = match(SUB_OP);
						setState(151);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\5\6D\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\5\bT\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13d"+
		"\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16n\n\16\f\16\16\16q\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16y\n\16\3\16\5\16|\n\16\3\17\3\17\3"+
		"\17\3\17\5\17\u0082\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u008d\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u009b\n\21\f\21\16\21\u009e\13\21\3\21\2\3 \22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\2\2\u00ab\2&\3\2\2\2\4+\3\2\2\2\6\63\3"+
		"\2\2\2\b=\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16J\3\2\2\2\20W\3\2\2\2\22Z\3"+
		"\2\2\2\24^\3\2\2\2\26g\3\2\2\2\30i\3\2\2\2\32{\3\2\2\2\34\u0081\3\2\2"+
		"\2\36\u0083\3\2\2\2 \u008c\3\2\2\2\"%\5\f\7\2#%\5\4\3\2$\"\3\2\2\2$#\3"+
		"\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\2\2\3*"+
		"\3\3\2\2\2+,\5\n\6\2,/\7\33\2\2-.\7\7\2\2.\60\5\36\20\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\61\3\2\2\2\61\62\7\t\2\2\62\5\3\2\2\2\63\64\7\33\2\2\64\65"+
		"\7\7\2\2\65\66\5\36\20\2\66\67\7\t\2\2\67\7\3\2\2\28>\7\23\2\29>\7\24"+
		"\2\2:>\7\25\2\2;>\7\26\2\2<>\7\27\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;"+
		"\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?D\7\23\2\2@D\7\24\2\2AD\7\25\2\2BD\7\26"+
		"\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\13\3\2\2\2EF\5\b\5\2FG\7"+
		"\33\2\2GH\5\16\b\2HI\5\30\r\2I\r\3\2\2\2JS\7\n\2\2KP\5\20\t\2LM\7\3\2"+
		"\2MO\5\20\t\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2"+
		"\2\2SK\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\13\2\2V\17\3\2\2\2WX\5\n\6\2XY"+
		"\7\33\2\2Y\21\3\2\2\2Z[\7\33\2\2[\\\5\24\13\2\\]\7\t\2\2]\23\3\2\2\2^"+
		"c\7\n\2\2_`\5\26\f\2`a\7\3\2\2ab\5\26\f\2bd\3\2\2\2c_\3\2\2\2cd\3\2\2"+
		"\2de\3\2\2\2ef\7\13\2\2f\25\3\2\2\2gh\5\36\20\2h\27\3\2\2\2ij\5\32\16"+
		"\2j\31\3\2\2\2ko\7\f\2\2ln\5\32\16\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2pr\3\2\2\2qo\3\2\2\2r|\7\r\2\2s|\5\4\3\2t|\5\6\4\2u|\5\22\n\2vx"+
		"\7\b\2\2wy\5\36\20\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\t\2\2{k\3\2\2\2"+
		"{s\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2|\33\3\2\2\2}\u0082\7\4\2\2~\u0082"+
		"\7\5\2\2\177\u0082\7\6\2\2\u0080\u0082\7\30\2\2\u0081}\3\2\2\2\u0081~"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\35\3\2\2\2\u0083"+
		"\u0084\5 \21\2\u0084\37\3\2\2\2\u0085\u0086\b\21\1\2\u0086\u008d\5\34"+
		"\17\2\u0087\u0088\7\n\2\2\u0088\u0089\5 \21\2\u0089\u008a\7\13\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008d\5\22\n\2\u008c\u0085\3\2\2\2\u008c\u0087\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d\u009c\3\2\2\2\u008e\u008f\f\t\2\2\u008f"+
		"\u0090\7\17\2\2\u0090\u009b\5 \21\n\u0091\u0092\f\b\2\2\u0092\u0093\7"+
		"\21\2\2\u0093\u009b\5 \21\t\u0094\u0095\f\7\2\2\u0095\u0096\7\16\2\2\u0096"+
		"\u009b\5 \21\b\u0097\u0098\f\6\2\2\u0098\u0099\7\22\2\2\u0099\u009b\5"+
		" \21\7\u009a\u008e\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0094\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d!\3\2\2\2\u009e\u009c\3\2\2\2\21$&/=CPScox{\u0081\u008c\u009a"+
		"\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}