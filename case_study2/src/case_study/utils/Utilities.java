package case_study.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static Date convertDate (String bookingDate) {
        Date date = null;
//        String checkTimeFormat = "";
        try {
            date = simpleDateFormat.parse(bookingDate);
//          checkTimeFormat = simpleDateFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("error format");
        }
        return date;
    }
}
