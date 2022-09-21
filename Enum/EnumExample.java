import java.util.Arrays;
import java.util.Scanner;

public class EnumExample {
    public static void main(String[] args) {
        int count = 1;
        int sum =0;
        Scanner scanner = new Scanner(System.in);

        while(count < 10)
        {
             count = scanner.nextInt();
             sum =+ sum + count;
        }
        System.out.println(sum);
        int average = 0;
        System.out.println(average = sum/count);

        int [] arr = new int[10];
        for (int i = 0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
            System.out.println(Arrays.toString(arr));
        }

    }
}
