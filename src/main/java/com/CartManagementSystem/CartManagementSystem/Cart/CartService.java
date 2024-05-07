package com.CartManagementSystem.CartManagementSystem.Cart;
import com.CartManagementSystem.CartManagementSystem.Product.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {

    private Cart cart;

    public CartService() {
        this.cart = new Cart();
    }

    public void addItemToCart(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        cart.addItem(cartItem);
    }

    public void removeItemFromCart(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        cart.removeItem(cartItem);
    }

    public List<CartItem> getCartItems() {
        return cart.getItems();
    }
}
