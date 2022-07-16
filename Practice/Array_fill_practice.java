import java.util.Arrays;
import java.util.Collections;

public class Array_fill_practice {
    public static void main(String[] args) {

        int [] arr = new int [5];
        /*Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));*/

        int [] arr1 = {1, 2, 4 ,5 , 6 ,9 ,10 , 11};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int arr2 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(new int[][]{arr2}, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));


    }
}
