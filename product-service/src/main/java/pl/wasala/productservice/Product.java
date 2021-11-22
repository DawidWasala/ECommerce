package pl.wasala.productservice;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private String id;
    private String name;
    private Size size;

    public Product() {}

    public Product(String id, String name, Size size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }
}
