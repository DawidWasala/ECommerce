package pl.wasala.productservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository orderRepository) {
        this.productRepository = orderRepository;
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Product findProductById(String productId){
        return productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(String productId){
        productRepository.deleteById(productId);
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }
}
