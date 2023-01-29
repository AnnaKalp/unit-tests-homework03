package seminars.third.coverage;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CalculateIntervalTest {
    @Test
    void checkIn() {
        CalculateInterval c = new CalculateInterval(25,100);
        assertThat(c.numberInInterval(50)).isEqualTo(true);
    }

    @Test
    void checkOut() {
        CalculateInterval c = new CalculateInterval(25, 100);
        assertThat(c.numberInInterval(1)).isEqualTo(false);
    }

    @Test
    void checkBorderIn() {
        CalculateInterval c = new CalculateInterval(25, 100);
        assertThat(c.numberInInterval(26)).isEqualTo(true);
        assertThat(c.numberInInterval(99)).isEqualTo(true);
    }

    @Test
    void checkBorderOut() {
        CalculateInterval c = new CalculateInterval(25, 100);
        assertThat(c.numberInInterval(25)).isEqualTo(false);
        assertThat(c.numberInInterval(100)).isEqualTo(false);
    }

}

