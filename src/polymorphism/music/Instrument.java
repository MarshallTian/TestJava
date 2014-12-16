package polymorphism.music;

/**
 * Created by Xinhui on 2014/12/8.
 */
import static net.fields.util.Print.*;

class Instrument {
    public void play(Note n) {
        print("Instrument.play() " + n);
    }

    String what() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }
}
