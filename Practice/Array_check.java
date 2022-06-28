public class Array_check {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < args.length ; i++)
        {
            for (int j = 0 ; j< arr.length; j++)
            {
                if ((i != j) && arr[i][j] == 0)
                {
                    System.out.println("Diagonal");
                }
            }
        }
    }
}
