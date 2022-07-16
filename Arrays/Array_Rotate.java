import java.util.Arrays;

public class Array_Rotate {

    public int [] rotatebyK (int [] arr, int k)
    {
        int length = arr.length;
        int [] output = new int [length]; // making new array of same length
        int index = 0;

        for (int i = length-k; i<length; i++) // put last k values in output array
        {
            output [index] = arr[i];
            index++;
        }
        // put remaining values
        for(int i =0 ; i< length-k; i++)
        {
            output[index] = arr[i];
            index++;
        }
        return output;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        Array_Rotate obj = new Array_Rotate();

        int [] result = obj.rotatebyK(arr, 1);
        System.out.println(Arrays.toString(result));


    }
}
