package BridgePattern;

public abstract class Vehicle {
    private Workshop workshop1;
    private Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    protected void manufacturingProcedures() {
        workshop1.work();
        workshop2.work();
    }

    public abstract void manufacture();

}
