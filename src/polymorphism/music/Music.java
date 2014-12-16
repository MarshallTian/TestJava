package polymorphism.music;

/**
 * Created by Xinhui on 2014/12/8.
 */



public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flune = new Wind();
        tune(flune);
    }
}
