package pl.kurs.java.zadanie02;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import pl.kurs.java.zadanie02.exceptions.BadQualityException;
import pl.kurs.java.zadanie02.exceptions.NotEnoughIngrediensInDrugException;
import pl.kurs.java.zadanie02.model.Drug;
import pl.kurs.java.zadanie02.model.Ingredients;
import pl.kurs.java.zadanie02.service.DrugService;

import java.util.Arrays;

import static org.mockito.Mockito.*;

public class DrugServiceTest {

    private DrugService drugService;
    private Drug drug;

    @Before
    public void init() {
        drug = Mockito.mock(Drug.class);
        drugService = new DrugService(drug);
    }

    @Test(expected = NotEnoughIngrediensInDrugException.class)
    public void checkExceptions() {
        when(drug.getIngredients()).thenReturn(Arrays.asList(Ingredients.FLOUR, Ingredients.ACID));
    }

    @Test
    public void testCheckDrug_goodQuality() {
        when(drug.getQuality()).thenReturn(80);
        when(drug.getIngredients()).thenReturn(Arrays.asList(Ingredients.FLOUR, Ingredients.ACID));

        drugService.checkDrug();
    }

    @Test(expected = BadQualityException.class)
    public void testCheckDrug_badQuality() {
        when(drug.getQuality()).thenReturn(60);
        when(drug.getIngredients()).thenReturn(Arrays.asList(Ingredients.FLOUR, Ingredients.ACID));

        drugService.checkDrug();
    }
}