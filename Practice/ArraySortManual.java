import java.util.Arrays;

public class ArraySortManual {

    public void arraySort(int[] arr)
    {
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                int temp = 0;
                if (arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        ArraySortManual obj = new ArraySortManual();

        int arr [] = {-1,-2,-3,1,2,5,-4,3};

        System.out.println("before sorting array is " + Arrays.toString(arr));
        obj.arraySort(arr);

        System.out.println("after sorting array is " + Arrays.toString(arr));
    }
}
