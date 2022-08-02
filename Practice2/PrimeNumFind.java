public class PrimeNumFind {
    boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
        {

            if (i % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumFind obj = new PrimeNumFind();

        int N = 100;
        int CountPrime = 0;
        int CountNonPrime = 0;
        for (int i=2;i<=N;i++)
        {
            if (obj.isPrime(i))
            {
                System.out.println(i + " ");
            }
        }
            /*{
                CountPrime++;
            }
            else
            {
                CountNonPrime++;
            }
        }
        System.out.println(CountPrime);
        System.out.println(CountNonPrime);*/
    }
}
