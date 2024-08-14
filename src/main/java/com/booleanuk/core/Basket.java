package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    public Map<String, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }

    public void addBagel(String type, int quantity) {
        this.items.put(type, quantity);
    }

    public void removeBagel(String key) {
        this.items.remove(key);
    }

}
