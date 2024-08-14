package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelAddsBagelToBasket() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);

        Assertions.assertTrue(basket.items.length != 0);
    }

}
