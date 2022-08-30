package Throws;//import java.util.*;

public class C {
    void m3() throws RuntimeException
    {
        System.out.println(1);
        int x = 5/0;
        System.out.println(x);
    }
}
