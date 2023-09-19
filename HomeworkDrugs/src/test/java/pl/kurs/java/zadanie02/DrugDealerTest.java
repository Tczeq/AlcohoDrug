package pl.kurs.java.zadanie02;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import pl.kurs.java.zadanie02.exceptions.DrugIsNullException;
import pl.kurs.java.zadanie02.exceptions.KidISNullException;
import pl.kurs.java.zadanie02.model.Drug;
import pl.kurs.java.zadanie02.model.Kid;


public class DrugDealerTest {

    private Kid kid;
    private Drug drug;
    @Before
    public void init(){
        kid = new Kid("Janek", "Kowalski", 15);
        drug = Mockito.mock(Drug.class);
    }


    @Test(expected = DrugIsNullException.class)
    public void shouldThorwDrugIsNullException(){
        DrugDealer drugDealerTest = new DrugDealer("Jack", "1111111", kid, null);
    }
    @Test(expected = KidISNullException.class)
    public void shouldThorwKidIsNullException(){
        DrugDealer drugDealerTest = new DrugDealer("Jack", "1111111", null, drug);
    }

}