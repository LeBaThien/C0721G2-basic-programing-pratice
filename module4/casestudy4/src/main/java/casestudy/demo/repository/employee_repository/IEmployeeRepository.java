package casestudy.demo.repository.employee_repository;

import casestudy.demo.model.employee.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee, Integer > {

}
