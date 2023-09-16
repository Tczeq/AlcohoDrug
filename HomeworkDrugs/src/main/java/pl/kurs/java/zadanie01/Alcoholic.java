package pl.kurs.java.zadanie01;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)

public class Alcoholic {
    @ToString.Include
    private String imie;
    @ToString.Include
    private String nazwisko;
    //wiele do wiele piwo moze miec wielu alkoholikow alkoholik moze miec wiele piw.
    private List<Beer> listaPiw = new ArrayList<>();

    @Builder
    public Alcoholic(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void addBeer(Beer beer) {
        listaPiw.add(beer);
        beer.getAlcoholicList().add(this);
    }
}
