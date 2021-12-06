package casestudy.demo.repository.customer_repository;


import casestudy.demo.model.customer.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerTypeRepository extends PagingAndSortingRepository<CustomerType, Integer> {

}
