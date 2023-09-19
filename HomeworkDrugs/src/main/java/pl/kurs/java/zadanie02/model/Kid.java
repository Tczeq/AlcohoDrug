package pl.kurs.java.zadanie02.model;


import java.util.ArrayList;
import java.util.List;

public class Kid {
    private String name;
    private String surname;
    private int age;

    public List<Drug> kidsDrugs = new ArrayList<>();

    public Kid(String name, String surname, int age) {
        Check.nameNotNull(name);
        Check.surnameNotNull(surname);
        Check.ageNotNegative(age);
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void addDrug(Drug drug) {
        Check.dead(kidsDrugs);
        kidsDrugs.add(drug);
        drug.getKids().add(this);
    }


    public List<Drug> getKidsDrugs() {
        return kidsDrugs;
    }


    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}