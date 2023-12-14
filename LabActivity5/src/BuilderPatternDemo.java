/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #05
 */

import java.util.InputMismatchException;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        try {
            System.out.print("-------------------------Menu-------------------------\n");
            MealBuilder mealBuilder = new MealBuilder();
            Meal meal = mealBuilder.buildMeal();
            meal.showItems();
            System.out.print("------------------------------------------------------\n");
            System.out.println("Total Price: " + meal.getCost() + "\n");
        } catch (InputMismatchException ex) {
            System.out.println("***Sorrty: InputMismatchException***");
        }
    }
}

