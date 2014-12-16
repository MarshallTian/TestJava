package interfaces.filters;

/**
 * Created by Xinhui on 2014/12/11.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
}


