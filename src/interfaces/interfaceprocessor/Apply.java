package interfaces.interfaceprocessor;

import static net.fields.util.Print.print;
/**
 * Created by Xinhui on 2014/12/11.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
