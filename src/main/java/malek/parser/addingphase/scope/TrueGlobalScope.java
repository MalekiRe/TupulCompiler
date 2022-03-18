package malek.parser.addingphase.scope;

import malek.parser.addingphase.symbol.*;

import java.util.*;

public class TrueGlobalScope implements AddingPhaseScope {
    final Map<String, ValueType> types = new HashMap<>();
    final Map<String, AddingSymbol> symbols = new HashMap<>();
    final Set<AddingPhaseScope> childScopes = new HashSet<>();
    final Map<String, FileScope> fileScopeMap = new HashMap<>();
    final String scopeName = "TrueGlobal";
    static final private String[] builtinValueTypes = {"int", "double", "float", "string", "char", "void"};
    static TrueGlobalScope trueGlobalScope = new TrueGlobalScope();
    protected TrueGlobalScope() {
        Arrays.stream(builtinValueTypes).map(ConcreteValueType::new).forEach(this::defineType);
        defineSymbol(new FunctionSymbol.FunctionSymbolBuilder().addTypes(resolveType("void")).addArguments(resolveType("string")).addName("print").build());
    }
    public static TrueGlobalScope get() {
        return trueGlobalScope;
    }
    @Override
    public String getScopeName() {
        return scopeName;
    }

    @Override
    public AddingPhaseScope getEnclosingScope() {
        return null;
    }

    @Override
    public Set<AddingPhaseScope> getChildScopes() {
        return childScopes;
    }

    @Override
    public Map<String, AddingSymbol> getSymbols() {
        return symbols;
    }

    @Override
    public Map<String, ValueType> getValueTypes() {
        return types;
    }

    public void addFileScope(FileScope fileScope) {
        this.fileScopeMap.put(fileScope.getFileLocation(), fileScope);
    }

    public FileScope getFileScope(String fileLocation) {
        return this.fileScopeMap.get(fileLocation);
    }

    public Set<String> getFileScopeNames() {
        return fileScopeMap.keySet();
    }
}
