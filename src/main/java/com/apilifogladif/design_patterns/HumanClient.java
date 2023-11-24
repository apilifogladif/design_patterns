package com.apilifogladif.design_patterns;

public class HumanClient implements Client {

    @Override
    public void happyHourStarted(Bar bar) {
        bar.startHappyHour();
    }

    @Override
    public void happyHourEnded(Bar bar) {
        bar.endHappyHour();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe_, StringBar bar) {

    }
}
