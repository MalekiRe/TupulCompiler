package malek.parser.scope;

import malek.buildtool.printlib.PrintLib;
import malek.parser.symbol.Symbol;
import malek.parser.symbol.Type;

import java.util.ArrayList;
import malek.buildtool.printlib.PrintLib;
import java.util.List;

public class TypeInterfaceScope extends NonGlobalScope implements Type {
    Scope enclosingScope;
    String name;
    Type type;
    List<String> extendingInterfaces;
    public TypeInterfaceScope(String name, Type type, Scope enclosingScope) {
        this.name = name;
        this.type = type;
        this.enclosingScope = enclosingScope;
    }

    public void addExtendingInterfaces(List<String> interfaces) {
        this.extendingInterfaces = interfaces;
    }
    public List<String> getExtendingInterfaces() {
        return extendingInterfaces;
    }

    @Override
    public String getScopeName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "";
        if(this instanceof TypeScope) {
            s += "[type";
        } else {
            s += "[interface:";
        }
        s += ", name: " + name;
        if(extendingInterfaces != null && extendingInterfaces.size() > 0) {
            s += ", extends: " + extendingInterfaces;
        }
        return s + "]";
    }
    public void print(int spacing) {
        PrintLib.println(PrintLib.spacing(spacing) + this, PrintLib.colorFromInt(spacing));
        if(getTypesMap().size() > 0) {
            PrintLib.println(PrintLib.spacing(spacing+1) + "types", PrintLib.colorFromInt(spacing+1));
            for (Type type : getTypesMap().values()) {
                PrintLib.println(PrintLib.spacing(spacing + 2) + type.getName(), PrintLib.colorFromInt(spacing + 1));
            }
        }
        if(getSymbolsMap().size() > 0) {
            PrintLib.println(PrintLib.spacing(spacing+1) + "variables/functions", PrintLib.colorFromInt(spacing+1));
            for(Symbol symbol : getSymbolsMap().values()) {
                PrintLib.println(PrintLib.spacing(spacing+2) + symbol.toString(), PrintLib.colorFromInt(spacing+1));
            }
        }
    }
}
