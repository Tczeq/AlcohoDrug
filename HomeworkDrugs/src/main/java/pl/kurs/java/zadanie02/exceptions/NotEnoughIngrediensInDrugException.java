package pl.kurs.java.zadanie02.exceptions;

public class NotEnoughIngrediensInDrugException extends RuntimeException {
    public NotEnoughIngrediensInDrugException() {
    }

    public NotEnoughIngrediensInDrugException(String message) {
        super(message);
    }
}