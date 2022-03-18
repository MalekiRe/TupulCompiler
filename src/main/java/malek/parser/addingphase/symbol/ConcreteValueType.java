package malek.parser.addingphase.symbol;

import java.util.Objects;

public class ConcreteValueType implements ValueType {
    final String name;
    public ConcreteValueType(String name) {
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

    @Override
    public boolean equals(Object object) {
        if(object instanceof ConcreteValueType) {
            if(Objects.equals(((ConcreteValueType) object).getName(), getName())) {
                return true;
            }
        }
        return false;
    }
}
