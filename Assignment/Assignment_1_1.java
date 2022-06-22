public class Assignment_1_1 {
    public static void main(String[] args) {
        int p = 10000;
        float r = 2.5f;
        int t = 6;
        float SI = (p * r * t)/100;
        System.out.println("Rate of Interest is 2.5%" + ",Duration : 6 Months");
        System.out.println("Total Interest is : " + SI);
        float F = SI + p;
        System.out.println("Final amount is : " + F);

    }
}
