public class Loops {
    public static void main(String[] args) {

        for (int i = 10 ; i<=15 ; i++)
        {
            if (i%2 == 0)
            {
                System.out.println(i + " is even number");
            }
        }

        for (int i = 10 ; i<=30 ; i++)
        {
            if (i%5 == 0)
            {
                System.out.println(i + " is divisible by 5");
            }
        }

        for (int i = 5 ; i<=18 ; i++)
        {
            if(i%5 ==0 && i%3 == 0)
            {
                System.out.println("Number divisible by 5 & 3 is " + i);
            }
        }

        System.out.println("Divisible by 7 or 13, numbers are");
        for (int i = 5 ; i<=40 ; i++)
        {
            if(i%7 ==0 || i%13 == 0)
            {
                System.out.println(i + " divisible by "+ i);
            }
        }

    }
}
