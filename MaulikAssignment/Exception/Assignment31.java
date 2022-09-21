package Exception;//import java.util.*;

import java.util.Scanner;

public class Assignment31 {
    static void m1() {
        Scanner scanner = new Scanner(System.in);
        int arr [] = new int[3];
        int sum = 0;
        int count =0;

        while (count != 3)
        {
            try {
                System.out.println("Enter Number");
                int num = Integer.parseInt(scanner.nextLine());
                sum = sum + num;
                arr[count] = num;
                count++;


            } catch (NumberFormatException nfe) {
                System.out.println("Enter Valid Input");
            }
        }

        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println(" and sum is " + sum );
    }
    public static void main(String[] args) {
        m1();
    }
}
