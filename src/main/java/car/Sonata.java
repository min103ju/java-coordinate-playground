package car;

public class Sonata extends Car {
    private final double FUEL_EFFICIENCY = 10;
    private final String NAME = "Sonata";

    public Sonata(double tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLitter() {
        return FUEL_EFFICIENCY;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
