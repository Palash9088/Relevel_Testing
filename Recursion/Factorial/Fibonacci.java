package Factorial;//import java.util.*;

public class Fibonacci {

    static int fibonacci(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);

    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci series sum " + fibonacci(n));
    }
}
