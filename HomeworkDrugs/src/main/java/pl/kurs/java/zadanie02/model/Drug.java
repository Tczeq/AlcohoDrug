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

    private DrugControler qualityPerfect;

    private int quality = 100;
    public List<Kid> kids = new ArrayList<>();


    public Drug(String name, double pricePerGram, List<Ingredients> ingredients, DrugControler gualityOfDrug) {
        Check.listSizeNotBelow3(ingredients);
        Check.nameNotNull(name);
        Check.pricePerGramNotNegative(pricePerGram);
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.ingredients = ingredients;
        setQualityPerfect(gualityOfDrug);
        checkQuality();
    }


    public void setQualityPerfect(DrugControler gualityOfDrug) {

        gualityOfDrug.checkDrug(this);
        this.qualityPerfect = gualityOfDrug;

//
//        if (gualityOfDrug.checkDrug(this)) {
//            this.qualityPerfect = gualityOfDrug;
//        } else {
//            throw new BadQualityException("Quality of the drug is not enough");
//        }
    }
    public static DrugControler getDefaultDrugControler() {
        return drug -> {
            if (drug.getIngredients().size() >= 5) {
                throw new BadQualityException("Too many ingredients");
            }
        };
    }



    public void checkQuality() {
        if(this.qualityPerfect != null) {
            this.qualityPerfect.checkDrug(this);
        }

        List<Ingredients> schowek = new ArrayList<>(ingredients);

        for(Ingredients element : schowek) {
            int value = element.getQuality();
            quality -= value;
        }
        if(quality > 70) {
            System.out.println("dobrze");
            System.out.println(quality);
        } else {
            System.out.println(quality);
            throw new RuntimeException("źle");
        }
    }
    public abstract double countPrice();

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", pricePerGram=" + pricePerGram +
                ", ingredients=" + ingredients +
                '}';
    }

}