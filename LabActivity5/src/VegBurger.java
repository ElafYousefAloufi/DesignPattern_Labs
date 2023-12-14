/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #05
 */

public class VegBurger extends Burger {

    Packing packing = new Wrapper();

    @Override
    public String name() {
        return "Veggie Burger";

    }

    @Override
    public Packing packing() {
        return packing;

    }

    @Override
    public float price() {
        return 20.70f;

    }
}
