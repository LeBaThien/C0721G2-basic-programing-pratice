package casestudy.demo.service.employee;

import casestudy.demo.model.employee.Employee;
import casestudy.demo.repository.employee_repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(int id) {
        employeeRepository.deleteById(id);
    }
}
