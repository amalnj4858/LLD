package VisitorPattern;

public interface Shape {
    public void accept(ShapeVisitor shapeVisitor);
}
