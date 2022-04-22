package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }


    public void remove(Item item) {
        items.remove(item);
    }

    public void remove(Product product) {
        this.items = items.stream().filter(item -> !item.getProduct().equals(product))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

}