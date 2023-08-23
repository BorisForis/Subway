package com.codecool.Restaurant;

import com.codecool.Restaurant.OrderItem.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private List<OrderItem> orderedItems = new ArrayList<>(List.of());

    public Restaurant(String name) {
        this.name = name;
    }

    private void addNewOrders(OrderItem item){
        orderedItems.add(item);
    }

    private void calculatePriceOfAllOrders() {
        double finalPrice = 0;
        for(OrderItem item : orderedItems) {
            finalPrice += item.getPrice();
        }
        System.out.println(finalPrice);
    }
}
