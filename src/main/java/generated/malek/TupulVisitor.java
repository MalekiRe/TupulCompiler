// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.2
package generated.malek;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TupulParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TupulVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TupulParser#fullFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullFile(TupulParser.FullFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(TupulParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(TupulParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntFunctionType(TupulParser.IntFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatFunctionType(TupulParser.FloatFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleFunctionType(TupulParser.DoubleFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunctionType(TupulParser.CharFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidFunctionType}
	 * labeled alternative in {@link TupulParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunctionType(TupulParser.VoidFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVariableType(TupulParser.IntVariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatVariableType(TupulParser.FloatVariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleVariableType(TupulParser.DoubleVariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVariableType}
	 * labeled alternative in {@link TupulParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVariableType(TupulParser.CharVariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDec(TupulParser.FunctionDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionDecArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecArgs(TupulParser.FunctionDecArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionDecArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecArg(TupulParser.FunctionDecArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TupulParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionCallArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArgs(TupulParser.FunctionCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionCallArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArg(TupulParser.FunctionCallArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCode(TupulParser.FunctionCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunCodeBlock}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCodeBlock(TupulParser.FunCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCodeVarDec}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCodeVarDec(TupulParser.FuncCodeVarDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCodeVarAssignment}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCodeVarAssignment(TupulParser.FuncCodeVarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCodeFuncCall}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCodeFuncCall(TupulParser.FuncCodeFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCodeReturn}
	 * labeled alternative in {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCodeReturn(TupulParser.FuncCodeReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberInteger}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInteger(TupulParser.NumberIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberFloat}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloat(TupulParser.NumberFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberDouble}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDouble(TupulParser.NumberDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberChar}
	 * labeled alternative in {@link TupulParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberChar(TupulParser.NumberCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#expressionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(TupulParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNumber}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNumber(TupulParser.ExpNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(TupulParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFunction}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFunction(TupulParser.ExpFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpBiOp}
	 * labeled alternative in {@link TupulParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBiOp(TupulParser.ExpBiOpContext ctx);
}