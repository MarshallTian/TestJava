package interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * Created by Xinhui on 2014/12/11.
 */
public abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s =
            "If she weight!";
    public static void main(String[] args) {
        Apply.process(new Upcase(), s);

    }
}

class Upcase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}


