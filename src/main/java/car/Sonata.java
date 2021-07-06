package car;

public class Sonata {
    private final int tripDistance;
    private final double FUEL_EFFICIENCY = 10;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public int getTripDistance() {
        return this.tripDistance;
    }

    public double getDistancePerLitter() {
        return this.tripDistance / FUEL_EFFICIENCY;
    }
}
