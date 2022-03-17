package malek.parser.addingphase.symbol;

import java.util.ArrayList;
import java.util.List;

public class AddingSymbol {
    String name;
    AddingType[] types;
    public AddingSymbol(String name, AddingType ...types) {
        this.name = name;
        this.types = types;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return getName();
    }
}
