package Factory;

public class Car implements Vehicle {
    private int numberOfWheels;

    public Car(int wheels) {
        numberOfWheels = wheels;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("Factory.Car has " + numberOfWheels + " wheels");
    }
}
