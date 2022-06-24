import java.util.Arrays;

public class Arrays_sort_zero_one {
    public static void main(String[] args) {

        int [] arr = {0, 1, 0, 0, 0, 1, 1, 1};

        int countzero = 0;
        int countone = 0;

        for (int i = 0; i< arr.length; i++)
        {
            if (arr[i] == 0)
            {
                countzero++;
            }
            else
            {
                countone++;
            }
        }
        System.out.println(countzero);
        System.out.println(countone);


        // seed 0s in array
        for (int i = 0; i<countzero ; i++)
        {
            arr [i] = 0;
        }

        // this will update 1s in remaining array

        for (int i=countzero ; i< arr.length; i++)
        {
            arr[i] = 1;
        }

        System.out.println(Arrays.toString(arr));

    }
}
