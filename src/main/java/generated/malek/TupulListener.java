// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.2
package generated.malek;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TupulParser}.
 */
public interface TupulListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TupulParser#fullFile}.
	 * @param ctx the parse tree
	 */
	void enterFullFile(TupulParser.FullFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#fullFile}.
	 * @param ctx the parse tree
	 */
	void exitFullFile(TupulParser.FullFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(TupulParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(TupulParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(TupulParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(TupulParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterIntFunctionType(TupulParser.IntFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitIntFunctionType(TupulParser.IntFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFloatFunctionType(TupulParser.FloatFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFloatFunctionType(TupulParser.FloatFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleFunctionType(TupulParser.DoubleFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleFunctionType(TupulParser.DoubleFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionType(TupulParser.CharFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionType(TupulParser.CharFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunctionType(TupulParser.VoidFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunctionType(TupulParser.VoidFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterIntVariableType(TupulParser.IntVariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitIntVariableType(TupulParser.IntVariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterFloatVariableType(TupulParser.FloatVariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitFloatVariableType(TupulParser.FloatVariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleVariableType(TupulParser.DoubleVariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleVariableType(TupulParser.DoubleVariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterCharVariableType(TupulParser.CharVariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitCharVariableType(TupulParser.CharVariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionDec}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDec(TupulParser.FunctionDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionDec}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDec(TupulParser.FunctionDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionDecArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecArgs(TupulParser.FunctionDecArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionDecArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecArgs(TupulParser.FunctionDecArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionDecArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecArg(TupulParser.FunctionDecArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionDecArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecArg(TupulParser.FunctionDecArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TupulParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TupulParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionCallArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArgs(TupulParser.FunctionCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionCallArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArgs(TupulParser.FunctionCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionCallArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArg(TupulParser.FunctionCallArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionCallArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArg(TupulParser.FunctionCallArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionCode}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCode(TupulParser.FunctionCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionCode}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCode(TupulParser.FunctionCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunCodeBlock}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunCodeBlock(TupulParser.FunCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCodeBlock}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunCodeBlock(TupulParser.FunCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCodeVarDec}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncCodeVarDec(TupulParser.FuncCodeVarDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCodeVarDec}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncCodeVarDec(TupulParser.FuncCodeVarDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCodeVarAssignment}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncCodeVarAssignment(TupulParser.FuncCodeVarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCodeVarAssignment}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncCodeVarAssignment(TupulParser.FuncCodeVarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCodeFuncCall}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncCodeFuncCall(TupulParser.FuncCodeFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCodeFuncCall}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncCodeFuncCall(TupulParser.FuncCodeFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCodeReturn}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncCodeReturn(TupulParser.FuncCodeReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCodeReturn}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncCodeReturn(TupulParser.FuncCodeReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberInteger(TupulParser.NumberIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberInteger(TupulParser.NumberIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloat(TupulParser.NumberFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloat(TupulParser.NumberFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberDouble}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberDouble(TupulParser.NumberDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberDouble}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberDouble(TupulParser.NumberDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberChar}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberChar(TupulParser.NumberCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberChar}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberChar(TupulParser.NumberCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#expressionValue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(TupulParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#expressionValue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(TupulParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNumber}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpNumber(TupulParser.ExpNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNumber}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpNumber(TupulParser.ExpNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(TupulParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(TupulParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFunction}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpFunction(TupulParser.ExpFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFunction}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpFunction(TupulParser.ExpFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpBiOp}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpBiOp(TupulParser.ExpBiOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpBiOp}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpBiOp(TupulParser.ExpBiOpContext ctx);
}