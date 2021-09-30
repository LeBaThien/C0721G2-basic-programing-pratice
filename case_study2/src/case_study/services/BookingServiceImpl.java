package case_study.services;

import case_study.models.Booking;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.utils.Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    private static final TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static Utilities utilities = new Utilities();



    // String sDate = "17/07/2017";
    // Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);

    //dùng treeset thì các phần tử ko trùng nhau, dc sắp xếp theo 1 thứ tự, comparable or comparator

    static {
        //viết hàm get id,
        bookingTreeSet.add(new Booking(1, utilities.convertDate("01/02/2021"), utilities.convertDate("02/03/2021"),
                CustomerServiceImpl.customerList.get(0), FacilityServiceImpl.getFacility("Villa rental")));
        bookingTreeSet.add(new Booking(2, utilities.convertDate("05/04/2021"), utilities.convertDate("07/04/2021"),
                CustomerServiceImpl.customerList.get(1), FacilityServiceImpl.getFacility("House rental")));
        bookingTreeSet.add(new Booking(4, utilities.convertDate("06/03/2021"), utilities.convertDate("08/03/2021"),
                CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("Room rental")));
        bookingTreeSet.add(new Booking(5, utilities.convertDate("06/03/2021"), utilities.convertDate("07/04/2021"),
                CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("House rental")));
        bookingTreeSet.add(new Booking(6, utilities.convertDate("01/01/2021"), utilities.convertDate("02/04/2021"),
                CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("Room rental")));

    }

    @Override
    public void showBookingService() {
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking);
        }
    }
    // viet 1 hafm.. name => convert =, ddawtj hafm nafy trong class util, khai báo hàm kiểu static, public


    @Override
    public void addBookingService() {
        System.out.print("Enter booking code: ");
        int bookingCode = scanner.nextInt();
        System.out.print("Enter the booking start date: ");
        String bookingStartDate = scanner.next();
        System.out.print("Enter the booking end date: ");
        String bookingEndDate = scanner.next();
        System.out.println("THE CUSTOMER LIST HERE ");
        customerService.showList();
        System.out.print("Enter the customer id: ");
        int idCustomer = scanner.nextInt();
        System.out.print("Enter the name of service: ");
        String nameService = scanner.nextLine();
        //next # nextline ...
        //next thì chỉ đọc ký tự dính liền # nextLine đọc hết dòng
        bookingTreeSet.add(new Booking(bookingCode,utilities.convertDate(bookingStartDate),utilities.convertDate(bookingEndDate),
                CustomerServiceImpl.customerList.get(0),FacilityServiceImpl.getFacility(nameService)));
    }


}
