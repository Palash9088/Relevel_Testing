package Arrays;//import java.util.*;

public class Test2Interview {

    void m1(int x, double d)
    {
        System.out.println("1");
    }
    void m1(double d, int x)
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test2Interview test = new Test2Interview();

        test.m1(10.0,10);
        test.m1(10,10.0);
        // (10.0,10.0) CE
        // (10,10) CE
    }
}
