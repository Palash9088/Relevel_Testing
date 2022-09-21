package Throw;//import java.util.*;

public class A {
    static void sumOfDigit(int num)
    {
        int sum = 0;
        while (num>0)
        {
            sum+=num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
    static void armStorngCheck(int num)
    {
        int sum = 0;
        int digit =  0;
        int temp = num;
        while (num>0)
        {
            digit = num % 10;
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        sumOfDigit(121);
        armStorngCheck(153);
    }
}
