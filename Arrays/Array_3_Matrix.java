import java.util.Scanner;

public class Array_3_Matrix {

    public void PrintArray (int [][] arr1, int n, int m)
    {
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<m; j++)
            {
                System.out.print(arr1 [i] [j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Total no. of rows");
        int n = scan.nextInt();

        System.out.println("Total no. of columns");
        int m = scan.nextInt();

        // Creating array

        int[][] arr1 = new int [n] [m];
        System.out.println("First Array");

        for (int i = 0; i<n ; i++ ) // for row
        {

            for (int j = 0; j<m; j++)
            {
                arr1 [i] [j] = scan.nextInt();
            }
        }

        int[][] arr2 = new int[n][m];
        System.out.println("Second array");

        for (int i = 0; i<n ; i++) // for columns
        {
            for (int j = 0; j<m ; j++)
            {
                arr2 [i] [j] = scan.nextInt();
            }
        }
        System.out.println("Array arr1 ");
        Array_3_Matrix obj = new Array_3_Matrix();
        obj.PrintArray(arr1, n, m);

        System.out.println("Array B ");
        obj.PrintArray(arr2, n, m);

    }
}
