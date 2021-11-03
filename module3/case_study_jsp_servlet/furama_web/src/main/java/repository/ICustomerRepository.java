package repository;

import bean.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> showList();
    void insert(Customer customer);
    void delete(int id);
    void update(Customer customer);
    Customer findById (int id);
}
