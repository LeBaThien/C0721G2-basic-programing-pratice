package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utilities {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy");
    public static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM");

    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected static Scanner scanner = new Scanner(System.in);

    public static String checkValidTime(){
        String date = "";

        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                Date time = dateFormat.parse(scanner.nextLine());
                date = dateFormat.format(time);
            } catch (Exception e) {
                flag = true;
                System.err.println("Invalid date ,dd-MM-yyyy");
            }
        } return date;
    }

    public static Date convertDate(String bookingDate) {
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


    public static String convertDateToString(Date date) {
        String dateToString = "";
        dateToString = simpleDateFormat.format(date);
        return dateToString;
    }

    public static String convertYear(String bookingDate) {
        Date date;
        String year = "";
        try {
            date = simpleDateFormat.parse(bookingDate);
            year = simpleDateFormat1.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("error format");
        }
        return year;
    }

    public static String convertMonth(String bookingDate) {
        Date date = null;
        String month = "";
        try {
            date = simpleDateFormat.parse(bookingDate);
            month = simpleDateFormat2.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("error format");
        }
        return month;
    }
}
