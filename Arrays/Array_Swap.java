import java.util.Arrays;

public class Array_Swap {
    public void swapValues (int [] arr, int i,int j )
    {
        int temp = arr [i];
        arr [i] = arr[j];
        arr [j] = temp;
    }
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4};

        System.out.println("Before Swapping");
        System.out.println(Arrays.toString(num));

        Array_Swap obj = new Array_Swap(); // function call

        obj.swapValues(num, 0, 3);

        System.out.println("After Swapping");
        System.out.println(Arrays.toString(num));

        obj.swapValues(num, 1, 2);

        System.out.println("After Swapping");
        System.out.println(Arrays.toString(num));


    }
}
