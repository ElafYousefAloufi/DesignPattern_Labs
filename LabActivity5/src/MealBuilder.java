/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #05
 */

import java.util.Scanner;

public class MealBuilder {

    Scanner input = new Scanner(System.in);

    public Meal buildMeal()  {

        Meal meal=new Meal();
        System.out.print("1: Veggie Burger \n2: Chicken Burger \nChoose your option: ");
        int burgerOption = input.nextInt();
       switch (burgerOption) {
            case 1:
              meal=prepareVegMeal();
                break;
            case 2:
                meal=prepareVegMeal();
                break;
            default:
                System.out.println("\n***Sorry: Your choice entry is not either 1 or 2***");
                break;
        }
        return meal;

    }

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        System.out.print("1: Yes \n2: No \nWould you like to have a drink: ");
        int drinkOption = input.nextInt();

        switch (drinkOption) {
            case 1:
                prepareDrink(meal);
                break;
            case 2:
                System.out.print("\n");
                break;
            default:
                System.out.println("\n***Sorry: Your choice entry is not either 1 or 2***");
                break;
        }

        return meal;

    }

    public Meal prepareNunVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        System.out.print("1: Yes \n2: No \nWould you like to have a drink: ");
        int drinkOption = input.nextInt();

        switch (drinkOption) {
            case 1:
                prepareDrink(meal);
            case 2:
                System.out.print("\n");
                break;
            default:
                System.out.println("\n***Sorry: Your choice entry is not either 1 or 2***");
                break;
        }
        return meal;

    }

    public void prepareDrink(Meal meal) {

        System.out.print("1: Pipse \n2: Coke \nChoose your option: ");
        int drink = input.nextInt();
        System.out.print("\n");
        switch (drink) {
            case 1:
                meal.addItem(new Pepsi());
                break;
            case 2:
                meal.addItem(new Coke());
                break;

        }

    }
}
