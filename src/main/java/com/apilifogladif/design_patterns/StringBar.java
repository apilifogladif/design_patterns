package com.apilifogladif.design_patterns;

public class StringBar extends Bar{
    private boolean HappyHour = false;
    @Override
    public boolean isHappyHour() {
        return HappyHour;
    }

    @Override
    public void startHappyHour() {
        HappyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        HappyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
