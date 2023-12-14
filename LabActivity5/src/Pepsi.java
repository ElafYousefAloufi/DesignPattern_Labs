/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #05
 */

public class Pepsi extends ColdDrink {

    private final Packing packing = new Bottle();

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Packing packing() {
        return packing;
    }

    @Override
    public float price() {
        return 2.50f;
    }
}
