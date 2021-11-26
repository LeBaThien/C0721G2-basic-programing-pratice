package application.demo.repository;

import application.demo.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
