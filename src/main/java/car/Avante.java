package car;

public class Avante extends Car {
    private final double FUEL_EFFICIENCY = 15;

    public Avante(double tripDistance) {
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
