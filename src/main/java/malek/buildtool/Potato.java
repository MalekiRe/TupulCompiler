package malek.buildtool;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static malek.buildtool.printlib.Color.*;
import static malek.buildtool.printlib.PrintLib.print;
import static malek.buildtool.printlib.PrintLib.println;

public class Potato {
    enum Command {
        BUILD,
        RUN,
        NEW,
    }
    static Map<String, Command> validArgumentsMap = new HashMap<>();
    static {
        validArgumentsMap.put("build", Command.BUILD);
        validArgumentsMap.put("run", Command.RUN);
        validArgumentsMap.put("new", Command.NEW);
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
            } else {
                try {
                    createNewProject(args[1]);
                } catch (IOException e) {
                    println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    public static void createNewProject(String directory) throws IOException {
        File myFile = new File(System.getProperty("user.dir")+"/"+directory);
        print("creating project "); print(directory, GREEN); print(" in: "); println(myFile.getAbsolutePath());
        if(myFile.mkdir()) {
            println("SUCCESS", RAINBOW);
        } else {
            println("FAILURE", RED);
            return;
        }
        println("creating subfolders and files");

        //Creating source
        println("Creating .lock and .toml");
        File potatoToml = myFile.toPath().resolve("Potato.toml").toFile();
        potatoToml.createNewFile();
        File srcDir = myFile.toPath().resolve("src").toFile();
        srcDir.mkdir();
        File libsDir = myFile.toPath().resolve("libs").toFile();
        libsDir.mkdir();
        srcDir.toPath().resolve("main").toFile().createNewFile();
    }
}
