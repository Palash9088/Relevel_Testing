public class Assignment_6_1 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum=0;
        int count = 0;

        for (int i = 1; i<= arr.length-2; i++)
        {
            sum = sum + arr[i];
            count++;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
