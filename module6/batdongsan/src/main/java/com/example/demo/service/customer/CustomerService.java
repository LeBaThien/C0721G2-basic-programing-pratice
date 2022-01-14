package com.example.demo.service.customer;

import com.example.demo.model.Customer;
import com.example.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void remove(long id) {
        customerRepository.deleteById(id);
    }


    @Override
    public Optional<Customer> findCustomerByCustomerPhone(String phone) {
        return customerRepository.findCustomerByCustomerPhone(phone);
    }

    @Override
    public Page<Customer> findCustomerPage(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void updateById(long id) {
        customerRepository.updateCustomerById(id);
    }
}
