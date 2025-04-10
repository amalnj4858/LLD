import AbstractFactory.Computer;
import AbstractFactory.PCFactory;
import AbstractFactory.ServerFactory;
import Factory.FactoryExample;
import Factory.Vehicle;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BuilderExample.UrlBuilder urlBuilder = new BuilderExample.UrlBuilder("http", "mentify", "in");
        BuilderExample builderExample = urlBuilder.setName("amal").setUid("123").buildUrl();
        builderExample.printUrl();

        FactoryExample factoryExample = new FactoryExample();
        Vehicle vehicle = factoryExample.createVehicle(2);
        vehicle.printVehicleDetails();

        Computer pc = (new PCFactory("5", "8")).createComputer();
        Computer server = (new ServerFactory("2", "3")).createComputer();
        System.out.println(pc.toString());
        System.out.println(server.toString());

        PrototypeExample empDetails = new PrototypeExample();
        empDetails.loadEmpDetails();
        PrototypeExample empDetailsCopy = (PrototypeExample) empDetails.clone();
        ArrayList<String> empDetailsCopyArray = empDetailsCopy.getEmpDetails();
        empDetailsCopyArray.add("Sanju Samson");
        System.out.println("original emp list: " + empDetails.getEmpDetails());
        System.out.println("cloned emp list: " + empDetailsCopyArray);
    }
}