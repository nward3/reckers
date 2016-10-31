package com.nicholasward.reckers;

public class MenuItem {

    private String name;
    private String description;
    private double price;

    public MenuItem(String itemName, String itemDescription, double itemPrice) {
        name = itemName;
        description = itemDescription;
        price = itemPrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

}
