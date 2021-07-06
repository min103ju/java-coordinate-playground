package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void sonateTest() {

        // given
        Sonate sonata = new Sonate(150);

        // then
        assertThat(sonata.getDistance()).isEqualTo(150);

    }
}
