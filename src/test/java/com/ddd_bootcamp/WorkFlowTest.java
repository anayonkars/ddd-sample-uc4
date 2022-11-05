package com.ddd_bootcamp;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkFlowTest {
    @Test
    public void testRemovalOfProducts() {
        Cart cart = new Cart();
        Product applePencil = new Product("Apple Pencil");
        Item applePencils = new Item(applePencil, 2);
        cart.add(applePencils);
        cart.remove(applePencils);
        Assertions.assertTrue(cart.removedProducts().contains(applePencil));
    }
}
