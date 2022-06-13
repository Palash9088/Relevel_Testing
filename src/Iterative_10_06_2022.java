public class Iterative_10_06_2022 {
    public static void main(String[] args) {
        // iterative statement for loop
        /*for (int i=0 ; i<10 ; i++)// i = starting no. (from zero// ), i<10 = condition till no. of times(here 10 times), i++ increment of value
        {
            System.out.println("Hello for loop");
        }
            System.out.println("end of the loop");
        */

        // Another Condition

        /*int i;  // another way of doing it
        for (i=1;i<=10;i++)
        {
            System.out.println(" hello " + i);
        }
            System.out.println("end of the loop");
         */

        // in reverse order
        /*int i;
        for (i=100;i>=1;i--)
        {
            System.out.println(i);
        }*/

        // print table of n
        /*int n = 146 , i;
        for (i=1 ; i<=10 ; i++)
        {
            System.out.println( n + " x " + i + " = " + (n*i));
        }
        System.out.println("end of the loop");*/

        // in reverse order
        /*int n = 146 , i;
        for (i=10 ; i>=1 ; i--)
        {
            System.out.println( n + " x " + i + " = " + (n*i));
        }
        System.out.println("end of the loop");
         */

        // using while loop
        // Printing 1 to 5
        /*int i=1;

        while (i<=10)
        {
            System.out.println(i);
            i++;
        }*/


        //Writing it reverse

       /* int i=10;

        while (i>=1)
        {
            System.out.println(i);
            i--;
        }*/

        // do while loop

        /*int i = 5 ;
        do
        {
            System.out.println(i);
            i--;
        }
        while (i>=6);
        System.out.println("End of do while loop");*/

        // Break jump statement based upon the condition i:e i = = 4

       /* int i;
        for (i = 0 ; i<=5 ; i++)
        {
            if (i == 4)
            {
                break;
            }
            System.out.println(i);
        }*/

        // Continue statement

        /*for (int i=0 ; i<=4 ; i++)
        {
            if (i==2)
            {
                System.out.println("Skipping the value");
                continue;
            }
            System.out.println(i);
        }*/

        /*for (int i=1 ; i<=4 ; i++)
        {
            if (i==1)
            {
                System.out.println("For first transaction do not add the delivery charges");
                continue;
            }
            System.out.println("Delivery charges will be included for " + i + " order");
        }*/

        // LEAP YEAR

        /*
        int year = 2021;

        if (year % 4 == 0) // modu by 4 & remainder is zero called leap year
        {
            System.out.println("This is a Leap year");
        }
        else
            System.out.println("This is not a leap year");*/
        int j=1, i=1;
        while(j<3)
        {
            do
            {
                System.out.print(i + ",");
                i++;
            }while(i<4);
            j++;
        }

    }
}
