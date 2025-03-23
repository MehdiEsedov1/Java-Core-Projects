package main.java.org.example;

public enum Exceptions {
    CAR_NOT_FOUND("Car not found"),
    INVALID_OPTION("Option not found");

    private final String message;

    Exceptions(String message) {
        this.message = message;
    }

    String getMessage() {
        return this.message;
    }
}