// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.3
package generated.malek;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TupulParser}.
 */
public interface TupulListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TupulParser#allMultipleLinkedFiles}.
	 * @param ctx the parse tree
	 */
	void enterAllMultipleLinkedFiles(TupulParser.AllMultipleLinkedFilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#allMultipleLinkedFiles}.
	 * @param ctx the parse tree
	 */
	void exitAllMultipleLinkedFiles(TupulParser.AllMultipleLinkedFilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(TupulParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(TupulParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#declarePackage}.
	 * @param ctx the parse tree
	 */
	void enterDeclarePackage(TupulParser.DeclarePackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#declarePackage}.
	 * @param ctx the parse tree
	 */
	void exitDeclarePackage(TupulParser.DeclarePackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#importSomething}.
	 * @param ctx the parse tree
	 */
	void enterImportSomething(TupulParser.ImportSomethingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#importSomething}.
	 * @param ctx the parse tree
	 */
	void exitImportSomething(TupulParser.ImportSomethingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(TupulParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(TupulParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#interfaceExtensions}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtensions(TupulParser.InterfaceExtensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#interfaceExtensions}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtensions(TupulParser.InterfaceExtensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#interfaceExtensionName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtensionName(TupulParser.InterfaceExtensionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#interfaceExtensionName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtensionName(TupulParser.InterfaceExtensionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#interfaceCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCodeBlock(TupulParser.InterfaceCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#interfaceCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCodeBlock(TupulParser.InterfaceCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#interfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFunctionDeclaration(TupulParser.InterfaceFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#interfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFunctionDeclaration(TupulParser.InterfaceFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#interfaceAbstractFuncDec}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceAbstractFuncDec(TupulParser.InterfaceAbstractFuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#interfaceAbstractFuncDec}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceAbstractFuncDec(TupulParser.InterfaceAbstractFuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(TupulParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(TupulParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#typeCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeCodeBlock(TupulParser.TypeCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#typeCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeCodeBlock(TupulParser.TypeCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#typeFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctionDeclaration(TupulParser.TypeFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#typeFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctionDeclaration(TupulParser.TypeFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#universalFunctionPost}.
	 * @param ctx the parse tree
	 */
	void enterUniversalFunctionPost(TupulParser.UniversalFunctionPostContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#universalFunctionPost}.
	 * @param ctx the parse tree
	 */
	void exitUniversalFunctionPost(TupulParser.UniversalFunctionPostContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionWithinFunctionDec}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithinFunctionDec(TupulParser.FunctionWithinFunctionDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionWithinFunctionDec}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithinFunctionDec(TupulParser.FunctionWithinFunctionDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#universalFunctionModifiers}.
	 * @param ctx the parse tree
	 */
	void enterUniversalFunctionModifiers(TupulParser.UniversalFunctionModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#universalFunctionModifiers}.
	 * @param ctx the parse tree
	 */
	void exitUniversalFunctionModifiers(TupulParser.UniversalFunctionModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionDecArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecArguments(TupulParser.FunctionDecArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionDecArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecArguments(TupulParser.FunctionDecArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(TupulParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(TupulParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#universalPostIdentifierFuncDec}.
	 * @param ctx the parse tree
	 */
	void enterUniversalPostIdentifierFuncDec(TupulParser.UniversalPostIdentifierFuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#universalPostIdentifierFuncDec}.
	 * @param ctx the parse tree
	 */
	void exitUniversalPostIdentifierFuncDec(TupulParser.UniversalPostIdentifierFuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionTagOperation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTagOperation(TupulParser.FunctionTagOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionTagOperation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTagOperation(TupulParser.FunctionTagOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionTagAppend}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTagAppend(TupulParser.FunctionTagAppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionTagAppend}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTagAppend(TupulParser.FunctionTagAppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionTagRemove}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTagRemove(TupulParser.FunctionTagRemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionTagRemove}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTagRemove(TupulParser.FunctionTagRemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionTagEquals}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTagEquals(TupulParser.FunctionTagEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionTagEquals}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTagEquals(TupulParser.FunctionTagEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionTagNotEquals}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTagNotEquals(TupulParser.FunctionTagNotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionTagNotEquals}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTagNotEquals(TupulParser.FunctionTagNotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#tagID}.
	 * @param ctx the parse tree
	 */
	void enterTagID(TupulParser.TagIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#tagID}.
	 * @param ctx the parse tree
	 */
	void exitTagID(TupulParser.TagIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCodeBlock(TupulParser.FunctionCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#functionCodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCodeBlock(TupulParser.FunctionCodeBlockContext ctx);
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
	 * Enter a parse tree produced by {@link TupulParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(TupulParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(TupulParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(TupulParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(TupulParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#specialForLoop}.
	 * @param ctx the parse tree
	 */
	void enterSpecialForLoop(TupulParser.SpecialForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#specialForLoop}.
	 * @param ctx the parse tree
	 */
	void exitSpecialForLoop(TupulParser.SpecialForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#chainedIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterChainedIfStatement(TupulParser.ChainedIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#chainedIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitChainedIfStatement(TupulParser.ChainedIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TupulParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TupulParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(TupulParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(TupulParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(TupulParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(TupulParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(TupulParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(TupulParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TupulParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TupulParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(TupulParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(TupulParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#varID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(TupulParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#varID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(TupulParser.VarIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#intermediateValue}.
	 * @param ctx the parse tree
	 */
	void enterIntermediateValue(TupulParser.IntermediateValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#intermediateValue}.
	 * @param ctx the parse tree
	 */
	void exitIntermediateValue(TupulParser.IntermediateValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TupulParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TupulParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#singleVarDec}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarDec(TupulParser.SingleVarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#singleVarDec}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarDec(TupulParser.SingleVarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#multiVarDec}.
	 * @param ctx the parse tree
	 */
	void enterMultiVarDec(TupulParser.MultiVarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#multiVarDec}.
	 * @param ctx the parse tree
	 */
	void exitMultiVarDec(TupulParser.MultiVarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#singleVarAssignment}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarAssignment(TupulParser.SingleVarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#singleVarAssignment}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarAssignment(TupulParser.SingleVarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#multiVarAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMultiVarAssignment(TupulParser.MultiVarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#multiVarAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMultiVarAssignment(TupulParser.MultiVarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#variableSwap}.
	 * @param ctx the parse tree
	 */
	void enterVariableSwap(TupulParser.VariableSwapContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#variableSwap}.
	 * @param ctx the parse tree
	 */
	void exitVariableSwap(TupulParser.VariableSwapContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#variableIncrement}.
	 * @param ctx the parse tree
	 */
	void enterVariableIncrement(TupulParser.VariableIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#variableIncrement}.
	 * @param ctx the parse tree
	 */
	void exitVariableIncrement(TupulParser.VariableIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupulParser#variableDecrement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecrement(TupulParser.VariableDecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#variableDecrement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecrement(TupulParser.VariableDecrementContext ctx);
}