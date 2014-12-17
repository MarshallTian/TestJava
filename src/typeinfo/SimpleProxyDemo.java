package typeinfo;

import static net.fields.util.Print.*;
/**
 * Created by Administrator on 2014/12/17 0017.
 */

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public int dosomthing = 0;
    public int somethingElse = 0;
    public void doSomething() {
        print("doSomething");
        dosomthing++;
    }
    public void somethingElse(String arg) {
        print("somethingElse" + arg + ": " + somethingElse);
        somethingElse++;
    }
}

class SimpleProxy implements Interface {
    public Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        print("Simple Proxy doSomething");
        proxied.doSomething();
    }
    public void somethingElse(String arg) {
        print("SP somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
