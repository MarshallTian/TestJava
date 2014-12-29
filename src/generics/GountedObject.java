package generics;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class GountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }
    public String toString() { return "CountedObject" + id; }
}
