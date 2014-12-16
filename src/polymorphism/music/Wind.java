package polymorphism.music;

import static net.fields.util.Print.print;

/**
 * Created by Xinhui on 2014/12/8.
 */
public class Wind extends Instrument {
    public void play(Note n) {
        print("Wind.play()" + n );
    }
}
