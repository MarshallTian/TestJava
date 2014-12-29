package generics.Actor;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class Actor {
    private static long counter = 0;
    private final long id = counter++;
    private String ActorName;
    public Actor(String name) { ActorName = name;}
    public String toString() {
        return getClass().getSimpleName() + ": " + ActorName + " " + id;
    }
}
