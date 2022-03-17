package malek.parser.addingphase.scope;

import malek.parser.addingphase.scope.nonglobals.NonGlobalSymbolScope;
import malek.parser.util.FileStore;

public class FileScope extends NonGlobalSymbolScope {

    private final FileStore fileLocation;
    private final FileStore[] importedThings;

    private FileScope(String scopeName, AddingPhaseScope enclosingScope, FileStore fileLocation, FileStore[] importedThings) {
        super(scopeName, enclosingScope);
        this.fileLocation = fileLocation;
        this.importedThings = importedThings;
    }

    public FileStore getFileLocation() {
        return fileLocation;
    }

    public FileStore[] getImportedThings() {
        return importedThings;
    }

    public static class FileScopeBuilder {
        String scopeName;
        AddingPhaseScope enclosingScope;
        FileStore fileLocation;
        FileStore[] importedThings;
        public FileScopeBuilder addName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public FileScopeBuilder addEnclosingScope(AddingPhaseScope enclosingScope) {
            this.enclosingScope = enclosingScope;
            return this;
        }
        public FileScopeBuilder addFileLocation(FileStore fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public FileScopeBuilder addImportedThings(FileStore ...importedThings) {
            this.importedThings = importedThings;
            return this;
        }
        public FileScope build() {
            return new FileScope(scopeName, enclosingScope, fileLocation, importedThings);
        }
    }
}
