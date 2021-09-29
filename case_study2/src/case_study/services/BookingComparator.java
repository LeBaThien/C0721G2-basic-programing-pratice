package case_study.services;

import case_study.models.Booking;


import java.util.Comparator;


public class BookingComparator implements Comparator<Booking> {


    @Override
    public int compare(Booking o1, Booking o2) {
        //o1.getBookingStartDate().compareTo(o2.getBookingEndDate()) == 0
//        if(o1.getBookingStartDate().equals(o2.getBookingEndDate())){
//            return o1.getBookingStartDate().compareTo(o2.getBookingEndDate());
//        }
//        return o1.getBookingEndDate().compareTo(o2.getBookingStartDate());
        if(o1.getBookingStartDate())
    }
}
