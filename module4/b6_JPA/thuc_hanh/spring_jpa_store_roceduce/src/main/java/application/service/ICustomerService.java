package application.service;

import application.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
