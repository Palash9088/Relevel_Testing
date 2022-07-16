import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter length of array");
        int sc = scan.nextInt();
        int arr[] = new int[sc];

        for(int i=0; i<arr.length;i++)
        {
            System.out.println("Enter values of array" + i);
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // to find max & min
        int max = 0;

        for (int i=0 ; i< arr.length;i++)
        {
            if (arr[i]>max)
            {
             max=arr[i];
            }
        }
        System.out.println(max);

        int min = arr[0];
        for (int i=0 ; i< arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
