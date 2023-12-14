/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class SmallPepsi extends Pepsi {

    @Override
    public String size() {
        return "Small";

    }

    @Override
    public float price() {
        return 3.0f;

    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
