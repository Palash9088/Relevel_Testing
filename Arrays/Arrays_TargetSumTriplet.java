public class Arrays_TargetSumTriplet {

    public void TargetSum(int[] arr, int sum)
    {
        for(int i = 0; i< arr.length;i++)
        {
            for (int j = i+1; j<arr.length;j++)
            {
                for(int k = j+1; k<arr.length;k++)
                {
                    if (arr[i] + arr[j] + arr[k] == sum)
                    {
                        System.out.println("sum of " + arr[i] + " " + arr[j]+ " " +  + arr[k]+ " " + " is " + sum);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        int [] arr = {9,3,5,6,7,10,2,11,1};
        int[] arr2 = {1, 2, 4, 9, 0, 3, 5, 8};
        Arrays_TargetSumTriplet sum1 = new Arrays_TargetSumTriplet();


        sum1.TargetSum(arr,12);


    }
}
