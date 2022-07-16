import java.util.Arrays;

public class Array_Swapping {
    public void ArraySwap (int [] arr, int i, int j)
    {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
    }

     public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4};

         // using index values
       /* Array_Swap obj = new Array_Swap();
        obj.swapValues(arr, 0,3);

        System.out.println(Arrays.toString(arr));*/

         Array_Swapping obj = new Array_Swapping();

         int start = 0;
         int end = arr.length-1;

         while(start<=end)
         {
             obj.ArraySwap(arr,start,end);
             start++;
             end--;
         }
         System.out.println(Arrays.toString(arr));
     }
}

