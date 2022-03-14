package malek.parser.util;

import java.util.ArrayList;

public class FileStore {
    public ArrayList<String> folders = new ArrayList<>();
    public String fileName = "";

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < folders.size(); i++) {
            s += folders.get(i) + ".";
        }
        s += fileName;
        return s;
    }
}
