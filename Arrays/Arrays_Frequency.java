import java.util.Hashtable;

public class Arrays_Frequency {
    public static void main(String[] args) {

        String[] colors = {"red", "yellow", "green", "red", "green"};

        Hashtable<String, Integer> hm = new Hashtable<String, Integer>();
        // Create hashtable

        for (int i = 0; i<colors.length; i++)
        {
            if(hm.containsKey(colors[i]))
            {
                int count = hm.get(colors[i]);
                count++;

                hm.replace(colors[i], count);
            }
            else
            {
                hm.put(colors[i],1);
            }
        }
        // print
        System.out.println(hm.toString());
    }
}
