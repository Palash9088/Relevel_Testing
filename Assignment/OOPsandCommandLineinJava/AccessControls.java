package OOPsandCommandLineinJava;//import java.util.*;

public class AccessControls {
    protected static void addition (int a, int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
    private static void subtraction(int a, int b)
    {
        int subtraction = a-b;
        System.out.println(subtraction);
    }
    public static void multiplication(int a,int b)
    {
        int multiplication = a*b;
        System.out.println(multiplication);
    }
    static void division(int a, int b)
    {
        int division = a/b;
        System.out.println(division);
    }
    public static void main(String[] args) {

    }
}
