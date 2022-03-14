package malek.parser.scope;

import malek.parser.util.FileStore;

import java.util.ArrayList;
import java.util.List;

public class FileScope implements NonGlobalScope {
    FileStore fileLocation;
    Scope enclosingScope;
    List<FileStore> importedThings = new ArrayList<>();
    public FileScope(FileStore fileLocation, Scope enclosingScope) {
        this.fileLocation = fileLocation;
        this.enclosingScope = enclosingScope;
    }

    public void defineImportedThing(FileStore s) {
        this.importedThings.add(s);
    }


    public List<FileStore> getImportedThings() {
        return importedThings;
    }


    @Override
    public String getScopeName() {
        return fileLocation.toString();
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }
}
