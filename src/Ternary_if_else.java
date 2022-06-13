public class Ternary_if_else {
    public static void main(String[] args) {
        //ternary
        /*int age = 16;
        boolean output = (age>=18)? true:false;
        System.out.println(output);*/

        /*int age = 59;
        boolean output = (age>=60)? true:false;
        System.out.println(output);*/

        /*int num = 1;
        String output;

        if (num>=2)
        {
            if (num>=4)
            {
                output = "num is greater than 4";
            }
            else
            {
                output = "Greater than 2 but less than 2";
            }
        }
        else
        {
            output = "Number is less than 2";
        }
        System.out.println(output);*/

        /*int  num = 8;
        String output = (num > 2) ? (((num>4) ? (num > 6)?"Number is greater than 6" :"num is grater than 4" : " Number is greater than 2")) : "number is less than 2";
        System.out.println(output);*/

        /*int num = 6;
        if (num%2==0)
        {
         if(num %3 == 0){
             System.out.println("The number is even & Divisible by 3");
         }
        }
        else
        {
            System.out.println("This is odd number");
        }*/

        // Grading System
        /*int marks = 89;
        if(marks>=90 && marks<=100)
        {
            System.out.println("Grade A");
        }
        else if (marks>=80 && marks<=90)
    {
        System.out.println("Grade B");
    }
        else if (marks>=70 && marks<=80)
        {
            System.out.println("Grade C");
        }
        else if (marks>=60 && marks<=70)
        {
            System.out.println("Grade D");
        }
        else if (marks>=50 && marks<=60)
        {
            System.out.println("Grade E");
        }
        else if (marks>=40 && marks<= 33)
        {
            System.out.println("Grade F");
        }
        else if (marks>=01 && marks<=32)
        {
            System.out.println("Fail");
        }*/

        // Notebook if else
        /*String notebook = "white";
        if ((notebook == "red") || (notebook == "blue") || (notebook == "grey"))
        {
            System.out.println("buy notebook");
        }
        else
        System.out.println("Buy black");
         */

        // using if else
        /*char letter = 'b';
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }*/

        // using Switch
       /* char letter = 'k';
        switch (letter)
        {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }*/
        //redefined switch

        /*char letter = 'm';
        switch (letter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }*/

        // Print max of 3 numbers

        /*int num1 = 7001, num2 = 6001, num3 = 2001;
        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println( "num1 " + num1 + " is largest");
        }
        else if (num2 >= num1 && num2 >= num3) // checking number 2 is greater than num 1 & 3
        {
            System.out.println( "num2 " + num2 + " is largest");
        }
        else  // checking number 3 is greater than num 1 & 2
        {
            System.out.println("num 3 " + num3 + " is largest ");
        }*/

        //Checkout the month of year using switch

        /*int month = 13;

        switch (month)
        {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default :
                System.out.println("Invalid input");
        }*/

        // Determine the Top 10 Mobile Brands
        /*int Brands = 8;

        switch (Brands)
        {
            case 1:
                System.out.println("This is top 1 brand 'Samsung' ");
                break;
            case 2:
                System.out.println(" This is top 2 brandApple");
                break;
            case 3:
                System.out.println("This is top 3 brand Huawei");
                break;
            case 4:
                System.out.println("This is top 4 brand Xiaomi");
                break;
            case 5:
                System.out.println(" This is top 5 brand OPPO");
                break;
            case 6:
                System.out.println("This is top 6 brand Vivo");
                break;
            case 7:
                System.out.println(" This is top 7 brand Motorola");
                break;
            case 8:
                System.out.println("This is top 8 brand Lenovo");
                break;
            case 9:
                System.out.println("This is top 9 brand LG");
                break;
            case 10:
                System.out.println("This is top 10 brand Nokia");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }*/



    }
}