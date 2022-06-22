import java.util.Scanner;

public class ArrayUser_Input {
    public static void main(String[] args) {
        // create array of size 5
        int[] nums = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values of the array ");

        // i=0 because array index starts from zero
        // i<nums.length will have total counts of elements in array
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println("enter value at index " + i);
            // nums[i] since we are iterating over all the values,so this will take values one by one.
            nums[i] = scan.nextInt();
        }

        // to print all the array elements
        for (int i=0; i<nums.length; i++ )
        {
            System.out.println("Value of index " + i + "is " +  nums[i]);
        }

    }
}
