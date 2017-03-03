package collection;

import collection.n_tuple.Tuple;

import java.util.*;

/**
 * Offers some short cuts to create different java collections.
 */
public class Creation {
    private Creation() {}

    public static <K, V> Map<K, V> hashMap(Tuple<K, V>... elem) {
        Map<K, V> map = new HashMap<>();
        Arrays.stream(elem).forEach(t -> map.put(t.first(), t.second()));
        return map;
    }

    public static <T> List<T> arrayList(T... elem) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, elem);
        return list;
    }

    public static <T> List<T> view(List<T> target) {
        return Collections.unmodifiableList(target);
    }
}
