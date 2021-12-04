package casestudy.demo.service.customer_type;

import casestudy.demo.model.customer.CustomerType;
import casestudy.demo.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerTypeService extends IGeneralService<CustomerType> {
    Page<CustomerType> findAllCustomerType(Pageable pageable);
}
