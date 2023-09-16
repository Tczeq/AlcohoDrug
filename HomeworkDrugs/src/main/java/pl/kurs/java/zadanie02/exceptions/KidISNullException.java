package pl.kurs.java.zadanie02.exceptions;

public class KidISNullException extends RuntimeException{
    public KidISNullException() {
    }

    public KidISNullException(String message) {
        super(message);
    }
}