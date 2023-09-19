package pl.kurs.java.zadanie02.service;

import pl.kurs.java.zadanie02.exceptions.BadQualityException;
import pl.kurs.java.zadanie02.model.Drug;
import pl.kurs.java.zadanie02.model.Ingredients;

import java.util.ArrayList;
import java.util.List;

public class DrugService {

    private Drug drug;

//    public DrugService(Drug drug) {
//        this.drug = drug;
//    }
//
//    public void checkDrug() {
//        double drugg = drug.getQuality();
//        List<Ingredients> schowek = new ArrayList<>(drug.getIngredients());
//        for (Ingredients element : schowek) {
//            int value = element.getQuality();
//            drugg -= value;
//        }
//        if (drug.getQuality() > 70) {
//            System.out.println("Quality perfect");
//        } else {
//            throw new BadQualityException("Bad quality");
//        }
//    }

}