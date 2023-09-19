package pl.kurs.java.zadanie02;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import pl.kurs.java.zadanie02.exceptions.BadQualityException;
import pl.kurs.java.zadanie02.interfaces.DrugControler;
import pl.kurs.java.zadanie02.interfaces.IDealController;
import pl.kurs.java.zadanie02.interfaces.IDrugQuality;
import pl.kurs.java.zadanie02.service.DrugService;

public class DrugServiceTest {

    private DrugService drugService;
    @Mock
    private DrugControler drugControler;
    @Mock
    private IDrugQuality checkDrug;
    @Mock
    private IDealController dealController;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
        drugService = new DrugService(drugControler, dealController, checkDrug);
    }

    @Test(expected = BadQualityException.class)
    public void shouldNotSellDrug() {
        Mockito.when(checkDrug.quality()).thenReturn(69.0);
        drugService.checkQuality();
    }

    @Test
    public void shouldSellDrug() {
        Mockito.when(checkDrug.quality()).thenReturn(71.0);
        drugService.checkQuality();
        Mockito.verify(drugControler).checkDrug();
    }

}