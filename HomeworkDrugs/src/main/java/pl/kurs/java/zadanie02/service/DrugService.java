package pl.kurs.java.zadanie02.service;

import pl.kurs.java.zadanie02.exceptions.BadQualityException;
import pl.kurs.java.zadanie02.interfaces.DrugControler;
import pl.kurs.java.zadanie02.model.Drug;
import pl.kurs.java.zadanie02.model.Ingredients;

import java.util.ArrayList;
import java.util.List;

public class DrugService {
    private DrugControler qualityPerfect;

    private Drug druug;

    private Drug drug;

    public DrugService(Drug drug) {
        this.drug = drug;
    }

//    public void checkDrug() {
//        double drugg = drug.getQuality();
//        List<Ingredients> schowek = new ArrayList<>(drug.getIngredients());
//        for (Ingredients element : schowek) {
//            int value = element.getQuality();
//            drugg -= value;
//        }
//        drug.setQualityPerfect();
//        if (drug.getQuality() > 70) {
//            System.out.println("Quality perfect");
//        } else {
//            throw new BadQualityException("Bad quality");
//        }
//    }
    public void checkQuality() {
        drug.setQualityPerfect(qualityPerfect);

        int quality = drug.getQuality();
        List<Ingredients> schowek = new ArrayList<>(drug.getIngredients());

        for(Ingredients element : schowek) {
            int value = element.getQuality();
            quality -= value;
        }
        if(drug.getQuality() > 70) {
            System.out.println("dobrze");
            System.out.println(drug.getQuality());
        } else {
            System.out.println(drug.getQuality());
            throw new RuntimeException("źle");
        }
    }

}