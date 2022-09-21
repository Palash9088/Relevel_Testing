package HashConcepts;

import java.util.HashMap;
public class Hashtable_Example {
    public static void main(String[] args) {

        // Creating hashtable
        HashMap<Integer,String> hm = new HashMap<>();

        // to add value into Hashtable
        System.out.println(hm.put(1,"Yellow"));
        System.out.println(hm.put(1,"Red"));
        System.out.println(hm);
       /* hm.put("Yellow", 2);
        hm.put("Green", 3);
        hm.put("White", 4);
        hm.put("Black", 5);
        hm.put("Blue", 6);

        System.out.println(hm);

        // to remove
        hm.remove("Yellow");

        // to print
        System.out.println(hm.toString());

        //add value in table
        hm.put("Yellow", 3);

        // Print after adding
        System.out.println("Yellow became 3 " + hm.toString());

        //to replace
        hm.replace("Blue",10);
        System.out.println("Blue value is replaced with 10  " + hm.toString());

        // print the value of blue

        System.out.println(hm.get("blue")); // didn't give as B is not in capital letter
        System.out.println("Value of Blue is " + hm.get("Blue"));

        // to increase the value by 1

        int countofBlue = hm.get("Blue");

        countofBlue++; // this will increase by one

        // to update in dictionary

        hm.replace("Blue", countofBlue);
        System.out.println( "updated blue value" + hm.toString());

        // to check for any key
        hm.containsKey("Blue");
        System.out.println(hm.containsKey("Blue"));
        System.out.println(hm.containsKey("Violet"));

        // to check if contains or not

        boolean isany  = hm.containsKey("Purple");
        System.out.println(isany);*/
    }
}
