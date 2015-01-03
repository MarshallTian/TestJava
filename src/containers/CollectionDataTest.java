package containers;

/**
 * Created by Xinhui on 2015/1/3.
 */
import java.util.*;
import net.fields.util.*;

class Government implements Generator<String> {
    String[] foundation = ("Strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "government").split(" ");
    private int index;
    public String next() { return foundation[index++]; }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(
                new CollectionData<String>(new Government(), 15));
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
