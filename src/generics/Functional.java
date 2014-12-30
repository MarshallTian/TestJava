package generics;

/**
 * Created by Xinhui on 2014/12/30.
 */
import java.math.*;
import java.util.concurrent.atomic.*;
import java.util.*;
import static net.fields.util.Print.*;

interface Combiner<T> { T combine(T x, T y); }
interface UnaryFunction<R, T> { R function(T x); }
interface Collector<T> extends UnaryFunction<T, T> {
    T result();
}
interface UnaryPredicate<T> { boolean test(T x); }

public class Functional {
    public static <T> T
    reduce(Iterable<T> seq, Combiner<T> combiner) {
        Iterator<T> it = seq.iterator();
        if(it.hasNext()) {
            T result = it.next();
            while (it.hasNext())
                result = combiner.combine(result, it.next());
            return result;
        }

        return null;
    }

    public static <T> Collector<T>
    forEach(Iterable<T> seq, Collector<T> func) {
        for (T t : seq)
            func.function(t);
        return func;
    }
}
