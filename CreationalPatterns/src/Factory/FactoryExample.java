package Factory;

public class FactoryExample implements FactoryInterface {
    @Override
    public Vehicle createVehicle(int wheels) {
        if(wheels == 2) {
            return  new Bike(wheels);
        }
        return new Car(wheels);
    }
}
