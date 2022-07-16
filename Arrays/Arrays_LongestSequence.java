import java.util.Arrays;

public class Arrays_LongestSequence {
    public int longestSequence (int [] arr)
    {
        Arrays.sort(arr);

        int maxSoFar = Integer.MIN_VALUE, count = 1;
        for (int i = 0; i<arr.length-1; i++)
        {
            if (arr[i] + 1 == arr[i+1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            maxSoFar = Math.max(count, maxSoFar);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {

        int [] arr= {3,4,7,5,6,9,11,12};
        int [] arr1 = {11, 12, 16, 20, 22, 24, 14, 15, 21};

        Arrays_LongestSequence result = new Arrays_LongestSequence();

        System.out.println(("Longest Sequence is ") + result.longestSequence(arr));
        System.out.println(("Longest Sequence is ") + result.longestSequence(arr1));

    }
}
