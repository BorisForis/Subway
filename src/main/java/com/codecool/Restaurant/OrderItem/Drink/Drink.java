package com.codecool.Restaurant.OrderItem.Drink;

import com.codecool.Restaurant.OrderItem.OrderItem;

public class Drink extends OrderItem {
    private String flavor;
    public Drink(String flavor, double price) {
        super(price);
        this.flavor = flavor;
    }
}
