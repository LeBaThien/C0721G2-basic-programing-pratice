package casestudy.demo.service.education_degree;


import casestudy.demo.model.employee.EducationDegree;
import casestudy.demo.repository.employee_repository.IEducationRepository;
import casestudy.demo.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EducationDegreeService implements IEducationDegree {
    @Autowired
    private IEducationRepository educationRepository;

    @Override
    public Iterable<EducationDegree> findAll() {
        return educationRepository.findAll();
    }

    @Override
    public Optional<EducationDegree> findById(int id) {
        return educationRepository.findById(id);
    }

    @Override
    public void save(EducationDegree educationDegree) {
        educationRepository.save(educationDegree);
    }

    @Override
    public void remove(int id) {
        educationRepository.deleteById(id);
    }
}
