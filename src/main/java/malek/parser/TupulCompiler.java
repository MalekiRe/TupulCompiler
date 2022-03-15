package malek.parser;

import generated.malek.*;
import org.antlr.runtime.tree.Tree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.DOTGenerator;

import java.io.IOException;
import java.io.InputStream;

public class TupulCompiler {
    public static String parsedFile = "";
    public static boolean compileFile(InputStream stream) throws IOException {
        TupulLexer lexer = new TupulLexer(CharStreams.fromStream(stream));
        TupulParser parser = new TupulParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.allMultipleLinkedFiles();
        parsedFile = tree.toStringTree(parser);
        ScopeAddingPhase scopeAddingPhase = new ScopeAddingPhase();
        scopeAddingPhase.visit(tree);
        scopeAddingPhase.global.printGlobalScope();
        return true;
    }

    public static void main(String[] args) throws IOException {
        String fileDir = ClassLoader.getSystemResource("myfile.tupul").getFile();
        System.out.println(fileDir);
        TupulLexer lexer = new TupulLexer(CharStreams.fromFileName(fileDir));
        TupulParser parser = new TupulParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.allMultipleLinkedFiles();
        System.out.println("hi");
        System.out.println(tree.toStringTree(parser));
        ScopeAddingPhase scopeAddingPhase = new ScopeAddingPhase();
        scopeAddingPhase.visit(tree);
//        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
//        AddingPhase addingPhase = new AddingPhase();
//        parseTreeWalker.walk(addingPhase, tree);
//        RefPhase refPhase = new RefPhase(addingPhase.global, addingPhase.scopes);
//        parseTreeWalker.walk(refPhase, tree);
        //OutputPhase outputPhase = new OutputPhase(addingPhase.global, addingPhase.scopes);
        //parseTreeWalker.walk(outputPhase, tree);
        //OutputVisitor outputVisitor = new OutputVisitor();
        //System.out.println(outputVisitor.visit(tree));
//        final String dir = System.getProperty("user.dir");
//        File newFileDir = new File(dir+"/src/main/resources/created.ll");
//        FileWriter myWriter = new FileWriter(newFileDir.getAbsolutePath());
//        myWriter.write(outputPhase.fileStringBuilder.toString());
//        myWriter.close();
//        Runtime.getRuntime().exec("llc created.ll");
//        Runtime.getRuntime().exec("clang created.s");
    }
    public static void my(Object object) {

    }
}
