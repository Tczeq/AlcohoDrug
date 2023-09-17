package pl.kurs.java.zadanie02.model;


import pl.kurs.java.zadanie02.exceptions.TheKidIsAlreadyDeadException;

import java.util.List;

public class Check {
    public static void dead(List<DrugDealer> drugs) {
        if (drugs.size() >= 5) {
            throw new TheKidIsAlreadyDeadException("Kid is die.");
        }
    }

    public static boolean sa() {
        throw new RuntimeException("DSa");
    }
}