package case_study.services;

public interface CustomerService extends Services {
    void add();
    void display();
    void edit(int id);
    void edit();
    void delete();
}
