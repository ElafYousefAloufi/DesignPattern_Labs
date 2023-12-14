/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class LargePizza extends Pizza {

    @Override
    public float price() {
        return 33.25f;

    }

    @Override
    public String name() {
        return "Pizza";

    }

    @Override
    public String size() {
        return "Large";

    }
}

