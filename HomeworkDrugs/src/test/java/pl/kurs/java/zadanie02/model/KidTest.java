package pl.kurs.java.zadanie02.model;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.java.zadanie02.exceptions.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KidTest {


    private Kid kid;

    private Drug drug1, drug2, drug3, drug4, drug5, drug6;
    private List<Drug> listOfDrugs;


    @Before
    public void init() {
        kid = new Kid("Bartek", "Mankowicz", 12);
        drug1 = new Lsd("Lsd1", 10, Arrays.asList(Ingredients.FLOUR, Ingredients.ACID, Ingredients.GLASS), 10);
        drug2 = new Lsd("Lsd2", 15, Arrays.asList(Ingredients.FLOUR, Ingredients.ACID, Ingredients.GLASS), 10);
        drug3 = new Mdma("Mdma3", 20, Arrays.asList(Ingredients.FLOUR, Ingredients.ACID, Ingredients.GLASS), 5);
        drug4 = new Mdma("Mdma4", 25, Arrays.asList(Ingredients.FLOUR, Ingredients.ACID, Ingredients.GLASS), 5);
        drug5 = new Cocaine("Cocaine1", 30, Arrays.asList(Ingredients.FLOUR, Ingredients.ACID, Ingredients.GLASS));
        drug6 = new Cocaine("Cocaine1", 30, Arrays.asList(Ingredients.FLOUR, Ingredients.ACID, Ingredients.GLASS));

    }

    @Test(expected = TheKidIsAlreadyDeadException.class)
    public void test2() {
        kid.addDrug(drug1);
        kid.addDrug(drug2);
        kid.addDrug(drug3);
        kid.addDrug(drug4);
        kid.addDrug(drug1);
    }

    @Test
    public void test3() {
        kid.addDrug(drug1);
        kid.addDrug(drug2);
    }

    @Test(expected = DrugIsNullException.class)
    public void test4() {
        kid.addDrug(null);
    }

    @Test(expected = NameIsNullExceptions.class)
    public void test5() {
        kid = new Kid(null, "Mankowicz", 12);
    }


    @Test(expected = SurnameIsNullException.class)
    public void test6() {
        kid = new Kid("Bartek", null, 12);
    }

    @Test(expected = AgeMustBeMoreThanZeroException.class)
    public void test7() {
        kid = new Kid("Bartek", "Mankowicz", -1);
    }

}