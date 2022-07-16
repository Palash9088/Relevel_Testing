import java.util.Hashtable;

public class NonRepeatingElements {

    public void findNonRepeating (int[] arr)
    {
        Hashtable <Integer, Integer> hashtable = new Hashtable <Integer, Integer>();

        for(int i = 0; i<arr.length; i++)
        {
            // Update hashtable
            if (hashtable.containsKey(arr[i]))
            {
                int count = hashtable.get(arr[i]);
                count++;
                hashtable.replace(arr[i],count);
            }
            else
            {
             // add empty entry into hashtable
             hashtable.put(arr[i],1);
            }
        }
        // iterate over hashtable
        hashtable.forEach((key,value)->
        {
            if (value ==1)
            {
                System.out.println(key + " is non repeating");
            }
        });
    }
    public static void main(String[] args) {

        int nums1[] =  {1, 2, 3, 3, 2, 5};

        NonRepeatingElements result = new NonRepeatingElements();
        System.out.println("From 1st Array");
        result.findNonRepeating(nums1);
    }
}
