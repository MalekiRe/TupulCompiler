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
}
