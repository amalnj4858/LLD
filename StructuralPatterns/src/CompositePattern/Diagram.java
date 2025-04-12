package CompositePattern;

import java.util.ArrayList;

public class Diagram implements Shape{
    ArrayList<Shape> shapes;

    public Diagram(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void paint() {
        System.out.println("Drawing full diagram");
        for(Shape shape: shapes) {
            shape.paint();
        }
        System.out.println("Diagram complete");
    }
}
