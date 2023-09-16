package pl.kurs.java.zadanie01;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlcoholicTest {
    private Alcoholic alcoholic;
    private Beer beer;
    private Beer beer1;

    @Before
    public void init() {
        beer = Beer.builder()
                .marka("Warka")
                .cena(10.0)
                .jakoscPiany("Dobra")
                .listaSkladnikow(List.of(IngredientsForAlco.GAZ, IngredientsForAlco.CHMIEL))
                .zawartoscAlkoholu(5.0)
                .build();

        beer1 = Beer.builder()
                .marka("Marka2")
                .cena(15.0)
                .jakoscPiany("Zła")
                .listaSkladnikow(List.of(IngredientsForAlco.GAZ, IngredientsForAlco.CHMIEL))
                .zawartoscAlkoholu(6.0)
                .build();

        alcoholic = Alcoholic.builder()
                .imie("Jan")
                .nazwisko("Kowalski")
                .build();
        alcoholic.addBeer(beer);

    }

    @Test
    public void shouldReturnTrueIfAlkoholikInitializationIsCorrect() {
        assertNotNull(alcoholic);

        assertEquals("Jan", alcoholic.getImie());
        assertEquals("Kowalski", alcoholic.getNazwisko());
        assertEquals(1, alcoholic.getListaPiw().size());
    }

    @Test
    public void shouldReturnTrueIfBeerInitializationIsCorrect() {
        assertNotNull(beer);
        assertEquals("Warka", beer.getMarka());
        assertEquals(10.0, beer.getCena(), 0.001);
    }

    @Test
    public void shouldReturnTrueIfBeerWasAddedToAlkoholikCorrect() {
        alcoholic.addBeer(beer1);
        assertEquals(2, alcoholic.getListaPiw().size());
        assertTrue(alcoholic.getListaPiw().contains(beer1));
    }

    @Test
    public void shouldReturnTrueIfEqualsForBeer() {
        Beer beer3 = Beer.builder()
                .marka("Warka")
                .cena(10.0)
                .build();

        assertEquals(beer, beer3);
        assertNotEquals(beer, beer1);
    }
}