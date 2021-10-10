package pl.wasala.orderservice;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException() {}

    public OrderNotFoundException(String message) {
        super(message);
    }
}
