package com.example.demo.service.customer_type;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerType;
import com.example.demo.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerTypeService extends IGeneralService<CustomerType> {

}
