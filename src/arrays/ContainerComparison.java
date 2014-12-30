package arrays;

/**
 * Created by Administrator on 2014/12/30 0030.
 */
import java.util.*;
import static net.fields.util.Print.*;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Sphere "+ id; }
}

public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++)
            spheres[i] = new BerylliumSphere();
        print(Arrays.toString(spheres));
        print(spheres[4]);

        List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
        for (int i = 0; i < 5; i++)
            sphereList.add(new BerylliumSphere());
        print(sphereList);
        print(sphereList.get(4));

        int[] integers = { 0, 1, 2, 3, 4 };
        print(Arrays.toString(integers));

        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3,4));
        intList.add(97);
        print(intList);
    }
}
