/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public float price() {
        return super.price() + 5;

    }

    @Override
    public String name() {
        return super.name() + " (with Mushroom)";

    }

    @Override
    public String size() {
        return super.size();

    }

}
