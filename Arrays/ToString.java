import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3, 4, 5,}};
        System.out.println(Arrays.deepToString(arr));

        int [][] arr2 = {{1, 2},{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(arr2));
    }
}