package Arrays;//import java.util.*;

public class SumOfArray {

    void add (int [] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();

        int arr[] = new int[5];
        arr [0] = 10;
        arr [1] = 10;
        arr [2] = 10;
        arr [3] = 10;
        arr [4] = 10;

        obj.add(arr);

        obj.display(arr);
    }
}
