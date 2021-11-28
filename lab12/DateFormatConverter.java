import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatConverter {

    private static final String dateFormat1 = "dd-MM-yyyy HH:mm:ss";
    private static final String dateFormat2 = "dd-MM-yyyy'@'HH:mm:ss";
    private static final String dateFormat3 = "yyyy/MM/dd hh:mm:ss a";
    private static final String dateFormat4 = "dd MMM, yyyy (EEE) hh:mm:ss a";
    private static final String dateFormat5 = "EEEEE, dd MMMMM yyyy hh:mm:ss a";



    public static void main(String[] args) throws ParseException {
        new DateFormatConverter().runApp();
    }

    public void runApp() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date and time [dd-MM-yyyy HH:mm:ss]: ");
        Date d = new SimpleDateFormat(dateFormat1).parse(in.nextLine());
        String dStr1 = new SimpleDateFormat(dateFormat2).format(d);
        String dStr2 = new SimpleDateFormat(dateFormat3).format(d);
        String dStr3 = new SimpleDateFormat(dateFormat4).format(d);
        String dStr4 = new SimpleDateFormat(dateFormat5).format(d);
        System.out.println(dStr1+"\n"+dStr2+"\n"+dStr3+"\n"+dStr4);
    }
}

