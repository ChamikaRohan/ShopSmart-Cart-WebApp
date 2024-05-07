package com.CartManagementSystem.CartManagementSystem;

import com.CartManagementSystem.CartManagementSystem.Cart.CartSummary;

public class OrderReview {
    private CartSummary cartSummary;
    private String shippingOption;
    private String paymentMethod;
    private String shippingAddress;
    private String billingAddress;

    public OrderReview(CartSummary cartSummary, String shippingOption, String paymentMethod, String shippingAddress, String billingAddress) {
        this.cartSummary = cartSummary;
        this.shippingOption = shippingOption;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    // Getters and setters
    public CartSummary getCartSummary() {
        return cartSummary;
    }

    public void setCartSummary(CartSummary cartSummary) {
        this.cartSummary = cartSummary;
    }

    public String getShippingOption() {
        return shippingOption;
    }

    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
}

