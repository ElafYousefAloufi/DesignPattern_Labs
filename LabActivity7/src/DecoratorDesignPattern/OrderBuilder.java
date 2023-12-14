/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {

    OrderedItems items = new OrderedItems();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int sizeOption;

    public OrderedItems preparePizza(Pizza pizza) throws IOException {

        do {
            System.out.print("1: Cheeze \n2: Olives \n3: Mushroom \n4: Onion \n5: Done \nChoose toppings for the pizza: ");
            sizeOption = Integer.parseInt(br.readLine());
            System.out.println();
            switch (sizeOption) {
                case 1:
                    pizza = new Cheese(pizza);
                    break;

                case 2:
                    pizza = new Olives(pizza);
                    break;

                case 3:
                    pizza = new Mushroom(pizza);
                    break;

                case 4:
                    pizza = new Onion(pizza);
                    break;
                case 5:
                    continue;

                default:
                    System.out.println("Sorry: No option available");

            }//end of switch  

        } while (sizeOption != 5);

        System.out.print("1: Yes \n2: No \nWould you like to have a drink? ");
        int drinkOption = Integer.parseInt(br.readLine());
        System.out.println();
        switch (drinkOption) {
            case 1:
                preparedDrik();
                break;
            case 2:
                System.out.print("\n");
                break;
            default:
                System.out.println("\n***Sorry: Your choice entry is not either 1 or 2***");
                break;
        }

        items.addItem(pizza);
        return items;

    }

    public OrderedItems preparePizzaSize() throws IOException {
        System.out.print("1: Small Pizza \n2: Medium Pizza \n3: Large Pizza \nChoose a pizza size: ");
        int size = Integer.parseInt(br.readLine());
        System.out.println();
        switch (size) {
            case 1: {
                preparePizza(new SmallPizza());
            }
            break;

            case 2: {
                preparePizza(new MediumPizza());

            }
            break;
            case 3: {
                preparePizza(new LargePizza());
            }
            break;

            default: {
                System.out.println("Sorry: No option available");
            }

        }//end of switch  

        return items;

    }

    public OrderedItems preparedDrik() throws IOException {

        System.out.print("1: Pepsi \n2: Coke \nChoose your drink option: ");
        int drinkOption = Integer.parseInt(br.readLine());
        System.out.println();
        switch (drinkOption) {
            case 1:
                System.out.print("1: Small \n2: Medium \n2: Large \nChoose a pepsi size: ");
                int pepsiSize = Integer.parseInt(br.readLine());
                System.out.println();
                switch (pepsiSize) {
                    case 1:
                        items.addItem(new SmallPepsi());
                        break;
                    case 2:
                        items.addItem(new MediumPepsi());
                        break;
                    case 3:
                        items.addItem(new LargePepsi());
                        break;
                }

                break;
            case 2:
                System.out.print("1: Small \n2: Medium \n2: Large \nChoose a coke size: ");
                int cokeSize = Integer.parseInt(br.readLine());
                System.out.println();
                switch (cokeSize) {
                    case 1:
                        items.addItem(new SmallCoke());
                        break;
                    case 2:
                        items.addItem(new MediumCoke());
                        break;
                    case 3:
                        items.addItem(new LargeCoke());
                        break;
                }
                break;

        }

        return items;

    }

}

