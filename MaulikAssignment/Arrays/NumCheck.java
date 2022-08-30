package Arrays;//import java.util.*;

import java.util.Arrays;

public class NumCheck {
    static void numberCheck(int[] arr, int toCheckNum)
    {
        boolean flag = false;
        int count = 0;
        for(int i =0;i<arr.length;i++)
        {

            if (arr[i] == toCheckNum && arr[i] == toCheckNum)
            {
                flag = true;
                count++;
            }

        }
        System.out.println("Given number " + toCheckNum +  " is present in predefined array." + flag +
                " frequency of " + toCheckNum + " is " + count);
    }

    public static void main(String[] args) {

        int arr[] = {10,3,9,-99,81,3,-11};

        System.out.println(Arrays.toString(arr));

        numberCheck(arr,6);

    }
}
