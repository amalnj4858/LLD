package AbstractFactory;

public class PCFactory extends AbstractComputerFactory {

    public PCFactory(String CPU, String RAM) {
        super(CPU, RAM);
    }

    @Override
    public Computer createComputer() {
        return new PC(CPU, RAM);
    }
}
