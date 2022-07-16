public class ArrayFrequency {
    public static void main(String[] args) {

        String str = "aakanksha";
        char arr [] = str.toCharArray();
        int count = 0;
        int freq[] = new int [str.length()];
        for (int i=0; i<=str.length()-1; i++)
        {
            count = 0; // reinitialize to zero to avoid double count of characters

            for (int j=i+1; j<=str.length()-1; j++)
            {

                if (arr[i] == arr[j])
                {
                   freq[i]++;
                   count++;
                }
            }
            System.out.println("Frequency of character " + arr[i]  + " is " + freq[i]);
           // System.out.println("Frequency of character " + arr[i]  + " is " + count);
        }
    }
}
