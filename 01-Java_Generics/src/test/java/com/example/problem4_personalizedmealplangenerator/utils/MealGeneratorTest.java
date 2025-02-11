package com.example.problem4_personalizedmealplangenerator.utils;

import com.example.problem4_personalizedmealplangenerator.models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MealGeneratorTest {

    @Test
    void testAddMeal() {
        MealGenerator<MealPlan> mealGenerator = new MealGenerator<>();
        VegetarianMeal vegetarianMeal = new VegetarianMeal();

        // Adding a meal to generator
        mealGenerator.addMeal(vegetarianMeal);
        List<MealPlan> meals = mealGenerator.getMeals();

        // Checking if the meal was added successfully
        assertEquals(1, meals.size());
        assertEquals("Vegetarian Meal", meals.get(0).getMealType());
    }

    @Test
    void testGenerateMealPlan() {
        VeganMeal veganMeal = new VeganMeal();
        assertDoesNotThrow(() -> MealGenerator.generateMealPlan(veganMeal));
    }
}

