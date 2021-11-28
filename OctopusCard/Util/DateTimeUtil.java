package OctopusCard.OctopusCard.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    private static final String DateFormat = "dd-MM-yyyy@HH:mm:ss";
    private static final SimpleDateFormat formatter = new SimpleDateFormat(DateFormat);

    public static String dateTime2Str(Date date) {
        return formatter.format(date);
    }

    public static Date str2DateTime(String dateTimeStr) throws ParseException {
        return formatter.parse(dateTimeStr);
    }
}
