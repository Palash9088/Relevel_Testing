import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IO {
    public static void main(String[] args) {
        //writer class

        try {
            PrintWriter writer = new PrintWriter("Inputoutput//name.txt");
            writer.write("This is my first Message");

            //to flush the stream
            writer.flush();

            // to close the writer class
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
