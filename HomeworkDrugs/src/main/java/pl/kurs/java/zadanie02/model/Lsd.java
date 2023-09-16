package pl.kurs.java.zadanie02.model;

import java.util.List;

//        Narkotyki które wyrozniamy to LSD (ilosc smoków wawelskich ktore sie widzi po zazyciu),
//        MDMA(długosc fazy) oraz mefedron (rodzaj miny jaka sie robi po przyjeciu). Cena narkotyku jest zalezna od
//        jego rodzaju oraz ilosci skladnikow jakie sa uzyte do jego produkcji, chcemy moc obliczyc ceny narkotykow.
//
public class Lsd extends Drug {
    private final int iloscSmokowWawelskich;

    public Lsd(String name, double pricePerGram, List<Ingredients> ingredients, int iloscSmokowWawelskich) {
        super(name, pricePerGram, ingredients);
        this.iloscSmokowWawelskich = iloscSmokowWawelskich;
    }

    @Override
    public double countPrice() {
        return getPricePerGram() * 10;
    }
}
