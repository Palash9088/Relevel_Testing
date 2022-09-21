package ExceptionHandlingInJava1;//import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOFile {
    public static void main(String[] args) {
        File file = new File("Assignment/ExceptionHandlingInJava1/TestFile"); // file object to access the file
        try {                                     // Surrounded with try catch to handle IO exception
            Scanner scanner = new Scanner(file); // Scanner object to read the file
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File directory error");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Thank you for using");
        }
    }
}
