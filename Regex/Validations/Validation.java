package Validations;//import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public boolean validateUsername(String username)
    {
      //  String regex = "^?=.*[a-z]"+ "X?.=*[A-Z]" + "^X?.=*\\d" +"(?=\\S+$).{8,20}$";

        String regex = "^(?=.*\\d)" + "(?=.*[a-z])(?=.*[A-Z])"  + "(?=\\S+$).{8,20}$";

        Pattern userP = Pattern.compile(regex);

        if(username == null)
        {
            return false;
        }

        Matcher matcher = userP.matcher(username);
        return matcher.matches();
    }


    public boolean validatePassword(String password)
    {
        String regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        Pattern pattern = Pattern.compile(regex);

        if(password == null)
        {
            return false;

        }

        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean validateEmail(String email)
    {
        String regex =  "^[A-Za-z\\d+_.-]+@(.+)$";

             Pattern pattern = Pattern.compile(regex);
             Matcher matcher = pattern.matcher(email);
             return matcher.matches();
    }

    public static void main(String[] args) {

        Validation validation = new Validation();

        String username = "Palash9088";
        String password = "Palash@123";
        String email = "Palashsoni5@gmail.com";
        System.out.println(validation.validateUsername(username));
        System.out.println(validation.validatePassword(password));
        System.out.println(validation.validateEmail(email));

    }
}
