public class StringReplacer implements StringTransformer{
    private char oldC;
    private char newC;

    public StringReplacer(char oldC, char newC){
        this.oldC = oldC;
        this.newC = newC;
    }
    @Override
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(oldC, newC));
    }

    @Override
    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(newC, oldC));
    }
}
