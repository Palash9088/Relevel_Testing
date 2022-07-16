import java.util.Scanner;

public class Arr_ {
    public int[] getArray(int[] arr, int size, Scanner scan) {
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Arr_ obj = new Arr_();

        System.out.println("Enter size for array A");
        int n = scan.nextInt();

        int[] A = new int[n];

        System.out.println("Enter elements for array A");
        obj.getArray(A, n, scan);

        System.out.println("Enter size for array B");
        int m = scan.nextInt();
        int[] B = new int[m];
        System.out.println("Enter elements for array B");
        obj.getArray(B, m, scan);

        System.out.println("Array A elements are ");

        obj.printArray(A, n);

        System.out.println("Array B elements are ");
        obj.printArray(B, m);

    }
}