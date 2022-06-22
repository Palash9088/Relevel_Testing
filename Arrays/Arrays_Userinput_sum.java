import java.util.Scanner;

public class Arrays_Userinput_sum {
    public static void main(String[] args) {
        // sum & average of 5 values in an array

        // take  numbers from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scan.nextInt();
        int [] nums = new int [n];


        int length = nums.length;
        int sum =0;

        System.out.println("Enter array elements");

        for (int i = 0; i< nums.length; i++)
        {
            nums[i] = scan.nextInt();
            sum = sum + nums[i];
        }

        // to add all the values from array
        System.out.println("Total of numbers is : " + sum );

        float average = sum / length;
        System.out.println("Average of values is " + average);
    }
}

