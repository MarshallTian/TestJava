package interfaces.interfaceprocessor;

import java.util.Objects;

/**
 * Created by Xinhui on 2014/12/11.
 */

public interface Processor {
    int value = 5;
    String name();
    Object process(Object input);
}
