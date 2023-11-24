package com.apilifogladif.design_patterns;

public interface Client extends BarObserver{
    void wants(StringDrink drink, StringRecipe recipe, StringBar
            bar);
}
