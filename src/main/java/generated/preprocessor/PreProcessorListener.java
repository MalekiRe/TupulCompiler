// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/PreProcessor.g4 by ANTLR 4.9.3
package generated.preprocessor;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PreProcessorParser}.
 */
public interface PreProcessorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PreProcessorParser#fileImports}.
	 * @param ctx the parse tree
	 */
	void enterFileImports(PreProcessorParser.FileImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreProcessorParser#fileImports}.
	 * @param ctx the parse tree
	 */
	void exitFileImports(PreProcessorParser.FileImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreProcessorParser#fileImport}.
	 * @param ctx the parse tree
	 */
	void enterFileImport(PreProcessorParser.FileImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreProcessorParser#fileImport}.
	 * @param ctx the parse tree
	 */
	void exitFileImport(PreProcessorParser.FileImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreProcessorParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void enterFromImport(PreProcessorParser.FromImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreProcessorParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void exitFromImport(PreProcessorParser.FromImportContext ctx);
}