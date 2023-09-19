package pl.kurs.java.zadanie02.interfaces;

import pl.kurs.java.zadanie02.exceptions.BadQualityException;
import pl.kurs.java.zadanie02.model.Drug;

public interface DrugControler {
    void checkDrug(Drug drug) throws BadQualityException;
}