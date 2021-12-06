package casestudy.demo.service.division;

import casestudy.demo.model.employee.Division;
import casestudy.demo.repository.employee_repository.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public Iterable<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public Optional<Division> findById(int id) {
        return divisionRepository.findById(id);
    }

    @Override
    public void save(Division division) {
        divisionRepository.save(division);
    }

    @Override
    public void remove(int id) {
        divisionRepository.deleteById(id);
    }
}
