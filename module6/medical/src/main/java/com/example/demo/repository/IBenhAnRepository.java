package com.example.demo.repository;

import com.example.demo.model.BenhAn;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBenhAnRepository extends PagingAndSortingRepository<BenhAn, Long> {
}
