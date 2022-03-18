package malek.parser.addingphase.symbol;

public class SymbolBuiltInType implements SymbolType {
    public static final SymbolBuiltInType FUNCTION = new SymbolBuiltInType("function");
    public static final SymbolBuiltInType INTERFACE = new SymbolBuiltInType("interface");
    public static final SymbolBuiltInType TYPE = new SymbolBuiltInType("type");
    public static final SymbolBuiltInType VARIABLE = new SymbolBuiltInType("variable");
    public static final SymbolBuiltInType FILE  = new SymbolBuiltInType("file");


    final String name;
    private SymbolBuiltInType(String name) {
        this.name = name;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
