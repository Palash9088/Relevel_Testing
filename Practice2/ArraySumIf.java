import java.util.Arrays;
import java.util.Scanner;

public class ArraySumIf {
    public void ArrayP (int arr[], int n, Scanner scan)
    {

        for (int i=0; i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Input array " + Arrays.toString(arr));

        int countP = 0;
        int countN = 0;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<0)
            {
                countN++;
            }
            else
            {
                countP++;
            }
        }
        System.out.println("Positive Numbers" + countP);
        System.out.println("Negative Numbers" + countN);

        int sumP = 0;
        int sumN = 0;
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]<0)
            {
                sumN = sumN + arr[i];
            }
            else
            {
                sumP = sumP + arr[i];
            }
        }
        System.out.println("Sum of positive number is " + sumP);
        System.out.println("Sum of negative number is " + sumN);
        System.out.println("Difference between +ve & -ve is " + ((sumP) + (sumN)));
    }

    public static void main(String[] args) {

        ArraySumIf obj = new ArraySumIf();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length");
        int n = scan.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");

        obj.ArrayP(arr,n,scan);
    }
}
