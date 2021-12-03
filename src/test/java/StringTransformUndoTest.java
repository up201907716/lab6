import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTransformUndoTest {
    @Test
    public void transformUndo() {
        StringDrink drink = new StringDrink( "AbCd-aBcD");
        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();
        StringReplacer sr = new StringReplacer('A', 'X');
        si.execute(drink);
        cc.execute(drink);
        sr.execute(drink);
        sr.undo(drink);
        Assertions.assertEquals("dCbA-DcBa", drink.getText());
        cc.undo(drink);
        Assertions.assertEquals("DcBa-dCbA", drink.getText());
        si.undo(drink);
        Assertions.assertEquals("AbCd-aBcD", drink.getText());
    }
}
