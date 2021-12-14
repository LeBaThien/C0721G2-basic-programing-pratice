package com.example.demo.service.promotion;

import com.example.demo.model.Promotion;

import com.example.demo.reposiotory.IPromotionRepository;
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
    public void save(Promotion promotion) {
        promotionRepository.save(promotion);
    }

   @Override
    public void remove(int id) {
        promotionRepository.deleteById(id);
    }


    @Override
    public List<Promotion> findPromotionByDiscount(String discount) {
        return promotionRepository.findPromotionByDiscount(discount);
    }

    @Override
    public List<Promotion> findPromotionByDateEnd(String dateEnd) {
        return promotionRepository.findPromotionByDateEnd(dateEnd);
    }

    @Override
    public List<Promotion> findPromotionByDateStart(String dateStart) {
        return promotionRepository.findPromotionByDateStart(dateStart);
    }
//
//    @Override
//    public boolean existsDistinctByShowtimeCode(String showtimeCode) {
//        return promotionRepository.existsDistinctByShowtimeCode(showtimeCode);
//    }
}
