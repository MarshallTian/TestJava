package generics;

import net.fields.util.Generator;

import java.util.*;

/**
 * Created by Xinhui on 2014/12/29.
 */

class small {
    private static long counter = 1;
    private final long id = counter++;
    public small() {}
    public long getId() { return id; }
    public String toString() { return "small " + id; }

    public static Generator<small> generator() {
        return new Generator<small>() {
            @Override
            public small next() {
                return new small();
            }
        };
    }
}

class big {
    private static long counter = 4;
    private final long id = counter++;

    public big() {}
    public long getId() { return id; }
    public String toString() { return "Big " + id; }

    public static Generator<big> generator =
            new Generator<big>() {
                public big next() { return new big(); }
            };
}

public class FishEater {

    public static void CanEat(big t, small c) {
        if (t.getId() > c.getId())
            System.out.println(t + " can eat: " + c);
        else
            System.out.println(t + " can not eat: " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<small> smalls = new LinkedList<small>();
        Generators.fill(smalls, small.generator(), 15);
        List<big> bigs = new ArrayList<big>();
        Generators.fill(bigs, big.generator, 4);
        for (small c : smalls)
            CanEat(bigs.get(rand.nextInt(bigs.size())), c);
    }
}
