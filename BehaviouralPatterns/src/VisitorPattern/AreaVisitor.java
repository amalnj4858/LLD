package VisitorPattern;

public class AreaVisitor implements ShapeVisitor{
    private Double totalArea = (double) 0;

    @Override
    public void visit(Circle circle) {
        totalArea += 3.14 * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visit(Square square) {
        totalArea += (double) square.getSide() * square.getSide();
    }

    public Double getTotalArea() {
        return totalArea;
    }
}
