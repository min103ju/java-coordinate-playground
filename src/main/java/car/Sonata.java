package car;

public class Sonata extends Car {
    private final double FUEL_EFFICIENCY = 10;
    private final String NAME = "Sonata";

    public Sonata(double tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLitter() {
        return tripDistance / FUEL_EFFICIENCY;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return this.NAME;
    }
}
