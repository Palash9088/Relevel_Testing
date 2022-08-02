package Static;//import java.util.*;

public class Test1 {

    int x = 10;
    public Test1()
    {
        int y = 20;
        x = 30;
        System.out.println("Test 1 Constructor call");
        System.out.println(x);
    }
    public Test1(int a)
    {
        System.out.println("Test 1 parameterized Constructor call");

    }

    public static void m1(int a, int b) {
        System.out.println(a + b);
        System.out.println("sum of static method test 1");
    }
    void m2()
    {
        System.out.println("M2 of test 1 Class");
    }

    public static void m3()
    {
        System.out.println("m3 method of test 1");
    }

}

