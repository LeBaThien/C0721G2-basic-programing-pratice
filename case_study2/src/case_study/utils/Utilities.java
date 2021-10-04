package case_study.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy");
    public static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM");
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

    public static String convertYear (String bookingDate) {
        Date date = null;
//        String checkTimeFormat = "";
        String year = "" ;
        try {
            date = simpleDateFormat.parse(bookingDate);
            year = simpleDateFormat1.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("error format");
        }
        return year;
    }

//    public static String convertMonth (String bookingDate) {
//        Date date = null;
////        String checkTimeFormat = "";
//        String month = "" ;
//        try {
//            date = simpleDateFormat.parse(bookingDate);
//            month = simpleDateFormat2.format(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.out.println("error format");
//        }
//        return month;
//    }

}
