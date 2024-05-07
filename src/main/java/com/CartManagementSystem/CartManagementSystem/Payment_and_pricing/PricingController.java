package com.CartManagementSystem.CartManagementSystem.Payment_and_pricing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pricing")
public class PricingController {

    @GetMapping("/strategy")
    public PricingStrategy getPricingStrategy() {
        String strategyName = "Discount Pricing";
        String description = "Offering discounts on selected items";
        return new PricingStrategy(strategyName, description);
    }
}
