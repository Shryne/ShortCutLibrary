package collection.n_tuple;

/**
 * An immutable collection of three elements.
 */
public class Triple<A, B, C> {
    private final A first;
    private final B second;
    private final C third;

    private Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <A, B, C> Triple<A, B, C> trible(A first, B second, C third) {
        return new Triple<>(first, second, third);
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }
}
