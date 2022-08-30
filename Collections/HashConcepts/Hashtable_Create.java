package HashConcepts;

import java.util.Hashtable;

public class Hashtable_Create {
    public static void main(String[] args) {

        String [] names = {"Palash", "Priyal", "Palak", "Parth", "Pranjal", "Payal","Palash", "Rahul", "Palak"};

        // Create hashtable
        // key - name, value - count

        Hashtable<String, Integer> hm = new Hashtable<>();
        for (int i = 0;i< names.length;i++)
        {
            if (hm.containsKey(names[i]))  // if key is present we will update it with increment count
            {
                int count = hm.get(names[i]); // this will increment count if present

                count++;

                hm.replace(names[i],count);
            }
            else // if key is not present then add
            {
                hm.put(names[i],1);
            }
        }
        // print hashtable

        System.out.println(hm);
    }
}
