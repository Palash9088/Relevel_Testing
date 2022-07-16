import java.util.Arrays;
import java.util.Collections;

public class Array_Sort {
    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 5, 3};

        // to arrange in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] nums = {4, 1, 9, 2, 6};
        //to arrange in descending order
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));

        String[] names = {"xyz" , "abc", "lmn", "pqr"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        char[] characterArray = {'b', 'a', 'd', 'e', 'c'};
        Arrays.sort(characterArray);
        System.out.println(Arrays.toString(characterArray));



    }
}
