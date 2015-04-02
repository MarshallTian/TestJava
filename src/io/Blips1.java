package io;

/**
 * Created by xinhui tian on 2015/3/25.
 */
import java.io.*;

import static net.fields.util.Print.print;

/**
 * Created by xinhui tian on 2015/3/25.
 */

public class Blips1 implements Externalizable {
    //Blips1() {
      //  print("Blip2 Constructor");
    //}
    public void writeExternal(ObjectOutput out)
            throws IOException {
        print("Blip2.writeExternal");
    }
    public void readExternal(ObjectInput in)
            throws IOException {
        print("Blip2.readExternal");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        print("Constructing objects:");
        Blip1 b1 = new Blip1();
        Blips1 b2 = new Blips1();
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Blips.out")
        );
        print("Saving objects:");
        o.writeObject(b1);
        o.writeObject(b2);
        o.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Blips.out")
        );
        print("Recovering b1:");
        b1 = (Blip1)in.readObject();
        print("Recovering b2:");
        b2 = (Blips1)in.readObject();
    }
}
