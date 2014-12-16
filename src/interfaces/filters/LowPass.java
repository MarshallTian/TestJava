package interfaces.filters;

/**
 * Created by Xinhui on 2014/12/11.
*/
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) {
        return input;
    }
}
