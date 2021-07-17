package coordinates.rectangle;

import coordinates.Coordinates;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RectangleCoordinatesTest {

    @Test
    void getRectangleAreaSizeTest() {
        // given
        Rectangle rectangle = new Rectangle(
                Arrays.asList(
                        new RectangleCoordinates(10, 10),
                        new RectangleCoordinates(22, 10),
                        new RectangleCoordinates(22, 18),
                        new RectangleCoordinates(10, 18)
                )
        );

        // when && then
        assertThat(rectangle.getAreaSize()).isEqualTo(96);
    }
}
