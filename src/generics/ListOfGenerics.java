package generics;

import java.util.*;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item) { array.add(item); }
    public T get(int index) { return array.get(index); }
}
