package case_study.models;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

public class Booking  {
    private int bookingCode;
    private String bookingStartDate;
    private String bookingEndDate;
    private Customer customer;
    private Facility facility;
    private Date dateBookingStart;
    private Date dateBookingEnd;
//    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//    public Date dateChecking;


    public Booking(int bookingCode, String bookingStartDate, String bookingEndDate , Customer customer, Facility facility) {
        this.bookingCode = bookingCode;
        this.bookingStartDate = bookingStartDate;
        this.bookingEndDate = bookingEndDate;
        this.customer = customer;
        this.facility = facility;
    }


//    public Booking(int bookingCode, Date dateBookingStart, Date dateBookingEnd, Customer customer, Facility facility) {
//        this.bookingCode = bookingCode;
//        this.customer = customer;
//        this.facility = facility;
//        this.dateBookingStart = dateBookingStart;
//        this.dateBookingEnd = dateBookingEnd;
//    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(String bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public String getBookingEndDate() {
        return bookingEndDate;
    }

    public void setBookingEndDate(String bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Date getDateBookingStart() {
        return dateBookingStart;
    }

    public void setDateBookingStart(Date dateBookingStart) {
        this.dateBookingStart = dateBookingStart;
    }

    public Date getDateBookingEnd() {
        return dateBookingEnd;
    }

    public void setDateBookingEnd(Date dateBookingEnd) {
        this.dateBookingEnd = dateBookingEnd;
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Booking) {
//            Booking booking = (Booking) obj;
//            if (this.getBookingCode() == (booking.getBookingCode())) {
//                return true;
//            }
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
//                ", bookingStartDate='" + dateBookingStart + '\'' +
//                ", bookingEndDate='" + dateBookingEnd + '\'' +
                ", bookingStartDate='" + bookingStartDate + '\'' +
                ", bookingEndDate='" + bookingEndDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }


}
