public class Arrays_MathMaxMin {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] nums = {1, 4, 6, 8, 7, -10, 10, 20};

        for (int i = 0; i < nums.length; i++)
        {
            // if max is less than nums then it will update value of max
            max = Math.max(max, nums[i]);

            // if min is less than nums then it will update value of min
            min = Math.min(min, nums[i]);
        }
        System.out.println(max);

    }
}
