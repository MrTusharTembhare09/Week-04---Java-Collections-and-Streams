package com.example.problem4_personalizedmealplangenerator.models;

// Creating VeganMeal class implementing MealPlan
public class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan Meal";
    }
}

