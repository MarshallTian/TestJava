package io;

/**
 * Created by xinhui tian on 2015/3/25.
 */
import java.util.concurrent.*;
import java.io.*;
import java.util.*;
import static net.fields.util.Print.*;

public class Login implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;
    public Login(String name, String pwd) {
        username = name;
        password = pwd;
    }

    public String toString() {
        return "Login info: \n username " + username +
                "\n date: " + date + "\n password: " + password;
    }

    public static void main(String[] args) throws Exception {
        Login a = new Login("Hulk", "myLittlePony");
        print("login a = " + a);
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Login.out")
        );
        o.writeObject(a);
        o.close();
        TimeUnit.SECONDS.sleep(1);

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Login.out")
        );
        print("Recovering object at " + new Date());
        a = (Login)in.readObject();
        print("Login a =  " + a);
    }
}
