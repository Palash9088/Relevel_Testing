package CalcPerimeterAndArea;//import java.util.*;

public class Result {
    public static void main(String[] args) {
        float perimeter = Rectangle.calcPerimeter(5.5f,10.5f);
        System.out.println("\nPerimeter of Rectangle is "+ perimeter);

        float area = Rectangle.calcArea(15,20);
        System.out.println("Area of Rectangle is " + area);

        float squarePeri = Square.calcSquarePeri(23.5f);
        System.out.println("\nPerimeter of Square is  " + squarePeri);

        float squareArea = Square.calcSquareArea(12.5f);
        System.out.println("Area of Square is " + squareArea);
    }
}
