package case_study.services;

public interface CustomerService extends Services {
    void addNewCustomer ();
    void showList();
    void editList(int id);
}
