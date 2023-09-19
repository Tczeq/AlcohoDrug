package pl.kurs.java.zadanie02.model;

import pl.kurs.java.zadanie02.interfaces.DrugControler;

import java.util.List;

//
public class Lsd extends Drug {
    private final int iloscSmokowWawelskich;




    public Lsd(String name, double pricePerGram, List<Ingredients> ingredients, DrugControler gualityOfDrug, int iloscSmokowWawelskich) {
        super(name, pricePerGram, ingredients, gualityOfDrug);
        this.iloscSmokowWawelskich = iloscSmokowWawelskich;
    }

    @Override
    public double countPrice() {
        return getPricePerGram() * 10;
    }
}
