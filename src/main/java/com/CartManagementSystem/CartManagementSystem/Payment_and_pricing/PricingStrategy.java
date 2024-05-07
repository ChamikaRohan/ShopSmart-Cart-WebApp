package com.CartManagementSystem.CartManagementSystem.Payment_and_pricing;

public class PricingStrategy {
    private String strategyName;
    private String description;

    public PricingStrategy(String strategyName, String description) {
        this.strategyName = strategyName;
        this.description = description;
    }

    // Getters and setters
    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
