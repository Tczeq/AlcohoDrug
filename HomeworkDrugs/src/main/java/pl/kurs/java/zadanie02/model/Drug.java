package pl.kurs.java.zadanie02.model;

import lombok.Getter;
import pl.kurs.java.zadanie02.exceptions.BadQualityException;
import pl.kurs.java.zadanie02.interfaces.DrugControler;

import java.util.ArrayList;
import java.util.List;


@Getter
public abstract class Drug {
    private final String name;

    private final double pricePerGram;

    private final List<Ingredients> ingredients;

    public List<Kid> kids = new ArrayList<>();

    public Drug(String name, double pricePerGram, List<Ingredients> ingredients) {
        Check.listSizeNotBelow3(ingredients);
        Check.nameNotNull(name);
        Check.pricePerGramNotNegative(pricePerGram);
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.ingredients = ingredients;
    }

    public abstract double countPrice();

    public String getName() {
        return name;
    }

    public double getPricePerGram() {
        return pricePerGram;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public List<Kid> getKids() {
        return kids;
    }

    public void setKids(List<Kid> kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", pricePerGram=" + pricePerGram +
                ", ingredients=" + ingredients +
                '}';
    }

}