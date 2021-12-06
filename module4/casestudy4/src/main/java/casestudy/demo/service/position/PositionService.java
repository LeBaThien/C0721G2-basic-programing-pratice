package casestudy.demo.service.position;

import casestudy.demo.model.employee.Position;
import casestudy.demo.repository.employee_repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public Iterable<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Optional<Position> findById(int id) {
        return positionRepository.findById(id);
    }

    @Override
    public void save(Position position) {
        positionRepository.save(position);
    }

    @Override
    public void remove(int id) {
        positionRepository.deleteById(id);
    }
}
