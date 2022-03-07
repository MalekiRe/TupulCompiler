package malek.symbol;

public class Symbol {
    public String name;
    public Type type;
    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }
    public Symbol(String name) {
        this.name = name;
    }
    public String toString() {
        return "[name: " + this.name + ", type: " + this.type + "]";
    }
}
