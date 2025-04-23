package FlyweightPattern;

public class Ball {
    String color;
    String radius;

    int orderNumber;
    int position;

    public Ball(String color, String radius) {
        System.out.println("Ball created once");
        this.color = color;
        this.radius = radius;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", radius='" + radius + '\'' +
                ", orderNumber=" + orderNumber +
                ", position=" + position +
                '}';
    }
}
