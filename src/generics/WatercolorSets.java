package generics;

import generics.watercolors.*;
import java.util.*;
import static net.fields.util.Print.*;
import static net.fields.util.Sets.*;
import static generics.watercolors.Watercolors.*;

/**
 * Created by Xinhui on 2014/12/29.
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 =
                EnumSet.range(CERULEAN_BLUE_HUE, BURNT_SIENNA);
        print("Set1: " + set1);
        print("Set2: " + set2);

        print("intersection(set1, set2): " + intersection(set1, set2));

    }
}
