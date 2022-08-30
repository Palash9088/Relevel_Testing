package Inheritance;//import java.util.*;

public class Child extends Parent {

    void A()
    {
        System.out.println("A C");
    }
    void A(String str)
    {
        System.out.println("A String");
    }
    void B()
    {
        System.out.println("B C");
    }

    public static void main(String[] args) {

        Parent obj = new Child();
        obj.B();
    }
}
