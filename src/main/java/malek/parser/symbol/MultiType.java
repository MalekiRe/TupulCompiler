package malek.parser.symbol;

import java.util.List;

public interface MultiType extends Type{
    List<Type> getTypes();
    default String getName() {
        return getTypes().toString();
    }
    default String toString() {
        return getTypes().toString();
    }
}
