package pl.kurs.java.zadanie02.model;


public enum Ingredients {
    FLOUR(10), ACID(20), GLASS(0);

    private final int quality;

    Ingredients(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }
}