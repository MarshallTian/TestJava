package io;

/**
 * Created by xinhui tian on 2015/3/25.
 */
import java.io.*;
import java.util.*;

public class RecoverCADState {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("CADstate.out")
        );
        List<Class<? extends Shape>> shapeTypes =
                (List<Class<? extends Shape>>)in.readObject();
        //Line.deserializeStaticState(in);
        List<Shape> shapes = (List<Shape>)in.readObject();
        System.out.println(shapes);
    }
}
