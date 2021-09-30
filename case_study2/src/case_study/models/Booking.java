package case_study.models;

import java.util.Date;

public class Booking {
    private int bookingCode;
//    private String bookingStartDate;
//    private String bookingEndDate;
    private Customer customer;
    private Facility facility;
    private Date dateBookingStart;
    private Date dateBookingEnd;



//    public Booking(int bookingCode, String bookingStartDate, String bookingEndDate, Customer customer, Facility facility) {
//        this.bookingCode = bookingCode;
//        this.bookingStartDate = bookingStartDate;
//        this.bookingEndDate = bookingEndDate;
//        this.customer = customer;
//        this.facility = facility;
//    }

    public Booking(int bookingCode, Customer customer, Facility facility, Date dateBookingStart, Date dateBookingEnd) {
        this.bookingCode = bookingCode;
        this.customer = customer;
        this.facility = facility;
        this.dateBookingStart = dateBookingStart;
        this.dateBookingEnd = dateBookingEnd;
    }

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


    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", bookingStartDate='" + bookingStartDate + '\'' +
                ", bookingEndDate='" + bookingEndDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
