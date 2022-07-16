public class ProgramSingle {
    public static void main(String[] args) {
        // when access with parent class
        System.out.println("Case 1");
        ParentSingle obj = new ParentSingle();

        System.out.println("Value of X" + obj.x);
        System.out.println("Value of Y" + obj.y);
        // System.out.println("Value of Z" + obj.z); CE as variable z not present in Z class

        obj.m1();
        obj.m2();
        // obj.m3(); compilation error as method is in child class

        System.out.println();
        System.out.println("Case 2");

        // when access with child class
        ChildSingle obj1 = new ChildSingle();

        System.out.println("Value of X" + obj1.x); // all variable accessible as they belong to child class
        System.out.println("Value of Y" + obj1.y); // child class is extended with parent class
        System.out.println("Value of Z" + obj1.z);

        obj1.m1();
        obj1.m2();
        obj1.m3();

        System.out.println();

        // when access with parent class & child obj
        System.out.println("Case 3");
        ParentSingle obj3 = new ChildSingle();
        System.out.println("Value of X" + obj3.x);
        System.out.println("Value of Y" + obj3.y);
        // System.out.println("Value of Z" + obj3.z); // Compiler cant see the object

        obj3.m1();
        obj3.m2();
        // obj3.m3(); // Compiler cant see the object

        System.out.println();
        System.out.println("Case 4");
        System.out.println("       // ChildSingle obj4 = ChildSingle(); // Child cannot call parent class\n");
       // ChildSingle obj4 = ChildSingle(); // Child cannot call parent class

        System.out.println();
        System.out.println("Case 5");

        ParentSingle a1  = new ParentSingle();
        ChildSingle b1  = new ChildSingle();
        a1 = b1;

    }
}

