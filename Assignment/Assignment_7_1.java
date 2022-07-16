import java.util.Arrays;

public class Assignment_7_1 {
    public static void main(String[] args) {

/*2. We are given an Array nums consisting of 2n elements in the
form [x1,x2,...,xn,y1,y2,...,yn].
We have to return the Array in the form [x1,y1,x2,y2,...,xn,yn].*/

        int nums [] = {1,2,3,4,5,10,20,30,40,50};
        int n = 5; // no. of terms
        int index = 0;
        int [] new1 = new int[nums.length];

        for (int i = 0; i<nums.length; i++)
        {
            for (int j= 0; j< nums.length;j++)
            {
                if (j%n == i)
                {
                    new1 [index++] = nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(new1));

    }
}
