package com.CartManagementSystem.CartManagementSystem.Payment_and_pricing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/options")
    public PaymentOptions getPaymentOptions() {
        List<String> methods = Arrays.asList("Credit Card", "Debit Card", "PayPal", "Cash");
        return new PaymentOptions(methods);
    }
}
