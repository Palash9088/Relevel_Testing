public class AssignmentString1 {
    public static void main(String[] args) {

        String s1 = "hello How are you Beautiful hopper";
        int  count;
        char string [] = s1.toCharArray();

        for (int i = 0; i< string.length; i++)
        {
            count=1;
            for (int j = i+1; j< string.length;j++)
            {
                if (string[i] == string [j] && string[i] != ' ')
                {
                    count++;
                    string[j] = 0;
                }
            }
            if (count>1 && string[i] != 0 )
            {
                System.out.println("Duplicate character is : " + string[i] + " count is " + count + " times");
            }
        }

    }
}
