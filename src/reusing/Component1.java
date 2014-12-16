package reusing;

import static net.fields.util.Print.*;
/**
 * Created by Xinhui on 2014/12/1.
 */
public class Component1 {
    public Component1() {
        print("Component1");
    }

    public void dispose() {
        print("Dispose c1");
    }
}
