/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class SmallPizza extends Pizza {

    @Override
    public float price() {
        return 18.0f;

    }

    @Override
    public String name() {
        return "Pizza";

    }

    @Override
    public String size() {
        return "Small";

    }

}

