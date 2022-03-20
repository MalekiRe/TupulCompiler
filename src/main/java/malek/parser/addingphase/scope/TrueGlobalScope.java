package malek.parser.addingphase.scope;

import malek.buildtool.printlib.Color;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.scope.typeinterface.TypeInterfaceScope;
import malek.parser.addingphase.symbol.*;
import malek.parser.symbol.InterfaceType;
import malek.parser.symbol.TypeType;

import java.util.*;

public class TrueGlobalScope implements AddingPhaseScope {
    final Map<String, ValueType> types = new HashMap<>();
    final Map<String, AddingSymbol> symbols = new HashMap<>();
    final Map<String, AddingPhaseScope> childScopes = new HashMap<>();
    final Map<String, TypeInterfaceScope> typeInterfaceScopeMap = new HashMap<>();
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
    public Map<String, AddingPhaseScope> getChildScopes() {
        return childScopes;
    }

    public void defineTypeInterfaceScope(String s, TypeInterfaceScope typeInterfaceScope) {
        this.typeInterfaceScopeMap.put(s, typeInterfaceScope);
    }

    public TypeInterfaceScope getTypeInterfaceScope(String s) {
        return this.typeInterfaceScopeMap.get(s);
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

    public Set<String> getFileScopeNames() {
        return fileScopeMap.keySet();
    }
}
