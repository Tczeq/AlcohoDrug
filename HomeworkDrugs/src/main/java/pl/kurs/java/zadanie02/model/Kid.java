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
        Check.drugNotNull(drug);
        kidsDrugs.add(drug);
        drug.getKids().add(this);
        Check.dead(this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Drug> getKidsDrugs() {
        return kidsDrugs;
    }

    public void setKidsDrugs(List<Drug> kidsDrugs) {
        this.kidsDrugs = kidsDrugs;
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