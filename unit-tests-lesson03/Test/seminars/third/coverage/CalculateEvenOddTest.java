package seminars.third.coverage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateEvenOddTest {
    @Test
    void checkOdd() {
        CalculateEvenOdd c = new CalculateEvenOdd();
        assertThat(c.evenOddNumber(1)).isEqualTo(false);
        assertThat(c.evenOddNumber(1347)).isEqualTo(false);
    }

    @Test
    void checkEven() {
        CalculateEvenOdd c = new CalculateEvenOdd();
        assertThat(c.evenOddNumber(2)).isEqualTo(true);
        assertThat(c.evenOddNumber(3424)).isEqualTo(true);
    }

    @Test
    void checkZero() {
        CalculateEvenOdd c = new CalculateEvenOdd();
        assertThat(c.evenOddNumber(0)).isEqualTo(true);
    }

    @Test
    void checkOddNegative() {
        CalculateEvenOdd c = new CalculateEvenOdd();
        assertThat(c.evenOddNumber(-1)).isEqualTo(false);
        assertThat(c.evenOddNumber(-1347)).isEqualTo(false);
    }

    @Test
    void checkEvenNegative() {
        CalculateEvenOdd c = new CalculateEvenOdd();
        assertThat(c.evenOddNumber(-2)).isEqualTo(true);
        assertThat(c.evenOddNumber(-3424)).isEqualTo(true);
    }
}


