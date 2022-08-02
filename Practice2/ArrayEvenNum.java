import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int sc = scan.nextInt();

        int arr [] = new int[sc];

        System.out.println("Enter array elements");
        for(int i = 0; i< arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Input array" + Arrays.toString(arr));
        int sum = 0;
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i] % 2 == 0)
            {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of even number is " + sum);
    }
}
