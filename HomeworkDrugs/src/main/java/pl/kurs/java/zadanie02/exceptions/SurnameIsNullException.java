package pl.kurs.java.zadanie02.exceptions;

public class SurnameIsNullException extends RuntimeException{
    public SurnameIsNullException() {
    }

    public SurnameIsNullException(String message) {
        super(message);
    }
}