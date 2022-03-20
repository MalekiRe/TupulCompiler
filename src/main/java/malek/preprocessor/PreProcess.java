package malek.preprocessor;

import generated.malek.TupulLexer;
import generated.malek.TupulParser;
import generated.preprocessor.PreProcessorLexer;
import generated.preprocessor.PreProcessorParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PreProcess {
    public static Map<String, String> preProcessFiles(Map<String, File> fileMap, File buildDir) throws IOException {
        Map<String, String> processedFiles = new HashMap<>();
        for(String filePath : fileMap.keySet()) {
            processedFiles.put(filePath, processFile(filePath, fileMap.get(filePath), new File(buildDir, filePath+".tpl")));
        }
        return processedFiles;
    }
    private static String processFile(String name, File source, File outputFile) throws IOException {
        //Get strings to replace
        PreProcessorLexer lexer = new PreProcessorLexer(CharStreams.fromFileName(source.getAbsolutePath()));
        PreProcessListener listener = new PreProcessListener();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        PreProcessorParser preProcessorParser = new PreProcessorParser(new CommonTokenStream(lexer));
        parseTreeWalker.walk(listener, preProcessorParser.fileImports());
        for(String s : listener.getMap().keySet()) {
            System.out.println("S: " + s + "full: " + listener.getMap().get(s));
        }
        //Replace the strings
        outputFile.createNewFile();
        TupulLexer tupulLexer = new TupulLexer(CharStreams.fromFileName(source.getAbsolutePath()));
        CommonTokenStream tokenStream = new CommonTokenStream(tupulLexer);
        TupulParser tupulParser = new TupulParser(new CommonTokenStream(new TupulLexer(CharStreams.fromFileName(source.getAbsolutePath()))));
        tokenStream.fill();
        TupulParser.FileContext fd = tupulParser.file();
        TupulParser.TypeDeclarationContext td = fd.typeDeclaration();
        if(td != null) {
            System.out.println("name is: " + name);
            listener.getMap().put(td.children.get(1).getText(), "'" + name + "'");
        } else {
            listener.getMap().put(fd.interfaceDeclaration().children.get(1).getText(), "'" + name + "'");
        }
        TokenStreamRewriter tokenStreamRewriter = new TokenStreamRewriter(tokenStream);
        tokenStream.getTokens(0, tokenStream.size()-1, TupulLexer.IDENTIFIER).forEach(token -> {
            if(listener.getMap().containsKey(token.getText())) {
                tokenStreamRewriter.replace(token, listener.getMap().get(token.getText()));
            }
        });
        System.out.println("REWRITEN: " + tokenStreamRewriter.getText());
        return tokenStreamRewriter.getText();
    }
}
