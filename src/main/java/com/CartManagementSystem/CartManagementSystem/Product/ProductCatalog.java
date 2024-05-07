package com.CartManagementSystem.CartManagementSystem.Product;

import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
