/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public float price() {
        return super.price() + 4.0f;

    }

    @Override
    public String name() {
        return super.name() + " (with Cheeze)";

    }

    @Override
    public String size() {
        return super.size();

    }

}
