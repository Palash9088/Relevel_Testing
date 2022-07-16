import java.util.Arrays;

public class Arrays_DuplicateCheck {
    public static boolean CheckForDuplicate (int[]arr)
    {
        int [] indexarray = new int [10];
        Arrays.fill(indexarray, 0);

        for (int i = 0; i< arr.length; i++)
        {
            if(indexarray[arr[i]] !=0)
            {
                return true;
            }
            else
            {
                indexarray[arr[i]] = 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 2, 4, 1};
        int [] arr2 = {1, 2, 3, 4, 5};

        Arrays_DuplicateCheck obj = new Arrays_DuplicateCheck();

        System.out.println(obj.CheckForDuplicate(arr1));
        System.out.println(obj.CheckForDuplicate(arr2));

    }
}
