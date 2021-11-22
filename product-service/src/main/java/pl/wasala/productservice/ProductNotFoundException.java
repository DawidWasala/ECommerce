package pl.wasala.productservice;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException() {}

    public ProductNotFoundException(String message) {
        super(message);
    }
}
