package Strings;//import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractItemId {
    void findIdFromUrl(String input) {
        String output = "";
        if (input.contains("itemId")) {
            for (int index = input.indexOf("itemId"); index < input.length(); index++) {
                if (input.charAt(index) >= '0' && input.charAt(index) <= '9') {
                    output += input.charAt(index);
                    if (!(input.charAt(index + 1) >= '0' && input.charAt(index) <= '9')) {
                        break;
                    }
                }
            }
            System.out.println("Item id is :" + output);
        } else
            System.out.println("Item id Not Found");
    }
    public static void main(String[] args) {

        String input1 = "https://www.facebook.com/technocredits/itemId=12345/";
        String input2 = "https://www.facebook.com/technocredits/empid=123&itemId=12345/";
        String input3 = "https://www.facebook.com/technocredits/itemId=12345&empid=123/";
        String input4 = "https://www.facebook.com/technocredits/empid=123/";

     /*   ExtractItemId obj = new ExtractItemId();

        obj.findIdFromUrl(input1);*/

        Pattern pattern = Pattern.compile("itemId=12345+");

        Matcher m1 = pattern.matcher(input1);
        System.out.println(m1.find());

    }
}
