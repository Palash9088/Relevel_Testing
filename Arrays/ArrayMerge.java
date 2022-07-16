import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {

        int arr [] = {5, 8, 6, 7,13};
        int arr2[] = {10, 9, 12, 11};

        int [] mergedArray = new int [arr.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // assigning array arr value to merged array
        while (i<arr.length)
        {
            mergedArray[k] = arr[i]; // assigned value of arr[i] to merged array [k]
            i++;
            k++;
        }
        System.out.println( "Merged 1st array values to array 3 (mergedArray) " + Arrays.toString(mergedArray));

        while (j<arr2.length)
        {
            mergedArray [k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(mergedArray));


    }
}
