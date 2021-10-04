package case_study.utils;

import case_study.models.Booking;

import java.text.SimpleDateFormat;
import java.util.Comparator;
public class BookingCompare implements Comparator<Booking> {

//    @Override
//    public int compare(Booking o1, Booking o2) {
//        if(o1.getDateBookingStart().compareTo(o2.getDateBookingEnd()) == 0){
//            return o1.getDateBookingStart().compareTo(o2.getDateBookingEnd())  ;
//        }
//        return o1.getDateBookingEnd().compareTo(o2.getDateBookingStart());
////        if(o1.getBookingStartDate())
//    }

    @Override
    public int compare(Booking o1,Booking o2) {
        if(Utilities.convertDate(o1. getBookingStartDate()).compareTo(Utilities.convertDate(o2.getBookingStartDate())) == 0){
            return (Utilities.convertDate(o1.getBookingEndDate()).compareTo(Utilities.convertDate(o2.getBookingEndDate())));
        }
        return (Utilities.convertDate(o1.getBookingStartDate()).compareTo(Utilities.convertDate(o2.getBookingStartDate())));
    }
}
