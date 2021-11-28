import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

    private static final String dateFormat1 = "dd-MM-yyyy HH:mm:ss";
    private static final String dateFormat2 = "dd-MM-yyyy 'at' hh:mm:ssaa";

    public static void main(String[] args) throws ParseException {
        new MyDate().runApp();
    }

    public void runApp() throws ParseException {
        Date d = new SimpleDateFormat(dateFormat1).parse("21-05-2030 10:11:22");
        String dStr = new SimpleDateFormat(dateFormat2).format(d);
        System.out.println(dStr);
    }
}

