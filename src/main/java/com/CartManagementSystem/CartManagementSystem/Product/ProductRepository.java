package com.CartManagementSystem.CartManagementSystem.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    // Define additional methods if needed
}
