/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: CAR
 * Lab Activity #4
 */

public class FactoryProvider {

    public AbstractFactory getFactory(boolean rounded) {
        System.out.println("\nInside getFactory() method in the FactoryProvider class\n");
        if (rounded) {
            return new AnimalFactory();
        } else {
            return new ColorFactory();
        }
    }


}
