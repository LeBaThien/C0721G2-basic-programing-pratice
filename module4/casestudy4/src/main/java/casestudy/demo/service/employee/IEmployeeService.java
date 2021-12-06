package casestudy.demo.service.employee;

import casestudy.demo.model.customer.Customer;
import casestudy.demo.model.employee.Employee;
import casestudy.demo.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService extends IGeneralService<Employee> {
//    Page<Employee> findEmployee( Pageable pageable);
    Page<Employee> findAllEmployee(Pageable pageable);
}
