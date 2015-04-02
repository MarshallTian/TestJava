package innerclasses;

/**
 * Created by xinhui tian on 2015/4/2.
 */
public class Outer {
    class Inner {
        private String name;
        public Inner(String n) { this.name = n; System.out.println(name); }
    }

    public Inner getInner(String name) {
        return new Inner(name);
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner newInner = o.getInner("Yes");
    }
}
