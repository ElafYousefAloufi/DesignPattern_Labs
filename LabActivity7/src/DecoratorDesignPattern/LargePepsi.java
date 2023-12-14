/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #07
 */

package DecoratorDesignPattern;

public class LargePepsi extends Pepsi {

    @Override
    public String size() {
        return "Large";

    }

    @Override
    public float price() {
        return 10.25f;

    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
