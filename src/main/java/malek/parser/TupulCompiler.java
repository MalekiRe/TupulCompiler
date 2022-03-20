package malek.parser;

import generated.malek.*;
import malek.buildtool.printlib.Color;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.ScopeAddingPhase;
import malek.parser.addingphase.ScopeReferencePhase;
import malek.preprocessor.PreProcess;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.*;

import static malek.preprocessor.PreProcess.preProcessFiles;

public class TupulCompiler {
    public static String parsedFile = "";
    public static boolean compileFile(Map<String, File> fileMap, File buildDir) throws IOException {
        ScopeAddingPhase scopeAddingPhase = new ScopeAddingPhase(fileMap);
        Map<String, String> processedFiles = PreProcess.preProcessFiles(fileMap, buildDir);
        for(String s : processedFiles.keySet()) {
            //PrintLib.println("lexing and parsing: " + s, Color.GREEN);
            TupulParser parser = new TupulParser(new CommonTokenStream(new TupulLexer(CharStreams.fromString(processedFiles.get(s)))));
            ParseTree tree = parser.file();
            PrintLib.println("concrete syntax tree representation");
            PrintLib.println(tree.toStringTree(parser));
            scopeAddingPhase.visitFile(tree, s);
            PrintLib.println("scope map");
        }
        scopeAddingPhase.global.printScope();
        ScopeReferencePhase scopeReferencePhase = new ScopeReferencePhase(scopeAddingPhase);
        for(String s : processedFiles.keySet()) {
            PrintLib.println("doing reference checking: " + s, Color.GREEN);
            TupulParser parser = new TupulParser(new CommonTokenStream(new TupulLexer(CharStreams.fromString(processedFiles.get(s)))));
            ParseTree tree = parser.file();
            scopeReferencePhase.visitFile(tree, s);
        }
        scopeAddingPhase.global.printScope();
        return true;
    }

}
