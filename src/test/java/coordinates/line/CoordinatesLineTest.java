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
        assertThat(distance).isEqualTo(6.403124d);
    }

    @Test
    void getPointYCalculateValueTest() {
        // given
        PointY a = new PointY(2);
        PointY b = new PointY(1);

        // when
        int result = a.calculate(b);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void getPointXCalculateValueTest() {
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
            new PointY(-1);
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
