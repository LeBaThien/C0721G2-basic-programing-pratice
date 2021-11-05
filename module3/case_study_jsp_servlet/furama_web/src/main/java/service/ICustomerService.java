package service;

import bean.customer.Customer;
import bean.customer.CustomerType;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface ICustomerService {
    List<Customer> showList();
    void insert(Customer customer);
    void delete(int id);
    boolean update(Customer customer) throws ParseException, SQLException;
    Customer findById (int id);
    List<CustomerType> showCustomerType();
    List<Customer> findCustomer(String customerPhone);

}
