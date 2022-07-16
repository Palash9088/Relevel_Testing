public class p {
    public static void main(String[] args) {

        String str = "abaacca";

        int sI = 3;
        int eI = 6;

        String result1 = "";
        String result2 = "";

        for (int i = 3; i <= eI; i++) {
            result1 = result1 + str.charAt(i);
        }
        System.out.println(result1);

        for (int i = eI; i >= 3; i--) {
            result2 = result2 + str.charAt(i);
        }
        System.out.println(result2);

        if (result1.equals(result2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

