package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void k5Test() {
        // given
        K5 k5 = new K5(13);

        // then
        assertThat(k5.getTripDistance()).isEqualTo(13);
        assertThat(k5.getDistancePerLitter()).isEqualTo(1d);
    }

    @Test
    void avanteTest() {
        // given
        Avante avante = new Avante(15);

        // then
        assertThat(avante.getTripDistance()).isEqualTo(15);
        assertThat(avante.getDistancePerLitter()).isEqualTo(1d);
    }

    @Test
    void sonataTest() {
        // given
        Sonata sonata = new Sonata(10);

        // then
        assertThat(sonata.getTripDistance()).isEqualTo(10);
        assertThat(sonata.getDistancePerLitter()).isEqualTo(1d);

    }
}
