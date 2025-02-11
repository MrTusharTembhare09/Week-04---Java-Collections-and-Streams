package com.example.problem4_personalizedmealplangenerator.models;

// Creating VegetarianMeal class implementing MealPlan
public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian Meal";
    }
}
