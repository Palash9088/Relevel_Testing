package Assignment;//import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementSearch {
    void integerElementInputToSearch(ArrayList<Integer> list, int numSearch)
    {
        ArrayList<Integer> tempList = new ArrayList<>(list);

        if(tempList.contains(numSearch))
        {
            System.out.println("Given Integer " + numSearch + " is present in the arraylist");
        }
        else {
            System.out.println("Given Integer " + numSearch + " is not present in the arraylist");
        }
    }
    void stringElementInputToSearch(ArrayList<String> list, String name)
    {
        ArrayList<String> tempList = new ArrayList<>(list);

        if(tempList.contains(name))
        {
            System.out.println("Given String " + name + " is present in the arraylist");
        }
        else {
            System.out.println("Given String " + name + " is not present in the arraylist");
        }
    }

    public static void main(String[] args) {
        ElementSearch elementSearch = new ElementSearch();
        Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> numberList = new ArrayList<Integer>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        numberList.add(60);
        numberList.add(80);

       System.out.println("Your list is : " + numberList);
       System.out.println("Enter number to search");
       int numSearch = scanner.nextInt();
       elementSearch.integerElementInputToSearch(numberList,numSearch);

       /*ArrayList <String> nameList = new ArrayList<>();
       nameList.add("Palash");
       nameList.add("Yadav");
       nameList.add("Calak");
       nameList.add("Palak");
       nameList.add("Parth");

        System.out.println(nameList.indexOf("kapil"));
       System.out.println("Enter name to search in the String");
       String name = scanner.next();
       elementSearch.stringElementInputToSearch(nameList,name);*/
    }
}

