package pl.kurs.java.zadanie02.model;

import pl.kurs.java.zadanie02.interfaces.DrugControler;

import java.util.List;

public class Cocaine extends Drug {
//    public Cocaine(String name, double pricePerGram, List<Ingredients> ingredients) {
//        super(name, pricePerGram, ingredients);
//    }


    public Cocaine(String name, double pricePerGram, List<Ingredients> ingredients, DrugControler gualityOfDrug) {
        super(name, pricePerGram, ingredients, gualityOfDrug);
    }

    @Override
    public double countPrice() {
        return getPricePerGram() * getIngredients().size() / 2;
    }
}