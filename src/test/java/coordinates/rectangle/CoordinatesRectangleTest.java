package coordinates.rectangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinatesRectangleTest {

    @Test
    void validateRectangle() {
        // given
        RectangleCoordinates rectangleA = new RectangleCoordinates(10, 10);
        RectangleCoordinates rectangleB = new RectangleCoordinates(11, 11);

        // when
        boolean validate = rectangleA.isDiffer(rectangleB);

        // then
        assertThat(validate).isTrue();
    }
}
