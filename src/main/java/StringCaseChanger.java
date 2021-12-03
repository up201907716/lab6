public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink){
        String changed = "";
        String aux = drink.getText();
        for (int i = 0; i < aux.length(); i++){
            if (Character.isLowerCase(aux.charAt(i)))
                changed = changed + Character.toUpperCase(aux.charAt(i));
            else
                changed = changed + Character.toLowerCase(aux.charAt(i));
        }
        drink.setText(changed);
    }
}
