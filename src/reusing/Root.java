package reusing;
import static net.fields.util.Print.*;
/**
 * Created by Xinhui on 2014/12/1.
 */
public class Root {

    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root() {
        System.out.println("Root!");
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
    }

    public void getRoot() {
        print("InRoot");
    }

    public void dispose() {
        print("dispose root");
        c1.dispose();
        c2.dispose();
        c3.dispose();

    }
}
