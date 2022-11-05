package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();

    private List<Product> removedProducts = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }


    public void remove(Item item) {
        items.remove(item);
        removedProducts.add(item.getProduct());
    }

    public void remove(Product product) {
        items.removeIf(item -> item.getProduct().equals(product));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    public List<Product> removedProducts() {
        return removedProducts;
    }
}