/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public abstract class PizzaDecorator extends Pizza {

    private final Pizza newPizza;

    public PizzaDecorator(Pizza newPizza) {
        this.newPizza = newPizza;
    }

    @Override
    public float price() {
        return newPizza.price();
    }

    @Override
    public String name() {
        return newPizza.name();
    }

    @Override
    public String size() {
        return newPizza.size();
    }
}

