import java.util.Arrays;

public class Array_Sort_Zero_One {
    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 1, 0, 1, 1, 0, 2, 1, 1, 2, 2, 1};

        int countzero = 0;
        int countone = 0;
        int counttwo = 0;
        for (int i = 0; i<arr.length; i++ )
        {
            if (arr[i] == 0)
            {
                countzero++;
            }
            else if (arr[i] == 1)
            {
                countone++;
            }
            else
            {
                counttwo++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Count of zero " + countzero);
        System.out.println("Count of one " + countone);
        System.out.println("Count of two " + counttwo);

        // to seed

        int i;
        for ( i = 0; i<countzero; i++)
        {
            arr[i] = 0;
        }
        for(i = countzero; i< countzero + countone; i++)
        {
            arr[i] = 1;
        }
        for (i = countzero + countone; i< arr.length; i++)
        {
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
