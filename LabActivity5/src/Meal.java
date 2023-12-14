/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #05
 */

import java.util.ArrayList;

public class Meal {

    private final ArrayList<Item> items= new ArrayList();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {

        float cost = 0;
        for (int i = 0; i < items.size(); i++) {
            cost += items.get(i).price();
        }

        return cost;
    }

    public void showItems() {
        
//         items.stream().map((item) -> {
//            System.out.print("------------------------------------------------------\n");
//            return item;
//        }).map((item) -> {
//            System.out.println("Item: " + item.name());
//            return item;
//        }).map((item) -> {
//            System.out.println("Packing type: " + item.packing().type());
//            return item;
//        }).forEachOrdered((item) -> {
//            System.out.println("Item price: " + item.price());
//        });
    
        for (Item item : items) {
            System.out.print("------------------------------------------------------\n");
            System.out.println("Item: " + item.name());
            System.out.println("Packing type: " + item.packing().type());
            System.out.println("Item price: " + item.price());
          

        }
    }
}
