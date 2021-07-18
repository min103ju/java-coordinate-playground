package coordinates;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FigureTest {

    @Test
    void figure_사각형_생성_test() {
        // given && when
        Figure figure = FigureFactory.getInstance(Arrays.asList(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        ));

        // then
        assertThat(figure).isInstanceOf(Rectangle.class);
    }

    @Test
    void figure_삼각형_생성_test() {
        // given && when
        Figure figure = FigureFactory.getInstance(Arrays.asList(
                new Point(10, 10),
                new Point(14, 15),
                new Point(20, 8)
        ));

        // then
        assertThat(figure).isInstanceOf(Triangle.class);
    }

    @Test
    void figure_선_생성_test() {
        // given && when
        Figure figure = FigureFactory.getInstance(Arrays.asList(
                new Point(10, 10),
                new Point(14, 15)
        ));

        // then
        assertThat(figure).isInstanceOf(Line.class);
    }
}
