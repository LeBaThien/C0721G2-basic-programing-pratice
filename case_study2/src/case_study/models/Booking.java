package case_study.models;

import case_study.services.CustomerServiceImpl;
import case_study.services.FacilityServiceImpl;
import case_study.utils.BookingCompare;

import java.text.SimpleDateFormat;
import java.util.*;

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

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode);
//        public int hashCode() {
//            return Objects.hash(name, age);
//        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Booking) {
            Booking booking = (Booking) obj;
            return this.getBookingCode() == (booking.getBookingCode());
        }
        return false;
    }
    //=> Vừa so sánh ngày trùng và cả mã booking trùng thì mới loại booking đó ra khỏi danh sách, chỉ 1 trong 2 trùng thì ko loai
//    public static void main(String[] args) {
//        TreeSet<Booking> treeSet = new TreeSet<>(new BookingCompare());
//        treeSet.add(new Booking(4, "04/04/2021", "05/05/2021", new Customer(), new Villa() ));
//        treeSet.add(new Booking(4, "06/04/2021", "07/05/2021", new Customer(), new Villa() ));
//        System.out.println(treeSet);
//    }

    @Override
    public String toString() {
        return "Booking " +
                "bookingCode=" + bookingCode +
//                ", bookingStartDate='" + dateBookingStart + '\'' +
//                ", bookingEndDate='" + dateBookingEnd + '\'' +
                ", bookingStartDate='" + bookingStartDate + '\'' +
                ", bookingEndDate='" + bookingEndDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility
                ;
    }

    public String getInformationBooking(){
        return getBookingCode() + "," + getBookingStartDate() + ","
                + getBookingEndDate() + "," + getCustomer().getInformationCustomer() + ","
                + getFacility().getInformation();
    }


}
