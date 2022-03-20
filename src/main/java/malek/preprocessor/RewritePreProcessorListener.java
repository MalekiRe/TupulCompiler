package malek.preprocessor;

import generated.malek.TupulBaseListener;
import generated.malek.TupulParser;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class RewritePreProcessorListener extends TupulBaseListener {
    public TokenStreamRewriter rewriter;
    public RewritePreProcessorListener(TokenStreamRewriter streamRewriter) {
        this.rewriter = streamRewriter;
    }
    @Override public void exitFileOrNormalID(TupulParser.FileOrNormalIDContext ctx) {
        if(ctx.IDENTIFIER() != null) {
            rewriter.replace(ctx.IDENTIFIER().getSymbol(), "hello");
        }
    }
}
