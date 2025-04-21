import AdapterPattern.LegacyPrinter;
import AdapterPattern.PrinterAdapter;
import BridgePattern.*;
import CompositePattern.Circle;
import CompositePattern.Diagram;
import CompositePattern.Shape;
import CompositePattern.Square;
import DecoratorPattern.QualityVideoPlayerDecorator;
import DecoratorPattern.SpeedVideoPlayerDecorator;
import DecoratorPattern.VideoPlayer;
import ProxyPattern.DataLoader;
import ProxyPattern.DataManagerProxy;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer(1, 180);
        videoPlayer.playVideo();
        SpeedVideoPlayerDecorator speedVideoPlayerDecorator = new SpeedVideoPlayerDecorator(videoPlayer);
        speedVideoPlayerDecorator.playVideo();
        QualityVideoPlayerDecorator qualityVideoPlayerDecorator = new QualityVideoPlayerDecorator(videoPlayer);
        qualityVideoPlayerDecorator.playVideo();

        System.out.println("\n");

        LegacyPrinter legacyPrinter = new LegacyPrinter();
        PrinterAdapter printerAdapter = new PrinterAdapter(legacyPrinter);
        printerAdapter.print();

        System.out.println("\n");

        Vehicle car = new Car(new AssemblyWorkshop(), new PackageWorkshop());
        Vehicle bike = new Bike(new AssemblyWorkshop(), new PackageWorkshop());
        car.manufacture();
        bike.manufacture();

        System.out.println("\n");

        Shape circle = new Circle("Red");
        Shape square = new Square("Magenta");
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Brown"));
        shapes.add(new Square("Black"));
        shapes.add(new Circle("white"));
        Diagram diagram = new Diagram(shapes);
        circle.paint();
        square.paint();
        diagram.paint();

        System.out.println("\n");

        DataLoader dataLoader = new DataManagerProxy("/users");
        dataLoader.viewData();
        dataLoader.viewData();
    }
}