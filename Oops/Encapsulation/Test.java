package Encapsulation;//import java.util.*;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(10);
        System.out.println(car.getSpeed());
        car.displaySpeed();
    }
}
