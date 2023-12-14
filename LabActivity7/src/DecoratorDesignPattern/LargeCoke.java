/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class LargeCoke extends Coke {

    @Override
    public String name() {
        return "Coke";

    }

    @Override
    public String size() {
        return "Large";

    }

    @Override
    public float price() {
        return 11.25f;

    }
}
