import java.util.ArrayList;
import java.util.List;

public class PrototypeExample implements Cloneable {

    ArrayList<String> empDetails;

    public PrototypeExample() {
        empDetails = new ArrayList<>();
    }

    private PrototypeExample(ArrayList<String> empDetails) {
        this.empDetails = empDetails;
    }

    public void loadEmpDetails() {
        empDetails.add("Amal");
        empDetails.add("Cricket");
    }

    public ArrayList<String> getEmpDetails() {
        return empDetails;
    }

    @Override
    public Object clone() {
        ArrayList<String> temp = new ArrayList<>(this.empDetails);
        return new PrototypeExample(temp);
    }
}
