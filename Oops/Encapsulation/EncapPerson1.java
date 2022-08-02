package Encapsulation;

public class EncapPerson1 {
    // state / Variable - name
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void displayName()
    {
        System.out.println(name);
    }
}
