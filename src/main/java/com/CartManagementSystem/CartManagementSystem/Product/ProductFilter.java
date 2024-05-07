package com.CartManagementSystem.CartManagementSystem.Product;

import java.util.List;

public class ProductFilter {
    private List<String> types;
    private List<String> brands;
    private double minPrice;
    private double maxPrice;

    public ProductFilter(List<String> types, List<String> brands, double minPrice, double maxPrice) {
        this.types = types;
        this.brands = brands;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    // Getters and setters
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getBrands() {
        return brands;
    }

    public void setBrands(List<String> brands) {
        this.brands = brands;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
