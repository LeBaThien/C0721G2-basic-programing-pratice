package case_study.services;

import case_study.models.Booking;
import case_study.utils.Utilities;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionServiceImpl implements Services {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> bookingSet = BookingServiceImpl.bookingTreeSet;



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

    public void displayCustomerGetVoucher(){

    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }


}
