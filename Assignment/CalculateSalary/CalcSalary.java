package CalculateSalary;//import java.util.*;

public class CalcSalary {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setDetails("Palak",28,123456789,"Pune",200000,"QA","Sr. QA ");
        manager.display();


        Developer developer = new Developer();
        developer.setDetails("Rahul", 28,123456789,"Seoni",80000,"Software Development","Sr. Developer");
        developer.display();
    }
}
