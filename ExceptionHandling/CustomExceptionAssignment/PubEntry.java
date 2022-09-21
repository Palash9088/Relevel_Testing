package CustomExceptionAssignment;//import java.util.*;

import java.util.Scanner;

public class PubEntry {
    public void entryAge(int age)
    {
        if(age<18) throw new AgeVerifyException("Users with age below 18 are not allowed to register");
        else
        {
            System.out.println("Welcome");
        }
    }
    public static void main(String[] args) {
        PubEntry pubEntry = new PubEntry();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        try {
            pubEntry.entryAge(age);
        }
        catch (AgeVerifyException ae)
        {
            System.out.println(ae.getMessage());
        }
        finally {
            System.out.println("Thank-you for coming");
        }

    }
}
