package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Xinhui on 2014/12/31.
 */

public class Test3 {
    public static double[][] generate2(int a, int b, double i1, double i2) {
        Random rand = new Random();
        double[][] array = new double[a][];
        for (int i = 0; i < a; i++) {
            array[i] = new double[b];
            for (int j = 0; j < b; j++) {
                double t;
                do {
                    t = rand.nextDouble() + rand.nextInt((int)(i2+1));
                } while (t < i1 || t > i2);
                array[i][j] = t;
            }
        }
        return array;
    }
    public static double[][][] generate3(int a, int b, int c, double i1, double i2) {
        Random rand = new Random();
        double[][][] array = new double[a][][];
        for (int i = 0; i < a; i++) {
            array[i] = new double[b][];
            for (int j = 0; j < b; j++) {
                array[i][j] = new double[c];
                for (int k = 0; k < c; k++) {
                    double t;
                    do {
                        t = rand.nextDouble() + rand.nextInt((int) (i2 + 1));
                    } while (t < i1 || t > i2);
                    array[i][j][k] = t;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generate2(2, 4, 5.0, 9.0)));
        System.out.println(Arrays.deepToString(generate3(2, 4, 6, 5.0, 9.0)));
    }
}
