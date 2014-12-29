package generics;

import net.fields.util.Generator;

import java.util.Collection;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
}
