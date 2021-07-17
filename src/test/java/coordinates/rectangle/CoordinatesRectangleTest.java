package coordinates.rectangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinatesRectangleTest {

    @Test
    void validateSameLineLength() {
        // given
        RectangleCoordinates rectangleA = new RectangleCoordinates(10, 10);
        RectangleCoordinates rectangleB = new RectangleCoordinates(11, 11);

        RectangleCoordinates rectangleC = new RectangleCoordinates(12, 12);
        RectangleCoordinates rectangleD = new RectangleCoordinates(13, 13);

        // when
        double distanceA = rectangleA.getDistance(rectangleB);
        double distanceB = rectangleC.getDistance(rectangleD);

        // then
        assertThat(distanceA).isEqualTo(distanceB);
    }

    @Test
    void validateDifferPoint() {
        // given
        RectangleCoordinates rectangleA = new RectangleCoordinates(10, 10);
        RectangleCoordinates rectangleB = new RectangleCoordinates(11, 11);

        // when
        boolean validate = rectangleA.isDiffer(rectangleB);

        // then
        assertThat(validate).isTrue();
    }
}
