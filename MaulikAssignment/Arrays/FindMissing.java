package Arrays;//import java.util.*;

public class FindMissing {
    void missingNum(int arr[])
    {
        int start = arr[0];
        int end = arr[arr.length-1];
        int sum = 0;

        for (int i = start; i<=arr[arr.length-1];i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of all number is " + sum);

        for (int i = 0; i<arr.length;i++)
        {
            sum = sum-arr[i];
        }
        System.out.println("Missing number is " + sum);
    }


    public static void main(String[] args) {
        FindMissing findMissing = new FindMissing();

        int [] arr = {5,8,7,9,10,11};
        findMissing.missingNum(arr);
    }
}
