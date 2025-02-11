package com.example.problem4_personalizedmealplangenerator.utils;

import com.example.problem4_personalizedmealplangenerator.models.MealPlan;
import java.util.ArrayList;
import java.util.List;

// Creating MealGenerator class to store and retrieve meals dynamically
public class MealGenerator<T extends MealPlan> {
    private final List<T> mealPlans = new ArrayList<>();

    // Adding a meal to the list
    public void addMeal(T meal) {
        mealPlans.add(meal);
    }

    // Retrieving all meals
    public List<T> getMeals() {
        return mealPlans;
    }

    // Generating a meal plan dynamically
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generating personalized meal plan: " + meal.getMealType());
    }
}

