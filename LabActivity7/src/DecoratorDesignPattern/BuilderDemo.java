/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

import java.io.IOException;
import java.util.InputMismatchException;

public class BuilderDemo {

    public static void main(String[] args) throws IOException {
        try {
            System.out.print("-------------------------Menu-------------------------\n");
            OrderBuilder orderBuilder = new OrderBuilder();
            OrderedItems items = orderBuilder.preparePizzaSize();
            items.showItems();
            System.out.print("------------------------------------------------------\n");
            System.out.println("Total Price: " + items.getCost() + "\n");
        } catch (InputMismatchException ex) {
            System.out.println("***Sorrty: InputMismatchException***");
        }
    }
}

