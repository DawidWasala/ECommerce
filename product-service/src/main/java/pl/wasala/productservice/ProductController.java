package pl.wasala.productservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("products")
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.findAllProducts();
    }

    @GetMapping(value = "/{productId}")
    public Product getProductById(@PathVariable String productId) {
        return productService.findProductById(productId);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable String productId){
        productService.deleteProduct(productId);
    }

//    @PutMapping("/{productId}")
//    public Product updateProduct(@RequestBody Product product){
//        return productService.updateProduct(product);
//    }

//    @PatchMapping("/{orderId}")
//    public Order updateOrder(@RequestBody Map<String, String> updates, @PathVariable Long orderId){
//        return orderService.updateOrder(updates, orderId);
//    }

}
