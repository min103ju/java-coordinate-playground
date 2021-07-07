package coordinates.line;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinatesLineLineTest {


    @Test
    void getPointCalculateValueTest() {
        // given
        PointX a = new PointX(2);
        PointX b = new PointX(1);

        // when
        int result = a.calculate(b);

        // then
        assertThat(result).isEqualTo(1);

    }

    @Test
    void validateCoordinateTest() {
        // given & then
        assertThatThrownBy(() -> {
            new PointX(25);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            new PointY(25);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void changeInputTest() {
        // given
        CoordinatesLine coordinatesLine = new CoordinatesLine("(10,1)");

        // then
        assertThat(coordinatesLine.getPointX()).isEqualTo(new PointX(10));
        assertThat(coordinatesLine.getPointY()).isEqualTo(new PointY(1));

    }
}
