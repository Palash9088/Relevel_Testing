import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        // Create an array of 2x3 size 2 rows 3 cols

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total no. of rows");
        int n = scan.nextInt();

        System.out.println("Enter total no. of columns");
        int m = scan.nextInt();

        // creating array of n rows & m cols
        int [][] arr = new int [n][m]; // this is how we write for 2D array with double square bracket

        System.out.println("Enter array element");
        // for rows
        for (int i=0 ; i<n ; i++)
        {
            // for cols
            for (int j=0 ; j<m ; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        // printing array element
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // access any value in array
        System.out.println("Value of 1,0 is " + arr[1][0]);

        // total number of array
        System.out.println("Total number of rows is " + arr.length);
        System.out.println("Total number of columns is " + arr[0].length);
        System.out.println("Total number of elements is " + (n*m));
    }
}
