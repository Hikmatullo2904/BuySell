package com.hikmatullo.uz.service;

import com.hikmatullo.uz.model.Product;
import com.hikmatullo.uz.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    private  List<Product> products = new ArrayList<>();
    private long id = 0;
    {
        products.add(new Product(++id, "Asus rog strix",
                "1tb ssd, 16 azu, core i7 10", 600, "Andijon", "Hikmatullo"));
        products.add(new Product(++id, "Galaxy note 10",
                "512 gb, black, great", 300, "Andijon", "Ali"));
    }

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product) {
        log.info("Saving product {}", product);
        productRepository.save(product);
    }

    public List<Product> getProducts(String title) {
        if(title != null) return productRepository.findByTitle(title);
        List<Product> all = productRepository.findAll();
        all.forEach(System.out::print);
        return all;
    }

    public void delete(long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        Optional<Product> byId = productRepository.findById(id);
        return byId.orElse(null);
    }
}
