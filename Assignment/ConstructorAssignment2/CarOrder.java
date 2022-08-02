package ConstructorAssignment2;//import java.util.*;

public class CarOrder {
    public static void main(String[] args) {
        CarCustom car = new CarCustom();

        System.out.println("Before customization");
        car.display();

        car.setCarCustom("Black");
        System.out.println( "\n" + "After customization");
        car.display();


        CarCustom car2 = new CarCustom();

        System.out.println("Before customization");
        car.display();

        car.setCarCustom("Petrol","Red");
        System.out.println( "\n" + "After customization");
        car.display();

        CarCustom car3 = new CarCustom();

        System.out.println("Before customization");
        car.display();

        car.setCarCustom("Petrol","White");
        System.out.println( "\n" + "After customization");
        car.display();

    }
}
