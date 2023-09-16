package pl.kurs.java.zadanie02.exceptions;

public class TheKidIsAlreadyDeadException extends RuntimeException {
    public TheKidIsAlreadyDeadException() {
    }

    public TheKidIsAlreadyDeadException(String message) {
        super(message);
    }
}