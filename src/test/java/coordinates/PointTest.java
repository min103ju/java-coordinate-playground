package coordinates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {

    @Test
    void point_사이의_길이_검증_test() {
        // given
        Point point1 = Point.of(10, 10);
        Point point2 = Point.of(14, 15);

        // when
        double distance = point1.getDistance(point2);

        // then
        assertThat(distance).isEqualTo(6.4031242374328485d);
    }

    @Test
    void point_크기_검증_Test() {
        // then
        assertThatThrownBy(() -> {
            // given && when
            new Point(25, 25);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
