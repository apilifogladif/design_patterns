package com.apilifogladif.design_patterns;

public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String txt = drink.getText();
        StringBuilder result = new StringBuilder();
        for (char c : txt.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            }
            else {
                result.append(c);
            }
        }
        drink.setText(result.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
