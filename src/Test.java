import java.util.function.Consumer;

import static collection.Creation.arrayList;

public class Test {
    public static void main(String[] args) {
        with(arrayList(), a -> {
            a.add(10);
            a.add(20);
        });
    }

    static <T> void with(T obj, Consumer<T> c) {
        c.accept(obj);
    }
}

