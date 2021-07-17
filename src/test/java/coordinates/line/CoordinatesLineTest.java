package coordinates.line;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinatesLineTest {

    @Test
    void getCalculateCoordinateTest() {
        // given
        CoordinatesLine coordinatesA = new CoordinatesLine("(10,10)");
        CoordinatesLine coordinatesB = new CoordinatesLine("(14,15)");

        // when
        double distance = coordinatesA.getDistance(coordinatesB);

        // then
        assertThat(distance).isEqualTo(6.4031242374328485d);
    }

    @Test
    void getPointYCalculateValueTest() {
        // given
        Point a = new Point(2);
        Point b = new Point(1);

        // when
        int result = a.calculate(b);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void getPointXCalculateValueTest() {
        // given
        Point a = new Point(2);
        Point b = new Point(1);

        // when
        int result = a.calculate(b);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void validateCoordinateTest() {
        // given & then
        assertThatThrownBy(() -> {
            new Point(25);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            new Point(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void changeInputTest() {
        // given
        CoordinatesLine coordinatesLine = new CoordinatesLine("(10,1)");

        // then
        assertThat(coordinatesLine.getPointX()).isEqualTo(new Point(10));
        assertThat(coordinatesLine.getPointY()).isEqualTo(new Point(1));

    }
}
