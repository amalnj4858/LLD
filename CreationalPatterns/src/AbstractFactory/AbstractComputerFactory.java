package AbstractFactory;

public abstract class AbstractComputerFactory {
    String CPU;
    String RAM;

    public AbstractComputerFactory(String CPU, String RAM){
        this.CPU = CPU;
        this.RAM = RAM;
    }

    abstract Computer createComputer();
}
