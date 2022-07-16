public class Max_Profit {
    public static void main(String[] args) {
        int maxProfit = 0;
        int[] price = {10, 20, 30, 40, 5, 8, 30, 70};

        for (int i=1; i<price.length ; i++)
        {
            // if today's price is greater than the y'day's price
            if (price [i-1] < price[i])
            {
                maxProfit = maxProfit + (price[i] - price [i-1]);

            }
        }
        System.out.println("Maximum profit is " +  maxProfit);
    }
}
