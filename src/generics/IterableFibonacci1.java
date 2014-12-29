package generics;

import java.util.Iterator;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class IterableFibonacci1 implements Iterable<Integer> {
    private int n;
    private Fibonacci f;
    public IterableFibonacci1(int count) { n = count; f = new Fibonacci(); }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return n > 0; }
            public Integer next() {
                n--;
                return f.next();
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci1(18))
            System.out.print(i + " ");
    }

}
