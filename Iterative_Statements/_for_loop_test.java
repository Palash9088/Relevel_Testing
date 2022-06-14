public class _for_loop_test {
    public static void main(String[] args) {
        for (int i=1 ; i<=4 ; i++)
        {
            if (i==1)
            {
                System.out.println("For first transaction do not add the delivery charges");
                continue;
            }
            System.out.println("Delivery charges will be included for " + i + " order");
        }
    }
}
