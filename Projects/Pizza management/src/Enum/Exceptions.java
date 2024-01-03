package Enum;

public enum Exceptions {
    INVALID_OPTION("Option not found");

    private final String message;

    Exceptions(String message) {
        this.message = message;
    }
}