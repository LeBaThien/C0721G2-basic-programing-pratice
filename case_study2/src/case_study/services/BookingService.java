package case_study.services;

public interface BookingService extends Services {
//    void showBookingService();
//    void addBookingService();

    @Override
    void add();

    @Override
    void delete();

    @Override
    void display();
}
