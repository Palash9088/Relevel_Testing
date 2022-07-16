import java.util.Hashtable;

public class Hashtable_Length {
    public static void main(String[] args) {

        String str = "geeksforgeeks";

        // create hashtable
        // Key - Character, Value = count = integer
        Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();

        for (int i = 0; i<str.length(); i++)
        {
            // if key is present then update it with count
            if (hm.containsKey(str.charAt(i)))
            {
                int count = hm.get(str.charAt(i));

                count++;

                hm.replace(str.charAt(i), count);
            }
            else
            {
                hm.put(str.charAt(i),1);
            }
        }
        System.out.println(hm.toString());
    }
}
