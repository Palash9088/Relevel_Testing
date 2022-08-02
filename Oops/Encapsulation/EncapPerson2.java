package Encapsulation;

public class EncapPerson2 {
    public static void main(String[] args) {

        EncapPerson1 obj = new EncapPerson1(); // created object of person 1

        obj.setName("Palash");
        System.out.println(obj.getName());

        EncapPerson1 obj1 = new EncapPerson1();
        obj1.setName("Palak");
        System.out.println(obj1.getName());

        EncapPerson1 obj2 = new EncapPerson1();
        obj2.setName("Palak Soni");
        obj2.displayName();

        EncapPerson1 obj3 = new EncapPerson1();
        obj3.setName("Set name 4");
        System.out.println(obj.getName());
    }
}
