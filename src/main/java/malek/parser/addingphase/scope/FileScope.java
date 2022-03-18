package malek.parser.addingphase.scope;

import malek.parser.addingphase.scope.nonglobals.NonGlobalSymbolScope;
import malek.parser.addingphase.symbol.FileLocation;
import malek.parser.addingphase.symbol.SymbolBuiltInType;
import malek.parser.addingphase.symbol.SymbolType;
import malek.parser.util.FileStore;

public class FileScope extends NonGlobalSymbolScope {

    private final FileLocation fileLocation;
    private final FileLocation[] importedThings;

    private FileScope(String scopeName, AddingPhaseScope enclosingScope, FileLocation fileLocation, FileLocation[] importedThings) {
        super(scopeName, SymbolBuiltInType.FILE, enclosingScope);
        this.fileLocation = fileLocation;
        this.importedThings = importedThings;
    }

    public String getFileLocation() {
        return fileLocation.getFileLocation();
    }

    public FileLocation[] getImportedThings() {
        return importedThings;
    }

    public static class FileScopeBuilder {
        String scopeName;
        AddingPhaseScope enclosingScope;
        FileLocation fileLocation;
        FileLocation[] importedThings;
        public FileScopeBuilder addName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public FileScopeBuilder addEnclosingScope(AddingPhaseScope enclosingScope) {
            this.enclosingScope = enclosingScope;
            return this;
        }
        public FileScopeBuilder addFileLocation(FileLocation fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public FileScopeBuilder addImportedThings(FileLocation ...importedThings) {
            this.importedThings = importedThings;
            return this;
        }
        public FileScope build() {
            return new FileScope(scopeName, enclosingScope, fileLocation, importedThings);
        }
    }
    public FileScope clone() {
        FileScope clonedScope = new FileScope(getScopeName(), getEnclosingScope(), fileLocation, importedThings);
        for(String s : getSymbols().keySet()) {
            clonedScope.defineSymbol(s, getSymbols().get(s));
        }
        for(String s : getValueTypes().keySet()) {
            clonedScope.defineType(getValueTypes().get(s));
        }

        return clonedScope;
    }
    public void copySymbolsAndTypes(FileScope scope) {
        for(String s : scope.getSymbols().keySet()) {
            this.defineSymbol(s, scope.getSymbols().get(s));
        }
        for(String s : scope.getValueTypes().keySet()) {
            this.defineType(scope.getValueTypes().get(s));
        }
    }
}
