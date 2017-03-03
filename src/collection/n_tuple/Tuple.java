package collection.n_tuple;

/**
 * An immutable collection of two elements.
 */
public class Tuple<A, B> {
    private final A first;
    private final B second;

    private Tuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public static <A, B> Tuple<A, B> tuple(A first, B second) {
        return new Tuple<>(first, second);
    }

    public A first() {
        return first;
    }

    public B second() {
        return second;
    }
}
