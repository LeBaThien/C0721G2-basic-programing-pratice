package com.codegym.application_customer.service.customer;

import com.codegym.application_customer.model.Customer;
import com.codegym.application_customer.model.Province;
import com.codegym.application_customer.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
}
