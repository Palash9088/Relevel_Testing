import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) {

        // New file code

        File file = new File("InputOutput\\InputOutput.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create a new file");
            e.printStackTrace();
        }


        // code to write a file

        try {
            FileWriter fileWriter = new FileWriter("InputOutput\\InputOutput.txt");
            int n = 5;

            String newline = System.lineSeparator();
            String s = "Table of 5" + n;
            for(int i = 1;i<=10;i++)
            fileWriter.write(  n + " x " + i + " = " + (n*i) + newline);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Write Failed");
        }

        // Read a file

        File file1 = new File("InputOutput\\InputOutput.txt");
        try {
            Scanner scanner = new Scanner(file1);
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        // to delete a file

//        File file2 = new File("InputOutput//name.txt");
//        if(file2.delete())
//        {
//            System.out.println("File deleted" + file2.getName());
//        }
//        else
//        {
//            System.out.println("File not deleted");
//        }
    }
}
