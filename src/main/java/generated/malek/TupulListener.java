// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/Tupul.g4 by ANTLR 4.9.3
package generated.malek;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TupulParser}.
 */
public interface TupulListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link TupulParser#interfaceFile}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFile(TupulParser.InterfaceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#interfaceFile}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFile(TupulParser.InterfaceFileContext ctx);
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
	 * Enter a parse tree produced by {@link TupulParser#typeFile}.
	 * @param ctx the parse tree
	 */
	void enterTypeFile(TupulParser.TypeFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#typeFile}.
	 * @param ctx the parse tree
	 */
	void exitTypeFile(TupulParser.TypeFileContext ctx);
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
	 * Enter a parse tree produced by {@link TupulParser#intermediateValue}.
	 * @param ctx the parse tree
	 */
	void enterIntermediateValue(TupulParser.IntermediateValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupulParser#intermediateValue}.
	 * @param ctx the parse tree
	 */
	void exitIntermediateValue(TupulParser.IntermediateValueContext ctx);
}