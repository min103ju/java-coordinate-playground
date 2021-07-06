package car;

public abstract class Car {
    protected final double tripDistance;

    public Car(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    abstract double getDistancePerLitter();

    abstract double getTripDistance();

    public abstract String getName();

    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLitter();
    }
}
