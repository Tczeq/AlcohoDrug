package pl.kurs.java.zadanie02.model;


import pl.kurs.java.zadanie02.interfaces.DrugControler;

import java.util.List;

public class Mdma extends Drug {
    public double dlugoscFazy;

//    public Mdma(String name, double pricePerGram, List<Ingredients> ingredients) {
//        super(name, pricePerGram, ingredients);
//    }


    public Mdma(String name, double pricePerGram, List<Ingredients> ingredients, DrugControler gualityOfDrug, double dlugoscFazy) {
        super(name, pricePerGram, ingredients, gualityOfDrug);
        this.dlugoscFazy = dlugoscFazy;
    }

    @Override
    public double countPrice() {
        return getPricePerGram() * dlugoscFazy + getIngredients().size();
    }
}
