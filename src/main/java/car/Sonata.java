package car;

public class Sonata extends Car {
    private final double FUEL_EFFICIENCY = 10;

    public Sonata(double tripDistance) {
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
