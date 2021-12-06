package casestudy.demo.repository.employee_repository;

import casestudy.demo.model.employee.EducationDegree;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepository extends PagingAndSortingRepository<EducationDegree, Integer> {
}
