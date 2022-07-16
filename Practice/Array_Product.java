import java.util.Arrays;
public class Array_Product {
    public int[] productitself (int[] arr)
    {
        int [] output = new int[arr.length];

        int product;

        for (int i = 0; i< arr.length; i++ )
        {
            product = 1;
            for (int j = 0; j< arr.length; j++)
            {
                if (i != j)
                {
                    product *= arr[j];
                }
            }
            output[i] = product;
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {-1, 2, 4, 3};
        int[] arr3 = {10, 3, 5, 6, 2};
        int[] arr4 = {1, 2, 2, 1, 1, 3};

        Array_Product obj = new Array_Product();

        int[] result = obj.productitself(arr1);
        System.out.println(Arrays.toString(result));

        result = obj.productitself(arr2);
        System.out.println(Arrays.toString(result));

        result = obj.productitself(arr3);
        System.out.println(Arrays.toString(result));

        result = obj.productitself(arr4);
        System.out.println(Arrays.toString(result));
    }
}
