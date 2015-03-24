package concurrency;

/**
 * Created by xinhui tian on 2015/3/24.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for liftoff");
    }
}
