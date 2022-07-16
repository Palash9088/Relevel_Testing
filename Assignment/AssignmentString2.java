public class AssignmentString2 {
    public static void main(String[] args) {

        String str = "Hello Java";
        String rev = " ";
        int length = str.length();

        System.out.println(length);

        for (int i = length-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
            System.out.println("Character at index " + i + " " + str.charAt(i));
        }

        System.out.println(rev + " is reverse character");
    }
}
