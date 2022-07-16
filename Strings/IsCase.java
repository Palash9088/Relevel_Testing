public class IsCase {
    public static void main(String[] args) {

        String str = "1rRpd3F9#K(Epalash";
        int letter = 0;
        int digits = 0;
        int uppercase = 0;
        int lowercase = 0;
        int specialchar = 0;

        for (int i=0; i<str.length(); i++)
        {
            if (Character.isUpperCase(str.charAt(i)))
            {
                uppercase++;
            }
            if (Character.isLowerCase(str.charAt(i)))
            {
                lowercase++;
            }
            if (Character.isDigit(str.charAt(i)))
            {
                digits++;
            }
            if(Character.isLetter(str.charAt(i)))
            {
                letter++;
            }
            else
            {
                specialchar++;
            }

        }
        System.out.println("Letters count " + letter);
        System.out.println("Digits count " + digits);
        System.out.println("Uppercase count " + uppercase);
        System.out.println("Lowercase count " + lowercase);
        System.out.println("Special characters count " + specialchar);
    }
}
