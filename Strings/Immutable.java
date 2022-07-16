public class Immutable {
    public static void main(String[] args) {
        String str1 = "Palash Soni";

        System.out.println(str1.hashCode());

        str1 = "is great man.";

        System.out.println(str1.hashCode());

        /***********************************************
         *  Here string string is allocated to memory
         *  but if you use same variable then it will
         * allocate to another memory slot.
         *
         * different hashcode because of the given condition
         *
         * * the last value cannot be accessed or modified.
         ************************************************/
    }
}
