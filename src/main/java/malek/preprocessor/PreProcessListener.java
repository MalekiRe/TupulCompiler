package malek.preprocessor;

import generated.preprocessor.PreProcessorBaseListener;
import generated.preprocessor.PreProcessorParser;

import java.util.HashMap;
import java.util.Map;

public class PreProcessListener extends PreProcessorBaseListener {
    Map<String, String> mappings = new HashMap<>();
    String currentFromImport = "";
    public Map<String, String> getMap() {
        return mappings;
    }
    @Override public void enterFileImports(PreProcessorParser.FileImportsContext ctx) { }

    @Override public void exitFileImports(PreProcessorParser.FileImportsContext ctx) { }

    @Override public void enterFileImport(PreProcessorParser.FileImportContext ctx) {
        mappings.put(ctx.IDENTIFIER().getText(), currentFromImport + ctx.FILE_IDENTIFIER().getText());
    }

    @Override public void exitFileImport(PreProcessorParser.FileImportContext ctx) { }

    @Override public void enterFromImport(PreProcessorParser.FromImportContext ctx) {
        String text = ctx.FILE_IDENTIFIER().getText();
        currentFromImport = text.substring(0, text.length()-1) + ".";
    }

    @Override public void exitFromImport(PreProcessorParser.FromImportContext ctx) {
        currentFromImport = "";
    }
}
