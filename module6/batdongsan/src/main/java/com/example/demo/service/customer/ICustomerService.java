package com.example.demo.service.customer;


import com.example.demo.model.Customer;
import com.example.demo.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Optional<Customer> findCustomerByCustomerPhone(String phone);
    Page<Customer> findCustomerPage(Pageable pageable);
    void updateById(long id);

}
