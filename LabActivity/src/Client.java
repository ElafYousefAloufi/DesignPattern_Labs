/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: CAR
 * Lab Activity #4
 */

public class Client {

    public static void main(String[] args) {

        System.out.println("\n-----------------------This is the main class-----------------------");

        FactoryProvider factoryProvider = new FactoryProvider();

        AbstractFactory animal = factoryProvider.getFactory(true);

        Animal dog = animal.create("Dog");
        System.out.println(dog.getType());
        System.out.println(dog.makeSound()+"\n");

        Animal duck = animal.create("Duck");
        System.out.println(duck.getType());
        System.out.println(duck.makeSound()+"\n");

        Animal bear = animal.create("Bear");
        System.out.println(bear.getType());
        System.out.println(bear.makeSound()+"\n");

        System.out.println("---------------------------------------------------------------------");

        AbstractFactory color = factoryProvider.getFactory(false);

        Color black = color.create("Black");
        System.out.println(black.getCololr()+"\n");

        Color brown = color.create("Brown");
        System.out.println(brown.getCololr()+"\n");

        Color white = color.create("White");
        System.out.println(white.getCololr()+"\n");

      

    }
}
