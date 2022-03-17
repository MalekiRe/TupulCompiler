package malek.buildtool.printlib;

import java.util.HashMap;
import java.util.Map;

import static malek.buildtool.printlib.Color.*;

public class PrintLib {
    static Map<Color, String> textColorStringMap = new HashMap<>();
    //static Map<Color, String> backgroundColorStringMap = new HashMap<>();
    static {
        textColorStringMap.put(BLACK, "\u001B[30m");
        textColorStringMap.put(RED, "\u001B[31m");
        textColorStringMap.put(GREEN, "\u001B[32m");
        textColorStringMap.put(YELLOW, "\u001B[33m");
        textColorStringMap.put(BLUE, "\u001B[34m");
        textColorStringMap.put(PURPLE, "\u001B[35m");
        textColorStringMap.put(CYAN, "\u001B[36m");
        textColorStringMap.put(WHITE, "\u001B[37m");
    }
    static String RESET = "\u001B[0m";
    public static void println(String message, int i) {
        println(message, Color.values()[i%7]);
    }
    public static void println(String message, Color color) {
        print(message+"\n", color);
    }
    public static void println(String message) {
        System.out.println(message);
    }
    public static void print(String message, Color color) {
        if(color == RAINBOW) {
            for(int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i) + textColorStringMap.get(
                        Color.values()[i%7]
                ));
            }
            System.out.print(RESET);
            return;
        }
        System.out.print(textColorStringMap.get(color) + message + RESET);
    }
    public static void print(String message) {
        System.out.print(message);
    }

    public static String spacing(int space) {
        StringBuilder s = new StringBuilder();
        for(int i1 = 0; i1 < space; i1++) {
            s.append("  ");
        }
        return s.toString();
    }

    public static Color colorFromInt(int i) {
        return Color.values()[i%7];
    }


}
