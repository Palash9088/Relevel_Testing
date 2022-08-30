package ArraysPractice;//import java.util.*;

import java.util.Scanner;

public class Example1 {
    static void compareArray(int arr1[],int arr2[])
    {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;

        while(count<=3)
        {
            int num = scanner.nextInt();
            if(num>0)
            {
                sum = sum + num;
                count++;
            }
            else {
                System.out.println("Negative num");
            }
        }
        System.out.println(sum);


    }

}
