package car;

public class K5 extends Car {
    private final double FUEL_EFFICIENCY = 13;
    private final String NAME = "Avante";

    public K5(double tripDistance) {
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
    String getName() {
        return this.NAME;
    }
}
