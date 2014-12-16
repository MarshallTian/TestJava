package polymorphism;

/**
 * Created by Xinhui on 2014/12/8.
 */
import static net.fields.util.Print.*;

class Status {
    public void alert() {}
}

class GoodStatus extends Status {
    public void alert() { print("good!"); }
}

class BadStatus extends Status {
    public void alert() { print("Bad!"); }
}

class WarnStatus extends Status {
    public void alert() { print("Warn!"); }
}

class AlertStatus {
    private Status s = new GoodStatus();
    public void changeToBad() { s = new BadStatus(); }
    public void changeToWarn() { s = new WarnStatus(); }

    public void Alert() { s.alert(); }
}

public class StarShip {
    public static void main(String[] args) {
        AlertStatus as = new AlertStatus();
        as.Alert();
        as.changeToBad();
        as.Alert();
        as.changeToWarn();
        as.Alert();
    }
}
