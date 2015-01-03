package net.fields.util;

/**
 * Created by Xinhui on 2015/1/3.
 */
import java.util.*;
public class MapData<K,V> extends LinkedHashMap<K,V> {
    public MapData(Generator<Pair<K,V>> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Pair<K, V> p = gen.next();
            put(p.key, p.value);
        }
    }

    public MapData(Generator<K> genk, V value, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(genk.next(), value);
        }
    }

    public MapData(Iterable<K> genk, Generator<V> value) {
        for (K key : genk) {
            put(key, value.next());
        }
    }
}
