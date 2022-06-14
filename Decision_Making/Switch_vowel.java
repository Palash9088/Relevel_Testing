public class Switch_vowel {
    public static void main(String[] args) {
        // using Switch
        char letter = 'k';
        switch (letter)
        {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }

        //redefined switch

        char let = 'm';
        switch (let)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }
    }
}
