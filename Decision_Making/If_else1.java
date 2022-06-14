public class If_else1 {
    public static void main(String[] args) {
        int  num = 8;
        String output = (num > 2) ? (((num>4) ? (num > 6)?"Number is greater than 6" :"num is grater than 4" : " Number is greater than 2")) : "number is less than 2";
        System.out.println(output);

        num = 6;
        if (num%2==0)
        {
            if(num %3 == 0){
                System.out.println("The number is even & Divisible by 3");
            }
        }
        else
        {
            System.out.println("This is odd number");
        }

    }
}
