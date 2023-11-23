package com.apilifogladif.design_patterns;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String txt = drink.getText();
        StringBuilder txtFinal = new StringBuilder(txt);
        drink.setText(txtFinal.reverse().toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
