package CustomExceptionAssignment;//import java.util.*;

import java.util.Scanner;

public class ExceptionTest {
    static void calculateSquare(int num) throws NegativeNumberException
    {
        if(num<0) throw new  NegativeNumberException("Enter only positive number / Can't calculate square of negative number");
        {
            int square = num*num;
            System.out.println("Square of given number is " + square);
        }
    }
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter num to get Square");
            int num = scanner.nextInt();

            ExceptionTest.calculateSquare(num);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
