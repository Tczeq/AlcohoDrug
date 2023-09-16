package pl.kurs.java.zadanie01;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)

public class Beer {
    @ToString.Include
    private final String marka;
    @ToString.Include
    private double cena;
    private String jakoscPiany;
    private List<IngredientsForAlco> listaSkladnikow;
    private double zawartoscAlkoholu;
    private List<Alcoholic> alcoholicList = new ArrayList<>();

    @Builder
    public Beer(String marka, double cena, String jakoscPiany, List<IngredientsForAlco> listaSkladnikow, double zawartoscAlkoholu) {
        this.marka = marka;
        this.cena = cena;
        this.jakoscPiany = jakoscPiany;
        this.listaSkladnikow = listaSkladnikow;
        this.zawartoscAlkoholu = zawartoscAlkoholu;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return Double.compare(beer.cena, cena) == 0 && marka.equals(beer.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, cena);
    }
}