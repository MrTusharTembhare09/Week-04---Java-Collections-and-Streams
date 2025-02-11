package com.example.problem4_personalizedmealplangenerator.main;

import com.example.problem4_personalizedmealplangenerator.models.*;
import com.example.problem4_personalizedmealplangenerator.utils.MealGenerator;

public class Main {
    public static void main(String[] args) {
        // Creating instances of different meal types
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        // Creating a generic MealGenerator
        MealGenerator<MealPlan> mealGenerator = new MealGenerator<>();

        // Adding meals to the generator
        mealGenerator.addMeal(vegetarianMeal);
        mealGenerator.addMeal(veganMeal);
        mealGenerator.addMeal(ketoMeal);
        mealGenerator.addMeal(highProteinMeal);

        // Generating meal plans dynamically
        MealGenerator.generateMealPlan(vegetarianMeal);
        MealGenerator.generateMealPlan(veganMeal);
        MealGenerator.generateMealPlan(ketoMeal);
        MealGenerator.generateMealPlan(highProteinMeal);

        // Displaying stored meals
        System.out.println("Stored Meal Plans:");
        for (MealPlan meal : mealGenerator.getMeals()) {
            System.out.println("- " + meal.getMealType());
        }
    }
}

