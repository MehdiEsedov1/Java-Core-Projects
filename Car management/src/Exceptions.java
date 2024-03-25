import java.time.LocalDateTime;

public enum Exceptions {
    CAR_NOT_FOUND("Car not found"),
    CUSTOMER_NOT_FOUND("Customer not found"),
    INVALID_OPTION("Option not found");

    private final String message;
    private final LocalDateTime timestamp = LocalDateTime.now().withNano(0);

    Exceptions(String message) {
        this.message = message;
    }
}

