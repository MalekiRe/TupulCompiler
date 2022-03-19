package malek.parser.scope;

import malek.parser.symbol.Type;
import malek.parser.util.FileStore;

import java.util.ArrayList;
import java.util.List;

public class FileScope extends NonGlobalScope {
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

    public void printScope() {
        System.out.println("    "+fileLocation.toString());
        if(getImportedThings().size() > 0) {
            System.out.println("        imported files");
            for (FileStore fileStore : getImportedThings()) {
                System.out.println("            file name: " + fileStore.toString());
            }
        }
        if(getTypesMap().size() > 0) {
            System.out.println("        types and interfaces");
            for (String type : getTypesMap().keySet()) {
                if(getTypesMap().get(type) instanceof TypeInterfaceScope) {
                    ((TypeInterfaceScope) getTypesMap().get(type)).print(4);
                }
            }
        }
    }
}