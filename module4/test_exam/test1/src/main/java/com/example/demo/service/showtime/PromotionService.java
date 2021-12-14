package com.example.demo.service.showtime;

import com.example.demo.model.Promotion;
import com.example.demo.repository.IPromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionService implements IPromotionService {
    @Autowired
    private IPromotionRepository promotionRepository;

    @Override
    public Iterable<Promotion> findAll() {
        return promotionRepository.findAll();
    }

    @Override
    public Optional<Promotion> findById(int id) {
        return promotionRepository.findById(id) ;
    }

    @Override
    public void save(Promotion showtime) {
        promotionRepository.save(showtime);
    }

   @Override
    public void remove(int id) {
        promotionRepository.deleteById(id);
    }

//    @Override
//    public List<Promotion> findShowtimeByFilm_FilmName(String filmName) {
//        return promotionRepository.findShowtimeByFilm_FilmName(filmName);
//    }
//
//    @Override
//    public boolean existsDistinctByShowtimeCode(String showtimeCode) {
//        return promotionRepository.existsDistinctByShowtimeCode(showtimeCode);
//    }
}
