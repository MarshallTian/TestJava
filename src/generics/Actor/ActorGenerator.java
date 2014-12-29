package generics.Actor;

import net.fields.util.Generator;

import java.lang.reflect.Constructor;
import java.rmi.activation.UnknownObjectException;
import java.util.*;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class ActorGenerator
implements Generator<Actor>, Iterable<Actor> {
    private Class[] types = { GoodGuy.class, BadGuy.class, };
    private String[] Good = { "Captain American", "Iron Man", "BatMan", "SuperMan", "SpiderMan", "Arrow", "Flash" };
    private String[] Bad = { "Deathstroke", "Mandarin", "Loki", "Ultron", "Red Skull", "Emil Blonsky"};
    private static Random rand = new Random(47);

    public ActorGenerator() {}

    private int size = 0;
    public ActorGenerator(int sz) { size = sz; }
    public Actor next() {
        try {
            int r = rand.nextInt(types.length);
            Class c = types[r];
            Constructor<GoodGuy> c0 = c.getDeclaredConstructor(new Class[]{String.class});
            if (r == 0) {
                return (Actor) c0.newInstance(new Object[]{Good[rand.nextInt(Good.length)]});
            }
            else
                return (Actor) c0.newInstance(new Object[]{Bad[rand.nextInt(Bad.length)]});
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    class ActorIterator implements Iterator<Actor> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public Actor next() {
            count--;
            return ActorGenerator.this.next();
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };

    public Iterator<Actor> iterator() {
        return new ActorIterator();
    }

    public static void main(String[] args) {
        ActorGenerator gen = new ActorGenerator();
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for (Actor c : new ActorGenerator(5))
            System.out.println(c);
    }

}
