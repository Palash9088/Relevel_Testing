import java.util.Arrays;

public class Arrays_sort_zero_one_two {
    public static void main(String[] args) {

        int [] arr = {0, 1, 2, 1, 0, 2, 2, 1, 2, 1, 0, 0 };
        System.out.println("Before Array");
        System.out.println(Arrays.toString(arr));

        int countzero = 0;
        int countone = 0;
        int counttwo = 0;

        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] == 0)
            {
                countzero++;
            }
            else if(arr[i] == 1)
            {
                countone++;
            }
            else if (arr [i] == 2)
            {
                counttwo++;
            }
        }
        System.out.println("Count of zero " + countzero);
        System.out.println("Count of one " + countone);
        System.out.println("Count of two " + counttwo);

        // Placing the value in Array
        for (int i = 0; i<countzero; i++)
        {
            arr[i] = 0;
        }
        for (int i = countzero; i < countzero + countone ; i++)
        {
            arr[i] = 1;
        }
        for (int i= countzero + countone; i<arr.length; i++)
        {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
