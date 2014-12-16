package polymophism.music3;

import polymorphism.music.Note;

import java.util.Random;

import static net.fields.util.Print.print;

/**
 * Created by Xinhui on 2014/12/8.
 */

class Instrument {
    public void play(Note n) {
        print("Instrument.play() " + n);
    }

    String what() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }


    public String toString() { return this.what(); }
}

class Wind extends Instrument {
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    String what() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    String what() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    String what() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}
class RandomSharpGenerator {
    private Random rand = new Random(47);

    public Instrument next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
        }
    }

}
public class Music3 {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            //tune(i);
            print(i);
    }

    private static RandomSharpGenerator gen = new RandomSharpGenerator();

    public static void main(String[] args) {
       /* Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed()
        };*/

        Instrument[] in = new Instrument[3];
        for (int i = 0; i < 3; i++)
            in[i] = gen.next();
        tuneAll(in);
    }
}
