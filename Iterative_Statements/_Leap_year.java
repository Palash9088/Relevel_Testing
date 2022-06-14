public class _Leap_year {
    public static void main(String[] args) {
        // LEAP YEAR


        int year = 2021;

        if (year % 4 == 0) // modu by 4 & remainder is zero called leap year
        {
            System.out.println("This is a Leap year");
        }
        else
            System.out.println("This is not a leap year");
    }

}
