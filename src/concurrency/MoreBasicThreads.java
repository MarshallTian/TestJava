package concurrency;

/**
 * Created by xinhui tian on 2015/3/24.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for liftoff");
    }
}
