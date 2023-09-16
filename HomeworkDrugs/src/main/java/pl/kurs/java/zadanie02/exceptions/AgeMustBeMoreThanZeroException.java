package pl.kurs.java.zadanie02.exceptions;

public class AgeMustBeMoreThanZeroException extends RuntimeException {
    public AgeMustBeMoreThanZeroException() {
    }

    public AgeMustBeMoreThanZeroException(String message) {
        super(message);
    }
}
