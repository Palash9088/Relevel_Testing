package Arrays;//import java.util.*;

import java.util.Scanner;

public class Length {
    void display(String [] name)
    {
        for (int i = 0; i< name.length;i++)
        {
            System.out.println("element is " + name[i] + " length is " +  name[i].length());
        }
    }
    void maxLength(String[] name)
    {
        String maxLen = name[0];

        for (int i=0;i< name.length;i++)
        {
            if(name[0].length() < name[i].length())
            {
                maxLen = (name[i]);
            }
        }
        System.out.println("Maximum name Length String is " + maxLen + " and length of String is " + maxLen.length());
    }
    void getInput()
        {}
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("length of string");
        int size = scan.nextInt();
        String name [] = new String[size];

        for(int i = 0; i<name.length;i++)
        {
            System.out.println("Enter " + (i) + " name:");
            name[i] = scan.next();
        }
        Length length = new Length();
        length.display(name);
        length.maxLength(name);
    }
}
