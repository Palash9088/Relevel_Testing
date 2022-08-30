package CustomAssignment2;//import java.util.*;

import java.util.Scanner;

public class Test {
    String username;
    void setUsername(String username) throws InvalidUsernameException
    {
        if (username.equals("admin"))throw new InvalidUsernameException("reserved only for a special user (administrator)");
        {
            this.username = username;
            System.out.println("Your user name is : " + username);
        }
    }

    public static void main(String[] args) {

        Test test = new Test();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Username");
            String username = scanner.nextLine();
            test.setUsername(username);
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        }
    }
}
