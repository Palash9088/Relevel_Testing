public class Assignment  {
    public void OddIndexSquareSum(int arr[])
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if (i%2 != 0)
            {
                sum = sum + (int) Math.pow(arr[i],2);
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
    Assignment assignment = new Assignment();
    int arr [] = {1,4,5,7,3,11};
    assignment.OddIndexSquareSum(arr);
    }
}
