package Arrays;//import java.util.*;

public class DuplicateNum {
    static void duplicateNum(int []arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println("Duplicate num is " + arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,3,4,};
        duplicateNum(arr);
    }
}
