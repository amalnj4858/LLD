package VisitorPattern;

public class Circle implements Shape {
    int radius;
    ShapeVisitor shapeVisitor;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }

    public int getRadius() {
        return radius;
    }
}
