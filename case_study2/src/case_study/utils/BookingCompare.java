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
        //hashCode() để xử lý phần không trùng lặp trong bookingTreeSet.
//        if(o1.getBookingCode() == o2.getBookingCode()) {
//            return 0;
//        }
        //So sanh theo kieu after before voi Date,
        if(Utilities.convertDate(o1. getBookingStartDate()).after(Utilities.convertDate(o2.getBookingStartDate()))){
            return 1;
            //(Utilities.convertDate(o1.getBookingEndDate()).compareTo(Utilities.convertDate(o2.getBookingEndDate())))
        } else if(Utilities.convertDate(o1. getBookingStartDate()).before(Utilities.convertDate(o2.getBookingStartDate()))){
            return -1;
        }
        return 0;
//        (Utilities.convertDate(o1.getBookingStartDate()).compareTo(Utilities.convertDate(o2.getBookingStartDate())))
    }
}
