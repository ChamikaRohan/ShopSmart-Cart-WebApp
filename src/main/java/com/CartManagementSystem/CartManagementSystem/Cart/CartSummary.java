package com.CartManagementSystem.CartManagementSystem.Cart;

import java.util.List;

public class CartSummary {
    private List<CartItem> items;
    private double totalCost;

    public CartSummary(List<CartItem> items, double totalCost) {
        this.items = items;
        this.totalCost = totalCost;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
