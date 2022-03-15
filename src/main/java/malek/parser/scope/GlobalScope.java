package malek.parser.scope;

import malek.parser.exception.ParsingException;
import malek.parser.symbol.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class GlobalScope implements Scope {
    Map<String, Symbol> symbols = new HashMap<>();
    Map<String, Type> types = new HashMap<>();
    Map<String, FileScope> files = new HashMap<>();
    public GlobalScope() {
        initTypeSystem();
    }
    protected void initTypeSystem() {
        defineType(new BuiltInTypeSymbol("int"));
        defineType(new BuiltInTypeSymbol("double"));
        defineType(new BuiltInTypeSymbol("char"));
        defineType(new BuiltInTypeSymbol("float"));
        defineType(new BuiltInTypeSymbol("void"));
        defineType(new BuiltInTypeSymbol("string"));
        defineType(TypeType.type);
        defineType(InterfaceType.type);
        define(new FunctionScope("print", types.get("void"), this));
    }

    public void defineFileScope(FileScope fileScope) throws Exception {
        if(files.containsKey(fileScope.fileLocation.toString())) {
            throw new Exception("redefining file twice: " + fileScope.fileLocation.toString());
        }
        files.put(fileScope.fileLocation.toString(), fileScope);
    }

    @Override
    public String getScopeName() {
        return "global";
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    @Override
    public void define(Symbol symbol) {
        symbols.put(symbol.name, symbol);
    }



    @Override
    public Symbol resolve(String name) {
        if(!symbols.containsKey(name)) {
            System.err.println("error symbol : " + name + " does not exist");
            return null;
        }
        return symbols.get(name);
    }

    @Override
    public void defineType(Type type) {
        types.put(type.getName(), type);
    }

    @Override
    public Type resolveType(String name) {
        if(!types.containsKey(name)) {
            System.err.println("error type : " + name + " does not exist");
            return null;
        }
        return types.get(name);
    }


    @Override
    public String uniqueResolveName(String name) {
        return getScopeName()+"."+name;
    }

    @Override
    public String uniqueResolveTypeName(String type) {
        return getScopeName()+"."+type;
    }

    public void printGlobalScope() {
        System.out.println("global scope");
        System.out.println("globally defined universal types");
        for(String typename : types.keySet()) {
            System.out.println("    "+typename);
        }
        System.out.println("globally defined universal functions");
        for(String functionName : symbols.keySet()) {
            System.out.println("    "+functionName);
        }
        System.out.println("global, all defined files");
        for (String fileName : files.keySet()) {
            System.out.println("file");
            files.get(fileName).printScope();
        }
    }

}
