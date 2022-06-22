import java.util.Scanner;

public class TRY
{
    public void printArray(int[][] arr, int n, int m)
        {
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<m; j++)
        {
        System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
        }
public static void main (String[] args) throws java.lang.Exception
        {
        // your code goes here
        //input was 2 arrays
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number of rows");
        int n = scan.nextInt();
        System.out.println("Enter total number of columns");
        int m = scan.nextInt();

        int[][] A = new int[n][m];
        System.out.println("Enter first array");
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<m; j++)
        {
        A[i][j] = scan.nextInt();
        }
        }

        int[][] B = new int[n][m];
        System.out.println("Enter second array");
        for(int i=0; i<n; i++)
        {
        for(int j=0; j<m; j++)
        {
        B[i][j] = scan.nextInt();
        }
        }

        System.out.println("Array A is");
        TRY obj = new TRY();
        obj.printArray(A, n, m);

        System.out.println("Array B is");
        obj.printArray(B, n, m);
        }
        }