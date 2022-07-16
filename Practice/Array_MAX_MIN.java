public class Array_MAX_MIN {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,9,6,8,4,-1,-2,-3,-10,-11};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i< arr1.length; i++)
        {
            if (max < arr1[i])
            {
                max = arr1[i];
            }

            if (min > arr1[i])
            {
                min = arr1[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
