package pl.kurs.java.zadanie02.model;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.java.zadanie02.exceptions.NameIsNullExceptions;
import pl.kurs.java.zadanie02.exceptions.NotEnoughIngrediensInDrugException;

import java.util.List;

import static org.junit.Assert.*;

public class DrugTest {
    private Drug drug;



    @Test(expected = NotEnoughIngrediensInDrugException.class)
    public void shouldReturnNotEnoughIngrediensInDrugException() {
        drug = new Lsd("lsd", 3.4, List.of(Ingredients.FLOUR, Ingredients.SODA), 2);
    }

    @Test(expected = NameIsNullExceptions.class)
    public void shouldReturnNameIsNullExceptions() {
        drug = new Lsd(null, 3.4, List.of(Ingredients.FLOUR, Ingredients.SODA, Ingredients.GLASS), 2);
    }
}