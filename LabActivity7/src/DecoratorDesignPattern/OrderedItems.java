/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

import java.util.ArrayList;

public class OrderedItems {

    ArrayList<Item> items = new ArrayList();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {

        float cost = 0;

        //cost = items.stream().map((item) -> (item.price())).reduce(cost, (accumulator, _item) -> accumulator + _item);
        for (int i = 0; i < items.size(); i++) {
            cost += items.get(i).price();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("------------------------------------------------------\n");
            System.out.println("Item: " + item.name());
            System.out.println("Item Size: " + item.size());
            System.out.println("Item price: " + item.price());

        }
    }

}

