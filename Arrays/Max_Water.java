public class Max_Water {
    public int MaxWater (int [] arr)
    {
        int maxArea = 0;
        int left = 0;
        int right = arr.length-1;

        while (left<right)
        {
            int currentarea = Math.min(arr[left], arr[right] * (right-left));
            maxArea = Math.max(maxArea, currentarea);

            // if left value is smaller than right one then update left
            if (arr[left]<arr[right])
            {
                left++;
            }
            // if right is smaller than the left then update right
            else
            {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {

        int height [] = {1,8,6,2,5,4,8,3,7,9,8,9};

        Max_Water obj = new Max_Water();

        System.out.println(obj.MaxWater(height));

    }
}
