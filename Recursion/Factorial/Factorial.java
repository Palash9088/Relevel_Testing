package Factorial;//import java.util.*;

public class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial( n -1);
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println("factorial of n is " + factorial(x));
    }
}
