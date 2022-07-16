import java.util.Arrays;

public class ArraysSwapWave {

    public void swapWave (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortArray (int[] arr, int n)
    {
        Arrays.sort(arr); // sort the array

        // Swap adjacent element
        for(int i = 0; i<n-1; i+=2)
            swapWave(arr,i,i+1);
    }
    public static void main(String[] args) {

        ArraysSwapWave wave = new ArraysSwapWave();

        int[] arr = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};

        int n = arr.length;

        wave.sortArray(arr,n);

        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
