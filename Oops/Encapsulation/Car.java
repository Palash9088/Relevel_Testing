package Encapsulation;//import java.util.*;

public class Car {
    private int speed;

    public void setSpeed(int speed)
    {
        if (speed>=0)
        {
            this.speed=speed;
        }
        else
        {
            System.out.println("Speed cannot be negative");
        }
    }
    public int getSpeed()
    {
        return this.speed;
    }
    public void displaySpeed()
    {
        System.out.println("Speed is " + this.speed);

    }}
