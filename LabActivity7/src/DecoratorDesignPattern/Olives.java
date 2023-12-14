/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class Olives extends PizzaDecorator {

    public Olives(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public float price() {
        return super.price() + 2.5f;

    }

    @Override
    public String name() {
        return super.name() + " (with Olives)";

    }

    @Override
    public String size() {
        return super.size();

    }

}
