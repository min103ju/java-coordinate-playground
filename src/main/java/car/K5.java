package car;

public class K5 extends Car {
    private final double FUEL_EFFICIENCY = 13;

    public K5(double tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLitter() {
        return 0;
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }
}
