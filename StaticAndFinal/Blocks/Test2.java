package Blocks;//import java.util.*;

public class Test2 extends Test1 {
    static
    {
        System.out.println("Static block T2");
    }
    {
        System.out.println("Non Static Block T2");
    }
    public Test2()
    {
        System.out.println("Constructor T");
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();

    }
}
