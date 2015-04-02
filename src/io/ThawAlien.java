package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by xinhui tian on 2015/3/25.
 */
public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(new File(".", "X.file"))
        );
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());
    }
}
