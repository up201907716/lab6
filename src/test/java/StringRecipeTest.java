import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringRecipeTest {
    @Test
    public void stringRecipe() {
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();
        StringReplacer sr = new StringReplacer('A', 'X');
        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);
        transformers.add(sr);
        StringRecipe recipe = new StringRecipe(transformers);
        recipe.mix(drink);
        Assertions.assertEquals("dCbX-DcBa", drink.getText());
    }
}
