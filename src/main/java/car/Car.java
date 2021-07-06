package car;

public abstract class Car {
    private final double tripDistance;

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
