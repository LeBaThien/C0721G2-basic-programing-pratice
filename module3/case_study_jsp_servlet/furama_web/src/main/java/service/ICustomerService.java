package service;

import bean.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> showList();
    void insert(Customer customer);
    void delete(int id);
    void update(Customer customer);
    Customer findById (int id);
}
