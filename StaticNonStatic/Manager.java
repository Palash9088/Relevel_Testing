public class Manager {
    static void m1 ()
    {
        System.out.println("M1");
    }
    void m2()
    {
        System.out.println("M2");
    }
    static void m3()
    {
       // m2(); static to non static not possible
        Manager manager = new Manager();
        manager.m2(); // static to non static possible after making object
        m1();
        System.out.println("M3");
    }
    void m4()
    {
        System.out.println("M4");
        m2(); // non static to non static possible
    }

    public static void main(String[] args) {
        m1(); // direct calling possible
        m3(); // static to static

        Manager manager = new Manager();
        manager.m2(); // m2 & m4 is non-static so calling thorough obj manager
        manager.m4();

    }
}
