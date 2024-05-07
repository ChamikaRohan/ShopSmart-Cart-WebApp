package com.CartManagementSystem.CartManagementSystem.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/addItem")
    public void addItemToCart(@RequestBody CartItemRequest cartItemRequest) {
        cartService.addItemToCart(cartItemRequest.getProduct(), cartItemRequest.getQuantity());
    }

    @DeleteMapping("/removeItem")
    public void removeItemFromCart(@RequestBody CartItemRequest cartItemRequest) {
        cartService.removeItemFromCart(cartItemRequest.getProduct(), cartItemRequest.getQuantity());
    }

    @GetMapping("/items")
    public List<CartItem> getCartItems() {
        return cartService.getCartItems();
    }
}
