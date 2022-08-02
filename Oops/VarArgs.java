public class VarArgs {
    public static void add(String str, int...num)
    {
        int product = 1;

        for (int i=0;i< num.length;i++)
        {
            product = product * num[i];
        }
        String Str = "";
        System.out.println(Str + product);
    }

    public static void main(String[] args) {
        add("Palash",2,3,4,5);
    }
}
