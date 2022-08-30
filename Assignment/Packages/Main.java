package Packages;//import java.util.*;

public class Main implements StaticInterface
{
    public static void display()
    {
        System.out.println("Static method Main Class");
    }

    public static void main(String[] args) {
        int sum = StaticInterface.display(2,2);
        System.out.println(sum);
        display();

    }
}
