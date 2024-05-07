package com.CartManagementSystem.CartManagementSystem;

import java.util.List;

public class ShippingOptions {
    private List<String> options;

    public ShippingOptions(List<String> options) {
        this.options = options;
    }

    // Getters and setters
    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}

