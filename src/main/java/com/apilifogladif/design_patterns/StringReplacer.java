package com.apilifogladif.design_patterns;

public class StringReplacer implements StringTransformer {
    char newChar;
    char oldChar;
    public StringReplacer(char a, char x) {
        this.oldChar = a;
        this.newChar = x;
    }

    @Override
    public void execute(StringDrink drink) {
        String txt = drink.getText();
        txt = txt.replace(oldChar, newChar);
        drink.setText(txt);
    }

    @Override
    public void undo(StringDrink drink) {
        String txt = drink.getText();
        txt = txt.replace(newChar, oldChar);
        drink.setText(txt);
    }
}
