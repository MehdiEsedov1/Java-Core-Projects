package Enum;

public class AppException extends RuntimeException {
    public AppException(Exceptions exceptions) {

        super(exceptions.toString());
    }
}