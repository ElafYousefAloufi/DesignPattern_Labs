/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class MediumCoke extends Coke {

    @Override
    public String name() {
        return "Coke";

    }

    @Override
    public String size() {
        return "Medium";

    }

    @Override
    public float price() {
        return 6.50f;

    }
}
