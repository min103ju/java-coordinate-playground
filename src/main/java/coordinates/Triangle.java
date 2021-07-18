package coordinates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle extends AbstractFigure {
    public static final int TRIANGLE_POINT_SIZE = 3;

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return TRIANGLE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    @Override
    public double getCalculateResult() {
        List<Double> distances = getDistances(getPoints());
        final double heronConstantsValue = getHeronConstantsValue(distances);
        double multiply = distances.stream()
                .mapToDouble(x -> heronConstantsValue - x)
                .reduce((a, b) -> a * b)
                .getAsDouble();

        return Math.round(
                Math.sqrt(heronConstantsValue * multiply)
        );
    }

    private List<Double> getDistances(List<Point> points) {
        return Arrays.asList(
                getPoint(0).getDistance(getPoint(1)),
                getPoint(1).getDistance(getPoint(2)),
                getPoint(2).getDistance(getPoint(0))
        );
    }

    private double getHeronConstantsValue(List<Double> distanceList) {
        return distanceList.stream().reduce(0D, Double::sum) / 2;
    }

}
