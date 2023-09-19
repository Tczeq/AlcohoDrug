package pl.kurs.java.zadanie02.model;


import pl.kurs.java.zadanie02.exceptions.*;

import java.util.List;

public class Check {
//    public static void dead(List<DrugDealer> drugs) {
//        if (drugs.size() >= 5) {
//            throw new TheKidIsAlreadyDeadException("Kid is die.");
//        }
//    }

    public static void listSizeNotBelow3(List<Ingredients> ingredients) {
        if (ingredients.size() < 3) {
            throw new NotEnoughIngrediensInDrugException("ingrediens is less than 3");
        }
    }

    public static void nameNotNull(String name) {
        if (name == null) {
            throw new NameIsNullExceptions("Name can't be null");
        }
    }

    public static void pricePerGramNotNegative(double pricePerGram) {
        if (pricePerGram < 0) {
            throw new PriceIsLessThanZeroException("Price can't less than zero");
        }
    }


    public static void surnameNotNull(String surname) {
        if (surname == null) {
            throw new NameIsNullExceptions("Name is null.");
        }
    }

    public static void ageNotNegative(int age) {
        if(age < 0){
            throw new AgeMustBeMoreThanZeroException("Age is less than zero");
        }
    }


    public static void kidNotNull(Kid kid) {
        if (kid == null) {
            throw new KidISNullException("drug is null");
        }
    }

    public static void drugNotNull(Drug drug) {
        if (drug == null) {
            throw new DrugIsNullException("drug is null");
        }
    }

}