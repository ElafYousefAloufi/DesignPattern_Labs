/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: CAR
 * Lab Activity #4
 */

public class AnimalFactory implements AbstractFactory {

     @Override
    public Animal create(String animalType) {
        if (animalType.equalsIgnoreCase("Dog")) {
            System.out.println("Inside create() method in AnimalFactory class [Dog object is created]");
            return new Dog();
        } else if (animalType.equalsIgnoreCase("Duck")) {
            System.out.println("Inside create() method in AnimalFactory class [Duck object is created]");
            return new Duck();
        } else if (animalType.equalsIgnoreCase("Bear")) {
            System.out.println("Inside create() method in AnimalFactory class [Bear object is created]");
            return new Bear();
        }
        return null;

    }

  
}
