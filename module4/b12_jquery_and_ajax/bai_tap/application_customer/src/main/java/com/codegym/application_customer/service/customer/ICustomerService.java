package com.codegym.application_customer.service.customer;

import com.codegym.application_customer.model.Customer;
import com.codegym.application_customer.model.Province;
import com.codegym.application_customer.service.IGeneralService;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

}
