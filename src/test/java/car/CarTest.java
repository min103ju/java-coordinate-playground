package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void k5Test() {
        // given
        Car k5 = new K5(13);

        // then
        assertThat(k5.getChargeQuantity()).isEqualTo(1d);
    }

    @Test
    void avanteTest() {
        // given
        Car avante = new Avante(15);

        // then
        assertThat(avante.getChargeQuantity()).isEqualTo(1d);
    }

    @Test
    void sonataTest() {
        // given
        Car sonata = new Sonata(10);

        // then
        assertThat(sonata.getChargeQuantity()).isEqualTo(1d);

    }
}
