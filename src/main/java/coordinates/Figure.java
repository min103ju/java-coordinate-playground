package coordinates;

import java.util.List;

public interface Figure {
    List<Point> getPoints();

    int size();

    String getName();

    double getCalculateResult();
}
