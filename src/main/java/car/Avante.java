package car;

public class Avante extends Car {
    private final double FUEL_EFFICIENCY = 15;
    private final String NAME = "Avante";

    public Avante(double tripDistance) {
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
