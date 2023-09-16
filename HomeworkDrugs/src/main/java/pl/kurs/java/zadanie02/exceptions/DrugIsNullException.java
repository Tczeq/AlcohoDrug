package pl.kurs.java.zadanie02.exceptions;

public class DrugIsNullException extends RuntimeException {
    public DrugIsNullException() {
    }

    public DrugIsNullException(String message) {
        super(message);
    }
}