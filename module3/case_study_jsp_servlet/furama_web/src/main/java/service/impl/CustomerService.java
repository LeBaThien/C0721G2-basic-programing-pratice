package service.impl;

import bean.customer.Customer;
import bean.customer.CustomerType;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> showList() {
        return iCustomerRepository.showList();
    }

    @Override
    public void insert(Customer customer) {
        iCustomerRepository.insert(customer);
    }

    @Override
    public void delete(int id) {
        iCustomerRepository.delete(id);
    }

    @Override
    public boolean update(Customer customer) throws ParseException, SQLException {
       return iCustomerRepository.update(customer);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public List<CustomerType> showCustomerType() {
        return iCustomerRepository.showCustomerType();
    }
}
