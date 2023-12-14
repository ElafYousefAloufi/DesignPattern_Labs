/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #05
 */

public class Coke extends ColdDrink {

    private final Packing packing;

    public Coke() {
        this.packing = new Bottle();
    }

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Packing packing() {
        return packing;
    }

    @Override
    public float price() {
        return 3.00f;
    }

}
