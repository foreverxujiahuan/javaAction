package com.javaAction.stream;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Dish(String name, boolean vegetarian, int calories){
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
    }

}
