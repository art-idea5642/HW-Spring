package com.example.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> itemId = new ArrayList<>();

    public void addItems(List<Integer> id) {
        itemId.addAll(id);
    }

    public List<Integer> getItems() {
        return itemId;
    }
}

