public class Human {

    String humanName;
    boolean canSpeak;
    int humanAge;

    void behaviour(String name,int age)
    {
        humanName = name;
        humanAge = age;
    }
    void setCanSpeak (boolean flag)
    {
        canSpeak = flag;
    }
    void display ()
    {
        System.out.println("Human name is " + humanName);
        System.out.println("Can this human speaks " + canSpeak);
        System.out.println("Age of this human" + humanAge);
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.behaviour("Palash", 26);
        human.setCanSpeak(true);
        human.display();
    }
}
