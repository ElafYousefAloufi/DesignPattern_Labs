/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #05
 */

public class ChickenBurger extends Burger {

    Packing packing = new Wrapper();

    @Override
    public String name() {
        return "Chicken Burger";

    }

    @Override
    public Packing packing() {
        return packing;

    }

    @Override
    public float price() {
        return 18.00f;

    }
}
