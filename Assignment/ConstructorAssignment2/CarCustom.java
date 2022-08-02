package ConstructorAssignment2;//import java.util.*;

public class CarCustom {
    String brandName;
    String modelName;
    String color;
    String engine;
    public CarCustom()
    {
        this.brandName = "Ford";
        this.modelName = "Endeavour";
        this.color = "White";
        this.engine = "Diesel";
    }
    void setCarCustom(String color)
    {
        this.color = color;
    }
    void setCarCustom(String engine, String color)
    {
        this.engine = engine;
    }
    void display()
    {
        System.out.println("Brand name : " + brandName);
        System.out.println("Model Name : " + modelName);
        System.out.println("Color is : " + color);
        System.out.println("Engine type is : " + engine);

    }
}
