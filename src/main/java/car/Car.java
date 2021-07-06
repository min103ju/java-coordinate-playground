package car;

public abstract class Car {
    protected final double tripDistance;

    public Car(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    abstract double getDistancePerLitter();

    abstract double getTripDistance();

    abstract String getName();

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLitter();
    }
}
