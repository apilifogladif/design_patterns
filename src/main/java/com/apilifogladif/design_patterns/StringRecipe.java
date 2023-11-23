package com.apilifogladif.design_patterns;

import java.util.List;

public class StringRecipe {
    private final List<StringTransformer> transformers;
    public StringRecipe(List<StringTransformer> transformers_) {
        this.transformers = transformers_;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer transformer : transformers) {
            transformer.execute(drink);
        }
    }
}
