package com.javaAction.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishDemo {
     static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800),
            new Dish("beef", false, 700),
            new Dish("chicken", false, 400),
            new Dish("french fries", true, 530),
            new Dish("rice", true, 350),
            new Dish("season fruit", true, 120),
            new Dish("pizza", true, 550),
            new Dish("prawns", false, 300),
            new Dish("salmon", false, 450) );

    public static void main(String[] args) {
        List<Dish> chooseMenu = menu.stream().
                filter(d -> d.getCalories()>=400).
                sorted(Comparator.comparing(Dish::getCalories)).
                collect(Collectors.toList());
        for(Dish dish:chooseMenu) {
            System.out.println(dish.getCalories());
        }
    }
}
