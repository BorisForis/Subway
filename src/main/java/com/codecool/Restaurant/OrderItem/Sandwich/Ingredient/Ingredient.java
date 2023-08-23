package com.codecool.Restaurant.OrderItem.Sandwich.Ingredient;

public class Ingredient {
    private final String name;
    private final double price;

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
