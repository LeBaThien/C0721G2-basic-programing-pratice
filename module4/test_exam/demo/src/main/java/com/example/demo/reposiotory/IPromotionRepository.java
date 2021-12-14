package com.example.demo.reposiotory;

import com.example.demo.model.Promotion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPromotionRepository extends PagingAndSortingRepository<Promotion, Integer> {
    List<Promotion> findPromotionByDiscount(String discount);
    List<Promotion> findPromotionByDateEnd(String dateEnd);
    List<Promotion> findPromotionByDateStart(String dateStart);

}
