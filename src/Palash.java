public class Palash {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in); //to take input from the user
        int num = scan.nextInt();

        boolean isPrime = true;

        for(int i=2; i<num; i++)
        {
            if(num % i == 0)
            {
                isPrime = false; /*change the state of isPrime to false because number is divisible by other numbers */
                break;
            }
        }

        if(isPrime == true) /* if it is a prime number so it will never be entering in the previous if condition so its state will remain true */
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}


    }
}
