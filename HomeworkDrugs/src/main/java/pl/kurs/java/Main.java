package pl.kurs.java;

import pl.kurs.java.zadanie02.interfaces.DrugControler;
import pl.kurs.java.zadanie02.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            Drug d1 = new Lsd("mdma", 4.21, List.of(Ingredients.ACID, Ingredients.FLOUR, Ingredients.GLASS), 5);
            Drug d2 = new Cocaine("mefedron", 300, List.of(Ingredients.ACID, Ingredients.FLOUR, Ingredients.GLASS));
            Drug d3 = new Lsd("kokaina", 6.21, List.of(Ingredients.ACID, Ingredients.FLOUR, Ingredients.GLASS), 2);

            Kid k1 = new Kid("kid1", "kid1", 22);
            Kid k2 = new Kid("kid2", "kid2", 22);
            Kid k3 = new Kid("kid3", "kid3", 22);

            DrugDealer dealer = new DrugDealer("Json", "12345", k1, d1);
            DrugDealer dealer1 = new DrugDealer("XX", "1231241", k1, d2);
            DrugDealer dealer2 = new DrugDealer("XX", "1231241", k1, d2);
            DrugDealer dealer3 = new DrugDealer("XX", "1231241", k1, d2);
//            DrugDealer dealer4 = new DrugDealer("XX", "1231241", k1, d2);
//            DrugDealer dealer5 = new DrugDealer("XX", "1231241", k1, d2);

            System.out.println("kid1 chech drugs: " + k1.getDrugs().size());
            System.out.println(d1.getDrugs());
            System.out.println(d2.getDrugs());
            System.out.println(d1.countPrice());
            System.out.println(d2.countPrice());


            List<Ingredients> ingredientsList = new ArrayList<>();
            ingredientsList.add(Ingredients.FLOUR);
            ingredientsList.add(Ingredients.ACID);
//            ingredientsList.add(Ingredients.GLASS);


            d1.checkQuality();

        }
}
