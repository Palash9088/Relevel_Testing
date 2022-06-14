public class Continue_Statement {
    public static void main(String[] args) {
        // Continue statement

        for (int i=0 ; i<=4 ; i++)
        {
            if (i==2)
            {
                System.out.println("Skipping the value");
                continue;
            }
            System.out.println(i);
        }
    }
}
