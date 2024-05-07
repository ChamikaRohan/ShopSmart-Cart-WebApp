package com.CartManagementSystem.CartManagementSystem.Payment_and_pricing;

import java.util.List;

public class PaymentOptions {
    private List<String> methods;

    public PaymentOptions(List<String> methods) {
        this.methods = methods;
    }

    // Getters and setters
    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }
}
