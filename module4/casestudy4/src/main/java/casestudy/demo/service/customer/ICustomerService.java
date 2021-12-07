package casestudy.demo.service.customer;

import casestudy.demo.model.customer.Customer;
import casestudy.demo.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findCustomerByCustomerPhone(String phone, Pageable pageable);
    Page<Customer> findAllCustomer(Pageable pageable);
    int countByCustomerId();
    Page<Customer> findCustomerByCustomerTypeId(int id, Pageable pageable);

}
