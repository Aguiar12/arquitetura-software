package com.arthur.arqsoftware.product.repository;

import com.arthur.arqsoftware.product.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProductRepository {
    private Map<String, Product> productsDatabase = new ConcurrentHashMap<>();

    public List<Product> getAll() {
        return new ArrayList<>(productsDatabase.values());
    }

    public Product getById(String id) {
        return productsDatabase.get(id);
    }

    public Product save(Product product) {
        var productWithId = product.withId(UUID.randomUUID().toString());
        return this.productsDatabase.put(product.getId(), product);
    }
}
