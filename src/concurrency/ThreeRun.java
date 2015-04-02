package concurrency;

/**
 * Created by xinhui tian on 2015/3/24.
 */
public class ThreeRun implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public ThreeRun() { System.out.println("I am #" + id); }

    public void run() {
        int i = 0;
        while(i++ < 3) {
            System.out.println(i + " in #" + id);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new ThreeRun().run();
    }
}
