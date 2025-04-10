package AbstractFactory;

public abstract class Computer {
    String CPU;
    String RAM;

    @Override
    public String toString() {
        return "CPU: " + CPU + "RAM: " + RAM + "From Class: " + this.getClass();
    }
}
