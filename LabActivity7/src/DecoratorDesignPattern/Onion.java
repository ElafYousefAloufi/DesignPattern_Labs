/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class Onion extends PizzaDecorator {

    public Onion(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public float price() {
        return super.price() + 1.5f;

    }

    @Override
    public String name() {
        return super.name() + " (with Onion)";

    }

    @Override
    public String size() {
        return super.size();

    }
}
