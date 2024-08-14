package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelAddsBagelToBasket() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);

        Assertions.assertFalse(basket.items.isEmpty());
    }

    @Test
    public void testRemoveBagelRemovesBagelFromBasket() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);

        // Then we remove the bagel.
        basket.removeBagel("normal");

        Assertions.assertTrue(basket.items.isEmpty());
    }

    @Test
    public void testHasCapacity() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);
        basket.addBagel("special", 2);

        boolean hasMoreSpace = basket.hasCapacity();
        Assertions.assertTrue(hasMoreSpace);
    }
}
