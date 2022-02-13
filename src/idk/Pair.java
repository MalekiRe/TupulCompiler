package idk;

import java.util.Objects;

class Pair<T, Z> {
    T t;
    Z z;

    public Pair(T t, Z z) {
        this.t = t;
        this.z = z;
    }

    @Override
    public String toString() {
        return "[" + t + ", " + z + "]";
    }
    public T first() {
        return t;
    }

    public Z second() {
        return z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t.hashCode(), z.hashCode());
    }
    @Override
    public boolean equals(Object object) {
        return this.hashCode() == object.hashCode();
    }

    public static <T, Z> Pair<T, Z> of(T t, Z z) {
        return new Pair<T, Z>(t, z);
    }
}
