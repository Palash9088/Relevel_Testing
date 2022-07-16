import java.util.Arrays;

public class Assignment_7 {
    /*1. We are given an Array of integers having both negative and positive numbers.
    We have to return an Array which will have all the negative numbers on the left side
    and all the positive numbers on the right side.
    */
    public static int[] arrangeNums(int[] nums) {
        int first = 0;
        int last = nums.length - 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = nums[i];
                nums[i] = nums[first];
                nums[first] = temp;
                first++;

            } else {
                int temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
                last--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrangeNums(new int[]{2,50,1,-3,4,-17})));
        System.out.println(Arrays.toString(arrangeNums(new int[]{1,-2,3,-14,-4,3,2,1})));

    }
}
