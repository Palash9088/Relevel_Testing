public class M {
    int i = 101010;
    int j = 101010;
    public M()
    {
        i = i++ + i-- - i;
        System.out.println(i);
        System.out.println(j++);
        System.out.println(j--);
    }

    static int staticMethod(int i)
    {
        return --i;
    }

}
