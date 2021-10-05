package case_study.services;

import case_study.models.Booking;
import case_study.utils.Utilities;

import java.util.*;

public class PromotionServiceImpl implements Services {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> bookingSet = BookingServiceImpl.bookingTreeSet;
    private static Calendar calendar;
    private static List<Booking> bookingStack = new Stack<>();



    @Override
    public void display() {
        System.out.println("Enter year that you are using service at Fur Resort: ");
        int yearUsing = scanner.nextInt();
        String yearUsing1 = String.valueOf(yearUsing);
        for(Booking booking : bookingSet){
            if( Utilities.convertYear(booking.getBookingEndDate()).equals(yearUsing1)){
                System.out.println(booking);
            }
        }

    }

    public static List<Booking> getBookingListStack() {
        // Tạo đối tượng Calendar mô tả thời điểm hiện tại
        // với Locale (khu vực) và TimeZone (múi giờ)
        // của máy tính đang chạy.
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        //Chuyển từ Date => String
        String dateToString = Utilities.convertDateToString(date);
//        //Lấy ra thèn Year dạng Date
//        Utilities.convertYear(dateToString);
//        //lấy ra thèn Month dạng Date
//        Utilities.convertMonth(dateToString);
        for(Booking booking : bookingStack){
            if(booking.getBookingStartDate().equals(Utilities.convertMonth(dateToString))
               && booking.getBookingStartDate().equals(Utilities.convertYear(dateToString))
            ){
                bookingStack.add(booking);
            }
        }
        return bookingStack;
    }

    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        Date date = cal.getTime();
//        String dateToString = Utilities.convertDateToString(date);
//
//        Utilities.convertYear(dateToString);
//        System.out.println(Utilities.convertDateToString(date));
////        System.out.println(Utilities.convertYear(date1));
//        System.out.println(Utilities.convertYear(dateToString));
//        System.out.println(Utilities.convertMonth(dateToString));
        PromotionServiceImpl promotionService = new PromotionServiceImpl();
        
        System.out.println(getBookingListStack());
    }


    public void displayCustomerGetVoucher(){

    }

    @Override
    public void add() {
    //Dang lam
    }

    @Override
    public void delete() {
    //Cap nhat sau
    }


}
