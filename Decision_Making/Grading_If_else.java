public class Grading_If_else {
    public static void main(String[] args) {
        // Grading System
        int marks = 89;
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
        }
    }
}
