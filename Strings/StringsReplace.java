public class StringsReplace {
    public static void main(String[] args) {
        String name1 = "This is really funny bunny";

        System.out.println(name1.replace('n','L')); // this will replace n with L

        System.out.println(name1.replace('L', 'k')); // if character not exist in string then return same

        System.out.println(name1.replace("bunny", "money")); // this will replace string

        System.out.println();

    }
}
