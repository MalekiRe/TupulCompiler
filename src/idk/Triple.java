package idk;

class Triple<T, Y, Z> {
    T t;
    Z z;
    Y y;
    public Triple(T t, Y y, Z z) {
        this.t = t;
        this.z = z;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + t + ", " + y + ", " + z + "]";
    }
    public T first() {
        return t;
    }

    public Y second() {
        return y;
    }

    public Z third() {return z;}

    public static <T, Y, Z> Triple<T, Y, Z> of(T t, Y y, Z z) {
        return new Triple<>(t, y, z);
    }
}
