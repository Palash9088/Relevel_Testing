import java.util.Arrays;

public class Arrays_FlipImage {
    public int[][] invertimage(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                arr[i][j] = arr[i][j] == 0 ? 1 : 0;
            }
        }
        return arr;
    }

    public void swap(int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public int[][] flipimage (int[][]arr)
    {
        for (int i = 0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length/2; j++)
            {
                int index = arr.length - 1 - j;
                swap(arr[i], j , index);
            }
        }
        return arr;

    }    public static void main(String[] args) {

        int [][] arr1 = {{1, 1, 0}, {1,0,1}, {0,1,0}};
        int [][] arr2 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 0, 1}};

        System.out.println("Before swap " + arr1);
        System.out.println("Before Swap " + arr2);

        Arrays_FlipImage obj = new Arrays_FlipImage();

        int [][]invertedarray = obj.invertimage(arr1);
        int [][]flipimage = obj.flipimage(arr1);
        System.out.println(Arrays.deepToString(flipimage));

        invertedarray = obj.invertimage(arr2);
        flipimage = obj.flipimage(arr2);
        System.out.println(Arrays.deepToString(flipimage));
    }
}
