package coordinates.line;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinatesLineTest {

    @Test
    void changeInputCoordiTest() {
        // given
        Coordinates coordinates = new Coordinates("(10,1)");

        //
        assertThat(coordinates.isX(10)).isTrue();
        assertThat(coordinates.isY(1)).isTrue();

    }
}
