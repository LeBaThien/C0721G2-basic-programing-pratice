package case_study.services;

import case_study.models.Booking;

import java.util.Comparator;
public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if(o1.getDateBookingStart().compareTo(o2.getDateBookingEnd()) == 0){
            return o1.getDateBookingStart().compareTo(o2.getDateBookingEnd())  ;
        }
        return o1.getDateBookingEnd().compareTo(o2.getDateBookingStart());
//        if(o1.getBookingStartDate())
    }

}
