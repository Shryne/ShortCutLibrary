package collection;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Some static methods to ease the use of lists.
 */
public class Lists {
    private Lists() {}

    /**
     * @return The first element of the given List in an optional (could be null).
     */
    public static <T> Optional<T> first(List<T> list) {
        return list.stream().findFirst();
    }

    /**
     * @param predicate The predicate to be fulfilled.
     * @return The first element of the given List in an optional (could be null) that fulfills the given predicate.
     */
    public static <T> Optional<T> first(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (predicate.test(t)) return Optional.of(t);
        }
        return Optional.empty();
    }

    /**
     * @return The last element of the given List in an optional (could be null).
     */
    public static <T> Optional<T> last(List<T> list) {
        return (list.isEmpty()) ? Optional.empty() : Optional.of(list.get(list.size() - 1));
    }

    /**
     * @param predicate The predicate to be fulfilled.
     * @return The last element of the given List in an optional (could be null) that fulfills the given predicate.
     */
    public static <T> Optional<T> last(List<T> list, Predicate<T> predicate) {
        T elem = null;
        for (T t : list) {
            if (predicate.test(t)) elem = t;
        }
        return Optional.ofNullable(elem);
    }
}
