package coordinates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {
    @Test
    void pointTest() {
        // then
        assertThatThrownBy(() -> {
            // given && when
            new Point(25, 25);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
