package CalcPerimeterAndArea;//import java.util.*;

public class Rectangle {
    float length;
    float breadth;

    public static float calcPerimeter(float length,float breadth)
    {
        float perimeter = 2 * (length + breadth);

        return perimeter;
    }
    public static float calcArea(float length, float breadth)
    {
        float area = length * breadth;
        return area;
    }
}
