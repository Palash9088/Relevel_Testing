import java.util.Arrays;

public class Arrays_Swap_loop {

    public void swapValues (int [] arr, int i,int j )
    {
        int temp = arr [i];
        arr [i] = arr[j];
        arr [j] = temp;
    }
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Before Swapping");
        System.out.println(Arrays.toString(num));

        Array_Swap obj = new Array_Swap(); // function call

        int start = 0;
        int end = num.length-1;

        while (start<= end)
        {
            obj.swapValues(num, start, end);
            start++;
            end--;
            System.out.println(Arrays.toString(num));

        }
        System.out.println(Arrays.toString(num));

    }
}
