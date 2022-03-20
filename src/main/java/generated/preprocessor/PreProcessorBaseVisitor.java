// Generated from /home/malek/IdeaProjects/TupulCompiler3/src/main/java/malek/PreProcessor.g4 by ANTLR 4.9.3
package generated.preprocessor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PreProcessorVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class PreProcessorBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PreProcessorVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFileImports(PreProcessorParser.FileImportsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFileImport(PreProcessorParser.FileImportContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFromImport(PreProcessorParser.FromImportContext ctx) { return visitChildren(ctx); }
}