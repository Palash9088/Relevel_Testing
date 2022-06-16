import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
                /*Program to input the cost price and the selling price of an object.
        If the selling price is more than the cost price then calculate and display actual profit and profit per cent otherwise,
        calculate and display actual loss and loss per cent. If the cost price and the selling price are equal,
        the program displays the message 'Neither profit nor loss
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost price");
        int cp = sc.nextInt();

        System.out.println("Enter Selling price");
        int sp = sc.nextInt();

        if (sp>cp)
        {
            int profit = sp-cp;
            float profitpercentage = (profit*100)/cp;
            System.out.println("Profit = " + profit + " & Profit percentage is "  + profitpercentage);
        }
        else
        {
            int loss = (cp-sp);
            float losspercentage = (loss*100)/cp;
            System.out.println("Loss = "  + loss + " Loss percntage is " + losspercentage);
        }

        // Another way of doing it

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost price");
        int cp = sc.nextInt();

        System.out.println("Enter Selling price");
        int sp = sc.nextInt();
        int diffrencecost = sp-cp;
        float percentage = (diffrencecost*100)/cp;

        if (diffrencecost>0) // if diffrence in cost is positive then it is profit
        {
            System.out.println("Profit = " + diffrencecost + " & Profit percentage is "  + percentage);
        }
        else //if difference in cost is Negative then it is
        {
            System.out.println("Loss = "  + Math.abs(diffrencecost) + " Loss percntage is " + Math.abs (percentage));
        }*/
    }
}
