package net.fields.util;

/**
 * Created by Xinhui on 2014/12/30.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b) { first = a; second = b; }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
