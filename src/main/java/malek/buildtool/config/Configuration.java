package malek.buildtool.config;

import com.google.gson.internal.LinkedTreeMap;
import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Configuration {
    public Map<String, Object> potato = new LinkedTreeMap<>();
    public Map<String, String> taters = new LinkedTreeMap<>();
    public Map<String, String> localTaters = new LinkedTreeMap<>();

    public void addPackageName(String name) {
        potato.put("name", name);
    }
    public void addVersion(String version) {
        potato.put("version", version);
    }
    public void addMascotName(String name) {
        potato.put("mascot-name", name);
    }
    public void addAuthorName(String name) {
        if(!potato.containsKey("author-names")) {
            potato.put("author-names", new ArrayList<String>());
        }
        ((List<String>)potato.get("author-names")).add(name);
    }
    public void addLanguageName(String name) {
        potato.put("language", name);
    }
    public void addLanguageVersion(String name) {
        potato.put("language-version", name);
    }
    public void addTater(String taterName, String taterVersion) {
        taters.put(taterName, taterVersion);
    }
    public void addLocalTater(String taterName, String path) {
        localTaters.put(taterName, path);
    }
    class PotatoHolder {
        public Object potato;
    }
    class TaterHolder {
        public Object taters;
    }
    class LocalTaterHolder {
        public Object localTaters;
    }
    public static void createDefaultConfiguration(File potatoTomlFile, String projectName, String authorName) throws IOException {
        Configuration config = new Configuration();
        config.addPackageName(projectName);
        config.addVersion("1.0.0");
        config.addMascotName(authorName);
        config.addAuthorName(authorName);
        config.addLanguageName("Tupul");
        config.addLanguageVersion("1.0");
        config.writeToFile(potatoTomlFile);
    }
    public static Configuration createConfigFromFile(File potatoTomlFile) {
        Toml toml = new Toml();
        toml.read(potatoTomlFile);
        return toml.to(Configuration.class);
    }
    public void writeToFile(File file) throws IOException {
        if(file.createNewFile());
        TomlWriter writer = new TomlWriter.Builder().build();
        PotatoHolder holder = new PotatoHolder();
        holder.potato = potato;
        TaterHolder holder1 = new TaterHolder();
        holder1.taters = taters;
        LocalTaterHolder holder2 = new LocalTaterHolder();
        holder2.localTaters = localTaters;

        String potatoString = writer.write(holder);
        String tatersString = writer.write(holder1);
        String localTatersString = writer.write(holder2);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(potatoString);
        bufferedWriter.write("\n");
        bufferedWriter.write(tatersString);
        bufferedWriter.write("\n");
        bufferedWriter.write(localTatersString);
        bufferedWriter.close();
    }

}
