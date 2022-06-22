public class Object {
    // accessing properties using object
    int memory = 256;
    String color = "Black";
    String model = "iphone13";
    boolean is5Gsupported = true;

    public static void main(String[] args) {
        Object phn = new Object();
        System.out.println("Phone model is " + phn.model);
        System.out.println("Phone memory is " + phn.memory);
        System.out.println("Phone color is " + phn.color);
        System.out.println("Is 5G supported " + phn.is5Gsupported);

    }
}
