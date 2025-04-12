package CompositePattern;

public class Square implements Shape{
    String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public void paint() {
        System.out.println("Painting square in: " + color);
    }
}
