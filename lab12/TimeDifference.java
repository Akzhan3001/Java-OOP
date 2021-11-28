import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimeDifference {

    private static final String dateFormat = "dd-MM-yyyy HH:mm:ss";

    public static void main(String[] args) throws ParseException {
        new TimeDifference().runApp();
    }

    public void runApp() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date and time 1 [dd-MM-yyyy HH:mm:ss]: ");
        Date date1 = new SimpleDateFormat(dateFormat).parse(in.nextLine());
        System.out.print("Enter date and time 2 [dd-MM-yyyy HH:mm:ss]: ");
        Date date2 = new SimpleDateFormat(dateFormat).parse(in.nextLine());
        long timeDiff; //time difference in milliseconds
        if (date1.after(date2)) {
            timeDiff = date1.getTime() - date2.getTime();
        } else {
            timeDiff = date2.getTime() - date1.getTime();
        }

        //TimeUnit.MILLISECONDS.toDays(timeDiff) converts the milliseconds to no. of days
        long nYears = TimeUnit.MILLISECONDS.toDays(timeDiff) / 365;
        long nDays = TimeUnit.MILLISECONDS.toDays(timeDiff) % 365;
        long nHours=TimeUnit.MILLISECONDS.toHours(timeDiff) %24;
        long nMinutes=TimeUnit.MILLISECONDS.toMinutes(timeDiff) %60;
        long nSeconds=TimeUnit.MILLISECONDS.toSeconds(timeDiff)%60;
        String d1Str2 = new SimpleDateFormat(dateFormat).format(date1);
        String d2Str2 = new SimpleDateFormat(dateFormat).format(date2);
        System.out.println("date1: " + d1Str2);
        System.out.println("date2: " + d2Str2);
        System.out.println("Time elapsed: " + nYears + " years " + nDays + " days "+nHours+" hours "+nMinutes+" minutes and " +
                nSeconds+" seconds");
    }
}

