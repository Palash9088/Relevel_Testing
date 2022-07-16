public class StringSplit2 {
    public static void main(String[] args) {
        // 5. if we have taken "s"  with limit 0 then it will work normally

        String str5 = new String ("Hello world,this is string split program");

        String [] stringArrays5 = str5.split("s", 0);

        for (int i=0; i<stringArrays5.length;i++)
        {
            System.out.println(" 5 " + stringArrays5[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        // 6. if we have taken "s"  with limit 1 then it will keep as it is.

        String str6 = new String ("Hello world this is string split program");

        String [] stringArrays6 = str6.split("s", 1);

        for (int i=0; i<stringArrays6.length;i++)
        {
            System.out.println(" 6 " + stringArrays6[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        // 7. if we have taken "s"  with limit 2 then it will remove first s & split into 2 parts.

        String str7 = new String ("Hello world this is string split program");

        String [] stringArrays7 = str7.split("s", 2);

        for (int i=0; i<stringArrays7.length;i++)
        {
            System.out.println( " 7 " + stringArrays7[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        // 8. if we have taken "s"  with limit 3 then it will remove first 2 s & split into 3 parts.

        String str8 = new String ("Hello world this is string split program");

        String [] stringArrays8 = str8.split("s", 3);

        for (int i=0; i<stringArrays8.length;i++)
        {
            System.out.println(" 8 " + stringArrays8[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
