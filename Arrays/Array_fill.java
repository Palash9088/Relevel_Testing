import java.util.Arrays;

public class Array_fill {
    public static void main(String[] args) {

        // Size of 4
        int arr [] = new int [4];
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));


    }
}
