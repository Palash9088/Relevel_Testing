package Static;//import java.util.*;

public class Test2 extends Test1 {

    int x;
    public Test2()
    {
        super(10);
        System.out.println(" TestFile 2 Constructor call");
    }


    public static void m1(int a, int b) {
        System.out.println(a+b);
        System.out.println("sum of static method test 2");

    }
    void m2()
    {
        System.out.println("M2 of test 2 Class");
    }

    public static void m3()
    {
        System.out.println("m3 method of test 2");
    }
}
