package Arrays;//import java.util.*;

public class MaximumInArray {

    void max(int [] arr)
    {   int max = 0;
        for (int i=0; i<arr.length;i++)
        {

            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    void min(int [] arr)
    {   int min = arr[0];
        for (int i=0; i<arr.length;i++)
        {

            if (arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {

        int [] arr = {-11,-33,-44,-55,1,2,3,4,5,6,7,8,9,10};

        MaximumInArray obj = new MaximumInArray();

        obj.max(arr);
        obj.min(arr);
    }
}
