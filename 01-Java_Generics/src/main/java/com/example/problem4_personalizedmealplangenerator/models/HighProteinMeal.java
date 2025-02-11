package com.example.problem4_personalizedmealplangenerator.models;

// Creating HighProteinMeal class implementing MealPlan
public class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High Protein Meal";
    }
}

