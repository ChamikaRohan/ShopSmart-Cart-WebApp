package com.CartManagementSystem.CartManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class DiscountsAndPromotions {
    private Map<String, Double> discountCodes;
    private boolean flashSalesActive;
    private String promotionDetails;

    public DiscountsAndPromotions() {
        this.discountCodes = new HashMap<>();
        this.flashSalesActive = false;
        this.promotionDetails = "";
    }

    // Methods to manage discount codes
    public void addDiscountCode(String code, double discountPercentage) {
        discountCodes.put(code, discountPercentage);
    }

    public void removeDiscountCode(String code) {
        discountCodes.remove(code);
    }

    // Getters and setters
    public Map<String, Double> getDiscountCodes() {
        return discountCodes;
    }

    public void setDiscountCodes(Map<String, Double> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public boolean isFlashSalesActive() {
        return flashSalesActive;
    }

    public void setFlashSalesActive(boolean flashSalesActive) {
        this.flashSalesActive = flashSalesActive;
    }

    public String getPromotionDetails() {
        return promotionDetails;
    }

    public void setPromotionDetails(String promotionDetails) {
        this.promotionDetails = promotionDetails;
    }
}
