public class SubString {
    public static void main(String[] args) {

        String str = "performax";

        System.out.println(str.substring(6,8)); // starts with index zero & ends with endindex-1

        System.out.println(str.substring(6,8+1)); // as we need last index

        System.out.println(str.substring(3)); // it will return value from 2 to last index
    }
}
