package pl.kurs.java.zadanie02.model;


import pl.kurs.java.zadanie02.interfaces.DrugControler;

import java.util.List;

public class Mdma extends Drug {
    public double dlugoscFazy;

    public Mdma(String name, double pricePerGram, List<Ingredients> ingredients, double dlugoscFazy) {
        super(name, pricePerGram, ingredients);
        this.dlugoscFazy = dlugoscFazy;
    }

    @Override
    public double countPrice() {
        return getPricePerGram() * dlugoscFazy + getIngredients().size();
    }
}
