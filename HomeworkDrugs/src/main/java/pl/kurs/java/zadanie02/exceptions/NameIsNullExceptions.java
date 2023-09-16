package pl.kurs.java.zadanie02.exceptions;

public class NameIsNullExceptions extends RuntimeException {
    public NameIsNullExceptions() {
    }

    public NameIsNullExceptions(String message) {
        super(message);
    }
}