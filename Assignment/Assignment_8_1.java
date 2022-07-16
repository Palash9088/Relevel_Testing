public class Assignment_8_1 {

    /*-2: Write code for finding the smallest element in an array.
    */
    public int smallestElement (int arr[])
    {
        int min = arr[0];
        for(int i=0; i< arr.length;i++)
        {
            if (arr[i]<min)
            {
                 min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 5, 7, 8, 9, -8};

        Assignment_8_1 min = new Assignment_8_1();

        System.out.println(min.smallestElement(arr));
    }
}
