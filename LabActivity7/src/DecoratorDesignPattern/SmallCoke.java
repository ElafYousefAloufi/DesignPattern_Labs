/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class SmallCoke extends Coke {

    @Override
    public String name() {
        return "Coke";

    }

    @Override
    public String size() {
        return "Small";

    }

    @Override
    public float price() {
        return 3.25f;

    }
}
