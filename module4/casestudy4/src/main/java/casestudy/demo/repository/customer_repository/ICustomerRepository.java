package casestudy.demo.repository.customer_repository;


import casestudy.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Integer>,
//Tim kiem theo dieu kien   
        JpaSpecificationExecutor<Customer>
{
    Page<Customer> findCustomerByCustomerPhone(String phone, Pageable pageable);
//    String countByCustomerId();

    @Query(value="select * from customer join customer_type" +
            " where customer.customer_type_customer_type_id = customer_type.customer_type_id " +
            " and customer_type_id = :id", nativeQuery = true)
    Page<Customer> findCustomerByCustomerTypeId(@Param("id") int id, Pageable pageable);
}
