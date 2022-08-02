package Sample1;//import java.util.*;

public class ClassTwo extends ClassOne {
    {
    System.out.println(3);
    }
    ClassTwo()
    {
        System.out.println("Cons");
    }

    public static void main(String[] args)
    {
        ClassOne.main(args);
    }
}
