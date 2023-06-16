package com.arthur.arqsoftware.product.service;

import com.arthur.arqsoftware.product.model.Product;
import com.arthur.arqsoftware.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Product getById(String id) {
        return productRepository.getById(id);
    }

    public Product save(Product product) {
        return this.productRepository.save(product);
    }
}
