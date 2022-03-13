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
	 * Visit a parse tree produced by {@link TupulParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TupulParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(TupulParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#importSomething}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSomething(TupulParser.ImportSomethingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#interfaceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFile(TupulParser.InterfaceFileContext ctx);
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
	 * Visit a parse tree produced by {@link TupulParser#typeFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFile(TupulParser.TypeFileContext ctx);
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
	 * Visit a parse tree produced by {@link TupulParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(TupulParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TupulParser#intermediateValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntermediateValue(TupulParser.IntermediateValueContext ctx);
}