package Assignment2;//import java.util.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ElementSearchOnSet {
  /*  static String[] m1()
    {
        ArrayList<String> stdNamesSet = new ArrayList<String>();
        stdNamesSet.add("Palash");
        stdNamesSet.add("Kamlesh");
        stdNamesSet.add("Prateek");
        stdNamesSet.add("Ikshit");
        stdNamesSet.add("Rahul");
        stdNamesSet.add("Bhatti");
        stdNamesSet.add("Palash");

        System.out.println("ArrayList ->"  + stdNamesSet);

        String[] temp = new String[stdNamesSet.size()];
        stdNamesSet.toArray(temp);
        for (String str : temp )
        {
            System.out.println(str);
        }
        return temp;
    }
    */
    public static void main(String[] args) {

        HashSet <String> stdNamesSet = new HashSet<>();
        stdNamesSet.add("Palash");
        stdNamesSet.add("Kamlesh");
        stdNamesSet.add("Prateek");
        stdNamesSet.add("Ikshit");
        stdNamesSet.add("Rahul");
        stdNamesSet.add("Bhatti");
        stdNamesSet.add("Palash");

        System.out.println("HashSet Names list -> " + stdNamesSet);

        // Output : HashSet Names list -> [Rahul, Palash, Kamlesh, Ikshit, Bhatti, Prateek]

        // Convert HashSet in to LinkedHashSet

        LinkedHashSet <String> linkedStdNames = new LinkedHashSet<>(stdNamesSet);

        System.out.println("Linked HashSet -> " + linkedStdNames);

        //Output : Linked HashSet -> [Rahul, Palash, Kamlesh, Ikshit, Bhatti, Prateek]

        //Converting LinkedHashSet into TreeSet

        TreeSet<String> treeSetStdNames = new TreeSet<>(linkedStdNames);
        System.out.println("TreeSet -> " +treeSetStdNames); //Sort into ASCII 
        
        //Output : TreeSet -> [Bhatti, Ikshit, Kamlesh, Palash, Prateek, Rahul]



        // Search for Name in set

        for(String str : stdNamesSet)
        {
            if(str.contains("Kallu"))
            {
                System.out.println("Given name is present in the HashSet");
                break;
            }

            else
            {
                System.out.println("Given name is not present in the HashSet");
                break;
            }
        }

    }
}
