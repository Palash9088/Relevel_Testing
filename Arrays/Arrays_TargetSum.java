public class Arrays_TargetSum {
    public void targetSum (int [] arr, int sum)
    {
        for (int i = 0; i< arr.length;i++)
        {
            for (int j = i+1; j<arr.length;j++)
            {
                if (arr[i] + arr[j] == sum)
                {
                    System.out.println("Sum of " + arr[i] + " & " + arr[j] + " is " + sum );
                }
            }
        }

    }    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 8, 0, 4, 5};
        int [] arr1 = {1,5,4,2,3,3};

        Arrays_TargetSum result = new Arrays_TargetSum();

        result.targetSum(arr1,6);


    }
}
