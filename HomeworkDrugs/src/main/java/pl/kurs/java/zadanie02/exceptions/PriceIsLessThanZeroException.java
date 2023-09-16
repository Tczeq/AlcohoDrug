package pl.kurs.java.zadanie02.exceptions;

public class PriceIsLessThanZeroException extends RuntimeException {
    public PriceIsLessThanZeroException() {
    }

    public PriceIsLessThanZeroException(String message) {
        super(message);
    }
}