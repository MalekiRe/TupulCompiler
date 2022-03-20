// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/PreProcessor.g4 by ANTLR 4.9.3
package generated.preprocessor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PreProcessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PreProcessorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PreProcessorParser#fileImports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileImports(PreProcessorParser.FileImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreProcessorParser#fileImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileImport(PreProcessorParser.FileImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link PreProcessorParser#fromImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImport(PreProcessorParser.FromImportContext ctx);
}