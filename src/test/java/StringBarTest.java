import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringBarTest {
    @Test
    public void happyHour() {
        Bar bar = new StringBar();
        Assertions.assertFalse(bar.isHappyHour());

        bar.startHappyHour();
        Assertions.assertTrue(bar.isHappyHour());

        bar.endHappyHour();
        Assertions.assertFalse(bar.isHappyHour());
    }
}
