package malek.parser.addingphase.symbol;

public class AddingSymbol {
    final String name;
    final SymbolType type;
    public AddingSymbol(String name, SymbolType type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return getSymbolType() + ":" +getName();
    }
    public SymbolType getSymbolType() {return type;}
}
