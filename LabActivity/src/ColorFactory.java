/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: CAR
 * Lab Activity #4
 */

public class ColorFactory implements AbstractFactory {

    @Override
    public Color create(String colorType) {
        if (colorType.equalsIgnoreCase("Black")) {
            System.out.println("Inside create() method in ColorFactory class [Black object is created]");
            return new Black();
        } else if (colorType.equalsIgnoreCase("Brown")) {
            System.out.println("Inside create() method in ColorFactory class [Brown object is created]");
            return new Brown();
        } else if (colorType.equalsIgnoreCase("White")) {
            System.out.println("Inside create() method in ColorFactory class [White object is created]");
            return new White();
        }
        return null;

    }

}
