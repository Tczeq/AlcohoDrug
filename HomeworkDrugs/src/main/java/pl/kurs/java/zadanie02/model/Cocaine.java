package pl.kurs.java.zadanie02.model;

import java.util.List;

public class Cocaine extends Drug {
    public Cocaine(String name, double pricePerGram, List<Ingredients> ingredients) {
        super(name, pricePerGram, ingredients);
    }

    @Override
    public double countPrice() {
        return getPricePerGram() * getIngredients().size() / 2;
    }
}