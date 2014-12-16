package Cycle;

import static net.fields.util.Print.print;

/**
 * Created by Xinhui on 2014/12/8.
 */
class Unicycle extends Cycle {

    public void wheel() {
        print("1!");
    }
}

class Bicycle extends Cycle {

    public void wheel() {
        print("2!");
    }
}

class Tricycle extends Cycle {

    public void wheel() {
        print("3!");
    }
}

public class Cycle {

    public void wheel() {}
    public void ride() {
        this.wheel();
        print("Ride the Cycle!");
    }

    public static void main(String args[]) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        u.ride();
        b.ride();
        t.ride();
    }
}
