package case_study.services;

import case_study.models.Booking;
import case_study.utils.BookingCompare;
import case_study.utils.Utilities;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    protected static Set<Booking> bookingTreeSet = new TreeSet<>(new BookingCompare());
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static Utilities utilities = new Utilities();



    // String sDate = "17/07/2017";
    // Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);

    //dùng treeset thì các phần tử ko trùng nhau, dc sắp xếp theo 1 thứ tự, comparable or comparator

    static {

        //viết hàm get id,
        bookingTreeSet.add(new Booking(1, "01/02/2020", "02/03/2021",
                CustomerServiceImpl.customerList.get(0), FacilityServiceImpl.getFacility("VL")));
        bookingTreeSet.add(new Booking(2, "05/04/2021", "07/04/2021",
                CustomerServiceImpl.customerList.get(1), FacilityServiceImpl.getFacility("HO")));
        bookingTreeSet.add(new Booking(4, "06/03/2021", "08/03/2021",
                CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("RO")));
//        bookingTreeSet.add(new Booking(5, utilities.convertDate("06/03/2021"), utilities.convertDate("07/04/2021"),
//                CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("HO")));
//        bookingTreeSet.add(new Booking(6, utilities.convertDate("01/01/2021"), utilities.convertDate("02/04/2021"),
//                CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("RO")));

    }

//    // viet 1 hafm.. name => convert =, ddawtj hafm nafy trong class util, khai báo hàm kiểu static, public

    public static Queue<Booking> changeSetToQueue(){
        Queue<Booking> bookingQueue = new ArrayDeque<>();
        for(Booking booking: bookingTreeSet) {
            bookingQueue.offer(booking);
            //offer để chèn phần tử vào bookingQueue
        }
        return bookingQueue;
    }


    @Override
    public void add() {
        System.out.print("Enter booking code: ");
        int bookingCode = scanner.nextInt();
        System.out.print("Enter the booking start date: ");
        String bookingStartDate = scanner.next();
        System.out.print("Enter the booking end date: ");
        String bookingEndDate = scanner.next();
        System.out.println("THE CUSTOMER LIST HERE ");
        customerService.display();
        System.out.print("Enter the customer id: ");
        int idCustomer = scanner.nextInt();
        System.out.println("Enter the name of service: ");
        scanner.nextLine();// Thêm lệnh để khư nextline;
        String nameService = scanner.nextLine();
        //next # nextline ...
        //next thì chỉ đọc ký tự dính liền # nextLine đọc hết dòng
        bookingTreeSet.add(new Booking(bookingCode,bookingStartDate,bookingEndDate,
                CustomerServiceImpl.getIndexCustomer(idCustomer) ,FacilityServiceImpl.getFacility(nameService)));
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking);
        }
    }
}
