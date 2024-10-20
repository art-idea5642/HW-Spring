package com.example.shoppingcart;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class ShoppingCartService {
    private final ShoppingCart shoppingCart = new ShoppingCart();

    public void addItems(List<Integer> id) {
        shoppingCart.addItems(id);
    }

    public List<Integer> getItems() {
        return shoppingCart.getItems();
    }
}
