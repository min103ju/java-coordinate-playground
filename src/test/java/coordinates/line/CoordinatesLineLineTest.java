package coordinates.line;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinatesLineLineTest {

    @Test
    void validateCoordinate() {
        // given & then
        assertThatThrownBy(() -> {
//            new XCoordinate(25);
            new YCoordinate(25);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void changeInputTest() {
        // given
        CoordinatesLine coordinatesLine = new CoordinatesLine("(10,1)");

        // then
        assertThat(coordinatesLine.getxCoordinate()).isEqualTo(new XCoordinate(10));
        assertThat(coordinatesLine.getyCoordinate()).isEqualTo(new YCoordinate(1));

    }
}
