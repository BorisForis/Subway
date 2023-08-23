package com.codecool.Restaurant.OrderItem.Sandwich;

import com.codecool.Restaurant.OrderItem.OrderItem;
import com.codecool.Restaurant.OrderItem.Sandwich.Ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends OrderItem {
    private static final List<Ingredient> ingredients = new ArrayList<>(List.of());
    public Sandwich(Ingredient ingredient) {
        super(calculatingPrice());
        ingredients.add(ingredient);
    }

    private static double calculatingPrice() {
        double fullPrice = 0;
        for( Ingredient ingredient : ingredients) {
            fullPrice += ingredient.getPrice();
        }
        return fullPrice;
    }
}
