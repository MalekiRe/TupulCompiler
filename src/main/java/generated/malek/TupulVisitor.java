// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.3
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
	 * Visit a parse tree produced by {@link TupulParser#allMultipleLinkedFiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllMultipleLinkedFiles(TupulParser.AllMultipleLinkedFilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(TupulParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#declarePackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarePackage(TupulParser.DeclarePackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#importSomething}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSomething(TupulParser.ImportSomethingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(TupulParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#interfaceExtensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceExtensions(TupulParser.InterfaceExtensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#interfaceExtensionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceExtensionName(TupulParser.InterfaceExtensionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#interfaceCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCodeBlock(TupulParser.InterfaceCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#interfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFunctionDeclaration(TupulParser.InterfaceFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#interfaceAbstractFuncDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceAbstractFuncDec(TupulParser.InterfaceAbstractFuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(TupulParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#typeCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCodeBlock(TupulParser.TypeCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#typeFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunctionDeclaration(TupulParser.TypeFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#universalFunctionPost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalFunctionPost(TupulParser.UniversalFunctionPostContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionWithinFunctionDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithinFunctionDec(TupulParser.FunctionWithinFunctionDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#universalFunctionModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalFunctionModifiers(TupulParser.UniversalFunctionModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionDecArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecArguments(TupulParser.FunctionDecArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(TupulParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#universalPostIdentifierFuncDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalPostIdentifierFuncDec(TupulParser.UniversalPostIdentifierFuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionTagOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTagOperation(TupulParser.FunctionTagOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionTagAppend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTagAppend(TupulParser.FunctionTagAppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionTagRemove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTagRemove(TupulParser.FunctionTagRemoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionTagEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTagEquals(TupulParser.FunctionTagEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionTagNotEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTagNotEquals(TupulParser.FunctionTagNotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#tagID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagID(TupulParser.TagIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCodeBlock(TupulParser.FunctionCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TupulParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(TupulParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(TupulParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#specialForLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialForLoop(TupulParser.SpecialForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#chainedIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedIfStatement(TupulParser.ChainedIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TupulParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(TupulParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(TupulParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(TupulParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TupulParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(TupulParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#varID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(TupulParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#intermediateValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntermediateValue(TupulParser.IntermediateValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(TupulParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#singleVarDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarDec(TupulParser.SingleVarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#multiVarDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVarDec(TupulParser.MultiVarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#singleVarAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarAssignment(TupulParser.SingleVarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#multiVarAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVarAssignment(TupulParser.MultiVarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#variableSwap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSwap(TupulParser.VariableSwapContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#variableIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIncrement(TupulParser.VariableIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#variableDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecrement(TupulParser.VariableDecrementContext ctx);
}