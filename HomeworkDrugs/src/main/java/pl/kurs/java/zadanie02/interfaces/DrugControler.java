package pl.kurs.java.zadanie02.interfaces;

import pl.kurs.java.zadanie02.model.Check;

public interface DrugControler {
    boolean quality = true;

    default void checkDrug(boolean check) {
        check = (quality) ? true : Check.sa();
    }
}