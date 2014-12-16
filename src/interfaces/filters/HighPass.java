package interfaces.filters;

/**
 * Created by Xinhui on 2014/12/11.
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) {
        return input;
    }
}
