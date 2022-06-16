public class Pattern_incresing_decresing {
    public static void main(String[] args) {
        // Pattern printing
        // i is running 5 to 0 that means it is taking values - 5, 4, 3, 2, 1, 0
        for (int i = 5; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }
}
