package interfaces.filters;

/**
 * Created by Xinhui on 2014/12/11.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) { return input; }
}
