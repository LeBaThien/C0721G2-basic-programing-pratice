package com.example.demo.service.customer_type;


import com.example.demo.model.CustomerType;
import com.example.demo.repository.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerTypeService implements ICustomerTypeService {

    @Autowired
    ICustomerTypeRepository customerTypeRepository;


    @Override
    public Iterable<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public Optional<CustomerType> findById(long id) {
        return customerTypeRepository.findById(id);
    }

    @Override
    public CustomerType save(CustomerType customerType) {
        return customerTypeRepository.save(customerType);
    }

    @Override
    public void remove(long id) {
        customerTypeRepository.deleteById(id);
    }
}
