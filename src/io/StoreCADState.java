package io;

/**
 * Created by xinhui tian on 2015/3/25.
 */
import java.io.*;
import java.util.*;

abstract class Shape implements Serializable {
    public static final int RED = 1, BLUE = 2, GREEN = 3;
    private int xPos, yPos, dimension;
    private static Random rand = new Random(47);
    private static int counter = 0;
    public abstract void setColor(int newColor);
    public abstract int getColor();

    public Shape(int xVal, int yVal, int dim) {
        xPos = xVal;
        yPos = yVal;
        dimension = dim;
    }
    public String toString() {
        return getClass() +
                " color[" + getColor() + "] xPos[" + xPos +
                "] yPos[" + yPos + "] dim[" + dimension + "]\n";
    }
    public static Shape randomFactory() {
        int xVal = rand.nextInt(100);
        int yVal = rand.nextInt(100);
        int dim = rand.nextInt(100);
        switch(counter++ % 3) {
            default:
            case 0: return new Circle(xVal, yVal, dim);
            case 1: return new Square(xVal, yVal, dim);
            case 2: return new Line(xVal, yVal, dim);
        }
    }
}

class Circle extends Shape {
    private static int color = RED;
    public Circle(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
    }
    public static void
    serializeStaticState(ObjectOutputStream os)
            throws IOException { os.writeInt(color); }
    public static void
    deserializeStaticState(ObjectInputStream os)
            throws IOException { color = os.readInt(); }

    private void writeObject(ObjectOutputStream stream)
            throws IOException {
        stream.defaultWriteObject();
        serializeStaticState(stream);
    }
    private void readObject(ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        deserializeStaticState(stream);
    }

    public void setColor(int newColor) { color = newColor; }
    public int getColor() { return color; }
}

class Square extends Shape {
    private static int color;

    public static void
    serializeStaticState(ObjectOutputStream os)
            throws IOException { os.writeInt(color); }
    public static void
    deserializeStaticState(ObjectInputStream os)
            throws IOException { color = os.readInt(); }

    private void writeObject(ObjectOutputStream stream)
            throws IOException {
        stream.defaultWriteObject();
        serializeStaticState(stream);
    }
    private void readObject(ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        deserializeStaticState(stream);
    }

    public Square(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
        color = RED;
    }
    public void setColor(int newColor) { color = newColor; }
    public int getColor() { return color; }
}
class Line extends Shape {
    private static int color = RED;

    public static void
    serializeStaticState(ObjectOutputStream os)
            throws IOException { os.writeInt(color); }
    public static void
    deserializeStaticState(ObjectInputStream os)
            throws IOException { color = os.readInt(); }

    private void writeObject(ObjectOutputStream stream)
            throws IOException {
        stream.defaultWriteObject();
        serializeStaticState(stream);
    }
    private void readObject(ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        deserializeStaticState(stream);
    }

    public Line(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
    }
    public void setColor(int newColor) { color = newColor; }
    public int getColor() { return color; }
}

public class StoreCADState {
    public static void main(String[] args) throws Exception {
        List<Class<? extends Shape>> shapeTypes =
                new ArrayList<Class<? extends Shape>>();
        shapeTypes.add(Circle.class);
        shapeTypes.add(Square.class);
        shapeTypes.add(Line.class);
        List<Shape> shapes = new ArrayList<Shape>();
        for (int i = 0; i < 10; i++)
            shapes.add(Shape.randomFactory());
        for (int i = 0; i < 10; i++)
            ((Shape)shapes.get(i)).setColor(Shape.GREEN);

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("CADstate.out")
        );
        out.writeObject(shapeTypes);
        //Line.serializeStaticState(out);
        out.writeObject(shapes);
        System.out.println(shapes);
    }
}