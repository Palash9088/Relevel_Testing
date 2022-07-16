public class Car {
    String company;
    Boolean flag;
    double speed;

    void carSpecs (String comp, boolean automatic, double topspeed)
    {
        company = comp;
        flag = true;
        speed = topspeed;
    }
    void display()
    {
        System.out.println("Company name is " + company);
        System.out.println("Car is automatic " + flag);
        System.out.println("Top speed is " + speed);
    }
    public static void main (String[] args)
    {
        Car car = new Car();
        car.carSpecs("Aston Martin",true, 160.5);
        car.display();
    }
}
