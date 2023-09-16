package pl.kurs.java.zadanie02.model;


import java.util.List;

public class Mdma extends Drug {
    public double dlugoscFazy;

    public Mdma(String name, double pricePerGram, List<Ingredients> ingredients) {
        super(name, pricePerGram, ingredients);
    }

    @Override
    public double countPrice() {
        return getPricePerGram() * dlugoscFazy + getIngredients().size();
    }
}
