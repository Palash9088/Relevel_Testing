package Static;//import java.util.*;

public class Program extends Test2 {

    public static void main(String[] args) {
        Test1 obj1 = new Test2(); // test 1


       /* Test2 obj = new Test2(); // test 2*/

        /*obj1.m1(30,20); // m1 static method called & did not override (bind in compile time)

        obj1.m2(); // m2 method of test2 called as the method was not static it was overridden (bind in run time)*/


    }
}
