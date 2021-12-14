package com.example.demo.service.promotion;

import com.example.demo.model.Promotion;
import com.example.demo.service.IGeneralService;

import java.util.List;

public interface IPromotionService extends IGeneralService<Promotion> {
    List<Promotion> findPromotionByDiscount(String discount);
    List<Promotion> findPromotionByDateEnd(String dateEnd);
    List<Promotion> findPromotionByDateStart(String dateStart);
//    boolean existsDistinctByShowtimeCode(String showtimeCode);

}
