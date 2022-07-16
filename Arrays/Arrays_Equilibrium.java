public class Arrays_Equilibrium {
    public int equilibrium (int arr[])
    {
        // before index value sum
        int leftSum = 0;
        // after index value sum
        int rightSum = 0;

        for (int i=0; i< arr.length;i++)
        {
            leftSum = 0;
            rightSum = 0;

            // sum of values before index i
            for(int j=0; j<i; j++)
            {
                leftSum = leftSum + arr[j];
            }
            // sum of values after index i
            for (int j=i+1; j<arr.length;j++)
            {
                rightSum = rightSum + arr[j];
            }

            // compare both sum

            if (leftSum == rightSum)
            {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int [] arr = {1,2,5,1,2,5};
        int arr1 [] = {1,3,5,2,2};

        Arrays_Equilibrium result = new Arrays_Equilibrium();
        System.out.println(result.equilibrium(arr));

        System.out.println(result.equilibrium(arr1));

    }
}
