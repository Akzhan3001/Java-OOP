import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class YearDifference {

    private static final String dateFormat = "dd-MM-yyyy";

    public static void main(String[] args) throws ParseException {
        new YearDifference().runApp();
    }

    public void runApp() throws ParseException {
        Date date1 = new SimpleDateFormat(dateFormat).parse("14-02-2020");
        Date date2 = new SimpleDateFormat(dateFormat).parse("25-12-2030");

        long timeDiff; //time difference in milliseconds
        if (date1.after(date2)) {
            timeDiff = date1.getTime() - date2.getTime();
        } else {
            timeDiff = date2.getTime() - date1.getTime();
        }

        //TimeUnit.MILLISECONDS.toDays(timeDiff) converts the milliseconds to no. of days
        long nYears = TimeUnit.MILLISECONDS.toDays(timeDiff) / 365;
        long nDays = TimeUnit.MILLISECONDS.toDays(timeDiff) % 365;

        String d1Str2 = new SimpleDateFormat(dateFormat).format(date1);
        String d2Str2 = new SimpleDateFormat(dateFormat).format(date2);
        System.out.println("date1: " + d1Str2);
        System.out.println("date2: " + d2Str2);
        System.out.println("Time elapsed: " + nYears + " years " + nDays + " days");
    }
}