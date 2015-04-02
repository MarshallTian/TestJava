package io;

import java.util.*;
import java.io.*;

import static net.fields.util.Print.print;

/**
 * Created by xinhui tian on 2015/3/25.
 */
class MyData implements Serializable {
    private int n;
    public MyData(int n) { this.n = n; }
    public String toString() { return Integer.toString(n); }
}

public class MySeri implements Serializable {
    private static Random rand = new Random(47);
    private MyData d = new MyData(rand.nextInt(10));

    private char c;

    public MySeri(char x) {
        c = x;
    }

    public String toString() {
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        result.append(d);
        result.append(")");
        return result.toString();
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MySeri m = new MySeri('a');
        print("m = " + m);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("myseri.out"));

        out.writeObject("My Storage\n");
        out.writeObject(m);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("myseri.out"));
        String s = (String)in.readObject();
        MySeri m2 = (MySeri)in.readObject();
        print(s + "m2 = " + m2);
    }
}
