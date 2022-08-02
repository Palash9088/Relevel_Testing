package Test;//import java.util.*;

public class ClassTwo extends ClassOne {
    static
    {
        System.out.println(i + "" +j);
        i++;
    }

    static
    {
        --j;
    }

    public static void main(String[] args) {
        {
            System.out.println(i);

            System.out.println(j);
        }
    }
}
