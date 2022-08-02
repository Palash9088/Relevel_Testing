import java.text.ParseException;

public class CountCharacter {
    public static void main(String[] args) throws ParseException {

        String str = "Hello guys how are you";

        String rev = "";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
       /* String date = "17/07/2022 22:22:22";
        Date Date1 = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS").parse(date);
        System.out.println(date);*/
    }
}
