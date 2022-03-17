package malek.parser.util;

import java.util.ArrayList;

public class FileStore {
    public ArrayList<String> folders = new ArrayList<>();
    public String fileName = "";
    private FileStore() {

    }
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < folders.size(); i++) {
            s += folders.get(i) + ".";
        }
        s += fileName;
        return s;
    }
    public static class FileStoreBuilder {
        FileStore fileStore = new FileStore();
        public void addFileName(String fileName) {
            this.fileStore.fileName = fileName;
        }
        public void addFolder(String folder) {
            this.fileStore.folders.add(folder);
        }
        public FileStore build() {
            return this.fileStore;
        }
    }
}
