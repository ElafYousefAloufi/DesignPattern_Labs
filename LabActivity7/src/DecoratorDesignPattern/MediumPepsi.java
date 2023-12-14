/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class MediumPepsi extends Pepsi {

    @Override
    public String size() {
        return "Medium";

    }

    @Override
    public float price() {
        return 5.0f;

    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
