package pl.wasala.orderservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderService.findAllOrders();
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId){
        return orderService.findOrderById(orderId);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable Long orderId){
        orderService.deleteOrder(orderId);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

//    @PatchMapping("/{orderId}")
//    public Order updateOrder(@RequestBody Map<String, String> updates, @PathVariable Long orderId){
//        return orderService.updateOrder(updates, orderId);
//    }

}
