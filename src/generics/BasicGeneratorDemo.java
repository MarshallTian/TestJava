package generics;

import net.fields.util.BasicGenerator;
import net.fields.util.Generator;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<GountedObject> gen = BasicGenerator.create(GountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for (int i = 0; i < 5; i++) {
            GountedObject g = new GountedObject();
            System.out.println(g.toString());
        }

    }
}
