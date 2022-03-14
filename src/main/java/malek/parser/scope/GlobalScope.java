package malek.parser.scope;

import malek.parser.symbol.BuiltInTypeSymbol;
import malek.parser.symbol.Symbol;
import malek.parser.symbol.Type;

import java.util.HashMap;
import java.util.Map;

public class GlobalScope implements Scope {
    Map<String, Symbol> symbols = new HashMap<>();
    Map<String, Type> types = new HashMap<>();
    public GlobalScope() {
        initTypeSystem();
    }
    protected void initTypeSystem() {
        defineType(new BuiltInTypeSymbol("int"));
        defineType(new BuiltInTypeSymbol("double"));
        defineType(new BuiltInTypeSymbol("char"));
        defineType(new BuiltInTypeSymbol("float"));
        defineType(new BuiltInTypeSymbol("void"));
        define(new FunctionScope("print", types.get("void"), this));
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
        System.out.println("scope is : ");
        for(String s : symbols.keySet()) {
            System.out.println("["+s + ", " + symbols.get(s)+"]");
        }
        System.out.println("defined types are : ");
        for(String s : types.keySet()) {
            System.out.println("["+s + ", " + types.get(s)+"]");
        }
    }

}
