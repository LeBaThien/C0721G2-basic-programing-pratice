package case_study.libs;

import case_study.models.*;
import case_study.services.CustomerServiceImpl;
import case_study.services.FacilityServiceImpl;
import case_study.utils.BookingCompare;

import java.io.*;
import java.util.*;

public class BookingToCsv {
    public static File file = new File("D:\\codegym_final\\case_study2\\src\\case_study\\data\\booking.csv");

    public static Set<Booking> readData() {
        Set<Booking> bookingTreeSet = new TreeSet<>(new BookingCompare());
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null) {

                String[] bookingSet = line.split(",");
                int bookingCode = Integer.parseInt(bookingSet[0]);
                String bookingStartDate = bookingSet[1];
                String bookingEndDate = bookingSet[2];

                Customer customer = new Customer(bookingSet[3], bookingSet[4], bookingSet[5], Integer.parseInt(bookingSet[6]),
                        Integer.parseInt(bookingSet[7]), bookingSet[8], Integer.parseInt(bookingSet[9]), bookingSet[10], bookingSet[11]
                );
                Facility facility ;
                if (bookingSet[12].contains("SVRO")) {
                    facility = new Room(bookingSet[12], Double.parseDouble(bookingSet[13]), Double.parseDouble(bookingSet[14]),
                            Integer.parseInt(bookingSet[15]), bookingSet[16], bookingSet[17]);

                } else if (bookingSet[12].contains("SVHO")) {
                   facility = new House(bookingSet[12], Double.parseDouble(bookingSet[13]), Double.parseDouble(bookingSet[14]),
                            Integer.parseInt(bookingSet[15]), bookingSet[16], bookingSet[17],Integer.parseInt(bookingSet[18]));
                } else {
                   facility= new Villa(bookingSet[12], Double.parseDouble(bookingSet[13]), Double.parseDouble(bookingSet[14]),
                            Integer.parseInt(bookingSet[15]), bookingSet[16], bookingSet[17],Double.parseDouble(bookingSet[18]),
                           Integer.parseInt(bookingSet[19]));
                }

                bookingTreeSet.add(new Booking(bookingCode, bookingStartDate, bookingEndDate, customer, facility ));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("can't read file");
        }
        return bookingTreeSet;
    }


    public static void writeSetBookingToCSV(Set<Booking> bookings) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking booking : bookings) {
                bufferedWriter.write(booking.getInformationBooking());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
