import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AssignmentString3 {
    public static void main(String[] args) throws ParseException {

        String date = "12-June-2022, 15:17:20";

        SimpleDateFormat obj = new SimpleDateFormat("dd-MMMM-yyyy, hh:mm:ss");

        System.out.println("Date is " + obj.parse(date));


    }
}
