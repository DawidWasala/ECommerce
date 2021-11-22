package pl.wasala.orderservice;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Order {

    @Id
    private String id;
    private LocalDateTime orderDate;
    private List<Product>

    public Order() {}

    public Order(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
