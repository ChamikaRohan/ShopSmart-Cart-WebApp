package com.CartManagementSystem.CartManagementSystem.Product;

public class ProductInformation {
    private Product product;
    private String description;
    private String specifications;
    private String images;

    public ProductInformation(Product product, String description, String specifications, String images) {
        this.product = product;
        this.description = description;
        this.specifications = specifications;
        this.images = images;
    }

    // Getters and setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
