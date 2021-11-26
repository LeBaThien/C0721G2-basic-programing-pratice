package application.demo.service;

import application.demo.IGeneralService;
import application.demo.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IGeneralService<Customer> {
}
