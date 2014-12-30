package generics.decorator;

/**
 * Created by Xinhui on 2014/12/30.
 */
import java.util.*;

class CoffeeBasic {
    private String value;
    public void set(String val) { value = val; }
    public String get() { return value; }
}

class CoffeeDecorator extends CoffeeBasic {
    protected CoffeeBasic basic;
    public CoffeeDecorator(CoffeeBasic basic) { this.basic = basic; }
    public void set(String val) { basic.set(val); }
    public String get() { return basic.get(); }
}

class Milk extends CoffeeDecorator {
    public Milk(CoffeeBasic basic) {
        super(basic);
    }
}

class Bubble extends CoffeeDecorator {
    public Bubble(CoffeeBasic basic) {
        super(basic);
    }
}

class Chocolate extends CoffeeDecorator {
    public Chocolate(CoffeeBasic basic) {
        super(basic);
    }
}

public class Coffee {
    public static void main(String[] args) {
        Milk m = new Milk(new CoffeeBasic());
        Bubble b = new Bubble(new Milk(new CoffeeBasic()));
    }
}
