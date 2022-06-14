public class Typecasting1 {
    public static void main(String[] args) {
        double num = 53.7d;
        System.out.println("Before type Casting : " + num);

        //Narrowing type casting
        int newValue = (int) num;
        System.out.println("After type casting : " + newValue);

        float floatvalue = 51.2f;
        System.out.println("Before type Casting : " + floatvalue);

        byte bytevalue = (byte) floatvalue;
        System.out.println("After type Casting : " + bytevalue);
        System.out.println("After type Casting : " + bytevalue);
        System.out.println("After type Casting : " + bytevalue);
        System.out.println("After type Casting : " + bytevalue);


    }
}