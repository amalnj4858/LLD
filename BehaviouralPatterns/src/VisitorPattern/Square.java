package VisitorPattern;

public class Square implements Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }

    public int getSide() {
        return side;
    }
}
