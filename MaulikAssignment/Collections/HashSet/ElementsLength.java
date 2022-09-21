package Collections.HashSet;//import java.util.*;

import java.util.LinkedHashSet;
import java.util.List;

public class ElementsLength {
    public static void main(String[] args) {

        String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};

        LinkedHashSet<String> nameSet = new LinkedHashSet<>(List.of(input));

        System.out.println("Name list : " + nameSet);

        for(String nameSet1 : nameSet)
        {
            if(nameSet1.length()>1)
            {
                nameSet1.length();
                System.out.println(nameSet1 + " -> " + (nameSet1.length()));
            }
        }
        System.out.println("Total Unique Elements are :  " + nameSet.size());
     }
}
