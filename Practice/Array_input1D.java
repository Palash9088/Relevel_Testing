import java.util.Scanner;

public class Array_input1D {
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter Size of array A ");
            int n = sc.nextInt();

            System.out.println("Enter elements of array");
            int [] arr1 = new int[n];

            for (int i = 0; i<n; i++)
            {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter Size of array B ");
            int m = sc.nextInt();

            System.out.println("Enter elements of array");
            int [] arr2 = new int[n];

            for (int i = 0; i<n; i++)
            {
                arr2[i] = sc.nextInt();
            }
            Array_input1D obj = new Array_input1D();

            System.out.println("Array A elements are");
            printArray(arr1, n);

            System.out.println("Array B elements are");
            printArray(arr2, n);

            // Addition of array

            int[] result = new int [n];
            for (int i=0; i<n; i++)
            {
                result = new int[]{arr1[i] + arr2[i]};
            }
            System.out.println();
    }
}
