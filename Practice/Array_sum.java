import java.util.Scanner;

public class Array_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter array length");
        int n = scan.nextInt();
        int [] nums = new int [n];

        int sum = 0;
        int count = 0;
        float average = 0;

        for (int i = 0; i<nums.length; i++)
        {
            System.out.println( "Enter elements " + i);
            nums[i] = scan.nextInt();
            sum = sum + nums[i];
            count++;
            average = sum / n;
        }
        // to print
        for (int i = 0; i< nums.length; i++)
        {
            System.out.println("Value at index "+ i + " " + nums[i]);
        }
        System.out.println("sum is " + sum);
        System.out.println("Average is " + average );
        System.out.println(count + " " + n);
    }
}
