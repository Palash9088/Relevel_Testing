public class LambdaOddEven {
    public static void main(String[] args) {

        IOddEven lambda = (num -> {
           if(num%2==0)
           {
               System.out.println(num + " is even number ");
           }
           else
           {
               System.out.println(num + " is odd num");
           }
        });
        lambda.oddEven(20);
        lambda.oddEven(21);
    }
}