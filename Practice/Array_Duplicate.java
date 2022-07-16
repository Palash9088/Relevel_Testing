public class Array_Duplicate {
    public boolean duplicatefind (int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1;j< arr.length;j++ )
            {
                if (arr[i] == arr[j])
                {
                    System.out.println("Value found is " + arr[i]);
                    return true;
                }
            }
        }
        System.out.println("Value not found");
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 1, 2};
        Array_Duplicate obj = new Array_Duplicate();

        System.out.println(obj.duplicatefind(arr));

    }
}
