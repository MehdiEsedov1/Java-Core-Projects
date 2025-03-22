package main.java.org.example;

public class AppException extends RuntimeException {
    public AppException(Exceptions e) {
        super(e.toString());
    }
}