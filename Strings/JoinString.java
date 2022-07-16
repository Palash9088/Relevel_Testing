public class JoinString {
    public static void main(String[] args) {

        // with operator to join
        String str1 = "Palash ";
        String str2 = "Millonaire";

        String str3 = "Palash ";
        String str4 = "Billionaire";

        String fullname = str1 + str2;
        System.out.println(fullname);

        // with concat function
        System.out.println(str3.concat(str4));

        // with loop
        String [] names = {"Palash ", "Palak ", "Payal ", "Priyal ", "Pranjal ", "Parth"};
        String output = "";

        for (int i=0; i< names.length;i++)
        {
            output = output.concat(names[i]);
        }
        System.out.println(output);

    }
}
