import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringReplacerTest {
    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer('A', 'X');
        sr.execute(drink);
        Assertions.assertEquals("XBCDXBCD", drink.getText());
    }
}
