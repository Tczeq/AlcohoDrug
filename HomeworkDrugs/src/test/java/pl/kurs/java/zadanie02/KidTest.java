package pl.kurs.java.zadanie02;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.java.zadanie02.exceptions.AgeMustBeMoreThanZeroException;
import pl.kurs.java.zadanie02.exceptions.NameIsNullExceptions;
import pl.kurs.java.zadanie02.exceptions.SurnameIsNullException;
import pl.kurs.java.zadanie02.exceptions.TheKidIsAlreadyDeadException;
import pl.kurs.java.zadanie02.model.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KidTest {

    private Kid kid;
//    private DrugDealer dd1;
//    private DrugDealer dd2;
//    private List<DrugDealer> drugList;
    private Drug lsd;
    private Drug cocaine;
    private Drug mdma;

    @Before
    public void init() {
        kid = new Kid("Lukasz", "Motyka", 15);
//        lsd = new Lsd("LSD", 34.12, List.of(Ingredients.ACID, Ingredients.ACID, Ingredients.FLOUR), 5);
//        cocaine = new Cocaine("Cocaine", 300, List.of(Ingredients.FLOUR, Ingredients.GLASS, Ingredients.ACID));
//        mdma = new Mdma("Mdma", 30, List.of(Ingredients.FLOUR, Ingredients.FLOUR, Ingredients.GLASS));
//
//        dd1 = new DrugDealer("Jack", "1111111", kid, lsd);
//        dd2 = new DrugDealer("Jack", "1234", kid, cocaine);

//        drugList = List.of(dd1, dd2);
    }
//
//    @Test
//    public void ShouldReturnTrueIfDrugListSizeIsTwo() {
//        List<DrugDealer> drugListTest = Arrays.asList(dd1, dd2);
//        assertEquals(drugListTest, drugList);
//    }
//
//    @Test(expected = TheKidIsAlreadyDeadException.class)
//    public void ShouldReturnTrueIfKidTakeMoreThanFiveDrugs() {
//        List<DrugDealer> drugListTest = Arrays.asList(dd1, dd2, dd2, dd2, dd1);
//        Check.dead(drugListTest);


    @Test(expected = NameIsNullExceptions.class)
    public void shouldReturnNameIsNullExceptionsWhenKidsNameIsNull() {
        Kid nullNameKidException = new Kid(null, "surname", 19);
    }

    @Test(expected = SurnameIsNullException.class)
    public void shouldReturnSurnameIsNullExceptionsWhenKidsSurnameIsNull() {
        Kid nullSurnameKidException = new Kid("Aleksander", null, 19);
    }

    @Test(expected = AgeMustBeMoreThanZeroException.class)
    public void shouldReturnAgeMustBeMoreThanZeroExceptionWhenKidsAgeIsNull() {
        Kid nullAgeKidException = new Kid("Aleksander", "The Great", -12);
    }

}
