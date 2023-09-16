package pl.kurs.java.zadanie02.model;


import pl.kurs.java.zadanie02.exceptions.DrugIsNullException;
import pl.kurs.java.zadanie02.exceptions.KidISNullException;

public class DrugDealer {
    private final String nick;
    private final String telephoneNumer;
    private final Kid kid;
    private final Drug drug;
    private Check check;

    public DrugDealer(String nick, String telephoneNumer, Kid kid, Drug drug) {
        if (kid == null) {
            throw new KidISNullException("drug is null");
        }
        if (drug == null) {
            throw new DrugIsNullException("drug is null");
        }
        this.nick = nick;
        this.telephoneNumer = telephoneNumer;
        this.kid = kid;
        this.drug = drug;

        kid.getDrugs().add(this);
        drug.getDrugs().add(this);
    }

    public Drug getDrug() {
        return drug;
    }


    @Override
    public String toString() {
        return " kid=" + kid +
                ", drug=" + drug;
    }
}