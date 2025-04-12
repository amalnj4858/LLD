package CompositePattern;

public class Circle implements Shape{
    String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void paint() {
        System.out.println("Painting circle in: " + color);
    }
}
