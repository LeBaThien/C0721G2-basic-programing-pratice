package com.example.demo.repository;

import com.example.demo.model.Promotion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPromotionRepository extends PagingAndSortingRepository<Promotion, Integer> {
    List<Promotion> findShowtimeByFilm_FilmName(String filmName);
    Boolean existsDistinctByShowtimeCode(String showtimeCode);
}
