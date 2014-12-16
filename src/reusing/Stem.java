package reusing;

import static net.fields.util.Print.*;
/**
 * Created by Xinhui on 2014/12/1.
 */
public class Stem extends Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Stem() {

        System.out.println("Stem");
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
    }

    /*public void getRoot() {
        print("InStem");
    }*/

    public void dispose() {
        print("Dispose Stem");
        c1.dispose();
        c2.dispose();
        c3.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Stem s = new Stem();
        Root s1 = s;
        s1.getRoot();

        //s.dispose();

    }

}
