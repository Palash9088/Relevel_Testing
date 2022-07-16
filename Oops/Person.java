import java.util.Scanner;

public class Person {
    String name;
    int age;
    String gender;

    public Person (String personName, int pAge, String pGender) // Parameterized constructor
    {
        name = personName;
        age = pAge;
        gender = pGender;
    }
    public void printDetails()
    {
        System.out.println("Person name is : " + name);
        System.out.println("Person age is : " + age);
        System.out.println("Person gender is : " + gender);
    }

    public void sleep(String sleepType)
    {
        System.out.println("sleep " + sleepType);
    }
    public void eats(String eatType)
    {
        System.out.println("eats " + eatType);
    }
    public void walk(String walkType)
    {
        System.out.println("walks " + walkType);
    }
    public void work(String workType)
    {
        System.out.println("works at " + workType);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter person name");
        String name1 = scan.nextLine();

        System.out.println("Enter person age");
        int age1 = scan.nextInt();

        System.out.println("Enter person gender");
        String gender1 = scan.next();

        Person person = new Person(name1, age1,gender1);
        person.printDetails();
        person.sleep("less");
        person.work("Efficiently");
        person.eats("fast");










    }
}
