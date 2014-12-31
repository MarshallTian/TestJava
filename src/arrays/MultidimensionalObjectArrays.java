package arrays;

import java.util.Arrays;

/**
 * Created by Xinhui on 2014/12/31.
 */
public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {
                { new BerylliumSphere(), new BerylliumSphere() },
                { new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere() },
                { new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()},
        };
        System.out.println(Arrays.deepToString(spheres));
    }
}
