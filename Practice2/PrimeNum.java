public class PrimeNum {

    void isPrime(int num)
    {
        boolean flag = true;
        for(int i=2; i<num;i++)
        {
            if (num % i ==0 )
            {
                flag = false;
                break;
            }
        }

        if(flag == true)
        {
            System.out.println(num + " Num is Prime number");
        }
        else
        {
            System.out.println(num + " Number is not Prime number");

        }
    }

    public static void main(String[] args) {
        PrimeNum primeNum = new PrimeNum();
        primeNum.isPrime(15);
        primeNum.isPrime(16);
        primeNum.isPrime(17);
    }
}
