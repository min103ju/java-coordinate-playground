package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void sonataTest() {

        // given
        Sonata sonata = new Sonata(10);

        // then
        assertThat(sonata.getTripDistance()).isEqualTo(10);
        assertThat(sonata.getDistancePerLitter()).isEqualTo(1d);

    }
}
