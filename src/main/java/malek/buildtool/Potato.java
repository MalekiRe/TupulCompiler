package malek.buildtool;

import malek.buildtool.config.Configuration;
import malek.parser.TupulCompiler;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static malek.buildtool.printlib.Color.*;
import static malek.buildtool.printlib.PrintLib.print;
import static malek.buildtool.printlib.PrintLib.println;

public class Potato {
    enum Command {
        BUILD,
        RUN,
        NEW,
        ADD_DEPENDENCY,
        UPDATE_VERSION,
    }
    static Map<String, Command> validArgumentsMap = new HashMap<>();
    static {
        validArgumentsMap.put("taste", Command.RUN);
        validArgumentsMap.put("run", Command.RUN);
        validArgumentsMap.put("plant", Command.NEW);
        validArgumentsMap.put("bake", Command.BUILD);
        validArgumentsMap.put("update-version", Command.UPDATE_VERSION);
    }
    static String specifyArgsString = "specify arguments, can be 'build', 'run' or 'new'";
    public static void main(String[] args) {
        if(args.length == 0) {
            println(specifyArgsString, RED);
            return;
        }
        if(!validArgumentsMap.containsKey(args[0])) {
            print("error, invalid argument ", RED);
            print("'" + args[0] + "'", YELLOW);
            print(", " + specifyArgsString + "\n", RED);
        }
        Command command = validArgumentsMap.get(args[0]);
        if(command == Command.NEW) {
            if(args.length == 1) {
                println("error, missing project name", RED);
            }
            else if(args.length == 2) {
                println("error, missing author name/mascot name", RED);
            }
            else {
                try {
                    createNewProject(args[1], args[2]);
                } catch (IOException e) {
                    println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        if(command == Command.BUILD) {
            buildProject();
        }
    }

    public static void buildProject() {
        File currentDir = new File(System.getProperty("user.dir"));
        Configuration potatoToml = null;
        File srcDir = null;
        File buildDir = null;
        File intermediateDir = null;
        File outputDir = null;
        for (File posFile : currentDir.listFiles()) {
            if(posFile.getName().equals("Potato.toml")) {
                potatoToml = Configuration.createConfigFromFile(posFile);
            }
            if(posFile.getName().equals("src")) {
                srcDir = posFile;
            }
            if(posFile.getName().equals("build")) {
                buildDir = posFile;
            }
            if(posFile.getName().equals("output")) {
                outputDir = posFile;
            }
        }
        if(potatoToml == null) {
            println("Potato.TOML file not found, make sure you are in the root directory of a Potato project", RED);
            return;
        }
        if(srcDir == null) {
            println("src directory not found, make sure you are in the root directory of a Potato project", RED);
            return;
        }
        if(buildDir == null) {
            println("first time building!", RAINBOW);
            println("creating a /build");
            buildDir = new File(currentDir+"/build");
            if(buildDir.mkdir()) {
                println("created /build successfully", GREEN);
            } else {
                println("unable to created /build", RED);
                return;
            }
            if(outputDir == null) {
                println("creating a /output");
                outputDir = new File(currentDir+"/output");
                if(outputDir.mkdir()) {
                    println("created /output successfully", GREEN);
                } else {
                    println("unable to create /output", RED);
                    return;
                }
            }
        }
        if(outputDir == null) {
            println("Strange, /build exists, but /output does not.", YELLOW);
            println("creating a /output");
            outputDir = new File(currentDir+"/output");
            if(outputDir.mkdir()) {
                println("created /output successfully", GREEN);
            } else {
                println("unable to create /output", RED);
                return;
            }
        }
        //TODO, make this work with local taters and internet taters.
        //Getting all the source files
        Map<String, File> fileMap = mapSrcDir(srcDir);
        print("compiling for: ");
        for(String s : fileMap.keySet()) {
            print(s);
        }
        println("");
        println("trying to compile!");
        try {
            TupulCompiler.compileFile(fileMap);
        } catch (IOException e) {
            e.printStackTrace();
            println(e.getMessage(), RED);
            println("something has gone horribly wrong trying to compile the files", RED);
            return;
        }
        println("successfully compiled!", RAINBOW);
        println("concrete syntax tree representation!", GREEN);
        println(TupulCompiler.parsedFile);
        //println(potatoToml.potato.get("name").toString(), GREEN);
    }
    static InputStream createConcatInputStream(List<File> files) {
        try {
            return createConcatInputStream(files, 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            println(e.getMessage(), RED);
        }
        return null;
    }

    static InputStream createConcatInputStream(List<File> files, int iterator) throws FileNotFoundException {
        if(iterator+1 < files.size()) {
            return new SequenceInputStream(new FileInputStream(files.get(iterator)), createConcatInputStream(files, iterator+1));
        } else {
            return new FileInputStream(files.get(iterator));
        }
    }
    static Map<String, File> mapSrcDir(File srcDirectory) {
        Map<String, File> fileList = new HashMap<>();
        for(File file : srcDirectory.listFiles()) {
            if(file.isDirectory()) {
                Map<String, File> tempMap = recursiveFileMapper(file);
                for(String s : tempMap.keySet()) {
                    fileList.put(s, tempMap.get(s));
                }
            } else {
                fileList.put(file.getName().substring(0, file.getName().lastIndexOf('.')), file);
            }
        }
        return fileList;
    }
    static Map<String, File> recursiveFileMapper(File directory) {
        Map<String, File> fileList = new HashMap<>();
        for(File file : directory.listFiles()) {
            if(file.isDirectory()) {
                Map<String, File> tempMap = recursiveFileMapper(file);
                for(String s : tempMap.keySet()) {
                    fileList.put(directory.getName()+"."+s, tempMap.get(s));
                }
            } else {
                fileList.put(directory.getName()+"."+file.getName().substring(0, file.getName().lastIndexOf('.')), file);
            }
        }
        return fileList;
    }

    public static void createNewProject(String projectName, String authorName) throws IOException {
        File myFile = new File(System.getProperty("user.dir")+"/"+projectName);
        print("creating project "); print(projectName, GREEN); print(" in: "); println(myFile.getAbsolutePath());
        if(myFile.mkdir()) {
            println("SUCCESS", RAINBOW);
        } else {
            println("FAILURE", RED);
            return;
        }
        println("creating sub-folders and files");

        //Creating source
        println("Creating Potato.toml and Main.tpl");
        File potatoToml = myFile.toPath().resolve("Potato.toml").toFile();
        potatoToml.createNewFile();
        File srcDir = myFile.toPath().resolve("src").toFile();
        srcDir.mkdir();
        File libsDir = myFile.toPath().resolve("libs").toFile();
        libsDir.mkdir();
        srcDir.toPath().resolve("Main.tpl").toFile().createNewFile();

        println("Writing default Potato.toml");
        Configuration.createDefaultConfiguration(potatoToml, projectName, authorName);
    }
}
