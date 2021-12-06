package casestudy.demo.repository.employee_repository;

import casestudy.demo.model.employee.Division;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDivisionRepository extends PagingAndSortingRepository<Division, Integer> {
}
