package AbstractFactory;

public class ServerFactory extends AbstractComputerFactory {

    public ServerFactory(String CPU, String RAM) {
        super(CPU, RAM);
    }

    @Override
    public Computer createComputer() {
        return new Server(CPU, RAM);
    }

}
