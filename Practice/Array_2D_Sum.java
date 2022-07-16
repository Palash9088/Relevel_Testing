import java.util.Scanner;

public class Array_2D_Sum {

    public int [][] getArray(int[][] arr, int n, int m, Scanner scan)
    {
        System.out.println("Enter array elements");

        for (int i = 0; i < n; i++) // for rows
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public void PrintArray(int[][] arr, int n, int m) {
        System.out.println("Array is");
        for (int i = 0; i < n; i++) // for rows
        {
            for (int j = 0; j < m; j++) // for cols
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] arrayAddition (int [][]arrA, int[][]arrB, int n, int m) {
        // new array of same size
        int [][] result = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                result[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
        return result;
    }

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            Array_2D_Sum obj = new Array_2D_Sum();


            System.out.println("Enter row length");
            int n = scan.nextInt();

            System.out.println("Enter cols length");
            int m = scan.nextInt();

            // array A
            int[][] A = new int[n][m];
            System.out.println("Enter elements for A");

            obj.getArray(A, n,m, scan);

            System.out.println("Array A is ");
            obj.PrintArray(A, n, m);

            // Array B

            int[][] B = new int[n][m];
            System.out.println("Enter elements for B");

            obj.getArray(B, n,m, scan);

            System.out.println("Array B is ");
            obj.PrintArray(B, n, m);

            System.out.println("Array addition is");
            int [][] add = obj.arrayAddition(A,B,n,m);
            obj.PrintArray(add,n,m);

        }
    }
