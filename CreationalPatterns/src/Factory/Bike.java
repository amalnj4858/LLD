package Factory;

public class Bike implements Vehicle {
    private int numberOfWheels;

    public Bike(int wheels) {
        this.numberOfWheels = wheels;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("Factory.Bike has " + numberOfWheels + " wheels");
    }
}
