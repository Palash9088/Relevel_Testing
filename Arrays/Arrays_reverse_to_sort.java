public class Arrays_reverse_to_sort {
    public boolean CheckIfSorted(int[] arr)
    {
        //for only one element, it will always sorted
        if(arr.length == 1)
        {
            return true;
        }

        //starting from index 1 because we will compare with the previous values
        int i = 1;

        //checking for increasing pattern
        while(i < arr.length && arr[i-1] < arr[i])
        {
            i++;
        }

        //if we have reached the end of the array
        if(i == arr.length)
        {
            return true;
        }

        int j = i;

        //check for decreasing pattern
        while(j < arr.length && arr[j - 1] > arr[j])
        {
            if(i>1 && arr[j] < arr[i-2])
            {
                return false;
            }
            j++;
        }

        //if we have reached the end of the array
        if(j == arr.length)
        {
            return true;
        }

        int k = j;

        if(arr[k] < arr[i-1])
        {
            return false;
        }

        while(k > 1 && k < arr.length)
        {
            if(arr[k] < arr[k-1])
            {
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {

        int [] arr = {2, 3, 9, 8, 5};

        Arrays_reverse_to_sort obj = new Arrays_reverse_to_sort ();

        if (obj.CheckIfSorted(arr) == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
